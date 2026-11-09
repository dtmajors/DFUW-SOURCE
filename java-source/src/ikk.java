/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ikk
extends ijh {
    private Map<hvz, ikj> mgf = lcn.emw();
    private ipg<Boolean> mgg;
    private ipg<Boolean> mgh;

    public ikk() {
        super("ModifierContainer");
        this.a(iqo.dmS());
        this.mgg = new ipg<Boolean>(this, (ipf)this, "SM", hsu.ldg, true){
            final /* synthetic */ ikk mgi;
            {
                this.mgi = ikk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                this.mgi.setVisible((Boolean)this.get());
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mgh = new ipg<Boolean>(this, (ipf)this, "SD", hsu.ldg, true){
            final /* synthetic */ ikk mgi;
            {
                this.mgi = ikk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                ikk.a(this.mgi);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        iie.cZe().lYs.c((jlf<hvz>)new jlr<ikk, hvz>(this, this){
            final /* synthetic */ ikk mgi;
            {
                this.mgi = ikk2;
                super(ikk3);
            }

            public void c(ikk ikk2, hvz hvz2) {
                ikk.a(ikk2, hvz2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((ikk)object, (hvz)object2);
            }
        });
        iie.cZe().lYt.c((jlf<hvz>)new jlr<ikk, hvz>(this, this){
            final /* synthetic */ ikk mgi;
            {
                this.mgi = ikk2;
                super(ikk3);
            }

            public void c(ikk ikk2, hvz hvz2) {
                ikk.b(ikk2, hvz2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((ikk)object, (hvz)object2);
            }
        });
        iie.cZe().lYu.a((jlg<hvz, Float>)new jls<ikk, hvz, Float>(this, this){
            final /* synthetic */ ikk mgi;
            {
                this.mgi = ikk2;
                super(ikk3);
            }

            public void a(ikk ikk2, hvz hvz2, Float f) {
                ikk.a(ikk2, hvz2, f.floatValue());
            }
        });
    }

    public boolean dcr() {
        return this.mgg.get();
    }

    public void qH(boolean bl) {
        this.mgg.set(bl);
    }

    public boolean dcs() {
        return this.mgh.get();
    }

    public void qI(boolean bl) {
        this.mgh.set(bl);
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 / 2 + 95;
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public void cZZ() {
        super.cZZ();
        for (ikj ikj2 : this.mgf.values()) {
            ikj2.a(this.daD());
        }
    }

    @Override
    public ijc cZY() {
        return new ikl();
    }

    @Override
    public void dah() {
        super.dah();
        ikl ikl2 = (ikl)this.daw();
        ikl2.qH(this.dcr());
        ikl2.qI(this.dcs());
        ikl2.kI(this.daE());
    }

    @Override
    public void dai() {
        super.dai();
        ikl ikl2 = (ikl)this.daw();
        this.qH(ikl2.dcr());
        this.qI(ikl2.dcs());
        this.kI(ikl2.daE());
    }

    @Override
    public void c(iif iif2) {
        if (this.mgg.get().booleanValue()) {
            super.c(iif2);
        }
    }

    @Override
    public void daa() {
        for (ikj ikj2 : this.mgf.values()) {
            ikj2.kI(this.daE());
        }
    }

    private void b(hvz hvz2) {
        assert (this.mgf.get(hvz2) == null);
        ikj ikj2 = new ikj(hvz2, this.daD(), (boolean)this.mgh.get());
        ikj2.kI(this.daE());
        this.mgf.put(hvz2, ikj2);
        if (this.getChildren().size() > 0) {
            this.W(ipx.a(4, 1, new ipf[0]));
        }
        this.W(ikj2);
    }

    private void c(hvz hvz2) {
        ikj ikj2;
        if (!this.mgf.containsKey(hvz2)) {
            return;
        }
        if (this.getChildren().size() > 1) {
            int n = this.V(this.mgf.get(hvz2));
            if (n == 0) {
                this.RP(1);
            } else if (n == this.getChildren().size() - 1) {
                this.RP(n - 1);
            } else {
                this.RP(n + 1);
            }
        }
        if ((ikj2 = this.mgf.remove(hvz2)) != null) {
            ikj2.removeFromParent();
        }
    }

    private void a(hvz hvz2, float f) {
        ikj ikj2 = this.mgf.get(hvz2);
        if (ikj2 != null) {
            ikj2.setProgress(f);
        }
    }

    private void dct() {
        for (ikj ikj2 : this.mgf.values()) {
            ikj2.qG(this.dcs());
        }
    }

    static /* synthetic */ void a(ikk ikk2) {
        ikk2.dct();
    }

    static /* synthetic */ void a(ikk ikk2, hvz hvz2) {
        ikk2.b(hvz2);
    }

    static /* synthetic */ void b(ikk ikk2, hvz hvz2) {
        ikk2.c(hvz2);
    }

    static /* synthetic */ void a(ikk ikk2, hvz hvz2, float f) {
        ikk2.a(hvz2, f);
    }
}

