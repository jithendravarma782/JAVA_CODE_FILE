/*1b. Array List programs
 5. Write a java program for getting different 
 colors through ArrayList interface and delete nth
element from the ArrayList object by using remove 
by index */
package oneb;
import java.util.*;
public class DeleteNthElement{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<String>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Original ArrayList:"+colors);
int n=3;
colors.remove(n-1);
System.out.println("After deleting "+n+"th element:"+colors);
}
}