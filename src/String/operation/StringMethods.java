package String.operation;

public class StringMethods {

	public static void main (String [] args) {
		
		String st="This is Sample Text";
		String word="sample";
		System.out.println(st.charAt(5));
		System.out.println(st.lastIndexOf("is"));
		System.out.println(st.compareTo(word));
		System.out.println(st.equals(word));
		System.out.println(st.substring(8,14));
		System.out.println((st.substring(8, 14).equalsIgnoreCase(word)));
		System.out.println(st.length());
		System.out.println(st.concat(" and it was an amazing read"));
		System.out.println(st.endsWith("Text"));
		System.out.println(st.indexOf("Sample"));
		System.out.println(st.isEmpty());
		System.out.println(st.replaceFirst("Text", "ice-cream"));
		char [] chars=st.toCharArray();
		for(char cha:chars)
			System.out.print(cha);
		System.out.println();
		System.out.println(st.toUpperCase());
		String [] words=st.split(" ");
		for(String word1:words)
			System.out.print(word1 + " ");
		System.out.println(st.codePointCount(0, 9));
		System.out.println(st.contains("This"));
		System.out.println(st.replaceAll("is", "ose"));
		System.out.println(st.hashCode());
		System.out.println(st.getClass());
		
		
		
	}
}
