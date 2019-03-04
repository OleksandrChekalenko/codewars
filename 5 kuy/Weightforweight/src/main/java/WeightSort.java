public class WeightSort {
	
	public static String orderWeight(String strng) {
		String[] str = strng.split(" ");
		int first = compare(str[0]);
		int temp = 0;
		String result = "";
		for (int j = 1; j < str.length; j++) {
			temp = compare(str[j]);
			if ()
		}
		return "";
	}

	public static int compare(String s) {
		int i = 0;
		for (String string : s.split("")) {
			i += Integer.parseInt(string);
		}
		return i;
	}
}