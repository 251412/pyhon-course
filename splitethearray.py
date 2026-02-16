def split_and_append(arr):
    mid = len(arr) // 2
    first_part = arr[:mid]
    second_part = arr[mid:]
    return second_part + first_part


array = list(map(int, input("Enter the elements of the array separated by spaces: ").split()))

print("Original array:", array)
new_array = split_and_append(array)
print("Modified array:", new_array)