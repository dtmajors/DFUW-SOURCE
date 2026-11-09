/*
 * Decompiled with CFR.
 */
public class eeo
extends eea
implements dxu {
    private int aqs = -1;
    private int cZn = tv.aVs.ordinal();
    private float inI = 0.0f;
    private String inJ = null;
    private boolean inK = false;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public tv bGl() {
        return tv.getValueByOrdinal(this.cZn);
    }

    public void a(tv tv2) {
        this.cZn = tv2 == null ? tv.aVs.ordinal() : tv2.ordinal();
    }

    public float bGm() {
        return this.inI;
    }

    public void iH(float f2) {
        this.inI = f2;
    }

    public String bGn() {
        return this.inJ;
    }

    public void jZ(String string) {
        this.inJ = string;
    }

    eeo() {
        super(12834);
    }
}

