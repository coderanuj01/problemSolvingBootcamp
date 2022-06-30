def linear_Search(list1, n, key):  
  
    for i in range(0, n):  
        if (list1[i] == key):  
            return i  
    return -1  
  
  
list1 = [12,23,34,45,56,67,78,89,91]  
key = input("Enter a key to search : ") 
key = int(key)
  
n = len(list1)  
res = linear_Search(list1, n, key)  
if(res == -1):  
    print("Element not found")  
else:  
    print("Element found at index: ", res)  