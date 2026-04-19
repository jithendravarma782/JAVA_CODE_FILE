/*3b. String Exercise progams
Q1. Write a Java Program for Checking if a given 
string is null or contains only whitespace using 
userdefined function isNullOrEmpty().*/
package threeB;
import java.util.*;
public class NullOrEmptyCheck{
public static boolean isNullOrEmpty(String str){
if(str==null||str.trim().length()==0){
return true;
}
return false;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
if(isNullOrEmpty(input)){
System.out.println("String is null or contains only whitespace");
}else{
System.out.println("String is not null and not empty");
}
}
}