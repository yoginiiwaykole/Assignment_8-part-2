# Assignment_8-part-2

ExceptionDemo Java Program with Custom Exception
This Java program demonstrates the use of custom exception by defining a class NOMATCHEXCP that extends the Exception class.

The program prompts the user to enter a string and checks if it is equal to the string "India". If the input string is not equal to "India", it throws a NOMATCHEXCP exception with a message stating that the input string does not match the expected value. Otherwise, it displays a message saying that the input string is valid.

Classes
ExceptionDemo
This is the main class that contains the main method. It prompts the user to enter a string, checks if it is equal to "India", and throws a NOMATCHEXCP exception if it is not.

NOMATCHEXCP
This is a custom exception class that extends the Exception class. It is thrown by the ExceptionDemo class when the input string does not match the expected value. The exception message contains the line number and the input string that caused the exception.
