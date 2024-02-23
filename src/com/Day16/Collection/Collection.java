
//Collection <String> collection =new Arraylist <>();
//
//Here <> are called as generics. In array we have one disadvantage that we cannot store multiple datatype. But in Collection we can store multiple data types.
//collection interface dosent work on indexs. Then we go for List.
//Set will not allow duplicate elements. We get random output. which is a disadvantage of set. so we use "Tree Set". Tree Set is the class of Set.
//HashSet will give random output.
//Map is a interface, it works on key value pair. "Hashmap" is class of map.
//Indexes will work on List but not on Collection.
//List can have duplicate elements.
//Advantage of collection is Data Manupalation.

//Collection interface methods: boolean add(): returns true if collection is modified.
//boolean addAll(): add multiple collections.
//void clear(): removes all elements in collection. 
//boolean constains(Object o): check if it contains specified element.
//boolean containsAll(): Multiple elements if they are same. collection 1 and collection 2 should be same.
//boolean isEmpty(): checks if collection is empty.
//Iterator iterator(): used to traverse the collection. ( Here we use while loop).
//default Stream parallelStream(): (stream comparable and stream comparator may be asked in "Interview")
//boolean remove(Object o): removes an element;
//boolean removeAll(): if both collection have same element then it will remove all.
//boolean retainAll(): 
//int size(): 

package com.Day16.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.DelayQueue;

public class Collection {
	
	public static void main(String [] args) {
		
		List <String> list=new LinkedList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Watermelon");
		list.add("Apple");
		list.add("1");
		list.add(1, null);
		System.out.println(list);
		
//		List <String> collection=new DelayQueue<>();
//		collection.add("Apple");
//		collection.add("Mango");
//		collection.add("Banana");
//		collection.add("Grapes");
//		collection.add("Watermelon");
//		collection.add("Apple");
//		collection.add("1");
//		collection.add(1, null);
//		System.out.println(collection);
		
	}

}

