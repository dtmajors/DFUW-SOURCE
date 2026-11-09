/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ipz
extends iph {
    private List<a> msF;
    private List<a> msG;
    private boolean msH;
    private boolean msI = false;
    private int msJ;
    private int msK;
    private boolean msL;

    public ipz() {
    }

    public ipz(iqz iqz2) {
        this.a(iqz2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.msL = false;
        this.msH = false;
        this.msG = null;
    }

    @Override
    public final boolean djG() {
        return this.msI;
    }

    public final void sa(boolean bl) {
        if (bl == this.msI) {
            return;
        }
        this.msI = bl;
        this.dmz();
    }

    @Override
    public final int djH() {
        return this.msJ;
    }

    public final void RW(int n) {
        if (n == this.msJ) {
            return;
        }
        this.msJ = n;
        this.dmz();
    }

    @Override
    public final int djI() {
        return this.msK;
    }

    public final void RX(int n) {
        if (n == this.msK) {
            return;
        }
        this.msK = n;
        this.dmz();
    }

    public void clear() {
        if (this.msF != null) {
            this.msF = null;
            this.msG = null;
            this.dmy();
        }
    }

    public void N(int n, float f) {
        this.a(new a(this, n, f){
            final /* synthetic */ int msM;
            final /* synthetic */ float msN;
            final /* synthetic */ ipz msO;
            {
                this.msO = ipz2;
                this.msM = n;
                this.msN = f;
            }

            public void ddx() {
                this.msO.djE().b("Sprite_beginFill", new Object[]{this.msO.getId(), this.msM, Float.valueOf(this.msN)});
            }
        });
    }

    public void RY(int n) {
        this.N(n, 1.0f);
    }

    public void drawRect(int n, int n2, int n3, int n4) {
        this.a(new a(this, n, n2, n3, n4){
            final /* synthetic */ int msP;
            final /* synthetic */ int msQ;
            final /* synthetic */ int msR;
            final /* synthetic */ int msS;
            final /* synthetic */ ipz msO;
            {
                this.msO = ipz2;
                this.msP = n;
                this.msQ = n2;
                this.msR = n3;
                this.msS = n4;
            }

            public void ddx() {
                this.msO.djE().b("Sprite_drawRect", new Object[]{this.msO.getId(), this.msP, this.msQ, this.msR, this.msS});
            }
        });
    }

    public void dmw() {
        this.a(new a(this){
            final /* synthetic */ ipz msO;
            {
                this.msO = ipz2;
            }

            public void ddx() {
                this.msO.djE().b("Sprite_endFill", new Object[]{this.msO.getId()});
            }
        });
    }

    public void a(int n, int n2, int n3, int n4, int n5, float f) {
        this.a(new a(this, n, n2, n3, n4, n5, f){
            final /* synthetic */ int msT;
            final /* synthetic */ int msU;
            final /* synthetic */ int msV;
            final /* synthetic */ int msW;
            final /* synthetic */ int msX;
            final /* synthetic */ float msY;
            final /* synthetic */ ipz msO;
            {
                this.msO = ipz2;
                this.msT = n;
                this.msU = n2;
                this.msV = n3;
                this.msW = n4;
                this.msX = n5;
                this.msY = f;
            }

            public void ddx() {
                this.msO.djE().b("Sprite_drawArc", new Object[]{this.msO.getId(), this.msT, this.msU, this.msV, this.msW, this.msX, Float.valueOf(this.msY)});
            }
        });
    }

    public void a(float f, int n, float f2) {
        this.a(f, n, f2, false, "normal", null, null, 3.0f);
    }

    public void a(float f, int n, float f2, boolean bl, String string, String string2, String string3, float f3) {
        this.a(new a(this, f, n, f2, bl, string, string2, string3, f3){
            final /* synthetic */ float msZ;
            final /* synthetic */ int mta;
            final /* synthetic */ float mtb;
            final /* synthetic */ boolean mtc;
            final /* synthetic */ String mtd;
            final /* synthetic */ String mte;
            final /* synthetic */ String mtf;
            final /* synthetic */ float mtg;
            final /* synthetic */ ipz msO;
            {
                this.msO = ipz2;
                this.msZ = f;
                this.mta = n;
                this.mtb = f2;
                this.mtc = bl;
                this.mtd = string;
                this.mte = string2;
                this.mtf = string3;
                this.mtg = f3;
            }

            public void ddx() {
                this.msO.djE().b("Sprite_lineStyle", new Object[]{this.msO.getId(), Float.valueOf(this.msZ), this.mta, Float.valueOf(this.mtb), this.mtc, this.mtd, this.mte, this.mtf, Float.valueOf(this.mtg)});
            }
        });
    }

    public void a(int n, int n2, int n3, int n4, int n5, float f, int n6, String string) {
        this.a(new a(this, n, n2, n3, n4, n5, f, n6, string){
            final /* synthetic */ int msT;
            final /* synthetic */ int msU;
            final /* synthetic */ int msV;
            final /* synthetic */ int mth;
            final /* synthetic */ int mti;
            final /* synthetic */ float msY;
            final /* synthetic */ int mtj;
            final /* synthetic */ String mtk;
            final /* synthetic */ ipz msO;
            {
                this.msO = ipz2;
                this.msT = n;
                this.msU = n2;
                this.msV = n3;
                this.mth = n4;
                this.mti = n5;
                this.msY = f;
                this.mtj = n6;
                this.mtk = string;
            }

            public void ddx() {
                this.msO.djE().b("Sprite_fillArc", new Object[]{this.msO.getId(), this.msT, this.msU, this.msV, this.mth, this.mti, Float.valueOf(this.msY), this.mtj, this.mtk});
            }
        });
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.msH) {
            this.msH = false;
            this.djE().b("Sprite_clear", new Object[]{this.getId()});
        }
        if (this.msG != null) {
            for (a a2 : this.msG) {
                a2.ddx();
            }
            this.msG = null;
        }
        if (this.msL) {
            this.msL = false;
            this.djE().b("DisplayObjectContainer_setClipChildren", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.djG(), this.djH(), this.djI()});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.msH = false;
        this.msG = null;
        this.msL = false;
    }

    @Override
    public void dA(int n, int n2) {
        if (!this.djG()) {
            this.djE().b("Sprite_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dlu()});
        } else {
            this.djE().b("Sprite_createClipped", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dlu(), this.djH(), this.djI()});
        }
        this.dmx();
    }

    @Override
    public void djn() {
        if (!this.djG()) {
            this.djE().b("Sprite_setGeometry", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV()});
        } else {
            this.djE().b("Sprite_setGeometryClipped", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djH(), this.djI()});
        }
    }

    @Override
    public void djo() {
        if (this.djG()) {
            this.djE().b("Sprite_setSizeClipped", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.djH(), this.djI()});
        }
    }

    protected void dmx() {
        if (this.msF == null) {
            return;
        }
        for (a a2 : this.msF) {
            a2.ddx();
        }
    }

    @Override
    void Y(ipf ipf2) {
        ipf2.RM(0);
        ipf2.RN(0);
        ipf2.rl(true);
        ipf2.kL(1.0f);
        ipf2.rm(true);
    }

    private void a(a a2) {
        if (this.msF == null) {
            this.msF = lcn.emv();
        }
        this.msF.add(a2);
        if (this.msG == null) {
            this.msG = lcn.emv();
        }
        this.msG.add(a2);
        this.dkg();
    }

    private void dmy() {
        if (this.msH) {
            return;
        }
        this.msH = true;
        this.dkg();
    }

    private void dmz() {
        if (this.msL) {
            return;
        }
        this.msL = true;
        this.dkg();
    }
}

