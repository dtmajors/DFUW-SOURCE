/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class dem
extends btk {
    public static final int gmv = 0;
    public static final int gmw = 1;
    public static final int gmx = 2;
    public static final int gmy = 3;
    private boolean gmz = false;
    protected ldv[] gmA = new ldv[3];
    public List<ldv> gmB = lcn.emv();

    @Override
    public void initialize() {
        super.initialize();
    }

    private void bkN() {
        this.gmA[0] = this.a(400, 100.0f, 5.0f, "decal_blood_all.dds");
        this.gmz = true;
    }

    public void a(int n2, ljq ljq2, float f2, ljq ljq3, ljq ljq4, int n3) {
        if (!this.gmz) {
            this.bkN();
        }
        if (n2 < 0 || n2 >= 3 || this.gmA[n2] == null) {
            lfn.b(5, "SFSpecialEffectDecalManager", "addDecal() : tried to add decal to unitialize or invalid system : " + n2);
            return;
        }
        kkt kkt2 = (kkt)this.MessageDelegator.h(1048);
        kkt2.YC(2);
        kkt2.wD(false);
        kkt2.jM(false);
        kkt2.ts(this.GUID);
        kkt2.hC(this.gmA[0]);
        kkt2.c(ljq2);
        kkt2.do(ljq3);
        kkt2.dp(ljq4);
        kkt2.setSize(f2);
        kkt2.YE(n3);
        this.MessageDelegator.a(kkt2);
    }

    private ldv a(int n2, float f2, float f3, String string) {
        ldv ldv2 = this.MessageDelegator.bzv();
        kkt kkt2 = (kkt)this.MessageDelegator.h(1048);
        kkt2.YC(0);
        kkt2.wD(true);
        kkt2.jM(false);
        kkt2.ts(this.GUID);
        kkt2.hC(ldv2);
        kkt2.YD(n2);
        kkt2.mv(f2);
        kkt2.mw(f3);
        kkt2.E(string);
        this.MessageDelegator.a(kkt2);
        return ldv2;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        for (ldv object : this.gmB) {
            knf knf2 = (knf)this.MessageDelegator.h(781);
            knf2.Zp(2);
            knf2.ts(this.GUID);
            knf2.jM(false);
            knf2.wD(false);
            knf2.kX(object);
            knf2.lQ(false);
            knf2.setDeltaPos(new ljq(0.0f, 0.0f, 0.0f));
            knf2.setDeltaRot(new lgl());
            knf2.qj(this.GUID);
            knf2.qk(this.GUID);
            this.MessageDelegator.a(knf2);
            this.MessageDelegator.oa(object);
        }
        this.gmB.clear();
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.gmA[i2] == null) continue;
            kkt kkt2 = (kkt)this.MessageDelegator.h(1048);
            kkt2.YC(1);
            kkt2.wD(false);
            kkt2.jM(false);
            kkt2.ts(this.GUID);
            kkt2.hC(this.gmA[i2]);
            this.MessageDelegator.a(kkt2);
            this.MessageDelegator.oa(this.gmA[i2]);
            this.gmA[i2] = null;
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1024) {
            this.b((kux)ktv2);
        } else {
            super.receiveResponse(ktv2);
        }
    }

    public void b(kux kux2) {
        if (kux2.axa() != null) {
            knf knf2 = (knf)this.MessageDelegator.h(781);
            knf2.Zp(1);
            knf2.ts(this.GUID);
            knf2.jM(false);
            knf2.wD(false);
            knf2.kX(this.MessageDelegator.bzv());
            knf2.lQ(false);
            knf2.setDeltaPos(new ljq(0.0f, 0.0f, 0.0f));
            knf2.setDeltaRot(new lgl());
            knf2.qj(lcr.rg);
            knf2.qk(kux2.axa());
            this.MessageDelegator.a(knf2);
            this.gmB.add(knf2.aSO());
        }
    }
}

