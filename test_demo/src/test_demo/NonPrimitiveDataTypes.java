package test_demo;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		String str1="maths";
		System.out.println("String is :"+ str1);
		
		String str2 = new String("maths");
		System.out.println("Another String :"+ str2);
		
		int arr[];
		arr = new int[2];
		arr[0]=0;
		arr[1]=1;
		//arr[2]=2;
		
		System.out.println(arr);
		System.out.println(arr[0]);
	}

}
