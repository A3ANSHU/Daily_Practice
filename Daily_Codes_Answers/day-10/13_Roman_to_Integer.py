def func(s):
    value=0
    
    I=1
    V=5
    X=10
    L=50
    C=100
    D=500
    M=1000

    if "IV" in s:
        value+=4
    if "IX" in s:
        value+=9
    if "XL" in s:
        value+=40
    if "XC" in s:
        value+=90
    if "CD" in s:
        value+=400
    if "CM" in s:
        value+=900
            
    value += (s.count("I")-s.count("IV")-s.count("IX"))*I
    value += (s.count("V")-s.count("IV"))*V
    value += (s.count("X")-s.count("IX")-s.count("XL")-s.count("XC"))*X
    value += (s.count("L")-s.count("XL"))*L
    value += (s.count("C")-s.count("CD")-s.count("CM")-s.count("XC"))*C
    value += (s.count("D")-s.count("CD"))*D
    value += (s.count("M")-s.count("CM"))*M
    
    return value

s1 = "III"
s2 = "LVIII"
s3 = "MCMXCIV"

print(f"test case 1 ---> {s1} = {func(s1)}")
print(f"test case 2 ---> {s2} = {func(s2)}")
print(f"test case 3 ---> {s3} = {func(s3)}")