/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jog
extends kdw {
    private jof nHS = new jof();

    @Override
    public void a(kee kee2, int n) {
        if (kee2.dVG() == 22 && kee2.dVI().equals(kea.piE)) {
            this.nHS.b(kee2);
        } else if (kee2.dVG() == 22 && !kee2.dVI().equals(kea.piE)) {
            this.nHS.a(kee2);
        } else if (kee2.dVG() == 2) {
            this.phS.add(kee2);
        } else if (kee2.dVG() == 126 && !kee2.dVI().equals(kea.piE)) {
            this.nHS.b(kee2);
        } else if (kee2.dVG() == 221 && !kee2.dVI().equals(kea.piE)) {
            this.nHS.a(kee2);
        } else {
            this.phM.put(kee2.dVH(), kee2);
        }
    }

    @Override
    protected void Y() {
        this.phR = new kdz();
        this.phR.setVersion(0, 1);
        this.phR.setName(this.getClass().getName());
        this.phR.Wx(5);
        this.phR.setLevel(0);
        this.phR.fJ(1, 14);
        this.phR.fJ(1, 22);
        this.phR.fJ(1, 126);
        this.phR.fJ(1, 221);
    }

    public void a(List list, int n) {
        if (n == 1) {
            this.a(list);
        }
    }

    protected void a(List list) {
        this.phS.addAll(list);
        this.phR.setLevel(1);
        this.phQ = kdw.a.phY;
    }

    @Override
    public void cleanUp() {
        if (this.nHS.isInitialized()) {
            this.nHS.cleanup();
        }
    }

    @Override
    public void e(ldz ldz2) {
        if (!this.nHS.isInitialized()) {
            this.nHS.initialize();
        }
        this.nHS.b(ldz2.rgz, ldz2.qwh, ldz2.lpr);
    }
}

