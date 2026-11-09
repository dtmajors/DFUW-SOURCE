/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cew
 *  lkv
 */
import java.util.Map;

public class cms
extends btk {
    private cew dLR = null;
    private lkh eLL = null;
    private cmt eLM = null;
    private static String eLN = "waw/hum_u_eye_l_01.xml";
    private static String eLO = "waw/hum_u_eye_r_01.xml";
    private ldv eel = null;
    private ldv eeo = null;
    private ldv eLP = null;
    private ldv eLQ = null;
    private boolean een = false;
    private boolean eek = false;
    private boolean eLR = false;
    private int eLS = 0;
    private int eLT = -1;
    private boolean eLU = false;
    private boolean eLV = false;
    private boolean eer = false;

    public cew axF() {
        return this.dLR;
    }

    public void b(cew cew2) {
        this.dLR = cew2;
        this.eLM.b(this.dLR);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.eLM = new cmt();
        this.eLM.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eLM);
    }

    public void doTick(ldz ldz2) {
        this.ab(ldz2);
        this.aa(ldz2);
        this.eLM.doTick(ldz2);
    }

    public final void gu(boolean bl) {
        if (this.eLV) {
            return;
        }
        if (bl) {
            if (this.eel != null && this.eeo != null) {
                return;
            }
            this.aFy();
        } else {
            if (this.eel == null && this.eeo == null) {
                return;
            }
            this.aFz();
        }
    }

    private void aa(ldz ldz2) {
        if (!this.eLR || this.eLU) {
            return;
        }
        assert (this.dLR.aAG() instanceof bvf);
        bvf bvf2 = (bvf)this.dLR.aAG();
        lcb lcb2 = bvf2.azD();
        if (lcb2 == null) {
            return;
        }
        if (lcb2.qvQ == null) {
            return;
        }
        int n = lkv.adp((int)lcb2.qvQ.etQ());
        int n2 = 666;
        if (lcb2.qvR != null) {
            n2 = lkv.adp((int)lcb2.qvR.etQ());
        }
        int n3 = -1;
        switch (n) {
            case 65536: 
            case 131072: 
            case 327680: 
            case 655360: 
            case 0x140000: 
            case 0x150000: {
                n3 = 0;
                break;
            }
            case 393216: {
                n3 = 3;
                break;
            }
            case 196608: 
            case 262144: 
            case 524288: 
            case 589824: 
            case 720896: 
            case 786432: 
            case 917504: {
                n3 = 1;
                break;
            }
            case 851968: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 1;
            }
        }
        if (lcb2.qvR != null) {
            int n4 = lkv.adp((int)lcb2.qvR.etO());
            if (ldz2.rgz < lcb2.qvT + (double)lcb2.qvR.etP() || lcb2.qvR.isLooping()) {
                switch (n4) {
                    case 0x1000000: 
                    case 0x3000000: 
                    case 0x4000000: 
                    case 0x6000000: {
                        n3 = 1;
                        break;
                    }
                    case 0x2000000: {
                        n3 = 2;
                        break;
                    }
                }
            }
        }
        this.eLT = n3;
        this.eLL.acZ(n3);
        this.eLL.doTick(ldz2);
    }

    private void ab(ldz ldz2) {
        if (this.eLR || this.eLU) {
            return;
        }
    }

    private void aTA() {
        this.eLL = new lkh();
        this.eLL.setGUID(this.MessageDelegator.bzv());
        if (this.eel == null) {
            return;
        }
        if (this.eeo == null) {
            return;
        }
        this.eLL.tv(this.eel);
        this.eLL.tx(this.eeo);
        this.eLL.tw(this.eLP);
        this.eLL.ty(this.eLQ);
        this.MessageDelegator.a(this.eLL);
        this.eLL.etw();
        this.eLR = true;
    }

    private void aFy() {
        int n = this.dLR.az();
        eLN = cg.a(n, this.eer);
        eLO = cg.b(n, this.eer);
        this.eel = this.MessageDelegator.bzv();
        this.eeo = this.MessageDelegator.bzv();
        krr krr2 = (krr)this.MessageDelegator.j(1);
        assert (krr2 != null);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.xC(true);
        krr2.xc(eLN);
        krr2.hC(this.eel);
        krr2.setObjectType(0);
        krr2.ts(this.getGUID());
        krr2.xe("");
        krr2.xd("");
        this.MessageDelegator.a(krr2);
        krr2 = (krr)this.MessageDelegator.j(1);
        assert (krr2 != null);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.xC(true);
        krr2.xc(eLO);
        krr2.hC(this.eeo);
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
                if (ksv2.oq().equals(this.eel)) {
                    if (ksv2.getResult() != 0) {
                        return;
                    }
                    Map<String, eh> map = ei.ao(this.dLR.aAG().getFileName());
                    assert (map != null);
                    eh eh2 = map.get(ei.d(this.dLR.az(), this.eer));
                    if (eh2 == null) {
                        return;
                    }
                    this.eek = true;
                    this.eLP = this.MessageDelegator.bzv();
                    knd knd2 = (knd)this.MessageDelegator.h(775);
                    knd2.Jd(1);
                    knd2.ak(eh2.getRotation());
                    knd2.aj(eh2.fb());
                    knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
                    knd2.lQ(false);
                    knd2.kX(this.eLP);
                    knd2.aE(false);
                    knd2.qj(this.dLR.KY());
                    knd2.qk(this.eel);
                    knd2.setFrameName(eh2.getFrameName());
                    knd2.ts(this.getGUID());
                    knd2.wD(true);
                    knd2.ts(this.getGUID());
                    this.MessageDelegator.a(knd2);
                    this.eLS = this.MessageDelegator.arc().lpr + 2;
                    break;
                }
                if (!ksv2.oq().equals(this.eeo)) break;
                if (ksv2.getResult() != 0) {
                    return;
                }
                Map<String, eh> map = ei.ao(this.dLR.aAG().getFileName());
                assert (map != null);
                eh eh3 = map.get(ei.e(this.dLR.az(), this.eer));
                if (eh3 == null) {
                    return;
                }
                this.een = true;
                this.eLQ = this.MessageDelegator.bzv();
                knd knd3 = (knd)this.MessageDelegator.h(775);
                knd3.Jd(1);
                knd3.ak(eh3.getRotation());
                knd3.aj(eh3.fb());
                knd3.bM(new ljq(1.0f, 1.0f, 1.0f));
                knd3.lQ(false);
                knd3.kX(this.eLQ);
                knd3.aE(false);
                knd3.qj(this.dLR.KY());
                knd3.qk(this.eeo);
                knd3.setFrameName(eh3.getFrameName());
                knd3.ts(this.getGUID());
                knd3.wD(false);
                knd3.ts(this.getGUID());
                knd3.jM(true);
                this.MessageDelegator.a(knd3);
                this.eLS = this.MessageDelegator.arc().lpr + 2;
                break;
            }
            default: {
                super.receiveResourceResponse(ktf2);
            }
        }
    }

    @Override
    public void cleanUp() {
        this.aFz();
        this.MessageDelegator.hd(this.eLM.getGUID());
    }

    private void aFz() {
        khd khd2;
        if (this.eLL != null) {
            this.eLL.etx();
            this.MessageDelegator.hd(this.eLL.getGUID());
        }
        if (this.eel != null) {
            khd2 = (klb)this.MessageDelegator.h(1026);
            assert (khd2 != null);
            ((kld)khd2).hC(this.eel);
            khd2.ts(this.getGUID());
            ((klb)khd2).HX(klb.iHB);
            this.MessageDelegator.a(khd2);
        }
        if (this.eeo != null) {
            khd2 = (klb)this.MessageDelegator.h(1026);
            assert (khd2 != null);
            ((kld)khd2).hC(this.eeo);
            khd2.ts(this.getGUID());
            ((klb)khd2).HX(klb.iHB);
            this.MessageDelegator.a(khd2);
        }
        if (this.eLP != null) {
            khd2 = (knd)this.MessageDelegator.h(775);
            ((knd)khd2).Jd(2);
            ((knm)khd2).kX(this.eLP);
            khd2.ts(this.getGUID());
            khd2.jM(true);
            this.MessageDelegator.a(khd2);
        }
        if (this.eLQ != null) {
            khd2 = (knd)this.MessageDelegator.h(775);
            ((knd)khd2).Jd(2);
            ((knm)khd2).kX(this.eLQ);
            khd2.ts(this.getGUID());
            khd2.jM(true);
            this.MessageDelegator.a(khd2);
        }
        this.eLL = null;
        this.een = false;
        this.eek = false;
        this.eLR = false;
        this.eLS = 0;
        this.eLT = -1;
        this.eel = null;
        this.eeo = null;
        this.eLP = null;
        this.eLQ = null;
        this.eLU = true;
    }

    public void aTy() {
        this.eLV = true;
        this.aFz();
    }

    public void gv(boolean bl) {
        this.eer = bl;
    }
}

