/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
public class kg
extends jk {
    private static final String TC = "SFConsoleCommandHandlerForFeats";

    @Override
    public void nU() {
        this.a(a.aoi.toString().toLowerCase(), hc.aaP, lqf.sbL, mhs.STRING, mhs.INTEGER);
        this.a(a.aoj.toString().toLowerCase(), hc.aaP, lqf.sbM, mhs.STRING);
        this.a(a.aok.toString().toLowerCase(), hc.aaP, lqf.sbN, mhs.STRING);
    }

    private a bs(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bs(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aoi: 
            case aoj: 
            case aok: {
                this.b(jj2, a2.ordinal());
            }
        }
    }

    private void b(jj jj2, int n) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n2 = jj2.getArgCount() == 2 ? ((mho)jj2.cA((int)1)).PC : 0;
        fbp fbp2 = (fbp)this.MessageDelegator.h(30465, this.getGUID(), this.aQ().getGUID());
        fbp2.gNT = n;
        fbp2.Name = string;
        fbp2.iIy = n2;
        this.MessageDelegator.F(fbp2);
    }
}

