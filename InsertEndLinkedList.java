/*1c. Linked List Programs
3. Write a Java program to insert the specified 
element at the end of a linked list.( usingl_listobj.\
offerLast(&quot;Pink&quot;))*/
package oneC;
import java.util.*;
public class InsertEndLinkedList{
public static void main(String[] args){
LinkedList<String> l_listobj=new LinkedList<String>();
l_listobj.add("Red");
l_listobj.add("Blue");
l_listobj.add("Green");
l_listobj.add("Yellow");
System.out.println("Original LinkedList:"+l_listobj);
l_listobj.offerLast("Pink");
System.out.println("After inserting Pink at end:"+l_listobj);
}
}