public class ArrayExercise{
	public static void main (String[] args ){

		char[] chars = new char[26];
		for( int i = 0; i < chars.length; i++){
			chars[i] = (char)('A' + i);
		}
		System.out.println("===chars����===");
		for( int i = 0; i < chars.length; i++){
		System.out.print(chars[i] + " ");
	}

	}
}