import random
import string

def make_near_palindrome(length=7):
    """
    Generate a near-palindrome string of given length (>=7).
    The string is symmetric except for a mismatch near the middle.
    """
    if length < 7:
        raise ValueError("Length must be 7 or more")
    
    # Build half of a palindrome
    half_len = length // 2
    left = [random.choice(string.ascii_lowercase) for _ in range(half_len)]
    
    # Mirror it to make a palindrome base
    if length % 2 == 0:
        right = left[::-1]
        base = left + right
    else:
        mid = random.choice(string.ascii_lowercase)
        right = left[::-1]
        base = left + [mid] + right
    
    # Introduce a mismatch near the middle
    chars = list(base)
    mid_index = length // 2
    
    # Pick one of the middle indices to corrupt
    target = mid_index if length % 2 == 0 else random.choice([mid_index-1, mid_index+1])
    old_char = chars[target]
    choices = [c for c in string.ascii_lowercase if c != old_char]
    chars[target] = random.choice(choices)
    
    return ''.join(chars)

# Generate a bulk list of near-palindromes
def generate_list(count=50, min_len=7, max_len=12):
    results = []
    for _ in range(count):
        length = random.randint(min_len, max_len)
        results.append(make_near_palindrome(length))
    return results

if __name__ == "__main__":
    near_palindromes = generate_list(10, 7, 12)  # generate 100 examples
    # Save to file
    with open("../files/near_palindromes.txt", "w") as f:
        for word in near_palindromes:
            f.write(word + "\n")
    print("Generated near-palindromes and saved to near_palindromes.txt")