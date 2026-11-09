/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  cxd
 *  ep
 *  lcr
 */
public class em
extends el {
    public em(cbx cbx2) {
        super(cbx2);
    }

    public final void fr() {
    }

    @Override
    public final boolean isServerObject() {
        return false;
    }

    @Override
    protected final void e(ej ej2) {
        assert (ej2.getDataType() != 2);
        if (this.isInitialized()) {
            this.a(2, ej2);
            switch (ej2.getType()) {
                case 10432: {
                    this.DV.b((ff)ej2);
                }
            }
        }
    }

    @Override
    protected void c(ej ej2) {
        super.c(ej2);
        if (ej2.getType() == 5552 || ej2.getType() == 10960) {
            this.DV.b((eq)ej2, false);
        }
    }

    @Override
    protected final void a(eq eq2, boolean bl) {
        assert (eq2.getDataType() == 0);
        if (this.isInitialized()) {
            this.a(2, eq2);
            switch (eq2.getType()) {
                case 1280: 
                case 1312: 
                case 1344: 
                case 1408: 
                case 5552: 
                case 10496: 
                case 10928: 
                case 10960: 
                case 12432: 
                case 13888: 
                case 13904: {
                    this.DV.b(eq2, bl);
                }
            }
        }
    }

    @Override
    protected final void a(et et2, float f) {
        assert (et2.getDataType() == 2);
        if (this.isInitialized()) {
            float f2;
            cew cew2;
            this.a(2, et2);
            if (this.DV instanceof cew && ((cew)this.DV).aJI() && ep.aT((int)et2.getType()) && (cew2 = (cew)this.DV).getMessageDelegator() != null && Math.abs((f2 = et2.fN() - f) * 10.0f) >= 1.0f) {
                if (f2 > 0.0f) {
                    this.a(lzy.tZm.bD(et2.getType(), Float.valueOf(et2.fN())));
                } else {
                    this.a(lzy.tZn.bD(et2.getType(), Float.valueOf(et2.fN())));
                }
            }
            if (ep.aY((int)et2.getType())) {
                this.DV.d(et2, f);
                return;
            }
            if (cxj.yB(et2.getType())) {
                if (this.DV instanceof cew) {
                    this.DV.d(et2, f);
                }
                return;
            }
            switch (et2.getType()) {
                case 160: 
                case 352: 
                case 1504: 
                case 1506: {
                    this.DV.d(et2, f);
                    break;
                }
                case 354: 
                case 400: 
                case 402: {
                    if (!(this.DV instanceof cew) || !((cew)this.DV).aJI()) break;
                    this.DV.d(et2, f);
                    break;
                }
                case 11056: 
                case 11104: {
                    if (!(this.DV instanceof cew) || (cew2 = (cew)this.DV).aJD() == null || cew2.aJD().aDc() == null) break;
                    cew2.aJD().aDc().aDh();
                }
            }
        }
    }

    @Override
    protected final void a(ew ew2, int n) {
        assert (ew2.getDataType() == 3);
        if (this.isInitialized()) {
            this.a(2, ew2);
            switch (ew2.getType()) {
                case 1136: 
                case 1296: 
                case 1424: 
                case 10400: 
                case 10544: 
                case 10560: 
                case 10576: 
                case 10912: 
                case 11008: 
                case 12432: 
                case 13696: 
                case 13712: 
                case 14080: {
                    this.DV.c(ew2, n);
                }
            }
        }
    }

    public final void a(loz loz2) {
        fgs fgs2 = (fgs)this.DV.getMessageDelegator().h(29446, this.DV.getGUID(), lcr.acL);
        fgs2.r(loz2);
        this.DV.getMessageDelegator().F(fgs2);
    }

    @Override
    public final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23560: {
                this.a((eyu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eyu eyu2) {
        eyv eyv2 = (eyv)this.DV.getMessageDelegator().h(23561, this.DV.getGUID(), eyu2.aO());
        eyv2.iFM = this.DU == null || this.DU.isEmpty() ? new alu[0] : this.DU.toArray(new alu[this.DU.size()]);
        this.DV.getMessageDelegator().E(eyv2);
    }

    public final void a(uu uu2) {
        assert (uu2 != null);
        assert (uu2.Uo > 0);
        assert (uu2.aXP > 0);
        if ((uu2.aXP & 1) > 0) {
            this.b(uu2);
        }
        if ((uu2.aXP & 2) > 0 && !this.ad(uu2.Uo)) {
            this.b(uu2);
        }
        if ((uu2.aXP & 8) > 0) {
            this.d(uu2);
        }
        if ((uu2.aXP & 4) > 0) {
            this.c(uu2);
        }
    }

    public final void a(vk vk2) {
        assert (vk2 != null);
        assert (vk2.Uo > 0);
        assert (vk2.aXP > 0);
        if ((vk2.aXP & 1) > 0) {
            if ((vk2.aXP & 4) > 0) {
                return;
            }
            this.a(vk2.aXW);
        }
        if ((vk2.aXP & 8) > 0) {
            lfn.b(5, "SFAttributeManagerClient", "handleModifierInfoPropertyUpdate() Update of modifierinfo objects not implemented.");
            assert (false);
        }
        if ((vk2.aXP & 4) > 0) {
            this.b(vk2.aXW);
        }
    }

    private void a(alu alu2) {
        assert (alu2 != null);
        if (this.DU == null) {
            this.DU = lcn.abH(2);
        } else if (this.DU.contains(alu2)) {
            lfn.b(5, "SFAttributeManagerClient", "addModifierInfo() ModifierInfo already exists: " + alu2);
            return;
        }
        this.DU.add(alu2);
        if (this.isInitialized()) {
            this.DV.h(alu2);
        }
    }

    private void b(uu uu2) {
        switch (uu2.aWp) {
            case 6: {
                eq eq2 = new eq();
                eq2.setType(uu2.Uo);
                eq2.x(((uy)uu2).Pp);
                this.b(eq2);
                break;
            }
            case 15: {
                vc vc2 = (vc)uu2;
                es es2 = new es();
                es2.setType(uu2.Uo);
                es2.bf(vc2.Ps);
                es2.m(vc2.Pt);
                es2.a(vc2.IngredientResourceTypes);
                this.b(es2);
                break;
            }
            case 17: {
                vf vf2 = (vf)uu2;
                et et2 = new et();
                et2.setType(uu2.Uo);
                et2.bg(vf2.PA);
                et2.o(vf2.Pz);
                this.b(et2);
                break;
            }
            case 19: {
                ev ev2 = new ev();
                ev2.setType(uu2.Uo);
                ev2.F(((vg)uu2).PB);
                this.b(ev2);
                break;
            }
            case 22: {
                vh vh2 = (vh)uu2;
                ew ew2 = new ew();
                ew2.setType(uu2.Uo);
                ew2.bi(vh2.PC);
                this.b(ew2);
                break;
            }
            case 29: {
                fe fe2 = new fe();
                fe2.setType(1488);
                this.b(fe2);
                break;
            }
            case 35: {
                ff ff2 = new ff();
                ff2.setType(uu2.Uo);
                ff2.av(((vr)uu2).Value);
                this.b(ff2);
                break;
            }
            case 38: {
                fh fh2 = new fh();
                fh2.setType(uu2.Uo);
                fh2.L(((vu)uu2).Qi);
                this.b(fh2);
                break;
            }
            case 42: {
                fg fg2 = new fg();
                fg2.setType(uu2.Uo);
                fg2.b(((vs)uu2).Qh);
                this.b(fg2);
                break;
            }
            case 43: {
                er er2 = new er();
                er2.setType(uu2.Uo);
                er2.d(((vb)uu2).Pq);
                this.b(er2);
                break;
            }
            default: {
                lfn.b(5, "SFAttributeManagerClient", "createAttribute() Received unhandled propertyupdate: " + uu2.getClass().getName());
                return;
            }
        }
    }

    private final void c(uu uu2) {
        this.removeAttribute(uu2.Uo);
    }

    private void b(alu alu2) {
        assert (alu2 != null);
        if (this.DU == null || !this.DU.contains(alu2)) {
            lfn.b(5, "SFAttributeManagerClient", "removeModifierInfo() ModifierInfo was not found: " + alu2);
            return;
        }
        this.DU.remove(alu2);
        if (this.DU.isEmpty()) {
            this.DU = null;
        }
        if (this.isInitialized()) {
            this.DV.i(alu2);
        }
    }

    private void d(uu uu2) {
        ej ej2 = this.ae(uu2.Uo);
        if (ej2 == null) {
            lfn.b(5, "SFAttributeManagerClient", "updateAttribute() Could not find attribute '" + ep.aM((int)uu2.Uo) + "'");
            return;
        }
        switch (uu2.aWp) {
            case 6: {
                cew cew2;
                uy uy2 = (uy)uu2;
                eq eq2 = (eq)ej2;
                eq2.x(uy2.Pp);
                if (!ep.be((int)eq2.getType()) || !eq2.getBooleanValue() || !(this.fp() instanceof cew) || (cew2 = (cew)this.fp()).aJz() == null) break;
                cew2.aJz().J(cxd.xp((int)eq2.getType()));
                break;
            }
            case 15: {
                vc vc2 = (vc)uu2;
                es es2 = (es)ej2;
                es2.bf(vc2.Ps);
                es2.m(vc2.Pt);
                es2.a(vc2.IngredientResourceTypes);
                break;
            }
            case 17: {
                vf vf2 = (vf)uu2;
                et et2 = (et)ej2;
                et2.bg(vf2.PA);
                et2.o(vf2.Pz);
                break;
            }
            case 19: {
                vg vg2 = (vg)uu2;
                ev ev2 = (ev)ej2;
                ev2.F(vg2.PB);
                break;
            }
            case 22: {
                vh vh2 = (vh)uu2;
                ew ew2 = (ew)ej2;
                ew2.bi(vh2.PC);
                break;
            }
            case 35: {
                vr vr2 = (vr)uu2;
                ff ff2 = (ff)ej2;
                ff2.av(vr2.Value);
                break;
            }
            case 38: {
                vu vu2 = (vu)uu2;
                fh fh2 = (fh)ej2;
                fh2.L(vu2.Qi);
                break;
            }
            case 42: {
                vs vs2 = (vs)uu2;
                fg fg2 = (fg)ej2;
                fg2.b(vs2.Qh);
                break;
            }
            case 43: {
                vb vb2 = (vb)uu2;
                er er2 = (er)ej2;
                er2.d(vb2.Pq);
                break;
            }
            default: {
                lfn.b(5, "SFAttributeManagerClient", "updateAttribute() Received unhandled propertyupdate: " + uu2.getClass().getName());
                return;
            }
        }
    }
}

