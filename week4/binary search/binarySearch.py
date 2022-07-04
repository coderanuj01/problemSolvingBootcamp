def binary_search(listOfNumbers, low, high, keyToSearch):

	if high >= low:

		mid = (high + low) // 2

		if listOfNumbers[mid] == keyToSearch:
			return mid

		elif listOfNumbers[mid] > keyToSearch:
			return binary_search(listOfNumbers, low, mid - 1, keyToSearch)

		else:
			return binary_search(listOfNumbers, mid + 1, high, keyToSearch)

	else:
		return -1


listOfNumbers = [ 12,23,34,45,56,67,78,89,91]
keyToSearch = input("Enter a key to search : ") 
keyToSearch = int(keyToSearch)

result = binary_search(listOfNumbers, 0, len(listOfNumbers)-1, keyToSearch)

if result != -1:
	print("Element is present at index", str(result))
else:
	print("Element is not present in array")
