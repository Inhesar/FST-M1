try:
    print(undeclared_variable)
except NameError as e:
    print(f"A NameError occurred: {e}")
print("The program continues to execute after handling the error.")
