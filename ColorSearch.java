/*1b. Array List programs
 1. Write a java program for getting different colors through 
 ArrayList interface and search whether
the color &quot;Red&quot; is available or not*/
package oneb;
import java.util.*;
public class ColorSearch{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<>();
colors.add("Blue");
colors.add("Green");
colors.add("Red");
colors.add("Yellow");
colors.add("White");
System.out.println("Colors in ArrayList: "+colors);
if(colors.contains("Red")){
System.out.println("Red color is available");
}else{
System.out.println("Red color is not available");
}
}
}