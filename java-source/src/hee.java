/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hee {
    protected static hbe jzX = hbe.jAM;
    protected final lha<dxq, dxq> cdh;
    protected final hjr kcj;
    private final ldl kdv = new ldl();
    private final ldl kdw = new ldl();
    private final ldl kdx = new ldl();
    private final ldl kdy = new ldl();
    private final hdh kdz = new hdh();
    private final ldl kaX = new ldl();
    private final ldl kdA = new ldl();
    protected final Set<hdu> kdB = new HashSet<hdu>();
    public final String jLK;
    public final heg kdC;
    public final hdz kdD;
    public final hdz kdE;
    public final bqm.b kdF;
    public final boolean kdG;
    private final lip kdH;
    public final boolean kdI;
    public final lbn kau = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hee kdS;
        {
            this.kdS = hee2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hee.d(this.kdS)) {
                throw new AssertionError();
            }
            if (hee.e(this.kdS) != null) {
                this.kdS.cfe();
            } else {
                this.kdS.cfd();
            }
        }

        static {
            $assertionsDisabled = !hee.class.desiredAssertionStatus();
        }
    };
    public final lbn kdJ = new lbn(this){
        final /* synthetic */ hee kdS;
        {
            this.kdS = hee2;
        }

        public final void W() {
            hee.f(this.kdS);
        }
    };
    public final lbn kdK = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hee kdS;
        {
            this.kdS = hee2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hee.d(this.kdS)) {
                throw new AssertionError();
            }
            hee.g(this.kdS);
        }

        static {
            $assertionsDisabled = !hee.class.desiredAssertionStatus();
        }
    };
    public final lbn kdL = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hee kdS;
        {
            this.kdS = hee2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hee.d(this.kdS)) {
                throw new AssertionError();
            }
            hee.h(this.kdS);
        }

        static {
            $assertionsDisabled = !hee.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private float kdM;
    private float kdN;
    private hdu kdO;
    private boolean kdP;
    public a kdQ;
    private b kdR;
    private lip kbJ;

    public hee(String string, lha<dxq, dxq> lha2, hjr hjr2, heg heg2, hdz hdz2, hdz hdz3, bqm.b b2, lip lip2, boolean bl) {
        this.jLK = string;
        this.cdh = lha2;
        this.kcj = hjr2;
        this.kdC = heg2 == null ? (heg)this : heg2;
        this.kdD = hdz2;
        this.kdE = hdz3;
        this.kdF = b2;
        this.kdH = lip2;
        this.kdG = bl;
        this.kdI = this.kdF != bqm.b.dEN;
        this.jLT = true;
        this.nb(true);
        this.cfp();
    }

    public final boolean isConstructed() {
        return this.jLT;
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final lip cdY() {
        return this.kbJ;
    }

    public final void ceV() {
        this.kdQ = new a(this);
    }

    public final boolean ceW() {
        switch (this.kdC.kdF) {
            case dEo: {
                return true;
            }
            case dEp: {
                return true;
            }
            case dEs: {
                return true;
            }
            case dEJ: {
                return true;
            }
            case dEt: {
                return false;
            }
            case dEu: {
                return false;
            }
            case dEv: {
                return false;
            }
            case dEw: {
                return false;
            }
            case dEx: {
                return false;
            }
            case dEy: {
                return false;
            }
            case dEz: {
                return false;
            }
            case dEH: {
                return false;
            }
            case dEn: {
                switch (this.kdF) {
                    case dEn: {
                        return true;
                    }
                    case dEP: {
                        return true;
                    }
                }
                break;
            }
        }
        return false;
    }

    public final lbl<lbn> ceX() {
        assert (this.jLT);
        return this.kdv;
    }

    public final lbl<lbn> ceY() {
        assert (this.jLT);
        return this.kdw;
    }

    public final lbl<lbn> ceZ() {
        assert (this.jLT);
        return this.kdx;
    }

    public final lbl<lbn> cfa() {
        assert (this.jLT);
        return this.kdy;
    }

    public final lbl<hbx> cfb() {
        assert (this.jLT);
        return this.kdz;
    }

    public final lbl<lbn> ceb() {
        assert (this.jLT);
        return this.kaX;
    }

    public final lbl<lbn> cfc() {
        assert (this.jLT);
        return this.kdA;
    }

    public final boolean isActive() {
        assert (this.jLT);
        return this.kdO != null;
    }

    public final void cfd() {
        assert (this.jLT);
        assert (this.kdO == null);
        this.cdh.rnh.m(flt.b(this.cdh.rng, this.kdC.kdD.dbx, this.kdD.dbx));
    }

    public final void cfe() {
        if (!this.jLT) {
            return;
        }
        if (this.kdO == null) {
            return;
        }
        this.cdh.rnh.m(gnw.n(this.cdh.rng, this.kdO.dbx));
        if (this.kdR == null) {
            this.kdR = new b(this, null);
            double d2 = 2.0;
            this.kdR.QM = this.kcj.kAz.emb() + d2;
            this.kdR.kdU = this.kcj.kAz.emd() + (int)(d2 * 10.0);
            this.kcj.kAz.eme().a(true, this.kdL);
        }
    }

    public final void cff() {
        assert (this.jLT);
        if (this.kdO == null) {
            return;
        }
        this.cdh.rnh.m(flr.k(this.cdh.rng, this.kdO.dbx));
    }

    public final void c(hdz hdz2) {
        assert (this.jLT);
        assert (hdz2 != null);
        boolean bl = this.kdO != null;
        this.kdO = hdz2;
        if (bl) {
            if (this.kdR != null) {
                this.cfn();
            }
            this.kdw.enp();
        } else {
            lin.a(true, this.cdh, this.kdO.dbx, 1, hec.b.kdr.ordinal());
            this.cdh.rnh.m(flr.k(this.cdh.rng, this.kdO.dbx));
            this.kdP = false;
        }
    }

    public final void cfg() {
        if (!this.jLT) {
            return;
        }
        assert (this.kdO != null);
        this.cdh.rnh.m(fvv.e(this.cdh.rng, this.kdO.dbx, 1));
        this.kdO = null;
        this.kdP = false;
        if (this.kdR != null) {
            this.cfn();
        }
        this.kdx.enp();
    }

    public final void l(Collection<hdu> collection) {
        this.a(collection, this.kdM, this.kdN);
    }

    public final void a(Collection<hdu> collection, float f2, float f3) {
        if (this.kdP) {
            // empty if block
        }
        assert (this.jLT);
        if (f2 != this.kdM) {
            this.kdM = f2;
        }
        if (f3 != this.kdN) {
            this.kdN = f3;
        }
        Iterator<hdu> iterator = this.kdB.iterator();
        while (iterator.hasNext()) {
            hdu hdu2 = iterator.next();
            if (!collection.contains(hdu2)) {
                iterator.remove();
                assert (!this.kdB.contains(hdu2));
                this.h(hdu2);
                continue;
            }
            boolean bl = collection.remove(hdu2);
            assert (bl);
        }
        for (hdu hdu2 : collection) {
            assert (!this.kdB.contains(hdu2));
            this.kdB.add(hdu2);
            this.g(hdu2);
        }
        this.cfk();
        if (!this.kdP && this.kdO != null) {
            this.kdP = true;
            this.kdv.enp();
        }
    }

    public final boolean d(hdu hdu2) {
        assert (this.jLT);
        return this.kdB.contains(hdu2);
    }

    public final Collection<hdu> cfh() {
        assert (this.jLT);
        return this.cfl();
    }

    public final float cfi() {
        assert (this.jLT);
        return this.kdM;
    }

    public final float cfj() {
        assert (this.jLT);
        return this.kdN;
    }

    public final boolean c(hee hee2) {
        return this.kdD.b(hee2.kdD);
    }

    public final void a(hdz hdz2, String string) {
        ldv ldv2 = hdz2.ceD();
        this.cdh.rnh.m(fld.a(this.cdh.rng, ldv2, hdz2.dbx, string));
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        if (object instanceof hee) {
            return this.c((hee)object);
        }
        assert (false);
        return false;
    }

    public int hashCode() {
        return this.kdD.hashCode();
    }

    protected void cbg() {
        assert (this.jLT);
        if (this.kdR != null) {
            this.cfn();
        }
        this.kaX.enp();
        this.nb(false);
        assert (this.kdz.isEmpty());
        assert (this.kdy.isEmpty());
        assert (this.kdv.isEmpty());
        assert (this.kdw.isEmpty());
        assert (this.kdx.isEmpty());
        assert (this.kaX.isEmpty());
        this.jLT = false;
    }

    protected void e(hdu hdu2) {
        assert (this.jLT);
    }

    protected void f(hdu hdu2) {
        assert (this.jLT);
    }

    protected void cfk() {
        this.kdy.enp();
    }

    protected Collection<hdu> cfl() {
        return Collections.unmodifiableCollection(this.kdB);
    }

    private void g(hdu hdu2) {
        if (hdu2.kbb++ == 0) {
            this.e(hdu2);
        }
        this.kdz.b(hbx.a.jEy, hdu2);
    }

    private void h(hdu hdu2) {
        if (--hdu2.kbb == 0) {
            this.f(hdu2);
        }
        this.kdz.b(hbx.a.jEz, hdu2);
    }

    private void cfm() {
        assert (this.kdR != null);
        if (this.kcj.kAz.emd() > this.kdR.kdU && this.kcj.kAz.emb() > this.kdR.QM) {
            this.cfn();
            if (this.isActive()) {
                this.cfg();
            }
        }
    }

    private void cfn() {
        assert (this.kdR != null);
        this.kcj.kAz.eme().a(false, this.kdL);
        this.kdR = null;
    }

    private void cdV() {
        assert (this.jLT);
        if (this.kdO != null) {
            this.cfe();
            this.cfg();
        }
        this.dispose();
    }

    private void cfo() {
        assert (this.jLT);
        if (this.cfp()) {
            this.kdA.enp();
        }
    }

    private boolean cfp() {
        lip lip2;
        lip lip3 = this.kdH;
        if (this.kdD.ceB().auU() && (lip2 = this.kdD.ced()) != null && !lip2.esy().isEmpty()) {
            lip3 = lip2;
        }
        if (!lin.i(lip3, this.kbJ)) {
            this.kbJ = lip3;
            return true;
        }
        return false;
    }

    private final void nb(boolean bl) {
        this.kcj.a(bl, this);
        this.kdD.ceb().a(bl, this.kdJ);
        this.kdD.cec().a(bl, this.kdK);
    }

    static /* synthetic */ boolean d(hee hee2) {
        return hee2.jLT;
    }

    static /* synthetic */ hdu e(hee hee2) {
        return hee2.kdO;
    }

    static /* synthetic */ void f(hee hee2) {
        hee2.cdV();
    }

    static /* synthetic */ void g(hee hee2) {
        hee2.cfo();
    }

    static /* synthetic */ void h(hee hee2) {
        hee2.cfm();
    }
}

