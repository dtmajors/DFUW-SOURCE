/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  cwx
 *  cxd
 *  hvy
 *  hzo
 *  iak
 *  lcr
 */
public class jpy
extends jpx
implements jml {
    int[][] nQM;
    boolean[][] nQN;
    boolean nQO = false;
    boolean nQP = false;
    jnz nQQ = jnz.nFA;
    protected boolean nQR = true;

    public jpy() {
        int n;
        int n2;
        this.nQM = new int[2][];
        for (n2 = 0; n2 < this.nQM.length; ++n2) {
            this.nQM[n2] = new int[jej.mUd + 1];
            for (n = 0; n < this.nQM[n2].length; ++n) {
                this.nQM[n2][n] = -1;
            }
        }
        this.nQN = new boolean[2][];
        for (n2 = 0; n2 < this.nQN.length; ++n2) {
            this.nQN[n2] = new boolean[jej.mUd + 1];
            for (n = 0; n < this.nQN[n2].length; ++n) {
                this.nQN[n2][n] = false;
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dQL();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.isInitialized()) {
            return;
        }
    }

    @Override
    public void amX() {
    }

    private void dQI() {
        this.dQe().ecU[5] = false;
        this.dQe().ecU[4] = false;
        this.dQe().ecU[0] = false;
        this.dQe().ecU[1] = false;
        this.dQe().ecU[2] = false;
        this.dQe().ecU[3] = false;
    }

    @Override
    public void a(jmq jmq2) {
        if (this.dQl() || this.dQg() == jpx.a.nQF) {
            return;
        }
        switch (jmq2) {
            case nza: {
                this.dQK();
                break;
            }
            case nzw: {
                this.uB(false);
                break;
            }
            case nzx: {
                this.dQM();
                break;
            }
            case nzC: {
                this.dQE();
                break;
            }
            case nzD: {
                this.dQw();
                break;
            }
            case nzF: {
                this.dQd().dPC();
                break;
            }
            case nzE: {
                this.dQy();
                break;
            }
            case nzM: {
                this.dQz();
                break;
            }
            case nzN: {
                this.dQB();
                break;
            }
            case nzO: {
                this.dQC();
                break;
            }
            case nzP: {
                this.dQD();
                break;
            }
            case nzQ: {
                this.dQA();
                break;
            }
            case nzv: {
                if (hso.cxK().cxP() == null || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cIp() == null || !hso.cxK().cxP().czl()) break;
                boolean bl = hso.cxK().cxP().cyJ().cIp().isExpanded();
                hso.cxK().cxP().cyJ().cIp().expand(!bl);
                break;
            }
            case nAQ: {
                this.dQr();
                break;
            }
            default: {
                lfn.b(5, "SFGamelogicActionHandlerNew", "handleEventActionTriggered(): Unhandled action " + (Object)((Object)jmq2));
                assert (false);
                break;
            }
        }
    }

    @Override
    public void a(jmq jmq2, int n) {
        if (this.dQl() || this.dQg() == jpx.a.nQF) {
            return;
        }
        if (n == 1 && this.nQQ != jnz.nFE && this.nQQ != jnz.nFW) {
            return;
        }
        switch (jmq2) {
            case nzk: 
            case nzl: 
            case nzi: 
            case nzj: {
                this.e(jmq2, n);
                break;
            }
            case nzn: {
                if (this.dQf().aLa() == 6) {
                    this.e(jmq2, n);
                    return;
                }
                this.f(jmq2, n);
                break;
            }
            case nzm: {
                if (this.dQf().aLa() == 6) {
                    this.e(jmq2, n);
                    return;
                }
                if (this.dQf().aLa() == 1 && n == 1) {
                    ldv ldv2 = this.dQf().aKS();
                    ldv ldv3 = lcr.O((int)1, (ldv)ldv2);
                    ecl ecl2 = (ecl)this.MessageDelegator.h(3086, this.GUID, ldv3);
                    this.MessageDelegator.E(ecl2);
                    return;
                }
                this.g(jmq2, n);
                break;
            }
            case nzo: {
                this.h(jmq2, n);
                break;
            }
            case nzp: {
                this.i(jmq2, n);
                break;
            }
            case nzz: {
                iak iak2 = hso.cxK().cxP().cyJ().cHN();
                if (iak2.cKA()) {
                    this.L(iak2.cKv(), n, -1);
                    break;
                }
                this.L(0, n, -1);
                break;
            }
            case nzA: {
                iak iak3 = hso.cxK().cxP().cyJ().cHN();
                if (iak3.cKA()) {
                    this.L(iak3.cKv(), n, -1);
                    break;
                }
                this.L(1, n, -1);
                break;
            }
            case nzy: {
                this.a(cxd.fJy, n, true, -1, jej.mUd);
                break;
            }
            case nzu: {
                this.VE(n);
                break;
            }
            case nzg: {
                break;
            }
            default: {
                lfn.b(5, "SFGamelogicActionHandlerNew", "handleStateActionTriggered(): Unhandled action " + (Object)((Object)jmq2));
                assert (false);
                break;
            }
        }
    }

    public void L(int n, int n2, int n3) {
        cew cew2;
        jef jef2;
        if (!(hso.cxK().cxO() instanceof hzo)) {
            return;
        }
        hzo hzo2 = (hzo)hso.cxK().cxO();
        if (hzo2 == null) {
            return;
        }
        if (hzo2.cHN() == null) {
            return;
        }
        hwm hwm2 = hzo2.cHN().dl(n, n3);
        if (hwm2 == null) {
            if (n3 < 0) {
                this.fF(n, n2);
            }
            return;
        }
        jef jef3 = jef2 = n == 0 ? hzo2.cHV() : hzo2.cHW();
        if (jef2 == null) {
            return;
        }
        int n4 = n3;
        if (n3 < 0) {
            n3 = hzo2.cHN().Pg(n);
            n4 = jej.mUd;
        }
        hxg.a a2 = n3 == -1 ? null : jef2.TT(n3);
        hwv hwv2 = null;
        if (hwm2 instanceof hwv) {
            hwv2 = (hwv)hwm2;
        }
        hvy hvy2 = hso.cxK().cxP().cyZ();
        if (n2 == 1) {
            this.nQN[n][n4] = false;
        }
        if ((cew2 = (cew)this.MessageDelegator.bzx().bzt().d(this.bAn().gYY)) == null) {
            return;
        }
        cyu cyu2 = cew2.aJX();
        if (cyu2 == null) {
            return;
        }
        if (n2 == 0) {
            cxc cxc2;
            if (this.nQM[n][n4] != -1) {
                this.a(this.nQM[n][n4], 0, false, n, n4);
            }
            if (a2 != null && a2.ljy && this.nQO && this.nQN[n][n4] && hwv2 != null && hwv2.zg() == this.nQM[n][n4] && (cxc2 = hvy2.cAd()) != null) {
                boolean bl = true;
                if (hwv2 != null && hwv2.zg() == cxc2.zg()) {
                    bl = false;
                }
                if (bl) {
                    hzo2.cHN().a(n, (hwm)new hwv(cxc2), -1, false);
                }
            }
        } else if (!(n2 <= 0 || this.nQN[n][n4] || hvy2.czY() != -1 && this.nQR)) {
            this.nQO = a2 != null && a2.ljy && hwm2.cBj().state == 0 && n4 == jej.mUd;
            if (!hvy2.cAe() && hwm2.getState() != 0) {
                if (this.fF(n, n2)) {
                    return;
                }
                this.nQO = false;
                int n5 = this.dQf().aLa();
                if (n5 == 0 || n5 == 4) {
                    this.uB(true);
                }
                return;
            }
            if (hwm2 instanceof hwo) {
                hwo hwo2 = (hwo)hwm2;
                cxc cxc3 = null;
                if (hwo2.cBr() == 1) {
                    cxc3 = hvy2.ht(cxd.fHd);
                } else if (hwo2.cBr() == 2) {
                    cxc3 = hvy2.ht(cxd.fHe);
                } else if (hwo2.cBr() == 3) {
                    cxc3 = hvy2.ht(cxd.fJJ);
                }
                if (cxc3 != null && !hvy2.re(cxc3.getGUID())) {
                    hzo2.cHO().cBs().rp(hwo2.cBu().getGUID());
                } else {
                    cxc3 = hvy2.cAd();
                    if (cxc3 != null) {
                        int n6 = cxc3.zg();
                        this.nQN[n][n4] = true;
                        this.a(n6, n2, true, n, n4);
                        this.nQM[n][n4] = n6;
                    }
                }
            } else if (hwv2 != null && hwm2 instanceof hwv) {
                bsn bsn2 = hwv2.awK();
                cxc cxc4 = (cxc)hwv2.cCs();
                if (cxc4 == null) {
                    return;
                }
                boolean bl = hvy2.cj(cxc4);
                boolean bl2 = hvy2.Ot(cxc4.zg());
                int n7 = cxc4.zg();
                if ((!cyu2.hR(n7) || !bl || bl2) && a2 != null && a2.ljz && n4 == jej.mUd) {
                    cxc4 = hvy2.cAd();
                    if (cxc4 == null) {
                        return;
                    }
                    if (cxc4.zg() == n7) {
                        return;
                    }
                    bl = hvy2.cj(cxc4);
                    bl2 = hvy2.Ot(cxc4.zg());
                    n7 = cxc4.zg();
                    if (!cyu2.hR(n7) || !bl || bl2) {
                        return;
                    }
                    n4 = jej.mUd;
                }
                this.nQN[n][n4] = true;
                this.a(n7, n2, true, n, n4);
                this.nQM[n][n4] = n7;
            }
        }
    }

    private boolean fF(int n, int n2) {
        boolean bl;
        bqm.d d2;
        if (hso.cxK().cxP() == null) {
            return false;
        }
        hvy hvy2 = hso.cxK().cxP().cyZ();
        if (hvy2 == null) {
            return false;
        }
        byv byv2 = this.dQf().aEP();
        if (!byv2.isAlive()) {
            return false;
        }
        if (byv2.aEy()) {
            return false;
        }
        bsh bsh2 = hvy2.cAc();
        bqm.d d3 = d2 = bsh2 != null ? bqm.d.getWeaponType(bsh2.az()) : null;
        boolean bl2 = d2 != null ? bqm.d.isMeleeWeapon(d2) && bqm.d.isOneHandedWeapon(d2) : (bl = false);
        if (byv2.Uv() && !bl) {
            this.nQN[n][jej.mUd] = true;
            this.a(cxd.fJZ, n2, true, n, jej.mUd);
            this.nQM[n][jej.mUd] = cxd.fJZ;
            return true;
        }
        return false;
    }

    public void a(int n, int n2, boolean bl, int n3, int n4) {
        Object object;
        Object object2;
        if ((n == cxd.fJB || n == cxd.fJD) && (object2 = (bun)this.MessageDelegator.bzx().bzt().d(lcr.qBP)) != null && (object = ((bun)object2).ayq()) != null && lea.enW().isDescendant(((buf)object).az(), cug.fqE)) {
            n = n == cxd.fJB ? cxd.fJC : cxd.fJE;
        }
        if (!((byv)(object2 = this.dQf().aEP())).isAlive()) {
            return;
        }
        if (this.dQf() == null) {
            return;
        }
        if (this.dQf().axF() == null) {
            return;
        }
        if (this.dQf().axF().aAG() == null) {
            return;
        }
        if (n2 > 0) {
            if (bl && (object = this.bAn()) != null) {
                boolean bl2 = ((byv)object2).Uv();
                boolean bl3 = this.dQf().axF().aJv();
                ljq ljq2 = this.dQf().axF().aAG().av();
                if (bl2 && (!bl3 || ((byv)object2).aEy())) {
                    if (n3 == cdy.eod.ordinal()) {
                        this.n(this.ayp(), 2, 1);
                    } else if (n3 == cdy.eoe.ordinal()) {
                        this.n(this.ayp(), 2, 2);
                    }
                }
                if (bl3 && bl2 && !((byv)object2).aEy()) {
                    n = cxd.fJZ;
                }
                this.a(n, this.ayp(), ((dsu)object).gYZ, ((dsu)object).Za, ljq2);
                hso.cxK().cxP().cyJ().cHN().lBw = n3;
            }
            return;
        }
        if (n2 == 0) {
            this.ah(n, false);
            hso.cxK().cxP().cyJ().cHN().lBw = -1;
        }
    }

    @Override
    public void a(jmq jmq2, double d2) {
        if (this.dQl() || this.dQg() == jpx.a.nQF) {
            return;
        }
        switch (jmq2) {
            case nzs: {
                break;
            }
            case nzt: {
                break;
            }
        }
    }

    private void e(jmq jmq2, int n) {
        boolean bl;
        if (this.dQJ()) {
            return;
        }
        int n2 = -1;
        switch (jmq2) {
            case nzk: {
                n2 = 0;
                break;
            }
            case nzl: {
                n2 = 1;
                break;
            }
            case nzi: {
                n2 = 2;
                break;
            }
            case nzj: {
                n2 = 3;
                break;
            }
            case nzm: {
                n2 = 4;
                break;
            }
            case nzn: {
                n2 = 5;
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
        boolean bl2 = n == 1;
        boolean bl3 = bl = n == 0;
        if (this.dQe().nRs && bl2 && jmq2 == jmq.nzl) {
            this.dQe().nRs = false;
        }
        if (bl2 && this.dQg() == jpx.a.nQJ) {
            this.dQp();
            return;
        }
        boolean bl4 = this.dQe().ecU[n2] = !bl;
        if (bl2) {
            this.dQe().j(n2, this.MessageDelegator.arc().rgz);
        }
    }

    private void f(jmq jmq2, int n) {
        boolean bl;
        if (this.dQJ()) {
            return;
        }
        boolean bl2 = n == 1;
        boolean bl3 = bl = n == 0;
        if (this.dQf().axF().aLU().aEP().aEy()) {
            this.dQe().ecU[5] = !bl;
            this.dQe().ecU[4] = false;
        } else {
            this.dQe().ecU[5] = !this.dQf().aEP().Uv() ? !bl : false;
        }
    }

    private void g(jmq jmq2, int n) {
        boolean bl;
        if (this.dQJ()) {
            return;
        }
        boolean bl2 = n == 1;
        boolean bl3 = bl = n == 0;
        if (this.dQe().nRr && bl2) {
            this.dQe().nRr = false;
            this.dQe().ecU[5] = false;
        }
        switch (this.dQg()) {
            case nQG: {
                if (this.dQf().dQe().nRu) {
                    this.dQe().ecU[4] = !bl;
                } else if (this.dQf().axF().aLU().aEP().aEy()) {
                    this.dQe().ecU[4] = !bl;
                    this.dQe().ecU[5] = false;
                } else {
                    this.dQe().ecU[4] = bl2;
                }
                if (!bl2 || !this.dQf().axF().aLU().aEP().aEA()) break;
                this.dQe().j(4, this.MessageDelegator.arc().rgz);
                break;
            }
            case nQH: {
                if (!bl2 || !this.dQh().isRunning() || !this.dQh().dQQ()) break;
                this.aMF();
                this.dQh().reset();
                break;
            }
            case nQJ: {
                if (!bl2) break;
                this.dQp();
                break;
            }
        }
    }

    private void h(jmq jmq2, int n) {
        boolean bl;
        if (this.dQJ()) {
            return;
        }
        boolean bl2 = n == 1;
        boolean bl3 = bl = n == 0;
        if (!this.dQe().nRv) {
            this.dQe().nRw = !bl;
        }
    }

    private void i(jmq jmq2, int n) {
        if (this.dQJ()) {
            return;
        }
        boolean bl = n == 1;
        boolean bl2 = n == 0;
        this.dQe().nRx = !bl2;
    }

    private boolean dQJ() {
        return this.dQe().nRz.dF(this.MessageDelegator.arc().rgz);
    }

    private void dQK() {
        this.nQQ = hso.cxK().cxN();
        this.dQn();
    }

    private void dQL() {
        fgt fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzs;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzt;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzk;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzl;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzi;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzj;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzm;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzn;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzo;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzp;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nza;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzu;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzw;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzx;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzy;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzz;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzA;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzC;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzD;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzF;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzE;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzM;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzN;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzO;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzP;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        lea.epQ();
        if (ayc.avz) {
            fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
            fgt2.iMe = jmq.nzQ;
            fgt2.iMf = this;
            this.MessageDelegator.E(fgt2);
        }
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzg;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nzv;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
        fgt2 = (fgt)this.MessageDelegator.h(29441, this.getGUID(), lcr.qCE);
        fgt2.iMe = jmq.nAQ;
        fgt2.iMf = this;
        this.MessageDelegator.E(fgt2);
    }

    private void VE(int n) {
        hzl hzl2 = hso.cxK().cxP().cxO();
        if (hzl2 instanceof hzo) {
            hzo hzo2 = (hzo)hzl2;
            if (hso.cxK().cxN() == jnz.nFI && n == 2) {
                hso.cxK().a(jnz.nFE);
            }
            if (hso.cxK().cxN() == jnz.nFE) {
                if (hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cIw() != null) {
                    hso.cxK().cxP().cyJ().cIw().b(hyy.b.luO, 0);
                }
                if (n == 1) {
                    byv byv2 = this.dQf().aEP();
                    if (byv2.Uu() || byv2.Uv()) {
                        this.N(cxd.fHm, this.dQf().aKS());
                        this.ah(cxd.fHm, false);
                    } else if (this.dQk().jQ(this.ayp())) {
                        hzo2.cHZ().cGw();
                    }
                }
            }
            if (n == 0) {
                hzo2.cHZ().cGx();
            }
        }
    }

    private void dQM() {
        cwx cwx2;
        Object object;
        if (hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null && (object = hso.cxK().cxP().cyZ().ht(cxd.fHy)) != null && (cwx2 = (cwx)hso.cxK().cxP().cyZ().ht(cxd.fHy)).bef() == cwx.a.fGw) {
            this.dQp();
            return;
        }
        if (this.dQg() != jpx.a.nQF && this.dQg() != jpx.a.nQG) {
            return;
        }
        object = this.dQf().aEP();
        if (((byv)object).aED() || ((byv)object).Uu() || ((byv)object).aEu() || ((byv)object).aEv() || ((byv)object).aEw() || ((byv)object).aEx() || ((byv)object).aEy() || ((byv)object).aEA() || ((byv)object).Uv() || ((byv)object).Ow() || ((byv)object).aEE()) {
            return;
        }
        boolean bl = ((byv)object).aEG();
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.ayp());
        gjt2.SkillType = cxd.fHy;
        if (!bl) {
            gjs gjs2 = (gjs)this.MessageDelegator.h(4631, this.GUID, this.ayp());
            gjs2.fYi = gjt2;
            this.MessageDelegator.F(gjs2);
        } else {
            this.MessageDelegator.F(gjt2);
        }
    }

    public void uC(boolean bl) {
        this.nQR = bl;
    }
}

