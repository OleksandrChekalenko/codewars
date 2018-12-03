class Persist {
	public static int persistence(long n) {
		if (n < 10) return 0;
		String[] integers;
		int tmp, result = 0;
		while (n > 9) {
			tmp = 1;
			integers = String.valueOf(n).split("");
			for (int i = 0; i < integers.length; i++) {
				tmp *= Integer.valueOf(integers[i]);
			}
			n = tmp;
			result++;
		}
		return result;
	}
}