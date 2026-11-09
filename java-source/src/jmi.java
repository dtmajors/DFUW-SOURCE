/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class jmi {
    private final Map<String, Object> nvR = lcn.emw();
    private final Map<String, Object> nvS = lcn.emw();
    private boolean nvT = false;

    boolean dMA() {
        return this.nvT;
    }

    public final boolean sF(String string) {
        return this.nvR.containsKey(string);
    }

    public final boolean sG(String string) {
        return !this.sF(string);
    }

    public final boolean sH(String string) {
        return this.nvS.containsKey(string);
    }

    public final boolean sI(String string) {
        Object object = this.nvS.get(string);
        if (object == null) {
            return false;
        }
        return object instanceof jmf;
    }

    public final jmf sJ(String string) {
        Object object = this.nvS.get(string);
        if (object == null) {
            assert (false);
            return null;
        }
        if (!(object instanceof jmf)) {
            assert (false);
            return null;
        }
        return (jmf)object;
    }

    public final Collection<jmf> dMB() {
        if (this.nvR.isEmpty()) {
            return null;
        }
        Set<jmf> set = lcn.emx();
        for (Object object : this.nvR.values()) {
            if (object instanceof jmf) {
                set.add((jmf)object);
                continue;
            }
            set.addAll((Set)object);
        }
        return set;
    }

    public final Collection<jmf> sK(String string) {
        Object object = this.nvS.get(string);
        if (object == null) {
            return null;
        }
        Set<jmf> set = lcn.emx();
        if (object instanceof jmf) {
            set.add((jmf)object);
        } else {
            set.addAll((Set)object);
        }
        return set;
    }

    final void b(jmb jmb2) {
        for (int j = 0; j < jmb2.dLT(); ++j) {
            jmf jmf2 = jmb2.Vk(j);
            this.b(jmf2.dMr(), jmf2, this.nvS);
            this.b(jmf2.dMs(), jmf2, this.nvS);
        }
    }

    final void f(jmf jmf2) {
        if (jmf2.dMo()) {
            if (jmf2.dMt()) {
                this.b(jmf2.dMr(), jmf2, this.nvR);
                this.b(jmf2.dMs(), jmf2, this.nvR);
            } else {
                this.a(jmf2.dMr(), jmf2, this.nvR);
                this.a(jmf2.dMs(), jmf2, this.nvR);
            }
        }
        this.dMC();
    }

    private void dMC() {
        boolean bl = false;
        boolean bl2 = false;
        for (String string : this.nvR.keySet()) {
            if (string.equals("KEYBOARD.LEFT_SHIFT")) {
                bl = true;
            }
            if (string.equals("KEYBOARD.RIGHT_SHIFT")) {
                bl = true;
            }
            if (!string.equals("KEYBOARD.TAB")) continue;
            bl2 = true;
        }
        this.nvT = false;
        if (bl && bl2) {
            this.nvT = true;
        }
    }

    private void a(String string, jmf jmf2, Map<String, Object> map) {
        Object object = map.get(string);
        if (object == null) {
            return;
        }
        if (object == jmf2) {
            map.remove(string);
            return;
        }
        if (object instanceof jmf) {
            assert (false) : "Trying to remove nonexistant InputObject";
            return;
        }
        Set set = (Set)object;
        set.remove(jmf2);
        if (set.isEmpty()) {
            map.remove(string);
        } else if (set.size() == 1) {
            map.remove(string);
            map.put(string, set.iterator().next());
        }
    }

    private void b(String string, jmf jmf2, Map<String, Object> map) {
        Object object = map.get(string);
        if (object == null) {
            map.put(string, jmf2);
        } else if (object instanceof jmf) {
            if (object == jmf2) {
                return;
            }
            Set<jmf> set = lcn.emx();
            set.add((jmf)object);
            set.add(jmf2);
            map.put(string, set);
        } else {
            Set set = (Set)object;
            if (!set.contains(jmf2)) {
                set.add(jmf2);
            }
        }
    }
}

