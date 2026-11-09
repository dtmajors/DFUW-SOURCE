/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ium
extends iup
implements iuc {
    private List<iua> mAf = lcn.emv();
    private Set<iua> mAg = lcn.emx();

    public ium() {
        super(irn.dns());
    }

    public ium(iqz iqz2) {
        super(iqz2);
    }

    @Override
    public boolean drj() {
        return true;
    }

    @Override
    public boolean drk() {
        return true;
    }

    @Override
    public int drl() {
        return -this.getX();
    }

    @Override
    public int dnx() {
        return -this.getY();
    }

    @Override
    public int drm() {
        return this.getWidth();
    }

    @Override
    public int drn() {
        return this.getHeight();
    }

    @Override
    public void eO(int n, int n2) {
        this.ek(-n, -n2);
        this.cI(n, n2);
        this.eQ(n, n2);
    }

    @Override
    public void eP(int n, int n2) {
        this.eO(this.drl() + n, this.dnx() + n2);
    }

    @Override
    public int dro() {
        return this.bfn();
    }

    @Override
    public List<iua> sU() {
        ArrayList<iua> arrayList = lcn.emv();
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            if (!(ipf2 instanceof iua)) continue;
            arrayList.add((iua)((Object)ipf2));
        }
        return arrayList;
    }

    @Override
    public int b(iua iua2) {
        return iua2 instanceof ipf ? this.V((ipf)((Object)iua2)) : -1;
    }

    @Override
    public boolean a(iua iua2, int n) {
        if (iua2 instanceof ipf) {
            this.b((ipf)((Object)iua2), n);
            return true;
        }
        return false;
    }

    @Override
    public iua SY(int n) {
        ipf ipf2 = this.RO(n);
        return ipf2 instanceof iua ? (iua)((Object)ipf2) : null;
    }

    @Override
    public void b(iua iua2, int n) {
        if (iua2 instanceof ipf) {
            this.c((ipf)((Object)iua2), n);
            this.a(iua2, iua2.getSelected());
        }
    }

    @Override
    public void c(iua iua2) {
        if (iua2 instanceof ipf) {
            this.W((ipf)((Object)iua2));
            this.a(iua2, iua2.getSelected());
        }
    }

    @Override
    public void d(iua iua2) {
        if (iua2 instanceof ipf) {
            this.X((ipf)((Object)iua2));
            this.a(iua2, iua2.getSelected());
        }
    }

    @Override
    public void removeAllItems() {
        int n = 0;
        while (n < this.bfn()) {
            ipf ipf2 = this.RO(n);
            if (ipf2 instanceof iua) {
                this.RP(n);
                continue;
            }
            ++n;
        }
        this.mAf.clear();
        this.mAg.clear();
    }

    @Override
    public List<iua> drp() {
        return this.mAf;
    }

    @Override
    public int drq() {
        return this.mAf.size();
    }

    @Override
    public void a(iua iua2, boolean bl) {
        ipf ipf2 = iua2.dik();
        if (ipf2 != null) {
            if (ipf2.djJ() == this) {
                if (iua2.getSelected()) {
                    if (this.mAg.add(iua2)) {
                        this.mAf.add(iua2);
                    }
                } else if (this.mAg.remove(iua2)) {
                    this.mAf.remove(iua2);
                }
            } else if (this.mAg.remove(iua2)) {
                this.mAf.remove(iua2);
            }
        }
    }

    @Override
    public void c(Comparator comparator) {
        this.a(comparator);
    }

    @Override
    public int a(iub iub2) {
        List<ipf> list = this.getChildren();
        int n = 0;
        for (ipf ipf2 : list) {
            if (!(ipf2 instanceof iua)) continue;
            boolean bl = iub2.a((iua)((Object)ipf2));
            ipf2.setVisible(bl);
            if (!bl) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        for (int i = 0; i < this.bfn(); ++i) {
            ipf ipf2 = this.RO(i);
            ipf2.kh(f2);
        }
    }

    @Override
    public void eQ(int n, int n2) {
    }

    public /* synthetic */ Collection C(int n, int n2, int n3, int n4) {
        return super.F(n, n2, n3, n4);
    }
}

