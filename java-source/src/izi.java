/*
 * Decompiled with CFR.
 */
public class izi
extends izg {
    public izi() {
        this.a(this.dtV());
        this.b(this.dtW());
    }

    public irt dtV() {
        return new ixg(this){
            final /* synthetic */ izi mDi;
            {
                this.mDi = izi2;
            }

            public void Rb(int n) {
                this.mDi.eO(this.mDi.drl(), n);
            }

            public void Sw(int n) {
                this.mDi.eW(this.mDi.drl(), n);
            }

            public void Sx(int n) {
                this.mDi.eX(this.mDi.drl(), n);
            }
        };
    }

    public irt dtW() {
        return new ixg(this){
            final /* synthetic */ izi mDi;
            {
                this.mDi = izi2;
            }

            public void Rb(int n) {
                this.mDi.eO(n, this.mDi.dnx());
            }

            public void Sw(int n) {
                this.mDi.eW(n, this.mDi.dnx());
            }

            public void Sx(int n) {
                this.mDi.eX(n, this.mDi.dnx());
            }
        };
    }
}

