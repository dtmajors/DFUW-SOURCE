/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class dph {
    private String ResourceName;
    private int ResourceType;
    private ej[] DR;
    private dph[] gMu;
    private int asi;
    private dpi gMv;
    private int gMw;
    private long dBq = 0L;

    private dph() {
    }

    public dph(int n, ej[] ejArray, int n2, dpi dpi2, int n3) {
        this.ResourceType = n;
        this.DR = ejArray;
        this.asi = n2;
        this.gMv = dpi2;
        this.gMw = n3;
    }

    public dph(dph dph2) {
        int n;
        this.ResourceName = dph2.ResourceName;
        this.ResourceType = dph2.ResourceType;
        this.asi = dph2.asi;
        this.gMv = dph2.gMv;
        this.gMw = dph2.gMw;
        this.dBq = dph2.dBq;
        if (dph2.DR != null) {
            this.DR = new ej[dph2.DR.length];
            for (n = 0; n < this.DR.length; ++n) {
                if (dph2.DR[n] == null) continue;
                this.DR[n] = dph2.DR[n].fm();
            }
        }
        if (dph2.gMu != null) {
            this.gMu = new dph[dph2.gMu.length];
            for (n = 0; n < this.gMu.length; ++n) {
                if (dph2.gMu[n] == null) continue;
                this.gMu[n] = dph2.gMu[n].brX();
            }
        }
    }

    public dph brX() {
        return new dph(this);
    }

    public dph(bqs bqs2, dpi dpi2, int n) {
        this.ResourceType = bqs2.az();
        this.asi = bqs2.vf();
        this.DR = new ej[bqs2.getAttributes().size()];
        int n2 = 0;
        for (ej ej2 : bqs2.getAttributes()) {
            this.DR[n2++] = ej2.fm();
        }
        this.gMv = dpi2;
        this.gMw = n;
        this.gMu = null;
    }

    public String pa() {
        if (this.ResourceName == null) {
            this.ResourceName = lea.enW().getName(this.ResourceType);
            if (this.ResourceName == null) {
                this.ResourceName = "" + this.ResourceType;
            }
        }
        return this.ResourceName;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    public dpi brY() {
        return this.gMv;
    }

    public void d(dpi dpi2) {
        this.gMv = dpi2;
    }

    public int brZ() {
        return this.gMw;
    }

    public void Bd(int n) {
        this.gMw = n;
    }

    public int az() {
        return this.ResourceType;
    }

    public ej[] arJ() {
        return this.DR;
    }

    public boolean auW() {
        lgw lgw2 = (lgw)lea.enW().acv(this.ResourceType);
        if (lgw2 == null) {
            return false;
        }
        return lgw2.auW();
    }

    public long auq() {
        return this.dBq;
    }

    public void N(long l2) {
        this.dBq = l2;
    }

    public dph[] bsa() {
        return this.gMu;
    }

    public void a(dph[] dphArray) {
        this.gMu = dphArray;
    }

    public boolean e(dph dph2) {
        if (this.ResourceName.compareTo(dph2.ResourceName) != 0) {
            return false;
        }
        if (this.gMw != dph2.gMw) {
            return false;
        }
        return this.asi == dph2.asi;
    }

    public String toString() {
        return "Vendor Item -- PersistentID: " + this.dBq + " Resource Name: '" + this.ResourceName + "' Quantity: " + this.asi + " Price: " + Float.toString((float)this.gMw / 10.0f) + " Location: " + (this.gMv == null ? "Unknown" : "[" + this.gMv.toString() + "]");
    }
}

