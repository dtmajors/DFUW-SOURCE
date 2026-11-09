/*
 * Decompiled with CFR.
 */
public class eth
extends euk {
    private ldv aDk = null;
    private int cMm = -1;
    private ldv cMn = null;
    private double cHV = 0.0;
    private ldv ade = null;
    private String add = null;
    private ldv aEr = null;
    private String aEp = null;
    private String aEq = null;
    private int aEi = 0;
    private String[] cMo = null;
    private ljq[] cMp = null;
    private int[] cMq = null;
    private int iCf = 0;
    private int aEv = 0;
    private int aEw = 0;
    private int aEx = 0;

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    public ldv iG() {
        return this.ade;
    }

    public String iV() {
        return this.add;
    }

    public void v(ldv ldv2, String string) {
        assert (ldv2 != null);
        assert (string != null);
        assert (!string.isEmpty());
        this.ade = ldv2;
        this.add = string;
    }

    public int aat() {
        return this.cMm;
    }

    public void jt(int n) {
        this.cMm = n;
    }

    public ldv aie() {
        return this.cMn;
    }

    public void fM(ldv ldv2) {
        this.cMn = ldv2;
    }

    public ldv adB() {
        return this.aEr;
    }

    public String adC() {
        return this.aEp;
    }

    public String adD() {
        return this.aEq;
    }

    public void e(ldv ldv2, String string, String string2) {
        assert (ldv2 != null);
        assert (string != null);
        assert (string2 != null);
        assert (!string.isEmpty());
        assert (!string2.isEmpty());
        this.aEr = ldv2;
        this.aEp = string;
        this.aEq = string2;
    }

    public double aeO() {
        return this.cHV;
    }

    public void au(double d2) {
        this.cHV = d2;
    }

    public int adA() {
        return this.aEi;
    }

    public void jm(int n) {
        this.aEi = n;
    }

    public String[] aii() {
        return this.cMo;
    }

    public ljq[] aij() {
        return this.cMp;
    }

    public int[] aik() {
        return this.cMq;
    }

    public void a(String[] stringArray, ljq[] ljqArray, int[] nArray) {
        assert (stringArray != null);
        assert (ljqArray != null);
        assert (nArray != null);
        assert (stringArray.length == ljqArray.length);
        assert (ljqArray.length == nArray.length);
        this.cMo = stringArray;
        this.cMp = ljqArray;
        this.cMq = nArray;
    }

    public int bLu() {
        return this.iCf;
    }

    public void EZ(int n) {
        this.iCf = n;
    }

    public int aif() {
        return this.aEv;
    }

    public void jK(int n) {
        this.aEv = n;
    }

    public int ail() {
        return this.aEw;
    }

    public void Fa(int n) {
        this.aEw = n;
    }

    public int Dl() {
        return this.aEx;
    }

    public void jo(int n) {
        this.aEx = n;
    }

    public eth() {
        super(19987);
    }
}

