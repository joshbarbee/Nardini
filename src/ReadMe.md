Log file for Chapter 08 Lab
-------------------------------------------------------------------------------------------
Original method: iterate through half of string and compare the first half to the reversed second half.
May not necessarily work, dependent upon whether you count an odd-sized string still as a palindrome.
Gave up on method, decided to iterate through string.
First planned on manually iterating through string using for loop.
After that, learned about java string builder library, which allows for string reversal.
Easily integrated, faced problems when comparing string to string.reverse(), due to not having a strict equality check.
Eventually solved it and got the 80 point version.
Incorporated same methodology into isPal, but now using a regex parser in the function(purge) to delete all instances of a non-alpha character.
Ran into stack overflow error, fixed when regex was incorporated, was caused because of no way to end how long the purge function ran for.
Then correctly implemented the isLetter function.
Realized that since almostPal and pal should be different, I added a check that made sure that isPal did not come out to be true.