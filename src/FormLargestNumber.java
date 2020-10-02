import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormLargestNumber {

	public static void main(String arg[]) {
		List<String> arrList = new ArrayList<>();
		arrList.add("56");
		arrList.add("564");
		arrList.add("9");
		arrList.add("984");
		arrList.add("97");
		System.out.println(formLargesNumber(arrList));
	}

	private static String formLargesNumber(List<String> arrList) {
		Collections.sort(arrList, (x, y) -> {
			return x.concat(y).compareTo(y.concat(x)) > 0 ? -1 : 1;
		});
		StringBuilder sb = new StringBuilder();
		arrList.forEach(v -> sb.append(v));
		return sb.toString();
	}

}
