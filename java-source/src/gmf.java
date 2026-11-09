/*
 * Decompiled with CFR.
 */
public class gmf {
    private ldv cIK = null;
    private String cIL = null;
    private ldv hhe = null;
    private String hhf = null;
    private float aEM = 0.0f;
    private int cIM = 0;
    private int jlw = -1;

    public ldv afM() {
        return this.cIK;
    }

    public void fF(ldv ldv2) {
        this.cIK = ldv2;
    }

    public String afN() {
        return this.cIL;
    }

    public void fd(String string) {
        this.cIL = string;
    }

    public ldv bCc() {
        return this.hhe;
    }

    public void ps(ldv ldv2) {
        this.hhe = ldv2;
    }

    public String bCd() {
        return this.hhf;
    }

    public void ld(String string) {
        this.hhf = string;
    }

    public float afP() {
        return this.aEM;
    }

    public void cq(float f) {
        this.aEM = f;
    }

    public int afO() {
        return this.cIM;
    }

    public void jG(int n) {
        this.cIM = n;
    }

    public dxl.c bVV() {
        return dxl.c.getValueByOrdinal(this.jlw);
    }

    public void b(dxl.c c2) {
        this.jlw = c2 == null ? this.jlw : c2.ordinal();
    }
}

