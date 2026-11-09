/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  hlv
 *  lcy
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class hen
extends hlw
implements hmb {
    public final f keq;
    private final hpx jGG;
    private final hpx ker;
    private final hqd kes;
    private final hpx ket;
    private final hpx keu;
    private final hov kev;
    private final hpe kew;
    private final lbn kex;
    private final lbn key;
    private final lbn kez = new lbn(this){
        final /* synthetic */ hen keH;
        {
            this.keH = hen2;
        }

        public final void W() {
            float f2 = (float)hen.a(this.keH).cum();
            this.keH.jP(f2);
        }
    };
    private final lbn keA = new lbn(this){
        final /* synthetic */ hen keH;
        {
            this.keH = hen2;
        }

        public final void W() {
            this.keH.q(!hen.b(this.keH), true);
        }
    };
    private final lbn jLS = new lbn(this){
        final /* synthetic */ hen keH;
        {
            this.keH = hen2;
        }

        public final void W() {
            if (hen.c(this.keH)) {
                this.keH.nk(true);
            }
        }
    };
    private final lbn keB = new lbn(this){
        final /* synthetic */ hen keH;
        {
            this.keH = hen2;
        }

        public final void W() {
            if (!hen.b(this.keH)) {
                boolean bl = this.keH.cfG();
                if (!bl) {
                    this.keH.r(true, false);
                }
                this.keH.q(true, false);
                this.keH.q(false, false);
            }
        }
    };
    private final lbn keC = new lbn(this){
        final /* synthetic */ hen keH;
        {
            this.keH = hen2;
        }

        public final void W() {
            hen.d(this.keH);
        }
    };
    private boolean Initialized;
    private lip iKP;
    private boolean keD = true;
    private hmn keE;
    private float keF = 1.0f;
    private boolean keG = true;

    public hen(hdm hdm2, String string, lgg lgg2, lhf lhf2, f f2, hnu.b ... bArray) {
        this(hdm2, string, lgg2, lhf2, f2, true, hen.a(bArray));
    }

    private hen(hdm hdm2, String string, lgg lgg2, lhf lhf2, f f2, boolean bl, List<hnu.b> list) {
        this(hdm2, string, lgg2, lhf2, f2, list);
        assert (lda.yk(bl));
        assert (list.size() == 0);
    }

    protected hen(hdm hdm2, String string, lgg lgg2, lhf lhf2, f f2, List<hnu.b> list) {
        super((hlv)hdm2, string, lgg2, lhf2, f2.keL, list);
        lip lip2 = null;
        lbn lbn2 = null;
        lbn lbn3 = null;
        boolean bl = false;
        boolean bl2 = false;
        Iterator<hnu.b> iterator = list.iterator();
        while (iterator.hasNext()) {
            hnu.b b2 = iterator.next();
            if (b2 instanceof d) {
                lip2 = ((d)b2).iKP;
            } else if (b2 instanceof a) {
                lbn2 = ((a)b2).keI;
            } else if (b2 instanceof b) {
                lbn3 = ((b)b2).keI;
            } else if (b2 instanceof c) {
                bl = ((c)b2).keJ;
            } else {
                if (!(b2 instanceof e)) continue;
                bl2 = ((e)b2).keK;
            }
            iterator.remove();
        }
        this.keq = f2;
        this.iKP = lip2;
        this.kex = lbn2;
        this.key = lbn3;
        if (lip2 != null) {
            this.kev = new hov(this.kLu, null, lgg.rlI, lhf.rnv);
            this.j(this.kev);
            this.kew = new hpe(this.kLu, null, lgg.rlI, lhf.rnv, hdm2.kIU, this.iKP.esy());
            this.kev.j(this.kew);
        } else {
            this.kev = null;
            this.kew = null;
        }
        if (this.kgj != null) {
            this.jGG = new hqz(this.kLu, null, lgg.rlI, null, hpx.a.kXm, hdm2.kJH, hdm2.kIn.kGN);
            this.jGG.cvC().a(true, this.kgj);
            this.j(this.jGG);
        } else {
            this.jGG = null;
        }
        if (bl) {
            this.ker = new hra(this.kLu, (String)null, lgg.rlI, hdm2.kKh.kZW.kLY, hdm2.kKh);
            this.ker.cvC().a(true, this.keA);
            this.j(this.ker);
            this.ker.on(this.keD);
        } else {
            this.ker = null;
        }
        if (bl2) {
            this.kes = new hqd(this.kLu, null, lgg.rlI, hdm2.kIn.kGR.kLY, hdm2.kKj, hdm2.kIn.kGR, 0.3, 1.0, true, this.keF, 0.01, this.kez);
            this.j(this.kes);
        } else {
            this.kes = null;
        }
        if (this.kex != null) {
            this.ket = new hqz(this.kLu, null, lgg.rlI, null, hpx.a.kXm, hdm2.kJH, hdm2.kIn.kGZ);
            this.ket.cvC().a(true, this.kex);
            this.j(this.ket);
        } else {
            this.ket = null;
        }
        if (this.key != null) {
            this.keu = new hqz(this.kLu, null, lgg.rlI, null, hpx.a.kXm, hdm2.kJH, hdm2.kIn.kGQ);
            this.keu.cvC().a(true, this.key);
            this.j(this.keu);
        } else {
            this.keu = null;
        }
    }

    public void cfD() {
        this.ker.cqF();
        this.kes.cqF();
    }

    public final boolean cfE() {
        return this.keD;
    }

    public final void q(boolean bl, boolean bl2) {
        if (bl == this.keD) {
            return;
        }
        this.keD = bl;
        if (this.Initialized) {
            this.nk(bl2);
        }
    }

    public final boolean f(lip lip2) {
        if (lip2.i(this.iKP)) {
            return false;
        }
        this.iKP = lip2;
        if (this.kew != null) {
            this.kew.mV(this.iKP.esy());
        }
        return true;
    }

    public final f cfF() {
        return this.keq;
    }

    public final void r(boolean bl, boolean bl2) {
        if (this.keE == null) {
            assert (bl);
            return;
        }
        this.keE.t(bl, bl2);
    }

    public final boolean cfG() {
        if (this.keE == null) {
            return true;
        }
        return this.keE.csJ();
    }

    public final float cfH() {
        return this.keF;
    }

    public final boolean jP(float f2) {
        if (ldq.ai(f2, this.keF)) {
            return false;
        }
        this.keF = f2;
        this.cfO();
        return true;
    }

    public final boolean a(hms hms2) {
        if (hms2 == null) {
            return false;
        }
        return hms2 == this.jGG || hms2 == this.ker || hms2 == this.kes;
    }

    public final void cfI() {
        this.cbO().jZG.a(this, this.kLu.crN());
    }

    @Override
    public final void cbJ() {
    }

    @Override
    public final void cbK() {
    }

    @Override
    public final boolean a(hmt hmt2, boolean bl) {
        assert (lda.by(hmt2));
        if (!bl) {
            lgg lgg2 = this.cbO().jZG.cpP();
            this.z(lgg2);
            hoc hoc2 = (hoc)hmt2;
            hoc2.b(this);
        }
        return true;
    }

    @Override
    public final void cbL() {
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.nk(false);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.q(true, false);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcq cfJ() {
        if (this.kew != null && this.kew.isInitialized()) {
            if (this.isFocusOwner()) {
                this.kew.a(this.cbO().kIV);
            } else {
                this.kew.a(this.cbO().kIU);
            }
        }
        return super.cfJ();
    }

    @Override
    protected void cfK() {
        super.cfK();
        if (this.iKP != null) {
            lgs lgs2 = this.cqE();
            lgs2 = lgs2.gc(-this.keq.keM.cf, -this.keq.keM.cg);
            lgs2.H = 16;
            this.kev.j(lgs2);
            lgs2 = new lgs(lgg.rlI, lgs2.cqv());
            this.kew.j(lgs2);
        }
        int n = this.getWidth();
        int n2 = 0;
        if (this.keq.keN != null) {
            n -= -this.keq.keN.cf;
            n2 -= -this.keq.keN.cg;
        }
        if (this.keG && this.jGG != null) {
            this.jGG.cB(n -= this.jGG.getWidth(), n2);
            n -= -this.keq.keO;
        }
        if (this.keG && this.ker != null) {
            this.ker.cB(n -= this.ker.getWidth(), n2);
            n -= -this.keq.keO;
        }
        if (this.keG && this.ket != null) {
            this.ket.cB(n -= this.ket.getWidth(), n2);
            n -= -this.keq.keO;
        }
        if (this.keG && this.keu != null) {
            this.keu.cB(n -= this.keu.getWidth(), n2);
            n -= -this.keq.keO;
        }
        if (this.keG && this.kes != null) {
            this.kes.cB(n -= this.kes.getWidth(), n2);
            n -= -this.keq.keO;
        }
    }

    public void nj(boolean bl) {
        this.keG = bl;
    }

    public void cm(int n, int n2) {
        if (this.ker != null) {
            this.ker.cB(n, n2);
        }
    }

    public void cn(int n, int n2) {
        if (this.ker != null) {
            this.kes.cB(n, n2);
        }
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        if (this.jGG != null && this.jGG.cqQ()) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qYS.esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        if (this.ker != null && this.ker.cqQ()) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qYT.esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        if (this.keu != null && this.keu.cqQ()) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qYU.esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        if (this.kes != null && this.kes.cqQ()) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qYV.esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }

    @Override
    protected void a(boolean bl, hms hms2, int n) {
        super.a(bl, hms2, n);
        if (this.keE != null) {
            this.keE.a(bl, hms2);
        }
    }

    @Override
    protected boolean cfL() {
        if (!super.cfL()) {
            return false;
        }
        if (!this.cbO().jZG.cpQ()) {
            hms hms2 = this.cbO().jZG.cpL();
            return hms2 == this;
        }
        return true;
    }

    @Override
    protected void cfM() {
        if (this.cbO().jZG.cpQ()) {
            this.cbO().jZG.a(this, this.kLu.crN());
        }
    }

    @Override
    protected float cfN() {
        return this.cbO().p(this.keD, this.cpG()) * this.keF;
    }

    protected void nk(boolean bl) {
        assert (this.Initialized);
        boolean bl2 = this.cbO().cdw();
        if (this.keD) {
            if (this.keE != null) {
                this.keE.t(bl2 || this.keD, false);
                this.keE.dispose();
                this.keE = null;
            }
        } else {
            if (this.keE == null) {
                this.keE = this.cbO().a((hpv)this);
            }
            this.keE.t(bl2 || this.keD, bl);
        }
        if (this.ker != null) {
            this.ker.on(this.keD);
        }
        this.cjQ();
    }

    protected void cfO() {
        if (this.kes != null) {
            this.kes.cW(this.keF);
        }
        this.cjQ();
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    protected static final List<hnu.b> a(hnu.b[] bArray) {
        return new ArrayList<hnu.b>(Arrays.asList(bArray));
    }

    protected static final List<hnu.b> a(List<hnu.b> list, hnu.b ... bArray) {
        for (hnu.b b2 : bArray) {
            list.add(b2);
        }
        return list;
    }

    private void mU(boolean bl) {
        this.cbO().jZL.ccP().cec().a(bl, this.keB);
        this.cbO().jZL.ccW().cec().a(bl, this.keC);
        this.cbO().jZL.ccX().cec().a(bl, this.keC);
        this.cbO().cdu().a(bl, this.jLS);
    }

    static /* synthetic */ hqd a(hen hen2) {
        return hen2.kes;
    }

    static /* synthetic */ boolean b(hen hen2) {
        return hen2.keD;
    }

    static /* synthetic */ boolean c(hen hen2) {
        return hen2.Initialized;
    }

    static /* synthetic */ void d(hen hen2) {
        hen2.cjQ();
    }
}

