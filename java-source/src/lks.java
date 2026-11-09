/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  lkv
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class lks
implements Cloneable {
    private Map<Integer, lkr> rrn = lcn.emw();
    private List<lkr> rro;
    private String Name;
    private String Filename;
    private lkr rrp = null;

    public lks() {
        if (lcw.qHe) {
            this.rro = lcn.emv();
        }
    }

    public void b(lkr lkr2) {
        if (!lcw.qHe) {
            this.rrn.put(new Integer(lkr2.etO()), lkr2);
        } else {
            this.rro.add(lkr2);
        }
    }

    public void adi(int n) {
        if (!lcw.qHe) {
            this.rrn.remove(new Integer(n));
        } else {
            lkr lkr2 = null;
            for (int i = 0; i < this.rro.size(); ++i) {
                lkr2 = this.rro.get(i);
                if (lkr2.etO() != n) continue;
                this.rro.remove(lkr2);
                break;
            }
        }
    }

    private lkr eud() {
        if (this.rrp != null) {
            return this.rrp;
        }
        this.rrp = new lkr();
        this.rrp.setLooping(true);
        this.rrp.setSetName("DISABLE_PARTIAL_STATE");
        this.rrp.adf(396);
        return this.rrp;
    }

    public ArrayList<String> adj(int n) {
        ArrayList<String> arrayList = lcn.emv();
        for (Map.Entry<Integer, lkr> entry : this.rrn.entrySet()) {
            lkr lkr2 = entry.getValue();
            int n2 = lkv.adn((int)lkr2.etO());
            if (n2 != n) continue;
            arrayList.add(lkr2.getSetName());
        }
        return arrayList;
    }

    public ArrayList<String> t(Set<Integer> set) {
        ArrayList<String> arrayList = lcn.emv();
        Iterator<Map.Entry<Integer, lkr>> iterator = this.rrn.entrySet().iterator();
        Integer n = new Integer(0);
        while (iterator.hasNext()) {
            Map.Entry<Integer, lkr> entry = iterator.next();
            lkr lkr2 = entry.getValue();
            n = lkr2.etO();
            if (!set.contains(n)) continue;
            arrayList.add(lkr2.getSetName());
        }
        return arrayList;
    }

    public lkr adk(int n) {
        if (n == 396) {
            return this.eud();
        }
        if (n > 65535) {
            n &= 0xFFFF;
        }
        lkr lkr2 = null;
        if (!lcw.qHe) {
            lkr2 = this.rrn.get(new Integer(n));
        } else {
            lkr lkr3 = null;
            for (int i = 0; i < this.rro.size(); ++i) {
                lkr3 = this.rro.get(i);
                if (lkr3.etO() != n) continue;
                lkr2 = lkr3;
                break;
            }
        }
        return lkr2;
    }

    public List<lkr> eue() {
        if (lcw.qHe) {
            return this.rro;
        }
        return new ArrayList<lkr>(this.rrn.values());
    }

    public String bsl() {
        return this.Filename;
    }

    public void cd(String string) {
        this.Filename = string;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public double adl(int n) {
        lkr lkr2 = this.adk(n);
        if (lkr2 == null) {
            return 0.0;
        }
        return lkr2.etP();
    }

    public String toString() {
        if (!lcw.qHe) {
            return "AnimationState. NrOf. states [" + this.rrn.size() + "], name [" + this.Name + "], Filename [" + this.Filename + "]";
        }
        return "AnimationState. NrOf. states [" + this.rro.size() + "], name [" + this.Name + "], Filename [" + this.Filename + "]";
    }

    public final Object clone() {
        lks lks2 = (lks)super.clone();
        if (lcw.qHe) {
            lks2.rro = this.bZ(this.rro);
        }
        lks2.rrn = this.ai(this.rrn);
        return lks2;
    }

    private List<lkr> bZ(List list) {
        ArrayList<lkr> arrayList = lcn.emv();
        lkr lkr2 = null;
        for (lkr lkr3 : list) {
            try {
                lkr2 = (lkr)lkr3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lkr3 + "]");
            }
            arrayList.add(lkr2);
        }
        return arrayList;
    }

    private Map ai(Map map) {
        Map<Integer, lkr> map2 = lcn.emw();
        lkr lkr2 = null;
        for (lkr lkr3 : map.values()) {
            try {
                lkr2 = (lkr)lkr3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lkr3 + "]");
                throw new bs(cloneNotSupportedException);
            }
            map2.put(new Integer(lkr2.etO()), lkr2);
        }
        return map2;
    }
}

