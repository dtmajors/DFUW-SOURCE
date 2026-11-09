/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iba
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class jnf
extends btk {
    private Map<Class, Set> gIB = lcn.emw();
    private boolean gIC = false;
    private Set<hsy> gID = lcn.emx();
    private Set<hsy> gIE = lcn.emx();
    private TreeMap<Long, jmz> nDm = lcn.emG();

    public void a(hsy hsy2) {
        if (hsy2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gID == null) {
                this.gID = lcn.emx();
            }
            this.gID.add(hsy2);
            if (this.gIE != null) {
                this.gIE.remove(hsy2);
            }
        } else {
            Class<?>[] classArray = hsy2.getClass().getInterfaces();
            for (int j = 0; j < classArray.length; ++j) {
                this.a(classArray[j], hsy2);
            }
        }
    }

    private void a(Class<?> clazz, hsy hsy2) {
        if (!hsy.class.isAssignableFrom(clazz)) {
            return;
        }
        Set<hsy> set = this.gIB.get(clazz);
        if (set == null) {
            set = lcn.emx();
            this.gIB.put(clazz, set);
        }
        if (!set.contains(hsy2)) {
            set.add(hsy2);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        for (int j = 0; j < classArray.length; ++j) {
            this.a(classArray[j], hsy2);
        }
    }

    <T> Set<T> c(Class<T> clazz) {
        return this.gIB.containsKey(clazz) ? this.gIB.get(clazz) : new HashSet();
    }

    public void b(hsy hsy2) {
        if (hsy2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gIE == null) {
                this.gIE = lcn.emx();
            }
            this.gIE.add(hsy2);
            if (this.gID != null) {
                this.gID.remove(hsy2);
            }
        } else {
            for (Set set : this.gIB.values()) {
                set.remove(hsy2);
            }
        }
    }

    void ir(boolean bl) {
        if (bl == this.gIC) {
            return;
        }
        this.gIC = bl;
        if (!this.gIC) {
            if (this.gID != null) {
                for (hsy hsy2 : this.gID) {
                    this.a(hsy2);
                }
            }
            if (this.gIE != null) {
                for (hsy hsy2 : this.gIE) {
                    this.b(hsy2);
                }
            }
        }
    }

    public int dNd() {
        return this.nDm.size();
    }

    public boolean dNe() {
        return this.nDm.isEmpty();
    }

    public Collection<jmz> dNf() {
        return this.nDm.values();
    }

    private long dNg() {
        long l = System.currentTimeMillis();
        while (this.nDm.containsKey(l)) {
            ++l;
        }
        return l;
    }

    private void e(jmz jmz2) {
        if (jmz2 == null) {
            return;
        }
        this.nDm.put(jmz2.dMS(), jmz2);
        if (iba.lDE) {
            return;
        }
        Set<hsx> set = this.c(hsx.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (hsx hsx2 : set) {
                hsx2.a(jmz2);
            }
            this.ir(false);
        }
    }

    private void clearCache() {
        if (!this.dNe()) {
            return;
        }
        this.nDm.clear();
        Set<hsy> set = this.c(hsy.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (hsy hsy2 : set) {
                hsy2.VK();
            }
            this.ir(false);
        }
    }

    public void a(loz loz2, jns jns2) {
        this.e(jmz.a(this.MessageDelegator.arc().rgz, this.dNg(), loz2, jns2));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2315: {
                this.b((egz)dxq2);
                break;
            }
            case 2310: {
                this.b((egu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(egz egz2) {
        this.e(jmz.a(this.MessageDelegator.arc().rgz, this.dNg(), egz2));
    }

    private void b(egu egu2) {
        this.clearCache();
    }

    public void bZ(boolean bl) {
        Set<hsx> set = this.c(hsx.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (hsx hsx2 : set) {
                hsx2.bY(bl);
            }
            this.ir(false);
        }
    }
}

