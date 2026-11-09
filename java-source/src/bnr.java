/*
 * Decompiled with CFR.
 */
public abstract class bnr
extends bnp {
    public bnr(boolean bl2) {
        super(bl2);
        this.ObjectType = 66;
        this.dwI = 1;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11781: {
                this.a((fky)dxq2);
                break;
            }
            case 11782: {
                this.a((fkz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected abstract void a(fky var1);

    protected abstract void a(fkz var1);
}

