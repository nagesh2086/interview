package diamond;

public class DiamondImpl1 extends DiamondI {
	@Override
	public void display() {
		System.out.println(this.getClass().getCanonicalName());
	}
}
