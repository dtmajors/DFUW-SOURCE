/*
 * Decompiled with CFR.
 */
import java.util.Calendar;

public class chz {
    private int aYf;
    private long aYh;
    private int eAq;
    private boolean Active;

    public final int aOH() {
        return this.eAq;
    }

    public final void qc(int n) {
        this.eAq = n;
    }

    public final boolean isActive() {
        return this.Active;
    }

    public final void setActive(boolean bl) {
        this.Active = bl;
    }

    public final long Bp() {
        return this.aYh;
    }

    public final void v(long l) {
        this.aYh = l;
    }

    public final int Bm() {
        return this.aYf;
    }

    public final void fl(int n) {
        this.aYf = n;
    }

    public String getName() {
        return lea.epN().qf(this.aYf);
    }

    public String toString() {
        Calendar calendar = Calendar.getInstance();
        return "Name  : " + (Object)((Object)cib.getValueByOrdinal(this.aYf)) + " Tier : " + this.eAq + " ExpirationTime : " + ldz.e((this.aYh - calendar.getTimeInMillis()) / 1000L, true) + " Active         : " + this.Active;
    }
}

