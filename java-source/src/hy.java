/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cug
 *  dta
 *  dtc
 *  is
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public class hy
extends hv {
    private ldv aeN = null;
    private final kv Zs = new kv(this);
    private hc Zc = hc.aaz;
    private int RB;

    public void aY(ldv ldv2) {
        this.aeN = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Zs.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.Zs);
        this.a(true, this.hk(), this.GUID.bFk());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 29696: {
                this.Zs.receiveMessage(dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 11015: {
                this.a((gqg)dxq2);
                break;
            }
            case 11030: {
                this.mO();
                break;
            }
            case 11028: {
                this.a((gpb)dxq2);
                break;
            }
            case 6161: {
                this.a((gfj)dxq2);
                break;
            }
            case 11036: {
                this.a((gqy)dxq2);
                break;
            }
            case 11047: {
                this.a((grr)dxq2);
                break;
            }
            case 11014: {
                this.a((gqf)dxq2);
                break;
            }
            case 11052: {
                this.a((gqt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void mj() {
        assert (this.aeg != null);
        assert (this.aeg.aAG() != null);
        cdv cdv2 = (cdv)this.aeg;
        cex cex2 = new cex();
        ldv ldv2 = new ldv(cdv2.getGUID().ib(), cdv2.getGUID().enw(), 8);
        cex2.setGUID(ldv2);
        cex2.l(cdv2.az());
        cex2.d(cdv2.aAG());
        cex2.a(cdv2.aIh().aIg());
        cdv2.fi().b(cex2.fi());
        cex2.aJC().setGUID(cdv2.aJC().getGUID());
        cex2.aJC().b(cdv2.aJC().asf());
        for (cxc cxc2 : cdv2.aJz().jl().values()) {
            cxc cxc3 = cxc2.bfv();
            cxc3.setGUID(cxc2.getGUID());
            cex2.b(cxc3);
        }
        cdv2.aKt().b(cex2.aLU());
        this.aeg = cex2;
        super.mj();
        this.aeg.aAG().l(this.aeg.az());
        this.S(this.mb());
    }

    @Override
    protected void ml() {
        et et2 = (et)this.aeg.fi().ae(10992);
        if (et2 == null || Math.random() < (double)et2.fN()) {
            gfi gfi2 = (gfi)this.MessageDelegator.h(6160, this.GUID, lcr.qBb);
            gfi2.jgh = this.ma();
            gfi2.jgi = this.MessageDelegator.bzy().getTimeInMillis();
            this.MessageDelegator.F(gfi2);
        } else {
            this.mO();
            this.cl(2);
            this.aW(this.hk());
        }
    }

    private void a(gfj gfj2) {
        cto[] ctoArray;
        assert (this.aeN != null);
        super.ml();
        ljq ljq2 = this.aeg.aAG().av();
        cnh cnh2 = this.a(false, cug.uG((int)this.aeg.az()), null);
        cnh2.aAG().c(ljq2);
        cnh2.aAG().a(new lgl((float)(Math.random() - 0.5) * 0.1f, (float)(Math.PI * 2 * Math.random()), (float)(Math.random() - 0.5) * 0.1f));
        dta dta2 = ((bri)this.aeg.aJC().asf()).b(true, bqy.dHr);
        dtc dtc2 = this.a((brv[])dta2);
        Object object = lcn.emv();
        if (gfj2 != null && (ctoArray = gfj2.jgj) != null && ctoArray.length != 0) {
            for (cto cto2 : ctoArray) {
                ctf.a(cto2, object);
            }
        }
        if (dtc2 != null) {
            for (int i = 0; i < ((cte[])dtc2).length; ++i) {
                cte cte2 = dtc2[i];
                object.add(cte2);
            }
        }
        cnh2.c(object.toArray(new cte[object.size()]));
        if (lcw.enb() && lcw.qGX) {
            dta2 = new dta();
            dta2.setActive(true);
            dta2.Ca(0);
            dtc2 = ((dta)this.MessageDelegator).bzt();
            object = ldx.enG().enI();
            dta2.setGUID(((ldw)object).bzv());
            dtc2.c(dta2);
            cnh2.setGUID(dta2.bzv());
            cnh2.aAG().setGUID(dta2.bzv());
            cnh2.aJC().asf().setGUID(dta2.bzv());
            dta2.a((amf)((Object)cnh2));
        } else {
            this.MessageDelegator.a((amf)((Object)cnh2));
        }
        this.mO();
        this.cl(2);
        this.aW(this.hk());
    }

    private void a(gqt gqt2) {
        assert (this.aeN != null);
        if (gqt2.Position == null) {
            lfn.b(5, "SFSessionObjectPlayerMonster", "handleEnterLimboStateMessage() Position is null.");
            return;
        }
        if (gqt2.bWN() != hx.a.aeG) {
            lfn.b(5, "SFSessionObjectPlayerMonster", "handleEnterLimboStateMessage() Invalid limbostate provided: " + (Object)((Object)gqt2.bWN()));
            return;
        }
        bvd bvd2 = this.aeg.aAG();
        this.MessageDelegator.hd(bvd2.getGUID());
        this.mO();
        this.cl(2);
        this.aW(this.hk());
    }

    private void a(gqy gqy2) {
        assert (this.aeg != null);
        assert (!this.aeg.isInitialized());
        assert (this.aeg.aAG() != null);
        this.cj(1);
    }

    private void a(grr grr2) {
        this.mP();
        this.a(false, this.hk(), this.GUID.bFk());
        this.mQ();
        this.MessageDelegator.hd(this.GUID);
    }

    private void a(gqf gqf2) {
        if (gqf2.hcR == null) {
            return;
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        switch (gre2.jqc) {
            case 13315: {
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
            }
        }
    }

    private void a(brv brv2, List<cte> list) {
        if (brv2 == null) {
            return;
        }
        bqs bqs2 = (bqs)brv2.dIY;
        cte cte2 = new cte();
        cte2.ResourceType = bqs2.az();
        cte2.asi = bqs2.vf();
        ej[] ejArray = bqs2.avc();
        if (ejArray != null && ejArray.length > 0) {
            for (int i = 0; i < ejArray.length; ++i) {
                if (ejArray[i] == null || ejArray[i].getType() != 1232 || !(ejArray[i] instanceof et)) continue;
                et et2 = (et)ejArray[i];
                float f2 = cug.eV((float)et2.fN());
                et2.o(f2);
            }
        }
        ej[] ejArray2 = null;
        if (ejArray != null && ejArray.length > 0) {
            ejArray2 = new ej[ejArray.length];
            for (int i = 0; i < ejArray.length; ++i) {
                ejArray2[i] = ejArray[i];
            }
        }
        cte2.DR = ejArray2;
        list.add(cte2);
        if (brv2 instanceof bpz) {
            bpz bpz2 = (bpz)brv2;
            if (bpz2.dBr == null) {
                return;
            }
            int n = bpz2.dBr.length;
            for (int i = 0; i < n; ++i) {
                this.a(bpz2.dBr[i], list);
            }
        }
    }

    private cte[] a(brv[] brvArray) {
        if (brvArray == null || brvArray.length == 0) {
            return null;
        }
        ArrayList<cte> arrayList = lcn.emv();
        int n = brvArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(brvArray[i], arrayList);
        }
        cte[] cteArray = new cte[arrayList.size()];
        return arrayList.toArray(cteArray);
    }

    private void a(gpb gpb2) {
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 1;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.hk();
        this.MessageDelegator.F(grx2);
        is is2 = (is)this.MessageDelegator.bzx().bzt().d(lcr.qAJ);
        ik ik2 = is2.agp.bl(this.hk());
        is2.aeX.a(ik2, this.GUID.bFk(), gw.a.Ym);
        this.MessageDelegator.a((amf)this.aeg);
        this.g(this.aeg.aAG().getGUID(), true);
        cte[] cteArray = ctf.c(this.aeg.az(), 1.0f, 1.0f);
        if (cteArray != null) {
            this.a(cteArray, bqy.dFO);
        }
        this.b(this.hk(), this.aeg.aAG().getGUID(), this.aeg.aAG().az());
    }

    private void a(gqg gqg2) {
        if (gqg2.bc == null) {
            return;
        }
        if (!gqg2.aO().equals(this.hk())) {
            return;
        }
        this.mk();
    }

    private void mO() {
        if (this.aeg != null) {
            this.MessageDelegator.hd(this.aeg.getGUID());
        }
    }

    private void S(ljq ljq2) {
        assert (ljq2 != null);
        gqx gqx2 = (gqx)this.MessageDelegator.h(11035, this.GUID, this.hk());
        gqx2.hsP = true;
        gqx2.dKN = lcw.qGO;
        gqx2.diS = ljq2;
        gqx2.jpS = true;
        gqx2.Ts = this.GUID;
        gqx2.jpT = lcw.qPe;
        gqx2.jpU = lcw.qPf;
        gqx2.jpV = lcw.qPg;
        this.MessageDelegator.F(gqx2);
    }

    private void mP() {
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 2;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.hk();
        this.MessageDelegator.F(grx2);
    }

    private void a(boolean bl, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        gsk gsk2 = (gsk)this.MessageDelegator.h(11049, this.GUID, lcr.qAS);
        gsk2.ija = bl ? 4 : 5;
        gsk2.adA = ldv2;
        gsk2.Rr = ldv3;
        this.MessageDelegator.F(gsk2);
    }

    private void mQ() {
        assert (this.aeN != null);
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, this.aeN);
        gqt2.a(hx.a.aeG);
        gqt2.Position = new ljq();
        this.MessageDelegator.F(gqt2);
    }

    @Override
    public void cleanUp() {
        if (this.Zs != null) {
            this.MessageDelegator.hd(this.Zs.getGUID());
        }
    }

    public void d(hc hc2) {
        this.Zc = hc2;
    }

    public hc jT() {
        return this.Zc;
    }

    public int jr() {
        return this.RB;
    }

    public void bU(int n) {
        this.RB = n;
    }
}

