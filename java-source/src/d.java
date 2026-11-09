/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class d {
    private static final String bB = "dflauncher.conf";
    private static final boolean bC = false;

    public static void k() {
        try {
            int n2;
            String string = "cmd.exe /c \"C:\\Darkfall\\scripts\\commit-zones.bat\"";
            Process process = Runtime.getRuntime().exec("cmd.exe /c \"C:\\Darkfall\\scripts\\commit-zones.bat\"");
            InputStream inputStream = process.getInputStream();
            while ((n2 = inputStream.read()) != -1) {
                System.out.print((char)n2);
            }
            inputStream.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void a(String string, Map<String, btg> map, int n2, bss bss2) {
        Object object;
        jrw jrw2;
        if (!(string = string.toLowerCase()).endsWith("_empty")) {
            string = string + "_empty";
        }
        if (!(jrw2 = new jrw(lcw.qLb + "level/" + "empty/" + string + ".lvl")).exists()) {
            return;
        }
        ArrayList<bst> arrayList = lcn.emv();
        bst bst2 = new bst("empty/" + jrw2.getName(), n2);
        bst2.a(bss2);
        arrayList.add(bst2);
        btg btg2 = new btg();
        btg2.an(arrayList);
        btg2.gl(string);
        if (map.containsKey(string) && btg2.equals(object = map.get(string))) {
            return;
        }
        map.put(btg2.axz(), btg2);
        object = new jzd();
        ((jzd)object).V(map);
    }

    public static void b(String string, Map<String, btg> map, int n2, bss bss2) {
        Object object;
        btg btg2;
        List<bst> list;
        string = string.toLowerCase();
        jrw jrw2 = new jrw(lcw.qLb + "level/" + string + ".lvl");
        if (!jrw2.exists()) {
            return;
        }
        btg btg3 = map.get(string);
        if (btg3 == null) {
            btg3 = new btg();
        }
        if ((list = btg3.axy()) == null) {
            list = lcn.emv();
        }
        bst bst2 = new bst(jrw2.getName(), n2);
        bst2.a(bss2);
        list.remove(bst2);
        list.add(0, bst2);
        btg3.an(list);
        btg3.gl(string);
        map.put(btg3.axz(), btg3);
        if (string.contains("_dungeon") && (btg2 = map.get(object = string.substring(0, string.indexOf("_dungeon")))) != null) {
            List<bst> list2 = btg2.axy();
            list2.remove(bst2);
            list2.add(bst2);
            btg2.an(list2);
            map.put((String)object, btg2);
        }
        object = new jzd();
        ((jzd)object).V(map);
    }

    public static b l() {
        jrw jrw2 = new jrw(bB);
        if (!jrw2.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(bB);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            b b2 = (b)objectInputStream.readObject();
            objectInputStream.close();
            return b2;
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return null;
    }

    public static boolean a(String string, boolean bl) {
        string = string.toLowerCase();
        boolean bl2 = false;
        jrw jrw2 = null;
        jrw2 = bl ? new jrw(lcw.qLb + "level/" + "empty/" + string + "_empty.lvl") : new jrw(lcw.qLb + "level/" + string + ".lvl");
        return jrw2.exists();
    }

    public static void a(b b2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(bB);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(b2);
            objectOutputStream.flush();
            objectOutputStream.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

