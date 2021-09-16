B. Time Complexity analysis
1) θ(1) is the average case for this code fragment because it represents constants and constants will always have a runtime of θ(1)
2) This is a nested for loop where the first for loop runs 3 times, because it stops because i is 3, but the nested for loop goes until j reaches n, therefore it will n times, 3 times. So the average runtime is θ(n), because eventually 3n does not defer too much from n.
3) This is a singular for loop and runs until i reaches n*n, or n^2. Therefore the loop will run n^2 times because i is incremented one at a time. The average runtime is θ(n^2)
4) This is a nested for loop where the first for loop runs until i reaches (n – 1) and the nested for loop runs until j reaches n, and even though j depends on i, the average runtime is θ(n^2) because the nested for loop runs n times, (n – 1) times. Essentially n(n – 1), and therefore n^2, because constants are able to be disregarded with how insignificant the value is.
5) This is a nested for loop where the first for loop runs until i reaches n, incrementing by 1, and the nested for loop runs until j reaches n but j is multiplied by 2 as it continues through the loop, essentially n/2. Translating to n * n/2, and therefore the average runtime would be θ(nlogn).
6) This is a nested for loop where the first for loop runs until i reaches n, but i is multiplied by 2 as it iterates through the loops essentially meaning until i reaches n/2. The second for loop runs until j reaches n, with j incrementing by 1 so the average runtime is similar to the previous code fragment with it being θ(nlogn).

C. By calling the next() method two times to bring the current position just before 15, or calling it until it reaches the parameter value in the method call, and then calling the remove() method will delete the value 15.
Array—based: DE	    Linked List: n(P+E)
a. E = 2, P = 4, D = 30
Break Even: n = 10	Linked list needs less space than array
b. E = 1, P = 4, D = 30
Break Even: n = 6	Linked list needs less space than array
c. E = 32, P = 4, D = 40
Break Even: n = 35.5555	Array-based list is more efficient

D. Asymptotic Complexity
1. 2, log(3,n), log(2,n), n^(2/3), 20n, 4n^2, 3^n, n!
2.  O(n)
    O(n^3)
    O(nlog(2,n))
    O(n^6)
