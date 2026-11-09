/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class aus
extends aul {
    private static a[] ceM = new a[]{new a(hc.aaz, hfc.kgx, "Configure global chat options", new egg[0]), new a(hc.aaz, hfc.kgy, "Configure the current chat window", new egg[0]), new a(hc.aaz, hfc.kgz, "Configure the current chat tab", new egg[0]), new a(hc.aaz, hfc.kgA, "Rename the current chat window", new egg("title", egg.a.ipr, false, new ljk("New window title")))};

    public aus() {
        super(new amd(aus.class, aul.cdc, "ChatProxyForChatGui", new cqi[0], null));
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (n < 0 || n >= hfc.values().length) {
            super.b(n, objectArray, string);
            return;
        }
        ehr ehr2 = (ehr)this.MessageDelegator.h(2329, this.getGUID(), lcr.acL);
        ehr2.iqC = hfc.values()[n];
        ehr2.iqD = objectArray;
        ehr2.ccT = string;
        this.MessageDelegator.E(ehr2);
    }

    @Override
    protected final void FF() {
        super.FF();
        for (int i = 0; i < ceM.length; ++i) {
            this.a(aus.ceM[i].ceP, aus.ceM[i].ceN.ordinal(), aus.ceM[i].ceN.name().toLowerCase(), new ljk(aus.ceM[i].jD), aus.ceM[i].ceO);
        }
    }

    @Override
    protected final void FG() {
        this.We();
        super.FG();
    }
}

