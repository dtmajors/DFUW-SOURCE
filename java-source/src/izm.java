/*
 * Decompiled with CFR.
 */
public class izm
extends izh {
    public izm() {
        this.a(this.dtV());
        this.b(this.dtW());
        this.dtS();
    }

    public irt dtV() {
        return new ixm(this){
            final /* synthetic */ izm mDm;
            {
                this.mDm = izm2;
            }

            public void Rb(int n) {
                this.mDm.eO(this.mDm.drl(), n);
            }

            public void Sw(int n) {
                this.mDm.eW(this.mDm.drl(), n);
            }

            public void Sx(int n) {
                this.mDm.eX(this.mDm.drl(), n);
            }
        };
    }

    public irt dtW() {
        return new ixm(this){
            final /* synthetic */ izm mDm;
            {
                this.mDm = izm2;
            }

            public void Rb(int n) {
                this.mDm.eO(n, this.mDm.dnx());
            }

            public void Sw(int n) {
                this.mDm.eW(n, this.mDm.dnx());
            }

            public void Sx(int n) {
                this.mDm.eX(n, this.mDm.dnx());
            }
        };
    }
}

