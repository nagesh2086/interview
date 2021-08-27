package singleton;

public class Singleton {
	private volatile static Singleton instance = null;

/*	public Singleton() {
		super();
	}
	
	public Singleton(Object ...objectsobj) {
		super();
	}*/
	
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
