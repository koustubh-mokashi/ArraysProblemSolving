
public class ReverseArrayWithoutAffectingSpecialCharacter {

	public static void main(String ar[]) {
		String str = "a,b$c";
		char a[] = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			while (!Character.isLetter(a[i++]) && (i < j))
				;
			while (!Character.isLetter(a[j--]) && (i < j))
				;
			char ch = a[i - 1];
			a[i - 1] = a[j + 1];
			a[j + 1] = ch;
		}
		System.out.println(new String(a));
	}
}
