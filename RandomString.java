/*3c. String Exercise progams
Q9. Write a Java Program for Creating a random 
string of a specified length using user defined
function generateRandomString()*/
package threec;
import java.util.*;
public class RandomString{
public static String generateRandomString(int length){
String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
Random r=new Random();
String result="";
for(int i=0;i<length;i++){
result=result+chars.charAt(r.nextInt(chars.length()));
}
return result;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter length of random string:");
int len=sc.nextInt();
String output=generateRandomString(len);
System.out.println("Random String:"+output);
}
}