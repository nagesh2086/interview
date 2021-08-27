package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
		System.out.println("Hashcode of Object 1 - " + object1.hashCode());
		System.out.println("Hashcode of Object 2 - " + object2.hashCode());
		Singleton object3 = null;
		Constructor<Singleton> declaredConstructor;
		try {
			declaredConstructor = Singleton.class.getDeclaredConstructor(Singleton.class);
			Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();
			declaredConstructors[0].setAccessible(true);
			declaredConstructor.setAccessible(true);
			object3 = (Singleton) declaredConstructors[0].newInstance(new Object());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("Hashcode of Object 3 - " + object3.hashCode());
	}
}