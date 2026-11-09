/*
 * Decompiled with CFR.
 */
public class ifh
extends ifg {
    protected hwm lOo = null;
    protected int lir = 0;
    protected int lis = 0;

    public ifh(hwm hwm2, int n, int n2) {
        super("singleitem.swf");
        this.OQ(-1);
        this.lOo = hwm2;
        this.lir = n;
        this.lis = n2;
    }

    @Override
    public void cBa() {
        String string = this.lOo.cBj().iconName;
        this.a("setItem", new Object[]{string});
    }

    @Override
    public void dC(int n, int n2) {
        super.dC(n, n2);
        this.R(n + this.lir, n2 + this.lis);
    }

    public hwm cQm() {
        return this.lOo;
    }
}

