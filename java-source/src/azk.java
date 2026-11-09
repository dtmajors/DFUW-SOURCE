/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  lcr
 */
public class azk
extends btk {
    private ayd cCy = null;
    private azn cwP = null;
    private int cEH = azi.ada();
    private int cEI = azi.ada();
    private int cEJ = 0;

    public boolean ZR() {
        return true;
    }

    public int adk() {
        return this.cEH;
    }

    public int adl() {
        return this.cEI;
    }

    public boolean g(ayb ayb2) {
        int n = azi.a(ayb2, this.cCy.b(ayb2));
        return this.cEI >= n;
    }

    public int aas() {
        return azi.aas();
    }

    public void c(nm nm2) {
        nm2.aDy.aDP = this.cEH;
        nm2.aDy.aDQ = this.cEI;
    }

    public void a(nm nm2) {
        this.cEH = nm2.aDy.aDP;
        this.cEI = nm2.aDy.aDQ;
    }

    public azk(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
    }

    public azl b(int n, azm azm2, ldv ldv2, boolean bl) {
        bbr bbr2;
        if (azm2 == null || !azm2.jj(n)) {
            return azl.cEN;
        }
        if (azm2 == azm.cES) {
            return azl.cEP;
        }
        if (!bl && (bbr2 = this.cCy.dR(ldv2)) == null) {
            return azl.cEL;
        }
        if (n > 0) {
            this.cEH += n;
            this.cEI += n;
        } else if (n < 0) {
            if (this.cEI + n < 0) {
                return azl.cEO;
            }
            this.cEI += n;
        }
        if (n != 0) {
            this.a(azm2, ldv2 == null ? -1 : ldv2.enw(), n);
        }
        this.cwP.jk(519);
        return azl.cEP;
    }

    public void adm() {
        this.cEI += this.cEJ * -1;
    }

    public void a(bbr bbr2, int n, boolean bl) {
        if (bbr2 == null) {
            return;
        }
        if (n <= 0) {
            return;
        }
        if (!bl) {
            return;
        }
        int n2 = bbr2.akt() + n;
        int n3 = (int)((float)n2 * azi.adb());
        bbr2.kc(n2 -= (int)((float)n3 / azi.adb()));
        if (n3 > 0) {
            azl azl2 = this.b(n3, azm.cEV, bbr2.abB(), false);
            if (!azl2.adn()) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyMemberPlayerPointsChanged() : Failed to Assign Clan-Points Earned by Member!!!... Transaction Result = " + (Object)((Object)azl2));
                assert (false);
                return;
            }
            bbr2.kb(bbr2.akr() + n3);
            this.cwP.a(776, bbr2);
        }
    }

    private void a(enj enj2, azl azl2) {
        enk enk2 = (enk)this.MessageDelegator.h(13877, this.cCy.getGUID(), enj2.aO());
        this.MessageDelegator.b(enj2, enk2);
        enk2.cD(this.cCy.iV());
        enk2.cd(this.cEH, this.cEI);
        enk2.a(azl2);
        this.MessageDelegator.F(enk2);
    }

    private void a(azm azm2, int n, int n2) {
        kds kds2 = (kds)this.MessageDelegator.i(291, this.cCy.getGUID(), lcr.qza);
        kds2.ch(this.cCy.getGUID());
        kds2.a(azm2);
        kds2.cS(n);
        kds2.Wu(n2);
        this.MessageDelegator.b(kds2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13876: {
                this.a((enj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(enj enj2) {
        this.a(enj2, this.b(enj2.bJy(), enj2.bJx(), enj2.bHL(), enj2.bJx() == azm.cEU));
    }
}

