/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
public class ild
extends ijh {
    private static final int mgT = 3;
    private ilf mgU;
    private ilf[] mgV;
    private ilf mgW;
    private lie lBo;
    private ipg<Boolean> mgX;
    private ipg<Boolean> mgY;
    private ipg<Boolean> mgZ;
    private ipg<Boolean> mha;

    public ild() {
        super("TargetInformation");
        this.a(iqo.dmT());
        this.mgU = new ilf("ti_normal_label_main", null, 20, isf.mwM, 14, 0xE0E0E0, "");
        this.W(ipx.d(this.mgU));
        this.mgV = new ilf[3];
        for (int i = 0; i < 3; ++i) {
            this.W(ipx.a(1, 1, new ipf[0]));
            this.mgV[i] = new ilf("ti_normal_label_secondary", null, 18, isf.mwM, 12, 0xE0E0E0, "");
            this.W(ipx.d(this.mgV[i]));
        }
        this.W(ipx.a(1, 1, new ipf[0]));
        this.mgW = new ilf("ti_normal_label_prowess", "icon_prowess", 16, isf.mwM, 12, 7131065, "");
        this.W(ipx.d(this.mgW));
        this.W(ipx.d(new ipb("ti_label_end")));
        this.mgX = new ipg<Boolean>(this, (ipf)this, "SPI", hsu.ldg, true){
            final /* synthetic */ ild mhb;
            {
                this.mhb = ild2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                ild.a(this.mhb);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mgY = new ipg<Boolean>(this, (ipf)this, "SSI", hsu.ldg, true){
            final /* synthetic */ ild mhb;
            {
                this.mhb = ild2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                ild.b(this.mhb);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mgZ = new ipg<Boolean>(this, (ipf)this, "SI", hsu.ldg, true){
            final /* synthetic */ ild mhb;
            {
                this.mhb = ild2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                ild.c(this.mhb);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mha = new ipg<Boolean>(this, (ipf)this, "SMR", hsu.ldg, true){
            final /* synthetic */ ild mhb;
            {
                this.mhb = ild2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                ild.d(this.mhb);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.setVisible(false);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dcJ();
    }

    public boolean dcF() {
        return this.mgX.get();
    }

    public void qJ(boolean bl) {
        this.mgX.set(bl);
    }

    public boolean dcG() {
        return this.mgY.get();
    }

    public void qK(boolean bl) {
        this.mgY.set(bl);
    }

    public boolean dcH() {
        return this.mgZ.get();
    }

    public void qL(boolean bl) {
        this.mgZ.set(bl);
    }

    public boolean dcI() {
        return this.mha.get();
    }

    public void qM(boolean bl) {
        this.mha.set(bl);
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 / 2 + 38;
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public void cZZ() {
        super.cZZ();
        switch (this.daD()) {
            case mcL: {
                this.mgU.b("ti_small_label_main", 16, 15, 12);
                for (int i = 0; i < 3; ++i) {
                    this.mgV[i].m("ti_small_label_secondary", 16, 11);
                }
                this.mgW.m("ti_small_label_prowess", 14, 11);
                break;
            }
            case mcM: {
                this.mgU.b("ti_normal_label_main", 18, 17, 14);
                for (int i = 0; i < 3; ++i) {
                    this.mgV[i].m("ti_normal_label_secondary", 18, 12);
                }
                this.mgW.m("ti_normal_label_prowess", 16, 12);
                break;
            }
            case mcN: {
                this.mgU.b("ti_large_label_main", 23, 21, 16);
                for (int i = 0; i < 3; ++i) {
                    this.mgV[i].m("ti_large_label_secondary", 20, 14);
                }
                this.mgW.m("ti_large_label_prowess", 18, 14);
            }
        }
    }

    @Override
    public void daa() {
        if (this.mgU != null) {
            this.mgU.kI(this.daE());
        }
        if (this.mgW != null) {
            this.mgW.kI(this.daE());
        }
        if (this.mgV != null) {
            for (int i = 0; i < this.mgV.length; ++i) {
                this.mgV[i].kI(this.daE());
            }
        }
    }

    @Override
    public void c(iif iif2) {
        super.c(iif2);
        this.cUp();
    }

    @Override
    public ijc cZY() {
        return new ile();
    }

    @Override
    public void dah() {
        super.dah();
        ile ile2 = (ile)this.daw();
        ile2.qJ(this.dcF());
        ile2.qK(this.dcG());
        ile2.qL(this.dcH());
        ile2.kI(this.daE());
        ile2.qM(this.dcI());
    }

    @Override
    public void dai() {
        super.dai();
        ile ile2 = (ile)this.daw();
        this.qJ(ile2.dcF());
        this.qK(ile2.dcG());
        this.qL(ile2.dcH());
        this.kI(ile2.daE());
        this.qM(ile2.dcI());
    }

    private void cUp() {
        this.dcJ();
        iif iif2 = iie.cZe().cZf();
        for (ilf object2 : this.mgV) {
            object2.setVisible(false);
        }
        this.mgW.setVisible(false);
        this.mgU.qv(ilh.mhy.zm());
        if (iif2 == null) {
            return;
        }
        switch (iif2.lYw) {
            case lZv: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhr, iif2.lYD);
                break;
            }
            case lZw: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhv, iif2.lYD);
                break;
            }
            case lZx: {
                this.a(iif2.playerName, iif2.clanName, 7912241, ilg.mhu, iif2.lYD);
                break;
            }
            case lZy: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhq, iif2.lYD);
                break;
            }
            case lZz: {
                this.a(iif2.playerName, iif2.clanName, 15246885, ilg.mhs, iif2.lYD);
                break;
            }
            case lZA: {
                this.a(iif2.playerName, iif2.clanName, 14368045, ilg.mhv, iif2.lYD);
                break;
            }
            case lZB: {
                this.a(iif2.playerName, iif2.clanName, 7131065, ilg.mhr, iif2.lYD);
                break;
            }
            case lZC: {
                this.a(iif2.playerName, iif2.clanName, 3251387, ilg.mht, iif2.lYD);
                break;
            }
            case lZD: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhq, iif2.lYD);
                break;
            }
            case lZE: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhq, iif2.lYD, ilh.mhA);
                break;
            }
            case lZF: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhq, iif2.lYD, ilh.mhz);
                break;
            }
            case lZG: {
                this.a(iif2.playerName, iif2.clanName, 0xE0E0E0, ilg.mhq, iif2.lYD, ilh.mhB);
                break;
            }
            case lZH: {
                this.a(iif2.playerName, null, 0xE0E0E0, ilg.mhq, iif2.lYD);
                break;
            }
            case lZI: {
                this.a(!lhn.isEmpty(iif2.lYH) ? lqm.seO.bD(iif2.lYH).exA() : lqm.seQ.bD(new Object[0]).exA(), !lhn.isEmpty(iif2.lYI) ? lqm.seP.bD(iif2.lYI).exA() : null, 0xE0E0E0, ilg.mhq, -1.0f);
                break;
            }
            case lZJ: {
                this.mgU.setText(lqm.seM.bD(iif2.lYG).exA());
                break;
            }
            case lZK: {
                this.mgU.setText(lqm.seN.bD(iif2.lYG).exA());
                break;
            }
            case lZL: {
                this.mgU.setText(lqm.seQ.bD(iif2.lYG).exA());
                break;
            }
            case lZM: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                this.E(0, iif2.ownerClanName);
                if (iif2.vulnerable) {
                    this.a(1, lqm.sea.bD(new Object[0]).exA(), 0xE0E0E0, ilg.mhq);
                    break;
                }
                double d2 = iif2.lYJ;
                this.lBo = new lie(this, 1.0, true, d2){
                    final /* synthetic */ double mhe;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhe = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        double d3 = Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz);
                        ild.a(this.mhb, 1, lqm.seb.bD(d3).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case lZN: {
                this.h(iif2);
                break;
            }
            case lZO: {
                this.mgU.setText(lqm.sfk.bD(iif2.lYK, iif2.lYy).exA());
                this.E(0, !lhn.isEmpty(iif2.ownerClanName) ? lqm.sdQ.bD(iif2.ownerClanName).exA() : lqm.sdQ.bD("None").exA());
                if (iif2.lYN < 1.0f) {
                    this.E(1, lqm.sfl.bD((int)(iif2.lYN * 100.0f)).exA());
                    break;
                }
                this.E(1, lqm.sfm.bD(new Object[0]).exA());
                this.E(2, lqm.sfn.bD(iif2.lYO, iif2.lYP).exA());
                break;
            }
            case lZP: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (iif2.lYQ) {
                    this.E(0, lqm.sec.bD(iif2.lYR).exA());
                    break;
                }
                if (lhn.isEmpty(iif2.lYR)) {
                    this.E(0, lqm.see.bD(new Object[0]).exA());
                    break;
                }
                this.E(0, lqm.sed.bD(iif2.lYR).exA());
                break;
            }
            case lZQ: {
                if (iif2.lYQ) {
                    this.mgU.setText(lqm.sef.bD(new Object[0]).exA());
                    if (lhn.isEmpty(iif2.lYS)) break;
                    this.E(0, lqm.seg.bD(iif2.lYS).exA());
                    break;
                }
                this.mgU.setText(lqm.sej.bD(new Object[0]).exA());
                break;
            }
            case lZR: {
                if (iif2.lYQ) {
                    this.mgU.setText(lqm.seh.bD(iif2.lYT, cug.fkb).exA());
                    double d3 = iif2.lYJ;
                    this.lBo = new lie(this, 1.0, true, d3){
                        final /* synthetic */ double mhe;
                        final /* synthetic */ ild mhb;
                        {
                            this.mhb = ild2;
                            this.mhe = d3;
                            super(d2, bl);
                        }

                        public void dh(double d2) {
                            ild.a(this.mhb, 0, lqm.sei.bD(Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz)).exA());
                        }
                    };
                    this.lBo.e(this.djE().getMessageDelegator());
                    break;
                }
                this.mgU.setText(lqm.sej.bD(new Object[0]).exA());
                break;
            }
            case lZS: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (!lhn.isEmpty(iif2.lYU)) {
                    if (iif2.lYy == cug.fkY) {
                        this.E(0, lqm.seo.bD(iif2.lYU).exA());
                    } else if (iif2.lYy == cug.fkX) {
                        this.E(0, lqm.sen.bD(iif2.lYU).exA());
                    } else if (!cug.vl((int)iif2.lYy)) {
                        this.E(0, lqm.sem.bD(iif2.lYU).exA());
                    }
                }
                if (!(iif2.lYJ >= 0.0) || cug.vl((int)iif2.lYy)) break;
                int n = lhn.isEmpty(iif2.lYU) ? 0 : 1;
                double d4 = iif2.lYJ;
                this.lBo = new lie(this, 1.0, true, n, d4){
                    final /* synthetic */ int mhh;
                    final /* synthetic */ double mhc;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhh = n;
                        this.mhc = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, this.mhh, lqm.sel.bD(Math.max(0.0, this.mhc - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case lZT: {
                this.mgU.setText(lvm.sXa.bD(cug.vp((int)iif2.lYy)).exA());
                if (!lhn.isEmpty(iif2.lYU)) {
                    if (iif2.lYy == cug.flu) {
                        this.E(0, lqm.seo.bD(iif2.lYU).exA());
                    } else if (iif2.lYy == cug.flt) {
                        this.E(0, lqm.sen.bD(iif2.lYU).exA());
                    } else {
                        this.E(0, lqm.sem.bD(iif2.lYU).exA());
                    }
                }
                int n = lhn.isEmpty(iif2.lYU) ? 0 : 1;
                this.E(n, lqm.sek.bD(new Object[0]).exA());
                break;
            }
            case lZU: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                this.E(0, lqm.seq.bD(iif2.lYU).exA());
                if (!(iif2.lYJ >= 0.0)) break;
                double d5 = iif2.lYJ;
                this.lBo = new lie(this, 1.0, true, d5){
                    final /* synthetic */ double mhc;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhc = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, 1, lqm.sep.bD(Math.max(0.0, this.mhc - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case lZV: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                this.E(0, lqm.ses.bD(iif2.lYU).exA());
                if (!(iif2.lYJ >= 0.0)) break;
                double d6 = iif2.lYJ;
                this.lBo = new lie(this, 1.0, true, d6){
                    final /* synthetic */ double mhc;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhc = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, 1, lqm.ser.bD(Math.max(0.0, this.mhc - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case lZW: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                this.E(0, lqm.set.bD(iif2.lYV, cug.fkb).exA());
                this.E(1, lqm.seu.bD(iif2.lYW, cug.fkb).exA());
                break;
            }
            case lZX: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (iif2.lYX && !lhn.isEmpty(iif2.lYU)) {
                    this.E(0, lqm.seA.bD(iif2.lYU).exA());
                    break;
                }
                if (lhn.isEmpty(iif2.lYU)) break;
                this.E(0, lqm.seB.bD(iif2.lYU).exA());
                double d7 = iif2.lYJ;
                this.lBo = new lie(this, 1.0, true, d7){
                    final /* synthetic */ double mhc;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhc = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, 1, lqm.seC.bD(Math.max(0.0, this.mhc - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case lZY: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (iif2.lYX && !lhn.isEmpty(iif2.lYU)) {
                    this.E(0, lqm.seD.bD(iif2.lYU).exA());
                    break;
                }
                if (lhn.isEmpty(iif2.lYU)) break;
                this.E(0, lqm.seD.bD(iif2.lYU).exA());
                double d8 = iif2.lYJ;
                this.lBo = new lie(this, 1.0, true, d8){
                    final /* synthetic */ double mhc;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhc = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, 1, lqm.seE.bD(Math.max(0.0, this.mhc - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case lZZ: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                int n = 0;
                if (iif2.lYX && !lhn.isEmpty(iif2.lYU)) {
                    this.E(0, lqm.sev.bD(iif2.lYU).exA());
                    n = 1;
                } else if (!lhn.isEmpty(iif2.lYU)) {
                    this.E(0, lqm.sew.bD(iif2.lYU).exA());
                    double d9 = iif2.lYJ;
                    this.lBo = new lie(this, 1.0, true, d9){
                        final /* synthetic */ double mhc;
                        final /* synthetic */ ild mhb;
                        {
                            this.mhb = ild2;
                            this.mhc = d3;
                            super(d2, bl);
                        }

                        public void dh(double d2) {
                            ild.a(this.mhb, 1, lqm.sey.bD(Math.max(0.0, this.mhc - this.MessageDelegator.arc().rgz)).exA());
                        }
                    };
                    this.lBo.e(this.djE().getMessageDelegator());
                    n = 2;
                }
                if (!(iif2.lYz <= 10.0f) || iif2.lYY == -1) break;
                this.E(n, lqm.sez.bD(iif2.lYY, iif2.lYZ).exA());
                break;
            }
            case maa: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                this.E(0, lqm.seF.bD(iif2.lZa + 1).exA());
                int n = 1;
                if (!lhn.isEmpty(iif2.lYU)) {
                    this.E(1, lqm.seG.bD(iif2.lYU).exA());
                    n = 2;
                }
                double d10 = iif2.lYJ;
                int n2 = n;
                this.lBo = new lie(this, 1.0, true, n2, d10){
                    final /* synthetic */ int mhd;
                    final /* synthetic */ double mhe;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhd = n;
                        this.mhe = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, this.mhd, lqm.seH.bD(Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case mab: 
            case mad: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                int n = 0;
                if (!lhn.isEmpty(iif2.lYU)) {
                    this.E(0, lqm.seI.bD(iif2.lYU).exA());
                    n = 1;
                }
                double d11 = iif2.lYJ;
                int n3 = n;
                this.lBo = new lie(this, 1.0, true, n3, d11){
                    final /* synthetic */ int mhd;
                    final /* synthetic */ double mhe;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhd = n;
                        this.mhe = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, this.mhd, lqm.seJ.bD(Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case mae: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (iif2.lZc) {
                    if (iif2.lYU == null || iif2.lYU.isEmpty()) break;
                    this.E(0, lqm.seR.bD(iif2.lYU).exA());
                    break;
                }
                this.E(0, lqm.seS.bD(new Object[0]).exA());
                break;
            }
            case maf: {
                this.mgU.setText(lqm.seT.bD(iif2.holdingID).exA());
                if (iif2.lZd != null && !lhn.isEmpty(iif2.ownerClanName)) {
                    this.E(0, lqm.seU.bD(iif2.ownerClanName).exA());
                    break;
                }
                this.E(0, lqm.seV.bD(new Object[0]).exA());
                break;
            }
            case mag: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                Object[] objectArray = new Object[1];
                this.djE();
                objectArray[0] = ioa.cyJ().oB();
                this.E(0, lvm.sXg.bD(objectArray).exA());
                break;
            }
            case mah: {
                if (lea.enW().isDescendant(iif2.lYy, cug.fsv)) {
                    this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                } else {
                    Object[] objectArray = new Object[1];
                    this.djE();
                    objectArray[0] = ioa.cyJ().oB();
                    this.mgU.setText(lqm.seW.bD(objectArray).exA());
                }
                int n = 0;
                if (iif2.lZd != null && !lhn.isEmpty(iif2.ownerClanName)) {
                    this.E(0, lqm.seX.bD(iif2.ownerClanName).exA());
                    n = 1;
                }
                if (iif2.lZe) {
                    this.E(n, lqm.seZ.bD(new Object[0]).exA());
                    break;
                }
                if (iif2.vulnerable) {
                    this.E(n, lqm.seY.bD(new Object[0]).exA());
                    break;
                }
                if (!(iif2.lYJ > 0.0) || !(iif2.lYJ >= this.djE().getMessageDelegator().arc().rgz)) break;
                double d12 = iif2.lYJ;
                int n4 = n;
                this.lBo = new lie(this, 1.0, true, n4, d12){
                    final /* synthetic */ int mhd;
                    final /* synthetic */ double mhe;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhd = n;
                        this.mhe = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.a(this.mhb, this.mhd, lqm.sfa.bD(Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case mai: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                break;
            }
            case maj: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                int n = lea.enW().getType(iif2.lZj);
                if (n == -1) {
                    n = cug.fgG;
                }
                this.E(0, lqm.sfo.bD(n, iif2.lZh, iif2.lZi).exA());
                break;
            }
            case mak: {
                this.mgU.setText(lvm.sXk.bD(iif2.lZf).exA());
                String string = lvm.sXl.bD(iif2.lZf).exA();
                if (string.contains("NO PROFESSION") || string.contains(iif2.lZf)) break;
                this.E(0, string);
                break;
            }
            case mal: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (!this.mha.get().booleanValue()) break;
                this.E(0, jjn.Vd(iif2.lZm));
                break;
            }
            case mam: {
                double d13;
                if (!iif2.lZg) break;
                if (iif2.lZh != -1) {
                    if (lhn.isEmpty(iif2.lZj)) {
                        if (iif2.lZi == 1) {
                            this.mgU.setText(lqm.sfh.bD(new Object[0]).exA());
                        } else {
                            this.mgU.setText(lqm.sff.bD(iif2.lZh, iif2.lZi).exA());
                        }
                    } else if (iif2.lZi == 1) {
                        this.mgU.setText(lqm.sfg.bD(iif2.lZj).exA());
                    } else {
                        this.mgU.setText(lqm.sfe.bD(iif2.lZj, iif2.lZh, iif2.lZi).exA());
                    }
                }
                if (!((d13 = iif2.lYJ) > 0.0)) break;
                this.lBo = new lie(this, 1.0, true, d13){
                    final /* synthetic */ double mhe;
                    final /* synthetic */ ild mhb;
                    {
                        this.mhb = ild2;
                        this.mhe = d3;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        ild.e(this.mhb).setText(lqm.sfi.bD(Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz)).exA());
                    }
                };
                this.lBo.e(this.djE().getMessageDelegator());
                break;
            }
            case man: {
                ayc.a a2;
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                if (iif2.lZk) {
                    this.E(0, lqm.sfd.bD(new Object[0]).exA());
                }
                if (iif2.lYy != cug.fwy || iif2.lZa == -1 || (a2 = lea.epQ().iK(iif2.lZa)) == null) break;
                this.E(1, lvm.sXa.bD(a2.ZC()).exA());
                break;
            }
            case mao: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
                this.E(0, lqm.sfj.bD(new Object[0]).exA());
                break;
            }
            case map: {
                String string = lcw.dZ((ljq)hso.cxK().cxT().oB());
                lox lox2 = iih.qs(string);
                this.mgU.setText(lox2 != null ? lox2.bD(new Object[0]).exA() : lvm.sXa.bD(iif2.lYy).exA());
                break;
            }
            case maq: {
                String string = lcw.dZ((ljq)hso.cxK().cxT().oB());
                lox lox3 = iih.G(string, iif2.lYy);
                this.mgU.setText(lox3 != null ? lox3.bD(new Object[0]).exA() : lvm.sXa.bD(iif2.lYy).exA());
                break;
            }
            case mar: {
                this.mgU.setText(lvm.sXa.bD(iif2.lYy).exA());
            }
        }
    }

    private void a(int n, String string, int n2, ilg ilg2) {
        if (lhn.isEmpty(string)) {
            return;
        }
        ilf ilf2 = this.mgV[n];
        ilf2.setText(string);
        ilf2.Rk(n2);
        ilf2.qv(ilg2.zm());
        ilf2.setVisible(true);
    }

    private void E(int n, String string) {
        this.a(n, string, 0xE0E0E0, ilg.mhq);
    }

    private void kJ(float f) {
        if (f < 0.0f) {
            return;
        }
        this.mgW.setText(jny.dB(f));
        this.mgW.setVisible(this.dcF());
    }

    private void a(String string, String string2, int n, ilg ilg2, float f, ilh ilh2) {
        this.mgU.setText(string);
        this.mgU.qv(ilh2.zm());
        this.a(0, string2, n, ilg2);
        this.kJ(f);
        if (this.mgX.get().booleanValue()) {
            hso.cxK().cxP().cyJ().cHA().E("", false);
        } else {
            hso.cxK().cxP().cyJ().cHA().E(lvp.sYo.bD(jny.dB(f)).exA(), true);
        }
    }

    private void a(String string, String string2, int n, ilg ilg2, float f) {
        this.a(string, string2, n, ilg2, f, ilh.mhy);
    }

    private void dcJ() {
        if (this.lBo != null) {
            this.lBo.stop();
            this.lBo = null;
        }
    }

    private void h(iif iif2) {
        this.mgU.setText(lqm.sdO.bD(iif2.lYK).exA());
        switch (iif2.lYL) {
            case gND: {
                this.E(0, lqm.sdP.bD(new Object[0]).exA());
                break;
            }
            case gNE: {
                this.E(0, lqm.sdQ.bD(iif2.ownerClanName).exA());
                if (iif2.lYN < 1.0f) {
                    double d2 = iif2.lYJ;
                    float f = iif2.lYN;
                    double d3 = iif2.lYM;
                    this.lBo = new lie(this, 1.0, true, d2, d3, f){
                        final /* synthetic */ double mhe;
                        final /* synthetic */ double mhf;
                        final /* synthetic */ float mhg;
                        final /* synthetic */ ild mhb;
                        {
                            this.mhb = ild2;
                            this.mhe = d3;
                            this.mhf = d4;
                            this.mhg = f;
                            super(d2, bl);
                        }

                        public void dh(double d2) {
                            double d3 = Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz);
                            ild.a(this.mhb, 1, lqm.sdR.bD(d3).exA());
                            double d4 = Math.max(0.0, this.mhf - this.MessageDelegator.arc().rgz);
                            ild.a(this.mhb, 2, lqm.sdW.bD((int)(this.mhg * 100.0f), d4).exA());
                        }
                    };
                    this.lBo.e(this.djE().getMessageDelegator());
                    break;
                }
                this.E(1, lqm.sdX.bD(new Object[0]).exA());
                this.E(2, lqm.sdY.bD(iif2.lYO, iif2.lYP).exA());
                break;
            }
            case gNF: {
                this.E(0, lqm.sdQ.bD(iif2.ownerClanName).exA());
                if (iif2.lYN < 1.0f) {
                    this.E(1, lqm.sdT.bD(new Object[0]).exA());
                    float f = iif2.lYN;
                    double d4 = iif2.lYM;
                    this.lBo = new lie(this, 1.0, true, d4, f){
                        final /* synthetic */ double mhf;
                        final /* synthetic */ float mhg;
                        final /* synthetic */ ild mhb;
                        {
                            this.mhb = ild2;
                            this.mhf = d3;
                            this.mhg = f;
                            super(d2, bl);
                        }

                        public void dh(double d2) {
                            double d3 = Math.max(0.0, this.mhf - this.MessageDelegator.arc().rgz);
                            ild.a(this.mhb, 2, lqm.sdW.bD((int)(this.mhg * 100.0f), d3).exA());
                        }
                    };
                    this.lBo.e(this.djE().getMessageDelegator());
                    break;
                }
                this.E(1, lqm.sdX.bD(new Object[0]).exA());
                this.E(2, lqm.sdY.bD(iif2.lYO, iif2.lYP).exA());
            }
        }
    }

    private void dcK() {
        if (this.mgW != null) {
            this.mgW.setVisible(this.dcF());
        }
        this.b(iie.cZe().cZf());
    }

    private void dcL() {
        if (this.mgU != null) {
            this.mgU.setIconVisible(this.dcG());
        }
        this.b(iie.cZe().cZf());
    }

    private void dcM() {
        if (this.mgV != null) {
            for (ilf ilf2 : this.mgV) {
                if (ilf2 == null) continue;
                ilf2.setIconVisible(this.dcH());
            }
        }
        if (this.mgW != null) {
            this.mgW.setIconVisible(this.dcH());
        }
    }

    private void dcN() {
        if (iie.cZe() == null || iie.cZe().cZf() == null) {
            return;
        }
        if (iie.cZe().cZf().lYw == iii.mal) {
            this.b(iie.cZe().cZf());
        }
    }

    static /* synthetic */ void a(ild ild2) {
        ild2.dcK();
    }

    static /* synthetic */ void b(ild ild2) {
        ild2.dcL();
    }

    static /* synthetic */ void c(ild ild2) {
        ild2.dcM();
    }

    static /* synthetic */ void d(ild ild2) {
        ild2.dcN();
    }

    static /* synthetic */ void a(ild ild2, int n, String string) {
        ild2.E(n, string);
    }

    static /* synthetic */ ilf e(ild ild2) {
        return ild2.mgU;
    }
}

