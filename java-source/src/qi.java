/*
 * Decompiled with CFR.
 */
public class qi
extends qd {
    private ldv ade;
    private sd aMX;

    public qi(md md2) {
        super(md2, me.aye);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aMX = this.f(new sd((md)this, "ProcDeleteClan"));
    }

    @Override
    public void cleanUp() {
        this.e(this.aMX);
        this.aMX = null;
        super.cleanUp();
    }

    public void ch(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerDeleteClan", "setClanGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.ade = ldv2;
    }

    public final ldv iG() {
        return this.ade;
    }

    @Override
    protected void sO() {
        if (this.ade == null) {
            lfn.b(5, "SFPersistenceWorkerDeleteClan", "startWork: ClanGUID not set");
            this.ca("No clan GUID");
            return;
        }
        this.aMX.g(this.ade);
        this.aMX.start();
    }

    @Override
    protected void sP() {
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        this.ca(qe2.getErrorMessage());
    }
}

