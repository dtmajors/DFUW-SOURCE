/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cug
 *  lcr
 *  lkv
 */
import java.util.Map;

public class cmq
extends btk {
    private static final String eLw = "creature/horse_tail_01.xml";
    private static final String eLx = "Herre_min_hatt.xml";
    private static final String eLy = "se_horse_gallopp";
    private static int eLz = -1;
    private static final int eLA = 1;
    private int eLB = 0;
    private int eLC = -1;
    private int eLD = -1;
    private ldv eLE = null;
    private boolean eLF = false;
    private boolean eLG = false;
    private ldv eLH = null;
    private ldv eLI = null;
    private cpe eLJ = null;

    public void doTick(ldz ldz2) {
    }

    private void aTt() {
        if (this.eLJ == null) {
            return;
        }
        bvf bvf2 = (bvf)this.eLJ.aAG();
        lcb lcb2 = bvf2.azD();
        if (lcb2 == null || lcb2.qvQ == null) {
            return;
        }
        int n = lkv.adp((int)lcb2.qvQ.etQ());
        int n2 = 666;
        if (lcb2.qvR != null) {
            n2 = lkv.adp((int)lcb2.qvR.etQ());
        }
        int n3 = 0;
        switch (n) {
            case 917504: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 0;
            }
        }
        if (n3 != this.eLB) {
            int n4 = this.rM(n3);
            if (this.eLF) {
                this.eLG = true;
                this.eLD = n4;
            } else {
                if (this.eLE != null) {
                    this.aTu();
                }
                if (n3 != 0) {
                    this.rL(n4);
                }
            }
            this.eLB = n3;
        }
    }

    private void rL(int n) {
        if (n > 0) {
            this.eLC = n;
            glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
            glh2.jM(false);
            glh2.mk(true);
            glh2.setTargetObjectGUID(this.eLJ.aAG().axa());
            glh2.setTargetPosition(this.eLJ.aAG().av());
            glh2.setSpecialEffectType(n);
            glh2.setPower(0.0f);
            glh2.mj(true);
            glh2.o(0.0);
            glh2.JQ(0);
            glh2.sk(1);
            this.MessageDelegator.F(glh2);
            this.eLF = true;
        }
    }

    private void aTu() {
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
        glj2.jM(false);
        glj2.jkV = 1;
        glj2.aUa = this.eLE;
        this.MessageDelegator.F(glj2);
        this.eLE = null;
    }

    private int rM(int n) {
        return -1;
    }

    @Override
    public void initialize() {
        super.initialize();
        if (eLz < 0) {
            eLz = del.dr(eLy);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13059: {
                assert (this.eLE == null);
                this.eLF = false;
                glb glb2 = (glb)dxq2;
                this.eLE = glb2.aUa;
                if (!this.eLG) break;
                if (this.eLD != this.eLC) {
                    this.aTu();
                }
                this.eLG = false;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public cpe aTv() {
        return this.eLJ;
    }

    public void b(cpe cpe2) {
        this.eLJ = cpe2;
        assert (this.eLJ.aAG() instanceof bvf);
        bvf bvf2 = (bvf)this.eLJ.aAG();
        if (bvf2.az() != cug.foU) {
            return;
        }
        this.aTw();
    }

    public void aTw() {
        this.eLH = this.MessageDelegator.bzv();
        krr krr2 = (krr)this.MessageDelegator.j(1);
        assert (krr2 != null);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.xC(true);
        krr2.xc(eLw);
        krr2.hC(this.eLH);
        krr2.setObjectType(0);
        krr2.ts(this.getGUID());
        krr2.xe("");
        krr2.xd("");
        this.MessageDelegator.a(krr2);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            case 1: {
                ksv ksv2 = (ksv)ktf2;
                if (!ksv2.oq().equals(this.eLH)) break;
                if (ksv2.getResult() != 0) {
                    return;
                }
                Map<String, eh> map = ei.ao(this.eLJ.aAG().getFileName());
                assert (map != null);
                eh eh2 = map.get("AttachPoint_Mount_Horse_Tail");
                if (eh2 == null) {
                    return;
                }
                this.eLI = this.MessageDelegator.bzv();
                knd knd2 = (knd)this.MessageDelegator.h(775);
                knd2.Jd(1);
                knd2.ak(eh2.getRotation());
                knd2.aj(eh2.fb());
                knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
                knd2.lQ(false);
                knd2.kX(this.eLI);
                knd2.aE(false);
                knd2.qj(this.eLJ.aAG().axa());
                knd2.qk(this.eLH);
                knd2.setFrameName(eh2.getFrameName());
                knd2.ts(this.getGUID());
                knd2.jM(true);
                knd2.wD(true);
                this.MessageDelegator.a(knd2);
                break;
            }
            default: {
                super.receiveResourceResponse(ktf2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
    }

    @Override
    public void cleanUp() {
        khd khd2;
        super.cleanUp();
        if (this.eLH != null) {
            khd2 = (klb)this.MessageDelegator.h(1026);
            assert (khd2 != null);
            ((kld)khd2).hC(this.eLH);
            khd2.ts(this.getGUID());
            ((klb)khd2).HX(klb.iHB);
            this.MessageDelegator.a(khd2);
            this.MessageDelegator.oa(this.eLH);
            this.eLH = null;
        }
        if (this.eLI != null) {
            khd2 = (knd)this.MessageDelegator.h(775);
            ((knd)khd2).Jd(2);
            ((knm)khd2).kX(this.eLI);
            khd2.ts(this.getGUID());
            khd2.jM(true);
            this.MessageDelegator.a(khd2);
            this.MessageDelegator.oa(this.eLI);
            this.eLI = null;
        }
    }
}

