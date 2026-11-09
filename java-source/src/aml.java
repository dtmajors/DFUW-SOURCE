/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class aml {
    private dlp byq;
    private int bnM;
    private mhk byr;
    private int abO = -1;

    private aml() {
    }

    public aml(dlp dlp2, String string, mhk mhk2) {
        this.a(dlp2);
        this.setAttributeType(string);
        this.a(mhk2);
    }

    public int BV() {
        return this.bnM;
    }

    public void setAttributeType(String string) {
        this.bnM = ep.as((String)string);
        assert (this.bnM >= 0);
    }

    public dlp Gs() {
        return this.byq;
    }

    public void a(dlp dlp2) {
        this.byq = dlp2;
    }

    public mhk Gt() {
        return this.byr;
    }

    public void a(mhk mhk2) {
        this.byr = mhk2;
    }

    public boolean Gu() {
        return this.bnM == 9824;
    }

    public boolean Gv() {
        return this.byq == dlp.GlobalPlayerScope;
    }

    public boolean Gw() {
        return this.byq == dlp.CityPlayerScope;
    }

    public int lF() {
        return this.abO;
    }

    public void gO(int n) {
        this.abO = n;
    }
}

