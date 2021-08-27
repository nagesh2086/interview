package object.copy;

public class CopyingUsingCloneApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] my_val = { 100, 200, 300 };
		CopyingUsingClone cuc = new CopyingUsingClone(my_val);
		System.out.println("Before: ");
		cuc.displayData();

		CopyingUsingClone cucClone = (CopyingUsingClone) cuc.clone();
		int[] my_val_clone = { 400, 500 };
		cucClone.setMy_data(my_val_clone);

		System.out.println("After: ");
		cuc.displayData();
		cucClone.displayData();
	}

}
