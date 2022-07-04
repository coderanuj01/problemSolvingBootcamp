def linear_Search(listOfNumbers, lengthOfList, key):  
  
    for i in range(0, lengthOfList):  
        if (listOfNumbers[i] == key):  
            return i  
    return -1  
  
  
listOfNumbers = [12,23,34,45,56,67,78,89,91]  
key = input("Enter a key to search : ") 
key = int(key)
  
lengthOfList = len(listOfNumbers)  
res = linear_Search(listOfNumbers, lengthOfList, key)  
if(res == -1):  
    print("Element not found")  
else:  
    print("Element found at index: ", res)  