/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  cug
 */
import java.util.Set;

abstract class azu
extends btk {
    protected ayd cCy = null;
    protected azn cwP = null;
    protected azx cHT = null;
    protected int aDM = -1;
    protected bac cHU = bac.cIS;
    protected double cHV = 0.0;
    protected bab cHW = bab.cIN;
    protected double aEl = 0.0;
    protected double aEm = 0.0;
    protected boolean cHX = false;
    protected ldv aDk = null;
    protected String bhD = null;
    protected ayb bhH = null;
    protected ljq bhF = null;
    protected float bhG = 0.0f;
    protected int cHY = 0;
    protected int cHZ = 0;
    protected int cIa = 0;
    protected int aEt = 0;
    protected float cIb = 0.0f;
    protected float cIc = 0.0f;
    protected boolean cId = true;
    protected boolean cIe = false;
    protected Set<bao> cHg = null;
    protected Set<bao> cIf = null;
    protected Set<bao> cIg = null;
    protected boolean cIh = false;

    int aat() {
        return this.aDM;
    }

    void jt(int n) {
        this.aDM = n;
    }

    bac aeN() {
        return this.cHU;
    }

    double aeO() {
        return this.cHV;
    }

    void au(double d2) {
        this.cHV = d2;
    }

    bab aeP() {
        return this.cHW;
    }

    double aeQ() {
        return this.aEl;
    }

    void av(double d2) {
        this.aEl = d2;
    }

    double aeR() {
        return this.aEm;
    }

    void aw(double d2) {
        this.aEm = d2;
    }

    boolean aeS() {
        return this.cHX;
    }

    ldv acm() {
        return this.aDk;
    }

    void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    String Xt() {
        return this.bhD;
    }

    void cz(String string) {
        this.bhD = string;
    }

    ayb Xz() {
        return this.bhH;
    }

    void a(ayb ayb2) {
        this.bhH = ayb2;
    }

    ljq Xv() {
        return this.bhF;
    }

    void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    float Xu() {
        return this.bhG;
    }

    void X(float f) {
        this.bhG = f;
    }

    int aeT() {
        return this.cHY;
    }

    void ju(int n) {
        this.cHY = n;
    }

    void k(azb azb2) {
        this.aDk = azb2.acm();
        this.bhD = azb2.Xt();
        this.bhF = azb2.Xv();
        this.bhG = azb2.Xu();
        this.cHY = (int)azb2.acq();
        this.bhH = azb2.Xz();
    }

    int aeU() {
        return this.cIa;
    }

    void jv(int n) {
        this.cIa = n;
        if (this.cIa > this.aEt) {
            this.aEt = this.cIa;
        }
    }

    int aeV() {
        return this.cHZ;
    }

    void jw(int n) {
        this.cHZ = n;
    }

    void jx(int n) {
        this.aEt = n > this.cIa ? n : this.cIa;
    }

    long aeW() {
        long l = (long)(this.cHW.length() - this.aEl);
        if (this.cHW == bab.cIO) {
            l += (long)bab.cIP.length();
        }
        return l * 1000L;
    }

    boolean aeX() {
        return this.cId;
    }

    public abstract boolean fb(ldv var1);

    public abstract bay fc(ldv var1);

    azu(ayd ayd2, azn azn2, bac bac2) {
        this.cCy = ayd2;
        this.cwP = azn2;
        this.cHU = bac2;
    }

    protected abstract np adN();

    protected abstract void a(np var1);

    protected abstract void adO();

    protected abstract void adP();

    double aeY() {
        switch (this.cHW) {
            case cIO: {
                return this.MessageDelegator.arc().rgz + this.aEl;
            }
        }
        return 0.0;
    }

    double aeZ() {
        switch (this.cHW) {
            case cIO: {
                return this.MessageDelegator.arc().rgz + this.aEl - bad.agk();
            }
        }
        return 0.0;
    }

    double afa() {
        switch (this.cHW) {
            case cIO: {
                return this.MessageDelegator.arc().rgz + this.aEl + bab.cIP.length();
            }
            case cIP: {
                return this.MessageDelegator.arc().rgz + this.aEl;
            }
        }
        return 0.0;
    }

    boolean afb() {
        return this.cIe;
    }

    Set<bao> afc() {
        return this.cIf;
    }

    Set<bao> aev() {
        return this.cHg;
    }

    int afd() {
        return this.cIf == null ? 0 : this.cIf.size();
    }

    int aeu() {
        return this.cHg == null ? 0 : this.cHg.size();
    }

    boolean q(bao bao2) {
        return this.cIf == null || bao2 == null ? false : this.cIf.contains(bao2);
    }

    boolean fq(ldv ldv2) {
        if (this.cHg == null || ldv2 == null) {
            return false;
        }
        for (bao bao2 : this.cHg) {
            if (!bao2.g(bbc.cPQ).equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    void r(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (!this.cIe) {
            return;
        }
        if (!this.aDk.equals(bao2.aiK())) {
            return;
        }
        if (this.cHg != null && this.cHg.contains(bao2)) {
            return;
        }
        if (this.cIf == null) {
            this.cIf = lcn.emx();
        }
        this.cIf.add(bao2);
    }

    void s(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (!this.cIe) {
            return;
        }
        if (bao2.ajs() != bbe.cQb) {
            return;
        }
        if (this.cHg != null && this.cHg.contains(bao2)) {
            return;
        }
        this.u(bao2);
        if (this.cHg == null) {
            this.cHg = lcn.emx();
        }
        this.cHg.add(bao2);
        this.g(bao2);
    }

    void t(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (bao2.ajs() != bbe.cQb) {
            return;
        }
        if (this.cIg == null) {
            this.cIg = lcn.emx();
        }
        this.cIg.add(bao2);
    }

    void u(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (this.cIf != null) {
            this.cIf.remove(bao2);
        }
    }

    void v(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (!this.cIe) {
            return;
        }
        if (this.cHg != null) {
            this.cHg.remove(bao2);
            this.h(bao2);
        }
    }

    boolean afe() {
        if (!this.cIe) {
            return false;
        }
        switch (this.cHW) {
            case cIO: {
                return bad.ahA() ? true : this.aEl > bad.agk();
            }
            case cIP: {
                return bad.ahz();
            }
        }
        return false;
    }

    protected void c(boolean bl, int n) {
        if (this.cHg != null && !this.cHg.isEmpty()) {
            for (bao bao2 : this.cHg) {
                if (!bl) {
                    int n2 = (int)((float)bao2.i(bbc.cPP) * bad.ahw());
                    if (bad.ahy()) {
                        n2 += (int)((float)bao2.i(bbc.cPQ) * bad.ahx());
                    }
                    if (n2 > 0) {
                        this.cCy.a(cug.fkb, n2, bqy.dGI, bda.a(bao2, n2, bao2.gk(this.cCy.getGUID()), this.MessageDelegator), false);
                    }
                }
                this.a(bao2, bl, n);
            }
        }
    }

    protected void g(bao bao2) {
    }

    protected void h(bao bao2) {
    }

    protected void i(bao bao2) {
    }

    abstract azx aeo();

    protected void a(evt evt2) {
        evt2.d(this.cHW);
        evt2.av(this.aEl);
        evt2.aw(this.aEm);
        evt2.aC(this.MessageDelegator.arc().rgz);
        evt2.fb(this.bhD);
        evt2.fx(this.aDk);
        evt2.h(this.bhH);
        evt2.cp(this.bhG);
        evt2.aH(this.bhF);
        evt2.Fr(this.cHZ);
        evt2.Fs(this.cIa);
        evt2.Ft(this.aEt);
        evt2.iP(this.cIc);
        evt2.iQ(this.cIb);
    }

    private void a(bao bao2, boolean bl, int n) {
        assert (bao2 != null);
        assert (bao2.a(bbc.cPQ) != null);
        assert (n >= 0);
        ett ett2 = (ett)this.MessageDelegator.h(20022, this.cCy.getGUID(), bao2.a(bbc.cPQ));
        ett2.kL(bl);
        ett2.jm(n);
        this.MessageDelegator.F(ett2);
    }

    private void a(etn etn2, bao bao2, boolean bl) {
        assert (etn2 != null);
        assert (bao2 != null);
        eto eto2 = (eto)this.MessageDelegator.h(20026, this.GUID, etn2.aO());
        this.MessageDelegator.b(etn2, eto2);
        eto2.D(bao2);
        eto2.jO(bl);
        this.MessageDelegator.F(eto2);
    }

    protected void a(ldv ldv2, ldv ldv3, String string) {
        evi evi2 = (evi)this.MessageDelegator.h(20032, this.cCy.getGUID(), ldv2);
        evi2.pe(ldv3);
        evi2.kv(string);
        this.MessageDelegator.F(evi2);
    }

    protected void p(ldv ldv2, ldv ldv3) {
        evj evj2 = (evj)this.MessageDelegator.h(20033, this.cCy.getGUID(), ldv2);
        evj2.pe(ldv3);
        this.MessageDelegator.F(evj2);
    }

    protected void a(ldv ldv2, ldv ldv3, ldv ldv4, int n, String string, ljq ljq2, float f) {
        evy evy2 = (evy)this.MessageDelegator.h(20034, this.cCy.getGUID(), ldv2);
        evy2.pe(ldv3);
        evy2.pf(ldv4);
        evy2.Fh(n);
        evy2.kw(string);
        evy2.cF(ljq2);
        evy2.iR(f);
        this.MessageDelegator.F(evy2);
    }

    protected void a(ldv ldv2, ldv ldv3, ldv ldv4, float f) {
        evx evx2 = (evx)this.MessageDelegator.h(20035, this.cCy.getGUID(), ldv2);
        evx2.fB(ldv3);
        evx2.pf(ldv4);
        evx2.iM(f);
        this.MessageDelegator.F(evx2);
    }

    protected void d(ldv ldv2, ldv ldv3, ldv ldv4) {
        evw evw2 = (evw)this.MessageDelegator.h(20036, this.cCy.getGUID(), ldv2);
        evw2.pe(ldv3);
        evw2.pf(ldv4);
        this.MessageDelegator.F(evw2);
    }

    protected void fr(ldv ldv2) {
        evo evo2 = (evo)this.MessageDelegator.h(20038, this.cCy.getGUID(), ldv2);
        evo2.cn(this.cIc);
        evo2.co(this.cIb);
        this.MessageDelegator.F(evo2);
    }

    protected void c(ldv ldv2, ldv ldv3, int n) {
        evn evn2 = (evn)this.MessageDelegator.h(20039, this.cCy.getGUID(), ldv2);
        evn2.fB(ldv3);
        evn2.Fq(n);
        this.MessageDelegator.F(evn2);
    }

    protected void fs(ldv ldv2) {
        evs evs2 = (evs)this.MessageDelegator.h(20037, this.cCy.getGUID(), ldv2);
        evs2.Fr(this.cHZ);
        evs2.Fs(this.cIa);
        evs2.Ft(this.aEt);
        this.MessageDelegator.F(evs2);
    }

    protected void a(ldv ldv2, bao bao2) {
        evp evp2 = (evp)this.MessageDelegator.h(20040, this.cCy.getGUID(), ldv2);
        evp2.G(bao2);
        this.MessageDelegator.F(evp2);
    }

    protected void b(ldv ldv2, bao bao2) {
        evq evq2 = (evq)this.MessageDelegator.h(20041, this.cCy.getGUID(), ldv2);
        evq2.G(bao2);
        this.MessageDelegator.F(evq2);
    }

    protected void c(ldv ldv2, bao bao2) {
        evk evk2 = (evk)this.MessageDelegator.h(20042, this.cCy.getGUID(), ldv2);
        evk2.G(bao2);
        this.MessageDelegator.F(evk2);
    }

    protected void d(ldv ldv2, bao bao2) {
        evl evl2 = (evl)this.MessageDelegator.h(20043, this.cCy.getGUID(), ldv2);
        evl2.G(bao2);
        this.MessageDelegator.F(evl2);
    }

    protected void ft(ldv ldv2) {
        if (!this.cIe) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "sendConquestUpdateMercenaryBulkUpdateMessage", "Mercenary Bulk Update Requested for Challenge Where Mercenaries Are Not Allowed!!!");
            assert (false);
            return;
        }
        evt evt2 = (evt)this.MessageDelegator.h(20044, this.cCy.getGUID(), ldv2);
        this.a(evt2);
        this.MessageDelegator.F(evt2);
    }

    protected void a(ldv ldv2, double d2) {
        evz evz2 = (evz)this.MessageDelegator.h(20045, this.cCy.getGUID(), ldv2);
        evz2.av(this.aEl);
        evz2.cj(d2);
        evz2.aC(this.MessageDelegator.arc().rgz);
        this.MessageDelegator.F(evz2);
    }

    protected void b(ldv ldv2, ldv ldv3, String string) {
        evr evr2 = (evr)this.MessageDelegator.h(20046, this.cCy.getGUID(), ldv2);
        evr2.fw(ldv3);
        evr2.fc(string);
        this.MessageDelegator.F(evr2);
    }

    protected void c(ldv ldv2, ldv ldv3, String string) {
        evm evm2 = (evm)this.MessageDelegator.h(20047, this.cCy.getGUID(), ldv2);
        evm2.fB(ldv3);
        evm2.fa(string);
        this.MessageDelegator.F(evm2);
    }

    protected void a(ldv ldv2, ldv ldv3, ldv ldv4, String string) {
        evu evu2 = (evu)this.MessageDelegator.h(20048, this.cCy.getGUID(), ldv2);
        evu2.ps(ldv3);
        evu2.fF(ldv4);
        evu2.fd(string);
        this.MessageDelegator.F(evu2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20025: {
                this.a((etn)dxq2);
                break;
            }
            case 20032: 
            case 20033: 
            case 20034: 
            case 20035: 
            case 20036: 
            case 20037: 
            case 20038: 
            case 20039: 
            case 20040: 
            case 20042: 
            case 20044: 
            case 20045: 
            case 20046: 
            case 20047: 
            case 20048: {
                this.a((evv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected abstract void a(evv var1);

    protected void a(etn etn2) {
        bao bao2 = null;
        if (this.cIg != null && !this.cIg.isEmpty()) {
            for (bao bao3 : this.cIg) {
                if (!bao3.z(etn2.aiC())) continue;
                bao2 = bao3;
                break;
            }
        }
        if (bao2 == null) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestMercenaryChallengePersistenceRestoreRequestMessage", "Cannot find challenge for city in restore request!!!... CityGUID = " + etn2.aiC().aiK().fk());
            assert (false);
            this.a(etn2, etn2.aiC(), false);
            return;
        }
        bao2.a(bbc.cPQ, etn2.aiC().a(bbc.cPQ));
        bao2.a(bbc.cPP, this.GUID);
        this.cIg.remove(bao2);
        if (this.cHg == null) {
            this.cHg = lcn.emx();
        }
        this.cHg.add(bao2);
        this.a(etn2, bao2, true);
        this.i(bao2);
    }
}

