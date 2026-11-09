/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class iul
extends ipx
implements iuc {
    private ipx mzO;
    private ipz mzP;
    private iuc mzQ;
    private irt mzR;
    private irt mzS;
    private ipf mzT;
    private iun mzU = iun.mAk;
    private iua mzV;
    private iua mzW;
    private ipf mzX;
    private int mzY = 0;
    private int mzZ = 0;
    private int mAa = 32;
    private int mAb = 32;
    private boolean mAc = false;
    private static iqz mdv = new iqy(ire.muk, 2){

        public void e(ipf ipf2) {
            iul iul2 = (iul)ipf2;
            super.e(ipf2);
            ipf2.setSize(ipf2.getWidth() - iul.b(iul2), ipf2.getHeight() - iul.c(iul2));
        }

        public void i(ipf ipf2) {
            iul iul2 = (iul)ipf2;
            super.i(ipf2);
            if (iul.d(iul2) != null) {
                ((ipf)((Object)iul.d(iul2))).RH(((ipf)((Object)iul.d(iul2))).getX() - iul.b(iul2));
            }
            if (iul.e(iul2) != null) {
                ((ipf)((Object)iul.e(iul2))).RH(((ipf)((Object)iul.e(iul2))).getX() - iul.c(iul2));
            }
        }
    };
    private static iqz mAd = new iqv(){

        public void i(ipf ipf2) {
            iul iul2 = (iul)ipf2.djJ().djJ();
            iul2.drB();
            iul.f(iul2);
        }
    };

    public iul() {
        super(mdv);
        this.mzO = ipx.c(new ipf[0]);
        this.W(this.mzO);
        this.mzP = new ipz(mAd);
        this.mzP.sa(true);
        this.mzO.W(this.mzP);
        this.a(new ium(this){
            final /* synthetic */ iul mAe;
            {
                this.mAe = iul2;
            }

            public void eQ(int n, int n2) {
                this.mAe.eQ(n, n2);
            }

            public void d(ipf ipf2, int n) {
                super.d(ipf2, n);
                this.mAe.o(ipf2);
            }

            public void a(ipf ipf2, int n) {
                super.a(ipf2, n);
                this.mAe.ao(ipf2);
            }

            public void dsg() {
                this.mAe.pack();
            }
        });
    }

    public iph drM() {
        return this.mzO;
    }

    public iuc drN() {
        return this.mzQ;
    }

    public void a(iuc iuc2) {
        if (iuc2 == this.mzQ) {
            return;
        }
        if (this.mzQ != null) {
            ((ipf)((Object)this.mzQ)).removeFromParent();
        }
        this.mzQ = iuc2;
        if (this.mzQ != null) {
            this.mzP.c((ipf)((Object)this.mzQ), 0);
        }
        this.drI();
    }

    public irt drO() {
        return this.mzR;
    }

    public void a(irt irt2) {
        if (irt2 == this.mzR) {
            return;
        }
        if (this.mzR != null) {
            this.mzR.removeFromParent();
        }
        this.mzR = irt2;
        if (this.mzR != null) {
            this.mzR.rg(false);
            this.mzR.b(ire.mul);
            this.c(this.mzR.dik(), itp.t(this.mzO));
        }
    }

    public irt drP() {
        return this.mzS;
    }

    public void b(irt irt2) {
        if (irt2 == this.mzS) {
            return;
        }
        if (this.mzS != null) {
            this.mzS.removeFromParent();
        }
        this.mzS = irt2;
        if (this.mzS != null) {
            this.mzS.b(ire.muk);
            this.c(this.mzS.dik(), itp.t(this.mzO, this.mzR.dik()));
        }
    }

    public ipf drQ() {
        return this.mzT;
    }

    public void an(ipf ipf2) {
        if (ipf2 == this.mzT) {
            return;
        }
        if (this.mzT != null) {
            this.mzT.removeFromParent();
        }
        this.mzT = ipf2;
        if (this.mzT != null) {
            this.c(this.mzT, itp.t(this.mzP, this.mzR.dik(), this.mzS.dik()));
        }
    }

    @Override
    public boolean drj() {
        return this.mzQ != null ? this.mzQ.drj() && this.mzQ.drm() > this.getWidth() : false;
    }

    @Override
    public boolean drk() {
        return this.mzQ != null ? this.mzQ.drk() && this.mzQ.drn() > this.getHeight() : false;
    }

    @Override
    public int drl() {
        return this.mzQ != null ? this.mzQ.drl() : 0;
    }

    @Override
    public int dnx() {
        return this.mzQ != null ? this.mzQ.dnx() : 0;
    }

    @Override
    public int drm() {
        return this.mzQ != null ? this.mzQ.drm() : 0;
    }

    @Override
    public int drn() {
        return this.mzQ != null ? this.mzQ.drn() : 0;
    }

    @Override
    public void eO(int n, int n2) {
        if (this.mzQ != null && (n != this.drl() || n2 != this.dnx())) {
            this.mzQ.eO(n, n2);
        }
    }

    @Override
    public void eP(int n, int n2) {
        if (this.mzQ != null && (n != 0 || n2 != 0)) {
            this.mzQ.eP(n, n2);
        }
    }

    public void Sg(int n) {
        this.eO(0, n);
    }

    public void LO(int n) {
        this.eP(0, n);
    }

    public int drR() {
        return this.mAa;
    }

    public void Tb(int n) {
        this.mAa = n;
    }

    public int drS() {
        return this.mAb;
    }

    public void Tc(int n) {
        this.mAb = n;
    }

    public int drH() {
        return this.mAb;
    }

    public void Ta(int n) {
        this.Tc(n);
    }

    @Override
    public int dro() {
        return this.mzQ != null ? this.mzQ.dro() : 0;
    }

    @Override
    public List<iua> sU() {
        return this.mzQ != null ? this.mzQ.sU() : null;
    }

    @Override
    public int b(iua iua2) {
        return this.mzQ != null ? this.mzQ.b(iua2) : -1;
    }

    @Override
    public boolean a(iua iua2, int n) {
        return this.mzQ != null ? this.mzQ.a(iua2, n) : false;
    }

    @Override
    public iua SY(int n) {
        return this.mzQ != null ? this.mzQ.SY(n) : null;
    }

    @Override
    public void b(iua iua2, int n) {
        if (this.mzQ != null) {
            this.mzQ.b(iua2, n);
        }
        this.pack();
    }

    @Override
    public void c(iua iua2) {
        if (this.mzQ != null) {
            this.mzQ.c(iua2);
        }
        this.pack();
    }

    @Override
    public void d(iua iua2) {
        if (this.mzQ != null) {
            this.mzQ.d(iua2);
            this.pack();
            if (iua2.getSelected()) {
                this.cXg();
            }
        }
    }

    public void removeItemAt(int n) {
        this.d(this.SY(n));
    }

    @Override
    public void removeAllItems() {
        if (this.mzQ != null) {
            List<iua> list = this.drp();
            this.mzQ.removeAllItems();
            this.eO(0, 0);
            this.pack();
            if (list != null && !list.isEmpty()) {
                this.cXg();
            }
        }
    }

    @Override
    public void c(Comparator comparator) {
        if (this.mzQ != null) {
            this.mzQ.c(comparator);
        }
    }

    @Override
    public int a(iub iub2) {
        return this.mzQ != null ? this.mzQ.a(iub2) : 0;
    }

    @Override
    public void eR(int n, int n2) {
        if (this.mzQ != null) {
            this.mzQ.eR(n, n2);
        }
    }

    public iua eV(int n, int n2) {
        iph iph2 = (iph)((Object)this.mzQ);
        if (iph2 == null) {
            return null;
        }
        List<ipf> list = iph2.dlv();
        for (ipf ipf2 : list) {
            if (!(ipf2 instanceof iua) || !ipf2.djL() || !ipf2.djS() || !ipf2.dhV() || !ipf2.dF(n - iph2.getX() - ipf2.getX(), n2 - iph2.getY() - ipf2.getY())) continue;
            return (iua)((Object)ipf2);
        }
        return null;
    }

    public iua drT() {
        iph iph2 = (iph)((Object)this.mzQ);
        if (iph2 == null) {
            return null;
        }
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!(ipf2 instanceof iua)) continue;
            return (iua)((Object)ipf2);
        }
        return null;
    }

    public iua drU() {
        iph iph2 = (iph)((Object)this.mzQ);
        if (iph2 == null) {
            return null;
        }
        for (int i = iph2.bfn() - 1; i >= 0; --i) {
            ipf ipf2 = iph2.RO(i);
            if (!(ipf2 instanceof iua)) continue;
            return (iua)((Object)ipf2);
        }
        return null;
    }

    @Override
    public List<iua> drp() {
        return this.mzQ != null ? this.mzQ.drp() : null;
    }

    @Override
    public int drq() {
        return this.mzQ != null ? this.mzQ.drq() : 0;
    }

    public boolean a(iua iua2, iua iua3, boolean bl) {
        iph iph2 = (iph)((Object)this.mzQ);
        if (iph2 == null) {
            return false;
        }
        if (iua2 == null) {
            iua2 = iua3;
        }
        if (iua3 == null) {
            iua3 = iua2;
        }
        if (iua2 == null && iua3 == null) {
            return false;
        }
        if (!(iua2 instanceof ipf)) {
            return false;
        }
        if (!(iua3 instanceof ipf)) {
            return false;
        }
        ipf ipf2 = (ipf)((Object)iua2);
        ipf ipf3 = (ipf)((Object)iua3);
        if (ipf2.getIndexInParent() > ipf3.getIndexInParent()) {
            ipf ipf4 = ipf2;
            ipf2 = ipf3;
            ipf3 = ipf4;
        }
        boolean bl2 = false;
        int n = ipf3.getIndexInParent();
        for (int i = ipf2.getIndexInParent(); i <= n; ++i) {
            iua iua4;
            ipf ipf5 = iph2.RO(i);
            if (!(ipf5 instanceof iua) || (iua4 = (iua)((Object)ipf5)).getSelected() == bl) continue;
            iua4.setSelected(bl);
            bl2 = true;
        }
        return bl2;
    }

    public boolean d(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int n10;
        int n11;
        int n12 = Math.min(n, n5);
        Collection<iua> collection = this.C(n12, n11 = Math.min(n2, n6), (n10 = Math.max(n + n3, n5 + n7)) - n12, (n9 = Math.max(n2 + n4, n6 + n8)) - n11);
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        boolean bl = false;
        for (iua iua2 : collection) {
            if (iua2.u(n - iua2.dik().getX(), n2 - iua2.dik().getY(), n3, n4)) {
                if (iua2.getSelected()) continue;
                iua2.setSelected(true);
                bl = true;
                continue;
            }
            if (!iua2.getSelected()) continue;
            iua2.setSelected(false);
            bl = true;
        }
        return bl;
    }

    public boolean D(int n, int n2, int n3, int n4) {
        Collection<iua> collection = this.C(n, n2, n3, n4);
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        boolean bl = false;
        for (iua iua2 : collection) {
            iua2.setSelected(!iua2.getSelected());
            bl = true;
        }
        return bl;
    }

    public boolean e(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14 = Math.min(n, n5);
        Collection<iua> collection = this.C(n14, n13 = Math.min(n2, n6), n12 = (n11 = Math.max(n + n3 - 1, n5 + n7 - 1)) - n14 + 1, n10 = (n9 = Math.max(n2 + n4 - 1, n6 + n8 - 1)) - n13 + 1);
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        boolean bl = false;
        int n15 = 0;
        int n16 = 0;
        for (Object object = this.drN().dik(); object != this; object = ((ipf)object).djJ()) {
            n15 += ((ipf)object).getX();
            n16 += ((ipf)object).getY();
        }
        for (iua iua2 : collection) {
            boolean bl2 = iua2.u(n5 - n15 - iua2.getX(), n6 - n16 - iua2.getY(), n7, n8);
            boolean bl3 = iua2.u(n - n15 - iua2.getX(), n2 - n16 - iua2.getY(), n3, n4);
            if (bl3 == bl2) continue;
            iua2.setSelected(!iua2.getSelected());
            bl = true;
        }
        return bl;
    }

    @Override
    public Collection<iua> C(int n, int n2, int n3, int n4) {
        return this.mzQ != null ? this.mzQ.C(n, n2, n3, n4) : null;
    }

    @Override
    public iua a(iua iua2, iuk iuk2) {
        return this.mzQ != null ? this.mzQ.a(iua2, iuk2) : null;
    }

    public boolean drV() {
        return this.a(this.drT(), this.drU(), true);
    }

    public boolean drW() {
        return this.a(this.drT(), this.drU(), false);
    }

    public boolean drX() {
        return this.mzU != iun.mAh;
    }

    public iun drY() {
        return this.mzU;
    }

    public void a(iun iun2) {
        this.mzU = iun2;
    }

    public boolean drZ() {
        switch (this.mzU) {
            case mAk: 
            case mAl: {
                return true;
            }
        }
        return false;
    }

    public int dsa() {
        return this.mzQ != null ? Math.max(this.mzQ.drm() - this.mzP.getWidth(), 0) : 0;
    }

    public int dsb() {
        return this.mzQ != null ? Math.max(this.mzQ.drn() - this.mzP.getHeight(), 0) : 0;
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        if (this.mzS != null) {
            this.mzS.kh(f2);
        }
        if (this.mzR != null) {
            this.mzR.kh(f2);
        }
        if (this.mzQ != null) {
            this.mzQ.kh(f2);
        }
    }

    public void e(iua iua2) {
        if (iua2 == null) {
            return;
        }
        ipf ipf2 = (ipf)((Object)iua2);
        if (ipf2.djJ() != this.mzQ) assert (false);
        if (!ipf2.dhV()) {
            this.mzX = ipf2;
            this.dkg();
        } else {
            this.ap(ipf2);
        }
    }

    public int dsc() {
        return this.mzY;
    }

    public void Td(int n) {
        if (n == this.mzY) {
            return;
        }
        this.mzY = n;
        this.pack();
    }

    public int dsd() {
        return this.mzZ;
    }

    public void Te(int n) {
        if (n == this.mzZ) {
            return;
        }
        this.mzZ = n;
        this.pack();
    }

    public static void b(iua iua2, boolean bl) {
        for (ipf ipf2 = iua2.dik(); ipf2 != null; ipf2 = ipf2.djJ()) {
            if (!(ipf2 instanceof iul)) continue;
            ((iul)ipf2).a(iua2, bl);
            return;
        }
    }

    @Override
    public void a(iua iua2, boolean bl) {
        if (this.mzQ != null) {
            this.mzQ.a(iua2, bl);
        }
    }

    public boolean dse() {
        return this.mAc;
    }

    public void sA(boolean bl) {
        this.mAc = bl;
    }

    @Override
    public void cWm() {
        super.cWm();
        if (this.mzX != null) {
            if (this.mzX.djJ() == this.mzQ) {
                this.ap(this.mzX);
            }
            this.mzX = null;
        }
    }

    @Override
    public void eQ(int n, int n2) {
    }

    public void eW(int n, int n2) {
    }

    public void eX(int n, int n2) {
    }

    public void drI() {
    }

    public void o(ipf ipf2) {
    }

    public void ao(ipf ipf2) {
        if (ipf2 == this.mzV) {
            this.mzV = null;
        }
        if (ipf2 == this.mzW) {
            this.mzW = null;
        }
    }

    @Override
    public boolean du(int n, int n2) {
        iua iua2;
        if (super.du(n, n2)) {
            return true;
        }
        this.mzW = iua2 = this.eV(n, n2);
        boolean bl = false;
        switch (this.mzU) {
            case mAi: {
                if (iua2 == null || iua2.getSelected()) break;
                this.mzV = iua2;
                this.drW();
                iua2.setSelected(true);
                bl = true;
                break;
            }
            case mAj: {
                if (iua2 == null) break;
                this.mzV = iua2;
                if (!iua2.getSelected()) {
                    this.drW();
                    iua2.setSelected(true);
                    bl = true;
                    break;
                }
                iua2.setSelected(false);
                bl = true;
                break;
            }
            case mAk: {
                if (hso.cxK().cxR().dIz()) {
                    if (iua2 == null) break;
                    if (this.mzV != null) {
                        bl = this.drW();
                        bl = this.a(iua2, this.mzV, true) && bl;
                        break;
                    }
                    this.mzV = iua2;
                    iua2.setSelected(true);
                    bl = true;
                    break;
                }
                if (hso.cxK().cxR().dMl()) {
                    if (iua2 == null) break;
                    this.mzV = iua2;
                    break;
                }
                if (iua2 == null || iua2.getSelected()) break;
                this.mzV = iua2;
                this.drW();
                iua2.setSelected(true);
                bl = true;
                break;
            }
            case mAl: {
                if (iua2 == null) break;
                this.mzV = iua2;
                iua2.setSelected(!iua2.getSelected());
                bl = true;
            }
        }
        if (iua2 == null && this.drW()) {
            bl = true;
        }
        if (bl) {
            this.cXg();
        }
        return iua2 != null;
    }

    @Override
    public boolean dN(int n, int n2) {
        if (super.dN(n, n2)) {
            return true;
        }
        iua iua2 = this.eV(n, n2);
        boolean bl = false;
        switch (this.mzU) {
            case mAk: {
                if (hso.cxK().cxR().dIz()) break;
                if (hso.cxK().cxR().dMl()) {
                    if (iua2 == null) break;
                    iua2.setSelected(!this.mzV.getSelected());
                    bl = true;
                    break;
                }
                if (iua2 == null || !iua2.getSelected()) break;
                this.mzV = iua2;
                this.drW();
                iua2.setSelected(true);
                bl = true;
            }
        }
        if (bl) {
            this.cXg();
        }
        return iua2 != null;
    }

    @Override
    public boolean eC(int n, int n2) {
        iua iua2;
        if (super.eC(n, n2)) {
            return true;
        }
        this.mzW = iua2 = this.eV(n, n2);
        if (iua2 != null && !iua2.getSelected()) {
            this.mzV = iua2;
            this.drW();
            iua2.setSelected(true);
            this.cXg();
        }
        return iua2 != null;
    }

    @Override
    public hyn dz(int n, int n2) {
        hyn hyn2 = super.dz(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        iua iua2 = this.eV(n, n2);
        if (iua2 != null && !iua2.getSelected()) {
            this.mzV = iua2;
            this.drW();
            iua2.setSelected(true);
            this.cXg();
        }
        return null;
    }

    public void cXg() {
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        boolean bl = jnz3 != jnz.nFE;
        this.sD(bl && this.drk());
        this.sE(bl && this.drj());
    }

    public void sB(boolean bl) {
    }

    public void sC(boolean bl) {
    }

    @Override
    public boolean dx(int n, int n2) {
        if (super.dx(n, n2)) {
            return true;
        }
        List<iua> list = this.drp();
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (iua iua2 : list) {
            if (!(iua2 instanceof ipf)) continue;
            ipf ipf2 = (ipf)((Object)iua2);
            int n3 = n;
            int n4 = n2;
            for (ipf ipf3 = ipf2; ipf3 != this; ipf3 = ipf3.djJ()) {
                n3 -= ipf3.getX();
                n4 -= ipf3.getY();
            }
            if (!ipf2.dF(n3, n4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public ifg dy(int n, int n2) {
        ifg ifg2 = super.dy(n, n2);
        if (ifg2 != null) {
            return ifg2;
        }
        List<iua> list = this.drp();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.by(list);
    }

    public ifg by(List<iua> list) {
        return null;
    }

    @Override
    public boolean c(int n, int n2, float f2) {
        if (super.c(n, n2, f2)) {
            return true;
        }
        this.LO((int)(f2 * (float)(-this.drH())));
        return true;
    }

    @Override
    public boolean qD(String string) {
        if (!this.dse()) {
            return false;
        }
        if (string == "HOME") {
            this.eO(this.drl(), 0);
            this.eQ(this.drl(), this.dnx());
            return true;
        }
        if (string == "END") {
            this.eO(this.drl(), this.drn());
            this.eQ(this.drl(), this.dnx());
            return true;
        }
        if (string == "PRIOR") {
            this.eP(0, this.drH() - this.getHeight());
            this.eQ(this.drl(), this.dnx());
            this.z("PRIOR", true);
            return true;
        }
        if (string == "NEXT") {
            this.eP(0, this.getHeight() - this.drH());
            this.eQ(this.drl(), this.dnx());
            this.z("NEXT", true);
            return true;
        }
        if (string == "LEFT") {
            this.a(this.mzW, iuk.mzJ, hso.cxK().cxR().dIz());
            return true;
        }
        if (string == "UP") {
            this.a(this.mzW, iuk.mzK, hso.cxK().cxR().dIz());
            return true;
        }
        if (string == "RIGHT") {
            this.a(this.mzW, iuk.mzL, hso.cxK().cxR().dIz());
            return true;
        }
        if (string == "DOWN") {
            this.a(this.mzW, iuk.mzM, hso.cxK().cxR().dIz());
            return true;
        }
        return false;
    }

    @Override
    public boolean qV(String string) {
        if (!this.dse()) {
            return false;
        }
        if (string == "PRIOR") {
            this.eP(0, this.drH() - this.getHeight());
            this.eQ(this.drl(), this.dnx());
            return true;
        }
        if (string == "NEXT") {
            this.eP(0, this.getHeight() - this.drH());
            this.eQ(this.drl(), this.dnx());
            return true;
        }
        if (string == "UP") {
            this.eP(0, this.drH());
            this.eQ(this.drl(), this.dnx());
            return true;
        }
        if (string == "DOWN") {
            this.eP(0, -this.drH());
            this.eQ(this.drl(), this.dnx());
            return true;
        }
        return false;
    }

    @Override
    public boolean qU(String string) {
        if (!this.dse()) {
            return false;
        }
        if (string == "PRIOR") {
            this.z("PRIOR", false);
            return true;
        }
        if (string == "NEXT") {
            this.z("NEXT", false);
            return true;
        }
        if (string == "UP") {
            this.z("UP", false);
            return true;
        }
        if (string == "DOWN") {
            this.z("DOWN", false);
            return true;
        }
        return false;
    }

    public void drB() {
    }

    private void dsf() {
        if (this.mzQ == null) {
            return;
        }
        boolean bl = this.drj();
        boolean bl2 = this.drk();
        boolean bl3 = hso.cxK().cxN() == jnz.nFE;
        this.sE(bl && !bl3);
        this.sD(bl2 && !bl3);
        if (!bl) {
            ((ipf)((Object)this.mzQ)).setWidth(this.mzP.getWidth());
        }
        if (!bl2) {
            ((ipf)((Object)this.mzQ)).setHeight(this.mzP.getHeight());
        }
        int n = 0;
        if (bl) {
            n = this.mzQ.drl();
            if (n < 0) {
                n = 0;
            }
            if (n > this.dsa()) {
                n = this.dsa();
            }
        }
        int n2 = 0;
        if (bl2) {
            n2 = this.mzQ.dnx();
            if (n2 < 0) {
                n2 = 0;
            }
            if (n2 > this.dsb()) {
                n2 = this.dsb();
            }
        }
        this.mzQ.eR(this.mzP.getWidth(), this.mzP.getHeight());
        this.mzQ.eO(n, n2);
        if (bl) {
            this.mzS.a(0, this.mzQ.drl(), this.dsa(), 1, Math.max(this.mzP.getWidth(), 1), false);
        }
        if (bl2) {
            this.mzR.a(0, this.mzQ.dnx(), this.dsb(), 1, Math.max(this.mzP.getHeight(), 1), false);
        }
    }

    private void ap(ipf ipf2) {
        int n = ipf2.getX() - this.mzP.getWidth() / 2 + ipf2.getWidth() / 2;
        int n2 = ipf2.getY() - this.mzP.getHeight() / 2 + ipf2.getHeight() / 2;
        this.eO(n, n2);
    }

    private void sD(boolean bl) {
        if (this.mzR != null && this.mzR.djL() != bl) {
            this.mzR.setVisible(bl);
            this.sB(bl);
        }
    }

    private void sE(boolean bl) {
        if (this.mzS != null && this.mzS.djL() != bl) {
            this.mzS.setVisible(bl);
            this.sC(bl);
        }
    }

    private void a(iua iua2, iuk iuk2, boolean bl) {
        if (this.dro() == 0) {
            return;
        }
        if (this.mzU == iun.mAh) {
            return;
        }
        iua iua3 = this.a(iua2, iuk2);
        boolean bl2 = false;
        if (iua3 != null) {
            if (!bl || !this.drZ()) {
                this.drW();
                this.mzV = iua3;
                this.mzW = iua3;
                bl2 = this.a(iua3, iua3, true);
            } else {
                this.drW();
                if (this.mzV == null) {
                    this.mzV = iua3;
                }
                this.mzW = iua3;
                bl2 = this.a(this.mzV, iua3, true);
            }
            this.e(iua3);
        }
        if (bl2) {
            this.cXg();
        }
    }

    static /* synthetic */ int b(iul iul2) {
        return iul2.mzY;
    }

    static /* synthetic */ int c(iul iul2) {
        return iul2.mzZ;
    }

    static /* synthetic */ irt d(iul iul2) {
        return iul2.mzR;
    }

    static /* synthetic */ irt e(iul iul2) {
        return iul2.mzS;
    }

    static /* synthetic */ void f(iul iul2) {
        iul2.dsf();
    }
}

