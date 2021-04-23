import java.io.*;
import java.lang.*;
import java.awt.*;

public final class SerializableUtil {

	public static<T extends Serializable> void serialize(T obj, File file) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(obj);
		fos.close();
	}

    @SuppressWarnings("unchecked")
	public static<T extends Serializable> T deserialize(File file) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		T obj = (T) ois.readObject();
		ois.close();

		return obj;
	}
}