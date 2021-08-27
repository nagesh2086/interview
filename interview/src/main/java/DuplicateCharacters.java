
public class DuplicateCharacters {

	public static void main(String[] args) {
		//String input = "NageshKekan@2021#Nagesh#2021xyz";
		String input = "kajdfe9039898*(*)(ASDKLFJIasdfjkasdjf12389";
		
		//input = input.toLowerCase();
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] != '!'){
				int count = 1;
				for (int j = i+1; j < charArray.length; j++) {
					if(charArray[i] == charArray[j]){
						count++;
						charArray[j] = '!';
					}
				}
				if(count != 1){
					System.out.println(charArray[i] + " occured " + count + " times");
				}
			}
		}
		
	}

}
