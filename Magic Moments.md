You are going to a village by bus.

You need 
k
k hours to do an important task while your bus journey will take 
n
n hours.

You know that the speed of the fan in the bus changes every hour. The fan is measured on a scale from 0 to 100, where 0 is very slow and 100 is too fast. Bus authority has told you the fan speed schedule for all n hours.

You want to do your task only when the fan is fast, as much as possible. So, you have to choose 
k
k hours from your bus journey when you will do the task such that minimum speed of fan among the selected hours is maximum.

Input
The first input line contains two integers 
n
n and 
k
k (
1
 
≤
 
n
 
≤
 
1000
1 ≤ n ≤ 1000, 
1
 
≤
 
k
 
≤
 
n
1 ≤ k ≤ n) — the number of hours on the bus and the number of hours to do the task. The second line contains 
n
n space-separated integers 
a
i
a 
i
​	
  (
0
 
≤
 
a
i
 
≤
 
100
0 ≤ a 
i
​	
  ≤ 100),
a
i
a 
i
​	
  is the fan speed at the 
i
i-th hour.

Output
Print the minimum fan speed in which you will do the task.

Example
InputCopy	OutputCopy
15 1
0 78 24 24 61 60 0 65 52 57 97 51 56 13 10
97
