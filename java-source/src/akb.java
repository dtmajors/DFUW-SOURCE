/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class akb
extends aka {
    private int asi = 0;

    public akb() {
        this.bog = ajb.b.boZ;
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
        akb akb2 = (akb)aja2;
        akb2.do(this.asi);
    }
}

