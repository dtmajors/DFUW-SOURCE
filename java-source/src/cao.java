/*
 * Decompiled with CFR.
 */
public class cao
extends cam {
    private int bnm = 0;

    public int atS() {
        return this.bnm;
    }

    public void fx(int n) {
        this.bnm = n;
    }

    public String Yq() {
        return bqm.md(this.bnm);
    }

    @Override
    public String aGk() {
        String string = this.Yq();
        return super.aGk() + " " + string.substring(4, string.length());
    }

    @Override
    protected void a(cam cam2) {
        super.a(cam2);
        cao cao2 = (cao)cam2;
        cao2.fx(this.bnm);
    }

    @Override
    protected final can aGm() {
        return new cap(this.az(), this.bnm);
    }
}

