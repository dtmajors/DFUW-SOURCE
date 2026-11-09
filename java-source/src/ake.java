/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ake
extends akc {
    private int asi = 0;

    public ake() {
        this.bog = ajb.b.bpb;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    @Override
    protected int Dd() {
        return this.asi;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ake ake2 = (ake)aja2;
        ake2.do(this.asi);
    }
}

