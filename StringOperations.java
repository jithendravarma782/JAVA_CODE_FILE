/*2 a. Develop a java program for performing various 
string operations with different string handling
functions directed as followsString Creation and 
Basic Operations, Length and Character Access, String 
Comparison, String Searching,Substring Operations , 
String Modification, Whitespace Handling, String 
Concatenation, StringSplitting, StringBuilder Demo, 
String Formatting , Validate Email with contains( ) 
and startsWith() andendsWith()*/
package twoA;
import java.util.*;
public class StringOperations{
public static void main(String[] args){

String s1="Hello";
String s2=new String("World");
System.out.println("String1:"+s1);
System.out.println("String2:"+s2);

System.out.println("Length:"+s1.length());
System.out.println("Character at index 1:"+s1.charAt(1));

String s3="Hello";
System.out.println("Equals:"+s1.equals(s3));
System.out.println("CompareTo:"+s1.compareTo(s2));

System.out.println("IndexOf l:"+s1.indexOf('l'));
System.out.println("Contains lo:"+s1.contains("lo"));

System.out.println("Substring(1,4):"+s1.substring(1,4));

System.out.println("ToUpperCase:"+s1.toUpperCase());
System.out.println("Replace l with p:"+s1.replace('l','p'));

String s4="   Java Programming   ";
System.out.println("Before trim:"+s4);
System.out.println("After trim:"+s4.trim());

String concat=s1.concat(" ").concat(s2);
System.out.println("Concatenated String:"+concat);

String s5="Red,Blue,Green,Yellow";
String[] colors=s5.split(",");
System.out.println("Split Strings:");
for(String c:colors){
System.out.println(c);
}

StringBuilder sb=new StringBuilder("Java");
sb.append(" Programming");
sb.insert(5,"Language ");
System.out.println("StringBuilder:"+sb);

String formatted=String.format("Name:%s Age:%d","John",20);
System.out.println("Formatted String:"+formatted);

String email="example@gmail.com";
if(email.contains("@")&&email.startsWith("example")&&email.endsWith(".com")){
System.out.println("Valid Email");
}else{
System.out.println("Invalid Email");
}

}
}