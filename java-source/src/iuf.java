/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class iuf
extends iul {
    public static final int mzm = 4;
    public static final int mzn = 4;
    public static final int mzo = 2;
    public static final int mzp = 2;
    private int mzq = 4;
    private int mzr = 4;
    private int mzs = 2;
    private int mzt = 2;
    private a mzu;
    private lgs mzv = new lgs();
    private iuj mzw;
    private boolean mzx = true;
    private boolean mzy;

    public iuf() {
        this.drN().a((iqz)null);
        this.c(this.drD());
        this.drM().W(this.drG());
    }

    @Override
    public boolean drj() {
        return false;
    }

    public boolean drz() {
        return this.mzy;
    }

    public void sz(boolean bl) {
        if (bl == this.mzy) {
            return;
        }
        this.mzy = bl;
        this.dgW();
    }

    public void drA() {
        if (this.mzx) {
            return;
        }
        this.mzx = true;
        this.drC();
    }

    @Override
    public void a(iun iun2) {
        super.a(iun2);
        switch (iun2) {
            case mAh: 
            case mAi: 
            case mAj: {
                this.mzw.rF(false);
                break;
            }
            default: {
                this.mzw.rF(true);
            }
        }
    }

    @Override
    public boolean du(int n, int n2) {
        if (super.du(n, n2)) {
            return true;
        }
        return this.drX() ? this.mzw.du(n, n2) : false;
    }

    @Override
    public boolean dN(int n, int n2) {
        if (super.dN(n, n2)) {
            return true;
        }
        return this.drX() ? this.mzw.dN(n, n2) : false;
    }

    @Override
    public boolean eC(int n, int n2) {
        if (super.eC(n, n2)) {
            return true;
        }
        return this.drX() ? this.mzw.eC(n, n2) : false;
    }

    @Override
    public boolean eD(int n, int n2) {
        if (super.eD(n, n2)) {
            return true;
        }
        return this.drX() ? this.mzw.eD(n, n2) : false;
    }

    @Override
    public boolean eB(int n, int n2) {
        List<iua> list = this.drp();
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (list.size() == 1) {
            iud iud2 = (iud)list.get(0);
            if (iud2 == null) {
                return false;
            }
            return this.a(iud2);
        }
        ArrayList<iud> arrayList = lcn.emv();
        for (iua iua2 : list) {
            if (!(iua2 instanceof iud)) continue;
            arrayList.add((iud)iua2);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        return this.bA(arrayList);
    }

    public boolean a(iud iud2) {
        return false;
    }

    public boolean bA(List<iud> list) {
        return false;
    }

    @Override
    public hyn dz(int n, int n2) {
        hyn hyn2 = super.dz(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        List<iua> list = this.drp();
        if (list == null || list.isEmpty()) {
            return this.dgU();
        }
        if (list.size() == 1) {
            iud iud2 = (iud)list.get(0);
            if (iud2 == null) {
                return null;
            }
            return this.b(iud2);
        }
        ArrayList<iud> arrayList = lcn.emv();
        for (iua iua2 : list) {
            if (!(iua2 instanceof iud)) continue;
            arrayList.add((iud)iua2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return this.bx(arrayList);
    }

    public hyn dgU() {
        return null;
    }

    public hyn b(iud iud2) {
        return null;
    }

    public hyn bx(List<iud> list) {
        return null;
    }

    @Override
    public void o(ipf ipf2) {
        super.o(ipf2);
        if (ipf2 instanceof iud) {
            this.drA();
        }
    }

    public void dgV() {
        ((iph)this.drN().dik()).a(new Comparator<ipf>(this){
            final /* synthetic */ iuf mzz;
            {
                this.mzz = iuf2;
            }

            public int a(ipf ipf2, ipf ipf3) {
                if (ipf2 instanceof iud && ipf3 instanceof iud) {
                    iud iud2 = (iud)ipf2;
                    iud iud3 = (iud)ipf3;
                    return iud2.dqE().getText().compareTo(iud3.dqE().getText());
                }
                return 0;
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((ipf)object, (ipf)object2);
            }
        });
    }

    public void dgW() {
    }

    @Override
    public void eQ(int n, int n2) {
        super.eQ(n, n2);
        this.mzw.eO(n, n2);
    }

    @Override
    public void drB() {
        this.drN().dik().setWidth(this.drN().dik().djJ().getWidth());
        this.drE();
    }

    public void drC() {
        this.drN().dik().djJ().pack();
    }

    private iua drD() {
        this.mzu = new a(null);
        return this.mzu;
    }

    private void drE() {
        if (this.mzx) {
            this.dgV();
            this.mzx = false;
        }
        this.drF();
        this.drN().setSize(this.mzu.getX(), this.mzu.getY());
    }

    private void drF() {
        int n = 4;
        int n2 = 4;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = this.drN().drm();
        List<iua> list = this.sU();
        for (iua iua2 : list) {
            iud iud2;
            if (!(iua2 instanceof iud) || !(iud2 = (iud)iua2).djL()) continue;
            if (n + iud2.getWidth() + 2 >= n8) {
                n = 4;
                n4 = Math.max(n4, n2);
                n2 += n5 + 2;
                n5 = 0;
            }
            iud2.ek(n, n2);
            n3 = Math.max(n3, n);
            n6 = iud2.getWidth();
            n7 = iud2.getHeight();
            n += n6 + 2;
            n5 = Math.max(n5, n7);
        }
        this.mzu.ek(n3 += n6 + 4, n4 += n7 * 2 + 4);
    }

    private ipf drG() {
        this.mzw = new iuj(this){
            final /* synthetic */ iuf mzz;
            {
                this.mzz = iuf2;
            }

            public void o(lgs lgs2) {
                iuf.a(this.mzz, lgs2);
            }
        };
        return this.mzw;
    }

    private void n(lgs lgs2) {
        boolean bl = this.d(lgs2.cf, lgs2.cg, lgs2.rmN, lgs2.H, this.mzv.cf, this.mzv.cg, this.mzv.rmN, this.mzv.H);
        this.mzv.t(lgs2);
        int n = 0;
        int n2 = 0;
        ioc ioc2 = this.drM().ep(hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc());
        if (ioc2.cf < 0) {
            n = ioc2.cf;
        } else if (ioc2.cf >= this.drM().getWidth()) {
            n = ioc2.cf - this.drM().getWidth();
        }
        if (ioc2.cg < 0) {
            n2 = ioc2.cg;
        } else if (ioc2.cg >= this.drM().getHeight()) {
            n2 = ioc2.cg - this.drM().getHeight();
        }
        this.eP(n, n2);
        if (bl) {
            this.cXg();
        }
    }

    static /* synthetic */ void a(iuf iuf2, lgs lgs2) {
        iuf2.n(lgs2);
    }
}

