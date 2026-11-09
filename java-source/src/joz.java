/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class joz
extends lmv {
    private final Map<jox<? extends jpf>, jos> nKY = new HashMap<jox<? extends jpf>, jos>();
    private final Map<jos, jox<? extends jpf>> nKZ = new HashMap<jos, jox<? extends jpf>>();

    public joz(a a2) {
        super(a2);
        this.dPj();
    }

    public joz(joz joz2) {
        this(joz2.dPg());
        this.b(joz2);
    }

    public final a dPg() {
        return (a)this.evb();
    }

    public final jos b(jox<? extends jpf> jox2) {
        assert (jox2 != null);
        return this.nKY.get(jox2);
    }

    public final jox<? extends jpf> e(jos jos2) {
        assert (jos2 != null);
        assert (this.nKZ.containsKey(jos2)) : jos2;
        return this.nKZ.get(jos2);
    }

    public final void a(jos jos2, jox<? extends jpf> jox2) {
        if (this.b(jos2, jox2)) {
            this.cdX();
        }
    }

    public final void f(jos jos2) {
        assert (!this.nKZ.containsKey(jos2));
        this.nKZ.put(jos2, null);
        this.cdX();
    }

    public final void g(jos jos2) {
        assert (this.nKZ.containsKey(jos2));
        this.nKZ.remove(jos2);
        this.cdX();
    }

    public final boolean a(joz joz2) {
        if (!this.dPg().b(joz2.dPg())) {
            return false;
        }
        if (!((Object)this.nKZ.keySet()).equals(joz2.nKZ.keySet())) {
            return false;
        }
        for (jos jos2 : this.nKZ.keySet()) {
            if (lin.i(this.nKZ.get(jos2), joz2.nKZ.get(jos2))) continue;
            return false;
        }
        return true;
    }

    public final void b(joz joz2) {
        if (this.c(joz2)) {
            this.cdX();
        }
    }

    public final jos sZ(String string) {
        for (jos jos2 : this.nKZ.keySet()) {
            if (!jos2.Name.equals(string)) continue;
            return jos2;
        }
        return null;
    }

    @Override
    protected boolean e(lmv lmv2) {
        assert (lmv2 instanceof joz);
        return this.c((joz)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        assert (lmv2 instanceof joz);
        return this.a((joz)lmv2);
    }

    @Override
    protected boolean d(lfu lfu2) {
        boolean bl = false;
        boolean bl2 = false;
        if (lfu2.eqA()) {
            this.nKZ.clear();
            this.nKY.clear();
            this.dPj();
        }
        int n = this.nKZ.size();
        n = lfu2.ad("Count", n);
        if (lfu2.eqA()) {
            Object object;
            for (int j = 0; j < n; ++j) {
                jox<jpf> jox2;
                String string;
                object = lfu2.zC("binding" + j);
                String string2 = ((lfu)object).aA("Name", "");
                if (string2.length() == 0) continue;
                if (string2.equalsIgnoreCase("screenshot")) {
                    bl2 = true;
                    continue;
                }
                jos jos2 = this.sZ(string2);
                if (jos2 == null) {
                    jos2 = new jot(string2);
                }
                if ((string = ((lfu)object).aA("Binding", "")).length() == 0) {
                    jox2 = null;
                } else {
                    try {
                        jox2 = jox.a(string, this.dPg().iNU);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        jox2 = null;
                    }
                }
                bl |= this.b(jos2, jox2);
            }
            if (bl2) {
                try {
                    jos jos3 = this.sZ("a_Screenshot");
                    object = jox.a("LEFT_ALT+S", this.dPg().iNU);
                    bl |= this.b(jos3, (jox<? extends jpf>)object);
                }
                catch (IllegalArgumentException illegalArgumentException) {}
            }
        } else {
            assert (lfu2.eqB());
            int n2 = 0;
            for (jos jos4 : this.nKZ.keySet()) {
                lfu lfu3 = lfu2.zC("binding" + n2);
                jox<? extends jpf> jox3 = this.nKZ.get(jos4);
                lfu3.aA("Name", jos4.Name);
                lfu3.aA("Binding", jox3 == null ? "" : jox3.dPf());
                ++n2;
            }
        }
        return bl;
    }

    @Override
    protected String dPh() {
        return "";
    }

    private boolean b(jos jos2, jox<? extends jpf> jox2) {
        Object object;
        assert (jos2 != null);
        boolean bl = false;
        if (jox2 != null) {
            object = this.nKY.get(jox2);
            if (jos2 == object) {
                return false;
            }
            if (object != null) {
                assert (this.nKY.get(jox2) == object);
                this.nKY.remove(jox2);
                this.nKZ.put((jos)object, null);
                bl = true;
            }
        }
        if ((object = this.nKZ.get(jos2)) != null) {
            assert (this.nKY.get(object) == jos2);
            this.nKY.remove(object);
            this.nKZ.put(jos2, null);
            bl = true;
        }
        if (jox2 != null) {
            this.nKY.put(jox2, jos2);
            this.nKZ.put(jos2, jox2);
            bl = true;
        }
        return bl;
    }

    private boolean c(joz joz2) {
        assert (this.evb().b(joz2.evb()));
        if (this.a(joz2)) {
            return false;
        }
        this.nKY.clear();
        this.nKY.putAll(joz2.nKY);
        this.nKZ.clear();
        this.nKZ.putAll(joz2.nKZ);
        return true;
    }

    private void dPi() {
        assert (false);
        int n = 0;
        for (jos jos2 : this.dPg().nLa) {
            assert (this.nKZ.containsKey(jos2));
            jox<? extends jpf> jox2 = this.nKZ.get(jos2);
            if (jox2 == null) {
                assert (!this.nKY.containsKey(jox2));
                continue;
            }
            assert (this.nKY.get(jox2) == jos2);
            ++n;
        }
    }

    private void dPj() {
        assert (this.nKZ.size() == 0);
        assert (this.nKY.size() == 0);
        a a2 = this.dPg();
        for (jos object : a2.nLa) {
            assert (object != null);
            assert (!this.nKZ.containsKey(object));
            this.nKZ.put(object, null);
            assert (this.nKZ.containsKey(object));
        }
        jpj jpj2 = a2.iNU;
        for (jos jos2 : a2.nLa) {
            jox<jpf> jox2;
            if (jos2.nKR == null || jos2.nKR.length() == 0) continue;
            try {
                jox2 = jox.a(jos2.nKR, jpj2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                continue;
            }
            this.a(jos2, jox2);
        }
    }

    public Collection<jos> a(jow jow2) {
        if (jow2 == null) {
            return this.nKZ.keySet();
        }
        ArrayList<jos> arrayList = new ArrayList<jos>();
        for (jos jos2 : this.nKZ.keySet()) {
            if (jos2.jIg != jow2) continue;
            arrayList.add(jos2);
        }
        return Collections.unmodifiableCollection(arrayList);
    }
}

