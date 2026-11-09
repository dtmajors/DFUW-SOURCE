/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hbb
extends kdw {
    private hba jAC;

    public void initialize() {
        this.jAC.initialize();
    }

    @Override
    public void cleanUp() {
        this.jAC.cleanup();
    }

    @Override
    protected void Y() {
        this.phR = new kdz();
        this.phR.setVersion(0, 1);
        this.phR.setName(this.getClass().getName());
        this.phR.Wx(5);
        this.phR.setLevel(0);
        kdx kdx2 = new kdx();
        kdx2.Wv(3);
        kdx2.Ww(1);
        kdx2.wE(kea.piz);
        lju lju2 = new lju(0, 1);
        kdx2.a(lju2);
        kdx2.setDirection(2);
        this.phR.a(1, kdx2);
        kdx2 = new kdx();
        kdx2.Wv(3);
        kdx2.Ww(1);
        kdx2.wE(kea.piE);
        lju2 = new lju(0, 1);
        kdx2.a(lju2);
        kdx2.setDirection(2);
        this.phR.a(1, kdx2);
        this.phR.fJ(1, 21);
        this.phR.fJ(1, 34);
        this.phR.fJ(1, 12);
        this.phR.fJ(1, 22);
        this.phR.fJ(1, 30);
        this.phR.fJ(1, 38);
        this.phR.fJ(1, 39);
        this.phR.fJ(1, 127);
        this.phR.fJ(1, 222);
    }

    public void a(List list, int n) {
        if (n == 1) {
            this.aT(list);
        }
    }

    protected void aT(List list) {
        this.phS.addAll(list);
        this.jAC = new hba();
        this.phR.setLevel(1);
        this.phQ = kdw.a.phY;
    }

    @Override
    public void e(ldz ldz2) {
        assert (this.jAC != null);
        this.jAC.b(ldz2.rgz, ldz2.qwh, ldz2.lpr);
    }

    @Override
    public void a(kee kee2, int n) {
        if (kee2.dVG() == 12 && kee2.dVJ().equals(kea.piB)) {
            this.jAC.a(kee2);
        }
        if (kee2.dVG() == 12 && kee2.dVI().equals(kea.piB)) {
            this.jAC.b(kee2);
        }
        if (kee2.dVG() == 21 && kee2.dVI().equals(kea.piB)) {
            this.jAC.b(kee2);
        }
        if (kee2.dVG() == 30 && !kee2.dVI().equals(kea.piB)) {
            this.jAC.a(kee2);
        }
        if (kee2.dVG() == 30 && kee2.dVI().equals(kea.piB)) {
            this.jAC.b(kee2);
        }
        if (kee2.dVG() == 34 && !kee2.dVI().equals(kea.piB)) {
            this.jAC.a(kee2);
        }
        if (kee2.dVG() == 38 && kee2.dVI().equals(kea.piB)) {
            this.jAC.b(kee2);
        }
        if (kee2.dVG() == 39 && !kee2.dVI().equals(kea.piB)) {
            this.jAC.a(kee2);
        }
        if (kee2.dVG() == 127) {
            this.jAC.b(kee2);
        }
        if (kee2.dVG() == 222) {
            this.jAC.a(kee2);
        }
        if (kee2.dVG() == 2) {
            this.phS.add(kee2);
        } else {
            this.phM.put(kee2.dVH(), kee2);
        }
    }

    @Override
    protected int c(kdw.a a2) {
        switch (a2) {
            case pid: {
                if (this.jAC != null) {
                    this.jAC.bzu();
                }
                this.phQ = a2;
                break;
            }
            case pic: {
                if (this.jAC != null) {
                    this.jAC.shutdown();
                }
                this.phQ = a2;
                break;
            }
            default: {
                return super.c(a2);
            }
        }
        return 101;
    }
}

