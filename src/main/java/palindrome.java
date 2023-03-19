
public class palindrome {

	public static void main(String[] args) {
		public static boolean isPalindrome(String str) {
			  // Reverse the string
			  String reversed = "";
			  for (int i = str.length() - 1; i >= 0; i--) {
			    reversed += str.charAt(i);
			  }

			  // Check if the string is a palindrome
			  return str.equals(reversed);
			}

		
		String str = "racecar";
		if (isPalindrome(str)) {
		  System.out.println(str + " is a palindrome");
		} else {
		  System.out.println(str + " is not a palindrome");
		}

	}

}
