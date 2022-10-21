package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arrayList = new ArrayList<>(5);

		for (int i = 1; i <= 5; i++) {
			arrayList.add(i);
		}
		
	//PRINTING ELEMENTS
		System.out.println(arrayList);
		
		//remove elements at index 3
		arrayList.remove(3);
		
		//dislaying the ARRAYlIST
		//AFTER DELETION
		System.out.println(arrayList);
		
		//printing elements one by one
		
//		for(int i=0;i<arrayList.size();i++)
//			System.out.print(arrayList.get(i) + " ");
		
		for(int i:arrayList){
			System.out.print(i+" ");
		}
	}

}
