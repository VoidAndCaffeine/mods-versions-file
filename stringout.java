import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * stringout
 */
public class stringout {
    private static String[][] sOut = new String[2][4];
    private static String filename = "mods.versions";

    public static void stringOut() throws IOException{
        sOut[0][0] = "1"; 
        sOut[0][1] = "mods.versions";
        sOut[0][2] = "000";
        sOut[0][3] = "https://raw.githubusercontent.com/VoidAndCaffeine/mods-versions-file/main/mods.versions"; 

        sOut[1][0] = "Sodium"; 
        sOut[1][1] = "sodium.jar";
        sOut[1][2] = "0";
        sOut[1][3] = "https://cdn.modrinth.com/data/AANobbMI/versions/vgceLbdH/sodium-fabric-mc1.20-0.4.10%2Bbuild.27.jar"; 

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