/*1c. Linked List Programs
2. Write a Java program to iterate a linked list 
in reverse order (usingobjlist.descendingIterator())*/
package oneC;
import java.util.*;
public class ReverseLinkedList{
public static void main(String[] args){
LinkedList<String> objlist=new LinkedList<String>();
objlist.add("Red");
objlist.add("Blue");
objlist.add("Green");
objlist.add("Yellow");
objlist.add("White");
System.out.println("LinkedList:"+objlist);
Iterator<String> itr=objlist.descendingIterator();
System.out.println("LinkedList in reverse order:");
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}