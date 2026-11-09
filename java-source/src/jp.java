/*
 * Decompiled with CFR.
 */
public class jp
extends jk
implements hur {
    private jj alx = null;

    @Override
    public void nU() {
        for (a a2 : a.values()) {
            this.a(a2.getCommand(), a2.om(), a2.hf(), a2.ok(), a2.ol());
        }
    }

    @Override
    public void a(jj jj2) {
        a a2 = a.findCommand(jj2.akV);
        if (a2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unrecognised Command Encountered!!!... CommandText = " + jj2.akV);
            assert (false);
            jj2.b(lqe.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case alz: {
                this.d(jj2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unhandled Command Encountered!!!... CommandText = " + jj2.akV);
                assert (false);
                jj2.b(lqd.rXd.bD(jj2.akV), true);
                return;
            }
        }
    }

    private void d(jj jj2) {
        boolean bl = false;
        if (jj2.getArgCount() > 0) {
            bl = ((mhl)jj2.cA((int)0)).Pp;
        }
        jng jng2 = null;
        if (hso.cxK() != null && hso.cxK().cxP() != null) {
            jng2 = hso.cxK().cxP().czb();
        }
        if (jng2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "executeClanVaultFetch() : Clan Information Manager is Null!!!");
            assert (false);
            jj2.b(lqe.rXF.bD("Clan Information Manager is Null!!!"), true);
            return;
        }
        this.alx = jj2;
        jng2.a(this, bl);
    }

    @Override
    public void oi() {
    }

    @Override
    public void oj() {
    }

    @Override
    public void i(long l) {
        if (this.alx == null) {
            return;
        }
        this.alx.a(lqe.rXG.bD((int)l), false);
        jng jng2 = null;
        if (hso.cxK() != null && hso.cxK().cxP() != null) {
            jng2 = hso.cxK().cxP().czb();
        }
        if (jng2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "receiveClanVaultLogEntriesCount() : Clan Information Manager is Null!!!");
            assert (false);
            this.alx.b(lqe.rXF.bD("Clan Information Manager is Null!!!"), true);
            return;
        }
        jng2.a(this);
    }

    @Override
    public void a(bcx bcx2, bda[] bdaArray, int n) {
        if (this.alx == null) {
            return;
        }
        if (!bcx2.vA()) {
            this.alx.b(lqe.rXF.bD(bcx2.toString()), true);
            this.alx = null;
            return;
        }
        for (int j = 0; j < bdaArray.length; ++j) {
            this.alx.a(lqe.rXH.bD(bdaArray[j].toString()), false);
        }
        this.alx.a(lqe.rXH.bD(bcx2.toString()), false);
        this.alx.nT();
        this.alx = null;
    }
}

