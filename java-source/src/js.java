/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lqf
 */
public class js
extends jk {
    private static final String TC = "SFConsoleCommandHandlerGMCharacter";

    @Override
    public void a(jj jj2) {
        a a2 = this.bg(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case alO: {
                this.j(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void j(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "showItems() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "showItems() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, lcr.qCj);
        ern2.ilu = 19;
        ern2.YL = string + " " + string2;
        this.MessageDelegator.F(ern2);
    }

    private a bg(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public void nU() {
        this.a(a.alO.toString().toLowerCase(), hc.aaT, lqf.rYo, mhs.STRING, mhs.STRING);
    }
}

