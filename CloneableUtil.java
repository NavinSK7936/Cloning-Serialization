import java.io.*;
import java.lang.*;
import java.awt.*;

public final class CloneableUtil {
    private static final File file = new File("CloneableUtil.ser");
    
    public static<T extends Serializable> T clone(T obj)  {
        T clonedObj = null;
        try {
            SerializableUtil.serialize(obj, CloneableUtil.file);
            clonedObj = SerializableUtil.deserialize(CloneableUtil.file);
        } catch(IOException | ClassNotFoundException exception) {
            exception.printStackTrace();}
        return clonedObj;
    }
}