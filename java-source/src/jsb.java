/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class jsb {
    public static String ty(String string) {
        String string2 = jry.tp(string);
        if (jry.dRX()) {
            return jsb.tA(string2);
        }
        return jsb.tB(lcw.qLb + "/" + string2);
    }

    public static String tz(String string) {
        String string2 = jry.tp(string);
        try {
            if (jry.dRX()) {
                return jsb.tA(string2);
            }
            return jsb.tB(lcw.qLb + "/" + string2);
        }
        catch (bi bi2) {
            lfn.b(5, "SFQuadTreeLoader", "loadSingleQuadTreeNoThrow() : Invalid Argument Exception Encountered!!!");
            bi2.printStackTrace();
        }
        catch (bh bh2) {
            lfn.b(5, "SFQuadTreeLoader", "loadSingleQuadTreeNoThrow() : File-Not-Found Exception Encountered!!!");
            bh2.printStackTrace();
        }
        return null;
    }

    private static String tA(String string) {
        if (!string.endsWith(".sfqt")) {
            throw new bi("Incorrect file-type to parse quad-tree data from!");
        }
        byte[] byArray = loi.exd().readFile(string);
        if (byArray == null) {
            throw new bh(string);
        }
        ByteArrayInputStream byteArrayInputStream = null;
        BufferedReader bufferedReader = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(byArray);
            bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
            String string2 = bufferedReader.readLine();
            return string2;
        }
        catch (IOException iOException) {
            throw new bi("Java IO Exception Encountered!!!", iOException);
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
                bufferedReader = null;
            }
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                }
                catch (IOException iOException) {}
                byteArrayInputStream = null;
            }
        }
    }

    private static String tB(String string) {
        if (!string.endsWith(".sfqt")) {
            throw new bi("Incorrect file-type to parse quad-tree data from!");
        }
        jrw jrw2 = new jrw(string);
        if (!jrw2.exists()) {
            throw new bh(string);
        }
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(jrw2);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String string2 = bufferedReader.readLine();
            return string2;
        }
        catch (IOException iOException) {
            throw new bi("Java IO Exception Encountered!!!", iOException);
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
                bufferedReader = null;
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                }
                catch (IOException iOException) {}
                fileInputStream = null;
            }
        }
    }
}

