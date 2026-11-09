/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class iph
extends ipq {
    private List<ipf> lGI = lcn.emv();
    ipq mrH;
    private int mrI = 0;
    private static final long mrJ = 0x1000000L;
    private static final long mrK = 0x2000000L;
    private static final long mrL = 0x4000000L;
    private static final long mrM = 0x8000000L;
    private static final long mrN = 0x10000000L;
    private static final long mrO = 0x20000000L;
    private static final long mrP = 0x40000000L;
    private static final long mrQ = 0x80000000L;
    private static final long mrR = 32L;

    public iph() {
        this.a(0x1000000L, true);
        this.a(0x4000000L, true);
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        for (ipf ipf2 : this.lGI) {
            ipf2.a(ioa2);
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mrH = null;
        this.rK(false);
        this.rL(false);
        this.rM(false);
        this.rN(false);
        for (ipf ipf2 : this.lGI) {
            ipf2.cleanUp();
        }
    }

    public ipn dlt() {
        if (this.ap(0x1000000L)) {
            return ipn.msd;
        }
        if (this.ap(0x2000000L)) {
            return ipn.mse;
        }
        return ipn.msf;
    }

    public void a(ipn ipn2) {
        this.a(0x3000000L, false);
        switch (ipn2) {
            case msd: {
                this.a(0x1000000L, true);
                break;
            }
            case mse: {
                this.a(0x2000000L, true);
            }
        }
    }

    @Override
    public final void rF(boolean bl) {
        if (bl == this.djR()) {
            return;
        }
        super.rF(bl);
        this.rH(bl);
    }

    @Override
    public final void setActive(boolean bl) {
        if (bl == this.djZ()) {
            return;
        }
        super.setActive(bl);
        for (ipf ipf2 : this.lGI) {
            if (!(ipf2 instanceof ipq)) continue;
            ((ipq)ipf2).setActive(bl);
        }
    }

    public final boolean dlu() {
        return this.dlD();
    }

    public final void rG(boolean bl) {
        if (bl == this.dlD()) {
            return;
        }
        this.rI(bl);
        this.dlw();
    }

    public static iph a(iph iph2, ipn ipn2) {
        iph2.a(ipn2);
        return iph2;
    }

    public final ipf ey(int n, int n2) {
        for (int i = this.lGI.size() - 1; i >= 0; --i) {
            ipf ipf2 = this.lGI.get(i);
            if (!ipf2.djL() || !ipf2.dF(n - ipf2.getX(), n2 - ipf2.getY())) continue;
            return ipf2;
        }
        return null;
    }

    @Override
    public final void ez(int n, int n2) {
        super.ez(n, n2);
        this.rJ(this.dlD());
        this.rG(false);
    }

    @Override
    public final void eA(int n, int n2) {
        super.eA(n, n2);
        this.rG(this.dlE());
    }

    @Override
    public final boolean R(ipf ipf2) {
        return super.R(ipf2) || this.S(ipf2);
    }

    public final ipf RO(int n) {
        return this.lGI.get(n);
    }

    public final List<ipf> getChildren() {
        return Collections.unmodifiableList(this.lGI);
    }

    public List<ipf> dlv() {
        return this.getChildren();
    }

    public final int V(ipf ipf2) {
        return this.lGI.indexOf(ipf2);
    }

    public final void b(ipf ipf2, int n) {
        if (ipf2.djJ() != this) {
            throw new IllegalArgumentException("Invalid child display object");
        }
        if (!ito.f(this.lGI, this.lGI.indexOf(ipf2), n)) {
            return;
        }
        this.pack();
        ipf2.dkK();
    }

    public final int bfn() {
        return this.lGI.size();
    }

    public final void c(ipf ipf2, int n) {
        if (ipf2 == null) {
            return;
        }
        if (ipf2.djJ() == this) {
            return;
        }
        if (ipf2 == this) {
            throw new IllegalArgumentException("Invalid child display object");
        }
        if (ipf2.djJ() != null) {
            throw new IllegalArgumentException("Invalid child display object");
        }
        if (ipf2.S(this)) {
            throw new IllegalArgumentException("Invalid child display object");
        }
        if (ipf2 instanceof iob) {
            throw new IllegalArgumentException("Child display object cannot be an instance of SFMovie");
        }
        if (n < 0) {
            throw new IllegalArgumentException("Invalid child display object index");
        }
        if (n > this.lGI.size()) {
            n = this.lGI.size();
        }
        ipf2.mqQ = this;
        this.lGI.add(n, ipf2);
        this.dlx();
        this.pack();
        if (ipf2.dkx() || ipf2 instanceof iph && ((iph)ipf2).dlG()) {
            this.dly();
        }
        if (ipf2.dky() || ipf2 instanceof iph && ((iph)ipf2).dlH()) {
            this.dlz();
        }
        if (ipf2.dkz()) {
            this.dlx();
        }
        if (this.djE() != null) {
            ipf2.a(this.djE());
        }
        this.Y(ipf2);
        this.d(ipf2, n);
    }

    public final void W(ipf ipf2) {
        this.c(ipf2, this.lGI.size());
    }

    public final void a(ipf ... ipfArray) {
        if (ipfArray != null) {
            for (ipf ipf2 : ipfArray) {
                this.W(ipf2);
            }
        }
    }

    public final void RP(int n) {
        if (n < 0 || n >= this.lGI.size()) {
            return;
        }
        ipf ipf2 = this.lGI.remove(n);
        ipf2.mqQ = null;
        if (ipf2.dhV()) {
            ipf2.dkh();
            this.dkg();
        }
        this.pack();
        if (ipf2.djE() != null) {
            ipf2.cleanUp();
        }
        this.a(ipf2, n);
    }

    public final void X(ipf ipf2) {
        if (ipf2.djJ() != this) {
            throw new IllegalArgumentException("Invalid child display object");
        }
        this.RP(this.lGI.indexOf(ipf2));
    }

    public final void removeAllChildren() {
        while (this.bfn() > 0) {
            this.RP(this.bfn() - 1);
        }
    }

    @Override
    public void djx() {
        for (ipf ipf2 : this.lGI) {
            ipf2.djx();
        }
    }

    @Override
    public final void dki() {
        if (this.dkx()) {
            for (ipf ipf2 : this.lGI) {
                ipf2.dkE();
                ipf2.dki();
            }
            this.rL(false);
        } else if (this.dlG()) {
            for (ipf ipf3 : this.lGI) {
                ipf3.dki();
            }
            this.rL(false);
        }
        super.dki();
    }

    @Override
    public void updateLayout() {
        super.updateLayout();
        if (this.dlH()) {
            for (ipf ipf2 : this.lGI) {
                ipf2.updateLayout();
            }
            this.rM(false);
            this.rL(false);
        }
    }

    public void a(Comparator comparator) {
        Collections.sort(this.lGI, comparator);
        this.rN(true);
        this.dkg();
        this.pack();
    }

    public int RQ(int n) {
        int n2;
        ipf ipf2;
        int n3;
        for (n3 = 0; !(n3 >= this.lGI.size() || (ipf2 = this.lGI.get(n3)).djL() && ipf2.djS() && n < (n2 = ipf2.getY() + ipf2.getHeight() / 2)); ++n3) {
        }
        return n3;
    }

    @Override
    public void dhU() {
        for (ipf ipf2 : this.lGI) {
            ipf2.dhU();
        }
    }

    @Override
    public void kh(float f) {
        for (ipf ipf2 : this.lGI) {
            ipf2.kh(f);
        }
    }

    @Override
    public boolean dF(int n, int n2) {
        switch (this.dlt()) {
            case msd: {
                return super.dF(n, n2);
            }
            case mse: {
                return this.eF(n, n2) != null;
            }
        }
        return false;
    }

    @Override
    public boolean u(int n, int n2, int n3, int n4) {
        switch (this.dlt()) {
            case msd: {
                return super.u(n, n2, n3, n4);
            }
            case mse: {
                return this.w(n, n2, n3, n4) != null;
            }
        }
        return false;
    }

    @Override
    public void dkq() {
        for (ipf ipf2 : this.lGI) {
            ipf2.dkq();
        }
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        this.dlJ();
    }

    @Override
    public void dkl() {
        super.dkl();
        for (ipf ipf2 : this.lGI) {
            ipf2.dkl();
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.rK(false);
        this.rN(false);
    }

    @Override
    public boolean du(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.du(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean dN(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.dN(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean dv(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.dv(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean eB(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.eB(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean eC(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.eC(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean eD(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.eD(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean dK(int n, int n2) {
        super.dK(n, n2);
        if (this.dlD()) {
            this.mrH = this.eF(n, n2);
            if (this.mrH != null) {
                this.mrH.ri(true);
                return this.mrH.dK(n - this.mrH.getX(), n2 - this.mrH.getY());
            }
        }
        return false;
    }

    @Override
    public boolean dM(int n, int n2) {
        boolean bl = false;
        if (this.dlD()) {
            ipq ipq2 = this.eF(n, n2);
            if (ipq2 == this.mrH) {
                if (this.mrH != null) {
                    bl = this.mrH.dM(n - this.mrH.getX(), n2 - this.mrH.getY()) || bl;
                }
            } else {
                if (this.mrH != null) {
                    this.mrH.ri(false);
                    bl = this.mrH.dL(n - this.mrH.getX(), n2 - this.mrH.getY()) || bl;
                }
                this.mrH = ipq2;
                if (this.mrH != null) {
                    this.mrH.ri(true);
                    bl = this.mrH.dK(n - this.mrH.getX(), n2 - this.mrH.getY()) || bl;
                }
            }
        }
        return bl;
    }

    @Override
    public boolean dL(int n, int n2) {
        if (this.dlD() && this.mrH != null) {
            this.mrH.ri(false);
            ipq ipq2 = this.mrH;
            this.mrH = null;
            return ipq2.dL(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public boolean c(int n, int n2, float f) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.c(n - ipq2.getX(), n2 - ipq2.getY(), f);
        }
        return false;
    }

    @Override
    public boolean dx(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.dx(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return false;
    }

    @Override
    public ifg dy(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.dy(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return null;
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        if (this.dlD()) {
            this.mrH = this.eF(n, n2);
            if (this.mrH != null) {
                this.mrH.ri(true);
                return this.mrH.c(n - this.mrH.getX(), n2 - this.mrH.getY(), hzk2, ifg2);
            }
        }
        return false;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        boolean bl = false;
        if (this.dlD()) {
            ipq ipq2 = this.eF(n, n2);
            if (ipq2 == this.mrH) {
                if (this.mrH != null) {
                    bl = this.mrH.a(n - this.mrH.getX(), n2 - this.mrH.getY(), hzk2, ifg2) || bl;
                }
            } else {
                if (this.mrH != null) {
                    this.mrH.ri(false);
                    bl = this.mrH.d(n - this.mrH.getX(), n2 - this.mrH.getY(), hzk2, ifg2) || bl;
                }
                this.mrH = ipq2;
                if (this.mrH != null) {
                    this.mrH.ri(true);
                    bl = this.mrH.c(n - this.mrH.getX(), n2 - this.mrH.getY(), hzk2, ifg2) || bl;
                }
            }
        }
        return bl;
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (this.dlD() && this.mrH != null) {
            this.mrH.ri(false);
            ipq ipq2 = this.mrH;
            this.mrH = null;
            return ipq2.d(n - ipq2.getX(), n2 - ipq2.getY(), hzk2, ifg2);
        }
        return false;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.b(n - ipq2.getX(), n2 - ipq2.getY(), hzk2, ifg2);
        }
        return false;
    }

    @Override
    public void d(ifg ifg2) {
        if (this.dlD()) {
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            for (ipf ipf2 : arrayList) {
                if (!(ipf2 instanceof ipq)) continue;
                ipq ipq2 = (ipq)ipf2;
                ipq2.d(ifg2);
            }
        }
    }

    @Override
    public void a(ifg ifg2, hzk hzk2) {
        if (this.dlD()) {
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            for (ipf ipf2 : arrayList) {
                if (!(ipf2 instanceof ipq)) continue;
                ipq ipq2 = (ipq)ipf2;
                ipq2.a(ifg2, hzk2);
            }
        }
    }

    @Override
    public boolean e(ifg ifg2) {
        boolean bl;
        block1: {
            ipq ipq2;
            ipf ipf2;
            bl = false;
            if (!this.dlD()) break block1;
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            Iterator iterator = arrayList.iterator();
            while (!(!iterator.hasNext() || (ipf2 = (ipf)iterator.next()) instanceof ipq && (bl = (ipq2 = (ipq)ipf2).e(ifg2) || bl))) {
            }
        }
        return bl;
    }

    @Override
    public boolean f(ifg ifg2) {
        boolean bl;
        block1: {
            ipq ipq2;
            ipf ipf2;
            bl = false;
            if (!this.dlD()) break block1;
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            Iterator iterator = arrayList.iterator();
            while (!(!iterator.hasNext() || (ipf2 = (ipf)iterator.next()) instanceof ipq && (bl = (ipq2 = (ipq)ipf2).f(ifg2) || bl))) {
            }
        }
        return bl;
    }

    @Override
    public void g(ifg ifg2) {
        if (this.dlD()) {
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            for (ipf ipf2 : arrayList) {
                if (!(ipf2 instanceof ipq)) continue;
                ipq ipq2 = (ipq)ipf2;
                ipq2.g(ifg2);
            }
        }
    }

    @Override
    public void b(hzk hzk2, ifg ifg2) {
        if (this.dlD()) {
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            for (ipf ipf2 : arrayList) {
                if (!(ipf2 instanceof ipq)) continue;
                ipq ipq2 = (ipq)ipf2;
                ipq2.b(hzk2, ifg2);
            }
        }
    }

    @Override
    public void c(hzk hzk2, ifg ifg2) {
        if (this.dlD()) {
            ArrayList<ipf> arrayList = lcn.emv();
            arrayList.addAll(this.lGI);
            for (ipf ipf2 : arrayList) {
                if (!(ipf2 instanceof ipq)) continue;
                ipq ipq2 = (ipq)ipf2;
                ipq2.c(hzk2, ifg2);
            }
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eE(n, n2)) != null) {
            return ipq2.dd(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return null;
    }

    @Override
    public void q(hyn hyn2) {
        for (ipf ipf2 : this.lGI) {
            if (!(ipf2 instanceof ipq)) continue;
            ((ipq)ipf2).q(hyn2);
        }
    }

    @Override
    public hyn dz(int n, int n2) {
        ipq ipq2;
        if (this.dlD() && (ipq2 = this.eG(n, n2)) != null) {
            return ipq2.dz(n - ipq2.getX(), n2 - ipq2.getY());
        }
        return null;
    }

    @Override
    public void rk(boolean bl) {
        for (ipf ipf2 : this.lGI) {
            ipf2.rk(bl);
        }
    }

    @Override
    public void RK(int n) {
        for (ipf ipf2 : this.lGI) {
            ipf2.RK(n);
        }
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        for (ipf ipf2 : this.lGI) {
            ipf2.b(jnz2, jnz3);
        }
    }

    @Override
    public void qQ(boolean bl) {
        for (ipf ipf2 : this.lGI) {
            ipf2.qQ(bl);
        }
    }

    public void dlw() {
    }

    public void d(ipf ipf2, int n) {
    }

    public void a(ipf ipf2, int n) {
    }

    public void a(ipf ipf2, int n, int n2, int n3, int n4) {
    }

    public void a(ipf ipf2, boolean bl) {
    }

    public void e(ipf ipf2, int n) {
        if (!ito.f(this.lGI, this.lGI.indexOf(ipf2), n)) {
            return;
        }
        this.pack();
    }

    @Override
    public void cZv() {
        super.cZv();
        ArrayList<ipf> arrayList = lcn.emv();
        arrayList.addAll(this.lGI);
        for (ipf ipf2 : arrayList) {
            ipf2.cZv();
        }
    }

    @Override
    public boolean qD(String string) {
        for (ipf ipf2 : this.lGI) {
            if (!(ipf2 instanceof ipq) || !((ipq)ipf2).qD(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean qU(String string) {
        for (ipf ipf2 : this.lGI) {
            if (!(ipf2 instanceof ipq) || !((ipq)ipf2).qU(string)) continue;
            return true;
        }
        return false;
    }

    protected void dlx() {
        if (this.dlF()) {
            return;
        }
        this.rK(true);
        if (this.mqQ != null) {
            this.mqQ.dlx();
        }
    }

    final void dly() {
        if (this.dlG()) {
            return;
        }
        this.rL(true);
        if (this.mqQ != null) {
            this.mqQ.dly();
        }
    }

    final void dlz() {
        if (this.dlH()) {
            return;
        }
        this.rM(true);
        if (this.mqQ != null) {
            this.mqQ.dlz();
        }
    }

    @Override
    final void eu(int n, int n2) {
        if (this.dlF()) {
            this.rK(false);
            n2 = this.RR(n2);
            n = this.RS(n);
            for (ipf ipf2 : this.lGI) {
                ipf2.es(n, n2);
                n2 += ipf2.dkG();
            }
        }
    }

    @Override
    final void ev(int n, int n2) {
        n2 = this.RR(n2);
        n = this.RS(n);
        for (ipf ipf2 : this.lGI) {
            if (ipf2.djS() && ipf2.djL()) {
                ipf2.et(n, n2);
                n2 += ipf2.dkG();
                continue;
            }
            if (!ipf2.dkz()) continue;
            ipf2.dkB();
        }
    }

    @Override
    final void dkC() {
        this.mrI = 0;
        for (ipf ipf2 : this.lGI) {
            ipf2.dkv();
        }
    }

    @Override
    void dkD() {
        for (ipf ipf2 : this.lGI) {
            if (!ipf2.dkz()) continue;
            ipf2.dkB();
        }
    }

    abstract void Y(ipf var1);

    int RR(int n) {
        return 0;
    }

    int RS(int n) {
        return this.getId();
    }

    int dlA() {
        return this.mrI;
    }

    void dlB() {
        ++this.mrI;
    }

    void dlC() {
        --this.mrI;
    }

    @Override
    void rH(boolean bl) {
        for (ipf ipf2 : this.lGI) {
            if (!(ipf2 instanceof ipq)) continue;
            ((ipq)ipf2).rT(bl);
        }
    }

    private boolean dlD() {
        return this.ap(0x4000000L);
    }

    private boolean dlE() {
        return this.ap(0x8000000L);
    }

    private boolean dlF() {
        return this.ap(0x10000000L);
    }

    private boolean dlG() {
        return this.ap(0x20000000L);
    }

    private boolean dlH() {
        return this.ap(0x40000000L);
    }

    private boolean dlI() {
        return this.ap(0x80000000L);
    }

    private void rI(boolean bl) {
        this.a(0x4000000L, bl);
    }

    private void rJ(boolean bl) {
        this.a(0x8000000L, bl);
    }

    private void rK(boolean bl) {
        this.a(0x10000000L, bl);
    }

    private void rL(boolean bl) {
        this.a(0x20000000L, bl);
    }

    private void rM(boolean bl) {
        this.a(0x40000000L, bl);
    }

    private void rN(boolean bl) {
        this.a(0x80000000L, bl);
    }

    private ipq eE(int n, int n2) {
        List<ipf> list = this.dlv();
        for (int i = list.size() - 1; i >= 0; --i) {
            ipf ipf2 = list.get(i);
            if (!ipf2.djL() || !(ipf2 instanceof ipq) || !ipf2.dF(n - ipf2.getX(), n2 - ipf2.getY())) continue;
            return (ipq)ipf2;
        }
        return null;
    }

    private ipq eF(int n, int n2) {
        List<ipf> list = this.dlv();
        for (int i = list.size() - 1; i >= 0; --i) {
            ipf ipf2 = list.get(i);
            if (!ipf2.djL() || !ipf2.djR() || !(ipf2 instanceof ipq) || !ipf2.dF(n - ipf2.getX(), n2 - ipf2.getY())) continue;
            return (ipq)ipf2;
        }
        return null;
    }

    private ipq w(int n, int n2, int n3, int n4) {
        List<ipf> list = this.dlv();
        for (int i = list.size() - 1; i >= 0; --i) {
            ipf ipf2 = list.get(i);
            if (!ipf2.djL() || !ipf2.djR() || !(ipf2 instanceof ipq) || !ipf2.u(n - ipf2.getX(), n2 - ipf2.getY(), n3, n4)) continue;
            return (ipq)ipf2;
        }
        return null;
    }

    private ipq eG(int n, int n2) {
        ipq ipq2 = this.eF(n, n2);
        if (ipq2 == this.mrH) {
            return this.mrH;
        }
        if (this.mrH != null) {
            this.mrH.ri(false);
            if (this.mrH.djR()) {
                this.mrH.dL(n, n2);
            }
        }
        this.mrH = ipq2;
        if (this.mrH != null) {
            this.mrH.ri(true);
            this.mrH.dK(n, n2);
        }
        return this.mrH;
    }

    private void dlJ() {
        if (this.dlI()) {
            this.rN(false);
            StringBuilder stringBuilder = new StringBuilder();
            int n = 0;
            for (ipf ipf2 : this.lGI) {
                n = ipf2.a(stringBuilder, n);
            }
            this.djE().b("DisplayObjectContainer_setChildIndexes", new Object[]{this.getId(), stringBuilder.toString()});
        }
    }
}

