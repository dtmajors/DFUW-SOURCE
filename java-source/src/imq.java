/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class imq {
    public static final String mkj = "IconSize";
    public static final String mkk = "TextSize";
    public static final String mkl = "TextPosition";
    public static final String mkm = "ShowNames";
    public static final String mkn = "ShowTags";
    public static final String mko = "ShowColor";
    public static final String mkp = "ShowDurability";
    public static final String mkq = "ShowWeight";

    public static void a(hyn hyn2, imm imm2) {
        hyn2.a(mkj, hsu.ldg, Integer.valueOf(imm2.mjN.ordinal()));
        hyn2.a(mkk, hsu.ldg, Integer.valueOf(imm2.mjO.ordinal()));
        hyn2.a(mkl, hsu.ldg, Integer.valueOf(imm2.mjP.ordinal()));
        hyn2.a(mkm, hsu.ldg, Boolean.valueOf(imm2.mjQ));
        hyn2.a(mkn, hsu.ldg, Boolean.valueOf(imm2.mjR));
        hyn2.a(mko, hsu.ldg, Boolean.valueOf(imm2.mjS));
        hyn2.a(mkp, hsu.ldg, Boolean.valueOf(imm2.mjT));
        hyn2.a(mkq, hsu.ldg, Boolean.valueOf(imm2.mjU));
    }

    public static void b(hyn hyn2, imm imm2) {
        imm2.mjN = (imj)hyn2.a(mkj, (Enum)imj.mju);
        imm2.mjO = (iml)hyn2.a(mkk, (Enum)iml.mjG);
        imm2.mjP = (imk)hyn2.a(mkl, (Enum)imk.mjD);
        imm2.mjQ = hyn2.nk(mkm);
        imm2.mjR = hyn2.nk(mkn);
        imm2.mjS = hyn2.nk(mko);
        imm2.mjT = hyn2.nk(mkp);
        imm2.mjU = hyn2.nk(mkq);
    }

    public static void c(hyn hyn2, imm imm2) {
        hyn2.w(mkj, imm2.mjN.ordinal());
        hyn2.w(mkk, imm2.mjO.ordinal());
        hyn2.w(mkl, imm2.mjP.ordinal());
        hyn2.q(mkm, imm2.mjQ);
        hyn2.q(mkn, imm2.mjR);
        hyn2.q(mko, imm2.mjS);
        hyn2.q(mkp, imm2.mjT);
        hyn2.q(mkq, imm2.mjU);
    }
}

