# bonusTask
String reader 

You were given an input of many strings, that contain numbers and letters (see below). Each line is a single string and the number of lines is unlimited.

Your task is to write a Java program that reads .txt files with provided input,
iterates over each line and prints lines which contain at least one number that is equal to or higher than 10.

Your input:
asf5g5g66
gh5n0rh5e
d9d10d0
oo9etyd1c3dfg4
abc999l0j
dsf1sf5sd9l0
l0l02Ol0l
asf5g5g6O
ee8OidXXI0l
d9dI0dl0

Output:
asf5g5g66
d9d10d0
abc999l0j


************************

Created just the main class. Used BufferReader for reading String from .txt file. Used StringBuilder to concat the numbers. That String was parsed to Int, to get value.
If the value was greater or equal to 10, the string was printed to console. 
