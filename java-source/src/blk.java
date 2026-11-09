/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class blk
extends bke {
    public blk() {
        this.dsy = bkd.a.drN;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        cdb cdb2 = (cdb)this.d(fdo2.akX);
        if (cdb2 == null) {
            lfn.b(5, "SFPerformMarkingEffectFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            return;
        }
        cdb2.Q(fdo2.aYF, fdo2.bsG);
        this.Vc();
    }
}

