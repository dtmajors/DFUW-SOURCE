/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Iterator;
import java.util.Map;

public class dej
extends btk
implements bto {
    private dld rh = null;
    private Map<ldv, dlc> gfn = null;
    private ljq gfo = new ljq(0.5f, 1.0f, 0.5f);
    private float gfp = 50.0f;

    public dej() {
        this.gfn = lcn.emw();
    }

    public void a(ljq ljq2, float f2, float f3, ldv ldv2, double d2) {
        float f4;
        if (this.rh == null) {
            return;
        }
        ljq ljq3 = new ljq(this.rh.av());
        ljq3.et(ljq2);
        float f5 = ljq3.eqN();
        if (Math.abs(f5) > f3) {
            return;
        }
        float f6 = f5 / f3;
        f6 = (1.0f - f6) * f2;
        ljq ljq4 = new ljq(this.gfo);
        ljq4.nm(f6);
        dlc dlc2 = new dlc();
        dlc2.bX(ljq4);
        if (d2 == -2.0) {
            f4 = f6;
            if (f6 <= 0.0f) {
                f4 = 0.05f;
            }
            dlc2.setDuration(f4);
        } else {
            dlc2.setDuration((float)d2);
        }
        f4 = f6 * this.gfp;
        if (f4 <= 0.0f) {
            f4 = 0.05f;
        }
        dlc2.eK(f4);
        this.gfn.put(ldv2, dlc2);
    }

    public void a(ljq ljq2, float f2, float f3, dgj dgj2) {
        this.a(ljq2, f2, f3, dgj2.getGUID(), dgj2.getDuration());
    }

    public void b(ljq ljq2, float f2, float f3, ldv ldv2, double d2) {
        float f4;
        if (this.rh == null) {
            return;
        }
        dlc dlc2 = null;
        if (!this.gfn.containsKey(ldv2)) {
            this.a(ljq2, f2, f3, ldv2, d2);
            return;
        }
        dlc2 = this.gfn.get(ldv2);
        assert (dlc2 != null);
        ljq ljq3 = new ljq(this.rh.av());
        ljq3.et(ljq2);
        float f5 = ljq3.eqN();
        if (Math.abs(f5) > f3) {
            return;
        }
        float f6 = f5 / f3;
        f6 = (1.0f - f6) * f2;
        ljq ljq4 = new ljq(this.gfo);
        ljq4.nm(f6);
        dlc2.bX(ljq4);
        if (d2 == -2.0) {
            f4 = f6;
            if (f4 <= 0.0f) {
                f4 = 0.05f;
            }
            dlc2.setDuration(f4);
        } else {
            dlc2.setDuration((float)d2);
        }
        f4 = f6 * this.gfp;
        if (f4 <= 0.0f) {
            f4 = 0.05f;
        }
        dlc2.eK(f4);
    }

    public void b(ljq ljq2, float f2, float f3, dgj dgj2) {
        this.b(ljq2, f2, f3, dgj2.getGUID(), dgj2.getDuration());
    }

    @Override
    public void doTick(ldz ldz2) {
        this.ae(ldz2);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
    }

    public void ae(ldz ldz2) {
        if (this.rh == null) {
            return;
        }
        Iterator<Map.Entry<ldv, dlc>> iterator = this.gfn.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<ldv, dlc> entry = iterator.next();
            dlc dlc2 = entry.getValue();
            if (!dlc2.isStarted()) {
                dlc2.gW((float)ldz2.rgz);
            }
            if (dlc2.boQ() < (float)ldz2.rgz) {
                iterator.remove();
                continue;
            }
            ljq ljq2 = dlc2.J((float)ldz2.rgz, (float)ldz2.qwh);
            this.rh.cc(ljq2);
        }
    }

    public dld bkH() {
        return this.rh;
    }

    public void a(dld dld2) {
        this.rh = dld2;
    }

    public ljq getCameraPosition() {
        return this.rh.av();
    }

    public ljq getCameraReadOnlyPosition() {
        return this.rh.bpk();
    }

    public ljq getCameraDirection() {
        return new ljq(this.rh.bpa());
    }

    public ljq getCameraDirectionReadOnly() {
        return this.rh.bpa();
    }
}

