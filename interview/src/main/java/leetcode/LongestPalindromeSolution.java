package leetcode;

class LongestPalindromeSolution {

	public static void main(String args[]) {
		LongestPalindromeSolution solution = new LongestPalindromeSolution();
		long start = System.currentTimeMillis();
		//System.out.println(solution.longestPalindrome(
				//"rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsyhxzlnxmdtsqqlmwnbxvmgvllafrpmlfuqpbhjddmhmbcgmlyeypkfpreddyencsdmgxysctpubvgeedhurvizgqxclhpfrvxggrowaynrtuwvvvwnqlowdihtrdzjffrgoeqivnprdnpvfjuhycpfydjcpfcnkpyujljiesmuxhtizzvwhvpqylvcirwqsmpptyhcqybstsfgjadicwzycswwmpluvzqdvnhkcofptqrzgjqtbvbdxylrylinspncrkxclykccbwridpqckstxdjawvziucrswpsfmisqiozworibeycuarcidbljslwbalcemgymnsxfziattdylrulwrybzztoxhevsdnvvljfzzrgcmagshucoalfiuapgzpqgjjgqsmcvtdsvehewrvtkeqwgmatqdpwlayjcxcavjmgpdyklrjcqvxjqbjucfubgmgpkfdxznkhcejscymuildfnuxwmuklntnyycdcscioimenaeohgpbcpogyifcsatfxeslstkjclauqmywacizyapxlgtcchlxkvygzeucwalhvhbwkvbceqajstxzzppcxoanhyfkgwaelsfdeeviqogjpresnoacegfeejyychabkhszcokdxpaqrprwfdahjqkfptwpeykgumyemgkccynxuvbdpjlrbgqtcqulxodurugofuwzudnhgxdrbbxtrvdnlodyhsifvyspejenpdckevzqrexplpcqtwtxlimfrsjumiygqeemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip"));
		System.out.println("dqmvxouqesajlmksdawfenyaqtnnfhmqbdcniynwhuywucbjzqxhofdzvposbegkvqqrdehxzgikgtibimupumaetjknrjjuygxvncvjlahdbibatmlobctclgbmihiphshfpymgtmpeneldeygmzlpkwzouvwvqkunihmzzzrqodtepgtnljribmqneumbzusgppodmqdvxjhqwqcztcuoqlqenvuuvgxljcnwqfnvilgqrkibuehactsxphxkiwnubszjflvvuhyfwmkgkmlhmvhygncrtcttioxndbszxsyettklotadmudcybhamlcjhjpsmfvvchduxjngoajclmkxiugdtryzinivuuwlkejcgrscldgmwujfygqrximksecmfzathdytauogffxcmfjsczaxnfzvqmylujfevjwuwwaqwtcllrilyncmkjdztleictdebpkzcdilgdmzmvcllnmuwpqxqjmyoageisiaeknbwzxxezfbfejdfausfproowsyyberhiznfmrtzqtgjkyhutieyqgrzlcfvfvxawbcdaawbeqmzjrnbidnzuxfwnfiqspjtrszetubnjbznnjfjxfwtzhzejahravwmkakqsmuynklmeffangwicghckrcjwtusfpdyxxqqmfcxeurnsrmqyameuvouqspahkvouhsjqvimznbkvmtqqzpqzyqivsmznnyoauezmrgvproomvqiuzjolejptuwbdzwalfcmweqqmvdhejguwlmvkaydjrjkijtrkdezbipxoccicygmmibflxdeoxvudzeobyyrutbcydusjhmlwnfncahxgswxiupgxgvktwkdxumqp");
		//System.out.println(solution.longestPalindrome("ac"));
		//System.out.println(solution.longestPalindrome("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public String longestPalindrome(String s) {

		String longPTxt = null;
		int longPSize = -1;

		if (isPalindromeMid(s)) {
			return s;
		}
		
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i; j < s.length(); j++) {
				String substring = s.substring(i, j + 1);

				if (isPalindromeMid(substring)) {
					int length = substring.length();
					if (length > longPSize) {
						longPTxt = substring;
						longPSize = length;
					}
				}
			}
		}

		System.out.println(longPTxt + " " + longPSize);
		return longPTxt == null ? s : longPTxt;
	}

	private boolean isPalindrome(String substring) {

		/*
		 * String testStr1 = new String("MAAM"); String testStr2 = new
		 * String("12321"); String testStr3 = new String("Nagesh"); String
		 * testStr4 = new String("HmmemmH");
		 */

		char[] charArray1 = substring.toCharArray();

		final int length = charArray1.length;
		boolean flag = true;
		for (int i = 0; i < charArray1.length; i++) {
			int front = i;
			int end = (length - 1 - i);
			if (front > end) {
				break;
			}
			if (charArray1[i] != charArray1[length - 1 - i]) {
				flag = false;
			}
		}

		/*
		 * if (flag) { System.out.println(substring + " is the palindrome.");
		 * }else{ System.out.println(substring + " is not palindrome."); }
		 */

		return flag;

	}

	private boolean isPalindromeMid(String subString) {
		int size = subString.length();
		int mide = -1;
		int mids = -1;
		if (size % 2 == 0) {
			mide = size / 2;
			mids = (size / 2) - 1;
		} else {
			mide = size / 2;
			mids = mide;
		}
		int start = 0;
		int end = size - 1;

		if (subString.charAt(mids) != subString.charAt(mide)) {
			return false;
		} else {
			while (start < mids && end > mide) {
				if (subString.charAt(start) != subString.charAt(end)) {
					return false;
				}
				start++;
				end--;
			}
		}
		return true;
	}
}