/*1b. Array List programs
 4. Write a java program for getting different 
colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by 
using SubList() */
package oneb;
import java.util.*;
public class SubListColors{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<String>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Original ArrayList:"+colors);
List<String> sub=colors.subList(0,2);
System.out.println("Extracted elements (1st and 2nd):"+sub);
}
}