package collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<String>();

		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C");

		System.out.println(hashSet);

		System.out.println("List Contains C or not? " + hashSet.contains("C"));

		hashSet.remove("A");
		System.out.println("List After removing A:" + hashSet);

		for (String item : hashSet) {
			System.out.println(item );

		}
	}

}
