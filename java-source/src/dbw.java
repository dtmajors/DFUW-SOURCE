/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 */
public abstract class dbw {
    protected final cxd.j gcB;
    protected cwx boj = null;

    public dbw(cxd.j j2) {
        this.gcB = j2;
    }

    public final cxd.j bji() {
        return this.gcB;
    }

    public final cwx Co() {
        return this.boj;
    }

    public final void a(cwx cwx2) {
        this.boj = cwx2;
    }

    public final dbw bjj() {
        dbw dbw2 = null;
        try {
            Class<?> clazz = this.getClass();
            dbw2 = (dbw)clazz.newInstance();
            this.a(dbw2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return dbw2;
    }

    public void a(czc.a a2) {
    }

    public void nh() {
    }

    public final String getName() {
        return this.gcB.name();
    }

    public void bjk() {
    }

    public void beQ() {
    }

    public void a(ldv ldv2, cxd.k k2, float f2) {
    }

    public void gc(float f2) {
    }

    public String toString() {
        return this.getName();
    }

    protected void a(dbw dbw2) {
    }
}

