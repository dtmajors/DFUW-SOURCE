/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class inr
extends hzk {
    private Map<ldv, ins> ljo = lcn.emw();
    private Map<Integer, ins> mmR = lcn.emG();
    private Set<ldv> mmS = lcn.emH();
    private Map<ldv, Integer> mmT = lcn.emw();
    private float aXy;
    private float ljs;
    private int mmU = -1;
    private int mmV = -1;
    public final hxd mmW;

    public inr(hxd hxd2) {
        super(hxd2.cgK(), "ItemContainer.swf");
        this.mmW = hxd2;
        this.a("ActivePage", hsu.ldg, 0);
        this.a("XPercent", hsu.ldg, Float.valueOf(0.1f));
        this.a("YPercent", hsu.ldg, Float.valueOf(0.1f));
    }

    public void cEk() {
        super.cEk();
        this.dhg();
        this.dhh();
    }

    private void dhg() {
        this.x(lxg.tpc.bD(new Object[0]));
        this.x(lxg.tpd.bD(new Object[0]));
    }

    private void dhh() {
        this.x(lxg.tpe.bD(this.nh("ActivePage") + 1, Float.valueOf(this.aXy), Float.valueOf(this.ljs)));
    }

    private int a(ins ins2) {
        int n = ins2.dhk();
        int n2 = n;
        ins ins3 = this.mmR.get(n2);
        if (ins3 != null && ins3 != ins2) {
            n2 = 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        ins3 = this.mmR.get(n2);
        while (ins3 != null && ins3 != ins2) {
            ins3 = this.mmR.get(++n2);
        }
        return n2;
    }

    protected void cEl() {
        int n;
        Object object;
        super.cEl();
        if (this.mmS.isEmpty()) {
            return;
        }
        Iterator<ldv> iterator = this.mmS.iterator();
        while (iterator.hasNext()) {
            ldv ldv2 = iterator.next();
            ins object2 = new ins(this.mmW.ro(ldv2));
            object = this.mmT.get(ldv2);
            if (object != null || (n = object2.dhk()) < 0 || this.mmR.containsKey(n)) continue;
            object2.Rv(n);
            this.mmR.put(n, object2);
            this.ljo.put(ldv2, object2);
            if (this.cDj()) {
                this.a("createItem", new Object[]{object2.dhl(), object2.dhj()});
            }
            iterator.remove();
        }
        for (ldv ldv2 : this.mmS) {
            Integer n2;
            object = new ins(this.mmW.ro(ldv2));
            n = this.a((ins)object);
            this.mmW.af(ldv2, n);
            ((ins)object).Rv(n);
            this.mmR.put(n, (ins)object);
            this.ljo.put(ldv2, (ins)object);
            if (this.cDj()) {
                this.a("createItem", new Object[]{((ins)object).dhl(), ((ins)object).dhj()});
            }
            if ((n2 = this.mmT.remove(ldv2)) == null) continue;
            this.a((ins)object, n2);
        }
        this.mmS.clear();
    }

    public void rD(ldv ldv2) {
        this.mmS.add(ldv2);
    }

    public void jd(ldv ldv2) {
        if (this.mmS.remove(ldv2)) {
            return;
        }
        ins ins2 = this.ljo.remove(ldv2);
        if (ins2 == null) {
            lfn.b(5, "SFItemContainer", "notifyItemRemoved: Could not find item " + ldv2);
            assert (false);
            return;
        }
        assert (this.mmR.get(ins2.dhj()) == ins2);
        this.mmR.remove(ins2.dhj());
        if (this.cDj()) {
            this.a("deleteItem", new Object[]{ins2.dhn()});
        }
    }

    public void rE(ldv ldv2) {
        if (this.mmS.contains(ldv2)) {
            return;
        }
        ins ins2 = this.ljo.get(ldv2);
        if (ins2 == null) {
            lfn.b(5, "SFItemContainer", "notifyItemUpdated: Could not find item " + ldv2);
            assert (false);
            return;
        }
        ins2.U(this.mmW.ro(ldv2));
        int n = ins2.dhk();
        int n2 = this.a(ins2);
        if (n2 != n) {
            this.mmW.af(ldv2, n2);
        }
        if (ins2.dhj() != n2) {
            ins ins3;
            if (this.cDj()) {
                this.a("setItemPosition", new Object[]{ins2.dhn(), n2});
            }
            if ((ins3 = this.mmR.get(ins2.dhj())) == ins2) {
                this.mmR.remove(ins2.dhj());
            }
            ins2.Rv(n2);
            this.mmR.put(ins2.dhj(), ins2);
        }
    }

    public ins rF(ldv ldv2) {
        return this.ljo.get(ldv2);
    }

    protected void cBa() {
        super.cBa();
        this.nY("gridSlotsPerPage");
        this.dhi();
    }

    private void d(mhk[] mhkArray) {
        if (!this.a("activePageChanged", mhkArray, new mhs[]{mhs.INTEGER})) {
            return;
        }
        this.w("ActivePage", ((mho)mhkArray[0]).PC);
        this.dhh();
    }

    private void e(mhk[] mhkArray) {
        if (!this.a("doubleClickItem", mhkArray, new mhs[]{mhs.STRING})) {
            return;
        }
        ldv ldv2 = ldv.zr(((mhr)mhkArray[0]).Value);
        if (ldv2 == null) {
            lfn.b(5, "SFItemContainer", "handleFlashDoubleClickItem: Invalid argument to doubleClickItem");
            assert (false);
            return;
        }
        this.mmW.rp(ldv2);
    }

    protected void a(String string, mhk[] mhkArray) {
        if (string.equals("activePageChanged")) {
            this.d(mhkArray);
        } else if (string.equals("doubleClickItem")) {
            this.e(mhkArray);
        } else {
            super.a(string, mhkArray);
        }
    }

    protected void c(String string, mhk mhk2) {
        if (string.equals("gridSlotsPerPage")) {
            this.mmV = ((mho)mhk2).PC;
        } else {
            super.c(string, mhk2);
        }
    }

    @Override
    protected boolean og(String string) {
        return string.startsWith("slot=") && string.contains("item=");
    }

    @Override
    protected ifg of(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ";");
        ldv ldv2 = null;
        float f = Float.NaN;
        float f2 = Float.NaN;
        try {
            while (stringTokenizer.hasMoreTokens()) {
                String string2 = stringTokenizer.nextToken();
                if (string2.startsWith("item=")) {
                    ldv2 = ldv.zr(string2.substring(5));
                    continue;
                }
                if (!string2.startsWith("imgpos=")) continue;
                string2 = string2.substring(7);
                int n = string2.indexOf(44);
                f = Float.parseFloat(string2.substring(0, n));
                f2 = Float.parseFloat(string2.substring(n + 1));
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        if (ldv2 == null) {
            return null;
        }
        if (Float.isNaN(f)) {
            return null;
        }
        if (Float.isNaN(f2)) {
            return null;
        }
        return new inq(this, ldv2, f, f2);
    }

    @Override
    public void c(ifg ifg2) {
        super.c(ifg2);
        this.a("setDragEffect", new Object[]{((inq)ifg2).aCK.enz(), true});
    }

    @Override
    public void d(ifg ifg2) {
        super.d(ifg2);
        this.a("setDragEffect", new Object[]{((inq)ifg2).aCK.enz(), false});
    }

    @Override
    public void a(ifg ifg2, hzk hzk2) {
        super.a(ifg2, hzk2);
        this.a("setDragEffect", new Object[]{((inq)ifg2).aCK.enz(), false});
    }

    @Override
    public void f(hzk hzk2, ifg ifg2) {
        super.f(hzk2, ifg2);
    }

    @Override
    public void g(hzk hzk2, ifg ifg2) {
        this.Ru(-1);
        super.g(hzk2, ifg2);
    }

    private a qK(String string) {
        if (string == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, ";");
        a a2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            float f;
            float f2;
            int n;
            String string2 = stringTokenizer.nextToken();
            if (string2.startsWith("slot=")) {
                try {
                    int n2 = Integer.parseInt(string2.substring(5));
                    if (a2 == null) {
                        a2 = new a(this, null);
                    }
                    a2.mmX = n2;
                    a2.mmY = n2 + this.nh("ActivePage") * this.mmV;
                    continue;
                }
                catch (Throwable throwable) {
                    lfn.b(5, "SFItemContainer", "decodeComponentName: Cannot decode slot '" + string2 + "'");
                    return null;
                }
            }
            if (string2.startsWith("item=")) {
                ldv ldv2 = ldv.zr(string2.substring(5));
                if (ldv2 == null) {
                    lfn.b(5, "SFItemContainer", "decodeComponentName: Cannot decode guid '" + string2 + "'");
                    return null;
                }
                if (a2 == null) {
                    a2 = new a(this, null);
                }
                a2.aCK = ldv2;
                continue;
            }
            if (string2.startsWith("pos=")) {
                String string3 = string2.substring(4);
                n = string3.indexOf(44);
                if (n < 0) {
                    lfn.b(5, "SFItemContainer", "decodeComponentName: Cannot decode pos '" + string2 + "'");
                    return null;
                }
                try {
                    f2 = Float.parseFloat(string3.substring(0, n));
                    f = Float.parseFloat(string3.substring(n + 1));
                    if (a2 == null) {
                        a2 = new a(this, null);
                    }
                    a2.mmZ = f2;
                    a2.mna = f;
                    continue;
                }
                catch (Throwable throwable) {
                    lfn.b(5, "SFItemContainer", "decodeComponentName: Cannot decode pos '" + string2 + "'");
                    return null;
                }
            }
            if (string2.startsWith("imgpos=")) {
                String string4 = string2.substring(7);
                n = string4.indexOf(44);
                if (n < 0) {
                    lfn.b(5, "SFItemContainer", "decodeComponentName: Cannot decode imgpos '" + string2 + "'");
                    return null;
                }
                try {
                    f2 = Float.parseFloat(string4.substring(0, n));
                    f = Float.parseFloat(string4.substring(n + 1));
                    if (a2 == null) {
                        a2 = new a(this, null);
                    }
                    a2.mnb = f2;
                    a2.mnc = f;
                    continue;
                }
                catch (Throwable throwable) {
                    lfn.b(5, "SFItemContainer", "decodeComponentName: Cannot decode imgpos '" + string2 + "'");
                    return null;
                }
            }
            lfn.b(5, "SFItemContainer", "decodeComponentName: Don't know how to decode '" + string2 + "'");
        }
        return a2;
    }

    @Override
    public boolean a(hzk hzk2, ifg ifg2, String string) {
        if (!(ifg2 instanceof inq)) {
            return false;
        }
        a a2 = this.qK(string);
        if (a2 == null) {
            return false;
        }
        if (a2.mmX < 0) {
            return false;
        }
        this.Ru(a2.mmX);
        return true;
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        if (!(ifg2 instanceof inq)) {
            return false;
        }
        a a2 = this.qK(string);
        if (a2 == null) {
            return false;
        }
        if (a2.mmX < 0) {
            return false;
        }
        if (hzk2 == this) {
            inq inq2 = (inq)ifg2;
            ldv ldv2 = inq2.aCK;
            ins ins2 = this.ljo.get(ldv2);
            if (ins2 == null) {
                lfn.b(5, "SFItemContainer", "onDragDrop: Could not find item " + ldv2);
                return false;
            }
            if (ins2.dhj() != a2.mmY) {
                this.a(ins2, a2.mmY);
            }
        } else {
            inq inq3 = (inq)ifg2;
            ldv ldv3 = inq3.aCK;
            inq3.mmO.mmW.a(ldv3, this.mmW, false);
            this.mmT.put(ldv3, a2.mmY);
        }
        return true;
    }

    private void Ru(int n) {
        if (n == this.mmU) {
            return;
        }
        if (this.mmU >= 0) {
            this.a("setDropEffect", new Object[]{this.mmU, false});
        }
        this.mmU = n;
        if (this.mmU >= 0) {
            this.a("setDropEffect", new Object[]{this.mmU, true});
        }
    }

    private void a(ins ins2, int n) {
        if (ins2.dhj() == n) {
            return;
        }
        if (ins2.dhj() >= 0) {
            this.mmR.remove(ins2.dhj());
            ins2.Rv(-1);
            if (this.cDj()) {
                this.a("setItemPosition", new Object[]{ins2.dhn(), ins2.dhj()});
            }
        }
        int n2 = n;
        while (this.mmR.containsKey(n2)) {
            ++n2;
        }
        while (n2 > n) {
            ins ins3 = this.mmR.remove(--n2);
            ins3.Rv(n2 + 1);
            this.mmW.af(ins3.dho().getGUID(), n2 + 1);
            this.mmR.put(n2 + 1, ins3);
            if (!this.cDj()) continue;
            this.a("setItemPosition", new Object[]{ins3.dhn(), ins3.dhj()});
        }
        ins2.Rv(n);
        this.mmR.put(n, ins2);
        if (this.cDj()) {
            this.a("setItemPosition", new Object[]{ins2.dhn(), ins2.dhj()});
        }
        this.mmW.af(ins2.dho().getGUID(), n);
    }

    private void dhi() {
        this.a("activePage", this.nh("ActivePage"));
        for (ins ins2 : this.ljo.values()) {
            this.a("createItem", new Object[]{ins2.dhl(), ins2.dhj()});
        }
    }
}

