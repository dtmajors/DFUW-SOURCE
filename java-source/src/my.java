/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.Map;

public class my
extends btk
implements bto,
md {
    private Map<ldv, qe> aCy = lcn.emw();
    private Map<ldv, qe> aCz = lcn.emw();
    private LinkedList<lfs<qe, String>> aCA = lcn.emA();
    private LinkedList<ldv> aCB = lcn.emA();

    @Override
    public void doTick(ldz ldz2) {
        while (!this.aCA.isEmpty()) {
            lfs<qe, String> lfs2 = this.aCA.pollFirst();
            ((qe)lfs2.reX).ca((String)lfs2.reY);
        }
        for (int i = this.aCB.size(); i > 0; --i) {
            ldv ldv2 = this.aCB.pollFirst();
            if (this.MessageDelegator.d(ldv2) == null) {
                this.MessageDelegator.oa(ldv2);
                continue;
            }
            this.aCB.add(ldv2);
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
        this.aCA.add(new lfs<qe, String>(qe2, string));
    }

    @Override
    public void bT(ldv ldv2) {
        this.aCB.add(ldv2);
    }

    @Override
    public void c(qe qe2) {
        this.aCz.remove(qe2.getGUID());
    }

    @Override
    public void d(qe qe2) {
        this.aCz.put(qe2.getGUID(), qe2);
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

    protected final void fatalError(String string) {
        lfn.b(5, "SFPersistenceManager(" + this.getClass().getSimpleName() + ")", "fatalError: FATAL ERROR " + string);
        assert (false);
        loi.exd().aF(string);
    }

    public final int su() {
        return this.aCz.size();
    }
}

