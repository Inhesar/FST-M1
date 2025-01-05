def create_new_list(list1, list2):
   
    new_list = [num for num in list1 if num % 2 != 0] + [num for num in list2 if num % 2 == 0]
    return new_list
list1 = [1, 2, 3, 4, 5, 6]
list2 = [10, 15, 20, 25, 30, 35]
new_list = create_new_list(list1, list2)
print("New List:", new_list)
