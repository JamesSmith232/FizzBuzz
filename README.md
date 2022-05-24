# FizzBuzz

### Description

Prints a list of numbers with the range given by the users. This list program will replace the numbers that are divisible by 3, 5, 
or both with the corresponding words Fizz, Buzz, Fizzbuzz. 

This program has three different methods: main, isDivisible, and calcFizzBuzz:
 - **_main:_** Gets the required range from the user. It will then use a for loop to call the calcFizzBuzz 
method to display two list of numbers. One being a normal list of numbers in the range provided and the second 
list being the FizzBuzz list. 
 - **_isDivisible:_** Receives the number and the divisor. The divisor will always be 
either of the two constants of 3 and 5 declared at the beginning of the program. The isDivisor method will 
then use the modulus operator to find the divison remainder of the num and divisor variables. It will then return 
true/false based on if the divison remainder equals 0. 
- **_calcFizzBuzz:_** This method calls the _isDivisble_ method to see if the number given is divisible by 3 or 5. The
first if statement checks if the number are both divisble of 3 or 5, for example the number 15, and returns "FizzBuzz" if
it is. The second if statement returns "Fizz" if the number is divisble by 3, and the third returns "Buzz" if the number 
is divisible by 5. If the number is not divisible by 3 or 5, it will then return a string of the number that was given. 
