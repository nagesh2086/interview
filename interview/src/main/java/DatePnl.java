import java.util.Arrays;

public class DatePnl implements Comparable<DatePnl> {
	public DatePnl(int date, double pnl) {
		this.date = date;
		this.pnl = pnl;
	}
private int date;
private double pnl;
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public double getPnl() {
	return pnl;
}
public void setPnl(double pnl) {
	this.pnl = pnl;
}
	
	public int compareTo(DatePnl o) {
		if(pnl < o.pnl){
			return -1;
		}else if (pnl > o.pnl) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "DatePnl [date=" + date + ", pnl=" + pnl + "]";
	}
	
	public static void main(String[] args) {
		double[] originalPnl = {10d, 100d, 90d, 30d, 50d, 40d,60d,70d,80d,20d};
		System.out.println("original pnl");
		System.out.println(Arrays.toString(originalPnl));
		
		DatePnl[] datePnl = new DatePnl[originalPnl.length];
		for (int i = 0; i < datePnl.length; i++) {
			datePnl[i] = new DatePnl(i, originalPnl[i]);
		}
		System.out.println("ORIGINAL datepnl");
		System.out.println(Arrays.toString(datePnl));
		
		Arrays.sort(datePnl);
		
		System.out.println("After sorting datepnl");
		System.out.println(Arrays.toString(datePnl));
		
		System.out.println("after sorting original pnl");
		System.out.println(Arrays.toString(originalPnl));
		
	}
}
