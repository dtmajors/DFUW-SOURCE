/*
 * Decompiled with CFR.
 */
public class iip
extends ijc {
    private iio mbr;

    public iip() {
        super(true, true, lyu.tKQ);
        this.a(irl.dnr());
        this.mbr = new iio(false);
        this.c(this.mbr, this.bfn() - 2);
        hso.cxK().cxP().cyJ().cJp().euB.a((jlg<Integer, Boolean>)new jls<iip, Integer, Boolean>(this, this){
            final /* synthetic */ iip mbC;
            {
                this.mbC = iip2;
                super(iip3);
            }

            public void b(iip iip2, Integer n, Boolean bl) {
                iip.a(iip2, n, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((iip)object, (Integer)object2, (Boolean)object3);
            }
        });
        hso.cxK().cxP().cyJ().cJp().euC.c((jlf<Integer>)new jlr<iip, Integer>(this, this){
            final /* synthetic */ iip mbC;
            {
                this.mbC = iip2;
                super(iip3);
            }

            public void b(iip iip2, Integer n) {
                iip.a(iip2, n);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((iip)object, (Integer)object2);
            }
        });
        this.dac();
    }

    @Override
    public ije dae() {
        return new iiq(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfC;
    }

    @Override
    public void cZZ() {
        super.cZZ();
        this.mbr.a(this.daD());
    }

    @Override
    public void daa() {
        this.mbr.kI(this.daE());
    }

    private void a(Integer n, Boolean bl) {
        if (!bl.booleanValue()) {
            this.dac();
        }
    }

    private void o(Integer n) {
        this.dac();
    }

    private void dac() {
        int n = hso.cxK().cxP().cyJ().cJp().aNs().size();
        boolean bl = n > 0;
        this.mbr.JR(n);
        if (bl) {
            this.mbr.cKG();
        } else {
            this.mbr.cKH();
        }
    }

    static /* synthetic */ void a(iip iip2, Integer n, Boolean bl) {
        iip2.a(n, bl);
    }

    static /* synthetic */ void a(iip iip2, Integer n) {
        iip2.o(n);
    }
}

