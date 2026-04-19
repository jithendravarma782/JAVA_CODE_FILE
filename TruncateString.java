/*3c. String Exercise progams
Q7. Write a Java Program for Shortening a string 
to a specified length and adds an ellipsis using 
userdefined function truncate()*/
package threec;
import java.util.*;
public class TruncateString{
public static String truncate(String str,int length){
if(str.length()>length){
return str.substring(0,length)+"...";
}
return str;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
System.out.print("Enter maximum length:");
int len=sc.nextInt();
String result=truncate(input,len);
System.out.println("Truncated string:"+result);
}
}