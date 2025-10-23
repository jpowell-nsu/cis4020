#include <stdio.h>

// Simple function that returns the square of a number
int square(int n) {
    return n * n;
}

int main() {
    // Variable assignments
    int a = 5;
    int b = 10;
    int sum = a + b;

    printf("a = %d, b = %d, sum = %d\n", a, b, sum);

    // If-else statement
    if (sum > 10) {
        printf("The sum is greater than 10.\n");
    } else {
        printf("The sum is 10 or less.\n");
    }

    // Array and for loop
    int numbers[5];
    for (int i = 0; i < 5; i++) {
        numbers[i] = i + 1; // Assign values 1 to 5
    }

    printf("Array elements: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", numbers[i]);
    }
    printf("\n");

    // While loop
    int i = 0;
    int total = 0;
    while (i < 5) {
        total += numbers[i];
        i++;
    }
    printf("Sum of array elements = %d\n", total);

    // Using the function
    int result = square(4);
    printf("The square of 4 is %d\n", result);

    return 0;
}
