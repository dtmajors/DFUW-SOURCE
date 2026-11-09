/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class bja
extends bgk {
    public static final String dmn = "getplayerspawnposition";
    public static final biv.a dnI = biv.a.dnq;
    private ldv Ri = null;

    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("CharacterID");
        if (string == null) {
            this.fw("Required parameter CharacterID missing or invalid");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (n <= 0) {
            this.fw("Required parameter CharacterID missing or invalid");
            return;
        }
        this.Ri = lcr.abW((int)n);
        if (this.Ri == null) {
            this.fw("Invalid CharacterID - Couldn't create PSOGUID");
            return;
        }
        gsa gsa2 = (gsa)this.MessageDelegator.h(11087, this.getGUID(), this.Ri);
        this.MessageDelegator.E(gsa2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11088: {
                this.a((gsb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.b((kcs)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(gsb gsb2) {
        TreeMap<String, String> treeMap = lcn.emG();
        if (gsb2.Position == null) {
            this.fw("Couldn't find spawn position");
        } else {
            treeMap.put("X", "" + gsb2.Position.x);
            treeMap.put("Y", "" + gsb2.Position.y);
            treeMap.put("Z", "" + gsb2.Position.rlV);
        }
        this.t(treeMap);
        this.aoU();
    }

    private void b(kcs kcs2) {
        if (kcs2.hsQ != null && kcs2.hsQ.equals(this.Ri)) {
            this.fw("Couldn't find spawn position");
        } else {
            this.fw("Couldn't find spawn position");
        }
    }
}

