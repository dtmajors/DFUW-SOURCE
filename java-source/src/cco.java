/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class cco
extends cbx
implements bto {
    protected amm elb = null;
    protected cbu elL = null;
    private btn elh = null;

    public cco(boolean bl) {
        super(bl);
        this.ObjectType = 99;
    }

    public final amm aIB() {
        return this.elb;
    }

    public final void a(amm amm2) {
        this.elb = amm2;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.elL != null) {
            this.elL.doTick(ldz2);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.elL != null) {
            this.elL.remove();
            this.elL = null;
        }
    }

    protected void aIw() {
        super.aIw();
        amm amm2 = lea.eoN().get(this.az());
        if (amm2 == null) {
            assert (false);
            return;
        }
        this.elb = amm2;
        this.aIT();
    }

    private void aIT() {
        ej ej2 = this.fi().ae(1408);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof eq)) {
            lfn.b(5, "SFBuildingServer", "handleObjectInitialized() Not a boolean attribute");
            assert (false);
            return;
        }
        if (this.elb.GN() == null) {
            assert (false);
            return;
        }
        eq eq2 = (eq)ej2;
        this.elL = new cbu(this);
        this.elL.fy(eq2.getBooleanValue());
        this.elL.setMeshXML(this.elb.GN());
        this.elL.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.elL);
    }

    public boolean aHY() {
        if (this.elL == null) {
            return false;
        }
        return this.elL.aHY();
    }

    public boolean fx(boolean bl) {
        if (this.elL == null) {
            return false;
        }
        return this.elL.fx(bl);
    }

    public boolean aIe() {
        return this.elL == null ? true : this.elL.aIe();
    }

    public void b(btn btn2) {
        this.elh = btn2;
    }

    public void receiveMessage(dxq dxq2) {
        if (this.elh != null && this.elh.a(dxq2, (btk)((Object)this))) {
            return;
        }
        super.receiveMessage(dxq2);
    }
}

