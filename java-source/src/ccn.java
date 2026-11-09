/*
 * Decompiled with CFR.
 */
public class ccn
extends ccd {
    private ldv aDn;
    private String aDo;
    private boolean elK;

    public ccn() {
        super(true);
        this.ObjectType = 139;
    }

    @Override
    public int ry() {
        return 4;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.elh == null || !this.elh.a(dxq2, (btk)((Object)this))) {
            super.receiveMessage(dxq2);
        }
    }

    @Override
    public void a(amm amm2) {
        super.a(amm2);
        boolean bl = false;
        aml aml2 = amm2.gU(9824);
        if (aml2 == null) {
            assert (false);
        } else {
            this.oO((int)((mhn)aml2.Gt()).Pz);
        }
    }

    public final ldv abj() {
        return this.aDn;
    }

    public final void ks(ldv ldv2) {
        this.aDn = ldv2;
    }

    public void dr(boolean bl) {
        this.elK = !bl;
        ez ez2 = (ez)this.fi().ae(352);
        assert (ez2 != null);
        if (bl) {
            ez2.a(ep.a.Pe);
        } else {
            ez2.a(ep.a.Pg);
        }
    }

    private void aqw() {
        this.aqx();
        ((ez)this.jm().ah(352)).ga();
    }

    @Override
    public void a(ccf ccf2) {
        for (ldv ldv2 : this.ekW.keySet()) {
            ebs ebs2 = (ebs)this.MessageDelegator.h(17422, this.getGUID(), ldv2);
            ebs2.ilb = ccf2.ordinal();
            ebs2.azF = this.rz();
            ebs2.aDo = this.abk();
            ebs2.ilc = null;
            ebs2.azY = this.abj();
            ebs2.azE = this.ry();
            this.MessageDelegator.F(ebs2);
        }
        this.ekW.clear();
    }

    @Override
    public ccf b(ldv ldv2, ccf ccf2) {
        ebs ebs2 = (ebs)this.MessageDelegator.h(17422, this.getGUID(), ldv2);
        ebs2.ilb = ccf2.ordinal();
        ebs2.azF = this.rz();
        ebs2.aDo = this.abk();
        ebs2.ilc = null;
        ebs2.azY = this.abj();
        ebs2.azE = this.ry();
        this.MessageDelegator.F(ebs2);
        return this.kr(ldv2);
    }

    protected void aqx() {
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFSiegeStoneServer", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (!(ej2 instanceof ex)) {
            lfn.b(5, "SFSiegeStoneServer", "enableAttributeNotification() Health NOT limited float attribute");
            return;
        }
        ex ex2 = (ex)ej2;
        ex2.y(true);
    }

    public final String abk() {
        return this.aDo;
    }

    public final void gZ(String string) {
        this.aDo = string;
    }

    @Override
    public void bL(String string) {
        this.azF = string;
        this.fi().aq(1328).av(string);
    }
}

