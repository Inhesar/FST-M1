def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)
def generate_fibonacci_sequence(count):
    fibonacci_sequence = []
    for i in range(count):
        fibonacci_sequence.append(fibonacci(i))
    return fibonacci_sequence

def main():
    try:
        count = int(input("How many Fibonacci numbers would you like to generate? "))
        
        if count <= 0:
            print("Please enter a positive integer.")
        else:
            fibonacci_sequence = generate_fibonacci_sequence(count)
            print(f"The first {count} Fibonacci numbers are: {fibonacci_sequence}")
    
    except ValueError:
        print("Invalid input. Please enter a positive integer.")

if __name__ == "__main__":
  main()
