/*3c. String Exercise progams
 * Q6. Write a Java Program for Capitalizing the 
first letter of each word. using user defined 
functioncapitalizeWords()*/
package threec;
import java.util.*;
public class CapitalizeWords{
public static String capitalizeWords(String str){
String[] words=str.split("\\s+");
String result="";
for(String w:words){
if(w.length()>0){
result=result+w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase()+" ";
}
}
return result.trim();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
String output=capitalizeWords(input);
System.out.println("Capitalized string:"+output);
}
}