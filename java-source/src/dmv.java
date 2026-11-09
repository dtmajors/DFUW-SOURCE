/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class dmv
extends dmu {
    private Map<ldv, cod> bRg = lcn.emw();
    private Map<ldv, cod> gJt = lcn.emw();
    private Map<Integer, gvw> gJu = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        for (cod cod2 : this.bRg.values()) {
            if (!cod2.aRr() || cod2.aRq() != 0.0) continue;
            this.ns(cod2.getGUID());
        }
    }

    private void ns(ldv ldv2) {
        gwa gwa2 = (gwa)this.MessageDelegator.h(33027, this.getGUID(), this.getGUID());
        gwa2.iFu = false;
        gwa2.bRl = ldv2;
        this.MessageDelegator.F(gwa2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 33025: {
                this.a((gvw)dxq2);
                break;
            }
            case 33027: {
                this.a((gwa)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 33028: {
                this.a((gwb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean hW(ldv ldv2) {
        return false;
    }

    private void a(gvw gvw2) {
        assert (gvw2.az() > 0);
        if (gvw2.bFz() != null) assert (gvw2.bFj());
        this.gJu.put(this.bRk, gvw2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = gvw2.bFz() == null ? this.GUID : gvw2.bFz();
        gfm2.ResourceType = gvw2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gwa gwa2) {
        assert (gwa2.bRl != null);
        cod cod2 = null;
        if (gwa2.isExternal()) {
            cod2 = this.gJt.remove(gwa2.bYl());
            if (cod2 == null) {
                assert (false);
                return;
            }
        } else {
            cod2 = this.bRg.remove(gwa2.bYl());
            if (cod2 == null) {
                return;
            }
            this.MessageDelegator.hd(cod2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = cod2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gwb gwb2) {
        cod cod2 = this.bRg.get(gwb2.bYl());
        if (cod2 == null) {
            return;
        }
        if (gwb2.bON() == 0.0) {
            // empty if block
        }
        cod2.bu(gwb2.bON());
    }

    private void a(gfn gfn2) {
        gvw gvw2 = this.gJu.remove(gfn2.aVk());
        if (gvw2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponse() Could not find TotemCreateRequestMessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponse() Could not create Totem: " + lea.enW().getName(gvw2.ResourceType));
            if (gvw2.bFj()) {
                this.a(gvw2, null);
            }
            return;
        }
        if (!(gfn2.dtF instanceof cod)) {
            // empty if block
        }
        assert (gfn2.dtF instanceof cod);
        cod cod2 = (cod)gfn2.dtF;
        this.a(cod2, gvw2);
        if (gvw2.bFj()) {
            this.a(gvw2, cod2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = cod2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gvw gvw2, cod cod2) {
        gvx gvx2 = (gvx)this.MessageDelegator.h(33026, this.getGUID(), gvw2.aO());
        this.MessageDelegator.b(gvw2, gvx2);
        gvx2.qF(cod2 != null ? cod2.getGUID() : null);
        gvx2.a(cod2);
        this.MessageDelegator.F(gvx2);
    }

    private void a(cod cod2, gvw gvw2) {
        cod2.a(this);
        bvd bvd2 = cod2.aAG();
        if (bvd2 == null) {
            bvd2 = cod2.aIl();
            cod2.d(bvd2);
        }
        bvd2.c(gvw2.av());
        bvd2.a(gvw2.aw());
        if (gvw2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)cod2));
            if (gvw2.iKA > 0.0) {
                cod2.bu(gvw2.iKA);
            }
            this.bRg.put(cod2.getGUID(), cod2);
        } else {
            this.gJt.put(cod2.getGUID(), cod2);
        }
        cod2.a(gvw2.bYi());
        cod2.eD(gvw2.bYh());
        cod2.setRadius(gvw2.getRadius());
        cod2.sh(gvw2.bYj());
        cod2.eE(gvw2.bYk());
        cod2.Hy();
    }

    public void nt(ldv ldv2) {
        this.ns(ldv2);
    }
}

