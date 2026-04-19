/*3a. Develop a java program for performing various 
string operations with different string handling
functions directed as follows:String Creation and 
Basic Operations, Length and Character Access, 
String Comparison, StringSearching, Substring 
Operations , String Modification, Whitespace 
Handling, String Concatenation,String Splitting, 
StringBuilder Demo, String Formatting , Validate 
Email with contains( ) andstartsWith() and endsWith()*/
package threeA;
import java.util.*;
public class StringFunctions{
public static void main(String[] args){

String s1="Java";
String s2=new String("Programming");
System.out.println("String1:"+s1);
System.out.println("String2:"+s2);

System.out.println("Length:"+s1.length());
System.out.println("CharAt(2):"+s1.charAt(2));

String s3="Java";
System.out.println("Equals:"+s1.equals(s3));
System.out.println("CompareTo:"+s1.compareTo(s2));

System.out.println("IndexOf a:"+s1.indexOf('a'));
System.out.println("Contains va:"+s1.contains("va"));

System.out.println("Substring(1,3):"+s1.substring(1,3));

System.out.println("ToUpperCase:"+s1.toUpperCase());
System.out.println("Replace a with o:"+s1.replace('a','o'));

String s4="   Hello World   ";
System.out.println("Before Trim:"+s4);
System.out.println("After Trim:"+s4.trim());

String concat=s1.concat(" ").concat(s2);
System.out.println("Concatenated:"+concat);

String s5="Red,Blue,Green,Yellow";
String[] arr=s5.split(",");
System.out.println("Split Result:");
for(String str:arr){
System.out.println(str);
}

StringBuilder sb=new StringBuilder("Java");
sb.append(" Language");
sb.insert(5,"Programming ");
System.out.println("StringBuilder:"+sb);

String formatted=String.format("Name:%s Age:%d","Student",20);
System.out.println("Formatted:"+formatted);

String email="student@gmail.com";
if(email.contains("@")&&email.startsWith("student")&&email.endsWith(".com")){
System.out.println("Valid Email");
}else{
System.out.println("Invalid Email");
}

}
}