/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 *  lcr
 */
import java.util.Map;

public class bua
extends btk {
    private boolean dMM = false;
    private ldv dMN = null;
    private ha aer = null;
    private Map<String, erk> dMO = lcn.emw();
    private Map<Integer, erk> dMP = lcn.emw();
    private Map<Integer, kqg> dMQ = lcn.emw();

    public final void f(ha ha2) {
        this.aer = ha2;
    }

    public void b(cex cex2) {
        this.dMM = true;
        this.aer = cex2.mA();
        ldv ldv2 = this.aer.hk();
        this.dMN = lcr.p((ldv)lcr.dMN, (int)ldv2.ib(), (int)this.GUID.enw());
    }

    public void axM() {
        this.dMM = false;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        if (kcz2.getMessageType() == 270) {
            kcs kcs2 = (kcs)kcz2;
            if (kcs2.peo.equals(kqg.class.getName())) {
                this.go("Incorrect node id specified for SFSystemIProfRoutedRequest!");
                return;
            }
            if (kcs2.peo.equals(kqc.class.getName())) {
                this.go("Incorrect node id specified for SFSystemDebugInfoRoutedRequest!");
                return;
            }
            if (kcs2.peo.equals(kjf.class.getName())) {
                this.go("Incorrect node id specified for SFDistributionReportContainmentRequest!");
                return;
            }
            if (kcs2.peo.equals(kmz.class.getName())) {
                this.go("Incorrect node id specified for SFDistributionReportRelationRequest!");
                return;
            }
            if (kcs2.peo.equals(kow.class.getName())) {
                this.go("Incorrect node id specified for SFDistributionReportSensorRequest!");
                return;
            }
            if (kcs2.peo.equals(krl.class.getName())) {
                this.go("Incorrect node id specified for SFDistributionReportTimerRequest!");
                return;
            }
            if (kcs2.peo.equals(kwx.class.getName())) {
                return;
            }
            if (kcs2.peo.equals(eri.class.getName())) {
                return;
            }
            if (kcs2.peo.equals(erl.class.getName())) {
                lfn.b(5, this.getClass().getSimpleName(), " OrgToGUID = " + kcs2.hsQ + " OrgFromGUID = " + kcs2.dxv);
                erk erk2 = this.dMP.get(kcs2.hsQ.ib());
                if (erk2 != null) {
                    this.MessageDelegator.F(erk2);
                } else {
                    kqg kqg2 = this.dMQ.get(kcs2.hsQ.ib());
                    if (kqg2 != null) {
                        this.MessageDelegator.a(kqg2);
                    }
                }
                return;
            }
        }
        super.receiveMiddlewareMessage(kcz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 16655: {
                erj erj2 = (erj)dxq2;
                if (this.aer != null && !this.aer.jT().a(erj2)) break;
                this.b(erj2);
                break;
            }
            case 16656: {
                erk erk2 = (erk)dxq2;
                if (this.aer != null && !this.aer.jT().a(erk2)) break;
                this.c(erk2);
                break;
            }
            case 16657: {
                this.a((erl)dxq2);
                break;
            }
            case 5642: {
                fuq fuq2 = (fuq)dxq2;
                erk erk3 = this.dMO.remove(fuq2.bc);
                if (fuq2.di == -1) break;
                erk3.iyA = "";
                erk3.di = fuq2.di;
                this.c(erk3);
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
            case 6401: {
                this.a((kww)ktv2);
                break;
            }
            case 6402: {
                this.a((kwx)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void b(erj erj2) {
        if (erj2.Type <= 7) {
            kqc kqc2 = (kqc)this.MessageDelegator.h(3845);
            kqc2.pEv = new ldv(erj2.di, 0, 0);
            kqc2.pVD = erj2.Type;
            kqc2.iyx = 2;
            kqc2.iye = erj2.iye;
            kqc2.iyf = erj2.iyf;
            kqc2.ts(this.getGUID());
            kqc2.jM(false);
            kqc2.wD(false);
            this.MessageDelegator.a(kqc2);
        } else if (erj2.Type == 8) {
            kjf kjf2 = (kjf)this.MessageDelegator.h(2825);
            kjf2.ts(this.getGUID());
            kjf2.jM(false);
            kjf2.wD(false);
            kjf2.pEu = 1;
            kjf2.pEv = new ldv(erj2.di, 0, 0);
            this.MessageDelegator.a(kjf2);
        } else if (erj2.Type == 9) {
            kmz kmz2 = (kmz)this.MessageDelegator.h(783);
            kmz2.ts(this.getGUID());
            kmz2.jM(false);
            kmz2.wD(false);
            kmz2.ehv = ldv.rfd;
            kmz2.ehw = ldv.rfd;
            kmz2.doP = ldv.rfd;
            kmz2.pEv = new ldv(erj2.di, 0, 0);
            this.MessageDelegator.a(kmz2);
        } else if (erj2.Type == 10) {
            kow kow2 = (kow)this.MessageDelegator.h(538);
            kow2.ts(this.getGUID());
            kow2.jM(false);
            kow2.wD(false);
            kow2.Ud = ldv.rfd;
            kow2.pEv = new ldv(erj2.di, 0, 0);
            this.MessageDelegator.a(kow2);
        } else if (erj2.Type == 11) {
            krl krl2 = (krl)this.MessageDelegator.h(2311);
            krl2.ts(this.getGUID());
            krl2.jM(false);
            krl2.wD(false);
            krl2.atv = ldv.rfd;
            krl2.pEv = new ldv(erj2.di, 0, 0);
            this.MessageDelegator.a(krl2);
        } else if (erj2.Type == 12) {
            kjf kjf3 = (kjf)this.MessageDelegator.h(2825);
            kjf3.ts(this.getGUID());
            kjf3.jM(false);
            kjf3.wD(false);
            kjf3.pEu = 2;
            kjf3.Position = erj2.Position;
            kjf3.pEv = new ldv(erj2.di, 0, 0);
            this.MessageDelegator.a(kjf3);
        }
    }

    private void c(erk erk2) {
        if (erk2.iyA != null && !erk2.iyA.equals("")) {
            this.dMO.put(erk2.iyA, erk2);
            fuq fuq2 = (fuq)this.MessageDelegator.h(5642, this.getGUID(), lcr.hac);
            fuq2.bc = erk2.iyA;
            this.MessageDelegator.E(fuq2);
            return;
        }
        if (this.dMM && (erk2.fV == 2 || erk2.fV == 1)) {
            erk2.f(erk2.amk());
            ldv ldv2 = new ldv(erk2.di, lcr.dMN.enw(), lcr.dMN.enx());
            erk2.on(ldv2);
            this.MessageDelegator.E(erk2);
            erk erk3 = (erk)this.MessageDelegator.h(16656, this.getGUID(), ldv2);
            erk3.iyu = 1;
            erk3.iyv = false;
            erk3.di = erk2.di;
            erk3.fV = erk2.fV;
            this.dMP.put(erk2.aO().ib(), erk3);
        } else {
            if (!this.dMM) {
                this.dMN = erk2.aO();
            }
            kqg kqg2 = (kqg)this.MessageDelegator.h(3842);
            kqg2.ts(this.getGUID());
            kqg2.jM(false);
            kqg2.wD(false);
            kqg2.pEv = new ldv(erk2.di, 0, 0);
            kqg2.iyu = erk2.iyu;
            kqg2.iyv = erk2.iyv;
            kqg2.iyw = erk2.iyw;
            kqg2.iyx = erk2.iyx;
            kqg2.iyy = erk2.iyy;
            kqg2.iyz = erk2.iyz;
            if ((erk2.iyu & 1) == 1) {
                kqg2.iyu |= 0x180;
                kqg2.pVQ = erk2.iyv;
                kqg2.pVR = false;
            }
            this.MessageDelegator.a(kqg2);
            kqg kqg3 = (kqg)this.MessageDelegator.h(3842);
            kqg3.ts(this.getGUID());
            kqg3.jM(false);
            kqg3.wD(false);
            kqg3.pEv = new ldv(erk2.di, 0, 0);
            kqg3.iyu = 131;
            kqg3.iyv = false;
            kqg3.iyw = false;
            kqg3.pVQ = false;
            this.dMQ.put(erk2.aO().ib(), kqg3);
        }
    }

    private void a(erl erl2) {
        erl2.f(erl2.amk());
        erl2.on(this.dMN);
        this.MessageDelegator.E(erl2);
    }

    private void a(kww kww2) {
        this.go(kww2.qgb);
    }

    private void a(kwx kwx2) {
        erl erl2 = (erl)this.MessageDelegator.h(16657, this.GUID, this.dMN);
        erl2.iyB = kwx2.iyB;
        erl2.iyC = kwx2.iyC;
        erl2.iyD = kwx2.iyD;
        this.MessageDelegator.F(erl2);
    }

    private void go(String string) {
        eri eri2 = (eri)this.MessageDelegator.h(16654, this.GUID, this.dMN);
        eri2.ixR = string;
        this.MessageDelegator.F(eri2);
    }
}

