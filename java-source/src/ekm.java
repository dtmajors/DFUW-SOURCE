/*
 * Decompiled with CFR.
 */
public class ekm
extends emr {
    private static final int isU = 1;
    private static final int isV = 2;
    private static final int isW = 4;
    private static final int isX = 8;
    private static final int isY = 16;
    private static final int isZ = 32;
    private static final int ita = 64;
    private static final int itb = 128;
    private int itc = 0;
    private ldv aDk = null;
    private ldv isO = null;
    private ldv aDp = null;
    private int itd = -1;
    private int czU = -1;
    private int czV = -1;
    private ldv[] ite = null;
    private int czZ = -1;
    private int itf = -1;
    private boolean itg = false;
    private boolean cAc = false;

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public ldv YS() {
        return this.aDp;
    }

    public void ds(ldv ldv2) {
        this.aDp = ldv2;
    }

    public boolean bHP() {
        return (this.itc & 1) == 1;
    }

    public void bHQ() {
        this.itc |= 1;
    }

    public cla bHR() {
        return cla.getValueByOrdinal(this.itd);
    }

    public void d(cla cla2) {
        this.itd = cla2 == null ? this.itd : cla2.ordinal();
    }

    public boolean bHS() {
        return (this.itc & 2) == 2;
    }

    public void bHT() {
        this.itc |= 2;
    }

    public ayx abm() {
        return ayx.getValueByOrdinal(this.czU);
    }

    public void c(ayx ayx2) {
        this.czU = ayx2 == null ? this.czU : ayx2.ordinal();
    }

    public ayx abn() {
        return ayx.getValueByOrdinal(this.czV);
    }

    public void d(ayx ayx2) {
        this.czV = ayx2 == null ? this.czV : ayx2.ordinal();
    }

    public boolean bHU() {
        return (this.itc & 4) == 4;
    }

    public boolean bHV() {
        return (this.itc & 0x80) == 128;
    }

    public void bHW() {
        this.itc |= 4;
    }

    public void bHX() {
        this.itc |= 0x80;
    }

    public ldv[] bHY() {
        return this.ite;
    }

    public void r(ldv[] ldvArray) {
        this.ite = ldvArray;
    }

    public boolean bHZ() {
        return (this.itc & 8) == 8;
    }

    public void bIa() {
        this.itc |= 8;
    }

    public azf Zr() {
        return azf.getValueByOrdinal(this.czZ);
    }

    public void b(azf azf2) {
        this.czZ = azf2 == null ? this.czZ : azf2.ordinal();
    }

    public boolean bIb() {
        return (this.itc & 0x10) == 16;
    }

    public void bIc() {
        this.itc |= 0x10;
    }

    public azh bId() {
        return azh.getValueByOrdinal(this.itf);
    }

    public void a(azh azh2) {
        this.itf = azh2 == null ? this.itf : azh2.ordinal();
    }

    public boolean bIe() {
        return (this.itc & 0x20) == 32;
    }

    public void bIf() {
        this.itc |= 0x20;
    }

    public boolean abs() {
        return this.itg;
    }

    public void kx(boolean bl) {
        this.itg = bl;
    }

    public boolean abu() {
        return this.cAc;
    }

    public void ky(boolean bl) {
        this.cAc = bl;
    }

    public boolean bIg() {
        return (this.itc & 0x40) == 64;
    }

    public void bIh() {
        this.itc |= 0x40;
    }

    ekm() {
        super(13904);
    }
}

