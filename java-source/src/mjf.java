/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mjf
extends kdw {
    protected kfs DCv = null;
    mjk DCw = null;

    @Override
    protected void Y() {
        this.phR = new kdz();
        this.phR.setVersion(0, 1);
        this.phR.setName(this.getClass().getName());
        this.phR.Wx(5);
        this.phR.setLevel(0);
        this.phR.fJ(1, 14);
        this.phR.fJ(1, 301);
        this.phR.fJ(1, 12);
        this.phR.fJ(1, 28);
    }

    public void a(List list, int n) {
        if (n == 1) {
            this.a(list);
        }
    }

    private void a(List list) {
        this.phS.addAll(list);
        this.DCw = new mjk();
        this.phR.setLevel(1);
        this.phQ = kdw.a.phY;
    }

    @Override
    public void e(ldz ldz2) {
        this.DCw.doTick(ldz2);
    }

    @Override
    public void a(kee kee2, int n) {
        super.a(kee2, n);
        if (kee2.dVG() == 301 && kee2.dVI().equals(kea.piF)) {
            this.DCw.b(kee2);
        }
        if (kee2.dVG() == 301 && !kee2.dVI().equals(kea.piF)) {
            this.DCw.a(kee2);
        }
        if (kee2.dVG() == 28 && !kee2.dVI().equals(kea.piF)) {
            this.DCw.a(kee2);
        }
        if (kee2.dVG() == 12 && kee2.dVI().equals(kea.piF)) {
            this.DCw.b(kee2);
        }
    }
}

