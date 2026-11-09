/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 */
public class bli
extends bke
implements bto {
    private int dtZ = -1;
    private double acj = 0.0;
    private fcw dtR = null;
    private cbx dtS = null;
    private ldv Pu = null;

    @Override
    public void a(int n, fdo fdo2) {
        eq eq2;
        assert (fdo2 != null);
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFPerformDelayedEffectFO", "doFunction() FunctionMessage is not SFFunctionEffectMessage.");
            lfn.b(5, "SFPerformDelayedEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        amf amf2 = this.d(fdo2.akX);
        if (!(amf2 instanceof cdb || amf2 instanceof cpg || amf2 instanceof ccs)) {
            lfn.b(5, "SFPerformDelayedEffectFO", "performEffect() TargetObject " + fdo2.akX + " is not a creature object.");
            this.Vc();
            return;
        }
        this.dtS = (cbx)this.d(fdo2.akX);
        if (this.dtS == null) {
            lfn.b(5, "SFPerformDelayedEffectFO", "performEffect() TargetObject for : " + fdo2.akX + " is NULL.");
            this.Vc();
            return;
        }
        this.dtR = (fcw)fdo2;
        if (this.dtR.iKb == -1) {
            lfn.b(5, "SFPerformDelayedEffectFO", "performEffect() FunctionMessage.DelayedFunctionType " + this.dtR.iKb + " is invalid.");
            this.Vc();
            return;
        }
        ej ej2 = this.dtS.jm().ae(this.dtR.aYG);
        if (ej2 instanceof eq && (eq2 = (eq)ej2).getBooleanValue()) {
            lfn.b(5, "SFPerformDelayedEffectFO", "performEffect() Flag already set.");
            this.Vc();
            return;
        }
        this.acj = this.MessageDelegator.arc().rgz + this.dtR.eKm;
        this.dtZ = this.dtR.dtZ;
        if (!this.ary()) {
            lfn.b(5, "SFPerformDelayedEffectFO", "performEffect() Players life mode state is not : " + this.dtZ);
            this.Vc();
            return;
        }
        this.arv();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.ary()) {
            lfn.b(5, "SFPerformDelayedEffectFO", "doTick() Players life mode state is not valid anymore.");
            if (this.Pu != null) {
                this.arw();
            }
            this.Vc();
            return;
        }
        if (ldz2.rgz >= this.acj) {
            if (this.dtR.iKb == bkd.dqA) {
                this.arx();
            } else {
                this.dtR.bst = this.dtR.iKb;
                this.dtR.iKb = -1;
                this.MessageDelegator.I(this.dtR);
            }
            if (this.Pu != null) {
                this.arw();
            }
            this.Vc();
            return;
        }
    }

    private void arv() {
        this.Pu = this.MessageDelegator.bzv();
        alr alr2 = new alr();
        alr2.setGUID(this.Pu);
        alr2.x(this.dtR.gpI);
        alr2.ga(1);
        alr2.fC(this.dtR.aYG);
        alr2.gc(0);
        alr2.cP(this.dtR.aYF);
        alr2.gd(this.dtR.bsG);
        alr2.ge(this.dtR.aYC);
        alr2.fJ(this.dtR.aYG);
        alr2.gf(this.dtR.aYH);
        alr2.aX(this.GUID);
        alr2.bc(true);
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, this.dtR.akX);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{alr2};
        this.MessageDelegator.F(frg2);
    }

    private void arw() {
        frk frk2 = (frk)this.MessageDelegator.h(5379, this.GUID, this.dtR.akX);
        frk2.dtB = new ldv[]{this.Pu};
        frk2.iUQ = true;
        this.MessageDelegator.F(frk2);
        this.Pu = null;
    }

    private void arx() {
        fdk fdk2 = (fdk)this.MessageDelegator.h(9247, this.GUID, this.MessageDelegator.getGUID());
        fdk2.dul = 8;
        fdk2.bst = bkd.dqA;
        fdk2.aZG = this.dtR.aZG;
        fdk2.akX = this.dtR.akX;
        fdk2.aYF = this.dtR.aZG;
        fdk2.bsG = this.dtR.bsG;
        fdk2.aYC = this.dtR.aYC;
        fdk2.SkillLevel = 1.0f;
        fdk2.iGw = this.dtR.Magnitude;
        this.MessageDelegator.F(fdk2);
    }

    public boolean ary() {
        boolean bl2;
        if (this.dtS == null) {
            lfn.b(5, "SFPerformDelayedEffectFO", "isPlayerLifeStateValid() TargetObject is NULL.");
            return false;
        }
        if (!(this.dtS instanceof cdb)) {
            return true;
        }
        cdb cdb2 = (cdb)this.dtS;
        if (cdb2.aJD() == null) {
            lfn.b(5, "SFPerformDelayedEffectFO", "isPlayerLifeStateValid() ObjectStateManager is NULL.");
            return false;
        }
        if (cdb2.aJD().aEP() == null) {
            lfn.b(5, "SFPerformDelayedEffectFO", "isPlayerLifeStateValid() ObjectState is NULL.");
            return false;
        }
        boolean bl3 = bl2 = cdb2.aJD().aEP().vM() == this.dtZ;
        if (!bl2) {
            lfn.b(5, "SFPerformDelayedEffectFO", "isPlayerLifeStateValid() LifeState is : " + cdb2.aJD().aEP().vM() + " and should be : " + this.dtZ);
            return false;
        }
        return true;
    }
}

