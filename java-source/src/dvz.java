/*
 * Decompiled with CFR.
 */
public class dvz
extends dvy {
    public dvz(String string) {
        this.jE(string);
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        this.b(this.bCq(), -1, "Darkfall");
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to execute a generic SQL statement that returns no results!";
    }
}

