s = input("Enter a String: ")
vowels =0
consonants =0

for ch in s:
    if 'A' <= ch <= 'Z':
        ch = chr(ord(ch) + 32)
    if 'a' <= ch <= 'z':
        if ch in 'aeiou':
            vowels += 1
        else:
            consonants += 1
print("Vowels:", vowels)
print("Consonants:", consonants)