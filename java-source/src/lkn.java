/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class lkn
implements Cloneable {
    private List<lkl> rqR = lcn.emv();

    public List<lkl> etK() {
        return this.rqR;
    }

    public void a(lkl lkl2) {
        this.rqR.add(lkl2);
    }

    public String[] etL() {
        String[] stringArray = null;
        stringArray = new String[this.rqR.size()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = this.rqR.get(i).dZF();
        }
        return stringArray;
    }

    public int AB(String string) {
        String string2 = null;
        for (int i = 0; i < this.rqR.size(); ++i) {
            string2 = this.rqR.get(i).dZF();
            if (!string2.equals(string)) continue;
            return i;
        }
        return 0;
    }

    public lkl AC(String string) {
        lkl lkl2 = null;
        for (int i = 0; i < this.rqR.size(); ++i) {
            lkl2 = this.rqR.get(i);
            if (!lkl2.dZF().equals(string)) continue;
            return lkl2;
        }
        return null;
    }

    public final Object clone() {
        lkn lkn2 = (lkn)super.clone();
        lkn2.rqR = this.bZ(this.rqR);
        return lkn2;
    }

    private List bZ(List list) {
        ArrayList<lkl> arrayList = lcn.emv();
        lkl lkl2 = null;
        for (lkl lkl3 : list) {
            try {
                lkl2 = (lkl)lkl3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lkl3 + "]");
            }
            arrayList.add(lkl2);
        }
        return arrayList;
    }
}

