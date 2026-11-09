/*
 * Decompiled with CFR.
 */
public class dwa
extends dvy {
    private lmn hih = null;

    public lmn bCy() {
        return this.hih;
    }

    public dwa(String string) {
        this.jE(string);
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        this.b(this.bCq(), 0, "Darkfall_Read");
        return true;
    }

    @Override
    protected void e(lmn lmn2, int n) {
        this.hih = lmn2;
        this.bCu();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to execute an SQL statement that returns a generic result set... SQL = " + this.bCq();
    }
}

