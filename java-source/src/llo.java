/*
 * Decompiled with CFR.
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.Checksum;

public class llo {
    public static long a(Checksum checksum, jrw jrw2) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(jrw2));
            byte[] byArray = new byte[1024];
            int n = 0;
            while ((n = bufferedInputStream.read(byArray)) >= 0) {
                checksum.update(byArray, 0, n);
            }
            bufferedInputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return checksum.getValue();
    }

    public static void main(String[] stringArray) {
        if (stringArray.length != 1) {
            System.err.println("Usage: java ComputeCRC32 <file>");
            System.exit(1);
        }
    }
}

