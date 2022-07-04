def activitySelection(startList , finishList): 
  numberOfTasks = len(finishList) 
  temp_start = 0
  temp_finish = 0

  for outerIndex in range(1,numberOfTasks):
    for index in range(0,numberOfTasks-1):
      if(finishList[index] > finishList[index+1]):
        temp_start = startList[index]
        temp_finish = finishList[index]

        finishList[index] = finishList[index+1]
        startList[index] = startList[index+1]

        finishList[index+1] = temp_finish
        startList[index+1] = temp_start
  

  print("\nMaximum Selected Activities")
  
  indexToPrint = 0
  print(startList[indexToPrint], finishList[indexToPrint]), 

  for ListIndex in range(numberOfTasks): 

    if startList[ListIndex] >= finishList[indexToPrint]: 
      print(startList[ListIndex], finishList[ListIndex]), 
      indexToPrint = ListIndex

#driver code 
startList = [5, 1, 0, 3, 5, 8] 
finishList = [9, 5, 6, 5, 7, 9] 

activitySelection(startList , finishList) 