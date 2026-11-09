/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  cug
 */
public class axo {
    private static final double csz = 1.0;
    private axq csA = null;
    private dlo csB = null;
    private dxr MessageDelegator = null;
    private axx csC = null;
    private int csD = -1;
    private double csE = -1.7976931348623157E308;

    public axo(axq axq2) {
        this.csA = axq2;
    }

    public boolean XJ() {
        if (this.csA == null) {
            return false;
        }
        return this.csB.XS() == this.csA.XT();
    }

    public int it(int n) {
        return this.csA.iw(n);
    }

    public int XK() {
        return this.csD;
    }

    public void iu(int n) {
        this.csD = n;
    }

    public axq XL() {
        return this.csA;
    }

    public void b(axq axq2) {
        this.csA = axq2;
    }

    public boolean XM() {
        return this.csA.XM();
    }

    public void e(boolean bl, boolean bl2) {
        this.csA.ch(bl);
        if (this.csB != null) {
            this.csB.n(bl, bl2);
        }
    }

    public void XN() {
        assert (this.MessageDelegator != null);
        assert (this.XQ() != null);
        this.csB = this.XP();
        assert (this.csB != null);
        this.csB.b(this.XQ());
        this.csB.setGUID(this.MessageDelegator.bzv());
        this.csB.b(this.csA);
        this.MessageDelegator.a(this.csB);
        this.csB.bpF();
    }

    public void XO() {
        assert (this.MessageDelegator != null);
        assert (this.XQ() != null);
        this.csB = this.XP();
        assert (this.csB != null);
        this.csB.b(this.XQ());
        this.csB.setGUID(this.MessageDelegator.bzv());
        this.csB.b(this.csA);
        this.MessageDelegator.a(this.csB);
        this.csB.XO();
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    private dlo XP() {
        if (this.csA.Yo() <= 0) {
            return new dlk();
        }
        if (lea.enW().isDescendant(this.csA.Yo(), cug.fph)) {
            return new dll();
        }
        if (lea.enW().isDescendant(this.csA.Yo(), cug.fps)) {
            return new dli(this.XQ().bhD);
        }
        if (lea.enW().isDescendant(this.csA.Yo(), cug.fnH)) {
            return new dlm();
        }
        if (lea.enW().isDescendant(this.csA.Yo(), cug.fmZ)) {
            return new dlj();
        }
        dlk dlk2 = new dlk();
        dlk2.c(this);
        return dlk2;
    }

    public axx XQ() {
        return this.csC;
    }

    public void b(axx axx2) {
        this.csC = axx2;
    }

    public boolean XR() {
        return this.csB.XS() >= 0;
    }

    public int XS() {
        return this.csB.XS();
    }

    public int XT() {
        return this.csA.XT();
    }

    public boolean XU() {
        return this.csA.XU();
    }

    public void cf(boolean bl) {
        this.csA.cf(bl);
    }

    public boolean ak(double d2) {
        return this.csE + 1.0 < d2;
    }

    public double al(double d2) {
        return this.csE + 1.0 - d2;
    }

    public double XV() {
        return this.csE;
    }

    public void am(double d2) {
        this.csE = d2;
    }

    public void XW() {
        assert (this.csB != null);
        assert (this.csB.XS() + 1 <= this.csA.XT());
        if (this.csB.XS() + 1 == 0) {
            this.csB.bpx();
        } else {
            this.csB.Ay(this.csB.XS() + 1);
        }
    }

    public void XX() {
        this.csB.Az(this.XT());
    }

    public void XY() {
        assert (this.csB != null);
        assert (this.csB.XS() >= 0);
        if (this.csB.XS() - 1 == -1) {
            this.XZ();
        } else {
            this.csB.Ay(this.csB.XS() - 1);
        }
    }

    private void XZ() {
        this.csB.XZ();
    }

    public int Ya() {
        return this.csB.Ya();
    }

    public boolean isEnabled() {
        return this.csB.isEnabled();
    }

    public aml[] Yb() {
        if (this.csB == null) {
            lfn.b(5, "SFCityElement", "getBonusAttributeTypes() TheStructure == null");
            return null;
        }
        if (this.csB.aIB() == null) {
            return null;
        }
        aml[] amlArray = new aml[this.csB.aIB().GG().size()];
        this.csB.aIB().GG().toArray(amlArray);
        return amlArray;
    }

    public dlo Yc() {
        return this.csB;
    }

    public float Yd() {
        if (this.csB == null) {
            return 0.0f;
        }
        return this.csB.Yd();
    }

    public float Ye() {
        if (this.csB == null) {
            return 0.0f;
        }
        return this.csB.Ye();
    }

    public void b(dlo dlo2) {
        this.csB = dlo2;
    }
}

