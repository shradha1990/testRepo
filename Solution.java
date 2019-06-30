public class Solution {

	public String solution(int A, int B) {
		String output = "";

		if ((A - B) < -1 || (A - B) > 1) {
			return "Invalid Input";
		}

		boolean isFirstA = true, isFirstB = false;
		if (B > A) {
			isFirstB = true;
			isFirstA = false;
		}

		while (A > 0 || B > 0) {
			if (A > 0 && isFirstA) {
				isFirstB = true;
				output += "a";
				A--;
			}

			if (B > 0 && isFirstB) {
				isFirstA = true;
				output += "b";
				B--;
			}
		}

		return output;

	}

	// a=4,b=3 3 2//ab 2 1 abab 1 0 ababab
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(0, 0)); // ababab, bababa

	}

}
