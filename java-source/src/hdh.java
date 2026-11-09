/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class hdh
extends ldm<hbx> {
    private static final lfr Out = lfr.rkC;

    public final void b(hbx.a a2, hdu hdu2) {
        for (hbx hbx2 : this.enr()) {
            if (lcw.qFE) {
                try {
                    hbx2.a(a2, hdu2);
                }
                catch (Throwable throwable) {
                    Out.c(throwable);
                }
                continue;
            }
            hbx2.a(a2, hdu2);
        }
    }
}

