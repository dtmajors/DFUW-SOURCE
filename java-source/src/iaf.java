/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class iaf {
    public static final int auF = 0;
    public static final int ATTRIBUTE = 1;
    public Integer lAY;
    public ArrayList<lil<Integer, Integer, Float>> lAZ = lcn.emv();
    public Float lBa;
    public ArrayList<String> lBb = lcn.emv();
    public ArrayList<lfs<Integer, Integer>> lBc = lcn.emv();
    public ArrayList<lfs<Integer, Float>> lBd = lcn.emv();

    public void J(int n, float f) {
        this.lAZ.add(new lil<Integer, Integer, Float>(0, n, Float.valueOf(f)));
    }

    public void K(int n, float f) {
        this.lAZ.add(new lil<Integer, Integer, Float>(1, n, Float.valueOf(f)));
    }

    public void di(int n, int n2) {
        this.lBc.add(new lfs<Integer, Integer>(n, n2));
    }

    public void L(int n, float f) {
        this.lBd.add(new lfs<Integer, Float>(n, Float.valueOf(f)));
    }

    public void oK(String string) {
        this.lBb.add(string);
    }

    public String cJW() {
        StringBuilder stringBuilder = new StringBuilder();
        hzy.a(stringBuilder, this.lAY);
        hzy.b(stringBuilder, this.lAZ);
        hzy.a(stringBuilder, this.lBa);
        hzy.e(stringBuilder, this.lBb);
        hzy.c(stringBuilder, this.lBc);
        hzy.d(stringBuilder, this.lBd);
        return stringBuilder.toString();
    }

    public static iaf oL(String string) {
        iaf iaf2 = new iaf();
        String[] stringArray = hzy.split(string);
        int n = 0;
        iaf2.lAY = hzy.ot(stringArray[++n]);
        iaf2.lAZ = hzy.oB(stringArray[++n]);
        iaf2.lBa = hzy.ou(stringArray[++n]);
        iaf2.lBb = hzy.oG(stringArray[++n]);
        iaf2.lBc = hzy.oE(stringArray[++n]);
        iaf2.lBd = hzy.oF(stringArray[++n]);
        return iaf2;
    }
}

