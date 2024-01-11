def lengthOfLastWord(s):
    t = [item for item in s.split(" ")if item]
    print(t)
    return len(t[len(t)-1])
s1 = "Hello World"
s2 = "   fly me   to   the moon  "
s3 = "luffy is still joyboy"

print("-- test case 1 --")
print(f"input : {s1}\nOutput : {lengthOfLastWord(s1)}")
print("-- test case 2 --")
print(f"input : {s2}\nOutput : {lengthOfLastWord(s2)}")
print("-- test case 3 --")
print(f"input : {s3}\nOutput : {lengthOfLastWord(s3)}")