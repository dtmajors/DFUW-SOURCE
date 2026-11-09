/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
import java.util.Collections;
import java.util.List;

public class hea
extends hdu {
    private float kbS;
    private float AdvancementRate;
    private double kbP;
    private double kbQ;

    public hea(hel hel2, ldv ldv2, hdx hdx2) {
        super(hel2, ldv2, hdx2);
    }

    public final hdx ceG() {
        return (hdx)this.kaW;
    }

    public final cxc ceH() {
        return (cxc)this.cea();
    }

    public final float getLevel() {
        return this.kbS;
    }

    public final ctm[] e(ctu ctu2) {
        return cwy.c(this.ceH(), ctu2);
    }

    @Deprecated
    public final int[] a(ctu ctu2) {
        return cwy.a(this.ceH(), ctu2);
    }

    public final float f(ctu ctu2) {
        return cwy.b(this.ceH(), ctu2);
    }

    public final double g(ctu ctu2) {
        return cwy.a(this.ceH(), ctu2, 1, 1, 0);
    }

    @Deprecated
    public final boolean a(hdw hdw2) {
        return lio.j(this.ceH(), hdw2.Type);
    }

    public final boolean b(hdw hdw2) {
        return cwy.a(this.ceH(), hdw2.Type);
    }

    public final boolean a(lij<hdw> lij2, hdw hdw2) {
        hdw hdw3 = lij2.ab(hdw2);
        if (hdw3 == null) {
            return this.a(hdw2);
        }
        while (hdw3 != null) {
            if (this.a(lij2, hdw3)) {
                return true;
            }
            hdw3 = lij2.ac(hdw3);
        }
        return false;
    }

    public final double cez() {
        return this.kbP;
    }

    public final double ceA() {
        return this.kbQ;
    }

    public final void h(double d2, double d3) {
        if (d2 == this.kbP && d3 == this.kbQ) {
            return;
        }
        this.kbP = d2;
        this.kbQ = d3;
        this.cdX();
    }

    @Override
    protected void cbg() {
        super.cbg();
    }

    @Override
    public List<ej> getAttributes() {
        return Collections.emptyList();
    }

    @Override
    public final lip ced() {
        return null;
    }

    @Override
    protected lip cee() {
        return this.ceG().cdY();
    }

    @Override
    protected void aU(List<heh> list) {
        list.add(new heh(lcy.qRM, new ljm(this.kbS)));
        list.add(new heh(lcy.qYW, new ljm(this.AdvancementRate)));
    }

    @Override
    protected boolean b(bsf bsf2) {
        float f2;
        boolean bl = super.b(bsf2);
        bsj bsj2 = (bsj)bsf2;
        float f3 = bsj2.Bt();
        if (f3 != this.kbS) {
            this.kbS = f3;
            bl = true;
        }
        if ((f2 = bsj2.pe()) != this.AdvancementRate) {
            this.AdvancementRate = f2;
            bl = true;
        }
        return bl;
    }

    @Override
    public String toString() {
        return null;
    }
}

