/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class hyy
extends hzk {
    private Map<a, HashSet<c>> lrd = lcn.emw();
    private Map<a, Boolean> lre = lcn.emw();
    private Map<b, Integer> lrf = lcn.emw();
    private HashMap<b, Boolean> lrg = new HashMap();
    private HashMap<a, e> lrh = new HashMap();
    private hzz lri = null;
    private lie lrj = null;

    public hyy() {
        super("leftmenubar", "leftmenubar.swf");
        for (b b2 : b.values()) {
            b2.cGF().cGD().add(b2);
        }
        this.OQ(jnz.nGi | jnz.nGm | jnz.nGn | jnz.nGo | jnz.nGu | jnz.nGr | jnz.nGt | jnz.nGx);
        this.a(hyb.lmC);
        this.a(hya.lmt, false);
        this.a(b.lsn, 1);
        this.a(b.lvg, 1);
    }

    public void cBa() {
        super.cBa();
        for (b b2 : b.values()) {
            this.a(b2, false);
        }
        for (Map.Entry entry : this.lre.entrySet()) {
            this.a((a)((Object)entry.getKey()), (boolean)((Boolean)entry.getValue()));
        }
        for (Map.Entry entry : this.lrf.entrySet()) {
            this.a((b)((Object)entry.getKey()), (Integer)entry.getValue());
        }
        float f = this.cEN().H;
        this.R(0.0f, 0.0f);
        this.N(1.0f, f / this.cDc());
        this.cER();
        this.a("setHeight", new Object[]{Float.valueOf(f)});
        hso.cxK().cxP().czb().a(new htx(this){
            final /* synthetic */ hyy lrk;
            {
                this.lrk = hyy2;
            }

            public void oi() {
                hyy.a(this.lrk);
            }

            public void oj() {
            }

            public void cyy() {
                hyy.a(this.lrk);
            }
        });
        this.cGB();
    }

    private void cGB() {
        boolean bl = hso.cxK().cxP().czb().i(bca.cUb);
        this.b(b.ltB, bl);
        if (!bl) {
            this.cyJ().pt(false);
        }
    }

    protected void kr(float f) {
        float f2 = this.cEN().H;
        this.R(0.0f, 0.0f);
        this.N(1.0f, f2 / this.cDc());
        this.cER();
        this.a("setHeight", new Object[]{Float.valueOf(f)});
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 5) {
            return null;
        }
        int n3 = -1;
        try {
            n3 = Integer.valueOf(stringArray[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (n3 < 0 || n3 >= b.values().length) {
            return null;
        }
        b b2 = b.values()[n3];
        String string2 = null;
        e e2 = this.lrh.get((Object)b2.cGF());
        if (e2 != null && (string2 = e2.c(b2)) != null) {
            this.lrj = new lie(this, 1.0, true, e2, b2){
                final /* synthetic */ e lrl;
                final /* synthetic */ b lrm;
                final /* synthetic */ hyy lrk;
                {
                    this.lrk = hyy2;
                    this.lrl = e2;
                    this.lrm = b2;
                    super(d2, bl);
                }

                public void dh(double d2) {
                    hyy.a(this.lrk, this.lrl, this.lrm);
                }
            };
            this.lrj.e(this.MessageDelegator);
        }
        if (string2 == null) {
            if (b2.lne == null) {
                return null;
            }
            string2 = b2.lne.bD(new Object[0]).exA();
        }
        String string3 = iah.oM(string2);
        float f = Float.valueOf(stringArray[1]).floatValue();
        float f2 = Float.valueOf(stringArray[2]).floatValue();
        float f3 = Float.valueOf(stringArray[3]).floatValue();
        float f4 = Float.valueOf(stringArray[4]).floatValue();
        this.lri = new hzz((int)(this.cEE() + f + f3 - 2.0f), (int)(this.cEF() + f2), 0, (int)f4, true, string3);
        return this.lri;
    }

    public void q(hyn hyn2) {
        this.lri = null;
        if (this.lrj != null) {
            this.lrj.stop();
            this.lrj = null;
        }
    }

    public void a(b b2, float f) {
        if (b2 == null) {
            return;
        }
        this.a("setButtonPosition", new Object[]{b2.ordinal(), Float.valueOf(f)});
    }

    public void a(b b2, boolean bl) {
        if (b2 == null) {
            return;
        }
        this.a("setButtonVisible", new Object[]{b2.ordinal(), bl});
    }

    public void b(b b2, boolean bl) {
        if (b2 == null) {
            return;
        }
        this.a("setButtonEnabled", new Object[]{b2.ordinal(), bl});
    }

    public void a(a a2) {
        for (b b2 : b.values()) {
            this.a(b2, b2.cGF() == a2);
        }
        this.cGB();
        this.lre.put(a2, Boolean.TRUE);
    }

    public void cGC() {
        for (b b2 : b.values()) {
            this.a(b2, false);
        }
    }

    public void a(c c2) {
        if (!(c2 instanceof d)) {
            for (b b2 : b.values()) {
                boolean bl = this.lrd.containsKey((Object)b2.cGF()) && this.lrd.get((Object)b2.cGF()) != null && this.lrd.get((Object)b2.cGF()).contains(c2) && b2 != b.luq;
                this.a(b2, bl);
                this.lre.put(b2.cGF(), bl);
            }
        } else {
            for (b b3 : b.values()) {
                boolean bl = this.lrd.containsKey((Object)b3.cGF()) && this.lrd.get((Object)b3.cGF()) != null && this.lrd.get((Object)b3.cGF()).contains(c2) && ((d)c2).b(b3);
                this.a(b3, bl);
                this.lre.put(b3.cGF(), bl);
            }
        }
        this.cGB();
    }

    public void a(a a2, boolean bl) {
        if (a2 == null) {
            return;
        }
        for (b b2 : a2.cGD()) {
            this.a(b2, bl);
        }
        this.cGB();
        this.lre.put(a2, bl);
    }

    public void a(a a2, float f) {
        float f2 = f + 20.0f;
        for (b b2 : a2.cGD()) {
            this.a(b2, f2);
            f2 += 25.0f;
        }
    }

    public void t(String string, boolean bl) {
        this.a("setDisplayObjectVisible", new Object[]{string, bl});
    }

    public void a(b b2, int n) {
        if (b2 == null) {
            return;
        }
        this.a("setButtonSelectedState", new Object[]{b2.ordinal(), n});
        this.lrf.put(b2, n);
    }

    public boolean a(b b2) {
        Boolean bl = this.lrg.get((Object)b2);
        return bl != null ? bl : false;
    }

    public void c(b b2, boolean bl) {
        if (b2 == null) {
            return;
        }
        this.a("setButtonOverlayVisible", new Object[]{b2.ordinal(), bl});
        this.lrg.put(b2, bl);
    }

    public void a(a[] aArray, float f) {
        if (aArray == null) {
            return;
        }
        float f2 = f + 20.0f;
        for (int j = 0; j < aArray.length; ++j) {
            if (aArray[j] == null) continue;
            for (b b2 : aArray[j].cGD()) {
                if (b2.name().contains("Separator")) {
                    f2 -= 5.0f;
                }
                this.a(b2, f2);
                f2 += 25.0f;
            }
        }
    }

    public void a(a a2, c c2) {
        HashSet<c> hashSet = this.lrd.get((Object)a2);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.lrd.put(a2, hashSet);
        }
        hashSet.add(c2);
    }

    public void b(a a2) {
        this.lrd.remove((Object)a2);
    }

    public a b(c c2) {
        for (Map.Entry<a, HashSet<c>> entry : this.lrd.entrySet()) {
            HashSet<c> hashSet = entry.getValue();
            if (hashSet == null || !hashSet.contains(c2)) continue;
            return entry.getKey();
        }
        return null;
    }

    public a[] c(c c2) {
        LinkedList<a> linkedList = lcn.emA();
        for (Map.Entry<a, HashSet<c>> entry : this.lrd.entrySet()) {
            HashSet<c> hashSet = entry.getValue();
            if (hashSet == null || !hashSet.contains(c2)) continue;
            linkedList.add(entry.getKey());
        }
        a[] aArray = linkedList.toArray(new a[linkedList.size()]);
        boolean bl = false;
        int n = aArray.length - 1;
        while (!bl) {
            bl = true;
            for (int j = 0; j < n; ++j) {
                if (aArray[j].ordinal() <= aArray[j + 1].ordinal()) continue;
                a a2 = aArray[j];
                aArray[j] = aArray[j + 1];
                aArray[j + 1] = a2;
                bl = false;
            }
            --n;
        }
        return aArray;
    }

    @llk
    public void buttonClicked(int n, int n2) {
        b b2 = b.getValueByOrdinal(n);
        if (b2 == null) {
            return;
        }
        HashSet<c> hashSet = this.lrd.get((Object)b2.cGF());
        if (hashSet == null) {
            return;
        }
        for (c c2 : hashSet) {
            c2.b(b2, n2);
        }
    }

    protected void a(jnx jnx2) {
        if (jnx2.id < 0 || jnx2.id >= b.values().length) {
            return;
        }
        b b2 = b.values()[jnx2.id];
        HashSet<c> hashSet = this.lrd.get((Object)b2.cGF());
        if (hashSet == null) {
            return;
        }
        for (c c2 : hashSet) {
            if (!(c2 instanceof d)) continue;
            ((d)c2).a(b2, jnx2);
        }
    }

    public void b(b b2, float f) {
        this.a("setButtonProgress", new Object[]{b2.ordinal(), Float.valueOf(f)});
    }

    public void a(a a2, e e2) {
        this.lrh.put(a2, e2);
    }

    public void c(a a2) {
        this.lrh.remove((Object)a2);
    }

    private void a(e e2, b b2) {
        if (this.lri != null) {
            String string = e2.c(b2);
            if (string == null) {
                string = b2.cGE().bD(new Object[0]).exA();
            }
            this.lri.mf(iah.oM(string));
        }
    }

    static /* synthetic */ void a(hyy hyy2) {
        hyy2.cGB();
    }

    static /* synthetic */ void a(hyy hyy2, e e2, b b2) {
        hyy2.a(e2, b2);
    }
}

