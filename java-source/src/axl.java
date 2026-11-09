/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 */
import java.util.List;
import java.util.Map;

public class axl {
    private axx cse = null;
    private dxr MessageDelegator = null;
    private Map<dlo, List<aml>> csf = lcn.emw();
    private Map<Integer, lfs<mhk, Integer>> csg = lcn.emw();
    private Map<Integer, lfs<mhk, Integer>> csh = lcn.emw();

    public axl(axx axx2, dxr dxr2) {
        this.cse = axx2;
        this.MessageDelegator = dxr2;
    }

    public void cleanUp() {
    }

    public void XF() {
        this.XG();
    }

    public void a(dlo dlo2, List<aml> list, boolean bl) {
        if (!bl) {
            if (this.csf.containsKey(dlo2)) {
                assert (false);
                this.a(dlo2);
            }
        } else {
            this.a(dlo2);
        }
        this.csf.put(dlo2, list);
        Map map = lcn.emw();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            aml aml2 = list.get(i);
            if (!aml2.Gu()) continue;
            this.cse.b(aml2.BV(), aml2.Gt());
        }
        this.XG();
    }

    public void a(dlo dlo2) {
        List<aml> list = this.csf.remove(dlo2);
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            aml aml2 = list.get(i);
            if (!aml2.Gu()) continue;
            this.cse.a(aml2.BV(), aml2.Gt());
        }
        this.XG();
    }

    public void a(dlo dlo2, List<aml> list) {
        List<aml> list2 = this.csf.remove(dlo2);
        if (list2 == null || list2.isEmpty()) {
            this.a(dlo2, list, false);
            return;
        }
        for (aml aml2 : list2) {
            if (!aml2.Gu()) continue;
            boolean bl = false;
            for (aml aml3 : list) {
                if (aml3.BV() != aml2.BV()) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            this.cse.a(aml2.BV(), aml2.Gt());
        }
        this.csf.put(dlo2, list);
        for (aml aml2 : list) {
            if (!aml2.Gu()) continue;
            mhk mhk2 = null;
            for (aml aml3 : list2) {
                if (aml3.BV() != aml2.BV()) continue;
                mhk2 = aml3.Gt();
                break;
            }
            this.cse.a(aml2.BV(), mhk2, aml2.Gt());
        }
        this.XG();
    }

    private void XG() {
        this.csg.clear();
        this.csh.clear();
        for (List<aml> object2 : this.csf.values()) {
            for (Object object : object2) {
                if (((aml)object).Gu()) continue;
                if (((aml)object).Gv()) {
                    this.a(this.csh, ((aml)object).BV(), ((aml)object).Gt(), ((aml)object).lF());
                    continue;
                }
                this.a(this.csg, ((aml)object).BV(), ((aml)object).Gt(), ((aml)object).lF());
            }
        }
        if (this.cse.Xw() != null) {
            Object object;
            Object object3 = new int[this.csg.size()];
            int[] nArray = new int[this.csg.size()];
            mhk[] mhkArray = new mhk[this.csg.size()];
            object = new int[this.csh.size()];
            int[] nArray2 = new int[this.csh.size()];
            mhk[] mhkArray2 = new mhk[this.csh.size()];
            int n = 0;
            for (Map.Entry<Integer, lfs<mhk, Integer>> entry : this.csg.entrySet()) {
                nArray[n] = entry.getKey();
                mhkArray[n] = (mhk)entry.getValue().reX;
                object3[n] = (Integer)entry.getValue().reY;
                ++n;
            }
            n = 0;
            for (Map.Entry<Integer, lfs<mhk, Integer>> entry : this.csh.entrySet()) {
                nArray2[n] = entry.getKey();
                mhkArray2[n] = (mhk)entry.getValue().reX;
                object[n] = (Integer)entry.getValue().reY;
                ++n;
            }
            eiv eiv2 = (eiv)this.MessageDelegator.h(18695, this.cse.getGUID(), this.cse.Xw());
            eiv2.ci(this.cse.getGUID());
            eiv2.U(nArray);
            eiv2.b(mhkArray);
            eiv2.T(nArray2);
            eiv2.a(mhkArray2);
            eiv2.V((int[])object);
            eiv2.W((int[])object3);
            eiv2.Eh(2);
            this.MessageDelegator.F(eiv2);
        }
    }

    private void a(Map<Integer, lfs<mhk, Integer>> map, int n, mhk mhk2, int n2) {
        lfs<mhk, Integer> lfs2 = map.get(n);
        if (lfs2 != null && ((mhk)lfs2.reX).eyY() == mhs.FLOAT) {
            if (((mhn)lfs2.reX).Pz < ((mhn)mhk2).Pz) {
                map.remove(n);
                map.put(n, new lfs(lfs2.reX, lfs2.reY));
            }
            return;
        }
        map.put(n, new lfs<mhk, Integer>(mhk2, n2));
    }
}

