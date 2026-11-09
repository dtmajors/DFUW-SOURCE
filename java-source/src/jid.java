/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class jid {
    public final jll<aim> ngu = new jll();
    public final jll<aim> ngv = new jll();
    public final jll<aim> ngw = new jll();
    public final jll<jhx> ngx = new jll();
    public final jll<jic> ngy = new jll();
    private static jid ngz;
    private Map<Integer, aim> ngA = lcn.emw();
    private Map<Integer, aim> ngB = lcn.emw();
    private Map<ain, jhx> ngC = lcn.emw();
    private List<jhy> ngD = lcn.emv();
    private Map<ain, jhy> ngE = lcn.emw();
    private Map<ain, jic> ngF = lcn.emw();

    public static jid dHb() {
        if (ngz == null) {
            ngz = new jid();
            ngz.dHd();
        }
        return ngz;
    }

    public boolean UJ(int n) {
        return this.ngA.containsKey(n);
    }

    public boolean UK(int n) {
        for (civ civ2 : lea.epC().values()) {
            cix cix2;
            if (!(civ2 instanceof cix) || !(cix2 = (cix)civ2).aPM() || cix2.aPL() != n) continue;
            return this.UJ(cix2.az());
        }
        return false;
    }

    public aim UL(int n) {
        return this.ngA.get(n);
    }

    public void a(aim aim2) {
        int n = aim2.az();
        if (this.ngA.containsKey(n)) {
            return;
        }
        this.ngA.put(n, aim2);
        jhx jhx2 = this.a(aim2.BP(), aim2.az());
        if (jhx2 != null) {
            jhx2.a(jia.ngo);
        }
        this.ngu.V(aim2);
        if (aim2.isSelected()) {
            this.ngB.put(aim2.az(), aim2);
            if (jhx2 != null) {
                this.ngC.put(aim2.BP(), jhx2);
                jhx2.a(jia.ngp);
                jic jic2 = this.ngF.get((Object)aim2.BP());
                if (jic2 != null) {
                    jic2.d(aim2);
                }
            }
        }
    }

    public void bF(List<aim> list) {
        for (aim aim2 : list) {
            this.a(aim2);
        }
    }

    public boolean c(ain ain2) {
        jic jic2 = this.ngF.get((Object)ain2);
        return jic2 != null ? jic2.isActive() : false;
    }

    public boolean e(aim aim2) {
        return this.ngB.containsKey(aim2.az());
    }

    public void f(aim aim2) {
        Object object;
        assert (this.UJ(aim2.az()));
        if (this.ngB.containsKey(aim2.az())) {
            return;
        }
        jic jic2 = this.ngF.get((Object)aim2.BP());
        if (jic2 != null && (object = jic2.dHa()) != null) {
            this.g((aim)object);
        }
        this.ngB.put(aim2.az(), aim2);
        object = this.a(aim2.BP(), aim2.az());
        if (object != null) {
            this.ngC.put(aim2.BP(), (jhx)object);
            ((jhx)object).a(jia.ngp);
            jic jic3 = this.ngF.get((Object)aim2.BP());
            if (jic3 != null) {
                jic3.d(aim2);
            }
        }
        this.ngv.V(aim2);
    }

    public void g(aim aim2) {
        if (this.ngB.remove(aim2.az()) == null) {
            return;
        }
        jhx jhx2 = this.a(aim2.BP(), aim2.az());
        if (jhx2 != null) {
            this.ngC.remove((Object)aim2.BP());
            jhx2.a(jia.ngo);
            jic jic2 = this.ngF.get((Object)aim2.BP());
            if (jic2 != null) {
                jic2.d(null);
            }
        }
        this.ngw.V(aim2);
    }

    public List<jhy> dHc() {
        return Collections.unmodifiableList(this.ngD);
    }

    public jhx a(ain ain2, int n) {
        jhy jhy2 = this.ngE.get((Object)ain2);
        return jhy2 != null ? jhy2.UI(n) : null;
    }

    public jhx d(ain ain2) {
        return this.ngC.get((Object)ain2);
    }

    public jhy e(ain ain2) {
        return this.ngE.get((Object)ain2);
    }

    private jid() {
    }

    private void dHd() {
        this.a(ain.bnr, true, lyy.tMm, lyy.tMA, lyy.tMN);
        this.a(ain.bns, true, lyy.tMr, lyy.tMF, lyy.tMS);
        this.a(ain.bnt, true, lyy.tMs, lyy.tMG, lyy.tMT);
        this.a(ain.bnu, true, lyy.tMt, lyy.tMH, lyy.tMU);
        this.a(ain.bnv, true, lyy.tMu, lyy.tMI, lyy.tMV);
        this.a(ain.bnw, true, lyy.tMv, lyy.tMJ, lyy.tMW);
        this.a(ain.bnx, true, lyy.tMw, lyy.tMK, lyy.tMX);
        this.a(ain.bnz, true, lyy.tMq, lyy.tME, lyy.tMR);
        this.a(ain.bny, true, lyy.tMp, lyy.tMD, lyy.tMQ);
        this.a(ain.bnB, true, lyy.tMo, lyy.tMC, lyy.tMP);
        this.a(ain.bnA, true, lyy.tMn, lyy.tMB, lyy.tMO);
        this.a(ain.bnC, true, lyy.tMl, lyy.tMz, lyy.tMM);
        this.a(ain.bnD, false, lyy.tMk, lyy.tMy, lyy.tML);
    }

    private void a(ain ain2, boolean bl, lox lox2, lox lox3, lox lox4) {
        jhy jhy2 = new jhy(ain2, bl, lox2, lox3, lox4);
        this.ngD.add(jhy2);
        this.ngE.put(ain2, jhy2);
        if (bl) {
            jic jic2 = new jic(ain2);
            this.ngF.put(ain2, jic2);
        }
    }
}

