/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public class hgv
extends hog {
    private List<hpe> kpl = lcn.emA();
    private bqt[] kpm;

    public hgv(hnc hnc2, String string, lgg lgg2, lhf lhf2, hog.a a2) {
        super(hnc2, string, lgg2, lhf2, a2);
    }

    @Override
    public void FF() {
        super.FF();
        this.b(this.kpm);
    }

    void b(bqt[] bqtArray) {
        hpe hpe22;
        this.kpm = bqtArray;
        if (!this.isInitialized()) {
            return;
        }
        for (hpe hpe22 : this.kpl) {
            hpe22.remove();
        }
        this.kpl.clear();
        if (bqtArray == null) {
            return;
        }
        int n = 5;
        hpe22 = (hdm)this.kLu;
        for (bqt bqt2 : bqtArray) {
            hpe hpe3 = new hpe(this.kLu, null, new lgg(5, n), new lhf(this.cqv().rmN - 10, 14), ((hdm)hpe22).kIy, this.a(bqt2));
            this.j(hpe3);
            this.kpl.add(hpe3);
            n += 15;
        }
        this.cC(this.cqv().rmN - 20, n);
    }

    private String a(bqt bqt2) {
        lgw lgw2 = (lgw)lea.enW().acv(bqt2.ResourceType);
        if (lgw2 == null) {
            return "null";
        }
        return "" + bqt2.asi + " " + lgw2.awO().esy() + " (" + lgw2.getName() + ")";
    }
}

