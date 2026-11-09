/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;

public class bkj
extends bkl {
    private a dsM = a.dsT;
    private fcr dsN = null;
    private double dsO = 0.0;
    private bkz dsP = null;
    private int dsQ = 0;
    private int dsR = 0;
    private ldv dsS = null;

    public bkj() {
        this.dsy = bkd.a.drs;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9242) {
            this.Vc();
            return;
        }
        this.dsN = (fcr)fdo2;
        this.bBt = this.MessageDelegator.arc().rgz;
        this.dsO = this.bBt + this.dsN.iJm;
        this.setRadius(this.dsN.Radius);
        this.aR(this.dsN.Position);
        this.hK(null);
        this.r(this.dsN.dta);
        this.aX(-2.0);
        this.acf();
        this.dsQ = del.giD;
        this.dsR = del.giE;
    }

    @Override
    public final void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.dsM == a.dsT && this.dsO < ldz2.rgz) {
            this.f(this.dsN.Ui, this.dsN.Position);
            this.dsM = a.dsU;
            this.dsO = this.bBt + this.dsN.iJm;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.a((fuu)dxq2);
                break;
            }
            case 9219: {
                this.b((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(bkz bkz2) {
        assert (bkz2 != null);
        if (this.dsM == a.dsU) {
            assert (this.dsP == null);
            this.dsP = bkz2;
            this.dsM = a.dsV;
            this.bG(this.dsP.Ui);
        }
    }

    @Override
    protected void a(bkz bkz2, Iterator iterator) {
        assert (bkz2 != null);
    }

    @Override
    protected final void arh() {
        if (this.dsN.bOs()) {
            this.a(this.dsN, false);
        }
        this.dsH = false;
        this.Vc();
    }

    private void b(fcs fcs2) {
        if (fcs2.iJq) {
            this.dsM = a.dsT;
            this.cx(this.dsS);
            this.e(this.dsN.Ui, this.dsN.Position);
            this.dsS = null;
        } else {
            this.dsM = a.dsU;
        }
        this.dsP = null;
    }

    private void a(fuu fuu2) {
        assert (this.dsM == a.dsV);
        assert (this.dsP != null);
        if (fuu2.dtj == null) {
            this.dsM = a.dsU;
            this.dsP = null;
            return;
        }
        this.dsP.dtj = fuu2.dtj;
        if (this.dsN.iJn > 0) {
            this.a(this.dsP.dtj, this.dsN.iJn, this.dsN.iJp);
            this.dsM = a.dsT;
            this.cx(this.dsS);
            this.e(this.dsN.Ui, this.dsN.Position);
            this.dsS = null;
            this.dsP = null;
        } else if (this.dsN.iJo > 0) {
            cte[] cteArray = new cte[]{new cte()};
            cteArray[0].ResourceType = this.dsN.iJo;
            cteArray[0].asi = 1;
            cteArray[0].fex = false;
            this.a(this.dsP.dtj, cteArray, bqy.dGK);
        }
    }

    private void a(ldv ldv2, int n, float f2) {
        assert (ldv2 != null);
        assert (n > 0);
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 1;
        eam2.bnM = n;
        eam2.ikG = f2;
        this.MessageDelegator.F(eam2);
    }

    private void a(ldv ldv2, cte[] cteArray, bqy bqy2) {
        assert (ldv2 != null);
        assert (cteArray != null);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.dul = 8;
        fcy2.bst = bkd.dqO;
        fcy2.aZG = ldv2;
        fcy2.akX = ldv2;
        fcy2.dtP = cteArray;
        fcy2.b(bqy2);
        this.MessageDelegator.F(fcy2);
    }

    private void bG(ldv ldv2) {
        assert (ldv2 != null);
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, ldv2);
        fut2.jM(true);
        fut2.Ib(1);
        this.MessageDelegator.F(fut2);
    }

    private void a(int n, ldv ldv2, ldv ldv3, ljq ljq2) {
        assert (n > 0);
        assert (ldv3 != null);
        assert (ljq2 != null);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        glh2.setSpecialEffectType(n);
        glh2.o(0.0);
        glh2.mj(false);
        glh2.my(ldv2);
        glh2.setTargetObjectGUID(ldv3);
        glh2.setTargetPosition(ljq2);
        this.MessageDelegator.F(glh2);
    }

    private void cx(ldv ldv2) {
        assert (ldv2 != null);
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEb);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
    }

    private void e(ldv ldv2, ljq ljq2) {
        assert (this.dsQ > 0);
        this.a(this.dsQ, null, ldv2, ljq2);
    }

    private void f(ldv ldv2, ljq ljq2) {
        assert (this.dsR > 0);
        assert (this.dsS == null);
        this.dsS = this.MessageDelegator.lL(lcr.qEb);
        this.a(this.dsR, this.dsS, ldv2, ljq2);
    }
}

