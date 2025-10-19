def Anagram(s1,s2):
    if len(s1) != len(s2):
        print("Not Anagrams")
    else:
        count1 = {}
        count2 = {}

        for ch in s1:
            if ch in count1:
                count1[ch] += 1
            else:
                count1[ch] = 1
        for ch in s2:
            if ch in count2:
                count2[ch] += 1
            else:
                count2[ch] = 1

        if count1 == count2:
            print("Anagram")
        else:
            print("Not Anagram")

s1 = input("Enter a string1").lower()
s2 = input("Enter a String2").lower()
Anagram(s1,s2)