import string
import random
def ap(text):
        text = text.lower().strip()
        return " ".join([str(ord(x) - ord("a") + 1) for x in text if x in string.ascii_letters] )

print("Tests for each letter:")
for letter in string.ascii_lowercase:
    test.assert_equals(alphabet_position(letter), ap(letter))
print("Tests for non-letters:")
test.assert_equals(alphabet_position("-.-'"), "")

print("Randomly generated tests:")
for i in range(100):
    x = ''.join(random.choice(string.ascii_letters) for _ in range(100))
    print("Testing \"{0}\":".format(x))
    test.assert_equals(alphabet_position(x), ap(x))