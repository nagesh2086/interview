package object.copy;

import java.util.Arrays;

public class CopyingUsingClone implements Cloneable {

	private int[] my_data;

	public CopyingUsingClone(int[] my_val) {
		my_data = my_val;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void displayData() {
		System.out.println(Arrays.toString(my_data));
	}

	public void setMy_data(int[] my_data) {
		this.my_data = my_data;
	}

	public static void main(String[] args) {

	}

}
