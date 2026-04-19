/*3c. String Exercise progams
Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package threec;
import java.util.*;
public class WordCount{
public static int countWords(String str){
str=str.trim();
if(str.length()==0){
return 0;
}
String[] words=str.split("\\s+");
return words.length;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String input=sc.nextLine();
int result=countWords(input);
System.out.println("Number of words:"+result);
}
}