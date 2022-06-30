arr = [12,23,34,45,56,67,78,89,91];     
    
max = arr[0];    
       
for i in range(0, len(arr)):      
   if(arr[i] > max):    
       max = arr[i];    
           
print("Largest element present in given array: " + str(max));   