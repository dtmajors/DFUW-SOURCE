/*
 * Decompiled with CFR.
 */
public class kp
extends jk {
    private static final String TC = "SFConsoleCommandHandlerSelentine";

    @Override
    public void nU() {
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bB(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aqL: {
                this.bi(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void bi(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        int n = ((mho)jj2.cA((int)0)).PC;
        boolean bl = ((mhl)jj2.cA((int)1)).Pp;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 78;
        ern2.izG = n;
        ern2.izI = bl;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private a bB(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }
}

