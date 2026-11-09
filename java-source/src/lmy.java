/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class lmy
extends lmx {
    private final d rFc = new d(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lmy rFe;
        {
            this.rFe = lmy2;
        }

        public final void adE(int n) {
            if (!$assertionsDisabled && !this.rFe.isConstructed()) {
                throw new AssertionError();
            }
            lmx.a.a a2 = this.rFe.evp().evn().get(n);
            lmu lmu2 = a2.kza;
            lmv lmv2 = lmu2.euX();
            if (a2.kuI != null) {
                lmv2.i(a2.kuI);
            }
            this.rFe.c(n, lmv2);
        }

        static {
            $assertionsDisabled = !lmy.class.desiredAssertionStatus();
        }
    };
    private final e rFd = new e(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lmy rFe;
        {
            this.rFe = lmy2;
        }

        public final void adF(int n) {
            if (!$assertionsDisabled && !this.rFe.isConstructed()) {
                throw new AssertionError();
            }
            this.rFe.adP(n);
        }

        static {
            $assertionsDisabled = !lmy.class.desiredAssertionStatus();
        }
    };

    public lmy(a a2) {
        this(a2, a2.evo());
    }

    private lmy(a a2, ArrayList<lmv> arrayList) {
        super(a2, arrayList);
        this.cc(true);
    }

    public lmy(lmy lmy2) {
        this(lmy2.evp());
        this.i(lmy2);
    }

    public final a evp() {
        assert (this.isConstructed());
        return (a)this.evb();
    }

    public final void a(int n, lmv lmv2) {
        assert (this.isConstructed());
        assert (this.evp().evf().get((int)n).kza.a(lmv2.evb()));
        if (this.d(n, lmv2)) {
            this.cdX();
        }
    }

    public final void a(String string, lmv lmv2) {
        assert (this.isConstructed());
        assert (this.evp().AN(string) != -1);
        int n = this.evp().AN(string);
        this.a(n, lmv2);
    }

    public final void b(String string, lmv lmv2) {
        int n = this.evp().c(string, lmv2);
        this.a(n, lmv2);
    }

    @Override
    protected void cbg() {
        this.cc(false);
    }

    private void cc(boolean bl) {
        this.evp().evq().a(bl, this.rFc);
        this.evp().evr().a(bl, this.rFd);
    }
}

