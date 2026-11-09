/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class hdr {
    private static int kaK = 1000;
    public static final hbe jzX = hbe.jAM;
    private final Collection<hkr> kaL = new lcl<hkr>(kaK);
    private final hdm jLM;
    private final hku.b kaM;
    private final lbn kaN = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdr kaQ;
        {
            this.kaQ = hdr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdr.a(this.kaQ)) {
                throw new AssertionError();
            }
            this.kaQ.cdU();
        }

        static {
            $assertionsDisabled = !hdr.class.desiredAssertionStatus();
        }
    };
    private final lbn kaO = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdr kaQ;
        {
            this.kaQ = hdr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdr.a(this.kaQ)) {
                throw new AssertionError();
            }
            hdr.b(this.kaQ);
        }

        static {
            $assertionsDisabled = !hdr.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    public final lbr kaP = new lbr(this){
        final /* synthetic */ hdr kaQ;
        {
            this.kaQ = hdr2;
        }

        public boolean a(lfu lfu2) {
            return hdr.a(this.kaQ, lfu2);
        }
    };

    public hdr(hdm hdm2) {
        this.jLM = hdm2;
        this.kaM = new hku.b(hdm2);
        this.jLT = true;
        this.mU(true);
        this.cdU();
    }

    public final void dispose() {
        assert (this.jLT);
        this.mU(false);
        this.jLT = false;
    }

    public final void cdU() {
        assert (this.jLT);
        for (hee hee2 : this.jLM.cbP().kcj.col()) {
            if (hee2.kdG || this.a(hee2) != null) continue;
            hku hku2 = this.b(hee2);
            if (hku2 != null) {
                if (hku2.kCo != hee2.kdF) {
                    this.kaL.remove(hku2);
                    hku2.dispose();
                    hku2 = null;
                } else if (hku2.cjv() != null && hku2.cjv() != hee2) {
                    this.kaL.remove(hku2);
                    hku2.dispose();
                    hku2 = null;
                }
            }
            if (hku2 == null) {
                hku2 = new hku(this.jLM, hee2.kdF);
                this.kaL.add(hku2);
            }
            hku2.j(hee2);
        }
    }

    private void g(lfu lfu2) {
        String string = lfu2.aA("NameOfRoot", "");
        hku hku2 = lfu2.a("Factory", null, this.kaM);
        if (hku2 == null) {
            return;
        }
        this.kaL.add(hku2);
    }

    private void a(lfu lfu2, hku hku2) {
        lfu2.a("Factory", hku2, this.kaM);
    }

    private boolean a(hku hku2) {
        switch (hku2.kCo) {
            case dEq: 
            case dEr: 
            case dEL: 
            case dEE: 
            case dED: 
            case dEC: 
            case dEF: 
            case dEG: 
            case dEH: 
            case dEI: 
            case dEJ: 
            case dEK: {
                return false;
            }
        }
        return true;
    }

    private boolean h(lfu lfu2) {
        assert (this.jLT);
        if (lfu2.eqA()) {
            int n = lfu2.ad("Count", 0);
            for (int i = 0; i < n; ++i) {
                String string = this.LR(i);
                this.g(lfu2.zC(string));
            }
        } else {
            assert (lfu2.eqB());
            ArrayList<hku> arrayList = new ArrayList<hku>(lin.a(this.kaL, hku.class));
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                hku hku2 = (hku)iterator.next();
                if (!this.a(hku2)) {
                    iterator.remove();
                    continue;
                }
                String string = hku2.cpg();
                if (string != null && !string.startsWith("Unknown") && string.length() != 0) continue;
                iterator.remove();
            }
            int n = arrayList.size();
            lfu2.ad("Count", n);
            int n2 = 0;
            for (hku hku3 : arrayList) {
                String string = this.LR(n2++);
                this.a(lfu2.zC(string), hku3);
            }
            assert (n2 == n);
        }
        return lfu2.eqA();
    }

    private String LR(int n) {
        return "Entry" + n;
    }

    private hkr a(hee hee2) {
        assert (hee2 != null);
        for (hkr hkr2 : this.kaL) {
            if (!lin.i(hkr2.cjv(), hee2)) continue;
            return hkr2;
        }
        return null;
    }

    private hku b(hee hee2) {
        return this.a(hee2.kdC);
    }

    private hku a(heg heg2) {
        String string = heg2.Name;
        for (hku hku2 : lin.a(this.kaL, hku.class)) {
            if (!string.equals(hku2.cpg())) continue;
            return hku2;
        }
        return null;
    }

    private void cdV() {
        hdu hdu2 = this.jLM.cbP().kcj.con();
        heg heg2 = this.jLM.cbP().kcj.coo();
        hku hku2 = this.a(heg2);
        if (hku2 != null) {
            this.kaL.remove(hku2);
            hku2.dispose();
        }
    }

    private void mU(boolean bl) {
        this.jLM.cbP().kcj.cok().a(bl, this.kaN);
        this.jLM.cbP().kcj.com().a(bl, this.kaO);
    }

    static /* synthetic */ boolean a(hdr hdr2) {
        return hdr2.jLT;
    }

    static /* synthetic */ void b(hdr hdr2) {
        hdr2.cdV();
    }

    static /* synthetic */ boolean a(hdr hdr2, lfu lfu2) {
        return hdr2.h(lfu2);
    }
}

