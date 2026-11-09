/*
 * Decompiled with CFR.
 */
import java.util.Map;

public abstract class qd
extends qe
implements md {
    private Map<ldv, qe> aCy = lcn.emw();
    private Map<ldv, qe> aCz = lcn.emw();

    protected qd(md md2, me me2) {
        super(md2, me2);
    }

    @Override
    public String toString() {
        return super.toString() + " Children=" + this.aCy.size() + " WorkingChildren=" + this.su();
    }

    @Override
    public void b(int n, String string, int n2, boolean bl) {
        String string2 = "                                                                                                                                ".substring(0, 2 * n2);
        lfn.b(n, string, string2 + this.toString());
        if (bl) {
            for (qe qe2 : this.aCy.values()) {
                qe2.b(n, string, n2 + 1, bl);
            }
        } else {
            for (qe qe3 : this.aCz.values()) {
                qe3.b(n, string, n2 + 1, bl);
            }
        }
    }

    @Override
    public void a(qe qe2) {
        this.aCy.put(qe2.getGUID(), qe2);
    }

    @Override
    public void b(qe qe2) {
        this.aCy.remove(qe2.getGUID());
    }

    @Override
    public void a(qe qe2, String string) {
        this.aMy.a(qe2, string);
    }

    @Override
    public void bT(ldv ldv2) {
        this.aMy.bT(ldv2);
    }

    @Override
    public void c(qe qe2) {
        this.aCz.remove(qe2.getGUID());
    }

    @Override
    public void d(qe qe2) {
        this.aCz.put(qe2.getGUID(), qe2);
    }

    @Override
    public void reset() {
        super.reset();
        for (qe qe2 : this.aCy.values()) {
            if (qe2.sR()) continue;
            qe2.reset();
        }
    }

    public final int su() {
        return this.aCz.size();
    }

    protected final void e(qe qe2) {
        if (qe2 != null && qe2.isInitialized()) {
            this.MessageDelegator.hd(qe2.getGUID());
            this.bT(qe2.getGUID());
        }
    }

    protected final <T extends qe> T f(T t) {
        if (!t.isInitialized()) {
            t.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(t);
        }
        return t;
    }
}

