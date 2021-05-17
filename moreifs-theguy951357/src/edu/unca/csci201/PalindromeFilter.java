package edu.unca.csci201;

public class PalindromeFilter implements DataFilter {

	private int j;
	private int i;

	@Override
	public boolean shouldBePrinted(String a) {

		i = 0;
		j = a.length() - 1;
		while (i < j) {
			if (a.charAt(i) != a.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

}
