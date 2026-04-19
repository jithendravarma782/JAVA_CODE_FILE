/*1a.Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a
LinkedList to perform the following operations with different functions directed as follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing
elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating
over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
package oneA;
import java.util.*;

public class ListOperations {

	public static void addElements(List<String> list){
	list.add("Apple");
	list.add("Banana");
	list.add("Orange");
	System.out.println("After adding elements: "+list);
	}
	public static void addAtIndex(List<String> list){
	list.add(1,"Mango");
	System.out.println("After adding at index 1: "+list);
	}
	public static void addMultiple(List<String> list){
	List<String> newItems=Arrays.asList("Grapes","Pineapple");
	list.addAll(newItems);
	System.out.println("After adding multiple elements: "+list);
	}
	public static void accessElements(List<String> list){
	System.out.println("Element at index 0: "+list.get(0));
	}
	public static void updateElements(List<String> list){
	list.set(2,"Cherry");
	System.out.println("After updating index 2: "+list);
	}
	public static void removeElements(List<String> list){
	list.remove("Banana");
	System.out.println("After removing Banana: "+list);
	}
	public static void searchElements(List<String> list){
	if(list.contains("Apple")){
	System.out.println("Apple found in list.");
	}else{
	System.out.println("Apple not found.");
	}
	}
	public static void listSize(List<String> list){
	System.out.println("List size: "+list.size());
	}
	public static void iterateList(List<String> list){
	System.out.println("Iterating using for-each:");
	for(String item:list){
	System.out.println(item);
	}
	}
	public static void useIterator(List<String> list){
	System.out.println("Iterating using Iterator:");
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
	}
	public static void sortList(List<String> list){
	Collections.sort(list);
	System.out.println("After sorting: "+list);
	}
	public static void subListExample(List<String> list){
	if(list.size()>=2){
	List<String> sub=list.subList(0,2);
	System.out.println("Sublist (0 to 2): "+sub);
	}
	}
	public static void clearList(List<String> list){
	list.clear();
	System.out.println("List after clearing: "+list);
	}
	public static void main(String[] args){
	System.out.println("===== ArrayList Operations =====");
	List<String> arrayList=new ArrayList<>();
	addElements(arrayList);
	addAtIndex(arrayList);
	addMultiple(arrayList);
	accessElements(arrayList);
	updateElements(arrayList);
	removeElements(arrayList);
	searchElements(arrayList);
	listSize(arrayList);
	iterateList(arrayList);
	useIterator(arrayList);
	sortList(arrayList);
	subListExample(arrayList);
	clearList(arrayList);
	System.out.println("\n===== LinkedList Operations =====");
	List<String> linkedList=new LinkedList<>();
	addElements(linkedList);
	addAtIndex(linkedList);
	addMultiple(linkedList);
	accessElements(linkedList);
	updateElements(linkedList);
	removeElements(linkedList);
	searchElements(linkedList);
	listSize(linkedList);
	iterateList(linkedList);
	useIterator(linkedList);
	sortList(linkedList);
	subListExample(linkedList);
	clearList(linkedList);
	}
	}