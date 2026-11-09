/*
 * Decompiled with CFR.
 */
import java.util.HashMap;

public class hsf {
    public static final hbe jzX = hbe.jAM;
    private final hsh lbq;
    private final HashMap<hnb, hsb> lbr = new HashMap();
    private final int lbs;

    public hsf(hsh hsh2, int n) {
        this.lbq = hsh2;
        this.lbs = n;
    }

    public void dispose() {
        for (hsb hsb2 : this.lbr.values()) {
            hsb2.cleanup();
        }
    }

    public final hsb e(hnb hnb2) {
        hsb hsb2 = this.lbr.get(hnb2);
        if (hsb2 == null) {
            if (this.lbr.size() >= this.lbs) {
                // empty if block
            }
            hsb2 = new hsb(this.lbq.jDE, null);
            hsb2.setName(hnb2.kNa);
            hsb2.setSize(hnb2.kNb);
            hsb2.Ol(hnb2.kNc);
            hsb2.hL(hnb2.kNd);
            this.lbr.put(hnb2, hsb2);
        }
        return hsb2;
    }
}

