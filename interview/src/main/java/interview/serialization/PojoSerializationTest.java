package interview.serialization;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PojoSerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PojoToBeUsedInSerialization ptbuis = new PojoToBeUsedInSerialization("asdfasdfasdfasdfetrwehbgfgbythn");
		deserialize(serialize(ptbuis));
	}

	private static byte[] serialize(PojoToBeUsedInSerialization ptbuis) throws IOException {
		System.out.println("src obj hashcode: " + ptbuis.hashCode());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pojo.txt"));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(ptbuis);
		oos.flush();
		oos.close();
		return baos.toByteArray();
	}

	private static void deserialize(byte[] buf) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pojo.txt"));
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		//ObjectInputStream ois = new ObjectInputStream(bais);
		PojoToBeUsedInSerialization pojo = (PojoToBeUsedInSerialization) ois.readObject();
		System.out.println("dest obj hashcode: " + pojo.hashCode());
	}

}
