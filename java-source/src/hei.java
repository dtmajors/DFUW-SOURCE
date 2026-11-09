/*
 * Decompiled with CFR.
 */
public class hei {
    public final ldv dbx;
    public final hdw kdY;
    private final ldl kdZ = new ldl();
    private final ldl kea = new ldl();
    private final ljp keb = new ljp();
    private final ljp eis = new ljp();
    private lip iKP = ljg.roH;
    private float eir = 0.0f;

    public hei(ldv ldv2, hdw hdw2) {
        this.dbx = ldv2;
        this.kdY = hdw2;
    }

    public final lbl<lbn> cfs() {
        return this.kdZ;
    }

    public final lbl<lbn> cft() {
        return this.kea;
    }

    public final lip cfu() {
        return this.iKP;
    }

    public final void e(lip lip2) {
        if (lip2.i(this.iKP)) {
            return;
        }
        this.iKP = lip2;
        this.kea.enp();
    }

    public final ljp cfv() {
        return new ljp(this.keb);
    }

    public final void m(ljp ljp2) {
        if (ljp2.z(this.keb)) {
            return;
        }
        this.keb.u(ljp2);
        this.kdZ.enp();
    }

    public final float bmQ() {
        return this.eir;
    }

    public final void gu(float f2) {
        if (ldq.ai(f2, this.eir)) {
            return;
        }
        this.eir = f2;
        this.kea.enp();
    }

    public final ljp cfw() {
        return new ljp(this.eis);
    }

    public final void n(ljp ljp2) {
        if (ljp2.z(this.eis)) {
            return;
        }
        this.eis.u(ljp2);
        this.kea.enp();
    }

    public final String toString() {
        return null;
    }
}

