import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * stringout
 */
public class stringout {
    private static String[][] sOut = new String[1][4];
    private static String filename = "mods.versions";

    public static void stringOut() throws IOException{
        sOut[0][0] = "test_mod_name"; 
        sOut[0][1] = "1.0.0"; 
        sOut[0][2] = "https://testmodurl.broken"; 
        sOut[0][3] = "reserved for hash if i ever get that working"; 

        saveStringFile();
    }

    public static void saveStringFile() throws IOException {
        FileOutputStream fs = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fs);
        out.writeObject(sOut);
        out.close();
    }

    public static void main(String[] args) {
        try {
            stringOut();
        } catch (Exception e) {
            System.out.println("there was an exception");
        }
    }
}