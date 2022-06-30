def activitySelection(s , f): 
  n = len(f) 
  temp_start = 0
  temp_finish = 0

  for i in range(1,n):
    for j in range(0,n-1):
      if(f[j] > f[j+1]):
        temp_start = s[j]
        temp_finish = f[j]

        f[j] = f[j+1]
        s[j] = s[j+1]

        f[j+1] = temp_finish
        s[j+1] = temp_start
  

  print("\nMaximum Selected Activities")
  
  i = 0
  print(s[i], f[i]), 

  for j in range(n): 

    if s[j] >= f[i]: 
      print(s[j], f[j]), 
      i = j 

#driver code 
start = [5, 1, 0, 3, 5, 8] 
finish = [9, 5, 6, 5, 7, 9] 

activitySelection(start , finish) 