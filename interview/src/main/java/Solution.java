class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPalindrome("ra@ce .a c\\a/r"));
	}
    public boolean isPalindrome(String s) {
        String palindromeTxt = s.toLowerCase();
        /*String t1 = palindromeTxt.replace(',', ' ');
        String t2 = t1.replace(':', ' ');
        String t3 = t2.replace('.', ' ');
        String t4 = t3.replaceAll(" ", "");
        t4.replaceAll("\\.", "");*/
		//String tempPalindromeTxt = palindromeTxt.replaceAll(",", "").replaceAll(":", "").replaceAll(" ", "").replaceAll(".", "");
        String tempPalindromeTxt = palindromeTxt.replaceAll("\\W", "");
        System.out.println(tempPalindromeTxt);
		char[] charArray = tempPalindromeTxt.toCharArray();
		int lPdIndex = 0;
		int rPdIndex = charArray.length - 1;
		boolean isPalindrome = true;
		while (lPdIndex <= rPdIndex) {
			if (charArray[lPdIndex] != charArray[rPdIndex]) {
                return false;
			}
			lPdIndex++;
			rPdIndex--;
		}
		System.out.println(isPalindrome + "   " + palindromeTxt);
        return isPalindrome;
    }
}