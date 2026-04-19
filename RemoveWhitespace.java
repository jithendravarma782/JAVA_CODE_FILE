/*3b. String Exercise progams
 * Q5. Write a Java Program for Eliminating all 
whitespace characters from a string using user 
definedfunction removeWhitespace()*/
package threeB;
import java.util.*;
public class RemoveWhitespace{
public static String removeWhitespace(String str){
str=str.replaceAll("\\s+","");
return str;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
String result=removeWhitespace(input);
System.out.println("String after removing whitespace:"+result);
}
}