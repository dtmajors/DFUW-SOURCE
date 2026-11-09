/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  cug
 *  cxd
 *  dtn
 *  hvj
 *  hvy
 *  hzo
 *  jps
 *  lcr
 *  lcw
 */
public abstract class jpx
extends btk
implements bto {
    private jps bqG = null;
    private jqd nQt = null;
    private a nQu = a.nQF;
    private dtn coR = null;
    private jqa nQv = null;
    private bun dMS = null;
    private boolean nQw = false;
    private double nQx = 0.0;
    private static final double nQy = 1.0;
    private ldv afF = null;
    private ldv nQz = null;
    protected boolean nQA = false;
    ljq nQB = new ljq(0.0, Math.PI, 0.0);
    ljq nQC = new ljq(0.0, Math.PI, 0.0);
    private boolean nQD = false;

    protected jpx() {
        this.bqG = new jps();
    }

    public abstract void amX();

    public final jps dQd() {
        return this.bqG;
    }

    public final jqc dQe() {
        return this.nQt.dQe();
    }

    public final jqd dQf() {
        return this.nQt;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.coR = (dtn)this.MessageDelegator;
        this.bqG = new jps();
        this.bqG.setGUID(lcr.qBR);
        this.bqG.a(this);
        this.MessageDelegator.a((amf)this.bqG);
        this.nQt = new jqd(this, this.dQd());
        this.nQt.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.nQt);
        this.nQv = new jqa();
        this.nQv.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.nQv);
    }

    public final void a(a a2) {
        assert (a2 != null);
        block0 : switch (this.nQu) {
            case nQF: {
                switch (a2) {
                    case nQG: {
                        this.b(a2);
                        break block0;
                    }
                }
                this.a(this.nQu, a2);
                break;
            }
            case nQG: {
                switch (a2) {
                    case nQH: 
                    case nQI: 
                    case nQJ: 
                    case nQK: {
                        this.b(a2);
                        break block0;
                    }
                }
                this.a(this.nQu, a2);
                break;
            }
            case nQH: {
                switch (a2) {
                    case nQG: 
                    case nQI: {
                        this.b(a2);
                        break block0;
                    }
                }
                this.a(this.nQu, a2);
                break;
            }
            case nQI: {
                switch (a2) {
                    case nQG: {
                        this.b(a2);
                        break block0;
                    }
                }
                this.a(this.nQu, a2);
                break;
            }
            case nQJ: {
                switch (a2) {
                    case nQG: {
                        this.b(a2);
                        break block0;
                    }
                }
                this.a(this.nQu, a2);
                break;
            }
            case nQK: {
                switch (a2) {
                    case nQG: 
                    case nQH: {
                        this.b(a2);
                        break block0;
                    }
                }
                this.a(this.nQu, a2);
                break;
            }
            default: {
                lfn.b(5, "SFGamelogicActionHandlerBase", "enterState(): Invalid state provided: " + (Object)((Object)this.nQu));
                assert (false);
                return;
            }
        }
    }

    private void a(a a2, a a3) {
        assert (a2 != null);
        assert (a3 != null);
        lfn.b(5, "SFGamelogicActionHandlerBase", "handleInvalidTransition(): Transition from '" + (Object)((Object)a2) + "' to '" + (Object)((Object)a3) + "' is invalid.");
    }

    public final a dQg() {
        return this.nQu;
    }

    private void b(a a2) {
        assert (a2 != null);
        assert (this.nQu != a2);
        this.nQu = a2;
    }

    public final void uy(boolean bl) {
        if (!this.nQv.isRunning()) {
            lfn.b(5, "SFGamelogicActionHandlerBase", "leaveGankMode(): GankMode is not running");
            return;
        }
        this.a(a.nQG);
        if (bl) {
            this.dQd().dPF();
        } else {
            this.dQd().dPG();
        }
        this.nQv.reset();
    }

    public final void b(double d, double d2, int n, boolean bl) {
        assert (d > 0.0);
        assert (d2 > 0.0);
        cfj.a(cfv.KILLED, this.MessageDelegator, this.GUID);
        this.a(a.nQH);
        this.dQd().a(jps.a.nPD);
        this.nQv.c(d, d2, n, bl);
    }

    public final void f(double d, int n) {
        assert (d > 0.0);
        this.nQv.g(d, n);
    }

    public void dPx() {
        if (!lcw.qGW) {
            return;
        }
        this.dQd().dPx();
        dsu dsu2 = this.coR.bAn();
        if (lcw.enb()) {
            this.dQd().f(dsu2.gYZ, dsu2.aTc, dsu2.gYY);
        } else {
            this.dQd().f(dsu2.gYZ, null, dsu2.gYY);
        }
        bum.a(dsu2.gYY, this.dQd().bPR());
    }

    public void n(cew cew2) {
        this.afF = cew2.getGUID();
        this.dQf().b(cew2);
        this.nQv.f((cev)cew2);
        this.a(a.nQG);
    }

    public void o(cew cew2) {
        this.afF = cew2.getGUID();
        this.dQf().b(cew2);
        this.nQv.f((cev)cew2);
        this.a(a.nQG);
        dsu dsu2 = this.coR.bAn();
        if (lcw.enb()) {
            this.dQd().f(dsu2.gYZ, dsu2.aTc, dsu2.gYY);
        } else {
            this.dQd().f(dsu2.gYZ, null, dsu2.gYY);
        }
        this.dQf().dQe().nRr = false;
        this.dQf().dQe().nRs = false;
        this.dQe().ecU[5] = false;
    }

    public dsu bAn() {
        return this.coR.bAn();
    }

    public final ldv ayp() {
        return this.afF;
    }

    public final jqa dQh() {
        return this.nQv;
    }

    public final void dQi() {
        this.a(a.nQI);
    }

    public final void dQj() {
        this.a(a.nQK);
    }

    protected void aMF() {
        ((dtp)this.coR).aMF();
    }

    public void a(bun bun2) {
        this.dMS = bun2;
    }

    public final bun dQk() {
        return this.dMS;
    }

    public void uz(boolean bl) {
        this.nQw = bl;
    }

    public final boolean dQl() {
        return this.nQw;
    }

    protected boolean dQm() {
        return this.dQg() == a.nQG;
    }

    protected void dQn() {
        if (this.dQe().nRu) {
            if (this.dQd().dPA()) {
                if (this.dQm()) {
                    this.uA(false);
                    this.dQf().dQT();
                } else {
                    this.uA(true);
                }
            } else {
                this.dQd().a(this.dQe());
            }
        } else if (this.dQm()) {
            this.uA(false);
            this.dQf().dQU();
        } else {
            this.uA(true);
        }
    }

    private void uA(boolean bl) {
        this.nQD = bl;
        ljq ljq2 = this.dQe().my.esF();
        this.nQB.es(ljq2);
        if (this.dQe().nRu && !this.dQd().dPA()) {
            return;
        }
        this.dQo();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    private void dQo() {
        Object object;
        if (lcw.qGm) {
            this.nQB.y = 0.0f;
        }
        ljq ljq2 = this.nQB.esF();
        ljq2.et(this.nQC);
        ljq ljq3 = this.nQC = this.nQB.esF();
        ljq3.rlV = 0.0f;
        if (this.dQf() == null) {
            return;
        }
        byv byv2 = this.dQf().aEP();
        if (byv2 == null) {
            return;
        }
        if (byv2.vO() != 1 ? ljq2.y == 0.0f && ljq2.x == 0.0f && ljq2.rlV != 0.0f : dsv.byP().aLa() == 1 || dsv.byP().aLa() != 4 || this.dQd().b(jps.a.nPF)) {
            // empty if block
        }
        if (this.ayp() != null) {
            object = this.dQd().bPR();
            bum.a(this.ayp(), (lgl)object);
        }
        if (this.nQD) {
            this.dQe().my = new ljq();
            return;
        }
        object = (dld)this.MessageDelegator.d(lcr.rg);
        assert (object != null);
        ljq ljq4 = new ljq(0.0f, ljq2.y, 0.0f);
        if (lcw.qGm) {
            ljq4.y = 0.0f;
        }
        ljq ljq5 = new ljq(this.dQe().my.x, this.dQe().my.y, this.dQe().my.rlV);
        this.a(this.ayp(), ljq4, ljq2, ((dld)object).aw().eqT());
        this.dQe().my = new ljq();
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4869: {
                this.a((kuh)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void a(kuh kuh2) {
        if (kuh2.jnv == null) {
            lfn.b(5, "SFGamelogicActionHandlerBase", "handleGUIDContainmentResponse() ObjectGUIDs array is null.");
            return;
        }
        if (kuh2.qdO == null) {
            lfn.b(5, "SFGamelogicActionHandlerBase", "handleGUIDContainmentResponse() OwnerObjectGUIDs array is null.");
            return;
        }
        if (kuh2.bqd == null) {
            lfn.b(5, "SFGamelogicActionHandlerBase", "handleGUIDContainmentResponse() ResourceTypes array is null.");
            return;
        }
        if (kuh2.qdR == null) {
            lfn.b(5, "SFGamelogicActionHandlerBase", "handleGUIDContainmentResponse() XMLFiles array is null.");
            return;
        }
        ldv[] ldvArray = kuh2.jnv;
        ldv[] ldvArray2 = kuh2.qdO;
        int[] nArray = kuh2.bqd;
        String[] stringArray = kuh2.qdR;
        assert (ldvArray.length == ldvArray2.length);
        assert (ldvArray2.length == nArray.length);
        assert (nArray.length == stringArray.length);
        les les2 = lea.enW();
        StringBuilder stringBuilder = new StringBuilder();
        int n = ldvArray.length;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("[");
            stringBuilder.append(i);
            stringBuilder.append("] ObjectGUID=");
            stringBuilder.append(ldvArray[i]);
            stringBuilder.append(" OwnerObjectGUID=");
            stringBuilder.append(ldvArray2[i]);
            stringBuilder.append(" ResourceType='");
            stringBuilder.append(les2.getName(nArray[i]));
            stringBuilder.append("' XMLFile='");
            stringBuilder.append(stringArray[i]);
            stringBuilder.append("'\n");
            lfn.b(0, "", " " + stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    protected void a(ldv ldv2, boolean bl, cdy cdy2) {
        eez eez2 = (eez)this.MessageDelegator.h(12803, this.GUID, ldv2);
        eez2.iof = bl;
        eez2.ioe = cdy2;
        this.MessageDelegator.E(eez2);
    }

    protected void U(ldv ldv2, boolean bl) {
        eez eez2 = (eez)this.MessageDelegator.h(12803, this.GUID, ldv2);
        eez2.iof = bl;
        eez2.ioe = cdy.eod;
        this.MessageDelegator.E(eez2);
    }

    protected void VC(int n) {
        eyl eyl2 = (eyl)this.MessageDelegator.h(23553, this.GUID, this.ayp());
        eyl2.iFL = n;
        this.MessageDelegator.E(eyl2);
    }

    protected void a(ldv ldv2, ljq ljq2, ljq ljq3, ljq ljq4) {
        fiz fiz2 = (fiz)this.MessageDelegator.h(2823, this.GUID, this.ayp());
        fiz2.cJ(ljq2);
        fiz2.setDeltaRotation(ljq3);
        fiz2.cK(ljq4);
        this.dQf().axF().receiveMessage((dxq)fiz2);
    }

    protected void n(ldv ldv2, int n, int n2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (n2 > 0);
        fix fix2 = (fix)this.MessageDelegator.h(2822, this.GUID, ldv2);
        fix2.bpX = n;
        fix2.bpZ = n2;
        lfn.b(0, "SFGamelogicActionHandlerBase", "sendObjectStateChangedMessage() Sending message to " + fix2.amk());
        lfn.b(0, "SFGamelogicActionHandlerBase", "sendObjectStateChangedMessage() ModeValue='" + byw.az(n, n2) + "'");
        this.MessageDelegator.F(fix2);
    }

    protected void dQp() {
        gjo gjo2 = (gjo)this.MessageDelegator.h(4627, this.GUID, this.ayp());
        gjo2.SkillType = cxd.fHy;
        this.MessageDelegator.F(gjo2);
    }

    protected void VD(int n) {
        assert (n > 0);
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.ayp());
        gjt2.SkillType = n;
        this.MessageDelegator.F(gjt2);
    }

    protected void N(int n, ldv ldv2) {
        assert (n > 0);
        assert (ldv2 != null);
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.ayp());
        gjt2.SkillType = n;
        gjt2.aZF = 4;
        gjt2.akX = ldv2;
        this.MessageDelegator.F(gjt2);
    }

    protected void a(int n, ldv ldv2, ldv ldv3, int n2, ljq ljq2) {
        assert (n > 0);
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (n2 > 0);
        assert (ljq2 != null);
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.ayp());
        gjt2.SkillType = n;
        gjt2.aZF = 12;
        gjt2.akX = ldv2;
        gjt2.dsL = ldv3;
        gjt2.dhr = n2;
        gjt2.aZD = ljq2;
        this.MessageDelegator.F(gjt2);
    }

    protected void ah(int n, boolean bl) {
        assert (n > 0);
        gjv gjv2 = (gjv)this.MessageDelegator.h(4618, this.GUID, this.ayp());
        gjv2.SkillType = n;
        gjv2.jjt = false;
        gjv2.jju = bl;
        this.MessageDelegator.F(gjv2);
    }

    protected void dQq() {
        kjg kjg2 = (kjg)this.MessageDelegator.h(2822);
        kjg2.ts(this.GUID);
        kjg2.wD(true);
        kjg2.pEy = 3;
        kjg2.pEz = false;
        kjg2.Yc = null;
        this.MessageDelegator.a(kjg2);
    }

    protected void dQr() {
        lfn.b(0, "SFGamelogicActionHandlerBase", "triggerCoordinatorAction() Taking screenshot.");
        if (this.nQx + 1.0 > this.MessageDelegator.arc().rgz) {
            return;
        }
        this.nQx = this.MessageDelegator.arc().rgz;
        kgm kgm2 = new kgm();
        kgm2.tr(ldv.rfe);
        kgm2.ts(ldv.rfe);
        kgm2.setType(2);
        kgm2.setPrefix("Darkfall_");
        kgm2.setDirectory("");
        this.MessageDelegator.b(kgm2);
    }

    protected void dQs() {
        efd efd2 = (efd)this.MessageDelegator.h(12809, this.GUID, this.ayp());
        efd2.ios = 1;
        efd2.ioe = cdy.eod;
        this.MessageDelegator.F(efd2);
    }

    protected void dQt() {
        efd efd2 = (efd)this.MessageDelegator.h(12809, this.GUID, this.ayp());
        efd2.ios = 3;
        efd2.SkillType = cxd.fHR;
        efd2.ioe = cdy.eod;
        this.MessageDelegator.F(efd2);
    }

    protected void dQu() {
        efd efd2 = (efd)this.MessageDelegator.h(12809, this.GUID, this.ayp());
        efd2.ios = 3;
        efd2.SkillType = cxd.fJA;
        efd2.ioe = cdy.eod;
        this.MessageDelegator.F(efd2);
    }

    protected void dQv() {
        efd efd2 = (efd)this.MessageDelegator.h(12809, this.GUID, this.ayp());
        efd2.ios = 2;
        efd2.ioe = cdy.eod;
        this.MessageDelegator.F(efd2);
    }

    protected void dQw() {
        if (!lcw.enb()) {
            if (lcw.SC.lp() || this.nQA) {
                this.dQd().dPU();
            }
        } else {
            this.dQd().dPU();
        }
    }

    protected void dQx() {
        if (this.dQf().axF() == null) {
            return;
        }
        if (this.dQf().axF().aLX().aKV()) {
            boolean bl = this.dQd().b(jps.a.nPE);
            if (bl) {
                this.dQd().a(jps.a.nPF);
            } else {
                this.dQd().a(jps.a.nPE);
            }
            cpb cpb2 = (cpb)this.dQf().axF().aLX().Wm();
            cpb2.gF(!bl);
        } else if (this.dQf().aEP().aEG() && !this.dQf().aEP().aEv()) {
            this.dQd().ot();
        }
    }

    protected void dQy() {
        ej ej2;
        cbx cbx2;
        el el2;
        if (this.dQk() == null) {
            return;
        }
        ldv ldv2 = this.dQk().axO();
        if (ldv2 == null) {
            return;
        }
        this.nQz = null;
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 instanceof cbx && (el2 = (cbx2 = (cbx)amf2).fi()) != null && (ej2 = el2.ae(352)) != null) {
            this.nQz = ldv2;
        }
    }

    protected void dQz() {
        if (this.dQf() != null && this.dQf().axF() != null) {
            hzo hzo2;
            boolean bl = this.dQf().axF().aJv();
            if (hso.cxK().cxP() != null && hso.cxK().cxP().cxO() instanceof hzo && (hzo2 = (hzo)hso.cxK().cxP().cxO()).cHN() != null) {
                hzo2.cHN().pv(!bl);
                this.VC(1);
            }
        }
    }

    protected void dQA() {
        jqd jqd2 = this.dQf();
        if (jqd2 == null) {
            return;
        }
        cew cew2 = jqd2.axF();
        if (cew2 == null) {
            return;
        }
        el el2 = cew2.fi();
        if (el2 == null) {
            return;
        }
        int n = el2.ap(13696);
        if (n == -1) {
            return;
        }
        byv byv2 = jqd2.aEP();
        if (byv2 == null) {
            return;
        }
        int n2 = byv2.vK();
        if (n2 == 1 || n2 == 2) {
            return;
        }
        int n3 = byv2.vM();
        if (n3 != 1) {
            return;
        }
        dsu dsu2 = this.bAn();
        if (dsu2 == null) {
            return;
        }
        if (dsu2.gYX == null) {
            return;
        }
        gev gev2 = (gev)this.MessageDelegator.h(35084, this.getGUID(), dsu2.gYX);
        this.MessageDelegator.E(gev2);
    }

    protected void dQB() {
        this.dQf().dQe().nRs = !this.dQf().dQe().nRs;
    }

    protected void dQC() {
        if (this.dQf().dQe().nRv) {
            this.dQf().dQe().nRw = false;
            this.dQf().dQe().nRv = false;
        } else {
            this.dQf().dQe().nRw = true;
            this.dQf().dQe().nRv = true;
        }
    }

    protected void dQD() {
        byv byv2 = this.dQf().aEP();
        if (byv2 == null) {
            return;
        }
        if (byv2.Uu() || byv2.Uv() || byv2.aED()) {
            return;
        }
        boolean bl = this.dQf().dQe().nRr = !this.dQf().dQe().nRr;
        if (this.dQf().dQe().nRr) {
            if (!this.dQf().dQe().nPX) {
                this.dQf().dQX();
            }
        } else if (this.dQf().dQe().nPX) {
            this.dQf().dQZ();
        }
    }

    protected void dQE() {
        if (!lcw.enb()) {
            if (lcw.SC.lp() || this.nQA) {
                this.dQe().nRu = !this.dQe().nRu;
            }
        } else {
            this.dQe().nRu = !this.dQe().nRu;
        }
    }

    protected void dQF() {
        if (!lcw.enb()) {
            if (lcw.SC.lp()) {
                if (this.dQd().dPI()) {
                    this.dQd().dPF();
                } else {
                    this.dQd().dPG();
                }
            }
        } else if (this.dQd().dPI()) {
            this.dQd().dPF();
        } else {
            this.dQd().dPG();
        }
    }

    protected void uB(boolean bl) {
        if (lcw.qOR) {
            bsh bsh2;
            int n;
            hvy hvy2;
            hvj hvj2 = hso.cxK().cxP();
            hvy hvy3 = hvy2 = hvj2 != null ? hso.cxK().cxP().cyZ() : null;
            if (hvy2 != null && !bl && (n = hvy2.czY()) != -1) {
                this.ah(n, true);
                return;
            }
            bsh bsh3 = bsh2 = hvy2 != null ? hvy2.cAc() : null;
            if (bsh2 == null) {
                return;
            }
        }
        if (this.dQf().aEP().aEG()) {
            this.VD(cxd.fHk);
        } else {
            this.VD(cxd.fHg);
        }
    }

    protected void dQG() {
    }

    public boolean d(float f, int n) {
        boolean bl = lea.enW().isDescendant(n, cug.fqD);
        boolean bl2 = lea.enW().isDescendant(n, cug.fqr);
        boolean bl3 = lea.enW().isDescendant(n, cug.fkr);
        boolean bl4 = lea.enW().isDescendant(n, cug.fgB);
        if (this.dQd() != null && this.dQd().dPv()) {
            if (bl) {
                return f <= 6.0f;
            }
            if (bl2) {
                return f <= 14.0f;
            }
            if (bl4) {
                return f <= 6.5f;
            }
            if (bl3) {
                return f <= 7.0f;
            }
            return f <= 7.0f;
        }
        if (this.dQd() != null && this.dQd().dPw()) {
            if (bl) {
                return f <= 3.5f;
            }
            if (bl2) {
                return f <= 14.0f;
            }
            if (bl4) {
                return f <= 3.5f;
            }
            if (bl3) {
                return f <= 4.0f;
            }
            return f <= 3.5f;
        }
        if (bl) {
            return f <= 1.7f;
        }
        if (bl2) {
            return f <= 10.0f;
        }
        if (bl4) {
            return f <= 1.7f;
        }
        if (bl3) {
            return f <= 2.0f;
        }
        return f <= 2.0f;
    }

    public final ldv dQH() {
        return this.nQz;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 16645) {
            this.a((ern)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void a(ern ern2) {
        if (ern2.ilu == 79) {
            this.nQA = ern2.izI;
        } else {
            lfn.b(5, "SFGamelogicActionHandlerBase", "handleCommandGameMasterMessage() Unhandled operation type " + ern2.ilu + " received.");
        }
    }
}

