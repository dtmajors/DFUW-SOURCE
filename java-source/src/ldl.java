/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Collection;

public class ldl
extends ldm<lbn>
implements lbn {
    private static final lfr Out = lfr.rkC;

    @Override
    public void W() {
        this.enp();
    }

    public final void enp() {
        this.ym(false);
    }

    public final void ym(boolean bl) {
        Collection collection = this.enr();
        if (bl) {
            this.clear();
        }
        for (lbn lbn2 : collection) {
            if (lcw.qFE) {
                try {
                    lbn2.W();
                }
                catch (Throwable throwable) {
                    Out.c(throwable);
                }
                continue;
            }
            lbn2.W();
        }
    }
}

