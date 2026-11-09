/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class iup
extends ipz {
    private int mAn = Integer.MIN_VALUE;
    private int mAo = Integer.MIN_VALUE;
    private int mAp = Integer.MAX_VALUE;
    private int mAq = Integer.MAX_VALUE;
    private boolean mAr = false;
    private Set<ipf> mAs = lcn.emx();
    private List<ipf> mAt = lcn.emv();
    private Map<Long, a> mAu = lcn.emw();
    private Map<ipf, Set<a>> mAv = lcn.emw();
    private int mAw = 256;
    private int mAx = 256;
    private Set<ipf> mAy = lcn.emx();
    private Set<ipf> mAz = lcn.emx();
    private List<a> mAA = lcn.emv();
    Set<iua> mAB = lcn.emx();

    public iup() {
    }

    public iup(iqz iqz2) {
        super(iqz2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mAo = Integer.MIN_VALUE;
        this.mAn = Integer.MIN_VALUE;
        this.mAq = Integer.MAX_VALUE;
        this.mAp = Integer.MAX_VALUE;
        this.mAr = false;
        this.mAs.clear();
        this.mAt.clear();
        this.mAu.clear();
        this.mAv.clear();
        this.mAy.clear();
        this.mAz.clear();
        this.mAA.clear();
    }

    public int dsh() {
        return this.mAn;
    }

    public int dsi() {
        return this.mAo;
    }

    public int dsj() {
        return this.mAp - this.mAn + 1;
    }

    public int dsk() {
        return this.mAq - this.mAo + 1;
    }

    public void E(int n, int n2, int n3, int n4) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (n == this.mAn && n2 == this.mAo && n3 == this.dsj() && n4 == this.dsk()) {
            return;
        }
        this.mAn = n;
        this.mAo = n2;
        this.mAp = n + n3 - 1;
        this.mAq = n2 + n4 - 1;
        if (this.mAr) {
            return;
        }
        this.mAr = true;
        this.dkg();
    }

    public void cI(int n, int n2) {
        this.E(n, n2, this.dsj(), this.dsk());
    }

    public void eR(int n, int n2) {
        this.E(this.dsh(), this.dsi(), n, n2);
    }

    @Override
    public final List<ipf> dlv() {
        return this.mAt;
    }

    public Set<iua> F(int n, int n2, int n3, int n4) {
        this.mAB.clear();
        int n5 = n2 + n4;
        for (int i = n2 / this.mAx * this.mAx; i < n5; i += this.mAx) {
            int n6 = n + n3;
            for (int k = n / this.mAw * this.mAw; k < n6; k += this.mAw) {
                long l = iup.eY(k, i);
                a a2 = this.mAu.get(l);
                if (a2 == null) continue;
                for (ipf ipf2 : a2.mAC) {
                    if (!(ipf2 instanceof iua) || !ipf2.u(n - ipf2.getX(), n2 - ipf2.getY(), n3, n4)) continue;
                    this.mAB.add((iua)((Object)ipf2));
                }
            }
        }
        return this.mAB;
    }

    public iua a(iua iua2, iuk iuk2) {
        if (this.bfn() == 0) {
            return null;
        }
        if (iua2 == null) {
            switch (iuk2) {
                case mzJ: 
                case mzK: {
                    return (iua)((Object)this.RO(this.bfn() - 1));
                }
                case mzL: 
                case mzM: {
                    return (iua)((Object)this.RO(0));
                }
            }
            return null;
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        iua iua3 = null;
        double d2 = Double.MAX_VALUE;
        switch (iuk2) {
            case mzJ: {
                n3 = 0;
                n4 = 0;
                n5 = iua2.getX() - 1;
                n6 = this.getHeight();
                n = iua2.getX() - 1;
                n2 = iua2.getY() + iua2.getHeight() / 2;
                int n7 = n4 + n6;
                for (int i = n4 / this.mAx * this.mAx; i < n7; i += this.mAx) {
                    int n8 = n3 + n5;
                    for (int k = n3 / this.mAw * this.mAw; k < n8; k += this.mAw) {
                        long l = iup.eY(k, i);
                        a a2 = this.mAu.get(l);
                        if (a2 == null) continue;
                        for (ipf ipf2 : a2.mAC) {
                            int n9;
                            double d3;
                            int n10;
                            double d4;
                            double d5;
                            if (ipf2 == iua2 || !(ipf2 instanceof iua) || !ipf2.u(n3 - ipf2.getX(), n4 - ipf2.getY(), n5, n6) || ipf2.getX() + ipf2.getWidth() >= n || !((d5 = Math.sqrt((d4 = (double)((n10 = ipf2.getX() + ipf2.getWidth()) - n)) * d4 + (d3 = (double)((n9 = ipf2.getY() + ipf2.getHeight() / 2) - n2)) * d3)) < d2)) continue;
                            d2 = d5;
                            iua3 = (iua)((Object)ipf2);
                        }
                    }
                }
                break;
            }
            case mzK: {
                n3 = 0;
                n4 = 0;
                n5 = this.getWidth();
                n6 = iua2.getY() - 1;
                n = iua2.getX() + iua2.getWidth() / 2;
                n2 = iua2.getY() - 1;
                int n11 = n4 + n6;
                for (int i = n4 / this.mAx * this.mAx; i < n11; i += this.mAx) {
                    int n12 = n3 + n5;
                    for (int k = n3 / this.mAw * this.mAw; k < n12; k += this.mAw) {
                        long l = iup.eY(k, i);
                        a a3 = this.mAu.get(l);
                        if (a3 == null) continue;
                        for (ipf ipf3 : a3.mAC) {
                            int n13;
                            double d6;
                            int n14;
                            double d7;
                            double d8;
                            if (ipf3 == iua2 || !(ipf3 instanceof iua) || !ipf3.u(n3 - ipf3.getX(), n4 - ipf3.getY(), n5, n6) || ipf3.getY() + ipf3.getHeight() > n2 || !((d8 = Math.sqrt((d7 = (double)((n14 = ipf3.getX() + ipf3.getWidth() / 2) - n)) * d7 + (d6 = (double)((n13 = ipf3.getY() + ipf3.getHeight() - 1) - n2)) * d6)) < d2)) continue;
                            d2 = d8;
                            iua3 = (iua)((Object)ipf3);
                        }
                    }
                }
                break;
            }
            case mzL: {
                n3 = iua2.getX() + iua2.getWidth();
                n4 = 0;
                n5 = this.getWidth() - n3;
                n6 = this.getHeight();
                n = n3;
                n2 = iua2.getY() + iua2.getHeight() / 2;
                int n15 = n4 + n6;
                for (int i = n4 / this.mAx * this.mAx; i < n15; i += this.mAx) {
                    int n16 = n3 + n5;
                    for (int k = n3 / this.mAw * this.mAw; k < n16; k += this.mAw) {
                        long l = iup.eY(k, i);
                        a a4 = this.mAu.get(l);
                        if (a4 == null) continue;
                        for (ipf ipf4 : a4.mAC) {
                            int n17;
                            double d9;
                            int n18;
                            double d10;
                            double d11;
                            if (ipf4 == iua2 || !(ipf4 instanceof iua) || !ipf4.u(n3 - ipf4.getX(), n4 - ipf4.getY(), n5, n6) || ipf4.getX() < n || !((d11 = Math.sqrt((d10 = (double)((n18 = ipf4.getX()) - n)) * d10 + (d9 = (double)((n17 = ipf4.getY() + ipf4.getHeight() / 2) - n2)) * d9)) < d2)) continue;
                            d2 = d11;
                            iua3 = (iua)((Object)ipf4);
                        }
                    }
                }
                break;
            }
            case mzM: {
                n3 = 0;
                n4 = iua2.getY() + iua2.getHeight();
                n5 = this.getWidth();
                n6 = this.getHeight() - n4;
                n = iua2.getX() + iua2.getWidth() / 2;
                n2 = n4;
                int n19 = n4 + n6;
                for (int i = n4 / this.mAx * this.mAx; i < n19; i += this.mAx) {
                    int n20 = n3 + n5;
                    for (int k = n3 / this.mAw * this.mAw; k < n20; k += this.mAw) {
                        long l = iup.eY(k, i);
                        a a5 = this.mAu.get(l);
                        if (a5 == null) continue;
                        for (ipf ipf5 : a5.mAC) {
                            int n21;
                            double d12;
                            int n22;
                            double d13;
                            double d14;
                            if (ipf5 == iua2 || !(ipf5 instanceof iua) || !ipf5.u(n3 - ipf5.getX(), n4 - ipf5.getY(), n5, n6) || ipf5.getY() < n2 || !((d14 = Math.sqrt((d13 = (double)((n22 = ipf5.getX() + ipf5.getWidth() / 2) - n)) * d13 + (d12 = (double)((n21 = ipf5.getY()) - n2)) * d12)) < d2)) continue;
                            d2 = d14;
                            iua3 = (iua)((Object)ipf5);
                        }
                    }
                }
                break;
            }
        }
        return iua3;
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        this.dsl();
    }

    @Override
    public void dA(int n, int n2) {
        super.dA(n, n2);
        this.dsl();
    }

    @Override
    public void d(ipf ipf2, int n) {
        super.d(ipf2, n);
        this.mAz.remove(ipf2);
        this.mAy.add(ipf2);
        this.dkg();
        this.dsg();
    }

    @Override
    public void a(ipf ipf2, int n) {
        super.a(ipf2, n);
        this.mAz.add(ipf2);
        this.mAy.remove(ipf2);
        ipf2.rh(true);
        this.dkg();
        this.dsg();
    }

    @Override
    public void a(ipf ipf2, int n, int n2, int n3, int n4) {
        super.a(ipf2, n, n2, n3, n4);
        this.mAz.add(ipf2);
        this.mAy.add(ipf2);
        this.dkg();
        this.dsg();
    }

    @Override
    public void a(ipf ipf2, boolean bl) {
        this.dsg();
    }

    public void dsg() {
    }

    private void dsl() {
        if (this.mAr) {
            this.mAr = false;
            this.dsm();
            this.dsn();
        }
        if (!this.mAz.isEmpty()) {
            this.dso();
            this.mAz.clear();
        }
        if (!this.mAy.isEmpty()) {
            this.dsp();
            this.mAy.clear();
        }
        this.mAA.clear();
    }

    private void dsm() {
        Iterator<ipf> iterator = this.mAs.iterator();
        while (iterator.hasNext()) {
            ipf ipf2 = iterator.next();
            if (this.aq(ipf2)) continue;
            ipf2.rh(false);
            iterator.remove();
            this.mAt.remove(ipf2);
        }
    }

    private void dsn() {
        for (int i = this.mAo / this.mAx * this.mAx; i < this.mAq; i += this.mAx) {
            for (int k = this.mAn / this.mAw * this.mAw; k < this.mAp; k += this.mAw) {
                long l = iup.eY(k, i);
                a a2 = this.mAu.get(l);
                if (a2 == null) continue;
                for (ipf ipf2 : a2.mAC) {
                    if (ipf2.djS() || !this.aq(ipf2)) continue;
                    ipf2.rh(true);
                    if (!this.mAs.add(ipf2)) continue;
                    this.mAt.add(ipf2);
                }
            }
        }
    }

    private void dso() {
        for (ipf ipf2 : this.mAz) {
            Set<a> set = this.mAv.get(ipf2);
            if (set != null) {
                this.mAv.remove(ipf2);
                for (a a2 : set) {
                    a2.mAC.remove(ipf2);
                    if (!a2.mAC.isEmpty()) continue;
                    this.mAu.remove(a2.id);
                    this.mAA.add(a2);
                }
            }
            if (!this.mAs.remove(ipf2)) continue;
            this.mAt.remove(ipf2);
        }
    }

    private void dsp() {
        for (ipf ipf2 : this.mAy) {
            for (int i = ipf2.getY() / this.mAx * this.mAx; i < ipf2.getY() + ipf2.getHeight(); i += this.mAx) {
                for (int k = ipf2.getX() / this.mAw * this.mAw; k < ipf2.getX() + ipf2.getWidth(); k += this.mAw) {
                    long l = iup.eY(k, i);
                    a a2 = this.mAu.get(l);
                    if (a2 == null) {
                        a2 = this.aq(l);
                        this.mAu.put(l, a2);
                    }
                    a2.mAC.add(ipf2);
                    Set<a> set = this.mAv.get(ipf2);
                    if (set == null) {
                        set = lcn.emx();
                        this.mAv.put(ipf2, set);
                    }
                    set.add(a2);
                }
            }
            if (this.aq(ipf2)) {
                ipf2.rh(true);
                if (!this.mAs.add(ipf2)) continue;
                this.mAt.add(ipf2);
                continue;
            }
            ipf2.rh(false);
        }
    }

    private static long eY(int n, int n2) {
        return (long)n2 << 32 | (long)n;
    }

    private a aq(long l) {
        if (!this.mAA.isEmpty()) {
            a a2 = this.mAA.remove(0);
            a2.id = l;
            return a2;
        }
        return new a(l);
    }

    private boolean aq(ipf ipf2) {
        return ipf2.getX() <= this.mAp && ipf2.getY() <= this.mAq && ipf2.getX() + ipf2.getWidth() > this.mAn && ipf2.getY() + ipf2.getHeight() > this.mAo && ipf2.djL();
    }
}

