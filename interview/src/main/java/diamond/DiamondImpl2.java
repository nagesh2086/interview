package diamond;
public class DiamondImpl2 extends DiamondI {
	@Override
	public void display() {
		System.out.println(this.getClass().getCanonicalName());
	}
}