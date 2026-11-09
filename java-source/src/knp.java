/*
 * Decompiled with CFR.
 */
public class knp
extends knt {
    public static final int pQy = 1;
    public static final int pQz = 2;
    public static final int goz = 4;
    public static final int iTh = 8;
    public static final int iWz = 16;
    public static final int pQA = 32;
    public static final int pQB = 64;
    public int Type;
    public int pQC;
    public int pQD;
    public int pQE;
    public int pQF;
    public String fFC;
    public boolean lbd;

    knp() {
        this.Jv(263);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{SF2DCursorRequest: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("Type=");
        stringBuilder.append(knp.getTypeName(this.Type));
        stringBuilder.append(",");
        stringBuilder.append("TextureName=");
        stringBuilder.append(this.fFC);
        stringBuilder.append(",");
        stringBuilder.append("GDIEnable=");
        stringBuilder.append(this.lbd);
        stringBuilder.append(",");
        stringBuilder.append("XPos=");
        stringBuilder.append(this.pQE);
        stringBuilder.append(",");
        stringBuilder.append("YPos=");
        stringBuilder.append(this.pQF);
        stringBuilder.append(",");
        stringBuilder.append("XHotSpot=");
        stringBuilder.append(this.pQC);
        stringBuilder.append(",");
        stringBuilder.append("YHotSpot=");
        stringBuilder.append(this.pQD);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String getTypeName(int n) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        n = knp.a(stringBuilder, n, 1, "NewCursor");
        n = knp.a(stringBuilder, n, 2, "ModifyHotSpot");
        n = knp.a(stringBuilder, n, 4, "ModifyPosition");
        n = knp.a(stringBuilder, n, 8, "ModifyTexture");
        n = knp.a(stringBuilder, n, 16, "ModifyVisible");
        if ((n = knp.a(stringBuilder, n, 32, "ModifyGDIEnable")) != 0) {
            assert (false) : n;
            stringBuilder.append("+" + n);
        }
        return stringBuilder.toString();
    }
}

