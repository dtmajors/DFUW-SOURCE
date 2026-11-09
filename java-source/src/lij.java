/*
 * Decompiled with CFR.
 */
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class lij<NODE> {
    private final Map<NODE, a<NODE>> rou = new HashMap<NODE, a<NODE>>();
    private final lih<a<NODE>> rov = new lih();

    public final void clear() {
        this.rov.clear();
        this.rou.clear();
    }

    public final void a(NODE NODE, lij<NODE> lij2, NODE NODE2) {
        assert (NODE == null || this.contains(NODE)) : NODE;
        assert (NODE2 == null || lij2.contains(NODE2)) : NODE2;
        NODE NODE3 = lij2.ab(NODE2);
        while (NODE3 != null) {
            this.d(NODE3, NODE, null);
            this.a(NODE3, lij2, NODE3);
            NODE3 = lij2.ac(NODE3);
        }
    }

    public final int ess() {
        return this.rou.size();
    }

    public final NODE est() {
        a<NODE> a2 = this.rov.esr();
        if (a2 == null) {
            return null;
        }
        return a2.rox;
    }

    public final NODE ab(NODE NODE) {
        a a2;
        assert (NODE == null || this.contains(NODE)) : NODE;
        if (NODE == null) {
            a2 = this.rov.esr();
            assert (a2 == null || a2.ror == null);
        } else {
            a<NODE> a3 = this.al(NODE);
            a2 = (a)a3.ros;
            assert (a2 == null || a2.ror == a3);
        }
        if (a2 == null) {
            return null;
        }
        return a2.rox;
    }

    public final NODE ac(NODE NODE) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        a<NODE> a2 = this.al(NODE);
        a a3 = (a)a2.rot;
        if (a3 == null) {
            return null;
        }
        assert (a3.ror == a2.ror);
        return a3.rox;
    }

    public final NODE d(NODE NODE, int n) {
        a a2;
        assert (NODE == null || this.contains(NODE)) : NODE;
        if (NODE == null) {
            a2 = this.rov.esr();
            assert (a2 == null || a2.ror == null);
        } else {
            a<NODE> a3 = this.al(NODE);
            a2 = (a)a3.ros;
            assert (a2 == null || a2.ror == a3);
        }
        if (a2 == null) {
            return null;
        }
        for (int i = 0; i < n; ++i) {
            a2 = (a)a2.rot;
            if (a2 != null) continue;
            return null;
        }
        return a2.rox;
    }

    public final NODE getParent(NODE NODE) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        a<NODE> a2 = this.al(NODE);
        a a3 = (a)a2.ror;
        if (a3 == null) {
            return null;
        }
        return a3.rox;
    }

    public final boolean contains(NODE NODE) {
        assert (NODE != null);
        return this.ak(NODE) != null;
    }

    public final boolean b(NODE NODE, NODE NODE2, boolean bl) {
        assert (NODE != null);
        a<NODE> a2 = this.ak(NODE);
        if (a2 == null) {
            return false;
        }
        if (NODE2 == null) {
            return true;
        }
        a a3 = (a)a2.ror;
        if (a3 == null) {
            return false;
        }
        if (a3.rox.equals(NODE2)) {
            return true;
        }
        if (!bl) {
            return false;
        }
        a3 = (a)a3.ror;
        while (a3 != null) {
            if (a3.rox.equals(NODE2)) {
                return true;
            }
            a3 = (a)a3.ror;
        }
        return false;
    }

    public final boolean ad(NODE NODE) {
        assert (NODE == null || this.contains(NODE));
        return this.ab(NODE) == null;
    }

    public final int l(NODE NODE, NODE NODE2) {
        assert (NODE == null || this.contains(NODE));
        assert (NODE2 == null || this.contains(NODE2) && this.b(NODE, NODE2, true));
        if (NODE == null) {
            return 0;
        }
        a a2 = this.ak(NODE);
        a<NODE> a3 = NODE2 == null ? null : this.ak(NODE2);
        int n = 0;
        while (a2 != null && a2 != a3) {
            a2 = (a)a2.ror;
            ++n;
        }
        return n;
    }

    public final int ae(NODE NODE) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        a<NODE> a2 = this.ak(NODE);
        return this.rov.a(a2);
    }

    public final void d(NODE NODE, NODE NODE2, NODE NODE3) {
        assert (NODE != null);
        assert (!this.contains(NODE)) : NODE;
        assert (NODE2 == null || this.contains(NODE2)) : NODE2;
        assert (NODE3 == null || this.getParent(NODE3).equals(NODE2)) : NODE3;
        a<NODE> a2 = NODE2 == null ? null : this.al(NODE2);
        a<NODE> a3 = NODE3 == null ? null : this.al(NODE3);
        a a4 = new a(null);
        a4.rox = NODE;
        this.rov.a(a4, a2, a3);
        this.rou.put(NODE, a4);
    }

    public final void af(NODE NODE) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        assert (this.ab(NODE) == null);
        a<NODE> a2 = this.al(NODE);
        this.rov.b(a2);
        this.rou.remove(NODE);
    }

    public final void ag(NODE NODE) {
        NODE NODE2;
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        while ((NODE2 = this.ab(NODE)) != null) {
            this.ag(NODE2);
        }
        this.af(NODE);
    }

    public final void e(NODE NODE, NODE NODE2, NODE NODE3) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        assert (NODE2 == null || this.contains(NODE2)) : NODE2;
        assert (NODE3 == null || this.getParent(NODE3).equals(NODE2)) : NODE3;
        a<NODE> a2 = this.al(NODE);
        this.rov.b(a2);
        a<NODE> a3 = NODE2 == null ? null : this.al(NODE2);
        a<NODE> a4 = null;
        if (NODE3 != null) {
            a4 = this.al(NODE3);
        }
        this.rov.a(a2, a3, a4);
    }

    public final lij<NODE> ah(NODE NODE) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        a<NODE> a2 = this.al(NODE);
        a a3 = new a(null);
        a3.rox = NODE;
        lij<NODE> lij2 = new lij<NODE>();
        lij2.rov.a(a3, null, null);
        this.a(a2, lij2, a3);
        assert (lij2.ae(NODE) == this.ae(NODE));
        return lij2;
    }

    public final lij<NODE> ai(NODE NODE) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        a<NODE> a2 = this.al(NODE);
        this.rov.b(a2);
        this.a(a2);
        lij<NODE> lij2 = new lij<NODE>();
        lij2.rov.a(a2, null, null);
        lij2.b(a2);
        return lij2;
    }

    public final void a(lij<NODE> lij2, NODE NODE, NODE NODE2) {
        assert (lij2 != this);
        assert (NODE == null || this.contains(NODE)) : NODE;
        assert (NODE2 == null || this.getParent(NODE2).equals(NODE)) : NODE2;
        a<NODE> a2 = lij2.rov.esr();
        a<NODE> a3 = NODE == null ? null : this.al(NODE);
        a<NODE> a4 = null;
        if (NODE2 != null) {
            a4 = this.al(NODE2);
        }
        this.rov.a(a2, a3, a4);
        this.b(a2);
    }

    public final void m(NODE NODE, NODE NODE2) {
        assert (NODE != null);
        assert (this.contains(NODE)) : NODE;
        assert (NODE2 != null);
        assert (!this.contains(NODE2)) : NODE2;
        a<NODE> a2 = this.al(NODE);
        a2.rox = NODE2;
        this.rou.remove(NODE);
        this.rou.put(NODE2, a2);
    }

    public final void a(PrintStream printStream, String string, NODE NODE) {
        assert (false);
        NODE NODE2 = this.ab(NODE);
        while (NODE2 != null) {
            printStream.println(string + NODE2.toString());
            this.a(printStream, string + "    ", NODE2);
            NODE2 = this.ac(NODE2);
        }
    }

    public final void dump(String string) {
        assert (false);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            PrintStream printStream = new PrintStream(fileOutputStream);
            this.a(printStream, "", null);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            assert (false) : exception;
            return;
        }
    }

    public final void a(NODE NODE, Comparator<NODE> comparator, boolean bl) {
        a<NODE> a2 = NODE == null ? null : this.al(NODE);
        this.rov.a(a2, new b<NODE>(comparator), bl);
    }

    public final int getChildCount(NODE NODE) {
        a<NODE> a2 = NODE == null ? null : this.al(NODE);
        return this.rov.d(a2);
    }

    public final ArrayList<NODE> aj(NODE NODE) {
        a<NODE> a2 = NODE == null ? null : this.al(NODE);
        ArrayList<a<NODE>> arrayList = this.rov.c(a2);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList2.add(arrayList.get((int)i).rox);
        }
        return arrayList2;
    }

    public final NODE[] c(NODE NODE, Class<NODE> clazz) {
        ArrayList<NODE> arrayList = this.aj(NODE);
        NODE[] NODEArray = this.a(clazz, arrayList.size());
        arrayList.toArray(NODEArray);
        return NODEArray;
    }

    private NODE[] a(Class<NODE> clazz, int n) {
        return (Object[])Array.newInstance(clazz, n);
    }

    private a<NODE> ak(NODE NODE) {
        assert (NODE != null);
        a<NODE> a2 = this.rou.get(NODE);
        assert (a2 == null || a2.rox.equals(NODE)) : NODE;
        return a2;
    }

    private a<NODE> al(NODE NODE) {
        if (NODE == null) {
            return this.rov.esr();
        }
        a<NODE> a2 = this.ak(NODE);
        assert (a2 != null) : NODE;
        return a2;
    }

    public final void a(a<NODE> a2) {
        assert (a2 != null);
        assert (this.contains(a2.rox));
        a a3 = (a)a2.ros;
        while (a3 != null) {
            this.a(a3);
            a3 = (a)a3.rot;
        }
        this.rou.remove(a2.rox);
    }

    private void a(a<NODE> a2, lij<NODE> lij2, a<NODE> a3) {
        lij2.rou.put(a3.rox, a3);
        a a4 = null;
        a a5 = (a)a2.ros;
        while (a5 != null) {
            a a6 = new a(null);
            a6.ror = a3;
            a6.rox = a5.rox;
            if (a4 == null) {
                assert (a3.ros == null);
                a3.ros = a6;
            } else {
                assert (a3.ros != null);
                a4.rot = a6;
            }
            this.a(a5, lij2, a6);
            a4 = a6;
            a5 = (a)a5.rot;
        }
    }

    public final void b(a<NODE> a2) {
        assert (a2 != null);
        assert (!this.contains(a2.rox));
        this.rou.put(a2.rox, a2);
        a a3 = (a)a2.ros;
        while (a3 != null) {
            this.b(a3);
            a3 = (a)a3.rot;
        }
    }
}

