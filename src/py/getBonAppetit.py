import json
import re
import time
import requests
from datetime import datetime

DH_CODE = {'Mallot':'2253','McConnel':'219','Collins':'50'}

def getMenu(diningHall):
    dt_str =datetime.today().date()

    url = f'https://legacy.cafebonappetit.com/api/2/menus?format=json&cafe={DH_CODE[diningHall]}&date={dt_str}'
    response = requests.get(url)
    rs_body = response.json()
    date = rs_body['days'][0]['date']
    meals = rs_body['days'][0]['cafes'][DH_CODE[diningHall]]["dayparts"][0]
    items = rs_body['items']
    for meal in meals:
        mealLabel = meal['label']
        for station in meal['stations']:
            stationLabel = station['label']
            for item in station['items']:
                # if items[item]['tier'] == 1: # determines to show or not
                print(f"{date} {mealLabel}\t{items[item]['id']}\t{stationLabel} \t{items[item]['label']}")

getMenu('Collins')