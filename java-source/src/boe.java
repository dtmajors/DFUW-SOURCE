/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class boe
extends bnt
implements bto {
    private int Ss = 1;
    private boolean dxp;
    private boolean dxq;
    private boolean dxr;
    private Map<Integer, a> dxs = lcn.emw();
    private Set<ldv> Sg = lcn.emH();
    private ldv dxn;
    private ldv dxt;
    private boolean Initialized = false;

    public boe() {
        super(false);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    private int asl() {
        return this.Ss++;
    }

    private void a(dxq dxq2, dxq dxq3) {
        if (!(dxq2 instanceof dxu)) {
            return;
        }
        if (!(dxq3 instanceof dxu)) {
            return;
        }
        a a2 = new a(null);
        a2.dxv = dxq2.aO();
        a2.dxu = ((dxu)((Object)dxq2)).aVk();
        a2.dxw = dxq2;
        int n = this.asl();
        ((dxu)((Object)dxq3)).sk(n);
        this.dxs.put(n, a2);
    }

    private a t(dxq dxq2) {
        if (!(dxq2 instanceof dxu)) {
            return null;
        }
        int n = ((dxu)((Object)dxq2)).aVk();
        a a2 = this.dxs.remove(n);
        return a2;
    }

    private void a(fko fko2) {
        if (this.dxt == null) {
            fkp fkp2 = (fkp)this.MessageDelegator.h(11793, this.getGUID(), fko2.aO());
            fkp2.a(fko2);
            fkp2.a(boa.dxa);
            this.MessageDelegator.F(fkp2);
        } else {
            this.a(fko2, fko2);
            fko2.f(this.getGUID());
            fko2.on(this.dxn);
            this.MessageDelegator.E(fko2);
        }
    }

    private void a(fkp fkp2) {
        a a2 = this.t(fkp2);
        if (a2 != null) {
            fkp2.sk(a2.dxu);
            fkp2.on(a2.dxv);
            fkp2.f(this.getGUID());
            if (fkp2.aCK != null) {
                fkp2.aCK = new ldv(this.getGUID().ib(), fkp2.aCK.enw(), fkp2.aCK.enx());
            }
            this.MessageDelegator.F(fkp2);
        }
    }

    private void a(fkn fkn2) {
        if (fkn2.aCK != null) {
            fkn2.aCK = new ldv(this.getGUID().ib(), fkn2.aCK.enw(), fkn2.aCK.enx());
        }
        for (ldv ldv2 : this.Sg) {
            fkn fkn3 = (fkn)this.MessageDelegator.h(11794, this.getGUID(), ldv2);
            fkn3.a(fkn2);
            fkn2.aqs = -1;
            this.MessageDelegator.F(fkn3);
        }
    }

    private void a(fkj fkj2) {
        this.a(fkj2, fkj2);
        fkj2.f(this.getGUID());
        fkj2.on(this.dxn);
        this.MessageDelegator.E(fkj2);
    }

    private void a(fkk fkk2) {
        a a2 = this.t(fkk2);
        if (a2 != null) {
            fkk2.sk(a2.dxu);
            fkk2.on(a2.dxv);
            fkk2.f(this.getGUID());
            fkk2.dxt = this.dxt;
            this.MessageDelegator.F(fkk2);
        }
    }

    private void a(fkl fkl2) {
        if (fkl2.imB) {
            this.Sg.add(fkl2.aO());
        } else {
            this.Sg.remove(fkl2.aO());
        }
    }

    private void a(fke fke2) {
        this.a(fke2, fke2);
        fke2.f(this.getGUID());
        fke2.on(this.dxn);
        this.MessageDelegator.E(fke2);
    }

    private void a(fkf fkf2) {
        a a2 = this.t(fkf2);
        if (a2 != null) {
            fkf2.sk(a2.dxu);
            fkf2.on(a2.dxv);
            fkf2.f(this.getGUID());
            this.MessageDelegator.F(fkf2);
        } else assert (false);
    }

    private void a(fkq fkq2) {
        this.a(fkq2, fkq2);
        fkq2.f(this.getGUID());
        fkq2.on(this.dxn);
        this.MessageDelegator.E(fkq2);
    }

    private void a(fkr fkr2) {
        a a2 = this.t(fkr2);
        if (a2 != null) {
            fkr2.sk(a2.dxu);
            fkr2.on(a2.dxv);
            fkr2.f(this.getGUID());
            this.MessageDelegator.F(fkr2);
        } else assert (false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11792: {
                this.a((fko)dxq2);
                break;
            }
            case 11793: {
                this.a((fkp)dxq2);
                break;
            }
            case 11794: {
                this.a((fkn)dxq2);
                break;
            }
            case 11799: {
                this.a((fke)dxq2);
                break;
            }
            case 11800: {
                this.a((fkf)dxq2);
                break;
            }
            case 11801: {
                this.a((fkq)dxq2);
                break;
            }
            case 11802: {
                this.a((fkr)dxq2);
                break;
            }
            case 11796: {
                this.a((fkj)dxq2);
                break;
            }
            case 11797: {
                this.a((fkk)dxq2);
                break;
            }
            case 11798: {
                this.a((fkl)dxq2);
                break;
            }
            case 11012: {
                this.dxt = ((gpr)dxq2).alW.gZb;
                break;
            }
            case 11804: {
                this.a((fkh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.Initialized) {
            return;
        }
        if (this.dwJ == null) {
            return;
        }
        this.dxn = ((boj)this.dwJ).id(this.getGUID());
        this.Initialized = true;
        dxq dxq2 = (fkl)this.MessageDelegator.h(11798, this.getGUID(), this.dxn);
        dxq2.imB = true;
        this.MessageDelegator.F(dxq2);
        dxq2 = (gpq)this.MessageDelegator.h(11011, this.getGUID(), lcr.qzp);
        this.MessageDelegator.F(dxq2);
    }

    private void a(fkh fkh2) {
        this.dxp = fkh2.dxp;
        this.dxq = fkh2.dxq;
        this.dxr = true;
    }

    @Override
    public boolean arY() {
        return super.arY() && this.dxr;
    }

    private void a(gpr gpr2) {
        this.dxt = gpr2.alW.gZb;
    }

    public boolean asm() {
        return this.dxp;
    }

    public boolean asn() {
        return this.dxq;
    }
}

