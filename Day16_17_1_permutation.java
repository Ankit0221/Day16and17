package Day16_17_problem;

public class Day16_17_1_permutation {
	public static void main(String[] args) {
		String string = "ABC";
		int permutationnumber = string.length();
		Day16_17_1_permutation permutation = new Day16_17_1_permutation();
		permutation.permute(string, 0, permutationnumber - 1);
	}

	private void permute(String string, int x, int y) {
		if (x == y)
			System.out.println("permutation Number of ABC="+string);
		else {
			for (int i = x; i <= y; i++) {
				string = swap(string, x, i);
				permute(string, x + 1, y);
				string = swap(string, x, i);
			}
		}
	}

	public String swap(String sc, int a, int b) {
		char temp;
		char[] charArray = sc.toCharArray();
		temp = charArray[a];
		charArray[a] = charArray[b];
		charArray[b] = temp;
		return String.valueOf(charArray);
	}

}
