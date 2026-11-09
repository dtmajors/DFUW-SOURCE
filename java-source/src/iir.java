/*
 * Decompiled with CFR.
 */
public abstract class iir
extends ijd {
    private ipg<Boolean> mbD = new ipg<Boolean>(this, (ipf)this, "TimeLabelVisible", hsu.ldg, true){
        final /* synthetic */ iir mbE;
        {
            this.mbE = iir2;
            super(ipf2, string, hsu2, bl);
        }

        public Boolean dQ(int n, int n2) {
            return Boolean.FALSE;
        }

        public void dak() {
            this.mbE.daj();
        }

        public /* synthetic */ Object dR(int n, int n2) {
            return this.dQ(n, n2);
        }
    };

    public iir(String string) {
        super(string);
    }

    public boolean dag() {
        return this.mbD.get();
    }

    public void qt(boolean bl) {
        this.mbD.set(bl);
    }

    @Override
    public void dah() {
        super.dah();
        ((iis)this.daw()).qt(this.dag());
        ((iis)this.daw()).kI(this.daE());
    }

    @Override
    public void dai() {
        super.dai();
        this.qt(((iis)this.daw()).dag());
        this.kI(((iis)this.daw()).daE());
    }

    protected abstract void daj();
}

