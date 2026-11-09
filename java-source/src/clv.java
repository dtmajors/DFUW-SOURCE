/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  bri
 *  cug
 *  lcr
 */
import java.util.List;

public class clv
extends clt {
    private btn eHi = null;
    private cni aes = null;
    private boolean eJO = false;

    public clv() {
        super(true);
    }

    public void initialize() {
        super.initialize();
    }

    public void mH() {
        bqm.b b2 = bqm.b.getInventoryTypeByResourceType(this.az());
        assert (b2 != null);
        brk brk2 = new brk();
        brk2.a(b2);
        brk2.setGUID(this.MessageDelegator.bzv());
        brk2.N(mx.si());
        this.aes = new cni();
        this.aes.setGUID(this.MessageDelegator.bzv());
        this.aes.setObjectType(115);
        this.aes.l(cug.fnx);
        this.aes.aJC().setGUID(this.MessageDelegator.bzv());
        this.aes.aJC().b((bqk)brk2);
        this.MessageDelegator.a((amf)((Object)this.aes));
    }

    public void ax(List<nb> list) {
        bqm.b b2 = bqm.b.getInventoryTypeByResourceType(this.az());
        assert (b2 != null);
        brk brk2 = new brk();
        brk2.a(b2);
        brk2.setGUID(this.MessageDelegator.bzv());
        this.aes = new cni();
        this.aes.setGUID(this.MessageDelegator.bzv());
        this.aes.setObjectType(115);
        this.aes.l(cug.fnx);
        this.aes.aJC().setGUID(this.MessageDelegator.bzv());
        this.aes.aJC().b((bqk)brk2);
        gy.a(this.getMessageDelegator(), (bqk)brk2, list);
        this.MessageDelegator.a((amf)((Object)this.aes));
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.aes != null) {
            this.aes.aUu();
            this.MessageDelegator.hd(this.aes.getGUID());
            this.aes = null;
        }
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void aSt() {
        this.eHi = null;
    }

    public void Hy() {
        this.aIw();
    }

    public void receiveMessage(dxq dxq2) {
        if (this.eHi != null && this.eHi.a(dxq2, (btk)((Object)this))) {
            return;
        }
        switch (dxq2.bEz()) {
            case 25860: {
                this.a((fpn)dxq2);
                break;
            }
            case 26632: {
                this.a((frq)dxq2);
                break;
            }
            case 8001: {
                this.a((fnv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(frq frq2) {
        bqt[] bqtArray;
        frr frr2 = (frr)this.MessageDelegator.h(26633, this.getGUID(), frq2.dYb);
        frr2.sk(frq2.aVk());
        frr2.YL = frq2.YL;
        frr2.aCH = 3;
        brp[] brpArray = null;
        if (this.aes != null) {
            brpArray = this.aes.aJC().asf().aun().avX();
        }
        if (brpArray == null) {
            bqtArray = new bqt[]{};
        } else {
            bqtArray = new bqt[brpArray.length];
            for (int i = 0; i < brpArray.length; ++i) {
                bqtArray[i] = new bqt();
                bqtArray[i].asi = brpArray[i].asi;
                bqtArray[i].ResourceType = brpArray[i].ResourceType;
            }
        }
        frr2.sk(frq2.aVk());
        frr2.iUZ = bqtArray;
        this.MessageDelegator.E(frr2);
    }

    private void a(fnv fnv2) {
        if ((fnv2.iRx & 4) != 0 && this.aes != null) {
            bri bri2 = (bri)this.aes.aJC().asf();
            brp[] brpArray = bri2.aun().avX();
            if (brpArray != null) {
                for (brp brp2 : brpArray) {
                    if (cug.vL((int)brp2.ResourceType)) continue;
                    kcy kcy2 = (kcy)this.MessageDelegator.i(278, this.getGUID(), lcr.qyW);
                    kcy2.hB = 0;
                    kcy2.SN = fnv2.aO().enw();
                    kcy2.a(kcy.b.pfq);
                    kcy2.a(kcy.a.pfe);
                    kcy2.aFo = "Local Bank Wipe by " + fnv2.iRw.enw();
                    kcy2.pev = "" + brp2.ResourceType + " " + brp2.asi;
                    this.MessageDelegator.b(kcy2);
                }
            }
            fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.getGUID(), this.aes.aJC().getGUID());
            fmr2.ilu = 2;
            this.MessageDelegator.H(fmr2);
        }
    }

    private void a(fpn fpn2) {
        lfn.b(5, "SFLocalStorageObjectServer", "handleLocalStorageObjectAccessRequest() This message should not really be handled here. Will just give access to everyone.");
        fpo fpo2 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
        this.MessageDelegator.b(fpn2, fpo2);
        if (this.aes == null) {
            fpo2.isM = false;
        } else {
            fpo2.isM = true;
            fpo2.dAv = this.aes.getGUID();
            fpo2.iTn = this.az();
        }
        this.MessageDelegator.F(fpo2);
    }

    public final cni mB() {
        return this.aes;
    }

    public final void b(cni cni2) {
        this.aes = cni2;
    }

    public void aSu() {
    }
}

