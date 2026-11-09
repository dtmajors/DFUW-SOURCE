/*
 * Decompiled with CFR.
 */
public class izj
extends izh {
    public izj() {
        this.a(this.dtV());
        this.b(this.dtW());
    }

    public irt dtV() {
        return new ixg(this){
            final /* synthetic */ izj mDj;
            {
                this.mDj = izj2;
            }

            public void Rb(int n) {
                this.mDj.eO(this.mDj.drl(), n);
            }

            public void Sw(int n) {
                this.mDj.eW(this.mDj.drl(), n);
            }

            public void Sx(int n) {
                this.mDj.eX(this.mDj.drl(), n);
            }
        };
    }

    public irt dtW() {
        return new ixg(this){
            final /* synthetic */ izj mDj;
            {
                this.mDj = izj2;
            }

            public void Rb(int n) {
                this.mDj.eO(n, this.mDj.dnx());
            }

            public void Sw(int n) {
                this.mDj.eW(n, this.mDj.dnx());
            }

            public void Sx(int n) {
                this.mDj.eX(n, this.mDj.dnx());
            }
        };
    }
}

