/*
 * Decompiled with CFR.
 */
import java.util.EnumSet;
import java.util.Set;

public class hig
extends hie {
    private final a[] kvf;
    private boolean Initialized;
    private final EnumSet<jpb> kvg = EnumSet.noneOf(jpb.class);

    public hig(hnc hnc2, String string, lgg lgg2, lhf lhf2, hie.a a2, lip lip2, Object object) {
        super(hnc2, string, lgg2, lhf2, a2, lip2, object);
        jpj jpj2 = this.cbP().jWW;
        jpi jpi2 = jpj2.dPp();
        jpf jpf2 = jpi2.ta("TAB");
        this.kvf = new a[]{new a(jpf2, EnumSet.of(jpb.nLe)), new a(jpf2, EnumSet.of(jpb.nLf)), new a(jpf2, EnumSet.of(jpb.nLi, jpb.nLe)), new a(jpf2, EnumSet.of(jpb.nLi, jpb.nLf)), new a(jpf2, EnumSet.of(jpb.nLj, jpb.nLe)), new a(jpf2, EnumSet.of(jpb.nLj, jpb.nLf))};
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected jox<jph> a(jpm jpm2) {
        if (!jpm2.nLs) {
            return null;
        }
        jpj jpj2 = this.cbP().jWW;
        jpb jpb2 = jpj2.b(jpm2.nLu);
        if (jpb2 != null) {
            if (jpm2.nLs) {
                this.kvg.add(jpb2);
            } else {
                this.kvg.remove((Object)jpb2);
            }
            return null;
        }
        for (int i = 0; i < this.kvf.length; ++i) {
            if (jpm2.nLu != this.kvf[i].kvh || !this.k(this.kvf[i].kvi)) continue;
            return null;
        }
        return new jox<jph>(jpj2, jpm2.nLu, this.kvg);
    }

    private boolean k(Set<jpb> set) {
        boolean bl = this.l(set);
        assert (bl == this.kvg.containsAll(set));
        return bl;
    }

    private boolean l(Set<jpb> set) {
        for (jpb jpb2 : set) {
            if (this.kvg.contains((Object)jpb2)) continue;
            return false;
        }
        return true;
    }
}

