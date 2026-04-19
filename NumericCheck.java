/*3c. String Exercise progams
Q8. Write a Java Program for Verifying if a 
string contains only numeric characters using 
user definedfunction isNumeric()*/
package threec;
import java.util.*;
public class NumericCheck{
public static boolean isNumeric(String str){
if(str==null||str.length()==0){
return false;
}
for(int i=0;i<str.length();i++){
if(!Character.isDigit(str.charAt(i))){
return false;
}
}
return true;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
if(isNumeric(input)){
System.out.println("String contains only numeric characters");
}else{
System.out.println("String does not contain only numeric characters");
}
}
}