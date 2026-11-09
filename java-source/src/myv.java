/*
 * Decompiled with CFR.
 */
import java.io.FileFilter;
import java.util.ArrayList;

public class myv {
    private boolean EUK = false;
    private String EUL = "bkp-texture";

    public static void main(String[] stringArray) {
        String string = "";
        myv myv2 = new myv();
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].equals("-path")) {
                if (stringArray.length >= i && !stringArray[i + 1].equals("")) {
                    string = stringArray[i + 1];
                    System.out.println("Path [" + string + "] set.");
                    continue;
                }
                System.out.println("Usage: SFDataConsistancyChecker -path <Path to data>");
                System.exit(0);
                continue;
            }
            if (!stringArray[i].equals("-delete")) continue;
            myv2.Ar(true);
        }
        if (string != null && new jrw(string).exists()) {
            myv2.Ed(string);
            System.exit(0);
        } else {
            System.out.println("Invalid Path [" + string + "]!\nUsage: SFDataConsistancyChecker -path <Path to data>");
            System.exit(-1);
        }
    }

    private void Ed(String string) {
        String string2 = string + "texture/";
        String string3 = string + "texture/dds/";
        ArrayList<jrw> arrayList = lcn.emv();
        jry.a(new jrw(string2), null, arrayList, false);
        ArrayList<jrw> arrayList2 = lcn.emv();
        jry.a(new jrw(string3), (FileFilter)new jsl("dds"), arrayList2, false);
        ArrayList<jrw> arrayList3 = lcn.emv();
        ArrayList<jrw> arrayList4 = lcn.emv();
        lfn.b(0, this.getClass().getName(), "synchronizeTextures() : Number of bmp textures = " + arrayList.size());
        String string4 = null;
        String string5 = null;
        for (jrw jrw2 : arrayList) {
            string4 = jrw2.getName();
            string4 = this.Ee(string4);
            boolean bl = false;
            for (jrw jrw3 : arrayList2) {
                string5 = jrw3.getName();
                if (!string4.equals(string5 = this.Ee(string5))) continue;
                arrayList3.add(jrw2);
                bl = true;
            }
            if (!bl) {
                arrayList4.add(jrw2);
            }
            bl = false;
        }
        for (jrw jrw2 : arrayList3) {
            jrw jrw4;
            boolean bl = jrw2.renameTo(jrw4 = new jrw(jrw2.getParent() + "/" + this.EUL + "/" + jrw2.getName()));
            if (!bl) {
                lfn.b(5, this.getClass().getName(), "synchronizeTextures() : Error Renaming SFFile [" + jrw2 + "] to [" + jrw4 + "]");
            }
            lfn.b(0, "", "SFFile [" + jrw2 + "] marked for Deleting!");
        }
        lfn.b(0, this.getClass().getName(), "synchronizeTextures() : Files Marked for Deletion = " + arrayList3.size() + ", Files missing DDS = " + arrayList4.size());
        System.out.println("### MISSING DDS -BEGIN- ###");
        for (jrw jrw2 : arrayList4) {
            System.out.println(jrw2.getName());
        }
        System.out.println("### MISSING DDS -END- ###");
        lfn.b(0, this.getClass().getName(), "synchronizeTextures() : DeleteList Size = " + arrayList3.size());
    }

    private String Ee(String string) {
        String string2 = string;
        int n2 = string2.lastIndexOf("/");
        if (n2 != -1) {
            string2 = string2.substring(n2);
        }
        if ((n2 = string2.lastIndexOf(".")) != -1) {
            string2 = string2.substring(0, n2);
        }
        return string2;
    }

    public boolean eTj() {
        return this.EUK;
    }

    public void Ar(boolean bl) {
        this.EUK = bl;
    }
}

