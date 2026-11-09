/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class hxj {
    private final float doT;
    private final hxh lfj;
    private List<hxs> lkq = lcn.emv();
    private boolean Initialized;
    private boolean aME;
    private boolean aMu;

    protected hxj(hxh hxh2, float f2) {
        this.lfj = hxh2;
        this.doT = f2;
    }

    protected void a(hxs hxs2) {
        if (this.aME) {
            assert (false);
            return;
        }
        if (hxs2.isStarted()) {
            assert (false);
            return;
        }
        hxs2.a(this.lfj);
        hxs2.setDuration(this.doT);
        this.lkq.add(hxs2);
    }

    public final void g(ldz ldz2) {
        if (!this.Initialized) {
            this.initialize();
        }
        if (!this.aME) {
            this.aME = true;
        }
        this.aMu = true;
        for (hxs hxs2 : this.lkq) {
            hxs2.g(ldz2);
            if (hxs2.isCompleted()) continue;
            this.aMu = false;
        }
    }

    public final hxh cDt() {
        return this.lfj;
    }

    public final float cDu() {
        if (this.lkq.isEmpty()) {
            return this.doT;
        }
        return this.lkq.get(0).cDu();
    }

    public final float cDv() {
        if (this.lkq.isEmpty()) {
            return 0.0f;
        }
        return this.lkq.get(0).cDv();
    }

    public final boolean isCompleted() {
        return this.aMu;
    }

    public final void pb(boolean bl) {
        if (!this.aME) {
            return;
        }
        for (hxs hxs2 : this.lkq) {
            hxs2.pb(bl);
        }
        if (!this.aMu) {
            this.aMu = true;
            this.aME = true;
            this.aoU();
        }
    }

    public final void complete() {
        for (hxs hxs2 : this.lkq) {
            hxs2.complete();
        }
        if (!this.aMu) {
            this.aMu = true;
            this.aME = true;
            this.aoU();
        }
    }

    public final int cDw() {
        return this.lkq.size();
    }

    public final hxs OM(int n) {
        return this.lkq.get(n);
    }

    private final void initialize() {
        assert (!this.Initialized);
        this.Initialized = true;
        this.cDx();
    }

    protected abstract void cDx();

    protected abstract void aoU();
}

