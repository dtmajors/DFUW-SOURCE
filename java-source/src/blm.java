/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  cxg
 *  ha
 *  mcs
 */
public class blm
extends bke
implements bto {
    private static final String TC = "SFPerformPlayerLinkingFO";
    private fcw dtR = null;
    private boolean dua = false;
    private int dub = 0;
    private boolean duc = false;
    private ldv duu = null;
    private ldv duv = null;
    private boolean duw = false;
    private ljq dux = null;
    private boolean duy = false;

    public blm() {
        this.dsy = bkd.a.dss;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, TC, "doFunction() FunctionMessage is null.");
            this.dua = true;
            return;
        }
        if (fdo2.bEz() != 9227) {
            lfn.b(5, TC, "doFunction() FunctionMessage is not a SFFunctionEffectMessage.");
            lfn.b(5, TC, "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.dua = true;
            return;
        }
        this.dtR = (fcw)fdo2;
        if (this.dtR.aZG == null) {
            lfn.b(5, TC, "doFunction() SourceObjectGUID is null.");
            this.dua = true;
            return;
        }
        ha ha2 = this.hI(this.dtR.akX);
        if (ha2 == null) {
            lfn.b(5, TC, "doFunction() PSO is null.");
            this.dua = true;
            return;
        }
        if (ha2.jf() == null) {
            lfn.b(5, TC, "doFunction() PSO is null.");
            this.dua = true;
            return;
        }
        if (ha2.jf().aJL() == null) {
            lfn.b(5, TC, "doFunction() AttributeRegenerationManager is null.");
            this.dua = true;
            return;
        }
        if (ha2.jf().jm() == null) {
            lfn.b(5, TC, "doFunction() AttributeManagerServer is null.");
            this.dua = true;
            return;
        }
        ha2.jf().aJL().b(384, false, "From Spirit Bond SKill.");
        this.duw = true;
        edu edu2 = (edu)this.MessageDelegator.h(12840, this.getGUID(), this.dtR.aZG);
        edu2.gbp = this.getGUID();
        edu2.hsP = true;
        edu2.ing = this.dtR.akX;
        this.MessageDelegator.F(edu2);
        this.dub = 1;
    }

    private void a(edv edv2) {
        this.dub = 0;
        int n = edv2.ew;
        switch (n) {
            case 0: {
                this.e(this.dtR.akX, mcs.uzY.bD(new Object[0]));
                this.arA();
                break;
            }
            case 1: {
                this.e(this.dtR.akX, mcs.uzW.bD(new Object[0]));
                this.dua = true;
                break;
            }
            case 2: {
                this.e(this.dtR.akX, mcs.uzR.bD(new Object[0]));
                this.dua = true;
                break;
            }
            case 4: {
                this.e(this.dtR.akX, mcs.uzT.bD(new Object[0]));
                this.dua = true;
                break;
            }
            case 3: {
                this.e(this.dtR.akX, mcs.uzX.bD(new Object[0]));
                this.dua = true;
            }
        }
    }

    private void arA() {
        this.duc = true;
        if (this.dua) {
            lfn.b(5, TC, "handleLinkCreated() System shutdown was pending. Function object will be released.");
            return;
        }
        assert (this.duv == null);
        assert (this.duu == null);
        ghi ghi2 = (ghi)this.MessageDelegator.h(513, this.GUID, this.dtR.dsL.bFk());
        ghi2.jhz = cvk.a.fzJ.ordinal();
        ghi2.hsP = true;
        ghi2.fzI = this.dtR.aZG;
        this.MessageDelegator.F(ghi2);
        ghi ghi3 = (ghi)this.MessageDelegator.h(513, this.GUID, this.dtR.dsL.bFk());
        ghi3.jhz = cvk.a.fzK.ordinal();
        ghi3.fzI = this.dtR.aZG;
        ghi3.hsP = true;
        this.MessageDelegator.F(ghi3);
        this.dub = 2;
    }

    public void a(ghj ghj2) {
        --this.dub;
        if (ghj2.Ud == null) {
            lfn.b(5, TC, "handleSensorCreateResponse() SensorGUID is NULL.");
            this.dua = true;
            return;
        }
        if (ghj2.fzI == null) {
            lfn.b(5, TC, "handleSensorCreateResponse() ObjectToSenseGUID is NULL.");
            this.dua = true;
            return;
        }
        cvk.a a2 = cvk.a.getSensorType(ghj2.jhz);
        switch (a2) {
            case fzJ: {
                assert (this.duv == null);
                this.duv = ghj2.Ud;
                break;
            }
            case fzK: {
                assert (this.duu == null);
                this.duu = ghj2.Ud;
                break;
            }
            default: {
                this.dua = true;
            }
        }
    }

    public void a(gho gho2) {
        if (gho2.Position == null) {
            lfn.b(5, TC, "handleSensorObjectPositionTriggeredMessage() Player target position is NULL.");
            return;
        }
        this.dux = gho2.Position;
        this.duy = true;
    }

    public void a(ghq ghq2) {
        if (this.duv == null && this.duu == null) {
            lfn.b(5, TC, "handleSensorObjectToSenseRemovedMessage() There are no sensors active.");
            return;
        }
        if (this.duv != null && !this.duv.equals(ghq2.aO()) && this.duu != null && !this.duu.equals(ghq2.aO())) {
            lfn.b(5, TC, "handleSensorObjectToSenseRemovedMessage()  LifeSensorGUID     = " + this.duv);
            lfn.b(5, TC, "handleSensorObjectToSenseRemovedMessage()  PositionSensorGUID = " + this.duu);
            lfn.b(5, TC, "handleSensorObjectToSenseRemovedMessage() SensorGUID         = " + ghq2.aO());
        }
        this.e(this.dtR.akX, mcs.uzS.bD(new Object[0]));
        this.dua = true;
    }

    private void a(ghp ghp2) {
        if (ghp2.bpX != 3) {
            assert (false);
            return;
        }
        if (ghp2.bpZ != 1) {
            this.dua = true;
        }
        if (this.dua) {
            this.e(this.dtR.akX, mcs.uzS.bD(new Object[0]));
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dua) {
            if (this.dub > 0) {
                lfn.b(5, this.getClass().getSimpleName(), "shutdownSystem() There are pending operations for FUNCTION OBJECT : " + this.getGUID() + " . System will wait until everything is been setup correctly.");
                return;
            }
            this.arz();
            return;
        }
        ha ha2 = this.hI(this.dtR.akX);
        if (ha2 == null) {
            this.dua = true;
            return;
        }
        if (ha2.jf() == null) {
            this.dua = true;
            return;
        }
        if (ha2.jf().aJD() == null) {
            this.dua = true;
            return;
        }
        if (ha2.jf().aJD().aEP() == null) {
            this.dua = true;
            return;
        }
        if (!ha2.jf().aJD().aEP().isAlive()) {
            this.dua = true;
            return;
        }
        if (this.dux == null) {
            return;
        }
        float f2 = Math.abs(ha2.jf().aAG().av().ez(this.dux));
        if (f2 > this.dtR.dum) {
            this.e(this.dtR.akX, mcs.uzN.bD(new Object[0]));
            this.dua = true;
        }
    }

    private void a(edw edw2) {
        Object object;
        if (edw2.Magnitude <= 0.0f) {
            lfn.b(5, TC, "handleCharacterLinkEffectMessage() Invalid magnitude : " + edw2.Magnitude);
            assert (false);
            return;
        }
        if (!edw2.aO().equals(this.dtR.aZG)) {
            lfn.b(5, TC, "handleCharacterLinkEffectMessage() Received message from unknown target : " + edw2.aO());
            assert (false);
            return;
        }
        float f2 = edw2.Magnitude;
        if (cet.erl) {
            object = this.hI(this.dtR.akX);
            if (object == null) {
                return;
            }
            cex cex2 = object.jf();
            if (cex2 == null) {
                return;
            }
            if (cex2.jk() == null) {
                return;
            }
            czk czk2 = (czk)((Object)cex2.jk().ht(cxd.fKZ));
            assert (czk2 != null);
            f2 = cxg.d((cxc)((Object)czk2), (int)czk2.bhT());
        }
        object = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        ((fcw)object).bst = bkd.dri;
        ((fcw)object).aZG = this.dtR.aZG;
        ((fcw)object).aYF = this.dtR.aZG;
        ((fcw)object).akX = this.dtR.akX;
        ((fcw)object).bsG = cug.fgJ;
        ((fcw)object).aYC = this.dtR.aYC;
        ((fcw)object).Magnitude = f2;
        ((fcw)object).eKm = -3.0;
        ((fcw)object).aYH = this.dtR.aYH;
        ((fcw)object).aYG = bfk.dgx;
        ((fcw)object).bsE = 1;
        ((fcw)object).bRD = 1;
        ((fcw)object).gpI = -3.0;
        ((fcw)object).a(cxd.f.fQX);
        this.MessageDelegator.H((dxq)object);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12841: {
                this.a((edv)dxq2);
                break;
            }
            case 12842: {
                this.a((edw)dxq2);
                break;
            }
            case 514: {
                this.a((ghj)dxq2);
                break;
            }
            case 518: {
                this.a((gho)dxq2);
                break;
            }
            case 520: {
                this.a((ghq)dxq2);
                break;
            }
            case 519: {
                this.a((ghp)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(fdp fdp2) {
        this.dua = true;
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        int n = gre2.bWR();
        switch (n) {
            case 12840: {
                --this.dub;
                this.dua = true;
                break;
            }
            case 513: {
                if (gre2.iHL == 4) {
                    return;
                }
                --this.dub;
                this.dua = true;
                break;
            }
            case 9227: {
                break;
            }
            default: {
                assert (false) : "Unhandled message type : " + n;
                break;
            }
        }
    }

    private void arz() {
        this.dua = false;
        this.arC();
        this.arB();
        if (this.duw) {
            ha ha2 = this.hI(this.dtR.akX);
            if (ha2 != null && ha2.jf() != null && ha2.jf().aJL() != null && ha2.jf().jm() != null) {
                ha2.jf().aJL().b(384, true, "From Spirit Bond SKill.");
            }
            this.duw = false;
        }
        this.a(this.dtR, false);
        this.Vc();
    }

    private void arC() {
        ghr ghr2;
        if (this.duv != null) {
            ghr2 = (ghr)this.MessageDelegator.h(515, this.getGUID(), this.duv);
            ghr2.iBr = false;
            this.MessageDelegator.F(ghr2);
            this.duv = null;
        }
        if (this.duu != null) {
            ghr2 = (ghr)this.MessageDelegator.h(515, this.getGUID(), this.duu);
            ghr2.iBr = false;
            this.MessageDelegator.F(ghr2);
            this.duu = null;
        }
    }

    private void arB() {
        if (!this.duc) {
            return;
        }
        edx edx2 = (edx)this.MessageDelegator.h(12843, this.getGUID(), this.dtR.aZG);
        edx2.inm = this.dtR.akX;
        this.MessageDelegator.F(edx2);
    }
}

