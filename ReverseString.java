/*3b. String Exercise progams
Q3. Write a Java Program for Reversing the characters 
in a string using user defined functionreverseString().*/
package threeB;
import java.util.*;
public class ReverseString{
public static String reverseString(String str){
String rev="";
for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
}
return rev;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
String result=reverseString(input);
System.out.println("Reversed string:"+result);
}
}