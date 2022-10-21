package streamsmap;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbersList = new ArrayList<>();

		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);

//		List<Integer> squaresList = new ArrayList<>();
//		for (Integer i : numbersList) {
//			squaresList.add(i * i);
//		}
		
//		List<Integer> squaresList = numbersList.stream().
//				map(x -> x*x).collect(Collectors.toList());
//		System.out.println("lIST OF SQUARE NUMBERS : "+ squaresList);
//	
//	Set<Integer> squaresSet = new HashSet<>();
//	for(Integer i:numbersList){
//		squaresSet.add(i*i);
//	}
		
//	Set<Integer> squaresSet = numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
//	
//	System.out.println("Set of squared Numbers: " + squaresSet);
		
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("python");
		languages.add("scala");  
	
//		List<String> filterResult = new ArrayList<>();
//		for(String s:languages){
//			if(s.startsWith("p")){
//				filterResult.add(s);
//			}
//		}
		
		List<String> filterResult = languages.stream().filter(s -> s.startsWith("p")).
				collect(Collectors.toList());
		
		System.out.println("Languages starting with:"+filterResult);
	}

}
