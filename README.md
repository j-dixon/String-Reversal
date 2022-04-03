# String Reversal Program

Kotlin program to reverse a given string.

This program takes a string as user input and reverse that string in the following method.
- The program defines two pointers, each one taking a character of the given string
- The first set of characters are always the first and last characters of the string
- These two characters get swapped round, the pointers then move onto the next set of characters (2nd and 2nd from last)
- This cycle continues until there is only one character left in the string, then the cycle stops

This program also allows the user to define a set of characters that are restricted, and therefore, cannot be swapped. In a case of this, the pointers will skip over the restricted character, moving onto the next one. Both the pointers will always check before swapping characters, if either of them are restricted, if so, the pointer that is curently on a restricted character, moves to the next character and re-checks. The swap is only performed, once both characters are not restricted.

