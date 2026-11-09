/*
 * Decompiled with CFR.
 */
public class iwx
extends ipk {
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(1, 1);
        }
    };

    public iwx() {
        this(0x444444);
    }

    public iwx(int n, int n2) {
        this(0x444444, n, n2);
    }

    public iwx(int n) {
        this(n, 1, 1);
    }

    public iwx(int n, int n2, int n3) {
        super(n);
        this.a(mdv);
        this.setSize(n2, n3);
    }
}

