sentence = input("Enter a sentence: ")
words = sentence.split()
reverse_words = ""

for i in range(len(words)-1,-1,-1):
    reverse_words += words[i]
    if i != 0:
        reverse_words += " "
print("Reversed sentence: ", reverse_words)

# Enter a sentence: Hima Bindu
# Reversed sentence:  Bindu Hima