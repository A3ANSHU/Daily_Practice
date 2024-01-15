def strStr(haystack, needle):
        return haystack.find(needle)

haystack1 = "sadbutsad"
needle1 = "sad"
haystack2 = "leetcode"
needle2 = "leeto"

print("-- test case 1 --")
print(f"Input : haystack - {haystack1} needle - {needle1}\nOutput : {strStr(haystack1,needle1)}")
print("-- test case 1 --")
print(f"Input : haystack - {haystack2} needle - {needle2}\nOutput : {strStr(haystack2,needle2)}")