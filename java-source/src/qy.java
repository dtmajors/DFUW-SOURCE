/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class qy
extends qd {
    private sd aOB;
    private sd aOC;
    private sr aOD;
    private List<pc> aOE;
    private String aMH;
    private String TileID;
    private StringBuffer aOF;
    private boolean aOG;

    public qy(md md2) {
        super(md2, me.axS);
    }

    private void cb(String string) {
        this.TileID = string;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aOB = this.f(new sd((md)this, "ProcClearProwessMonolithsTable"));
        this.aOC = this.f(new sd((md)this, "ProcCommitProwessMonolith"));
        this.aOD = this.f(new sr(this, pc.class, false));
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.e(this.aOD);
        this.e(this.aOC);
        this.e(this.aOB);
        this.aOB = null;
        this.aOD = null;
        this.aOC = null;
        this.aOE.clear();
        this.aOE = null;
        this.aOF = null;
    }

    @Override
    protected void sO() {
        this.aOE = lcn.emv();
        bmv bmv2 = (bmv)this.MessageDelegator.bzx().bzt().d(lcr.qBu);
        this.aOE.addAll(bmv2.arM());
        if (!this.aOE.isEmpty()) {
            this.aOF = new StringBuffer();
            for (pc pc2 : this.aOE) {
                this.aOF.append(pc2.bb + ",");
            }
            this.aOF.deleteCharAt(this.aOF.length() - 1);
        }
        if (this.aOF == null) {
            this.ca(null);
            return;
        }
        this.aOG = false;
        this.aOB.g(this.aOF.toString());
        this.aOB.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aOF = null;
        this.aOE = null;
        this.aOG = false;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aOB) {
            if (!this.aOG) {
                this.aOD.e(this.aOE);
                this.aOD.start();
            }
        } else if (qe2 == this.aOD) {
            this.aOC.g(this.aOF.toString());
            this.aOC.start();
        } else if (qe2 == this.aOC) {
            this.aOG = true;
            this.aOB.g(this.aOF.toString());
            this.aOB.start();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}

