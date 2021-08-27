package interview.serialization;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class PojoToBeUsedInSerialization implements Serializable, ObjectInputValidation {
	// public class PojoToBeUsedInSerialization implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4450438243211863487L;

	private String msg;

	public PojoToBeUsedInSerialization(String msg) {
		this.msg = msg;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("writeObject");
		oos.defaultWriteObject();
	}

	private Object writeReplace() throws ObjectStreamException {
		System.out.println("writeReplace");
		return this;
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		System.out.println("readObject");
		ois.registerValidation(this, 0);
		ois.defaultReadObject();
	}

	private Object readResolve() throws ObjectStreamException {
		System.out.println("readResolve");
		return this;
	}

	@Override
	public void validateObject() throws InvalidObjectException {
		System.out.println("validateObject");
	}

}
