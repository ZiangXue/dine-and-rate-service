import json
import re
import time
import requests
from datetime import datetime
import psycopg2

#setup PSQL connection


def getMenu(diningHall):

    results = []
    dates = set()

    dt = datetime.today()
    dt_str = int(time.mktime(dt.timetuple()))

    url =f'https://my.pomona.edu/eatec/{diningHall}.json?_{dt_str}='

    response = requests.get(url)
    res_str = re.sub(r"^/\*\*/\s+menuData\(|\)\;$", "", response.text)
    rs_body = json.loads(res_str)
    menus = rs_body['EatecExchange']['menu']

    print(len(menus))

    for menu in menus:
        date = menu['@servedate']
        meal = menu['@mealperiodname']
        if meal == 'Closed':
            print('closed')
            continue
        #as a single JSON
        recipes = menu['recipes']['recipe']
        if '@id' in recipes:
            recipes = [recipes]
        #as JSONArray
        for recipe in recipes:
            newData = (date, meal, recipe['@id'], recipe['@category'], recipe['@shortName'])
            dates.add(date)
            # print(f"{date} {meal}\t{recipe['@id']}\t{recipe['@category']}\t{recipe['@shortName']}")
            results.append(newData)
    return results, dates