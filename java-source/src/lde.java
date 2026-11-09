/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.HashMap;
import java.util.Map;

public class lde<B> {
    protected static final lfr Out = lfr.rkC;
    protected final Map<Class<? extends B>, lbi<? extends B>> rew = new HashMap<Class<? extends B>, lbi<? extends B>>();
    public final lbk<B> rex = new lbk<B>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lde rey;
        {
            this.rey = lde2;
        }

        public <A extends B> void a(boolean bl, Class<A> clazz, lbi<A> lbi2) {
            this.c(bl, clazz, lbi2);
        }

        public <I extends B, A extends I> void b(boolean bl, Class<A> clazz, lbi<I> lbi2) {
            this.c(bl, clazz, lbi2);
        }

        public int emf() {
            return this.rey.rew.size();
        }

        private void c(boolean bl, Class<? extends B> clazz, lbi<? extends B> lbi2) {
            if (!$assertionsDisabled && !(!bl ? this.rey.rew.get(clazz) == lbi2 : !lde.a(this.rey, clazz))) {
                throw new AssertionError();
            }
            if (bl) {
                this.rey.rew.put(clazz, lbi2);
            } else {
                this.rey.rew.remove(clazz);
            }
        }

        static {
            $assertionsDisabled = !lde.class.desiredAssertionStatus();
        }
    };

    public final <A extends B> boolean Y(A a2) {
        assert (a2 != null);
        lbi<A> lbi2 = this.h(a2.getClass());
        if (lbi2 == null) {
            return false;
        }
        if (lcw.qFE) {
            try {
                lbi2.m(a2);
            }
            catch (Error error) {}
        } else {
            lbi2.m(a2);
        }
        return true;
    }

    private boolean g(Class<?> clazz) {
        for (Class<?> clazz2 = clazz; clazz2 != null; clazz2 = clazz2.getSuperclass()) {
            if (!this.rew.containsKey(clazz2)) continue;
            return true;
        }
        return false;
    }

    private <A extends B> lbi<A> h(Class<?> clazz) {
        return this.rew.get(clazz);
    }

    static /* synthetic */ boolean a(lde lde2, Class clazz) {
        return lde2.g(clazz);
    }
}

