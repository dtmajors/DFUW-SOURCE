/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class aip
extends aio {
    public aip(cew cew2) {
        super((cev)cew2);
    }

    public final void a(uk uk2) {
        assert (uk2 instanceof vt);
        vt vt2 = (vt)uk2;
        if ((vt2.aXP & 1) > 0 || (vt2.aXP & 2) > 0) {
            ciw ciw2 = (ciw)lea.epC().get(vt2.ResourceType);
            if (ciw2 == null) {
                return;
            }
            aim aim2 = new aim(ciw2.BP(), vt2.ResourceType, vt2.jV);
            this.a(aim2);
            this.a(cbx.a.ekQ);
            return;
        }
        if ((vt2.aXP & 8) > 0) {
            aim aim3 = this.fz(vt2.ResourceType);
            if (aim3 == null) {
                assert (false);
                return;
            }
            aim3.setSelected(vt2.jV);
            this.a(cbx.a.ekQ);
            return;
        }
        assert (false) : "UnlockablePU : " + vt2;
    }

    @Override
    public boolean isServerObject() {
        return false;
    }
}

