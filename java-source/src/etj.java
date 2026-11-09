/*
 * Decompiled with CFR.
 */
public class etj
extends euk
implements dxu {
    private int aqs = -1;
    private int iCg = 0;
    private ldv iCh = null;
    private ldv iwl = null;
    private String iCi = null;
    private int cMm = -1;
    private ldv iCj = null;
    private String iCk = null;
    private String iCl = null;
    private double iCm = 0.0;
    private ldv[] iCn = null;
    private String[] iCo = null;
    private ljq[] iCp = null;
    private int[] iCq = null;

    public etj() {
        super(19984);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int bLv() {
        return this.iCg;
    }

    public void Fb(int n) {
        this.iCg = n;
    }

    public ldv bLw() {
        return this.iCh;
    }

    public void pn(ldv ldv2) {
        this.iCh = ldv2;
    }

    public ldv bKb() {
        return this.iwl;
    }

    public String bLx() {
        return this.iCi;
    }

    public void w(ldv ldv2, String string) {
        assert (ldv2 != null);
        assert (string != null);
        assert (!string.isEmpty());
        this.iwl = ldv2;
        this.iCi = string;
    }

    public int aid() {
        return this.cMm;
    }

    public void Fc(int n) {
        this.cMm = n;
    }

    public ldv bLy() {
        return this.iCj;
    }

    public String bLz() {
        return this.iCk;
    }

    public String bLA() {
        return this.iCl;
    }

    public void i(ldv ldv2, String string, String string2) {
        assert (ldv2 != null);
        assert (string != null);
        assert (string2 != null);
        assert (!string.isEmpty());
        assert (!string2.isEmpty());
        this.iCj = ldv2;
        this.iCk = string;
        this.iCl = string2;
    }

    public double bLB() {
        return this.iCm;
    }

    public void cl(double d2) {
        this.iCm = d2;
    }

    public ldv[] bLC() {
        return this.iCn;
    }

    public String[] bLD() {
        return this.iCo;
    }

    public ljq[] bLE() {
        return this.iCp;
    }

    public int[] bLF() {
        return this.iCq;
    }

    public void a(ldv[] ldvArray, String[] stringArray, ljq[] ljqArray, int[] nArray) {
        assert (ldvArray != null);
        assert (stringArray != null);
        assert (ljqArray != null);
        assert (nArray != null);
        assert (ldvArray.length == stringArray.length);
        assert (stringArray.length == ljqArray.length);
        assert (ljqArray.length == nArray.length);
        this.iCn = ldvArray;
        this.iCo = stringArray;
        this.iCp = ljqArray;
        this.iCq = nArray;
    }

    public boolean bLG() {
        return this.iCn.length > 0;
    }
}

