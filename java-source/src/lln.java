/*
 * Decompiled with CFR.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

public class lln {
    public static void main(String[] stringArray) {
        if (stringArray.length == 2) {
            if (stringArray[0].equals("create")) {
                System.exit(new lln().AI(stringArray[1]));
            } else if (stringArray[0].equals("check")) {
                System.exit(new lln().AJ(stringArray[1]));
            }
        } else {
            System.out.println("Usage : java Checksum create [filename]\n        java Checksum check  [filename]");
        }
    }

    public int AI(String string) {
        try {
            byte[] byArray = this.AK(string);
            jrw jrw2 = new jrw(string + ".chk");
            FileOutputStream fileOutputStream = new FileOutputStream(jrw2);
            ((OutputStream)fileOutputStream).write(byArray);
            ((OutputStream)fileOutputStream).close();
            return 1;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public int AJ(String string) {
        int n = 0;
        try {
            byte[] byArray = this.AK(string);
            byte[] byArray2 = new byte[byArray.length];
            jrw jrw2 = new jrw(string + ".chk");
            FileInputStream fileInputStream = new FileInputStream(jrw2);
            ((InputStream)fileInputStream).read(byArray2);
            if (new String(byArray2).equals(new String(byArray))) {
                System.out.println("Same!");
                n = 1;
            } else {
                System.out.println("Different!");
                n = 2;
            }
            ((InputStream)fileInputStream).close();
            return n;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return n;
        }
    }

    public byte[] AK(String string) {
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
}

