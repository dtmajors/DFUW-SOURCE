/*
 * Decompiled with CFR.
 */
public class qn
extends qd {
    private int SN;
    private qw aNl;
    private nc Zk;
    private String aMH;

    public qn(md md2) {
        super(md2, me.axM);
    }

    public void cS(int n) {
        if (this.sR()) {
            assert (false);
            lfn.b(5, "SFPersistenceWorkerLoadOneCharacter", "setCharacterID: Can't change character ID while working");
            return;
        }
        this.SN = n;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNl = this.f(new qw(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNl);
        this.aNl = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNl.cS(this.SN);
        this.aNl.start();
    }

    @Override
    protected void sP() {
        this.Zk = null;
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aNl) {
            this.Zk = this.aNl.jR();
        } else assert (false);
        if (this.su() > 0) {
            return;
        }
        this.ca(this.aMH);
    }

    public final nc jR() {
        return this.Zk;
    }
}

