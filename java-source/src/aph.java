/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aph
extends aqu {
    private boolean bKN;
    private boolean bKO;
    protected float bKP = 1.0f;
    protected float bKQ = 10.0f;
    private float bKR;

    public aph(anf anf2, aqu.b b2, boolean bl) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 20.0;
        if (bl) {
            this.bFP.bCK.Oy();
        }
    }

    protected boolean bB(float f) {
        if (this.bKR == -3.4028235E38f) {
            return false;
        }
        return this.bFP.av().y + f < this.bKR;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
        if (!this.bFP.e(this.bFP.bCK.Ov(), 160.0f)) {
            return false;
        }
        if (this.bFP.Jv()) {
            if (this.bB(this.bKP) != this.bKN) {
                asp.a(del.gjX, this.bFP.av(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
                boolean bl = this.bKN = !this.bKN;
            }
            if (this.bB(this.bKQ) != this.bKO) {
                boolean bl = this.bKO = !this.bKO;
                if (this.bKO) {
                    this.bFP.bCK.OA();
                } else {
                    this.bFP.bCK.OB();
                }
            }
        }
        return this.bF(false);
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bKR = this.bFP.Jn().u(this.bFP.av(), 130.0f);
        this.bFP.a(false, null);
        this.Qs();
        this.bFP.stop();
        this.bFP.bCK.a(this.bFP.av(), 85.0f, 50.0f, 35.0f, 10.0f);
        this.bFP.bCK.a(any.a.bIn);
        this.bKN = this.bB(this.bKP);
        this.bKO = this.bB(this.bKQ);
    }

    @Override
    public String name() {
        return "FLY SPIRAL UP";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

