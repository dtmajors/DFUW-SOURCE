/*
 * Decompiled with CFR.
 */
public class aci
extends ach {
    private boolean bdP = true;

    @Override
    public boolean isLocked() {
        return this.bdP;
    }

    public void aB(boolean bl) {
        this.bdP = bl;
    }

    aci(ach ach2) {
        super(ach2.getID(), ach2.yI(), ach2.yJ(), ach2.wF());
    }

    aci(ach ach2, String string) {
        super(ach2.getID(), ach2.yI(), ach2.yJ(), ach2.wF(), ach2.ym());
    }

    public String wJ() {
        return this.bdP ? xc.dW(this.getID()) : xc.dX(this.getID());
    }

    public void cs(String string) {
        this.bdP = xc.co(string) == 'L';
    }
}

