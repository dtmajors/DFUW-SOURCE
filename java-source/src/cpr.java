/*
 * Decompiled with CFR.
 */
import java.util.HashSet;

public class cpr
extends btk {
    private ldv eUg = null;
    private HashSet<Integer> eUh = new HashSet();
    private final ldv dsZ;
    private ljq eUi = null;
    private float eUj = 0.0f;
    private boolean eUk = false;
    private boolean eUl = false;
    private final cpt eUm;

    public cpr(cpt cpt2, ldv ldv2) {
        assert (cpt2 != null);
        assert (ldv2 != null);
        this.eUm = cpt2;
        this.dsZ = ldv2;
    }

    public void enable() {
        if (this.eUi == null) {
            this.eUl = true;
            if (!this.eUk) {
                this.aYi();
            }
            return;
        }
        this.acf();
    }

    public void disable() {
        this.eUl = false;
        this.acg();
    }

    public void sz(int n) {
        assert (n > 0);
        this.eUh.add(n);
    }

    public boolean sA(int n) {
        return this.eUh.remove(n);
    }

    public void aYh() {
        this.eUh.clear();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aYi();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 5386: {
                this.handlePhysicsCollisionSchemeInfoResponse((kvf)ktv2);
                break;
            }
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.acg();
    }

    private void a(kwr kwr2) {
        assert (kwr2.dJs != null);
        if (kwr2.dJs == null) {
            return;
        }
        this.eUg = kwr2.dJs;
    }

    private void a(kws kws2) {
        if (kws2.qfc == null) {
            return;
        }
        if (kws2.qfc.length <= 0) {
            return;
        }
        for (int i = 0; i < kws2.qfc.length; ++i) {
            if (!this.eUh.contains(kws2.qfc[i])) continue;
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), kws2.qfR[i]);
            fut2.iXt = 1;
            fut2.sk(kws2.qfc[i]);
            this.MessageDelegator.F(fut2);
        }
    }

    private void handlePhysicsCollisionSchemeInfoResponse(kvf kvf2) {
        this.eUk = false;
        if (kvf2.ew != 0) {
            if (this.eUl) {
                this.aYi();
            }
            return;
        }
        switch (kvf2.qeC) {
            case 2: 
            case 11: {
                assert (kvf2.pTu != null);
                assert (kvf2.pTu.length > 0);
                this.eUi = kvf2.pTu[0].mZ;
                this.eUj = kvf2.pTu[0].Radius;
                break;
            }
            case 12: {
                assert (false);
                this.eUi = kvf2.qeD.mZ;
                this.eUj = kvf2.qeD.rki.esC();
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        if (this.eUl) {
            this.acf();
            this.eUl = false;
        }
    }

    private void b(fuu fuu2) {
        if (this.eUg == null) {
            return;
        }
        if (this.eUm == null) {
            return;
        }
        if (fuu2.dtj != null) {
            this.eUm.y(fuu2.aVk(), fuu2.dtj);
        }
    }

    private void aYi() {
        kme kme2 = (kme)this.MessageDelegator.h(3354);
        kme2.pMi = 1;
        kme2.Rs = this.dsZ;
        kme2.ts(this.getGUID());
        this.MessageDelegator.a(kme2);
        this.eUk = true;
    }

    private void acf() {
        koq koq2 = (koq)this.MessageDelegator.h(533);
        koq2.dsZ = this.dsZ;
        koq2.pUL = 0;
        koq2.pUO = false;
        koq2.dtg = 0.01f;
        koq2.pUM = this.eUj;
        koq2.pUQ = this.eUi;
        koq2.pUN = true;
        koq2.iBr = false;
        koq2.hsP = false;
        int[] nArray = new int[this.eUh.size()];
        int n = 0;
        for (Integer n2 : this.eUh) {
            nArray[n] = n2;
            ++n;
        }
        koq2.pTd = nArray;
        koq2.dsK = false;
        koq2.Ud = this.eUg = this.MessageDelegator.bzv();
        koq2.ec = this.getGUID();
        this.MessageDelegator.a(koq2);
    }

    private void acg() {
        if (this.eUg == null) {
            return;
        }
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.hsP = false;
        kov2.iBr = false;
        kov2.ec = this.getGUID();
        kov2.Ud = this.eUg;
        this.MessageDelegator.a(kov2);
        this.MessageDelegator.oa(this.eUg);
        this.eUg = null;
    }
}

