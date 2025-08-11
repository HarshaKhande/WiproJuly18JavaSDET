package corejava;

public class StringsEgs {

	public static void main(String[] args) {

		// strings  seqence of characters stored 
		
		// zero based index 
		
		// immutablity - cannot be changed 
		
		// 1
		
		String S1 = "Hello world";
		
		System.out.println(S1);
		
		// 2
		
		char[] ch = {'h', 'e', 'l', 'l', 'o'};
		
		String S2 = new String(ch);
		
		System.out.println(S2);
		
		// 3
		
		String S3 = new String ("Hello");
		
		System.out.println(S3);
		
		// String methods  equals , concatenation, substring , contains, replace,is empty, join , ends with ,compare to ,s plit
		
		
		String str1 = "Mumbai";
		
		String str2 = "Delhi";
		
		// equals method
		
		System.out.println(str1.equals(str2)); // false
		
		System.out.println(str1.equalsIgnoreCase(str2)); // false
		
		// concatenation 
		
		System.out.println(str1.concat(str2)); //MumbaiDelhi
		
		//contains 
		
		System.out.println(str1.contains("z")); // false
		
		// substring 
		
		System.out.println(str1.substring(3)); //
		
		System.out.println(str1.substring(1, 3));
		
		//replace
		
		System.out.println(str1.replace("i", "g"));
		
		System.out.println(str1.replaceAll(str1, "Pune"));
		
		//is empty 
		
		System.out.println(str1.isEmpty()); // false 
		
		// ends with
		
		System.out.println(str1.endsWith("e")); //fasle
		
		// join 
		
		String str3 = String.join("_", "city", "Mumbai");
		
		System.out.println(str3);
		
		// compare to  lexo grapahical comparison
		
		System.out.println(str2.compareTo(str3));
		
		
		// split 
		
		String text = "java is a programming language";
		
		String[] result = text.split(" ");
		
		
		for (String str : result) {
			
			System.out.println(str + ",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
