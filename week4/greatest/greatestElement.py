listOfNumbers = [12,23,34,45,56,67,78,89,91];     
    
max = listOfNumbers[0];    
       
for index in range(0, len(listOfNumbers)):      
   if(listOfNumbers[index] > max):    
       max = listOfNumbers[index];    
           
print("Largest element present in given array: " + str(max));   