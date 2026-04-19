/* 1b. Array List programs
 2. Write a java program for getting different colors through
  ArrayList interface and remove the
2nd element and color &quot;Blue&quot; from the ArrayList */
package oneb;
import java.util.*;
public class RemoveColor{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<String>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Original ArrayList:"+colors);
colors.remove(1);
colors.remove("Blue");
System.out.println("After removing 2nd element and Blue:"+colors);
}
}