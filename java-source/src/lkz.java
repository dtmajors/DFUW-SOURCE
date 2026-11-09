/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class lkz
implements Cloneable {
    private Map<Integer, Map<Integer, lky>> rDL = lcn.emw();
    private List rDM = lcn.emv();
    private String Name = "";
    private String rDN;
    private boolean bC;

    public void b(lky lky2) {
        lky lky3;
        Integer n = new Integer(lky2.euu());
        Integer n2 = new Integer(lky2.euv());
        Map<Integer, lky> map = this.rDL.get(n);
        if (map == null) {
            map = lcn.emw();
            this.rDL.put(n, map);
        }
        if ((lky3 = map.get(n2)) != null) {
            lfn.b(4, "SFAnimationTransitionList", "addTransition() : Transition from StateID[" + lky2.euu() + "] to StateID[" + lky2.euv() + "] already exists. Overwriting it!");
        }
        map.put(n2, lky2);
        if (lcw.qHe) {
            this.rDM.add(lky2);
        }
    }

    public void c(lky lky2) {
        Integer n = new Integer(lky2.euu());
        Integer n2 = new Integer(lky2.euv());
        Map<Integer, lky> map = this.rDL.get(n);
        if (map != null) {
            map.remove(n2);
        } else {
            lfn.b(5, "SFWorldAnimatedMeshObject", "removeTransition() : Could not Remove AnimationTransition [" + lky2 + "]");
        }
        if (lcw.qHe) {
            this.rDM.remove(lky2);
        }
    }

    public void euF() {
        if (lcw.qHe) {
            this.rDM.clear();
        }
        this.rDL.clear();
    }

    public List euG() {
        return this.rDM;
    }

    public lky gf(int n, int n2) {
        lky lky2 = null;
        Integer n3 = new Integer(n);
        Integer n4 = new Integer(n2);
        Map<Integer, lky> map = this.rDL.get(n3);
        if (map != null) {
            lky2 = map.get(n4);
        }
        if (lky2 == null && (map = this.rDL.get(n4)) != null && (lky2 = map.get(n3)) != null && !lky2.euw()) {
            lky2 = null;
        }
        return lky2;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public String euH() {
        return this.rDN;
    }

    public void AH(String string) {
        this.rDN = string;
    }

    public final Object clone() {
        lkz lkz2 = (lkz)super.clone();
        if (lcw.qHe) {
            lkz2.rDM = this.bZ(this.rDM);
        }
        lkz2.rDL = lcn.emw();
        return lkz2;
    }

    private List bZ(List list) {
        ArrayList<lky> arrayList = lcn.emv();
        lky lky2 = null;
        for (lky lky3 : list) {
            try {
                lky2 = (lky)lky3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lky3 + "]");
            }
            arrayList.add(lky2);
        }
        return arrayList;
    }

    private Map ai(Map map) {
        Map<Integer, lky> map2 = lcn.emw();
        lky lky2 = null;
        for (lky lky3 : map.values()) {
            try {
                lky2 = (lky)lky3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lky3 + "]");
                throw new bs(cloneNotSupportedException);
            }
            map2.put(new Integer(lky2.euv()), lky2);
        }
        return map2;
    }

    public lky a(boolean bl, lkr lkr2, lcb lcb2) {
        lky lky2;
        if (lcb2.qvQ.etO() == lkr2.etO() && !bl && lcb2.qvR != null) {
            if (this.bC) {
                lfn.b(0, this.getClass().getSimpleName(), "Getting CurrentExtraAnimationState.getAnimationStateID() = " + lcb2.qvR.etO());
            }
            lky2 = this.gf(lkr2.etO(), lcb2.qvR.etO());
        } else {
            lky2 = this.gf(lkr2.etO(), lcb2.qvQ.etO());
        }
        if (lky2 == null) {
            lky2 = lky.eus();
        }
        return lky2;
    }
}

