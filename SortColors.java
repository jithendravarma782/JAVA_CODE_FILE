/*1b. Array List programs
 3. Write a java program for getting different
  colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj) */
package oneb;
import java.util.*;
public class SortColors{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<String>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Before Sorting:"+colors);
Collections.sort(colors);
System.out.println("After Sorting:"+colors);
}
}