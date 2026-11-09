/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class dme
extends dmc
implements bto {
    private Map<ldv, cnz> gHp = lcn.emw();
    private Map<ldv, cnz> gHq = lcn.emw();
    private Map<Integer, gud> gHr = lcn.emw();
    private Map<cnz, bwa> gHs = lcn.emw();
    private int bRk = 1;

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.gHs.isEmpty()) {
            Iterator<bwa> iterator = this.gHs.values().iterator();
            while (iterator.hasNext()) {
                bwa bwa2 = iterator.next();
                bwa2.doTick(ldz2);
                if (!bwa2.aAE()) continue;
                iterator.remove();
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24577: {
                this.a((gud)dxq2);
                break;
            }
            case 24579: {
                this.a((guh)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gud gud2) {
        assert (gud2.az() > 0);
        if (gud2.bFz() != null) assert (gud2.bFj());
        this.gHr.put(new Integer(this.bRk), gud2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = gud2.bFz() == null ? this.GUID : gud2.bFz();
        gfm2.ResourceType = gud2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(guh guh2) {
        assert (guh2.bXJ() != null);
        cnz cnz2 = null;
        if (guh2.jrX) {
            cnz2 = this.gHq.remove(guh2.bXJ());
            if (cnz2 == null) {
                assert (false);
                return;
            }
        } else {
            cnz2 = this.gHp.remove(guh2.bXJ());
            if (cnz2 == null) {
                assert (false);
                return;
            }
            this.MessageDelegator.hd(cnz2.getGUID());
        }
    }

    private void a(gfn gfn2) {
        gud gud2 = this.gHr.remove(gfn2.aVk());
        if (gud2 == null) {
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            if (gud2.bFj()) {
                this.a(gud2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof cnz);
        cnz cnz2 = (cnz)gfn2.dtF;
        this.a(cnz2, gud2);
        if (gud2.bFj()) {
            this.a(gud2, cnz2);
        }
    }

    private void a(gud gud2, cnz cnz2) {
        gue gue2 = (gue)this.MessageDelegator.h(24578, this.getGUID(), gud2.aO());
        this.MessageDelegator.b(gud2, gue2);
        if (cnz2 != null) {
            gue2.qB(cnz2.getGUID());
            gue2.c(cnz2);
        } else {
            gue2.qB(null);
            gue2.c(null);
        }
        this.MessageDelegator.F(gue2);
    }

    private void a(cnz cnz2, gud gud2) {
        bvd bvd2 = cnz2.aIl();
        cnz2.d(bvd2);
        if (gud2.ilR) {
            bwa bwa2 = new bwa();
            bwa2.setServerObject(true);
            bwa2.eL(false);
            bwa2.d(bvd2);
            bwa2.setMessageDelegator(this.MessageDelegator);
            bwa2.bf(gud2.aTo);
            bwa2.bc(gud2.ilS);
            bwa2.l(gud2.ilT);
            bwa2.bd(gud2.Position);
            bwa2.m(gud2.Rotation);
            bwa2.o(this.MessageDelegator.arc().rgz);
            bwa2.initialize();
            this.gHs.put(cnz2, bwa2);
            fuj fuj2 = (fuj)this.MessageDelegator.h(1038, cnz2.getGUID(), cnz2.getGUID());
            fuj2.gon = gud2.ilS;
            fuj2.goo = gud2.Position;
            fuj2.iWX = gud2.ilT;
            fuj2.iWY = gud2.Rotation;
            fuj2.eKm = gud2.aTo;
            fuj2.oV = this.MessageDelegator.arc().rgz;
            gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.GUID, lcr.qAJ);
            gqu2.jpQ = (float)(this.MessageDelegator.arc().rgz + gud2.aTo);
            gqu2.iXB = fuj2;
            this.MessageDelegator.F(gqu2);
            bvd2.c(gud2.ilS);
            bvd2.a(gud2.ilT);
            cnz2.aAG().c(gud2.ilS);
            cnz2.aAG().a(gud2.ilT);
        } else {
            bvd2.c(gud2.av());
            bvd2.a(gud2.aw());
            cnz2.aAG().c(gud2.av());
            cnz2.aAG().a(gud2.aw());
        }
        if (gud2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)cnz2));
            cnz2.Hy();
            this.gHp.put(cnz2.getGUID(), cnz2);
        } else {
            this.gHq.put(cnz2.getGUID(), cnz2);
        }
    }
}

