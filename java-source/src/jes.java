/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jes {
    private jem mVP;
    private jeo[][] mVQ = new jeo[jep.values().length][];
    private jeq[] mVR;

    public jes(jem jem2) {
        for (jep jep2 : jep.values()) {
            this.mVQ[jep2.ordinal()] = new jeo[jeq.values().length];
            for (jeq jeq2 : jeq.values()) {
                this.mVQ[jep2.ordinal()][jeq2.ordinal()] = new jeo(this, jep2, jeq2);
            }
        }
        this.mVR = new jeq[jep.values().length];
        this.mVP = jem2;
        this.mVP.dzB().mUR.a((jlg<Integer, Float>)new jls<jes, Integer, Float>(this, this){
            final /* synthetic */ jes mVS;
            {
                this.mVS = jes2;
                super(jes3);
            }

            public void b(jes jes2, Integer n, Float f) {
                jes.a(jes2, n, f);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jes)object, (Integer)object2, (Float)object3);
            }
        });
        jem2.dzB().mUP.c((jlf<jeo>)new jlr<jes, jeo>(this, this){
            final /* synthetic */ jes mVS;
            {
                this.mVS = jes2;
                super(jes3);
            }

            public void a(jes jes2, jeo jeo2) {
                jes2.dzV().dzB().mUZ.dLF();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jes)object, (jeo)object2);
            }
        });
        jem2.dzB().mUQ.a((jlg<jep, jeq>)new jls<jes, jep, jeq>(this, this){
            final /* synthetic */ jes mVS;
            {
                this.mVS = jes2;
                super(jes3);
            }

            public void a(jes jes2, jep jep2, jeq jeq2) {
                jes2.dzV().dzB().mUZ.dLF();
            }
        });
    }

    public jem dzV() {
        return this.mVP;
    }

    public jeo b(jep jep2, jeq jeq2) {
        return this.mVQ[jep2.ordinal()][jeq2.ordinal()];
    }

    public jeo e(jep jep2) {
        for (jeq jeq2 : jeq.values()) {
            if (this.mVR[jep2.ordinal()] != jeq2) continue;
            return this.mVQ[jep2.ordinal()][jeq2.ordinal()];
        }
        return null;
    }

    public jeo f(jep jep2) {
        for (jeq jeq2 : jeq.values()) {
            jeo jeo2 = this.mVQ[jep2.ordinal()][jeq2.ordinal()];
            jer jer2 = jeo2.dzQ();
            if (jer2 != jer.mVN) continue;
            return jeo2;
        }
        return null;
    }

    public List<jeo> dzW() {
        ArrayList<jeo> arrayList = lcn.emv();
        for (jep jep2 : jep.values()) {
            jeo jeo2 = this.f(jep2);
            if (jeo2 == null) continue;
            arrayList.add(jeo2);
        }
        return arrayList;
    }

    public int a(jeq jeq2) {
        int n = 0;
        for (jep jep2 : jep.values()) {
            if (!this.mVQ[jep2.ordinal()][jeq2.ordinal()].dzR()) continue;
            ++n;
        }
        return n;
    }

    public jeq g(jep jep2) {
        return this.mVR[jep2.ordinal()];
    }

    public void c(jep jep2, jeq jeq2) {
        if (this.mVR[jep2.ordinal()] == jeq2) {
            return;
        }
        this.mVR[jep2.ordinal()] = jeq2;
        if (jeq2 != null) {
            jeo jeo2 = this.b(jep2, jeq2);
            jeo2.a(jer.mVN);
        }
        jen.dzL().mUQ.k(jep2, jeq2);
    }

    public boolean h(jep jep2) {
        for (jeq jeq2 : jeq.values()) {
            jeo jeo2 = this.mVQ[jep2.ordinal()][jeq2.ordinal()];
            if (jeo2.dzQ() != jer.mVN) continue;
            return true;
        }
        return false;
    }

    public boolean b(jeo jeo2) {
        return this.mVR[jeo2.dzO().ordinal()] == jeo2.dzP();
    }

    public boolean i(jep jep2) {
        jeo jeo2 = this.f(jep2);
        return jeo2 != null ? this.mVR[jep2.ordinal()] != jeo2.dzP() : this.mVR[jep2.ordinal()] != null;
    }

    public boolean dzG() {
        jeq[] jeqArray = this.mVR;
        jeo[][] jeoArray = this.mVQ;
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < jeoArray.length; ++i) {
            jeo[] jeoArray2 = jeoArray[i];
            jeq jeq2 = this.mVR[i];
            if (jeq2 != null) {
                ++n2;
            }
            for (jep jep2 : jep.values()) {
                jeo jeo2 = jeoArray2[jep2.ordinal()];
                if (jeo2.dzQ() != jer.mVN) continue;
                ++n;
                if (jeo2.dzP() == jeqArray[i]) continue;
                return true;
            }
        }
        return n != n2;
    }

    public void d(jep jep2, jeq jeq2) {
        if (jeq2 != null) {
            this.mVQ[jep2.ordinal()][jeq2.ordinal()].a(jer.mVN);
        } else {
            for (jeq jeq3 : jeq.values()) {
                jeo jeo2 = this.mVQ[jep2.ordinal()][jeq3.ordinal()];
                if (jeo2.dzQ() != jer.mVN) continue;
                jeo2.a(jer.mVM);
            }
        }
    }

    void a(jeo jeo2, jer jer2) {
        switch (jer2) {
            case mVN: 
            case mVM: {
                if (jeo2.dzR()) break;
                return;
            }
        }
        switch (jer2) {
            case mVN: {
                jeo2.b(jer2);
                this.c(jeo2);
                break;
            }
            default: {
                jeo2.b(jer2);
            }
        }
    }

    private void c(jeo jeo2) {
        jeo jeo3;
        for (jeq jeq2 : jeq.values()) {
            jeo object = this.mVQ[jeo2.dzO().ordinal()][jeq2.ordinal()];
            if (object == jeo2 || object.dzQ() != jer.mVN) continue;
            object.b(jer.mVM);
        }
        int n = 0;
        for (jep jep2 : jep.values()) {
            for (jeq jeq2 : jeq.values()) {
                jeo3 = this.mVQ[jep2.ordinal()][jeq2.ordinal()];
                if (jeo3.dzQ() != jer.mVN) continue;
                n += jeq2.dzU();
            }
        }
        if (n > jej.mUc) {
            for (jep jep3 : jep.values()) {
                for (jeq jeq2 : jeq.values()) {
                    jeo3 = this.mVQ[jep3.ordinal()][jeq2.ordinal()];
                    if (jeo3 == jeo2 || jeo3.dzQ() != jer.mVN) continue;
                    jeo3.b(jer.mVM);
                }
            }
        }
    }

    private void a(Integer n, Float f) {
        switch (n) {
            case 11584: {
                String string = hso.cxK().cxP().cyZ().Oz(5232);
                ckk ckk2 = lea.epw().hz(string);
                jeq jeq2 = this.mVR[jep.mVz.ordinal()] = ckk2 != null ? jeq.values()[ckk2.getIndex()] : null;
                if (this.mVR[jep.mVz.ordinal()] != null) {
                    this.mVQ[jep.mVz.ordinal()][this.mVR[jep.mVz.ordinal()].ordinal()].a(jer.mVN);
                } else {
                    for (jeq jeq3 : jeq.values()) {
                        jeo jeo2 = this.mVQ[jep.mVz.ordinal()][jeq3.ordinal()];
                        if (jeo2.dzQ() != jer.mVN) continue;
                        jeo2.a(jer.mVM);
                    }
                }
                this.dzV().dzB().mUR.k(208, Float.valueOf(hso.cxK().cxP().cyZ().bnS()));
                break;
            }
            case 11600: {
                String string = hso.cxK().cxP().cyZ().Oz(2576);
                ckk ckk3 = lea.epw().hz(string);
                jeq jeq4 = this.mVR[jep.mVA.ordinal()] = ckk3 != null ? jeq.values()[ckk3.getIndex()] : null;
                if (this.mVR[jep.mVA.ordinal()] != null) {
                    this.mVQ[jep.mVA.ordinal()][this.mVR[jep.mVA.ordinal()].ordinal()].a(jer.mVN);
                } else {
                    for (jeq jeq5 : jeq.values()) {
                        jeo jeo3 = this.mVQ[jep.mVA.ordinal()][jeq5.ordinal()];
                        if (jeo3.dzQ() != jer.mVN) continue;
                        jeo3.a(jer.mVM);
                    }
                }
                this.dzV().dzB().mUR.k(160, Float.valueOf(hso.cxK().cxP().cyZ().cAF()));
                break;
            }
            case 11632: {
                String string = hso.cxK().cxP().cyZ().Oz(3360);
                ckk ckk4 = lea.epw().hz(string);
                jeq jeq6 = this.mVR[jep.mVB.ordinal()] = ckk4 != null ? jeq.values()[ckk4.getIndex()] : null;
                if (this.mVR[jep.mVB.ordinal()] != null) {
                    this.mVQ[jep.mVB.ordinal()][this.mVR[jep.mVB.ordinal()].ordinal()].a(jer.mVN);
                } else {
                    for (jeq jeq7 : jeq.values()) {
                        jeo jeo4 = this.mVQ[jep.mVB.ordinal()][jeq7.ordinal()];
                        if (jeo4.dzQ() != jer.mVN) continue;
                        jeo4.a(jer.mVM);
                    }
                }
                this.dzV().dzB().mUR.k(176, Float.valueOf(hso.cxK().cxP().cyZ().cAH()));
                break;
            }
            case 11616: {
                String string = hso.cxK().cxP().cyZ().Oz(5744);
                ckk ckk5 = lea.epw().hz(string);
                jeq jeq8 = this.mVR[jep.mVC.ordinal()] = ckk5 != null ? jeq.values()[ckk5.getIndex()] : null;
                if (this.mVR[jep.mVC.ordinal()] != null) {
                    this.mVQ[jep.mVC.ordinal()][this.mVR[jep.mVC.ordinal()].ordinal()].a(jer.mVN);
                } else {
                    for (jeq jeq9 : jeq.values()) {
                        jeo jeo5 = this.mVQ[jep.mVC.ordinal()][jeq9.ordinal()];
                        if (jeo5.dzQ() != jer.mVN) continue;
                        jeo5.a(jer.mVM);
                    }
                }
                this.dzV().dzB().mUR.k(240, Float.valueOf(hso.cxK().cxP().cyZ().cAG()));
            }
        }
        this.dzV().dzB().mUZ.dLF();
    }

    static /* synthetic */ void a(jes jes2, Integer n, Float f) {
        jes2.a(n, f);
    }
}

