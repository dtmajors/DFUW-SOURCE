/*
 * Decompiled with CFR.
 */
import java.util.HashSet;

public class cps
extends btk {
    private ldv eUn = null;
    private HashSet<Integer> eUh = new HashSet();
    private ldv dsZ = null;
    private final cpt eUm;

    public cps(cpt cpt2) {
        this.eUm = cpt2;
    }

    public void enable() {
        this.aYk();
    }

    public void disable() {
        this.aYj();
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
            case 513: {
                this.a((kwb)ktv2);
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
        this.aYj();
    }

    private void a(kwr kwr2) {
        assert (kwr2.dJs != null);
        if (kwr2.dJs == null) {
            return;
        }
        this.eUn = kwr2.dJs;
    }

    private void a(kwb kwb2) {
        if (this.eUh.isEmpty() || this.eUh.contains(kwb2.qfo)) {
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), kwb2.qfn);
            fut2.iXt = 1;
            fut2.sk(kwb2.qfo);
            this.MessageDelegator.F(fut2);
        }
    }

    private void b(fuu fuu2) {
        if (this.eUn == null) {
            return;
        }
        if (this.eUm == null) {
            return;
        }
        if (fuu2.dtj != null) {
            this.eUm.y(fuu2.aVk(), fuu2.dtj);
        }
    }

    private void aYj() {
        if (this.eUn == null) {
            return;
        }
        kom kom2 = (kom)this.MessageDelegator.h(515);
        kom2.ZS(2);
        kom2.ts(this.getGUID());
        kom2.wD(false);
        kom2.jM(false);
        kom2.sy(this.eUn);
        kom2.hK(this.dsZ);
        kom2.ZT(1);
        this.MessageDelegator.a(kom2);
    }

    private void aYk() {
        if (this.eUn != null) {
            return;
        }
        kom kom2 = (kom)this.MessageDelegator.h(515);
        kom2.lQ(true);
        kom2.ZS(1);
        kom2.ts(this.getGUID());
        kom2.hK(this.dsZ);
        kom2.ZT(1);
        this.MessageDelegator.a(kom2);
    }
}

