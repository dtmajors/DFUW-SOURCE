/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  azt
 *  bas
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class bak
extends btk {
    private ayd cCy = null;
    private azn cwP = null;
    private int aDM = 0;
    private azt cGL = null;
    private bai cLT = null;
    private bas cME = null;
    private double cMF = 0.0;
    private double cMG = 0.0;
    private Map<ldv, baj> cMH = null;
    private Map<ldv, baj> cMI = null;
    private Map<ldv, Integer> cMJ = null;
    private Map<ldv, Integer> cMK = null;
    private Set<ldv> cML = null;
    private nm aPb = null;
    private fzn cMM = null;
    private boolean cMN = false;
    private boolean cHv = true;
    private fyx cMO = null;
    private boolean cMP = false;
    private boolean cHx = true;
    private fyp cMQ = null;
    private boolean cMR = false;
    private boolean cHz = true;
    private Queue<dxq> cMS = null;

    public bak(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
        this.cGL = new azt(this.cCy, azn2, this);
        this.cLT = new bai(this.cCy, azn2, this);
        this.cME = new bas(this.cCy, azn2, this);
        this.cMH = lcn.emw();
        this.cMI = lcn.emw();
        this.cMJ = lcn.emw();
        this.cMK = lcn.emw();
        this.cML = lcn.emx();
    }

    public void e(nm nm2) {
        this.aPb = nm2;
    }

    public int aat() {
        return this.aDM;
    }

    void jt(int n) {
        this.aDM = n;
    }

    void ait() {
        ++this.aDM;
    }

    boolean aez() {
        return this.cGL.aez() || this.cLT.aez();
    }

    void aiu() {
        this.cGL.aeF();
    }

    void aiv() {
        this.cLT.aeF();
    }

    double aiw() {
        return this.cMF;
    }

    void aix() {
        this.cMF = bad.agm();
    }

    double aiy() {
        return this.cMG;
    }

    void aiz() {
        this.cMG = bad.agn();
    }

    public double fP(ldv ldv2) {
        return this.cMH.containsKey(ldv2) ? this.cMH.get(ldv2).ain() : 0.0;
    }

    public void a(ldv ldv2, azh azh2, boolean bl, boolean bl2) {
        if (azh2 == null) {
            return;
        }
        baj baj2 = null;
        if (azh2 == azh.cEi) {
            baj2 = this.cMH.remove(ldv2);
            if (baj2 == null) {
                return;
            }
            baj2.ais();
        } else {
            baj2 = this.cMH.get(ldv2);
            if (baj2 == null) {
                baj2 = new baj(ldv2, azh2, bl, bl2, this.MessageDelegator.arc());
                this.cMH.put(ldv2, baj2);
            } else {
                baj2.a(azh2, bl, bl2, this.MessageDelegator.arc());
            }
        }
        this.b(ldv2, !baj2.aiq(), azh2 != azh.cEi);
        this.a(ldv2, false, baj2.G(this.MessageDelegator.arc()), 0.0, 0.0, this.MessageDelegator.arc().rgz);
        this.cwP.a(1036, baj2);
    }

    public void l(ldv ldv2, boolean bl) {
        baj baj2 = this.cMH.get(ldv2);
        if (baj2 == null) {
            return;
        }
        if (!baj2.abr().acZ()) {
            return;
        }
        if (baj2.aip() == bl) {
            return;
        }
        baj2.cI(bl);
        this.cwP.a(1036, baj2);
    }

    bat fS(ldv ldv2) {
        return this.cCy == null || !this.cCy.dQ(ldv2) ? bat.cOr : (this.cCy.dR(ldv2).b(bca.cUy) ? bat.cON : bat.cOs);
    }

    azu fT(ldv ldv2) {
        if (this.cGL.ei(ldv2)) {
            return this.cGL.fi(ldv2);
        }
        if (this.cLT.ei(ldv2)) {
            return this.cLT.fQ(ldv2);
        }
        if (this.cME.ei(ldv2)) {
            return this.cME.fT(ldv2);
        }
        return null;
    }

    azu fU(ldv ldv2) {
        if (this.cGL.fh(ldv2)) {
            return this.cGL.fj(ldv2);
        }
        if (this.cLT.fh(ldv2)) {
            return this.cLT.fR(ldv2);
        }
        if (this.cME.fh(ldv2)) {
            return this.cME.gh(ldv2);
        }
        return null;
    }

    void b(ldv ldv2, String string, bbr bbr2) {
        this.cCy.a(ldv2, string, bbr2);
    }

    public int aay() {
        return this.cMH.size();
    }

    public int d(ayb ayb2) {
        int n = 0;
        for (ldv ldv2 : this.cMH.keySet()) {
            azb azb2 = this.cCy.eb(ldv2);
            if (azb2 == null || azb2.Xz() != ayb2) continue;
            ++n;
        }
        return n;
    }

    public double ek(ldv ldv2) {
        return this.cMH.containsKey(ldv2) ? this.cMH.get(ldv2).F(this.MessageDelegator.arc()) : 0.0;
    }

    public boolean el(ldv ldv2) {
        return this.cMH.containsKey(ldv2) ? this.cMH.get(ldv2).aip() : false;
    }

    public azh em(ldv ldv2) {
        return this.cMH.containsKey(ldv2) ? this.cMH.get(ldv2).abr() : azh.cEi;
    }

    public boolean en(ldv ldv2) {
        return this.cMH.containsKey(ldv2) ? this.cMH.get(ldv2).aiq() : false;
    }

    public boolean eo(ldv ldv2) {
        if (!this.cLT.eo(ldv2)) {
            return false;
        }
        if (!this.cMH.containsKey(ldv2)) {
            return true;
        }
        return !this.cMH.get(ldv2).aiq();
    }

    public boolean ZR() {
        return !this.aeA() && !this.aez();
    }

    public void k(ldv ldv2, boolean bl) {
        this.cLT.k(ldv2, bl);
    }

    public bay[] fk(ldv ldv2) {
        int n;
        bay[] bayArray = this.cGL.fk(ldv2);
        bay[] bayArray2 = this.cLT.fk(ldv2);
        bay[] bayArray3 = this.cME.fk(ldv2);
        bay[] bayArray4 = new bay[bayArray.length + bayArray2.length + bayArray3.length];
        for (n = 0; n < bayArray.length; ++n) {
            bayArray4[n] = bayArray[n];
        }
        for (n = 0; n < bayArray2.length; ++n) {
            bayArray4[bayArray.length + n] = bayArray2[n];
        }
        for (n = 0; n < bayArray3.length; ++n) {
            bayArray4[bayArray.length + bayArray2.length + n] = bayArray3[n];
        }
        return bayArray4;
    }

    public bao[] aau() {
        return this.cME.aau();
    }

    public bao[] aav() {
        return this.cME.aav();
    }

    public azx[] aaw() {
        int n;
        azx[] azxArray = this.cGL.aaw();
        azx[] azxArray2 = this.cLT.aaw();
        azx[] azxArray3 = this.cME.aaw();
        azx[] azxArray4 = new azx[azxArray.length + azxArray2.length + azxArray3.length];
        for (n = 0; n < azxArray.length; ++n) {
            azxArray4[n] = azxArray[n];
        }
        for (n = 0; n < azxArray2.length; ++n) {
            azxArray4[azxArray.length + n] = azxArray2[n];
        }
        for (n = 0; n < azxArray3.length; ++n) {
            azxArray4[azxArray.length + azxArray2.length + n] = azxArray3[n];
        }
        return azxArray4;
    }

    boolean aeA() {
        return this.cGL.aeA() || this.cLT.aeA() || this.cME.aeA();
    }

    boolean aiA() {
        return this.cGL.aeA();
    }

    boolean aiB() {
        return this.cLT.aeA();
    }

    public boolean eg(ldv ldv2) {
        return this.cGL.eg(ldv2) || this.cLT.eg(ldv2) || this.cME.eg(ldv2);
    }

    public long eh(ldv ldv2) {
        long l;
        long l2 = this.cGL.eh(ldv2);
        return l2 > (l = this.cLT.eh(ldv2)) ? l2 : l;
    }

    boolean fV(ldv ldv2) {
        return this.cLT.eg(ldv2);
    }

    public boolean fW(ldv ldv2) {
        boolean bl = false;
        for (ldv ldv3 : this.cCy.YM()) {
            if (!ldv3.equals(ldv2)) continue;
            bl = true;
            break;
        }
        return bl && (this.cGL.adI() || this.cLT.ei(ldv2));
    }

    public bab fX(ldv ldv2) {
        return this.cLT.ei(ldv2) ? this.cLT.fQ(ldv2).aeP() : bab.cIN;
    }

    boolean fY(ldv ldv2) {
        if (this.cML.contains(ldv2)) {
            return false;
        }
        return this.fV(ldv2);
    }

    void fZ(ldv ldv2) {
        this.cML.add(ldv2);
    }

    void ga(ldv ldv2) {
        this.cML.remove(ldv2);
    }

    void a(azu azu2) {
        baj baj2 = this.cMH.remove(azu2.acm());
        if (baj2 != null) {
            baj2.ais();
            this.b(baj2.afl(), !baj2.aiq(), false);
            this.a(baj2.afl(), true, 0.0, azu2.aeY(), azu2.afa(), azu2.aeO());
            this.cwP.a(1036, baj2);
        } else if (azu2.aeN() == bac.cIU) {
            this.a(azu2.acm(), true, 0.0, azu2.aeY(), azu2.afa(), azu2.aeO());
        }
    }

    void b(azu azu2) {
        this.cME.b(azu2);
    }

    void c(azu azu2) {
        this.cME.c(azu2);
    }

    void a(azu azu2, ldv ldv2) {
        this.cME.a(azu2, ldv2);
    }

    private int jL(int n) {
        if (n <= 0) {
            return 0;
        }
        int n2 = n - (int)((double)n * (double)bad.agS());
        return lew.Q(n2, 0, n);
    }

    int Y(int n, int n2) {
        int n3 = n2 - this.jL(n);
        return n3 > bad.agT() ? bad.agT() : n3;
    }

    public void c(bbr bbr2) {
        this.cGL.c(bbr2);
    }

    public void a(bbr bbr2) {
        this.cGL.a(bbr2);
    }

    public void dG(ldv ldv2) {
        this.cGL.dG(ldv2);
        this.cLT.dG(ldv2);
    }

    public void acz() {
        this.cGL.acz();
        this.cLT.acz();
        this.cME.acz();
        this.cMH.clear();
    }

    public void fl(ldv ldv2) {
        this.cMJ.remove(ldv2);
        this.cMK.remove(ldv2);
        this.cGL.fl(ldv2);
        baj baj2 = this.cMH.remove(ldv2);
        if (baj2 != null) {
            baj2.ais();
            this.b(ldv2, !baj2.aiq(), false);
            this.a(baj2.afl(), false, 0.0, 0.0, 0.0, this.MessageDelegator.arc().rgz);
            this.cwP.a(1036, baj2);
        }
    }

    public void fK(ldv ldv2) {
        this.cLT.fK(ldv2);
        this.a(ldv2, azh.cEn, false, false);
        azb azb2 = this.cCy.eb(ldv2);
        if (azb2 != null) {
            this.cCy.i(may.ugY.bD(new Object[]{azb2.Xz(), azb2.Xt(), azh.cEn.getLength()}));
        }
    }

    public void dF(ldv ldv2) {
        baj baj2 = this.cMI.remove(ldv2);
        if (baj2 != null) {
            azb azb2 = this.cCy.eb(ldv2);
            double d2 = this.MessageDelegator.arc().rgz - baj2.air();
            double d3 = baj2.ain() - d2;
            if (d3 < 0.0) {
                if (baj2.aip()) {
                    baj2.ais();
                    baj2.cI(true);
                } else {
                    baj2.ais();
                }
            }
            boolean bl = false;
            if (baj2.ain() == 0.0 && this.MessageDelegator.arc().rgz > baj2.aio() + bad.agq() - d2) {
                int n;
                if (baj2.aip() && (n = azi.b(azb2.Xz(), baj2.abr(), baj2.aiq(), (int)azb2.acq(), this.cCy)) < this.cCy.aaq() && this.cCy.a(-n, azm.cEZ, null, true) == azl.cEP) {
                    double d4 = this.MessageDelegator.arc().rgz - (baj2.aio() + bad.agq() - d2);
                    baj2.a(baj2.abr(), true, baj2.aiq(), this.MessageDelegator.arc(), d4);
                    bl = true;
                }
            } else {
                bl = true;
            }
            if (bl) {
                this.cMH.put(baj2.afl(), baj2);
                if (baj2.ain() > 0.0) {
                    this.b(baj2.afl(), !baj2.aiq(), true);
                    this.a(baj2.afl(), false, baj2.G(this.MessageDelegator.arc()), 0.0, 0.0, baj2.aio());
                }
            }
        }
    }

    public void acA() {
        this.cGL.acA();
        this.cLT.acA();
        this.cME.acA();
    }

    @Override
    public void initialize() {
        this.cGL.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)this.cGL);
        this.cLT.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.cLT);
        this.cME.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)this.cME);
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7201: {
                this.a((fzn)dxq2);
                break;
            }
            case 7203: {
                this.a((fyx)dxq2);
                break;
            }
            case 7205: {
                this.a((fyp)dxq2);
                break;
            }
            case 17417: 
            case 17428: 
            case 17430: 
            case 19969: 
            case 19973: 
            case 19975: 
            case 20004: 
            case 20027: {
                this.cGL.receiveMessage(dxq2);
                break;
            }
            case 19977: 
            case 19980: 
            case 19984: 
            case 19987: 
            case 19994: {
                this.cLT.receiveMessage(dxq2);
                break;
            }
            case 12550: 
            case 20006: {
                this.cGL.receiveMessage(dxq2);
                this.cLT.receiveMessage(dxq2);
                break;
            }
            case 20025: {
                if (this.cCy.ea(((etn)dxq2).aiC().aiK())) {
                    this.cLT.receiveMessage(dxq2);
                    break;
                }
                this.cGL.receiveMessage(dxq2);
                break;
            }
            case 19971: {
                if (this.cLT.r(dxq2)) {
                    this.cLT.receiveMessage(dxq2);
                    break;
                }
                this.cGL.receiveMessage(dxq2);
                break;
            }
            case 20007: 
            case 20009: 
            case 20011: 
            case 20013: 
            case 20015: 
            case 20017: 
            case 20019: 
            case 20021: 
            case 20023: 
            case 20029: 
            case 20030: 
            case 20049: {
                this.cME.receiveMessage(dxq2);
                break;
            }
            case 19992: {
                this.a((etc)dxq2);
                break;
            }
            case 19997: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void c(nm nm2) {
        nm2.aDy.aDM = this.aDM;
        nm2.aDy.aDV = this.cMF;
        nm2.aDy.aDW = this.cMG;
        oq[] oqArray = nm2.aDy.aDZ = this.cMH.isEmpty() ? null : new oq[this.cMH.size()];
        if (!this.cMH.isEmpty()) {
            int n = 0;
            for (baj baj2 : this.cMH.values()) {
                nm2.aDy.aDZ[n++] = new oq(baj2.afl(), baj2.abr().ordinal(), this.MessageDelegator.bzy().getTimeInMillis() - (long)((this.MessageDelegator.arc().rgz - baj2.aio()) * 1000.0), baj2.aip(), baj2.aiq());
            }
        }
        this.cGL.c(nm2);
        this.cLT.c(nm2);
        this.cME.c(nm2);
    }

    private void f(nm nm2) {
        this.aDM = nm2.aDy.aDM;
        this.cMF = nm2.aDy.aDV;
        this.cMG = nm2.aDy.aDW;
        this.cMH.clear();
        if (nm2.aDy.aDZ != null) {
            for (oq oq2 : nm2.aDy.aDZ) {
                baj baj2 = new baj(oq2.GUID, azh.getValueByOrdinal(oq2.aGh), this.MessageDelegator.arc().rgz - (double)((this.MessageDelegator.bzy().getTimeInMillis() - oq2.aGi) / 1000L), oq2.aGj, oq2.aGk, this.MessageDelegator.arc());
                azb azb2 = this.cCy.eb(baj2.afl());
                if (azb2 == null) {
                    this.cMI.put(baj2.afl(), baj2);
                    continue;
                }
                double d2 = baj2.ain();
                if (d2 < 0.0) {
                    if (baj2.aip()) {
                        baj2.ais();
                        baj2.cI(true);
                    } else {
                        baj2.ais();
                    }
                }
                boolean bl = false;
                if (baj2.ain() == 0.0 && this.MessageDelegator.arc().rgz > baj2.aio() + bad.agq()) {
                    int n;
                    if (baj2.aip() && (n = azi.b(azb2.Xz(), baj2.abr(), baj2.aiq(), (int)azb2.acq(), this.cCy)) < this.cCy.aaq() && this.cCy.a(-n, azm.cEZ, null, true) == azl.cEP) {
                        double d3 = this.MessageDelegator.arc().rgz - (baj2.aio() + bad.agq());
                        baj2.a(baj2.abr(), true, baj2.aiq(), this.MessageDelegator.arc(), d3);
                        bl = true;
                    }
                } else {
                    bl = true;
                }
                if (!bl) continue;
                this.cMH.put(baj2.afl(), baj2);
                if (!(baj2.ain() > 0.0)) continue;
                this.b(baj2.afl(), !baj2.aiq(), true);
                this.a(baj2.afl(), false, baj2.G(this.MessageDelegator.arc()), 0.0, 0.0, baj2.aio());
            }
        }
        this.cMN = true;
        this.cLT.d(nm2);
        this.cGL.d(nm2);
        this.cME.d(nm2);
        this.cMN = false;
        if (this.cLT.aeC() && this.cGL.aeC() && this.cME.aeC()) {
            this.a(this.cMM, this.cHv);
        }
    }

    void cJ(boolean bl) {
        this.cHv &= bl;
        if (this.cMN) {
            return;
        }
        if (this.cLT.aeC() && this.cGL.aeC() && this.cME.aeC()) {
            this.a(this.cMM, this.cHv);
        }
    }

    private void aeH() {
        this.cMP = true;
        this.cLT.aeH();
        this.cGL.aeH();
        this.cME.aeH();
        this.cMP = false;
        if (this.cLT.aeD() && this.cGL.aeD() && this.cME.aeD()) {
            this.a(this.cMO, this.cHx);
        }
    }

    void cK(boolean bl) {
        this.cHx &= bl;
        if (this.cMP) {
            return;
        }
        if (this.cLT.aeD() && this.cGL.aeD() && this.cME.aeD()) {
            this.a(this.cMO, this.cHx);
        }
    }

    private void aeI() {
        this.cMR = true;
        this.cLT.aeI();
        this.cGL.aeI();
        this.cME.aeI();
        this.cMR = false;
        if (this.cLT.aeE() && this.cGL.aeE() && this.cME.aeE()) {
            this.a(this.cMQ, this.cHz);
        }
    }

    void cL(boolean bl) {
        this.cHz &= bl;
        if (this.cMR) {
            return;
        }
        if (this.cLT.aeE() && this.cGL.aeE() && this.cME.aeE()) {
            this.a(this.cMQ, this.cHz);
        }
    }

    public void doTick(ldz ldz2) {
        if (this.cMS != null && !this.cMS.isEmpty() && this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY) {
            for (dxq object : this.cMS) {
                this.MessageDelegator.F(object);
            }
            this.cMS.clear();
        }
        this.cGL.doTick(ldz2);
        this.cLT.doTick(ldz2);
        this.cME.doTick(ldz2);
        if (this.cMF > 0.0) {
            this.cMF -= ldz2.qwh;
            if (this.cMF < 0.0) {
                this.cMF = 0.0;
            }
        }
        if (this.cMG > 0.0) {
            this.cMG -= ldz2.qwh;
            if (this.cMG < 0.0) {
                this.cMG = 0.0;
            }
        }
        if (!this.cMH.isEmpty()) {
            Iterator<Object> iterator = this.cMH.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                azb azb2 = this.cCy.eb((ldv)entry.getKey());
                if (azb2 == null) {
                    iterator.remove();
                    ((baj)entry.getValue()).ais();
                    this.cwP.a(1036, (baj)entry.getValue());
                    continue;
                }
                if (((baj)entry.getValue()).E(ldz2)) {
                    this.b((ldv)entry.getKey(), true, true);
                    this.a((ldv)entry.getKey(), false, 0.0, 0.0, 0.0, ldz2.rgz);
                    this.cwP.a(1036, (baj)entry.getValue());
                    azb azb3 = this.cCy.eb((ldv)entry.getKey());
                    if (azb3 != null) {
                        double d2 = ((baj)entry.getValue()).F(this.MessageDelegator.arc()) - this.MessageDelegator.arc().rgz;
                        if (d2 < 0.0) {
                            d2 = 0.0;
                        }
                        if (((baj)entry.getValue()).aip()) {
                            this.cCy.i(may.uhf.bD(new Object[]{azb3.Xz(), azb3.Xt(), d2}));
                        } else {
                            this.cCy.i(may.uhg.bD(new Object[]{azb3.Xz(), azb3.Xt(), d2}));
                        }
                    }
                }
                if (((baj)entry.getValue()).ain() != 0.0 || !(ldz2.rgz > ((baj)entry.getValue()).F(this.MessageDelegator.arc()))) continue;
                boolean bl = false;
                if (((baj)entry.getValue()).aip()) {
                    azb azb4;
                    int n = azi.b(azb2.Xz(), ((baj)entry.getValue()).abr(), ((baj)entry.getValue()).aiq(), (int)azb2.acq(), this.cCy);
                    if (n < this.cCy.aaq()) {
                        if (this.cCy.a(-n, azm.cEZ, null, true) == azl.cEP) {
                            bl = true;
                        } else {
                            bl = false;
                            azb4 = this.cCy.eb((ldv)entry.getKey());
                            if (azb4 != null) {
                                this.cCy.i(may.uhe.bD(new Object[]{azb4.Xz(), azb4.Xt()}));
                            }
                        }
                    } else {
                        azb4 = this.cCy.eb((ldv)entry.getKey());
                        if (azb4 != null) {
                            this.cCy.i(may.uhe.bD(new Object[]{azb4.Xz(), azb4.Xt()}));
                        }
                    }
                }
                if (bl) {
                    ((baj)entry.getValue()).a(((baj)entry.getValue()).abr(), true, ((baj)entry.getValue()).aiq(), ldz2);
                    this.b((ldv)entry.getKey(), !((baj)entry.getValue()).aiq(), true);
                    this.a((ldv)entry.getKey(), false, ((baj)entry.getValue()).G(ldz2), 0.0, 0.0, ldz2.rgz);
                    this.cCy.i(may.uhd.bD(new Object[]{azb2.Xz(), azb2.Xt(), ((baj)entry.getValue()).ain()}));
                } else {
                    iterator.remove();
                    ((baj)entry.getValue()).ais();
                    this.b((ldv)entry.getKey(), !((baj)entry.getValue()).aiq(), false);
                }
                this.cwP.a(1036, (baj)entry.getValue());
            }
        }
    }

    void o(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        Integer n = this.cMJ.remove(ldv2);
        int n2 = n == null ? 0 : n;
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendCityVulnerabilityUpdateMessage", "City vulnerability update request received for city " + ldv2 + ", requested vulnerable state = " + bl + ", Block-counter value = " + n2);
        if ((n2 += bl ? 1 : -1) > 0) {
            this.cMJ.put(ldv2, n2);
        }
        if (n2 > 1) {
            return;
        }
        ejx ejx2 = (ejx)this.MessageDelegator.h(18694, this.GUID, ldv2);
        ejx2.ch(this.cCy.getGUID());
        ejx2.cr(bl);
        this.MessageDelegator.F(ejx2);
    }

    void p(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        Integer n = this.cMK.remove(ldv2);
        int n2 = n == null ? 0 : n;
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendCityAllowBuildingUpdateMessage", "City allowed to build update request received for city " + ldv2 + ", requested allowed to build state = " + bl + ", Block-counter value = " + n2);
        if ((n2 += bl ? 1 : -1) < 0) {
            this.cMK.put(ldv2, n2);
        }
        if (n2 < -1) {
            return;
        }
        eic eic2 = (eic)this.MessageDelegator.h(18718, this.GUID, ldv2);
        eic2.ade = this.cCy.getGUID();
        eic2.irb = bl;
        this.MessageDelegator.F(eic2);
    }

    private void b(ldv ldv2, boolean bl, boolean bl2) {
        assert (ldv2 != null);
        eib eib2 = (eib)this.MessageDelegator.h(18739, this.GUID, ldv2);
        eib2.ch(this.cCy.getGUID());
        eib2.kc(bl);
        eib2.kd(bl2);
        this.MessageDelegator.F(eib2);
    }

    private void a(etc etc2, int n) {
        assert (etc2 != null);
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendConquestClanChallengeAbortResponseMessage", "Sending abort response message to " + etc2.aO() + ", Result = " + n);
        etd etd2 = (etd)this.MessageDelegator.h(19993, this.cCy.getGUID(), etc2.aO());
        this.MessageDelegator.b(etc2, etd2);
        etd2.DR(n);
        this.MessageDelegator.F(etd2);
    }

    private void a(euw euw2, int n, double d2) {
        assert (euw2 != null);
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendConquestSetGracePeriodResponseMessage", "Sending set grace period response message to " + euw2.aO());
        eux eux2 = (eux)this.MessageDelegator.h(19998, this.cCy.getGUID(), euw2.aO());
        this.MessageDelegator.b(euw2, eux2);
        eux2.DR(n);
        eux2.ce(d2);
        this.MessageDelegator.F(eux2);
    }

    void a(ldv ldv2, boolean bl, double d2, double d3, double d4, double d5) {
        guw guw2 = (guw)this.MessageDelegator.h(32261, this.cCy.getGUID(), lcr.qEx);
        guw2.fx(ldv2);
        guw2.cv(bl);
        guw2.ap(d2);
        guw2.ao(d3);
        guw2.aq(d4);
        guw2.ar(d5);
        if (this.MessageDelegator.bzx().bzt().dVA() != kdw.a.phY) {
            if (this.cMS == null) {
                this.cMS = lcn.emA();
            }
            this.cMS.add(guw2);
        } else {
            this.MessageDelegator.F(guw2);
        }
    }

    private void a(fzn fzn2, boolean bl) {
        assert (fzn2 != null);
        fzo fzo2 = (fzo)this.MessageDelegator.h(7202, this.cCy.getGUID(), fzn2.aO());
        this.MessageDelegator.b(fzn2, fzo2);
        fzo2.jO(bl);
        this.MessageDelegator.F(fzo2);
    }

    private void a(fyx fyx2, boolean bl) {
        assert (fyx2 != null);
        fyy fyy2 = (fyy)this.MessageDelegator.h(7204, this.cCy.getGUID(), fyx2.aO());
        this.MessageDelegator.b(fyx2, fyy2);
        fyy2.jO(bl);
        this.MessageDelegator.F(fyy2);
    }

    private void a(fyp fyp2, boolean bl) {
        assert (fyp2 != null);
        fyq fyq2 = (fyq)this.MessageDelegator.h(7206, this.cCy.getGUID(), fyp2.aO());
        this.MessageDelegator.b(fyp2, fyq2);
        fyq2.jO(bl);
        this.MessageDelegator.F(fyq2);
    }

    private void a(fzn fzn2) {
        assert (this.cMM == null);
        assert (this.aPb != null);
        this.cMM = fzn2;
        this.f(this.aPb);
    }

    private void a(fyx fyx2) {
        assert (this.cMO == null);
        this.cMO = fyx2;
        this.aeH();
    }

    private void a(fyp fyp2) {
        assert (this.cMQ == null);
        this.cMQ = fyp2;
        this.aeI();
    }

    private void a(etc etc2) {
        int n = 0;
        if (!this.aeA()) {
            n = 1;
        } else if (etc2.acm() != null) {
            if (this.cGL.ei(etc2.acm())) {
                this.cGL.fm(etc2.acm());
                n = 3;
            } else if (this.cLT.ei(etc2.acm())) {
                this.cLT.fm(etc2.acm());
                n = 3;
            } else {
                n = 2;
            }
        } else {
            this.cGL.fm(null);
            this.cLT.fm(null);
            n = 3;
        }
        this.a(etc2, n);
    }

    @Override
    public String toString() {
        String string = "Clan = " + this.cCy.iV() + " " + this.cCy.getGUID();
        String string2 = "Active Challenges = " + this.cGL.aeB() + " Attack / " + this.cLT.aeB() + " Defence";
        return this.getClass().getSimpleName() + " :: " + string + " : " + string2;
    }
}

