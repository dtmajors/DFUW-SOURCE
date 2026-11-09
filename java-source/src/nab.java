/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class nab {
    public static String[] EXr;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void eTR() {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/no_collission_textures.txt");
        ArrayList<String> arrayList = lcn.emv();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(jrw2));
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                if (string.equals("")) continue;
                arrayList.add(string);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        if (arrayList.isEmpty()) {
            EXr = new String[]{""};
            return;
        }
        EXr = arrayList.toArray(new String[arrayList.size()]);
    }
}

