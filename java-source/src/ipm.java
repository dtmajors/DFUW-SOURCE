/*
 * Decompiled with CFR.
 */
public class ipm
extends ipf {
    private int moK;
    private int moL;
    private ire msb = ire.muk;
    private boolean msc = false;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(0, 0);
        }
    };

    public ipm() {
        this(0xFFFFFF, 0, ire.muk);
    }

    public ipm(int n, int n2, ire ire2) {
        this.a(mdv);
        this.moK = n;
        this.moL = n2;
        this.msb = ire2;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.msc = false;
    }

    public int dlW() {
        return this.moK;
    }

    public void RT(int n) {
        if (n == this.moK) {
            return;
        }
        this.moK = n;
        this.dlZ();
    }

    public int dlX() {
        return this.moL;
    }

    public void RU(int n) {
        if (n == this.moL) {
            return;
        }
        this.moL = n;
        this.dlZ();
    }

    public ire dlY() {
        return this.msb;
    }

    public void b(ire ire2) {
        if (ire2 == this.msb) {
            return;
        }
        this.msb = ire2;
        this.dlZ();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.msc) {
            this.msc = false;
            this.djE().b("GradientRect_setColors", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.moK, this.moL, this.msb == ire.muk});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.msc = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("GradientRect_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.moK, this.moL, this.msb == ire.muk});
    }

    @Override
    public void djn() {
        this.djE().b("GradientRect_setGeometry", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.moK, this.moL, this.msb == ire.muk});
    }

    @Override
    public void djo() {
        this.djE().b("GradientRect_setColors", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.moK, this.moL, this.msb == ire.muk});
    }

    private void dlZ() {
        if (this.msc) {
            return;
        }
        this.msc = true;
        this.dkg();
    }
}

