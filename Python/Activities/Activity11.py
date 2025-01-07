fruit_prices = {
    "apple": 1.5,
    "banana": 0.75,
    "cherry": 2.0,
    "date": 3.0,
    "elderberry": 5.0,
    "fig": 2.5,
    "grape": 3.5
}
def check_fruit_availability(fruit):
    if fruit in fruit_prices:
        print(f"{fruit.capitalize()} is available! Price: ${fruit_prices[fruit]:.2f}")
    else:
        print(f"Sorry, {fruit.capitalize()} is not available.")
def main():
    fruit = input("Enter the name of the fruit you want to check: ").lower()
    check_fruit_availability(fruit)
if __name__ == "__main__":