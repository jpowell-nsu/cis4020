import random
import string

def make_palindrome(length=7):
    """
    Generate a palindrome string of given length (>=1).
    """
    if length < 1:
        raise ValueError("Length must be at least 1")
    
    half_len = length // 2
    left = [random.choice(string.ascii_lowercase) for _ in range(half_len)]
    
    if length % 2 == 0:
        # even length: mirror left
        right = left[::-1]
        return ''.join(left + right)
    else:
        # odd length: add a middle char then mirror
        mid = random.choice(string.ascii_lowercase)
        right = left[::-1]
        return ''.join(left + [mid] + right)

def generate_palindromes(count=50, min_len=7, max_len=12):
    """
    Generate a list of palindrome strings.
    """
    results = []
    for _ in range(count):
        length = random.randint(min_len, max_len)
        results.append(make_palindrome(length))
    return results

if __name__ == "__main__":
    palindromes = generate_palindromes(10, 7, 12)  # generate x examples
    
    # Save to file
    with open("../files/palindromes.txt", "w") as f:
        for word in palindromes:
            f.write(word + "\n")
    
    print("Generated palindromes and saved to palindromes.txt")