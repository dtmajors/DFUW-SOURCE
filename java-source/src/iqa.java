/*
 * Decompiled with CFR.
 */
public class iqa
extends ipc {
    private int lEU;
    private int lEV;
    private int lEW;
    private int lEX;
    private iqb mtl = iqb.mto;
    private boolean mtm = false;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            iqa iqa2 = (iqa)ipf2;
            switch (iqa.a(iqa2)) {
                case mtp: {
                    iqa2.setSize(iqa2.dmA() + iqa2.dmC(), iqa2.dmB() + iqa2.dmD());
                    break;
                }
                default: {
                    iqa2.setSize(0, 0);
                    iqa2.setSize(iqa2.dju(), iqa2.djv());
                }
            }
        }
    };

    public iqa() {
        this(null, 0, 0, 0, 0);
    }

    public iqa(String string) {
        this(string, 0, 0, 0, 0);
    }

    public iqa(String string, int n, int n2, int n3, int n4) {
        this(string, n, n2, n3, n4, iqb.mto);
    }

    public iqa(String string, int n, int n2, int n3, int n4, iqb iqb2) {
        this.a(mdv);
        this.b(string, n, n2, n3, n4);
        this.a(iqb2);
    }

    public int dmA() {
        return this.lEU;
    }

    public void RZ(int n) {
        this.b(this.djt(), n, this.dmB(), this.dmC(), this.dmD());
    }

    public int dmB() {
        return this.lEV;
    }

    public void Sa(int n) {
        this.b(this.djt(), this.dmA(), n, this.dmC(), this.dmD());
    }

    public int dmC() {
        return this.lEW;
    }

    public void Sb(int n) {
        this.b(this.djt(), this.dmA(), this.dmB(), n, this.dmD());
    }

    public int dmD() {
        return this.lEX;
    }

    public void Sc(int n) {
        this.b(this.djt(), this.dmA(), this.dmB(), this.dmC(), n);
    }

    public void b(String string, int n, int n2, int n3, int n4) {
        boolean bl = lhn.equal(string, this.djt());
        if (bl && n == this.lEU && n2 == this.lEV && n3 == this.lEW && n4 == this.lEX) {
            return;
        }
        this.lEU = n;
        this.lEV = n2;
        this.lEW = n3;
        this.lEX = n4;
        if (bl) {
            this.djz();
            this.dku();
        } else {
            this.qP(string);
        }
        this.pack();
    }

    public iqb dmE() {
        return this.mtl;
    }

    public void a(iqb iqb2) {
        if (iqb2 == this.mtl) {
            return;
        }
        this.mtl = iqb2;
        this.pack();
    }

    @Override
    public void djr() {
        this.djE().b("TiledBitmap_setBitmapData", new Object[]{this.getId(), this.qL(this.djt()), this.lEU, this.lEV, this.lEW, this.lEX});
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("TiledBitmap_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.qL(this.djt()), this.lEU, this.lEV, this.lEW, this.lEX});
    }

    @Override
    public void djn() {
        this.djE().b("SFWidget_setGeometry", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight()});
    }

    @Override
    public void djo() {
        this.djE().b("SFWidget_setSize", new Object[]{this.getId(), this.getWidth(), this.getHeight()});
    }

    static /* synthetic */ iqb a(iqa iqa2) {
        return iqa2.mtl;
    }
}

