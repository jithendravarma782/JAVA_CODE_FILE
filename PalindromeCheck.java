/*3b. String Exercise progams
Q4. Write a Java Program for Checking if a string 
reads the same backward as forward (ignoring case
and punctuation) using user defined function is
Palindrome():*/
package threeB;
import java.util.*;
public class PalindromeCheck{
public static boolean isPalindrome(String str){
str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
int i=0,j=str.length()-1;
while(i<j){
if(str.charAt(i)!=str.charAt(j)){
return false;
}
i++;
j--;
}
return true;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
if(isPalindrome(input)){
System.out.println("String is a palindrome");
}else{
System.out.println("String is not a palindrome");
}
}
}