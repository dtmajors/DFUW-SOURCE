/*
 * Decompiled with CFR.
 */
public abstract class ijh
extends ijd {
    private hvr mcU = null;
    private boolean mcV = false;

    public ijh(String string) {
        super(string);
        iie.cZe().lYr.b(new jlq<ijh>(this, this){
            final /* synthetic */ ijh mcW;
            {
                this.mcW = ijh2;
                super(ijh3);
            }

            public void a(ijh ijh2) {
                iif iif2 = iie.cZe().cZf();
                if (iif2 != null && !iif2.cZh() && !(ijh2 instanceof ijk)) {
                    this.mcW.setVisible(false);
                    return;
                }
                if (iif2 != null) {
                    ijh2.b(iif2);
                }
            }

            public /* synthetic */ void R(Object object) {
                this.a((ijh)object);
            }
        });
        this.hz(0.0f);
        this.setVisible(false);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dbd();
    }

    public void b(iif iif2) {
        if (iif2 == null) {
            return;
        }
        if (iif2.lYw != iii.lZu) {
            this.c(iif2);
        } else {
            this.d(iif2);
        }
    }

    public void c(iif iif2) {
        this.dbd();
        this.setVisible(true);
        this.hz(1.0f);
    }

    public void d(iif iif2) {
        this.dbc();
    }

    @Override
    public void daa() {
        iif iif2 = iie.cZe().cZf();
        if (iif2 != null && iif2.lYw != iii.lZu) {
            this.e(iif2);
        } else {
            this.f(iif2);
        }
    }

    public void e(iif iif2) {
        this.dbd();
        this.setVisible(true);
        this.hz(this.daE());
    }

    public void f(iif iif2) {
        this.dbd();
        this.setVisible(false);
    }

    private void dbc() {
        this.dbd();
        this.mcU = new ioe(this, this, this.daE(), 0.0f, 0.5){
            final /* synthetic */ ijh mcW;
            {
                this.mcW = ijh2;
                super(ipf2, f, f2, d2);
            }

            public void hz(float f) {
                if (iie.cZe().cZf().lYw == iii.lZu) {
                    this.moH.hz(f);
                }
            }

            public void aA(ldz ldz2) {
                if (iie.cZe().cZf().lYw == iii.lZu) {
                    this.mcW.setVisible(false);
                }
            }
        };
        hso.cxK().cxP().czy().a(this.mcU);
    }

    private void dbd() {
        if (this.mcU != null) {
            hso.cxK().cxP().czy().b(this.mcU);
            this.mcU = null;
        }
    }

    public void qt() {
    }
}

