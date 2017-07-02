package binarySearch; //This java file is inside package named package1 inside src folder.
import java.util.*; //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.
/*
* This assignment helped me to master the concepts of array and improved my logical skills.
*/
public class Assignment6_3 //Class declaration containing main function.
{
public static void main(String[] args) //main function declaration. and because it is static, program execution starts from main function.
{
int numberOfElements; //int variable to store number of elements in the array.
System.out.println("Enter the number of elements that you want to insert in the array"); //Asking for value.
// asking value of numberOfElements from the user.
// for printing this on screen. we have used the inbuilt function println() of out stream of System class.
//Now we want to take input of the value of numberOfElements from the user.
// For taking input from the user, we have to make the object of Scanner class.
//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
Scanner sc=new Scanner(System.in); //creating object of Scanner class.
numberOfElements=sc.nextInt(); //Initializing the number of elements of the array.
int[] binarySearchArray = new int[numberOfElements]; //Creating array of size equal to number input by user.
System.out.println("Enter the elements one by one space seperately");
for(int i= 0 ; i < numberOfElements ; i++) //for loop to read the values of elements from the user.
{
binarySearchArray[i] = sc.nextInt(); //Initializing the value of element by user input value.
}
//Basic condition to perform binary search on array is to sort the array.
for(int i = 0 ; i < numberOfElements ; i++) //Two for loops to implement insertion sort on the array.
for(int j = i+1 ; j < numberOfElements ; j++)
{
if(binarySearchArray[i] > binarySearchArray[j]) //if left handside element is greater than right one.
{
int tempVariable = binarySearchArray[i]; //Swaping two elements of array using temporary variable.
binarySearchArray[i] = binarySearchArray[j];
binarySearchArray[j] = tempVariable;
}
}
int elementToFind; //int variable to find in array.
System.out.println("\nEnter the element which you want to find"); //Asking element.
elementToFind = sc.nextInt(); //Initializing the variable by user input value.
//-------------Binary Search Algorithm-------------
//Binary search is basically algorithm to reduce the array size by half every time.
int lowIndex = 0 , highIndex = numberOfElements-1; //Declaring two variables to locate high and low index values in array while binary searching.
boolean isFound = false; //boolean variable to check weather element is found or not.
while(lowIndex <= highIndex)
{
int midIndex = (lowIndex + highIndex)/2; //int variable to point mid index of array.
if(binarySearchArray[midIndex] < elementToFind)
lowIndex = midIndex + 1; //Reducing the size of array, Now we will only look at the right of array.
else if(binarySearchArray[midIndex] > elementToFind)
highIndex = midIndex - 1; //Reducing the size of array, Now we will only look at the left of array.
else if(binarySearchArray[midIndex] == elementToFind)
{
//Element found
System.out.println("The element you have entered is found in the array and it is at index "+midIndex); //Printing result.
isFound = true; //Changing boolean variable.
break; //No need to iterate now, because we found the position of the given element.
}
}
//If loop is completed but result is not printed. It means given element is not there in the array.
if(isFound == false)
System.out.println("The element you have entered is not found in the array");
//There is another approach also, which follows the recursive approach to binary search.
//Binary search algorithm has time complexity log(n) where n is number of elements in the array.
//Binary search is very efficient algorithm in all searching algorithm.
sc.close(); //Closing the Scanner class.
} //End of main function.
} //End of class.