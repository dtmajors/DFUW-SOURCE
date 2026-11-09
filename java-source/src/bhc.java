/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bhc
extends bgk {
    private static final String hD = "BecauseKjetilSaidSo";
    private ldv[] aoY = null;
    private int aoZ = 0;
    private Map<String, String> dlU = lcn.emw();

    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("password");
        if (string == null) {
            this.fw("Missing required parameter, 'password'!!!");
            return;
        }
        if (string.compareToIgnoreCase(hD) != 0) {
            this.fw("Password is invalid!!!");
            return;
        }
        this.ape();
    }

    private void ape() {
        gbo gbo2 = (gbo)this.MessageDelegator.h(24325, this.GUID, lcr.hac);
        this.MessageDelegator.F(gbo2);
    }

    private void d(ldv ldv2, int n, int n2) {
        gbk gbk2 = (gbk)this.MessageDelegator.h(24332, this.GUID, ldv2);
        gbk2.IB(n);
        gbk2.IA(n2);
        this.MessageDelegator.F(gbk2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24326: {
                this.a((gbp)dxq2);
                break;
            }
            case 24333: {
                this.a((gbl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gbp gbp2) {
        this.aoY = gbp2.aoY;
        if (this.aoY == null || this.aoY.length == 0) {
            this.fw("No Villages to Distribute!!!");
            return;
        }
        double d2 = jvv.dTN();
        int n = (int)(d2 / 79200.0);
        for (int i = 0; i < this.aoY.length; ++i) {
            this.d(this.aoY[i], n, i % n);
        }
    }

    private void a(gbl gbl2) {
        ++this.aoZ;
        this.dlU.put("VillageResponse:" + gbl2.bsp(), "Success: " + gbl2.vA() + ", Alteration: " + gbl2.bLm() + "s");
        if (this.aoZ == this.aoY.length) {
            this.t(this.dlU);
            this.aoV();
        }
    }
}

