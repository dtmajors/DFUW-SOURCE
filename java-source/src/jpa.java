/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class jpa {
    protected static final joi nHy = joi.nHV;
    private final joz nKo;
    private final Set<jov> nLb = new HashSet<jov>();
    public final lbi<jpk> kuT = new lbi<jpk>(this){
        final /* synthetic */ jpa nLd;
        {
            this.nLd = jpa2;
        }

        public void a(jpk jpk2) {
            if (jpk2 instanceof jpm) {
                this.nLd.b((jpm)jpk2);
            } else if (jpk2 instanceof jpl) {
                jpa.a(this.nLd, (jpl)jpk2, Collections.unmodifiableSet(jpa.a(this.nLd)));
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((jpk)object);
        }
    };
    public final lbt<jpc> nLc = new lbt<jpc>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jpa nLd;
        {
            this.nLd = jpa2;
        }

        public final void a(boolean bl, lbi<jpc> lbi2) {
            if (!$assertionsDisabled && !bl) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && lbi2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jpa.b(this.nLd) != null) {
                throw new AssertionError();
            }
            jpa.a(this.nLd, lbi2);
        }

        static {
            $assertionsDisabled = !jpa.class.desiredAssertionStatus();
        }
    };
    private final jpj jWW;
    private lbi<jpc> nKW;
    private final EnumSet<jpb> kvg = EnumSet.noneOf(jpb.class);

    public jpa(jpj jpj2, joz joz2) {
        assert (joz2 != null);
        this.jWW = jpj2;
        this.nKo = joz2;
    }

    public final void reset() {
        for (jov jov2 : this.nLb) {
            if (this.nKW == null) continue;
            jpe jpe2 = new jpe(jov2, false);
            this.nKW.m(jpe2);
        }
        this.nLb.clear();
        this.kvg.clear();
    }

    public final boolean b(jpm jpm2) {
        jpj jpj2 = jpm2.nLu.dPm().dPo();
        jpb jpb2 = jpj2.b(jpm2.nLu);
        if (jpm2.nLs && jpb2 != null) {
            this.kvg.add(jpb2);
        }
        boolean bl = this.a(jpm2, this.kvg);
        if (!jpm2.nLs && jpb2 != null) {
            this.kvg.remove((Object)jpb2);
        }
        return bl;
    }

    private boolean a(jpm jpm2, Set<jpb> set) {
        jov jov2 = (jov)this.a(jpm2.nLu, set);
        if (jov2 == null) {
            return false;
        }
        if (!jpm2.nLs) {
            if (!this.nLb.remove(jov2)) {
                if (set.isEmpty()) {
                    return false;
                }
                return this.a(jpm2, EnumSet.noneOf(jpb.class));
            }
        } else if (!this.nLb.add(jov2) && this.nKW != null) {
            this.nKW.m(new jpe(jov2, false));
        }
        if (this.nKW == null) {
            return false;
        }
        jpe jpe2 = new jpe(jov2, jpm2.nLs);
        this.nKW.m(jpe2);
        return true;
    }

    private void a(jpl jpl2, Set<jpb> set) {
        jos jos2 = this.a(jpl2.nLt, set);
        if (jos2 == null) {
            return;
        }
        if (!(jos2 instanceof jou)) {
            return;
        }
        jou jou2 = (jou)this.a(jpl2.nLt, set);
        if (jou2 == null) {
            return;
        }
        if (this.nKW == null) {
            return;
        }
        jpd jpd2 = new jpd(jou2, jpl2.nLq);
        this.nKW.m(jpd2);
    }

    private jos a(jpf jpf2, Set<jpb> set) {
        EnumSet<jpb> enumSet;
        EnumSet<jpb> enumSet2 = enumSet = set.isEmpty() ? EnumSet.noneOf(jpb.class) : EnumSet.copyOf(set);
        jox<jpf> jox2;
        jos jos2;
        block0: while ((jos2 = this.nKo.b(jox2 = new jox<jpf>(this.jWW, jpf2, enumSet))) == null) {
            jpb jpb2;
            if (enumSet.isEmpty()) {
                return null;
            }
            Iterator<jpb> iterator = jpb.ListOfValue.iterator();
            do {
                if (!iterator.hasNext()) continue block0;
            } while (!enumSet.contains((Object)(jpb2 = iterator.next())));
            enumSet.remove((Object)jpb2);
        }
        return jos2;
    }

    static /* synthetic */ EnumSet a(jpa jpa2) {
        return jpa2.kvg;
    }

    static /* synthetic */ void a(jpa jpa2, jpl jpl2, Set set) {
        jpa2.a(jpl2, (Set<jpb>)set);
    }

    static /* synthetic */ lbi b(jpa jpa2) {
        return jpa2.nKW;
    }

    static /* synthetic */ lbi a(jpa jpa2, lbi lbi2) {
        jpa2.nKW = lbi2;
        return jpa2.nKW;
    }
}

