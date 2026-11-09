/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.HashMap;
import java.util.Map;

public class hgp
extends hgm {
    private final Map<hej, hhr> koS = new HashMap<hej, hhr>();
    private boolean Initialized;

    public hgp(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpw.a a2, hee hee2) {
        super(hdm2, string, lgg2, lhf2, a2, hee2, null);
        for (hej hej2 : hdm2.jYI) {
            hhr hhr2 = new hhr((hnc)hdm2, null, hej2);
            this.j(hhr2);
            assert (!this.koS.containsKey(hej2));
            this.koS.put(hej2, hhr2);
        }
    }

    public final void a(hdz hdz2) {
        if (!hdz2.ceB().awU()) {
            return;
        }
        assert (hdz2.auO() != null);
        hej hej2 = this.c(hdz2, lgg.rlI);
        if (hej2 == null) {
            return;
        }
        hhr hhr2 = this.koS.get(hej2);
        if (hhr2 == null) {
            return;
        }
        hng hng2 = new hng(this.kLu.kAz);
        hng2.a(hhr2, 1, 1.0, 1.0f, 1.5f);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lgg g(hdz hdz2) {
        hej hej2 = this.o(hdz2);
        if (hej2 == null) {
            return new lgg(0, 0);
        }
        return hej2.d(hdz2);
    }

    @Override
    protected boolean a(hgy hgy2, boolean bl, boolean bl2, int n) {
        assert (n == -1);
        hdz hdz2 = hgy2.cjV();
        if (!hdz2.ceB().awU()) {
            return false;
        }
        assert (hdz2.auO() != null);
        hej hej2 = this.c(hdz2, this.cqu());
        if (hej2 == null) {
            return false;
        }
        if (!super.a(hgy2, bl, bl2, hej2.aCJ)) {
            return false;
        }
        if (!bl && hgy2.isInitialized()) {
            lgg lgg2 = hej2.d(hdz2);
            hgy2.a(lgg2, (float)this.kLu.crO());
        }
        return true;
    }

    @Override
    protected void a(hdz hdz2, int n, int n2, lgg lgg2, int n3) {
        hej hej2 = this.c(hdz2, this.cqu());
        if (hej2 == null) {
            return;
        }
        hdz hdz3 = this.a(hej2);
        if (hdz3 == null) {
            this.cbP().a(hdz2, n, this, n2, lgg2, n3);
        } else {
            this.cbP().a(hdz2, n, hdz3, n2);
        }
    }

    @Override
    protected void nv(boolean bl) {
        super.nv(bl);
        for (hej hej2 : this.cbO().jYI) {
            hdz hdz2 = this.a(hej2);
            hhr hhr2 = this.koS.get(hej2);
            hhr2.nF(hdz2 != null);
            if (hdz2 == null) continue;
            hgy hgy2 = this.i(hdz2);
            lgg lgg2 = hej2.d(hdz2);
            hgy2.a(lgg2, bl ? (float)this.kLu.crO() : 0.0f);
        }
    }

    @Override
    protected boolean l(lfu lfu2) {
        assert (lda.by(lfu2));
        return false;
    }

    @Override
    protected boolean b(hdz hdz2, lgg lgg2) {
        return false;
    }

    private hej d(cak.c c2, int n) {
        assert (n >= 0);
        for (hej hej2 : this.cbO().jYI) {
            if (c2 != hej2.bpW || n != hej2.aCJ) continue;
            return hej2;
        }
        return null;
    }

    private hej o(hdz hdz2) {
        assert (hdz2.ceB().awU());
        if (!hdz2.Uu()) {
            return null;
        }
        cak.c c2 = hdz2.ceB().auO();
        int n = hdz2.AR();
        assert (n >= 0);
        return this.d(c2, n);
    }

    private hdz a(hej hej2) {
        for (hdz hdz2 : lin.a(this.kdT.cfh(), hdz.class)) {
            if (!hdz2.Uu() || hdz2.auO() != hej2.bpW || hdz2.AR() != hej2.aCJ) continue;
            return hdz2;
        }
        return null;
    }

    private hej c(hdz hdz2, lgg lgg2) {
        cak.c c2 = hdz2.auO();
        hej hej2 = this.a(c2, lgg2, true);
        if (hej2 != null) {
            return hej2;
        }
        return this.a(c2, lgg2, false);
    }

    private hej a(cak.c c2, lgg lgg2, boolean bl) {
        hej hej2 = null;
        int n = 0;
        for (hej hej3 : this.cbO().jYI) {
            if (c2 != hej3.bpW || bl && this.a(hej3) != null) continue;
            lgg lgg3 = hej3.cfx();
            int n2 = lgg2.U(lgg3);
            if (hej2 != null && n2 >= n) continue;
            hej2 = hej3;
            n = n2;
        }
        return hej2;
    }

    private void mU(boolean bl) {
        lda.yk(bl);
    }
}

