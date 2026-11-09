/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lqf
 */
import java.util.Map;

public class jv
extends jk {
    private int Ss = 1;
    private Map<Integer, jj> amf = lcn.emw();
    public static final String amg = "adm_memorystats";
    public static final String amh = "adm_steamunlock";
    public static final String ami = "adm_startutils";
    public static final String amj = "adm_stoputils";
    public static final String amk = "adm_filelocale";

    @Override
    public void nU() {
        this.a(amg, hc.aaP, lqf.rXK);
        this.a(amh, hc.aaP, lqf.rXL, mhs.STRING);
        this.a(ami, hc.aaP, lqf.rXM);
        this.a(amj, hc.aaP, lqf.rXN);
        this.a(amk, hc.aaP, lqf.rXO, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        if (jj2.akV.equals(amg)) {
            loh.ewO();
            jj2.b(lqd.rXn.bD(jj2.akV), false);
        } else if (jj2.akV.equals(ami)) {
            kcw kcw2 = (kcw)this.MessageDelegator.i(295, this.getGUID(), lcr.qCz);
            kcw2.gOd = 2;
            this.MessageDelegator.b(kcw2);
            jj2.b(lqd.rXn.bD(jj2.akV), false);
        } else if (jj2.akV.equals(amj)) {
            kcw kcw3 = (kcw)this.MessageDelegator.i(295, this.getGUID(), lcr.qCz);
            kcw3.gOd = 3;
            this.MessageDelegator.b(kcw3);
            jj2.b(lqd.rXn.bD(jj2.akV), false);
        } else if (jj2.akV.equals(amh)) {
            kdn kdn2 = (kdn)this.MessageDelegator.i(287, this.getGUID(), lcr.qCA);
            kdn2.gOd = 1;
            kdn2.pha = ((mhr)jj2.cA((int)0)).Value;
            kdn2.aqs = this.Ss++;
            this.amf.put(kdn2.aqs, jj2);
            this.MessageDelegator.b(kdn2);
        } else if (jj2.akV.equals(amk)) {
            kdc kdc2 = (kdc)this.MessageDelegator.i(296, this.getGUID(), lcr.qCz);
            kdc2.pgx = ((mhr)jj2.cA((int)0)).Value;
            this.MessageDelegator.b(kdc2);
            jj2.b(lqd.rXn.bD(jj2.akV), false);
        } else {
            jj2.b(lqd.rXk.bD(jj2.akV), true);
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 288: {
                this.a((kdo)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kdo kdo2) {
        jj jj2 = this.amf.remove(kdo2.aqs);
        if (jj2 == null) {
            lfn.b(5, "SFConsoleCommandHandlerMiddleware", "handleMiddlewareSteamResponse: No command mapped to message tag " + kdo2.aqs);
            assert (false);
            return;
        }
        if (kdo2.iOz == 0) {
            jj2.b(lqd.rXn.bD(jj2.akV), false);
        } else {
            jj2.b(lqd.rXq.bD(jj2.akV, kdo2.iOz), true);
        }
    }
}

