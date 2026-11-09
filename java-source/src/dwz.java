/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dwz
extends dwx
implements dwe {
    private ldv aep = null;
    private ldv hmz = null;
    private int hmA = 0;
    private int hmB = 0;
    private String hmC = null;
    private String hmD = null;
    private ljq hmE = null;
    private dwn hmF = null;
    private dwn hmG = null;

    public int bDR() {
        return this.hmA;
    }

    public int bDS() {
        return this.hmB;
    }

    public String bDT() {
        return this.hmC;
    }

    public String bDU() {
        return this.hmD;
    }

    public dwz(dvh dvh2, dwf dwf2, gnk gnk2) {
        super(dvh2, dwf2);
        this.aep = gnk2.aep;
        this.hmz = gnk2.hmz;
        this.hmA = gnk2.jne.enw();
        this.hmB = gnk2.ijo.enw();
        this.hmC = gnk2.jng + " " + gnk2.jnf;
        this.hmE = gnk2.jnk;
    }

    @Override
    public void sO() {
        if (this.aep != null && this.hmz != null) {
            this.bDW();
        } else {
            this.bDO().a(this.hmA, this, dwn.b.hkY);
        }
    }

    private void bDV() {
        dwi dwi2 = dwh.bCC().bCH();
        if (dwi2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculatePoints() : Points Calculator is Null!!!");
            assert (false);
            return;
        }
        dwi2.a(this.hmF, this.hmG, this.hmE);
        this.bDP();
    }

    @Override
    public void a(dwn dwn2) {
        if (dwn2.qe() == this.hmA) {
            this.hmF = dwn2;
            this.bDO().a(this.hmB, this, dwn.b.hkY);
        } else if (dwn2.qe() == this.hmB) {
            this.hmG = dwn2;
            this.CS(this.hmB);
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "cacheEntryRetrieved() : Entry Retrieved for Unknown Character ID!!!");
            assert (false);
            this.bDQ();
        }
    }

    private void bDW() {
        enq enq2 = (enq)this.MessageDelegator.h(13899, this.GUID, this.aep);
        enq2.ch(this.hmz);
        this.MessageDelegator.F(enq2);
    }

    private void CS(int n2) {
        ma ma2 = new ma();
        ma2.awK = n2;
        ma2.afj = 4;
        fvc fvc2 = (fvc)this.MessageDelegator.h(26884, this.GUID, lcr.qAN);
        fvc2.Yb = ma2;
        this.MessageDelegator.F(fvc2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13900: {
                this.a((enr)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(enr enr2) {
        if (enr2.bJH()) {
            this.bDP();
            return;
        }
        this.bDO().a(this.hmA, this, dwn.b.hkY);
    }

    private void a(fvd fvd2) {
        this.hmD = fvd2.iXC == null || fvd2.iXC.length == 0 ? "Unknown" : fvd2.iXC[0].bc;
        this.bDV();
    }
}

