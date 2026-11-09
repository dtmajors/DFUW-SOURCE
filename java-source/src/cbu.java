/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
import java.util.Map;

public class cbu
extends btk {
    private final cbx Qg;
    private boolean ekf = false;
    private boolean ekg = false;
    private String ekh = null;
    private ldv eki = null;
    private ljq ekj = null;
    private lgl ekk = null;
    private ljq ekl = null;
    private lgl ekm = null;
    private boolean ekn = true;
    private double eko = 0.0;
    private static final double ekp = 12.0;
    private static final double ekq = 10.0;
    private int bnh = 0;
    private boolean ekr = false;
    private ljq eks = new ljq();
    private lgl ekt = new lgl();
    private ljq eku = null;
    private lgl ekv = null;
    private boolean ekw = false;

    public cbu(cbx cbx2) {
        assert (cbx2 != null);
        this.Qg = cbx2;
        this.aqR();
    }

    public boolean aHY() {
        return this.MessageDelegator.arc().rgz > this.eko + 12.0 && this.ekg;
    }

    public void fw(boolean bl) {
        this.ekn = bl;
        if (this.ekg) {
            this.aIc();
            this.j(this.eks, this.ekt);
        }
    }

    public boolean fx(boolean bl) {
        assert (this.Qg.isServerObject());
        if (!this.ekn && bl) {
            return false;
        }
        this.ekn = !this.ekn;
        this.eko = this.MessageDelegator.arc().rgz;
        this.ekr = true;
        this.ekw = bl;
        this.aIa();
        fuk fuk2 = (fuk)this.MessageDelegator.h(1045, this.Qg.getGUID(), this.Qg.getGUID());
        fuk2.oV = this.MessageDelegator.arc().rgz;
        fuk2.iWZ = this.ekn;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)(this.MessageDelegator.arc().rgz + 10.0);
        gqu2.iXB = fuk2;
        this.MessageDelegator.F(gqu2);
        return true;
    }

    public void e(boolean bl, double d2) {
        if (!this.ekg) {
            return;
        }
        assert (!this.Qg.isServerObject());
        this.ekn = bl;
        this.eko = d2;
        this.ekr = true;
        this.aIa();
        if (this.Qg.aAG() != null) {
            ljq ljq2 = this.Qg.aAG().av();
            ljq2.es(this.ekj);
            this.b(ljq2, del.gje);
        }
    }

    private void aqR() {
        this.ekj = new ljq();
        this.ekk = new lgl();
        this.ekl = new ljq();
        this.ekm = new lgl();
        assert (this.Qg.aAG() != null);
        if (this.Qg.aAG() == null) {
            lfn.b(5, "SFGateManager", "setupAttachPoints() meshobhect == null");
            return;
        }
        Map<String, eh> map = ei.ao(this.Qg.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint Structure Gate Open");
        if (eh2 == null) {
            assert (false);
        } else {
            this.ekl = new ljq(eh2.fb());
            this.ekm = new lgl(eh2.getRotation());
        }
        if ((eh2 = map.get("AttachPoint Structure Gate Closed")) == null) {
            assert (false);
        } else {
            this.ekj = new ljq(eh2.fb());
            this.ekk = new lgl(eh2.getRotation());
        }
    }

    public void remove() {
        if (this.ekg) {
            this.MessageDelegator.hd(this.getGUID());
        } else {
            this.ekf = true;
        }
    }

    public void doTick(ldz ldz2) {
        if (!this.ekr) {
            if (this.Qg.aAG() != null && this.Qg.aAG().azb() != null && this.Qg.aAG().azc() != null && !this.Qg.aAG().azb().equals(this.eku)) {
                this.eku = this.Qg.aAG().av();
                this.ekv = this.Qg.aAG().aw();
                this.aIc();
                this.j(this.eks, this.ekt);
            }
        } else {
            this.aHZ();
        }
    }

    private void aHZ() {
        lgl lgl2;
        lgl lgl3;
        ljq ljq2;
        ljq ljq3;
        if (this.Qg.isServerObject()) {
            int n = mfz.ex(this.MessageDelegator.arc().rgz);
            if (n == this.bnh) {
                return;
            }
            this.bnh = n;
        }
        if (this.ekn) {
            ljq3 = this.ekl;
            ljq2 = this.ekj;
            lgl3 = this.ekm;
            lgl2 = this.ekk;
        } else {
            ljq3 = this.ekj;
            ljq2 = this.ekl;
            lgl3 = this.ekk;
            lgl2 = this.ekm;
        }
        float f2 = (float)((this.MessageDelegator.arc().rgz - this.eko) / 10.0);
        f2 = lew.A(f2, 0.0f, 1.0f);
        ljq ljq4 = ljq.e(ljq3, ljq2, f2);
        lgl lgl4 = lgl.b(lgl3, lgl2, f2);
        this.k(ljq4, lgl4);
        this.j(this.eks, this.ekt);
        if (this.eko + 10.0 < this.MessageDelegator.arc().rgz) {
            this.ekr = false;
            this.aIb();
        }
    }

    private void aIa() {
        if (this.Qg.isServerObject()) {
            return;
        }
    }

    private void b(ljq ljq2, int n) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(n);
        glh2.o(0.0);
        glh2.setTargetPosition(ljq2);
        glh2.mj(true);
        this.MessageDelegator.F(glh2);
    }

    private void aIb() {
        if (this.Qg.isServerObject()) {
            eq eq2 = this.Qg.fi().af(1408);
            if (eq2 == null) {
                return;
            }
            eq2.x(this.ekn);
            if (!this.ekn && this.ekw) {
                this.ekw = false;
                this.fx(this.ekw);
                return;
            }
            return;
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            case 1: {
                this.a((ksv)ktf2);
            }
        }
        super.receiveResourceResponse(ktf2);
    }

    private void a(ksv ksv2) {
        this.ekg = true;
        if (ksv2.getResult() != 0) {
            assert (false);
            this.eki = null;
            if (this.ekf) {
                this.MessageDelegator.hd(this.getGUID());
            }
        } else {
            this.eki = ksv2.oq();
            if (this.ekf) {
                this.MessageDelegator.hd(this.getGUID());
            } else {
                if (this.Qg.aAG() != null) {
                    this.eku = new ljq(this.Qg.aAG().azb());
                    this.ekv = new lgl(this.Qg.aAG().azc());
                }
                this.aIc();
                this.j(this.eks, this.ekt);
            }
        }
    }

    private void j(ljq ljq2, lgl lgl2) {
        if (this.eki == null) {
            return;
        }
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.Rs = this.eki;
        kky2.hsP = false;
        kky2.iBr = false;
        kky2.ec = this.getGUID();
        kky2.pHF = 8;
        kky2.pHG = ljq2.x;
        kky2.pHH = ljq2.y;
        kky2.pHI = ljq2.rlV;
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        this.MessageDelegator.a(kky2);
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.ekh == null) {
            return;
        }
        this.azh();
    }

    private void aIc() {
        if (this.Qg.aAG() == null) {
            lfn.b(5, "SFGateManager", "calculateGatePosition() meshobhect == null");
            return;
        }
        ljq ljq2 = new ljq(this.Qg.aAG().azb());
        lgl lgl2 = new lgl(this.Qg.aAG().azc());
        if (this.ekn) {
            ljq2.es(lgl2.eq(this.ekj));
            lgl2.Y(this.ekk);
        } else {
            ljq2.es(lgl2.eq(this.ekl));
            lgl2.Y(this.ekm);
        }
        this.eks = ljq2;
        this.ekt = lgl2;
    }

    private void k(ljq ljq2, lgl lgl2) {
        if (this.Qg.aAG() == null) {
            return;
        }
        ljq ljq3 = new ljq(this.Qg.aAG().azb());
        lgl lgl3 = new lgl(this.Qg.aAG().azc());
        ljq3.es(lgl3.eq(ljq2));
        lgl3.Y(lgl2);
        this.eks = ljq3;
        this.ekt = lgl3;
    }

    private void azh() {
        if (this.Qg.aAG() != null) {
            this.eku = this.Qg.aAG().av();
            this.ekv = this.Qg.aAG().aw();
        }
        this.aIc();
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        if (this.Qg.isServerObject()) {
            krr2.aaA(8);
        } else {
            krr2.aaA(4);
        }
        krr2.hC(this.GUID);
        krr2.ts(this.GUID);
        krr2.xc(this.ekh);
        krr2.xC(true);
        krr2.xe("");
        krr2.xd("");
        krr2.c(this.eks);
        krr2.a(this.ekt);
        krr2.setObjectType(cug.fos);
        this.MessageDelegator.a(krr2);
    }

    private void aId() {
        if (this.eki == null) {
            return;
        }
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ts(this.GUID);
        klb2.HX(klb.iHB);
        klb2.hC(this.eki);
        this.MessageDelegator.a(klb2);
        this.eki = null;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aId();
    }

    public final boolean aIe() {
        return this.ekn;
    }

    public final void fy(boolean bl) {
        this.ekn = bl;
    }

    public final String getMeshXML() {
        return this.ekh;
    }

    public final void setMeshXML(String string) {
        this.ekh = string;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5635: {
                this.b((fut)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(fut fut2) {
        fuu fuu2 = (fuu)this.MessageDelegator.h(5636, this.GUID, fut2.aO());
        this.MessageDelegator.b(fut2, fuu2);
        fuu2.iXt = fut2.bSm();
        if ((fut2.bSm() & 1) != 0) {
            fuu2.dtj = null;
        }
        if ((fut2.bSm() & 4) != 0) {
            fuu2.Uj = this.eki;
        }
        this.MessageDelegator.F(fuu2);
    }
}

