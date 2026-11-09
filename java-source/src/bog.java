/*
 * Decompiled with CFR.
 */
public class bog
extends bnu {
    private ldv dxn = null;

    public bog() {
        super(false);
    }

    @Override
    protected void a(fky fky2) {
        if (this.dxn == null) {
            this.dxn = ((boj)this.dwJ).id(this.GUID);
        }
        fky2.f(this.GUID);
        fky2.on(this.dxn);
        this.MessageDelegator.E(fky2);
    }

    @Override
    protected void a(fkz fkz2) {
        if (fkz2.iPj) {
            this.a(mdd.uFn.bD(new Object[0]));
        } else {
            this.a(fkz2.Cw());
        }
    }

    @Override
    protected void setDefaultState() {
        super.setDefaultState();
        this.dxn = null;
    }
}

