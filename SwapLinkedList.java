/*1c. Linked List Programs
5. Write a Java program that swaps two elements 
( first and third elements ) in a linked list 
( usingCollections.swap(l_list, 0, 2))*/
package oneC;
import java.util.*;
public class SwapLinkedList{
public static void main(String[] args){
LinkedList<String> l_list=new LinkedList<String>();
l_list.add("Red");
l_list.add("Blue");
l_list.add("Green");
l_list.add("Yellow");
l_list.add("White");
System.out.println("Before swap:"+l_list);
Collections.swap(l_list,0,2);
System.out.println("After swap:"+l_list);
}
}