/*1c. Linked List Programs
1. Write a Java program to iterate through all 
elements in a linked list starting at the
specified position ( 2 nd ) using iterator 
( hint : Iterator iteratorobj = listobj.listIterator
(1))*/
package oneC;
import java.util.*;
public class LinkedListIterator{
public static void main(String[] args){
LinkedList<String> listobj=new LinkedList<String>();
listobj.add("Red");
listobj.add("Blue");
listobj.add("Green");
listobj.add("Yellow");
listobj.add("White");
System.out.println("LinkedList:"+listobj);
ListIterator<String> iteratorobj=listobj.listIterator(1);
System.out.println("Elements starting from 2nd position:");
while(iteratorobj.hasNext()){
System.out.println(iteratorobj.next());
}
}
}