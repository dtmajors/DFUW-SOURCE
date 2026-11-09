/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class aty
extends atw {
    private Map<ldv, ccs> bZw = lcn.emw();
    private Map<ldv, ccs> bZx = lcn.emw();
    private Map<Integer, ecr> bZy = lcn.emw();
    private Map<ccs, bwa> bZz = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.bZz.isEmpty()) {
            Iterator<bwa> iterator = this.bZz.values().iterator();
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
            case 19457: {
                this.a((ecr)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 19459: {
                this.a((ecx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ecr ecr2) {
        assert (ecr2.az() > 0);
        if (ecr2.bFz() != null) assert (ecr2.bFj());
        this.bZy.put(new Integer(this.bRk), ecr2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = ecr2.bFz() == null ? this.GUID : ecr2.bFz();
        gfm2.ResourceType = ecr2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gfn gfn2) {
        ecr ecr2 = this.bZy.remove(gfn2.aVk());
        if (ecr2 == null) {
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            if (ecr2.bFj()) {
                this.a(ecr2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof ccs) : "ResourceName : " + gfn2.dtF.pa();
        ccs ccs2 = (ccs)gfn2.dtF;
        this.a(ccs2, ecr2);
        if (ecr2.bFj()) {
            this.a(ecr2, ccs2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = ccs2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(ecr ecr2, ccs ccs2) {
        ecs ecs2 = (ecs)this.MessageDelegator.h(19458, this.getGUID(), ecr2.aO());
        this.MessageDelegator.b(ecr2, ecs2);
        if (ccs2 != null) {
            ecs2.ku(ccs2.getGUID());
            ecs2.bf(ccs2.aAG() != null ? ccs2.aAG().azb() : null);
            ecs2.c(ccs2);
        } else {
            ecs2.c(null);
            ecs2.ku(null);
        }
        this.MessageDelegator.F(ecs2);
    }

    private void a(ccs ccs2, ecr ecr2) {
        bvd bvd2 = ccs2.aIl();
        ccs2.d(bvd2);
        if (ecr2.ilR) {
            bwa bwa2 = new bwa();
            bwa2.setServerObject(true);
            bwa2.eL(false);
            bwa2.d(bvd2);
            bwa2.setMessageDelegator(this.MessageDelegator);
            bwa2.bf(ecr2.aTo);
            bwa2.bc(ecr2.ilS);
            bwa2.l(ecr2.ilT);
            bwa2.bd(ecr2.Position);
            bwa2.m(ecr2.Rotation);
            bwa2.o(this.MessageDelegator.arc().rgz);
            bwa2.initialize();
            this.bZz.put(ccs2, bwa2);
            fuj fuj2 = (fuj)this.MessageDelegator.h(1038, ccs2.getGUID(), ccs2.getGUID());
            fuj2.gon = ecr2.ilS;
            fuj2.goo = ecr2.Position;
            fuj2.iWX = ecr2.ilT;
            fuj2.iWY = ecr2.Rotation;
            fuj2.eKm = ecr2.aTo;
            fuj2.oV = this.MessageDelegator.arc().rgz;
            gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.GUID, lcr.qAJ);
            gqu2.jpQ = (float)(this.MessageDelegator.arc().rgz + ecr2.aTo);
            gqu2.iXB = fuj2;
            this.MessageDelegator.F(gqu2);
            bvd2.c(ecr2.ilS);
            bvd2.a(ecr2.ilT);
            ccs2.aAG().c(ecr2.ilS);
            ccs2.aAG().a(ecr2.ilT);
        } else {
            bvd2.c(ecr2.av());
            bvd2.a(ecr2.aw());
            ccs2.aAG().c(ecr2.av());
            ccs2.aAG().a(ecr2.aw());
        }
        if (ecr2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)ccs2));
            ccs2.Hy();
            this.bZw.put(ccs2.getGUID(), ccs2);
        } else {
            this.bZx.put(ccs2.getGUID(), ccs2);
        }
    }

    private void a(ecx ecx2) {
        assert (ecx2.aIU() != null);
        ccs ccs2 = null;
        if (ecx2.bFB()) {
            ccs2 = this.bZx.remove(ecx2.aIU());
            if (ccs2 == null) {
                return;
            }
        } else {
            ccs2 = this.bZw.remove(ecx2.aIU());
            if (ccs2 == null) {
                return;
            }
            this.MessageDelegator.hd(ccs2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = ccs2.az();
        this.MessageDelegator.F(gga2);
    }
}

