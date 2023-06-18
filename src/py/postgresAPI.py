import psycopg2
import getPomona

hallID = {"Frary":1, "Frank":2, "Oldenborg":3, "Mallot":4,"Collins":5,"McConnel":6, "The Hoch":7}

def insertMenu(recipe, hall, cursor):
    date, meal, itemId, station, name = recipe

    #TODO: avoid menu table duplicate.
    # We can perhaps clear all record we have on <a date and a dining hall> since we are inserting all of those anyways.

    cursor.execute(f"INSERT INTO item (ItemID, Name, Rating, RatingCount) VALUES ('{itemId}', '{name}', '{0.0}', '{0}') ON CONFLICT DO NOTHING")

    cursor.execute(f"INSERT INTO menu (DininghallID, ItemID, Date, Meal, Station) VALUES ('{hallID[hall]}', '{itemId}', '{date}', '{meal}', '{station}')")

def insertAllMenu(recipes, hall, cursor, dates):
    for date in dates:
        cursor.execute(f"DELETE FROM menu WHERE DiningHallId = {hallID[hall]} AND Date = '{date}';")
    # We can perhaps clear all record we have on <a date and a dining hall> since we are inserting all of those anyways.
    for recipe in recipes:
        insertMenu(recipe, hall, cursor)

conn = psycopg2.connect(
   database="menu", user='ziang', host='127.0.0.1', port= '5432'
)
conn.autocommit = True

cursor = conn.cursor()

hall = "Frary"
recipes, dates = getPomona.getMenu(hall)
insertAllMenu(recipes, hall, cursor, dates)
conn.commit()
conn.close()