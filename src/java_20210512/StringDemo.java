package java_20210512;

public class StringDemo {
	public static String reverse(String str) {
		int strLength =  str.length();
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < strLength/2; ++i) {
			char temp = arr[i];
			arr[i] = arr[strLength-i-1];
			arr[strLength-i-1] = temp;
		}
		
		return String.valueOf(arr);
	}
	
	public static String reverse2(String str) {
		int strLength =  str.length();
		String[] arr = new String[strLength];
		
		for (int i = 0; i < strLength; ++i) {
			arr[i] = str.substring(i, i+1);
		}
		
		for (int i = 0; i < strLength/2; ++i) {
			String temp = arr[i];
			arr[i] = arr[strLength-i-1];
			arr[strLength-i-1] = temp;
		}
		
		
		String result = new String();
		for (int i = 0; i < strLength; ++i) {
			result = result.concat(arr[i]);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "test";
		String str4 = "test";
		
		//System.out.println(str1==str2);
		//System.out.println(str1.equals(str2));
		//System.out.println(str3==str4);
		//System.out.println(str3.equals(str4));
		
		String strr = "beautiful";
		System.out.println(reverse(strr));
		System.out.println(reverse2(strr));
	}
}
