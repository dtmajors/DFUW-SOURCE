/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class hk
extends btk {
    private static final String TC = "SFPopulationSensorManager";
    private static final int adh = lea.epp().aTn();
    private static final int adi = lea.epp().aTo();
    private Map<ldv, lfs<Boolean, String>> adj = lcn.emw();

    private void a(gbv gbv2) {
        this.adj.put(gbv2.aO(), new lfs<Boolean, String>(Boolean.FALSE, gbv2.TileID));
    }

    private void a(gbw gbw2) {
        int n;
        int n2 = gbw2.jcX;
        if (n2 >= adh) {
            for (Map.Entry<ldv, lfs<Boolean, String>> entry : this.adj.entrySet()) {
                if (entry.getValue().getFirst().booleanValue()) continue;
                fec fec2 = (fec)this.MessageDelegator.h(27909, this.getGUID(), entry.getKey());
                this.MessageDelegator.F(fec2);
            }
            return;
        }
        int n3 = n2 / adi;
        if (n3 == 0) {
            n3 = 1;
        }
        if ((n = this.lW()) == n3) {
            return;
        }
        if (n > n3) {
            int n4 = 0;
            int n5 = n - n3;
            for (Map.Entry<ldv, lfs<Boolean, String>> entry : this.adj.entrySet()) {
                if (!entry.getValue().getFirst().booleanValue()) continue;
                feb feb2 = (feb)this.MessageDelegator.h(27908, this.getGUID(), entry.getKey());
                this.MessageDelegator.F(feb2);
                this.adj.put(entry.getKey(), new lfs(Boolean.FALSE, entry.getValue().reY));
                if (++n4 != n5) continue;
                return;
            }
            return;
        }
        if (n < n3) {
            int n6 = 0;
            int n7 = n3 - n;
            for (Map.Entry<ldv, lfs<Boolean, String>> entry : this.adj.entrySet()) {
                if (entry.getValue().getFirst().booleanValue()) continue;
                fec fec3 = (fec)this.MessageDelegator.h(27909, this.getGUID(), entry.getKey());
                this.MessageDelegator.F(fec3);
                this.adj.put(entry.getKey(), new lfs(Boolean.TRUE, entry.getValue().reY));
                if (++n6 != n7) continue;
                return;
            }
            return;
        }
    }

    private void a(fec fec2) {
        String string = fec2.TileID;
        for (Map.Entry<ldv, lfs<Boolean, String>> entry : this.adj.entrySet()) {
            boolean bl = entry.getValue().getFirst();
            if (bl || string != null && !string.equalsIgnoreCase((String)entry.getValue().reY)) continue;
            fec fec3 = (fec)this.MessageDelegator.h(27909, this.getGUID(), entry.getKey());
            this.MessageDelegator.F(fec3);
            this.adj.put(entry.getKey(), new lfs(Boolean.TRUE, entry.getValue().reY));
        }
    }

    private void a(feb feb2) {
        String string = feb2.TileID;
        boolean bl = feb2.iKs;
        for (Map.Entry<ldv, lfs<Boolean, String>> entry : this.adj.entrySet()) {
            boolean bl2 = entry.getValue().getFirst();
            if (!bl2 || string != null && !string.equalsIgnoreCase((String)entry.getValue().reY)) continue;
            feb feb3 = (feb)this.MessageDelegator.h(27908, this.getGUID(), entry.getKey());
            feb3.iKs = bl;
            this.MessageDelegator.F(feb3);
            this.adj.put(entry.getKey(), new lfs(Boolean.FALSE, entry.getValue().reY));
        }
    }

    private int lW() {
        int n = 0;
        for (lfs<Boolean, String> lfs2 : this.adj.values()) {
            if (!lfs2.getFirst().booleanValue()) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 28673: {
                this.a((gbv)dxq2);
                break;
            }
            case 28675: {
                this.a((gbw)dxq2);
                break;
            }
            case 27909: {
                this.a((fec)dxq2);
                break;
            }
            case 27908: {
                this.a((feb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        gbu gbu2 = (gbu)this.MessageDelegator.h(28674, this.getGUID(), lcr.qAT);
        gbu2.WJ = adh;
        gbu2.WK = adi;
        this.MessageDelegator.F(gbu2);
    }
}

