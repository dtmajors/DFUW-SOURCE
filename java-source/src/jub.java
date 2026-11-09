/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class jub {
    private final int oRB = 227400;
    private List<String> oRC = lcn.emv();
    private List<String> oRD = lcn.emv();
    private Set<String> oRE = lcn.emx();

    public jub() {
        this.dTo();
        this.dTn();
    }

    public void dTn() {
        String string = lcw.qLb + "xml-files/gamelogicinfo/feats/" + "steam_feats.vdf";
        String string2 = lcw.qLb + "xml-files/gamelogicinfo/feats/" + "steam_feats.zip";
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add(string);
        String string3 = "X:/DFArt/2D Art/3. Icons/Steam Achievements/";
        for (String string4 : this.oRE) {
            String string5 = "X:/DFArt/2D Art/3. Icons/Steam Achievements/" + string4;
            arrayList.add(string5);
        }
        this.w(string2, arrayList);
    }

    public void w(String string, List<String> list) {
        try {
            byte[] byArray = new byte[1024];
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            for (String string2 : list) {
                int n;
                lfn.b(0, "SFFeatsXMLToSteamFormat", "generateZipFile() Adding: " + string2);
                FileInputStream fileInputStream = new FileInputStream(string2);
                String string3 = new File(string2).getName();
                if (string3.toLowerCase().endsWith(".jpg")) {
                    String string4 = string3.replace(".jpg", "");
                    String string5 = this.tZ(string4);
                    string3 = string5 + ".jpg";
                    string3 = "icons/" + string3;
                }
                zipOutputStream.putNextEntry(new ZipEntry(string3));
                while ((n = fileInputStream.read(byArray)) > 0) {
                    zipOutputStream.write(byArray, 0, n);
                }
                zipOutputStream.closeEntry();
                fileInputStream.close();
            }
            zipOutputStream.close();
        }
        catch (IOException iOException) {
            lfn.b(5, "SFFeatsXMLToSteamFormat", "generateZipFile() IOException: " + iOException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     */
    public void dTo() {
        Object object3;
        Object object22;
        this.oRC.clear();
        this.oRD.clear();
        this.oRE.clear();
        int n = 2;
        int n2 = 0;
        int n3 = 1;
        lfn.b(5, "SFFeatsXMLToSteamFormat", "generateSteamFile() TotalNumFeats: " + lea.eps().aOa().values().size());
        cgr cgr2 = lea.eps().hm("pe_kill_monster_one");
        assert (cgr2 != null);
        lfn.b(5, "SFFeatsXMLToSteamFormat", "generateSteamFile() STeamAchievement: " + cgr2.eyW);
        int n4 = 0;
        for (Object object22 : lea.eps().aOa().values()) {
            if (!((cgr)object22).eyW) continue;
            ++n4;
        }
        lfn.b(5, "SFFeatsXMLToSteamFormat", "generateSteamFile() Feats with steamachievements: " + n4);
        for (Object object22 : lea.eps().aOa().values()) {
            if (!((cgr)object22).eyW) continue;
            object3 = new StringBuilder();
            StringBuilder stringBuilder = new StringBuilder();
            if (((cgr)object22).eyU.aFv > 1.0f) {
                this.a((StringBuilder)object3, (cgr)object22, n);
                ++n;
            }
            this.a(stringBuilder, n3, n2, (cgr)object22);
            ++n2;
            this.oRC.add(((StringBuilder)object3).toString());
            this.oRD.add(stringBuilder.toString());
        }
        lfn.b(5, "SFFeatsXMLToSteamFormat", "generateSteamFile() NumStats: " + this.oRC.size() + " NumAchivements:" + this.oRD.size());
        StringBuilder stringBuilder = new StringBuilder();
        this.m(stringBuilder);
        this.e(stringBuilder, n3);
        for (Object object3 : this.oRD) {
            stringBuilder.append((String)object3);
        }
        this.n(stringBuilder);
        for (Object object3 : this.oRC) {
            stringBuilder.append((String)object3);
        }
        this.o(stringBuilder);
        this.j(stringBuilder);
        object22 = lcw.qLb + "xml-files/gamelogicinfo/feats/" + "steam_feats.vdf";
        object3 = null;
        try {
            object3 = new BufferedWriter(new FileWriter((String)object22));
            ((Writer)object3).write(stringBuilder.toString());
        }
        catch (IOException iOException) {
            lfn.b(5, "SFFeatsXMLToSteamFormat", "generateSteamFile(): " + iOException);
            iOException.printStackTrace();
            assert (false);
        }
        finally {
            block20: {
                try {
                    if (object3 != null) {
                        ((BufferedWriter)object3).close();
                    }
                }
                catch (IOException iOException) {
                    if ($assertionsDisabled) break block20;
                    throw new AssertionError();
                }
            }
        }
    }

    private void j(StringBuilder stringBuilder) {
        int n = 0;
        char c2 = '{';
        char c3 = '}';
        for (int i2 = 0; i2 < stringBuilder.length(); ++i2) {
            int n2;
            assert (n >= 0);
            if (stringBuilder.charAt(i2) == c2) {
                for (n2 = 0; n2 < n; ++n2) {
                    stringBuilder.insert(i2, '\t');
                }
                i2 += n;
                ++n;
                continue;
            }
            if (stringBuilder.charAt(i2) == c3) {
                --n;
                for (n2 = 0; n2 < n; ++n2) {
                    stringBuilder.insert(i2, '\t');
                }
                i2 += n;
                continue;
            }
            if (i2 <= 0 || stringBuilder.charAt(i2 - 1) != '\n') continue;
            for (n2 = 0; n2 < n; ++n2) {
                stringBuilder.insert(i2, '\t');
            }
            i2 += n;
        }
    }

    public static String c(byte[] byArray) {
        String string = "";
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            string = string + Integer.toString((byArray[i2] & 0xFF) + 256, 16).substring(1);
        }
        return string;
    }

    public String tZ(String string) {
        if (string == null) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            assert (false);
            return null;
        }
        try {
            byte[] byArray = messageDigest.digest(string.getBytes("UTF-8"));
            return jub.c(byArray);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            assert (false);
            return null;
        }
    }

    private String K(String string, boolean bl) {
        return this.tZ(this.L(string, bl));
    }

    private String L(String string, boolean bl) {
        if (bl) {
            string = string + "_inactive";
        }
        return string;
    }

    private void c(StringBuilder stringBuilder, String string) {
        stringBuilder.append('\"');
        stringBuilder.append(string);
        stringBuilder.append('\"');
    }

    private void c(StringBuilder stringBuilder, String string, String string2) {
        this.c(stringBuilder, string);
        stringBuilder.append("\t");
        this.c(stringBuilder, string2);
        stringBuilder.append("\n");
    }

    private void k(StringBuilder stringBuilder) {
        stringBuilder.append("{\n");
    }

    private void l(StringBuilder stringBuilder) {
        stringBuilder.append("}\n");
    }

    private void d(StringBuilder stringBuilder, int n) {
        this.c(stringBuilder, Integer.toString(n));
        stringBuilder.append("\n");
    }

    private void a(StringBuilder stringBuilder, cgr cgr2, int n) {
        String string = cgr2.aOE();
        this.d(stringBuilder, n);
        this.k(stringBuilder);
        this.c(stringBuilder, "type", "INT");
        this.c(stringBuilder, "name", string);
        this.c(stringBuilder, "display");
        stringBuilder.append("\n");
        this.k(stringBuilder);
        this.c(stringBuilder, "name", cgr2.aOD());
        this.l(stringBuilder);
        this.c(stringBuilder, "maxchange", Integer.toString((int)cgr2.eyU.aFv));
        this.c(stringBuilder, "aggregated", "1");
        this.c(stringBuilder, "min", "0");
        this.c(stringBuilder, "max", Integer.toString((int)cgr2.eyU.aFv));
        this.c(stringBuilder, "default", "0");
        this.c(stringBuilder, "permission", "2");
        this.l(stringBuilder);
    }

    private void a(StringBuilder stringBuilder, int n, int n2, cgr cgr2) {
        this.d(stringBuilder, n2);
        this.k(stringBuilder);
        this.c(stringBuilder, "name", cgr2.aOF());
        this.c(stringBuilder, "display");
        stringBuilder.append("\n");
        this.k(stringBuilder);
        this.b(stringBuilder, n, n2, cgr2);
        this.c(stringBuilder, "hidden", "0");
        this.c(stringBuilder, "icon", this.K(cgr2.eyX, false) + ".jpg");
        this.oRE.add(this.L(cgr2.eyX, false) + ".jpg");
        this.c(stringBuilder, "icon_gray", this.K(cgr2.eyX, true) + ".jpg");
        this.oRE.add(this.L(cgr2.eyX, true) + ".jpg");
        this.l(stringBuilder);
        this.c(stringBuilder, "permission", "2");
        if ((int)cgr2.eyU.aFv > 1) {
            this.c(stringBuilder, "progress");
            stringBuilder.append("\n");
            this.k(stringBuilder);
            this.c(stringBuilder, "min_val", "0");
            this.c(stringBuilder, "max_val", Integer.toString((int)cgr2.eyU.aFv));
            this.c(stringBuilder, "value");
            stringBuilder.append("\n");
            this.k(stringBuilder);
            this.c(stringBuilder, "operation", "statvalue");
            this.c(stringBuilder, "operand1", cgr2.aOE());
            this.l(stringBuilder);
            this.l(stringBuilder);
        }
        this.l(stringBuilder);
    }

    private void b(StringBuilder stringBuilder, int n, int n2, cgr cgr2) {
        String string = cgr2.Name + "_" + n + "_" + n2;
        string = string.replace(" ", "_").toUpperCase();
        String string2 = string + "_NAME";
        String string3 = string + "_DESC";
        this.c(stringBuilder, "name");
        stringBuilder.append("\n");
        this.k(stringBuilder);
        this.c(stringBuilder, "english", cgr2.getDisplayName());
        this.c(stringBuilder, "token", string2);
        this.l(stringBuilder);
        this.c(stringBuilder, "desc");
        stringBuilder.append("\n");
        this.k(stringBuilder);
        this.c(stringBuilder, "english", cgr2.getDescription());
        this.c(stringBuilder, "token", string3);
        this.l(stringBuilder);
    }

    private void m(StringBuilder stringBuilder) {
        stringBuilder.append('\"');
        stringBuilder.append(227400);
        stringBuilder.append('\"');
        stringBuilder.append("\n");
        stringBuilder.append("{");
        stringBuilder.append("\n");
        stringBuilder.append("\"stats\"");
        stringBuilder.append("\n");
        stringBuilder.append("{\n");
    }

    private void e(StringBuilder stringBuilder, int n) {
        this.d(stringBuilder, n);
        this.k(stringBuilder);
        this.c(stringBuilder, "bits");
        stringBuilder.append("\n");
        this.k(stringBuilder);
    }

    private void n(StringBuilder stringBuilder) {
        this.l(stringBuilder);
        this.c(stringBuilder, "type", "ACHIEVEMENTS");
        this.l(stringBuilder);
    }

    private void o(StringBuilder stringBuilder) {
        stringBuilder.append("}");
        stringBuilder.append("\n");
        stringBuilder.append("\"version\"\t\"8\"");
        stringBuilder.append("\n");
        stringBuilder.append("}");
    }
}

