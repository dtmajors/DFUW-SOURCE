/*
 * Decompiled with CFR.
 */
public class ihm
extends inz {
    private ihn lWm;
    private iph lWn;
    private ipx lWo;
    private ipx lWp;

    public ihm(String string, String string2, ioa ioa2, joa joa2, int n, int n2) {
        super(string, string2, ioa2, joa2, n, n2);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        ipf ipf2 = this.cMs();
        if (ipf2 != null) {
            this.dhJ().W(ipf2);
        }
        ipx ipx2 = ipx.j(new ipf[0]);
        this.dhJ().W(ipx2);
        this.lWm = this.cVF();
        if (this.lWm != null) {
            ipx2.W(this.lWm);
        }
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[]{ipx3}));
        this.lWo = this.cNG();
        if (this.lWo != null) {
            ipx3.W(this.lWo);
        }
        this.lWn = this.cXA();
        if (this.lWn != null) {
            ipx3.W(ipx.c(new ipf[]{this.lWn}));
        }
        this.lWp = this.cXB();
        if (this.lWp != null) {
            ipx3.W(this.lWp);
        }
        ipx ipx4 = new ipx(this, iqo.dmS()){
            final /* synthetic */ ihm lWq;
            {
                this.lWq = ihm2;
                super(iqz2);
            }

            public boolean dF(int n, int n2) {
                return false;
            }
        };
        this.dhJ().W(ipx4);
        ipx4.W(ipx.b(this.dhH()));
        ipx4.W(ipx.c(new ipf[0]));
        ipx4.W(ipx.b(this.dhI()));
    }

    protected ipf cMs() {
        return null;
    }

    protected ihn cVF() {
        return new ihn();
    }

    protected ipx cNG() {
        return ipx.a(44, 1, new ipf[0]);
    }

    protected iph cXA() {
        return ipx.j(new ipf[0]);
    }

    protected ipx cXB() {
        return ipx.a(36, 1, new ipf[0]);
    }

    protected ihn cXC() {
        return this.lWm;
    }

    protected ipx cXD() {
        return this.lWo;
    }

    protected iph cXE() {
        return this.lWn;
    }

    protected ipx cXF() {
        return this.lWp;
    }
}

