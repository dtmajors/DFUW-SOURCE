/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 *  mcs
 */
import java.util.Map;

public class ajo
extends akt {
    private static final int bpP = 8;
    private static final int bpQ = 8;
    private Map<String, eh> bpR = null;
    private ljq bpS = null;
    private ljq bpG = null;
    private int bpT = 0;
    private float bpU = 0.0f;
    private ldv Ud = null;
    private int bpV = 0;

    public ajo() {
        this.bog = ajb.b.boK;
        this.TC = "SFInterferenceToTargetConstraint";
    }

    public void CK() {
        if (this.bqO) {
            return;
        }
        if (this.boj.bfF()) {
            this.bqO = true;
            return;
        }
        if (this.boj.aJz().bgR() == null) {
            lfn.b(5, this.TC, "initializeConstraint() Player object is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (this.boj.aJz().bgR().aAG() == null) {
            lfn.b(5, this.TC, "initializeConstraint() Mesh object is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (this.boj.aJz().bgR().aAG().azb() == null) {
            lfn.b(5, this.TC, "initializeConstraint() Position is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        bun bun2 = (bun)this.boj.getMessageDelegator().bzx().bzt().d(lcr.qBP);
        if (bun2 == null) {
            lfn.b(5, this.TC, "initializeConstraint() Targeting Manager is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.bqM = bun2.ayq();
        if (this.bqM == null) {
            lfn.b(5, this.TC, "initializeConstraint() InfoAssembler is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.akX = this.bqM.KY();
        if (this.akX == null) {
            lfn.b(5, this.TC, "initializeConstraint() No Target mesh object guid.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uAa.bD(new Object[0]) : mcs.uzQ.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (!this.bqL.zJ(this.bqM.az())) {
            String string = lea.enW().getName(this.bqM.az());
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uAa.bD(new Object[0]) : mcs.uzQ.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.bpG = this.bqM.av();
        if (this.bpG == null) {
            lfn.b(5, this.TC, "initializeConstraint() No Target position.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uAb.bD(new Object[0]) : mcs.uzR.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        float f2 = Math.abs(this.boj.aJz().bgR().aAG().av().ez(this.bpG));
        if (f2 > this.bpU) {
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uAc.bD(new Object[0]) : mcs.uzN.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.bpR = ei.ao(this.boj.aJz().bgR().aAG().getFileName());
        if (this.bpR == null) {
            lfn.b(5, this.TC, "initializeConstraint() No attachpoint for : " + this.boj.aJz().bgR().aAG().getFileName());
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        boolean bl = this.boj.aJz().bgR().aJD().aEP().vO() == 3;
        eh eh2 = this.bpR.get(bl ? "AttachPoint Character Crouch Chest Center" : "AttachPoint Character Chest Center");
        if (eh2 == null) {
            lfn.b(5, this.TC, "initializeConstraint() No character crouch chect attachpoint.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.bpS = eh2.fb();
        if (this.boj.zg() != cxd.fHn) {
            this.CL();
        }
        this.bqO = true;
    }

    private void CL() {
        assert (this.akX != null);
        assert (this.boj.zg() != cxd.fHn);
        ghi ghi2 = (ghi)this.boj.getMessageDelegator().h(513, this.boj.getGUID(), this.akX.bFk());
        ghi2.jhz = cvk.a.fzK.ordinal();
        ghi2.fzI = this.akX;
        this.boj.getMessageDelegator().F(ghi2);
    }

    private void a(ghj ghj2) {
        assert (this.Ud == null);
        assert (this.boj.zg() != cxd.fHn);
        if (ghj2.jhz < 0) {
            lfn.b(5, this.TC, "handleSensorCreateResponse() Invalid sensor type.");
            this.bok = mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (ghj2.fzI == null) {
            lfn.b(5, this.TC, "handleSensorCreateResponse() ObjectToSenseGUID is NULL.");
            this.bok = mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (ghj2.Ud == null) {
            lfn.b(5, this.TC, "handleSensorCreateResponse() SensorGUID is NULL.");
            this.bok = mcs.uzO.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.Ud = ghj2.Ud;
    }

    private void a(gho gho2) {
        assert (this.boj.zg() != cxd.fHn);
        if (gho2.Position == null) {
            lfn.b(5, this.TC, "handleSensorObjectPositionTriggeredMessage() Player target position is NULL.");
            this.bok = mcs.uzP.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.bpG = gho2.Position;
    }

    private void CM() {
        assert (this.Ud != null);
        assert (this.boj.zg() != cxd.fHn);
        ghr ghr2 = (ghr)this.boj.getMessageDelegator().h(515, this.boj.getGUID(), this.Ud);
        ghr2.iBr = false;
        this.boj.getMessageDelegator().F(ghr2);
    }

    private void a(ghq ghq2) {
        assert (this.boj.zg() != cxd.fHn);
        if (this.Ud == null) {
            lfn.b(5, this.TC, "handleSensorObjectToSenseRemovedMessage() SensorGUID is null.");
            return;
        }
        if (!this.Ud.equals(ghq2.aO())) {
            lfn.b(5, this.TC, "handleSensorObjectToSenseRemovedMessage() SensorGUID=" + this.Ud);
            lfn.b(5, this.TC, "handleSensorObjectToSenseRemovedMessage() Message.FromGUID=" + ghq2.aO());
            return;
        }
        this.bok = mcs.uzP.bD(new Object[0]);
        this.bqN = true;
    }

    @Override
    protected boolean BU() {
        if (this.boj.bfF()) {
            return true;
        }
        this.CK();
        if (this.bqN) {
            return false;
        }
        if (this.boj.zg() != cxd.fHn && this.Ud == null) {
            return true;
        }
        if (this.bqM == null) {
            lfn.b(5, this.TC, "checkConstraint() Info assember is null.");
            return false;
        }
        if (this.bpG == null) {
            lfn.b(5, this.TC, "checkConstraint() Target player position.");
            assert (false);
            return false;
        }
        if (this.akX == null) {
            lfn.b(5, this.TC, "checkConstraint() No Target mesh object guid.");
            assert (false);
            return false;
        }
        if (this.boj.aJz().bgR() == null) {
            lfn.b(5, this.TC, "checkConstraint() POS is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            return false;
        }
        if (this.boj.aJz().bgR().aAG() == null) {
            lfn.b(5, this.TC, "checkConstraint() Mesh object is null.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            return false;
        }
        ljq ljq2 = this.boj.aJz().bgR().aAG().av();
        if (ljq2 == null) {
            lfn.b(5, this.TC, "checkConstraint() Position is invalid.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            return false;
        }
        boolean bl = this.boj.aJz().bgR().aJD().aEP().vO() == 3;
        eh eh2 = this.bpR.get(bl ? "AttachPoint Character Crouch Chest Center" : "AttachPoint Character Chest Center");
        if (eh2 == null) {
            lfn.b(5, this.TC, "checkConstraint() there is no attachpoint.");
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uzZ.bD(new Object[0]) : mcs.uzO.bD(new Object[0]);
            return false;
        }
        this.bpS = eh2.fb();
        ljq2.es(this.bpS);
        ljq ljq3 = new ljq(this.bpG);
        ljq3.es(this.bpS);
        ljq ljq4 = ljq.z(ljq3, ljq2);
        float f2 = ljq4.eqN();
        ljq4.normalize();
        kji kji2 = (kji)this.boj.getMessageDelegator().h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.boj.getGUID();
        kji2.pDY = 0;
        kji2.pEr = this.boj.zg() == cxd.fHn ? 0x1E000E : 1966238;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq4);
        kji2.pEN = true;
        kji2.pEL = false;
        kji2.setLength(f2);
        this.boj.getMessageDelegator().a(kji2);
        return true;
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        boolean bl = false;
        if (kuj2.bqd == null) {
            bl = true;
        }
        if (kuj2.bqd != null && kuj2.bqd.length == 0) {
            bl = true;
        }
        if (!bl) {
            float f2;
            for (int i = 0; i < kuj2.qdO.length; ++i) {
                boolean bl2;
                ldv ldv2 = kuj2.qdO[i];
                int n = kuj2.bqd[i];
                boolean bl3 = bl2 = this.boj.zg() == cxd.fHn && i > 0 ? false : cug.vJ((int)n);
                if (ldv2.equals(this.akX) || bl2) continue;
                bl = true;
                break;
            }
            if ((f2 = Math.abs(this.boj.aJz().bgR().aAG().av().ez(this.bpG))) > this.bpU) {
                if (this.boj.zg() == cxd.fHn) {
                    this.bok = mcs.uAc.bD(new Object[0]);
                    this.bqN = true;
                } else {
                    ++this.bpV;
                    if (this.bpV >= 8) {
                        this.bok = mcs.uzN.bD(new Object[0]);
                        this.bqN = true;
                    }
                }
                return;
            }
            this.bpV = 0;
        }
        this.bpT = bl ? ++this.bpT : 0;
        if (this.bpT >= 8) {
            this.bok = this.boj.zg() == cxd.fHn ? mcs.uAd.bD(new Object[0]) : mcs.uzP.bD(new Object[0]);
            this.bqN = true;
            return;
        }
    }

    @Override
    public boolean o(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 514: {
                assert (this.boj.zg() != cxd.fHn);
                this.a((ghj)dxq2);
                return true;
            }
            case 518: {
                assert (this.boj.zg() != cxd.fHn);
                this.a((gho)dxq2);
                return true;
            }
            case 520: {
                assert (this.boj.zg() != cxd.fHn);
                this.a((ghq)dxq2);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean a(ktv ktv2) {
        int n = ktv2.egT();
        switch (n) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void reset() {
        super.reset();
        if (this.boj.zg() != cxd.fHn && this.Ud != null) {
            this.CM();
            this.Ud = null;
        }
        this.bpR = null;
        this.bpG = null;
        this.bpS = null;
        this.bpT = 0;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajo ajo2 = (ajo)aja2;
        ajo2.al(this.bpU);
    }

    @Override
    public final buf CN() {
        return this.bqM;
    }

    public final void al(float f2) {
        this.bpU = f2;
    }

    public final float CO() {
        return this.bpU;
    }
}

