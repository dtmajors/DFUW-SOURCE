/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cdb
 *  cew
 *  cug
 *  dtn
 *  lcr
 *  lcw
 *  lkv
 */
import java.util.ArrayList;
import java.util.List;

public abstract class cdw
extends cdb
implements asd {
    protected bfs enP = null;
    protected ldv enQ = null;
    private ldv enR = null;
    private ldv enS = null;
    cew baO = null;

    public cdw(boolean bl) {
        super(bl);
    }

    public final bfq aIv() {
        return this.enP;
    }

    public final void kz(ldv ldv2) {
        this.enQ = ldv2;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.enP != null) {
            this.enP.doTick(ldz2);
        }
    }

    public final hw aKx() {
        assert (this.dwG);
        return (hw)this.aJP();
    }

    public final float mr() {
        assert (this.isServerObject());
        hw hw2 = (hw)this.aJP();
        return hw2.mr();
    }

    public final void b(byv byv2, boolean bl) {
        assert (byv2 != null);
        super.b(byv2, bl);
        if (!this.dwG && this.enQ != null) {
            this.a(this.enQ, byv2.aEl());
        }
    }

    public void initialize() {
        if (this.dwG) {
            eq eq2 = new eq();
            eq2.setType(10352);
            eq2.x(false);
            this.fi().b(eq2);
            et et2 = new et();
            et2.setType(10512);
            et2.o(this.aKx().mt());
            this.fi().b(et2);
            et2 = new et();
            et2.setType(10528);
            et2.o(this.aKx().mu());
            this.fi().b(et2);
        }
        super.initialize();
        if (this.dwG) {
            this.enP = new bfs(this);
            this.enP.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.enP);
        }
    }

    public final boolean Ux() {
        return true;
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.enP != null) {
            this.MessageDelegator.hd(this.enP.getGUID());
        }
        if (!this.dwG) {
            this.ayd();
            this.aKz();
        }
    }

    protected void aIw() {
        super.aIw();
        if (!this.dwG) {
            this.aKy();
        }
    }

    protected void aIx() {
        super.aIx();
        if (!this.dwG) {
            this.ayd();
            this.aKz();
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 4: {
                byv byv2 = ((ui)uk2).aWn;
                if (this.aJI()) {
                    this.aJD().e(byv2);
                } else {
                    byv byv3 = this.aJD().aEK().aEP();
                    this.aJD().aEK().f(byv2);
                    this.h(byv2);
                    if (lcw.ena() && byv2.vM() == 3 && byv3.vM() != 3 && this.aAG() != null) {
                        this.aAG().er(false);
                    }
                }
                if (this.enQ != null) {
                    this.a(this.enQ, byv2.aEl());
                }
                this.a(cbx.a.ekJ);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    private void aKy() {
        assert (!this.dwG);
        Integer n = lea.eoV().get(this.az());
        if (n == null) {
            return;
        }
        this.enR = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aUa = this.enR;
        glh2.oV = 0.0;
        glh2.jkR = true;
        glh2.akX = this.aAG().getGUID();
        glh2.aZD = this.aAG().av();
        glh2.jkS = 0;
        this.MessageDelegator.F(glh2);
    }

    private void aKz() {
        assert (!this.dwG);
        if (this.enR == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.enR;
        this.MessageDelegator.F(glj2);
        this.enR = null;
    }

    @Override
    public final boolean hR(int n) {
        assert (!this.isServerObject());
        return this.aJX().hR(n);
    }

    @Override
    public final boolean hS(int n) {
        assert (!this.isServerObject());
        return this.aJX().hS(n);
    }

    @Override
    public final boolean hT(int n) {
        assert (!this.isServerObject());
        return this.aJX().hT(n);
    }

    @Override
    public List<Integer> Td() {
        if (this.dwG || this.aAG() == null) {
            return lcn.abH(0);
        }
        ArrayList<Integer> arrayList = lcn.abH(5);
        List<lkr> list = ((bvf)this.aAG()).azA().eue();
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            lkr lkr2 = list.get(i2);
            int n2 = lkr2.etO();
            int n3 = lkv.adn((int)n2);
            if (n3 != 0x5000000) continue;
            arrayList.add(n2);
        }
        return arrayList;
    }

    @Override
    public final float FZ() {
        assert (!this.isServerObject());
        return this.aJD().aEO();
    }

    @Override
    public final boolean hU(int n) {
        assert (!this.isServerObject());
        return this.aJX().hU(n);
    }

    public void c(ew ew2, int n) {
        assert (!this.dwG);
        Integer n2 = (Integer)ew2.getValue();
        switch (ew2.getType()) {
            case 11008: {
                if (lcw.emZ()) {
                    return;
                }
                if (n == 0) {
                    return;
                }
                if (this.aAG() == null) {
                    return;
                }
                String string = lea.epl().get(n2);
                if (string == null) {
                    return;
                }
                glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
                glh2.akX = this.KY();
                glh2.aZG = new ldv(n2.intValue());
                glh2.aZD = new ljq();
                glh2.jkS = 1;
                glh2.SpecialEffectType = string.toLowerCase().contains("2d") ? del.gkg : del.gkf;
                this.MessageDelegator.F(glh2);
                break;
            }
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12808: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void aKl() {
        this.aJR();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    protected void v(ljq ljq2, float f2) {
        if (this.dwG || lcw.emZ() || this.ScheduledForRemoval) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        if (this.enS == null) {
            ffb2.iKO = ffb.a.iKR;
            this.enS = this.MessageDelegator.bzv();
        } else {
            ffb2.iKO = ffb.a.iKS;
        }
        ffb2.dbx = this.enS;
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = cug.fmu;
        ffb2.iKQ = ljq2;
        ffb2.eir = f2;
        ffb2.eis = new ljp(1.0f, 1.0f);
        ffb2.Rs = this.GUID;
        this.MessageDelegator.F(ffb2);
    }

    protected void ayd() {
        if (this.dwG || lcw.emZ() || this.enS == null) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = this.enS;
        this.MessageDelegator.F(ffb2);
        this.enS = null;
    }

    protected cew nY() {
        if (this.dwG) {
            return null;
        }
        if (this.baO == null) {
            cew cew2;
            dtn dtn2 = (dtn)this.MessageDelegator.bzx().bzt().od(lcr.qzp);
            if (dtn2 == null) {
                return null;
            }
            dsu dsu2 = dtn2.bAn();
            if (dsu2 == null) {
                return null;
            }
            this.baO = cew2 = (cew)this.MessageDelegator.bzx().bzt().d(dsu2.gYY);
        }
        return this.baO;
    }
}

