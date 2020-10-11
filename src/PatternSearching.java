
public class PatternSearching {

	public static void main(String[] args) {
		char[] text = "AABAACAADAABAAABAA".toCharArray();
		char[] pat = "AABA".toCharArray();
		printIndexes(text, pat);
	}

	private static void printIndexes(char[] text, char[] pat) {
		for (int i = 0; i < text.length; i++) {
			int j = 0;
			while (j < pat.length && (i + j) < text.length) {
				if (text[i + j] != pat[j++]) {
					break;
				}
			}
			if (j == pat.length) {
				System.out.println(i);
			}
		}
	}

}
