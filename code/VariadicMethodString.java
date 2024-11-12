package javac.v4;

public class VariadicMethodString {
	
	public static String concat(String delim, String ...texts) {
		StringBuilder buf = new StringBuilder();
		for (int i=0; i<texts.length; i++) {
			buf.append(texts[i]);
			if( i < texts.length -1 ) {
				buf.append(delim);
			}
		}
		return buf.toString();
	}

	public static void main(String[] args) {
		
		String cats = concat(", ", "Bella", "Dana", "Tom");
		System.out.println(cats); // Output: Bella, Dana, Tom
		
		String people = concat(";", "Hans", "Claudia", "Felix", "Maria");
		System.out.println(people); // Output: Hans;Claudia;Felix;Maria

	}

}
