/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class iaa {
    int lzU;
    int lzV;
    int quantity;
    ArrayList<lil<Integer, Float, Float>> lzW = lcn.emv();
    Float lzX;
    Integer lzY;
    Float lzZ;
    lil<Float, Float, Boolean> lAa;
    lil<Float, Float, Boolean> lAb;
    lil<Float, Float, Boolean> lAc;
    lil<Float, Float, Boolean> lAd;
    lil<Float, Float, Boolean> lAe;
    lil<Float, Float, Boolean> lAf;
    lil<Float, Float, Boolean> lAg;
    int lAh;
    String lAi;
    ljq lAj;
    lil<Float, Float, Boolean> lAk;
    Float lAl;
    Float lAm;
    Float lAn;
    Float lAo;
    Float lAp;
    lil<Float, Float, Boolean> lAq;
    Float lAr;
    Float lAs;
    Float lAt;
    Float lAu;
    Float lAv;
    String lAw;
    Boolean lAx;
    Integer lAy;
    Float lAz;
    String lAA;
    Integer lAB;
    Float lAC;
    String lAD;
    String lAE;
    Boolean lAF;
    ljq lAG;
    String lAH;
    int primaryDye;
    int secondaryDye;
    String lAI;
    String lAJ;
    String lAK;
    String lAL;
    String lAM;

    public String cJW() {
        StringBuilder stringBuilder = new StringBuilder();
        hzy.a(stringBuilder, this.lzU);
        hzy.a(stringBuilder, this.lzV);
        hzy.a(stringBuilder, this.quantity);
        hzy.a(stringBuilder, this.lzW);
        hzy.a(stringBuilder, this.lzX);
        hzy.a(stringBuilder, this.lzY);
        hzy.a(stringBuilder, this.lzZ);
        hzy.c(stringBuilder, this.lAa);
        hzy.c(stringBuilder, this.lAb);
        hzy.c(stringBuilder, this.lAc);
        hzy.c(stringBuilder, this.lAd);
        hzy.c(stringBuilder, this.lAe);
        hzy.c(stringBuilder, this.lAf);
        hzy.a(stringBuilder, this.lAh);
        hzy.a(stringBuilder, this.lAi);
        hzy.a(stringBuilder, this.lAj);
        hzy.c(stringBuilder, this.lAk);
        hzy.a(stringBuilder, this.lAl);
        hzy.a(stringBuilder, this.lAm);
        hzy.a(stringBuilder, this.lAn);
        hzy.a(stringBuilder, this.lAo);
        hzy.a(stringBuilder, this.lAp);
        hzy.c(stringBuilder, this.lAq);
        hzy.a(stringBuilder, this.lAr);
        hzy.a(stringBuilder, this.lAt);
        hzy.a(stringBuilder, this.lAs);
        hzy.a(stringBuilder, this.lAu);
        hzy.a(stringBuilder, this.lAv);
        hzy.a(stringBuilder, this.lAw);
        hzy.a(stringBuilder, this.lAx);
        hzy.a(stringBuilder, this.lAy);
        hzy.a(stringBuilder, this.lAz);
        hzy.a(stringBuilder, this.lAA);
        hzy.a(stringBuilder, this.lAB);
        hzy.a(stringBuilder, this.lAC);
        hzy.a(stringBuilder, this.lAD);
        hzy.a(stringBuilder, this.lAE);
        hzy.a(stringBuilder, this.lAF);
        hzy.a(stringBuilder, this.lAG);
        hzy.a(stringBuilder, this.lAH);
        hzy.a(stringBuilder, this.primaryDye);
        hzy.a(stringBuilder, this.secondaryDye);
        hzy.c(stringBuilder, this.lAg);
        hzy.a(stringBuilder, this.lAI);
        hzy.a(stringBuilder, this.lAJ);
        hzy.a(stringBuilder, this.lAK);
        hzy.a(stringBuilder, this.lAL);
        return stringBuilder.toString();
    }

    public static iaa oI(String string) {
        iaa iaa2 = new iaa();
        if (string == null || string.isEmpty() || string.equalsIgnoreCase("null")) {
            return iaa2;
        }
        String[] stringArray = hzy.split(string);
        if (stringArray.length < 42) {
            return iaa2;
        }
        int n = 0;
        iaa2.lzU = hzy.ot(stringArray[++n]);
        iaa2.lzV = hzy.ot(stringArray[++n]);
        iaa2.quantity = hzy.ot(stringArray[++n]);
        iaa2.lzW = hzy.oA(stringArray[++n]);
        iaa2.lzX = hzy.ou(stringArray[++n]);
        iaa2.lzY = hzy.ot(stringArray[++n]);
        iaa2.lzZ = hzy.ou(stringArray[++n]);
        iaa2.lAa = hzy.oy(stringArray[++n]);
        iaa2.lAb = hzy.oy(stringArray[++n]);
        iaa2.lAc = hzy.oy(stringArray[++n]);
        iaa2.lAd = hzy.oy(stringArray[++n]);
        iaa2.lAe = hzy.oy(stringArray[++n]);
        iaa2.lAf = hzy.oy(stringArray[++n]);
        iaa2.lAh = hzy.ot(stringArray[++n]);
        iaa2.lAi = hzy.ow(stringArray[++n]);
        iaa2.lAj = hzy.oH(stringArray[++n]);
        iaa2.lAk = hzy.oy(stringArray[++n]);
        iaa2.lAl = hzy.ou(stringArray[++n]);
        iaa2.lAm = hzy.ou(stringArray[++n]);
        iaa2.lAn = hzy.ou(stringArray[++n]);
        iaa2.lAo = hzy.ou(stringArray[++n]);
        iaa2.lAp = hzy.ou(stringArray[++n]);
        iaa2.lAq = hzy.oy(stringArray[++n]);
        iaa2.lAr = hzy.ou(stringArray[++n]);
        iaa2.lAt = hzy.ou(stringArray[++n]);
        iaa2.lAu = hzy.ou(stringArray[++n]);
        iaa2.lAv = hzy.ou(stringArray[++n]);
        iaa2.lAs = hzy.ou(stringArray[++n]);
        iaa2.lAw = hzy.ow(stringArray[++n]);
        iaa2.lAx = hzy.ov(stringArray[++n]);
        iaa2.lAy = hzy.ot(stringArray[++n]);
        iaa2.lAz = hzy.ou(stringArray[++n]);
        iaa2.lAA = hzy.ow(stringArray[++n]);
        iaa2.lAB = hzy.ot(stringArray[++n]);
        iaa2.lAC = hzy.ou(stringArray[++n]);
        iaa2.lAD = hzy.ow(stringArray[++n]);
        iaa2.lAE = hzy.ow(stringArray[++n]);
        iaa2.lAF = hzy.ov(stringArray[++n]);
        iaa2.lAG = hzy.oH(stringArray[++n]);
        iaa2.lAH = hzy.ow(stringArray[++n]);
        iaa2.primaryDye = hzy.ot(stringArray[++n]);
        iaa2.secondaryDye = hzy.ot(stringArray[++n]);
        iaa2.lAg = hzy.oy(stringArray[++n]);
        iaa2.lAI = hzy.ow(stringArray[++n]);
        iaa2.lAJ = hzy.ow(stringArray[++n]);
        iaa2.lAK = hzy.ow(stringArray[++n]);
        iaa2.lAL = hzy.ow(stringArray[++n]);
        return iaa2;
    }
}

