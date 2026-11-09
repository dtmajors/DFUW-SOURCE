/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class coy
extends cox {
    private mgc eRe = null;
    private float eRf = 0.0f;
    private float eRg = 0.0f;
    private ldv eRh = null;
    private ldv eRi = null;
    private ldv eRj = null;
    private lgl eRk = new lgl();
    private ljq eRl = new ljq();
    private static float eRm = 0.06666667f;
    private float eRn = 0.0f;
    private bwc eRo = null;
    private bwc eRp = null;
    List<ldv> eRq = lcn.emv();
    ldv eRr = null;

    public coy() {
        super(false);
        if (!lcw.emZ() || lcw.enb()) {
            this.eRo = new bwc(false);
            this.eRp = new bwc(false);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eRo != null) {
            this.eRo.cleanUp();
        }
        if (this.eRp != null) {
            this.eRp.cleanUp();
        }
        for (ldv ldv2 : this.eRq) {
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
            glj2.jkV = 1;
            glj2.aUa = ldv2;
            this.MessageDelegator.F(glj2);
        }
        this.eRq.clear();
        if (this.eRr != null) {
            glj glj3 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
            glj3.jkV = 1;
            glj3.aUa = this.eRr;
            this.MessageDelegator.F(glj3);
            this.eRr = null;
        }
    }

    private ldv lr(ldv ldv2) {
        return lcr.ak((ldv)ldv2, (int)this.dj);
    }

    @Override
    public joc aVr() {
        return joc.nGY;
    }

    public void ls(ldv ldv2) {
        if (this.aWr() == null) {
            return;
        }
        if (this.aWr().aCi() > 0) {
            this.eRr = this.MessageDelegator.lL(lcr.qEa);
            glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
            glh2.SpecialEffectType = this.aWr().aCi();
            glh2.aUa = this.eRr;
            glh2.akX = this.aAG().getGUID();
            glh2.aZD = this.aAG().av();
            glh2.aZG = ldv2;
            glh2.jkS = 1;
            this.MessageDelegator.F(glh2);
        }
    }

    public void aWt() {
        if (this.eRr != null) {
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
            glj2.jkV = 1;
            glj2.aUa = this.eRr;
            this.MessageDelegator.F(glj2);
            this.eRr = null;
        }
    }

    @Override
    protected void aIw() {
        super.aIw();
        bwm bwm2 = lea.eok().get(this.az());
        if (bwm2 == null) {
            assert (false) : "No CannonInfo for this: " + this.pa();
            return;
        }
        this.a(bwm2);
        if (this.eRo != null) {
            this.eRo.setMessageDelegator(this.MessageDelegator);
            this.eRo.d(this.aAG());
            this.eRo.f("AttachPoint_Gun Damage 01", 10, this.eQU.aBR());
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            if (et2 != null) {
                this.eRo.b(et2, f2);
            }
        }
    }

    public void a(ldv ldv2, ldv ldv3, ldv ldv4, ljq ljq2, lgl lgl2, bvd bvd2) {
        eh eh2;
        this.eRh = ldv2;
        this.eRi = ldv3;
        this.eRj = ldv4;
        super.a(ldv2, ldv3, ldv4, ljq2, lgl2, bvd2);
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map != null && (eh2 = map.get("AttachPoint_Gun Base Gun")) != null) {
            this.bo(eh2.fb());
            this.p(new lgl(eh2.getRotation()));
        }
        if (this.eRp != null) {
            this.eRp.setMessageDelegator(this.MessageDelegator);
            this.eRp.d(bvd2);
            this.eRp.f("AttachPoint_Gun Damage 01", 10, this.eQU.aBR());
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            if (et2 != null) {
                this.eRp.b(et2, f2);
            }
        }
    }

    public void d(et et2, float f2) {
        if (et2.getType() == 352) {
            this.g(et2);
        }
        super.d(et2, f2);
    }

    private void g(et et2) {
        float f2 = this.fi().ai(352);
        if (this.eRo != null) {
            this.eRo.b(et2, f2);
        }
        if (this.eRp != null) {
            this.eRp.b(et2, f2);
        }
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.eRe != null) {
            if (this.eRh == null) {
                return;
            }
            this.eRe.od((float)ldz2.qwh);
            ljq ljq2 = new ljq(this.eRe.eya(), this.eRe.exZ(), 0.0f);
            if (!ljq2.equals(this.eRl)) {
                lgl lgl2;
                this.eRl = new ljq(ljq2);
                ljq ljq3 = this.aSL().eqT();
                ljq2.es(ljq3);
                this.eRk = lgl2 = new lgl(ljq2);
                knj knj2 = (knj)this.MessageDelegator.h(778);
                knj2.hsP = false;
                knj2.iBr = false;
                knj2.biF = lgl2;
                knj2.doP = this.eRh;
                knj2.ehv = this.eRi;
                knj2.ehw = this.eRj;
                knj2.biE = this.aSK();
                knj2.ec = this.getGUID();
                knj2.pPN = 256;
                this.MessageDelegator.a(knj2);
            }
        }
        this.aqR();
    }

    private void ad(ldz ldz2) {
        if ((double)(this.eRn + eRm) > ldz2.rgz) {
            return;
        }
        this.eRn = (float)ldz2.rgz;
        this.duy = true;
        geo geo2 = (geo)this.MessageDelegator.h(777, this.getGUID(), this.lr(this.getGUID()));
        geo2.Rotation = this.eRk;
        this.MessageDelegator.F(geo2);
    }

    public void l(ljq ljq2, lgl lgl2) {
        this.eSS = ljq2;
        this.eST = lgl2;
        this.ad(this.MessageDelegator.arc());
    }

    private void aqR() {
        if (this.ePI) {
            return;
        }
        if (this.eQU == null) {
            return;
        }
        if (this.eQU.aBZ()) {
            this.ePI = true;
            return;
        }
        if (this.aAG() == null) {
            return;
        }
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        assert (map != null);
        eh eh2 = map.get("AttachPoint_Gun Camera");
        assert (eh2 != null);
        this.eSU = eh2.fb();
        this.eSV = new lgl(eh2.getRotation());
        this.ePI = true;
    }

    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
    }

    public boolean aWu() {
        return this.eQV + this.eQS < this.MessageDelegator.arc().rgz;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8452: {
                if (!this.aWu()) break;
                if (this.eST == null) {
                    return;
                }
                if (this.eSS == null) {
                    return;
                }
                fga fga2 = (fga)this.MessageDelegator.h(8452, this.getGUID(), lcr.ak((ldv)this.getGUID(), (int)this.dj));
                fga2.Rotation = this.eST;
                fga2.Position = this.eSS;
                this.MessageDelegator.E(fga2);
                this.eQV = this.MessageDelegator.arc().rgz;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public boolean aBZ() {
        assert (this.eQU != null);
        return this.eQU.aBZ();
    }

    public void aVi() {
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.hsP = false;
        knj2.iBr = false;
        knj2.biF = this.aSL();
        knj2.doP = this.eRh;
        knj2.ehv = this.eRi;
        knj2.ehw = this.eRj;
        knj2.biE = this.aSK();
        knj2.ec = this.getGUID();
        knj2.pPN = 256;
        this.MessageDelegator.a(knj2);
        this.eRe = new mgc();
        assert (this.eQU != null);
        this.eRe.nT(this.eQU.aBI());
        this.eRe.nY(this.eQU.aBH());
        this.eRe.nZ(this.eQU.aBE());
        this.eRe.nU(this.eQU.aBE());
        this.eRe.oa(this.eQU.aBE());
        this.eRe.nV(this.eQU.aBE());
        this.eRe.nS(this.eQU.aBG());
        this.eRe.nX(this.eQU.aBG());
        float f2 = 40.0f;
        this.eRe.nR(f2);
        this.eRe.nW(f2);
        bvm bvm2 = (bvm)this.aAG();
        assert (bvm2.azx() != null);
        bvm2.azx().aAV();
        this.eRf = 0.0f;
        this.eRg = 0.0f;
    }

    public void aVj() {
        this.eRe = null;
        bvm bvm2 = (bvm)this.aAG();
        if (bvm2 == null) {
            return;
        }
        if (bvm2.azx() == null) {
            return;
        }
        bvm2.azx().aAW();
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.hsP = false;
        knj2.iBr = false;
        knj2.biF = this.aSL();
        knj2.doP = this.eRh;
        knj2.ehv = this.eRi;
        knj2.ehw = this.eRj;
        knj2.biE = this.aSK();
        knj2.ec = this.getGUID();
        knj2.pPN = 256;
        this.MessageDelegator.a(knj2);
    }

    public void aK(ljq ljq2) {
    }

    public void b(ljq ljq2, ljq ljq3, ljq ljq4) {
        if (this.eRe != null) {
            float f2 = ljq3.y;
            float f3 = ljq3.x;
            this.eRg = ljq3.y;
            this.eRf = ljq3.x;
            this.eRe.nP(f2);
            this.eRe.nQ(f3);
        }
    }
}

