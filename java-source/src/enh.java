/*
 * Decompiled with CFR.
 */
public class enh
extends emr {
    private static final int ivq = 2;
    private static final int ivr = 4;
    private static final int ivs = 8;
    private static final int ivt = 16;
    private static final int ivu = 32;
    private static final int ivv = 64;
    private int ija = 0;
    private ldv isO = null;
    private ldv[] ivw = null;
    private ldv[] ivx = null;
    private ldv[] ivy = null;
    private ldv[] ivz = null;
    private ldv[] ivA = null;
    private ldv[] ivB = null;

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public ldv[] bJf() {
        return this.ivw;
    }

    public void t(ldv[] ldvArray) {
        this.ivw = ldvArray;
        this.ija = this.ivw != null && this.ivw.length > 0 ? (this.ija |= 2) : (this.ija &= 0xFFFFFFFD);
    }

    public boolean bJg() {
        return (this.ija & 2) == 2;
    }

    public ldv[] bJh() {
        return this.ivx;
    }

    public void u(ldv[] ldvArray) {
        this.ivx = ldvArray;
        this.ija = this.ivx != null && this.ivx.length > 0 ? (this.ija |= 4) : (this.ija &= 0xFFFFFFFB);
    }

    public boolean bJi() {
        return (this.ija & 4) == 4;
    }

    public ldv[] bJj() {
        return this.ivy;
    }

    public void v(ldv[] ldvArray) {
        this.ivy = ldvArray;
        this.ija = this.ivy != null && this.ivy.length > 0 ? (this.ija |= 8) : (this.ija &= 0xFFFFFFF7);
    }

    public boolean bJk() {
        return (this.ija & 8) == 8;
    }

    public ldv[] bJl() {
        return this.ivz;
    }

    public void w(ldv[] ldvArray) {
        this.ivz = ldvArray;
        this.ija = this.ivz != null && this.ivz.length > 0 ? (this.ija |= 0x10) : (this.ija &= 0xFFFFFFEF);
    }

    public boolean bJm() {
        return (this.ija & 0x10) == 16;
    }

    public ldv[] bJn() {
        return this.ivA;
    }

    public void x(ldv[] ldvArray) {
        this.ivA = ldvArray;
        this.ija = this.ivA != null && this.ivA.length > 0 ? (this.ija |= 0x20) : (this.ija &= 0xFFFFFFDF);
    }

    public boolean bJo() {
        return (this.ija & 0x20) == 32;
    }

    public ldv[] bJp() {
        return this.ivB;
    }

    public void y(ldv[] ldvArray) {
        this.ivB = ldvArray;
        this.ija = this.ivB != null && this.ivB.length > 0 ? (this.ija |= 0x40) : (this.ija &= 0xFFFFFFBF);
    }

    public boolean bJq() {
        return (this.ija & 0x40) == 64;
    }

    enh() {
        super(13906);
    }
}

