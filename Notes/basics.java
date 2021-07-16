// commenting in Java uses a double slash (//) for one line comments, and a (/*...*/) for multiline comments
// making variables
dataType name = value;
  int myNum = 5;               // Integer (whole number)
  float myFloatNum = 5.99f;    // Floating point number (stores less decimal pts than double - only 6-7 vs a double holds 15) 
  char myLetter = 'D';         // Character
  boolean myBool = true;       // Boolean
  String myText = "Hello";     // String
Primitive data types: boolean, byte, char, short, int, long, float and double
Non-primitive data types: String, Array, ArrayList, Class

// declaring a variable:
  // dataType nameOfVar
  // declaring the variable type (you MUST declare the variable type if you do not initialize it!)
String myFirstProgram;
// putting a string into our String above (myFirstProgram)
myFirstProgram = "Hello World"
System.out.println(myFirstProgram);

// declaring a variable called age that can containe only whole numbers (therefore the type is Int)
int age;
// now initialize age with inserting a number into it
age = 10
System.out.println("You are " + age + " years old.")

// how to declare a variable and initialize it right away: 
String name = "Cat"
print("Great work " + name + "!")

// reassigning values
String feeling = "cool"
// How are you feeling?
feeling = "bored"
System.out.println("You are feeling " + feeling + "!")

// constants: value cannot be changed
// to initialize a constant:
final int secondsPerMinute = 60;
System.out.println("There are " + secondsPerMinute + " seconds per minute!")

// combining strings
final String gameName = "Tiny Ghost";
String review = " is the best game ever!";
String message = gameName + review;
System.out.println(message);

// print is a gobal function that prints a value
// you can use it to test/debug your program to check if your variable equals what you expect it to be
String quote = "Winner winner chicken dinner!"
System.out.println(quote);

// string interpolation is the process of creating longer strings by including variables or constants within it
// also called string concatination
String language = "Swift"
System.out.println("I am learning " + language + "!");

String company = "Apple";
final int yearFounded = 1976;
String str = " was founded in ";
print(company+str+yearFounded)
