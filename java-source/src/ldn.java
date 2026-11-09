/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class ldn
extends ldm<lbp> {
    private static final lfr Out = lfr.rkC;

    public final boolean ens() {
        for (lbp lbp2 : this.enr()) {
            if (lcw.qFE) {
                try {
                    if (!lbp2.caU()) continue;
                    return true;
                }
                catch (Throwable throwable) {
                    Out.c(throwable);
                    continue;
                }
            }
            if (!lbp2.caU()) continue;
            return true;
        }
        return false;
    }
}

