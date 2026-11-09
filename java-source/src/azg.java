/*
 * Decompiled with CFR.
 */
public class azg {
    private ldv GUID = null;
    private String ID = null;
    private int Type = ayb.cvi.ordinal();
    private ljq Position = null;
    private float Radius = 0.0f;
    private ldv ade = null;
    private ldv[] aoY = null;
    private boolean cEc = false;
    private double cEd = 0.0;
    private double cEe = 0.0;
    private double cEf = 0.0;
    private double cEg = 0.0;
    private int cEh = 0;
    private ldv csa = null;
    private ljq csb = null;
    private int csc = 0;
    private int csd = 0;
    private int abO = -1;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public ayb abi() {
        return ayb.getValueByOrdinal(this.Type);
    }

    public void e(ayb ayb2) {
        this.Type = ayb2 == null ? this.Type : ayb2.ordinal();
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public ldv[] acS() {
        return this.aoY;
    }

    public void g(ldv[] ldvArray) {
        this.aoY = ldvArray;
    }

    public boolean acT() {
        return this.cEc;
    }

    public void cv(boolean bl) {
        this.cEc = bl;
    }

    public double acU() {
        return this.cEd;
    }

    public void ao(double d2) {
        this.cEd = d2;
    }

    public double acV() {
        return this.cEe;
    }

    public void ap(double d2) {
        this.cEe = d2;
    }

    public double acW() {
        return this.cEf;
    }

    public void aq(double d2) {
        this.cEf = d2;
    }

    public double acX() {
        return this.cEg;
    }

    public void ar(double d2) {
        this.cEg = d2;
    }

    public int acY() {
        return this.cEh;
    }

    public void ji(int n) {
        this.cEh = n;
    }

    public final ldv XA() {
        return this.csa;
    }

    public final void dq(ldv ldv2) {
        this.csa = ldv2;
    }

    public final ljq XB() {
        return this.csb;
    }

    public final void aF(ljq ljq2) {
        this.csb = ljq2;
    }

    public final int XC() {
        return this.csc;
    }

    public final void ir(int n) {
        this.csc = n;
    }

    public final int XD() {
        return this.csd;
    }

    public final void is(int n) {
        this.csd = n;
    }

    public final int lF() {
        return this.abO;
    }

    public final void gO(int n) {
        this.abO = n;
    }

    public boolean eW(ldv ldv2) {
        for (int i = 0; i < this.aoY.length; ++i) {
            if (!ldv.au(this.aoY[i], ldv2)) continue;
            return true;
        }
        return false;
    }
}

