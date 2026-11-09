/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class dll
extends dlo {
    private clb bBw = null;

    @Override
    public amm aIB() {
        if (this.bBw == null) {
            return null;
        }
        return this.bBw.aIB();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19202: {
                this.a((fet)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void XZ() {
        this.bBw = null;
        super.XZ();
    }

    private void a(fet fet2) {
        if (fet2.aVk() < 2) {
            assert (false);
            return;
        }
        this.gGt = true;
        if (fet2.bOP() == null) {
            lfn.b(5, "SFGuardTowerStructure", "handleGuardTowerCreateResponse() GuardTower IS NULL!");
            return;
        }
        if (fet2.aVk() == 3) {
            lfn.b(0, "SFBuildingStructure", "handleBuildingCreateResponse() ChaningStructureDamage");
            this.b(fet2);
            return;
        }
        if (fet2.aVk() == 2) {
            this.y(this.bBw);
            this.bBw = null;
            this.Qg = null;
        }
        this.bBw = fet2.bOP();
        this.Qg = this.bBw;
        this.bBw.a((cbq)this);
        this.bBw.a((btn)this);
        this.bBw.a(this);
        if (fet2.aVk() == 5) {
            this.bpH();
            this.bBw.Hy();
            this.bpK();
            this.c(this.Qg, this.csA.XM());
        } else {
            this.aSv();
            this.bBw.Hy();
        }
        if (fet2.aVk() != 5) {
            this.a(this.Qg, 15.0f, ep.a.Pe);
        }
    }

    @Override
    protected void disable() {
        super.disable();
        if (this.bBw != null) {
            this.bBw.disable();
        }
    }

    @Override
    protected void enable() {
        super.enable();
        if (this.bBw != null) {
            this.bBw.enable();
        }
    }

    private void b(fet fet2) {
        super.z(fet2.bOP());
        this.bBw = fet2.bOP();
        this.bBw.a((cbq)this);
    }

    @Override
    protected void bN(int n, int n2) {
        fes fes2 = (fes)this.MessageDelegator.h(19201, this.getGUID(), lcr.qBs);
        fes2.l(n);
        fes2.jS(true);
        fes2.c(this.csA.av());
        fes2.a(this.csA.aw());
        fes2.oF(this.getGUID());
        fes2.sk(n2);
        this.MessageDelegator.F(fes2);
    }

    @Override
    protected void y(cbx cbx2) {
        assert (cbx2 instanceof clb);
        clb clb2 = (clb)cbx2;
        few few2 = (few)this.MessageDelegator.h(19203, this.getGUID(), lcr.qBs);
        few2.kZ(true);
        few2.pD(clb2.getGUID());
        this.MessageDelegator.F(few2);
        this.MessageDelegator.hd(cbx2.getGUID());
    }

    @Override
    public void a(cbx cbx2, et et2) {
        lfn.b(0, "SFBuildingStructure", "handleFloatAttributeChanged() Attrib changed!");
        super.a(cbx2, et2);
    }

    public void c(cla cla2) {
        if (this.bBw != null) {
            this.bBw.c(cla2);
        }
    }

    @Override
    public void aSp() {
        if (this.bBw != null) {
            this.bBw.HU();
        }
    }

    @Override
    public void HV() {
        if (this.bBw != null) {
            this.bBw.HV();
        }
    }

    public boolean dv(ldv ldv2) {
        return this.csC == null ? false : this.csC.dv(ldv2);
    }

    public boolean dw(ldv ldv2) {
        return this.csC == null ? false : this.csC.dw(ldv2);
    }

    public boolean dx(ldv ldv2) {
        return this.csC == null ? false : this.csC.dx(ldv2);
    }

    public boolean dy(ldv ldv2) {
        return this.csC == null ? false : this.csC.dy(ldv2);
    }

    public boolean dz(ldv ldv2) {
        return this.csC == null ? false : this.csC.dz(ldv2);
    }
}

