/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Map;

public class ath
extends atg {
    private Map<Integer, ldv> bYm = lcn.emw();
    private boolean bYn = false;

    @Override
    public void initialize() {
        super.initialize();
        lcr.qEf = this.getGUID();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                this.b((gsl)dxq2);
                break;
            }
            case 2574: {
                this.a((ffj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void c(atf atf2) {
        assert (this.MessageDelegator != null);
        ldv ldv2 = this.MessageDelegator.bzv();
        this.bYm.put(atf2.ID, ldv2);
        if (!this.bYn) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKQ = atf2.Position;
        ffb2.dbx = ldv2;
        ffb2.iKO = ffb.a.iKR;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        ffb2.iKP = new ljk(atf2.aFo);
        lgw lgw2 = (lgw)lea.enW().acv(atf2.ResourceType);
        if (atf2.ResourceType == cug.fkM) {
            ffb2.dzN = new lhu(16, 16, atf2.aXn);
            ffb2.ResourceType = cug.fkM;
        } else if (lgw2 == null) {
            ffb2.dzN = new lhu(16, 16, "gui/resources/doom_01.dds");
            ffb2.ResourceType = cug.fmn;
        } else {
            ffb2.dzN = lgw2.atw();
            ffb2.ResourceType = atf2.ResourceType;
        }
        this.MessageDelegator.F(ffb2);
    }

    @Override
    protected void d(atf atf2) {
        ldv ldv2 = this.bYm.remove(atf2.ID);
        assert (ldv2 != null);
        this.MessageDelegator.oa(ldv2);
        if (!this.bYn) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.dbx = ldv2;
        ffb2.iKO = ffb.a.iKT;
        this.MessageDelegator.F(ffb2);
    }

    private void a(uk[] ukArray) {
        if (ukArray == null) {
            return;
        }
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            if (!(ukArray[i] instanceof us)) continue;
            this.a((us)ukArray[i]);
        }
    }

    private void a(us us2) {
        if (!((us2.aXP & 1) <= 0 || this.bYj != null && this.bYj.containsKey(us2.ID))) {
            this.a(us2.ID, us2.aFo, us2.ResourceType, us2.Position, us2.aFp, us2.aXn);
        }
        if ((us2.aXP & 2) > 0) {
            if (this.bYj != null && this.bYj.containsKey(us2.ID)) {
                this.hZ(us2.ID);
            }
            this.a(us2.ID, us2.aFo, us2.ResourceType, us2.Position, us2.aFp, us2.aXn);
        }
        if ((us2.aXP & 4) > 0) {
            this.hZ(us2.ID);
        }
    }

    private void a(ffj ffj2) {
        if (!ffj2.aO().equals(this.getGUID())) {
            ffj2.f(this.getGUID());
            this.MessageDelegator.F(ffj2);
            return;
        }
        if (this.bYn == ffj2.dOL) {
            return;
        }
        this.bYn = ffj2.dOL;
        if (this.bYn && this.bYj != null) {
            for (Integer n : this.bYj.keySet()) {
                atf atf2 = (atf)this.bYj.get(n);
                ldv ldv2 = this.bYm.get(n);
                ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
                ffb2.iKQ = atf2.Position;
                ffb2.dbx = ldv2;
                ffb2.iKO = ffb.a.iKR;
                ffb2.eir = 0.0f;
                ffb2.eis = new ljp(1.0f, 1.0f);
                ffb2.iKP = new ljk(atf2.aFo);
                if (atf2.ResourceType == cug.fkM) {
                    ffb2.dzN = new lhu(16, 16, atf2.aXn);
                    ffb2.ResourceType = cug.fkM;
                } else {
                    lgw lgw2 = (lgw)lea.enW().acv(atf2.ResourceType);
                    if (lgw2 == null) {
                        ffb2.dzN = new lhu(16, 16, "gui/resources/doom_01.dds");
                        ffb2.ResourceType = cug.fmr;
                    } else {
                        ffb2.dzN = lgw2.atw();
                        ffb2.ResourceType = atf2.ResourceType;
                    }
                }
                this.MessageDelegator.F(ffb2);
            }
        }
    }

    private void b(gsl gsl2) {
        this.a(gsl2.joY);
    }
}

