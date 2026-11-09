/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;

public class hjl {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hjh kck;
    private final hjg kce;
    private final ldl kzp = new ldl();
    private final ldl kzq = new ldl();
    private final lbi<gao> kzr = new lbi<gao>(this){
        final /* synthetic */ hjl kzw;
        {
            this.kzw = hjl2;
        }

        public void b(gao gao2) {
            hjl.a(this.kzw, gao2.aO(), gao2.fBc, gao2.fyj);
        }

        public /* synthetic */ void m(Object object) {
            this.b((gao)object);
        }
    };
    private final lbn kzs = new lbn(this){
        final /* synthetic */ hjl kzw;
        {
            this.kzw = hjl2;
        }

        public final void W() {
            hjl.a(this.kzw);
        }
    };
    private ldv kzt;
    private hdx[] kzu;
    private hdw kaF;
    private boolean kzv;

    public hjl(lha<dxq, dxq> lha2, hjh hjh2, hjg hjg2) {
        this.cdh = lha2;
        this.kck = hjh2;
        this.kce = hjg2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kzp.isEmpty());
    }

    public final boolean d(gbb gbb2) {
        if (this.kzt == null) {
            return false;
        }
        if (!gbb2.aO().equals(this.kzt)) {
            return false;
        }
        this.kzu = null;
        this.kaF = null;
        this.kzp.enp();
        return true;
    }

    public final boolean cnD() {
        return this.kzu != null;
    }

    public final hdx[] cnE() {
        assert (this.cnD());
        return this.kzu;
    }

    public final hdw cdQ() {
        assert (this.cnD());
        return this.kaF;
    }

    public final boolean a(lij<hdw> lij2, hea hea2, hdw hdw2) {
        hdw hdw3 = lij2.ab(hdw2);
        if (hdw3 == null) {
            return this.a(hea2, hdw2);
        }
        while (hdw3 != null) {
            if (this.a(lij2, hea2, hdw3)) {
                return true;
            }
            hdw3 = lij2.ac(hdw3);
        }
        return false;
    }

    @Deprecated
    public final boolean a(hea hea2, hdw hdw2) {
        if (hea2 == null || hdw2 == null) {
            return false;
        }
        if (!hea2.b(hdw2)) {
            return false;
        }
        ctu ctu2 = hdw2.mO(hea2.ceH().zg());
        if (ctu2 == null) {
            return false;
        }
        ctm[] ctmArray = hea2.e(ctu2);
        assert (ctmArray != null);
        int[] nArray = hea2.a(ctu2);
        assert (nArray != null);
        assert (ctmArray.length == nArray.length) : ctmArray.length;
        for (int i = 0; i < ctmArray.length; ++i) {
            if (nArray[i] >= ctmArray[i].asi) continue;
            return false;
        }
        return true;
    }

    public final void cnF() {
        gbc gbc2 = gbc.m(this.cdh.rng, this.kck.hC);
        gbc2.jcM = true;
        this.cdh.rnh.m(gbc2);
    }

    public final lbl<lbn> cnG() {
        return this.kzp;
    }

    public final lbl<lbn> cnH() {
        return this.kzq;
    }

    public final void a(hdx hdx2, hdw hdw2, int n) {
        gjt gjt2 = gjt.e(this.cdh.rng);
        gjt2.SkillType = hdx2.Type;
        gjt2.aZF = 16;
        gjt2.fZd = hdw2.Type;
        gjt2.fZe = n;
        gjt2.on(this.kck.hC);
        this.cdh.rnh.m(gjt2);
    }

    public final boolean cnI() {
        return this.kzv;
    }

    private void a(ldv ldv2, int[] nArray, int n) {
        assert (this.kzu == null);
        this.kzt = ldv2;
        LinkedList<hdx> linkedList = new LinkedList<hdx>();
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            hdx hdx2 = hdx.LX(n2);
            linkedList.add(hdx2);
        }
        this.kzu = new hdx[linkedList.size()];
        linkedList.toArray(this.kzu);
        this.kaF = hdw.LW(n);
        this.kzp.enp();
    }

    private void cip() {
        boolean bl = false;
        hcf hcf2 = this.kce.cmX();
        if (hcf2.jFl && hcf2.jFk.kaW.b(hdx.kbH)) {
            bl = true;
        }
        if (bl != this.kzv) {
            this.kzv = bl;
            this.kzq.enp();
        }
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, gao.class, this.kzr);
        this.kce.cmW().a(bl, this.kzs);
    }

    static /* synthetic */ void a(hjl hjl2, ldv ldv2, int[] nArray, int n) {
        hjl2.a(ldv2, nArray, n);
    }

    static /* synthetic */ void a(hjl hjl2) {
        hjl2.cip();
    }
}

