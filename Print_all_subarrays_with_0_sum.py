'''def printAllSublists(A):
    for i in range(len(A)):
        sum=0
        for j in range(i,len(A)):
            sum+=A[j]
            if sum==0:
                print("Sublist: ",(i,j))
A = [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
printAllSublists(A)'''
class destructdemo:
    def __init__(self) -> None:
        print("you are welcome")
    def __del__(self):
        print("dectructor executed successfully")
ob1=destructdemo()
ob2=ob1
ob3=ob1
print("id of ob1 is:",id(ob1))
print("id of ob2 is:",id(ob2))
print("id of ob3 is:",id(ob3))
del ob2
del ob1
del ob3
a=input("input string")
print(a)