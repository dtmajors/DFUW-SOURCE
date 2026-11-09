/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class jeu {
    private jem mVP;
    private Map<jep, jet> mVZ = lcn.emw();
    private Map<jet, jep> mWa = lcn.emw();
    private Map<jep, jev> mWb;
    private Map<jev, jep> mWc;
    private Map<jep, jet> mWd;
    private Map<jep, jev> mWe;

    public jeu(jem jem2) {
        this.mVZ.put(jep.mVz, jej.mUp);
        this.mWa.put(jej.mUp, jep.mVz);
        this.mVZ.put(jep.mVA, jej.mUq);
        this.mWa.put(jej.mUq, jep.mVA);
        this.mVZ.put(jep.mVB, jej.mUr);
        this.mWa.put(jej.mUr, jep.mVB);
        this.mVZ.put(jep.mVC, jej.mUs);
        this.mWa.put(jej.mUs, jep.mVC);
        this.mWb = lcn.emw();
        this.mWc = lcn.emw();
        this.mWb.put(jep.mVz, jej.mUt);
        this.mWc.put(jej.mUt, jep.mVz);
        this.mWb.put(jep.mVA, jej.mUu);
        this.mWc.put(jej.mUu, jep.mVA);
        this.mWb.put(jep.mVB, jej.mUv);
        this.mWc.put(jej.mUv, jep.mVB);
        this.mWb.put(jep.mVC, jej.mUw);
        this.mWc.put(jej.mUw, jep.mVC);
        this.mWd = lcn.emw();
        this.mWe = lcn.emw();
        this.mWd.putAll(this.mVZ);
        this.mWe.putAll(this.mWb);
        this.mVP = jem2;
        jem2.dzB().mUS.a((jlg<jep, jet>)new jls<jeu, jep, jet>(this, this){
            final /* synthetic */ jeu mWf;
            {
                this.mWf = jeu2;
                super(jeu3);
            }

            public void a(jeu jeu2, jep jep2, jet jet2) {
                jeu2.dzV().dzB().mVa.dLF();
            }
        });
        jem2.dzB().mUT.a((jlg<jep, jev>)new jls<jeu, jep, jev>(this, this){
            final /* synthetic */ jeu mWf;
            {
                this.mWf = jeu2;
                super(jeu3);
            }

            public void a(jeu jeu2, jep jep2, jev jev2) {
                jeu2.dzV().dzB().mVa.dLF();
            }
        });
    }

    public jem dzV() {
        return this.mVP;
    }

    public jet j(jep jep2) {
        return this.mVZ.get((Object)jep2);
    }

    public void a(jep jep2, jet jet2) {
        if (this.mVZ.get((Object)jep2) == jet2) {
            return;
        }
        jet jet3 = this.mVZ.get((Object)jep2);
        jep jep3 = this.mWa.get((Object)jet2);
        this.mVZ.put(jep2, jet2);
        this.mWa.put(jet2, jep2);
        this.mVZ.put(jep3, jet3);
        this.mWa.put(jet3, jep3);
        jen.dzL().mUS.k(jep2, jet2);
        jen.dzL().mUS.k(jep3, jet3);
    }

    public boolean k(jep jep2) {
        return this.mVZ.get((Object)jep2) != this.mWd.get((Object)jep2);
    }

    public jev l(jep jep2) {
        return this.mWb.get((Object)jep2);
    }

    public void a(jep jep2, jev jev2) {
        if (this.mWb.get((Object)jep2) == jev2) {
            return;
        }
        jev jev3 = this.mWb.get((Object)jep2);
        jep jep3 = this.mWc.get((Object)jev2);
        this.mWb.put(jep2, jev2);
        this.mWc.put(jev2, jep2);
        this.mWb.put(jep3, jev3);
        this.mWc.put(jev3, jep3);
        jen.dzL().mUT.k(jep2, jev2);
        jen.dzL().mUT.k(jep3, jev3);
    }

    public boolean m(jep jep2) {
        return this.mWb.get((Object)jep2) != this.mWe.get((Object)jep2);
    }

    public boolean dzG() {
        for (jep jep2 : jep.values()) {
            if (!this.m(jep2) && !this.k(jep2)) continue;
            return true;
        }
        return false;
    }

    public void dzF() {
        for (Map.Entry<jep, jet> entry : this.mVZ.entrySet()) {
            this.mWd.put(entry.getKey(), entry.getValue());
            jen.dzL().mUS.k(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<jep, Enum> entry : this.mWb.entrySet()) {
            this.mWe.put(entry.getKey(), (jev)entry.getValue());
            jen.dzL().mUT.k(entry.getKey(), (jev)entry.getValue());
        }
    }

    public void cDZ() {
        for (Map.Entry<jep, jet> entry : this.mVZ.entrySet()) {
            this.mWd.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<jep, Enum> entry : this.mWb.entrySet()) {
            this.mWe.put(entry.getKey(), (jev)entry.getValue());
        }
    }
}

