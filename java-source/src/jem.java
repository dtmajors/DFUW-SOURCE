/*
 * Decompiled with CFR.
 */
public class jem {
    private jen mUK;
    private jes mUL;
    private jeu mUM;
    private jff mUN;

    public jem(jen jen2) {
        this.mUK = jen2;
        this.mUL = new jes(this);
        this.mUM = new jeu(this);
        this.mUN = new jff(this);
        this.mUK.mUZ.b(new jlq<jem>(this, this){
            final /* synthetic */ jem mUO;
            {
                this.mUO = jem2;
                super(jem3);
            }

            public void a(jem jem2) {
                jem2.dzB().mVc.dLF();
            }

            public /* synthetic */ void R(Object object) {
                this.a((jem)object);
            }
        });
        this.mUK.mVa.b(new jlq<jem>(this, this){
            final /* synthetic */ jem mUO;
            {
                this.mUO = jem2;
                super(jem3);
            }

            public void a(jem jem2) {
                jem2.dzB().mVc.dLF();
            }

            public /* synthetic */ void R(Object object) {
                this.a((jem)object);
            }
        });
        this.mUK.mVb.b(new jlq<jem>(this, this){
            final /* synthetic */ jem mUO;
            {
                this.mUO = jem2;
                super(jem3);
            }

            public void a(jem jem2) {
                jem2.dzB().mVc.dLF();
            }

            public /* synthetic */ void R(Object object) {
                this.a((jem)object);
            }
        });
    }

    public jen dzB() {
        return this.mUK;
    }

    public jes dzC() {
        return this.mUL;
    }

    public jeu dzD() {
        return this.mUM;
    }

    public jff dzE() {
        return this.mUN;
    }

    public void dzF() {
        this.mUM.dzF();
        this.mUN.dzF();
    }

    public boolean dzG() {
        return this.mUL.dzG() || this.mUN.dzG() || this.mUM.dzG();
    }

    public boolean dzH() {
        return this.mUN.dzG();
    }

    public boolean dzI() {
        return this.mUL.dzG();
    }

    public boolean dzJ() {
        return this.mUM.dzG();
    }

    public boolean dzK() {
        return this.dzE().dzG() && this.dzE().tg(false) || this.dzC().dzG() || this.dzD().dzG();
    }
}

