/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.List;
import java.util.Set;

public class mc
extends mm {
    private boolean awL = false;
    private ldv awM = null;
    private List<dxq> awN;
    private long awO = 0L;
    private long awP = 0L;
    private Set<ldv> awQ = null;
    private long awR = 0L;
    private eml awS = null;
    private String add = null;
    private bbs awT = null;
    private bcb awU = null;

    public ldv iG() {
        if (this.awL) {
            return null;
        }
        return this.awM;
    }

    public void bQ(ldv ldv2) {
        assert (this.awM == null);
        this.awM = ldv2;
    }

    public String iV() {
        return this.add;
    }

    public boolean b(bca bca2) {
        return bca2 == null || this.awU == null ? false : this.awU.d(bca2);
    }

    public long qn() {
        return this.awO;
    }

    public void l(long l) {
        this.awO = l;
    }

    public boolean qo() {
        return this.awL;
    }

    public void af(boolean bl) {
        this.awL = bl;
    }

    public bbs qp() {
        return this.awT == null ? bbs.NoRank : this.awT;
    }

    public bcb qq() {
        return this.awU == null ? new bcb(bca.addNonMemberPermissions(null)) : this.awU;
    }

    public ldv[] kG() {
        return this.awQ == null ? new ldv[]{} : this.awQ.toArray(new ldv[this.awQ.size()]);
    }

    public void a(ldv[] ldvArray) {
        if (this.awQ == null) {
            this.awQ = lcn.emx();
        }
        if (ldvArray != null) {
            for (ldv ldv2 : ldvArray) {
                this.awQ.add(ldv2);
            }
        }
    }

    public mc(ha ha2) {
        super(ha2);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.qr();
        if (this.awN != null) {
            for (dxq dxq2 : this.awN) {
                this.receiveMessage(dxq2);
            }
            this.awN = null;
        }
    }

    private void qr() {
        this.qz();
        if (this.awM == null) {
            return;
        }
        this.qu();
        gyy gyy2 = (gyy)this.MessageDelegator.h(12049, this.hF.jE(), lcr.qAI);
        gyy2.ija = 12;
        gyy2.add = this.iV();
        gyy2.bnj = this.qp().name();
        this.MessageDelegator.F(gyy2);
    }

    public void qs() {
        if (this.awM != null) {
            this.qv();
        } else if (this.hF.iY()) {
            this.qx();
        }
        if (this.hF.iY()) {
            this.qy();
        }
    }

    public void lM() {
        if (!ldv.tU(this.iG())) {
            return;
        }
        emh emh2 = (emh)this.MessageDelegator.h(13831, this.getGUID(), this.iG());
        emh2.gw(this.hF.getGUID());
        emh2.oS(this.hF.getGUID());
        emh2.a(bbt.cRS);
        this.MessageDelegator.F(emh2);
    }

    public void qt() {
        if (this.awM != null) {
            this.qv();
        }
    }

    private void qu() {
        assert (this.awM != null);
        emp emp2 = (emp)this.MessageDelegator.h(13844, this.GUID, this.awM);
        emp2.hsP = true;
        emp2.Ri = this.hF.getGUID();
        emp2.YY = this.hF.js();
        emp2.YZ = this.hF.jt();
        emp2.cAz = this.hF.iY();
        emp2.YU = this.hF.iP();
        emp2.YV = this.hF.iR();
        emp2.SE = this.hF.kv();
        emp2.aEf = (int)this.hF.kB();
        emp2.aFH = (int)this.hF.kA();
        emp2.aFZ = this.hF.jY();
        this.MessageDelegator.F(emp2);
    }

    private void qv() {
        if (this.MessageDelegator == null) {
            return;
        }
        assert (this.hF != null);
        assert (this.MessageDelegator != null);
        assert (this.awM != null);
        emj emj2 = (emj)this.MessageDelegator.h(13837, this.hF.getGUID(), this.awM);
        emj2.adc = this.hF.iY();
        emj2.RB = this.hF.jr();
        emj2.aFZ = this.hF.jY();
        emj2.SE = this.hF.kv();
        this.MessageDelegator.F(emj2);
    }

    private void bR(ldv ldv2) {
        emn emn2 = (emn)this.MessageDelegator.h(13894, this.hF.getGUID(), ldv2);
        emn2.gw(this.hF.getGUID());
        emn2.jU(this.hF.js());
        emn2.jV(this.hF.jt());
        emn2.fm(this.hF.iU());
        emn2.jW((int)this.hF.kA());
        this.MessageDelegator.F(emn2);
    }

    private void a(eml eml2, bbu bbu2, long l) {
        emm emm2 = (emm)this.MessageDelegator.h(13893, this.hF.getGUID(), eml2.aO());
        this.MessageDelegator.b(eml2, emm2);
        emm2.ch(eml2.iG());
        emm2.a(bbu2);
        emm2.aa(l);
        this.MessageDelegator.F(emm2);
    }

    private void bS(ldv ldv2) {
        ejz ejz2 = (ejz)this.MessageDelegator.h(13901, this.hF.getGUID(), ldv2);
        ejz2.ac(this.hF.getGUID(), ldv2);
        this.MessageDelegator.F(ejz2);
    }

    private void qw() {
        if (this.awM == null) {
            return;
        }
        emg emg2 = (emg)this.MessageDelegator.h(13908, this.hF.getGUID(), this.awM);
        emg2.oY(this.hF.getGUID());
        this.MessageDelegator.F(emg2);
    }

    private void qx() {
        if (!this.hF.iN()) {
            return;
        }
        assert (this.awM == null);
        ldv ldv2 = lcr.p((ldv)lcr.qEv, (int)this.hF.jr(), (int)this.hF.getGUID().enw());
        eof eof2 = (eof)this.MessageDelegator.h(32001, this.hF.getGUID(), ldv2);
        eof2.z(this.awQ == null ? new ldv[]{} : this.awQ.toArray(new ldv[this.awQ.size()]));
        this.MessageDelegator.F(eof2);
    }

    private void qy() {
        if (!this.hF.iN()) {
            return;
        }
        ayj ayj2 = new ayj();
        ayj2.aaV();
        bae bae2 = new bae();
        bae2.aaV();
        azj azj2 = new azj();
        azj2.aaV();
        ldv ldv2 = lcr.p((ldv)lcr.qEv, (int)this.hF.jr(), (int)this.hF.getGUID().enw());
        eky eky2 = (eky)this.MessageDelegator.h(13916, this.hF.getGUID(), ldv2);
        eky2.a(ayj2);
        eky2.a(bae2);
        eky2.a(azj2);
        this.MessageDelegator.F(eky2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.MessageDelegator == null) {
            if (this.awN == null) {
                this.awN = lcn.emA();
            }
            this.awN.add(dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 13827: {
                this.a((elf)dxq2);
                break;
            }
            case 13853: {
                this.a((elb)dxq2);
                break;
            }
            case 13845: {
                this.a((emq)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            case 13892: {
                this.a((eml)dxq2);
                break;
            }
            case 13895: {
                this.a((emo)dxq2);
                break;
            }
            case 13901: {
                this.a((ejz)dxq2);
                break;
            }
            case 30213: {
                this.a((fsv)dxq2);
                break;
            }
            case 13913: {
                this.a((ena)dxq2);
                break;
            }
            case 13927: {
                this.a((emz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(elb elb2) {
        long l;
        if (this.awM == null) {
            assert (false);
            return;
        }
        this.awO = l = this.MessageDelegator.bzy().getTimeInMillis();
        this.hF.iD();
        elc elc2 = (elc)this.MessageDelegator.h(13854, this.GUID, elb2.aO());
        elc2.ade = elb2.ade;
        this.MessageDelegator.F(elc2);
    }

    private void a(elf elf2) {
        assert (this.hF != null);
        assert (this.hF.getGUID() != null);
        assert (elf2.aO() != null);
        elg elg2 = (elg)this.MessageDelegator.h(13828, this.hF.getGUID(), elf2.aO());
        this.MessageDelegator.b(elf2, elg2);
        elg2.ade = this.awM;
        elg2.add = this.iV();
        elg2.awO = this.awO;
        elg2.Zd = this.hF.kv();
        this.MessageDelegator.F(elg2);
        if (elf2.bIE() && this.awM == null) {
            this.awL = true;
        }
    }

    private void c(gre gre2) {
        if (gre2.jqc == 13844) {
            this.hF.jz().j(this.awM, null);
            this.awM = null;
            this.hF.iD();
            this.qz();
            if (this.Initialized) {
                assert (this.hF.jE() != null);
                gyy gyy2 = (gyy)this.MessageDelegator.h(12049, this.hF.jE(), lcr.qAI);
                gyy2.ija = 12;
                gyy2.add = this.iV();
                gyy2.bnj = this.qp().name();
                this.MessageDelegator.F(gyy2);
            }
            return;
        }
        super.receiveMessage(gre2);
    }

    private void a(ena ena2) {
        Cloneable cloneable;
        if (ldv.au(this.awM, ena2.iG())) {
            if (this.awT != ena2.bIQ()) {
                cloneable = (gyy)this.MessageDelegator.h(12049, this.hF.jE(), lcr.qAI);
                ((gyy)cloneable).ija = 8;
                ((gyy)cloneable).bnj = this.qp().name();
                this.MessageDelegator.F((dxq)cloneable);
            }
            this.awT = ena2.bIQ();
            this.awU = ena2.qq();
        }
        cloneable = this.awM;
        this.awM = ena2.iG();
        this.add = ena2.iV();
        this.awT = ena2.bIQ();
        this.awU = ena2.qq();
        this.hF.jz().j((ldv)cloneable, this.awM);
        this.awL = false;
        this.qz();
        if (this.Initialized) {
            assert (this.hF.jE() != null);
            gyy gyy2 = (gyy)this.MessageDelegator.h(12049, this.hF.jE(), lcr.qAI);
            gyy2.ija = 12;
            gyy2.add = this.iV();
            gyy2.bnj = this.qp().name();
            this.MessageDelegator.F(gyy2);
        }
        if (this.awM == null && this.hF.iY()) {
            this.qx();
        }
        if (this.awM != null) {
            if (this.awQ != null && !this.awQ.isEmpty()) {
                for (ldv ldv2 : this.awQ) {
                    if (ldv2.equals(this.awM)) continue;
                    this.bS(ldv2);
                }
                this.awQ.clear();
            }
            this.qv();
        }
        this.hF.iD();
    }

    public void qz() {
        if (this.hF.jf() == null) {
            return;
        }
        ev ev2 = (ev)this.hF.jf().fi().ae(9840);
        if (ev2 == null) {
            return;
        }
        if (this.awM != null && !this.awL) {
            ev2.F(this.awM);
        } else {
            ev2.F(null);
        }
    }

    private void a(emq emq2) {
        if (!this.awL && ldv.au(this.awM, emq2.aO())) {
            this.awM = emq2.iG();
            this.add = emq2.iV();
            this.awT = emq2.bIQ();
            this.awU = emq2.qq();
            if (this.Initialized) {
                assert (this.hF.jE() != null);
                gyy gyy2 = (gyy)this.MessageDelegator.h(12049, this.hF.jE(), lcr.qAI);
                gyy2.ija = 12;
                gyy2.add = this.iV();
                gyy2.bnj = this.qp().name();
                this.MessageDelegator.F(gyy2);
            }
        }
    }

    private void a(eml eml2) {
        if (this.awS != null) {
            this.a(eml2, bbu.cRY, 0L);
            return;
        }
        if (this.awM != null && !this.awL) {
            this.a(eml2, bbu.cSa, 0L);
            return;
        }
        long l = System.currentTimeMillis() - this.awP;
        if (l < 10000L) {
            this.a(eml2, bbu.cRZ, 10000L - l);
            return;
        }
        if (this.awQ != null && this.awQ.contains(eml2.iG())) {
            this.a(eml2, bbu.cSb, 0L);
            return;
        }
        this.awS = eml2;
        this.bR(eml2.iG());
    }

    private void a(emo emo2) {
        if (this.awS == null) {
            assert (false);
            return;
        }
        if (emo2.vA()) {
            if (this.awQ == null) {
                this.awQ = lcn.emx();
            }
            this.awQ.add(emo2.iG());
            this.awR = System.currentTimeMillis();
            this.hF.iD();
        }
        this.a(this.awS, emo2.bIP(), 0L);
        this.awS = null;
    }

    private void a(ejz ejz2) {
        if (this.awQ != null && !this.awQ.isEmpty() && this.awQ.remove(ejz2.iG())) {
            if (this.hF.iY()) {
                this.qx();
            }
            this.hF.iD();
        }
    }

    private void a(fsv fsv2) {
        if (this.awM == null) {
            return;
        }
        if (cha.getValueByOrdinal(fsv2.dtZ) != cha.ezA) {
            return;
        }
        if (fsv2.Ri == null) {
            return;
        }
        if (!fsv2.iVs) {
            return;
        }
        if (!fsv2.iVt) {
            return;
        }
        this.qw();
    }

    public void lL() {
        if (this.awM == null) {
            return;
        }
        emk emk2 = (emk)this.MessageDelegator.h(13857, this.hF.getGUID(), this.awM);
        emk2.YU = this.hF.iP();
        emk2.YV = this.hF.iR();
        emk2.aEf = (int)this.hF.kB();
        emk2.aFH = (int)this.hF.kA();
        emk2.iuM = false;
        this.MessageDelegator.F(emk2);
    }

    private void a(emz emz2) {
        if (this.awM == null || !ldv.au(this.awM, emz2.iG())) {
            return;
        }
        this.add = emz2.iV();
        gyy gyy2 = (gyy)this.MessageDelegator.h(12049, this.hF.jE(), lcr.qAI);
        gyy2.ija = 4;
        gyy2.add = this.iV();
        this.MessageDelegator.F(gyy2);
        this.hF.iD();
    }

    public void e(loz loz2) {
        if (this.awM == null || ldv.au(this.awM, lcr.qAC) || this.awL) {
            return;
        }
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.hF.getGUID(), this.awM);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }
}

