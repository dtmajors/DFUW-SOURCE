/*
 * Decompiled with CFR.
 */
import java.util.HashMap;

public class jjw {
    jjz nrD;
    private bcp nrE;
    private HashMap<ldv, jka> nrF = new HashMap();

    public jjw(bcp bcp2) {
        this.nrE = bcp2;
    }

    public jjz dKM() {
        return this.nrD;
    }

    public bcp dKN() {
        return this.nrE;
    }

    public ldv getGUID() {
        return this.nrE.iG();
    }

    public HashMap<ldv, jka> dKO() {
        return this.nrF;
    }

    public void a(jka jka2, jkc jkc2) {
        if (jka2.nrU != null) {
            return;
        }
        this.nrF.put(jka2.getGUID(), jka2);
        jka2.nrU = this;
        if (this.nrD != null) {
            for (jjx jjx2 : this.nrD.nrR) {
                jjx2.a(this, jka2);
            }
        }
        jka2.a(jkc2);
    }

    public void a(jka jka2) {
        if (jka2.nrU != this) {
            return;
        }
        jka2.a(new jkc(jka2.dJZ() ? jkb.nrY : jkb.nsh, 0.0, 0.0, 0.0));
        this.nrF.remove(jka2.getGUID());
        jka2.nrU = null;
        if (this.nrD != null) {
            for (jjx jjx2 : this.nrD.nrR) {
                jjx2.d(this, jka2);
            }
        }
    }

    public String getName() {
        return this.nrE.iV();
    }

    public void setName(String string) {
        this.nrE.eT(string);
        for (jka jka2 : this.nrF.values()) {
            if (this.nrD == null) continue;
            for (jjx jjx2 : this.nrD.nrR) {
                jjx2.b(this, jka2);
            }
        }
    }

    public jka X(jjh jjh2) {
        jka jka2 = null;
        float f2 = 10.0f;
        for (jka jka3 : this.nrF.values()) {
            float f3 = ljq.z(jjh2.av(), jka3.av()).eqN();
            if (!(f3 < f2)) continue;
            jka2 = jka3;
            f2 = f3;
        }
        return jka2;
    }
}

