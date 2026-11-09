/*
 * Decompiled with CFR.
 */
public class auu
extends aul {
    private boolean Initialized = false;
    private ldv afF = null;
    private double cfd = -2.0;
    private static final double cfe = 3.0;

    public auu() {
        super(new amd(auu.class, aul.cdc, "ChatProxyForEmotes", new cqi[0], null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.afF == null) {
            return;
        }
        if (n == 0) {
            for (ldj ldj2 : lea.eoE().values()) {
                if (ldj2.ipx <= 0) continue;
                this.h(maf.EmoteCommandListEntry.bD(ldj2.ipt));
            }
            return;
        }
        for (ldj ldj3 : lea.eoE().values()) {
            if (ldj3.ipx != n) continue;
            this.il(ldj3.aWe);
            return;
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        ljk ljk2 = new ljk("lists all emote chatcommands");
        this.a(hc.aaz, 0, "list_emotes", ljk2, new egg[0]);
        ljk2 = new ljk("emote chatcommand");
        for (ldj ldj2 : lea.eoE().values()) {
            if (ldj2.ipt.equals("war_cry_02_NOT-IN-YET")) continue;
            this.a(hc.aaz, ldj2.ipx, ldj2.ipt, ljk2, new egg[0]);
        }
    }

    private void a(egk egk2) {
        if (egk2.afF == null) {
            return;
        }
        this.afF = egk2.afF;
    }

    private void il(int n) {
        if (this.MessageDelegator.arc().rgz < this.cfd + 3.0) {
            return;
        }
        this.cfd = this.MessageDelegator.arc().rgz;
        erg erg2 = (erg)this.e(16643, this.afF);
        erg2.aWe = n;
        erg2.ixQ = true;
        this.a(erg2);
    }
}

