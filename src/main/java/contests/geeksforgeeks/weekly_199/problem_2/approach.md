
```
example test case

n = 3
d = 4
arr[][] = [[1, 5], [2, 5], [1, 10], [3, 5]]
```

**n** is the number of nodes; the nodes are 1-indexed\
**d** is the number of days\
**arr** is the data representing the observation; `ith` element represents observation for `ith` day


|         | d = 0 | d = 1 | d = 2 | d = 3 | d = 4 |
|:-------:|:-----:|:-----:|:-----:|:-----:|:-----:|
| Node 1  |   0   |   5   |   5   |  15   |  15   |
| Node 2  |   0   |   0   |   5   |   5   |   5   |
| Node 3  |   0   |   0   |   0   |   0   |   5   |
| **ans** |   0   |   2   |   2   |   3   |   2   |  

this ans is how many unique lengths are there for each day.
for example, 

one day 1, there are total 2 unique lengths i.e. 5 and 0.

observations:

1. the number of unique lengths change 