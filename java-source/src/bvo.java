/*
 * Decompiled with CFR.
 */
public class bvo
extends bvd {
    private boolean dQm = false;

    public bvo(bve.a a2) {
        super(a2);
        this.WorldbuilderSaveable = false;
    }

    @Override
    public final boolean ayZ() {
        return this.dQm;
    }

    @Override
    public final boolean isServerObject() {
        return false;
    }

    @Override
    protected void azh() {
        assert (this.GUID != null);
        this.dJs = this.GUID;
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.hC(this.dJs);
        krr2.ts(this.GUID);
        krr2.xc(this.FileName);
        krr2.xC(true);
        krr2.xe("");
        krr2.xd("");
        krr2.c(this.Position);
        krr2.a(this.Rotation);
        krr2.setObjectType(this.ResourceType);
        krr2.xD(true);
        this.MessageDelegator.a(krr2);
    }

    @Override
    protected void azj() {
        this.dQm = true;
    }
}

