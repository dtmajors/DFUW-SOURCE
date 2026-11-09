/*
 * Decompiled with CFR.
 */
import java.util.List;

public class be
extends kdw {
    @Override
    protected void Y() {
        this.phR = new kdz();
        this.phR.setVersion(0, 1);
        this.phR.setName(this.getClass().getName());
        this.phR.Wx(5);
        this.phR.setLevel(0);
        this.phR.fJ(1, 14);
    }

    public void a(List list, int n) {
        this.phS.addAll(list);
        this.phR.setLevel(n);
        this.phQ = kdw.a.phY;
        this.phR.setLevel(n);
    }

    @Override
    public void e(ldz ldz2) {
        this.Z();
    }

    protected void Z() {
        kff kff22 = null;
        for (kff kff22 : this.phM.values()) {
            while (!kff22.isEmpty()) {
                String string = kff22.dVW().toString();
            }
        }
    }

    @Override
    public void a(kee kee2, int n) {
        if (kee2.dVG() == 2) {
            this.phS.add(kee2);
        } else {
            this.phM.put(kee2.dVH(), kee2);
        }
    }

    public void a(Object object) {
    }
}

