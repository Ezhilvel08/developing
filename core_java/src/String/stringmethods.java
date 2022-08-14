package String;

public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "This is the ezhilvel";

		String str2 = "Hello";

		String str3 = "World";

		String str4 = "";

		String str5 = "     this is jarvis     ";

		System.out.println("String length : " + str1.length());

		System.out.println("String Char At: " + str1.charAt(5));

		System.out.println(str2 + " " + str3);
		System.out.println(str2.concat(" ") + str3);

		System.out.println(str1.startsWith("His"));
		System.out.println(str1.contains("First"));
		System.out.println(str1.endsWith("String"));
		System.out.println("equals :" + str2.equals(str3));
		System.out.println("equals to ignore : " + str2.equalsIgnoreCase(str3));
		System.out.println("String Index : " + str1.indexOf("T"));
		System.out.println("String is empty" + str1.isEmpty());
		System.out.println(str1.replace("This", "Hello This"));
		System.out.println(str1.substring(1, 5));
		System.out.println("String Lower case : " + str1.toLowerCase());
		System.out.println("String Upper case : " + str1.toUpperCase());
		System.out.println(str5.length());
		System.out.println(str5.trim().length());
		System.out.println(str5.trim());
		char[] str6 = str1.toCharArray();
		for (int i = 0; i <= str6.length - 1; i++) {
			System.out.println(str6[i]);
		}
	}
}
