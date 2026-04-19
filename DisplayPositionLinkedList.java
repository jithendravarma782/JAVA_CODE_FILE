/*1c. Linked List Programs
4. Write a Java program to display elements and 
their positions in a linked list ( usingl_listobj.
get(p) )*/
package oneC;
import java.util.*;
public class DisplayPositionLinkedList{
public static void main(String[] args){
LinkedList<String> l_listobj=new LinkedList<String>();
l_listobj.add("Red");
l_listobj.add("Blue");
l_listobj.add("Green");
l_listobj.add("Yellow");
l_listobj.add("White");
for(int p=0;p<l_listobj.size();p++){
System.out.println("Position "+p+" Element "+l_listobj.get(p));
}
}
}