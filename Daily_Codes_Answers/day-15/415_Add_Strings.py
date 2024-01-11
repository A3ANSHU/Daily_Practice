def addStrings(num1,num2):
    i = len(num1)-1
    j = len(num2)-1

    output = ""

    rem = 0 
    while(i>=0 or j>=0):
        n1 = 0
        n2 = 0
        if(i>=0):
            n1 = int(num1[i])
            i-=1
            
        if(j>=0):
            n2 = int(num2[j])
            j-=1
        num = n1+n2+rem
            
        if(num>9):
            rem = 1
        else:
            rem = 0
            
        output = (str(num%10)+output)
    return output

num1 = "11"
num2 = "123"
print("-- test case 1 --")
print(f"Input : num1 : {num1} num2 : {num2}\nOutput : {addStrings(num1, num2)}")

num3 = "456"
num4 = "77"
print("-- test case 2 --")
print(f"Input : num1 : {num3} num2 : {num4}\nOutput : {addStrings(num3, num4)}")

num5 = "0"
num6 = "0"
print("-- test case 3 --")
print(f"Input : num1 : {num5} num2 : {num6}\nOutput : {addStrings(num5, num6)}")