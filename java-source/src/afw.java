/*
 * Decompiled with CFR.
 */
public class afw
extends agj {
    private ej bhp = null;
    private static final float bhq = 1.0f;
    private static final float bhr = 1.0f;
    private static final float bhs = 1.0f;
    private static final float bht = 0.5f;
    private static final float bhu = 0.01f;
    private static final float bhv = 0.01f;
    private static final float bhw = 0.01f;
    private static final float bhx = 0.005f;

    public afw() {
        super(ahu.b.blP);
        this.bhY = new agj.a[4];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
        this.bhY[3] = new agj.a(this, 8);
    }

    public ej An() {
        return this.bhp;
    }

    public void h(ej ej2) {
        this.bhp = ej2;
    }

    @Override
    public vd eD(int n) {
        uu uu2 = null;
        switch (this.bhp.getDataType()) {
            case 0: {
                uu2 = this.Ao();
                break;
            }
            case 1: {
                uu2 = this.Ap();
                break;
            }
            case 2: {
                uu2 = this.Aq();
                break;
            }
            case 3: {
                uu2 = this.Ar();
                break;
            }
            case 4: {
                uu2 = this.As();
                break;
            }
            case 5: {
                uu2 = this.At();
                break;
            }
            case 6: {
                uu2 = this.Au();
                break;
            }
            case 7: {
                uu2 = this.Av();
                break;
            }
            case 8: {
                uu2 = this.Aw();
                break;
            }
            case 9: {
                uu2 = this.Ax();
                break;
            }
            default: {
                return null;
            }
        }
        if (this.eT(1) > n && !this.bhX) {
            uu2.aXP = 1;
            return uu2;
        }
        if (this.eT(2) > n && !this.bhX) {
            uu2.aXP |= 1;
        }
        if (this.eT(8) > n) {
            uu2.aXP |= 8;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            uu2.aXP = 4;
        }
        return uu2;
    }

    private uy Ao() {
        uy uy2 = new uy();
        uy2.Uo = this.bhp.getType();
        uy2.Pp = ((eq)this.bhp).getBooleanValue();
        return uy2;
    }

    private vc Ap() {
        es es2 = (es)this.bhp;
        vc vc2 = new vc();
        vc2.Uo = this.bhp.getType();
        vc2.Ps = es2.fD();
        vc2.Pt = es2.fE();
        vc2.IngredientResourceTypes = es2.fF();
        return vc2;
    }

    private vf Aq() {
        vf vf2 = new vf();
        vf2.Uo = this.bhp.getType();
        vf2.Pz = ((et)this.bhp).fN();
        vf2.PA = ((et)this.bhp).fM();
        return vf2;
    }

    private vh Ar() {
        vh vh2 = new vh();
        vh2.Uo = this.bhp.getType();
        vh2.PC = ((ew)this.bhp).fQ();
        return vh2;
    }

    private vg As() {
        vg vg2 = new vg();
        vg2.Uo = this.bhp.getType();
        vg2.PB = ((ev)this.bhp).fP();
        return vg2;
    }

    private vn At() {
        vn vn2 = new vn();
        vn2.Uo = this.bhp.getType();
        return vn2;
    }

    private vu Au() {
        vu vu2 = new vu();
        vu2.Uo = this.bhp.getType();
        vu2.Qi = ((fh)this.bhp).gy();
        return vu2;
    }

    private vr Av() {
        vr vr2 = new vr();
        vr2.Uo = this.bhp.getType();
        vr2.Value = ((ff)this.bhp).getStringValue();
        return vr2;
    }

    private vs Aw() {
        vs vs2 = new vs();
        vs2.Uo = this.bhp.getType();
        vs2.Qh = ((fg)this.bhp).gx();
        return vs2;
    }

    private vb Ax() {
        vb vb2 = new vb();
        vb2.Uo = this.bhp.getType();
        vb2.Pq = ((er)this.bhp).fC();
        return vb2;
    }

    public String toString() {
        return "SFAttributeEventProperty: Attribute='" + this.bhp.getName() + "' AttributeValue=" + this.bhp;
    }

    public boolean i(ej ej2) {
        if (this.bhp == null) {
            return true;
        }
        assert (this.bhp.getDataType() == ej2.getDataType());
        if (this.bhp.getDataType() != ej2.getDataType()) {
            return true;
        }
        switch (this.bhp.getDataType()) {
            case 2: {
                return this.j(ej2);
            }
        }
        return true;
    }

    private boolean j(ej ej2) {
        int n = this.bhp.getType();
        switch (n) {
            case 352: 
            case 384: 
            case 400: 
            case 1232: {
                float f;
                float f2 = Math.abs(((et)this.bhp).fN() - ((et)ej2).fN());
                float f3 = afw.eG(n);
                if (f2 < f3) {
                    return false;
                }
                if (this.bhp.fi() != null && (f = this.bhp.fi().ai(n)) > 0.0f) {
                    float f4 = f * afw.eH(this.bhp.getType());
                    return f2 >= f4;
                }
                return true;
            }
        }
        return true;
    }

    private static float eG(int n) {
        switch (n) {
            case 352: {
                return 1.0f;
            }
            case 384: {
                return 1.0f;
            }
            case 400: {
                return 1.0f;
            }
            case 1232: {
                return 0.5f;
            }
        }
        assert (false) : "SFAttributeEventProperty.getHardCodedMinimumDelta() : WRONG ATTRIBUTE TYPE!!!";
        return 0.0f;
    }

    private static float eH(int n) {
        switch (n) {
            case 352: {
                return 0.01f;
            }
            case 384: {
                return 0.01f;
            }
            case 400: {
                return 0.01f;
            }
            case 1232: {
                return 0.005f;
            }
        }
        assert (false) : "SFAttributeEventProperty.getPercentageDeltaMinimum() : WRONG ATTRIBUTE TYPE!!!";
        return 0.0f;
    }
}

