/*
 * Decompiled with CFR.
 */
public abstract class bnu
extends bnp {
    public bnu(boolean bl2) {
        super(bl2);
        this.ObjectType = 67;
        this.dwI = 2;
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

