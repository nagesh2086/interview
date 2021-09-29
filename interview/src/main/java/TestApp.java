
public class TestApp {

	public static void main(String[] args) {
		int i = -1;
		for(;;){
			Integer j = 100;
			String s = "asdfa";
			/*if(i == 150000){
				break;
			}*/
			i++;
			String.format("%s", s);
			String.format("%d", j);
			System.out.println(String.format("%s", s) + " " + String.format("%d", j));
		}
	}

}
