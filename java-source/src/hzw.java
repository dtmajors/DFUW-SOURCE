/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class hzw
extends hzk {
    protected int lzl;
    protected int lzm;
    protected int lzn;
    protected int lzo;
    private ArrayList<lie> lzQ = null;

    public hzw(String string, String string2, int n, int n2, int n3, int n4) {
        super(string, string2);
        this.OQ(-1);
        this.a(hya.lmp, true);
        this.a(hya.lmt, false);
        this.lzl = n;
        this.lzm = n2;
        this.lzn = n3;
        this.lzo = n4;
    }

    public void a(lie lie2) {
        if (this.lzQ == null) {
            this.lzQ = new ArrayList();
        }
        this.lzQ.add(lie2);
    }

    protected void cBa() {
        super.cBa();
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
    }

    protected void cEf() {
        super.cEf();
        if (this.lzQ != null) {
            for (lie lie2 : this.lzQ) {
                lie2.stop();
            }
        }
    }
}

