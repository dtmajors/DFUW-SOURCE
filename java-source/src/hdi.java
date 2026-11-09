/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class hdi
extends ldm<hby> {
    private static final lfr Out = lfr.rkC;

    public final void b(hby.a a2, hei hei2) {
        for (hby hby2 : this.enr()) {
            if (lcw.qFE) {
                try {
                    hby2.a(a2, hei2);
                }
                catch (Throwable throwable) {
                    Out.c(throwable);
                }
                continue;
            }
            hby2.a(a2, hei2);
        }
    }
}

