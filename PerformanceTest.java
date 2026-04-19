/*2.b. Develop a Java program to make a Performance 
Test on StringBuffer and StringBuilder for appending
the string ‘AIET’ for 10000 times both in the String
Buffer and StringBuilder. Justify your answer which
one is better.*/
package twoB;
public class PerformanceTest{
public static void main(String[] args){

long startTime1=System.currentTimeMillis();
StringBuffer sbf=new StringBuffer();
for(int i=0;i<10000;i++){
sbf.append("AIET");
}
long endTime1=System.currentTimeMillis();
System.out.println("Time taken by StringBuffer:"+(endTime1-startTime1)+" ms");

long startTime2=System.currentTimeMillis();
StringBuilder sbd=new StringBuilder();
for(int i=0;i<10000;i++){
sbd.append("AIET");
}
long endTime2=System.currentTimeMillis();
System.out.println("Time taken by StringBuilder:"+(endTime2-startTime2)+" ms");

}
}