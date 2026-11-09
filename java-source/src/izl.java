/*
 * Decompiled with CFR.
 */
public class izl
extends izg {
    public izl() {
        this.a(this.dtV());
        this.b(this.dtW());
    }

    public irt dtV() {
        return new ixm(this){
            final /* synthetic */ izl mDl;
            {
                this.mDl = izl2;
            }

            public void Rb(int n) {
                this.mDl.eO(this.mDl.drl(), n);
            }

            public void Sw(int n) {
                this.mDl.eW(this.mDl.drl(), n);
            }

            public void Sx(int n) {
                this.mDl.eX(this.mDl.drl(), n);
            }
        };
    }

    public irt dtW() {
        return new ixm(this){
            final /* synthetic */ izl mDl;
            {
                this.mDl = izl2;
            }

            public void Rb(int n) {
                this.mDl.eO(n, this.mDl.dnx());
            }

            public void Sw(int n) {
                this.mDl.eW(n, this.mDl.dnx());
            }

            public void Sx(int n) {
                this.mDl.eX(n, this.mDl.dnx());
            }
        };
    }
}

