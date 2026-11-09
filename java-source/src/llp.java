/*
 * Decompiled with CFR.
 */
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class llp {
    public static byte[] AK(String string) {
        int n;
        FileInputStream fileInputStream = new FileInputStream(string);
        byte[] byArray = new byte[1024];
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        do {
            if ((n = ((InputStream)fileInputStream).read(byArray)) <= 0) continue;
            messageDigest.update(byArray, 0, n);
        } while (n != -1);
        ((InputStream)fileInputStream).close();
        return messageDigest.digest();
    }

    public static String AL(String string) {
        byte[] byArray = llp.AK(string);
        String string2 = "";
        for (int i = 0; i < byArray.length; ++i) {
            string2 = string2 + Integer.toString((byArray[i] & 0xFF) + 256, 16).substring(1);
        }
        return string2;
    }

    public static void main(String[] stringArray) {
        try {
            System.out.println(llp.AL("apache-tomcat-5.5.17.exe"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

