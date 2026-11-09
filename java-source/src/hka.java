/*
 * Decompiled with CFR.
 */
import java.util.Collection;

public class hka {
    private final hec kBl;
    private boolean kBC = false;
    private final lbn kmr = new lbn(this){
        final /* synthetic */ hka kBD;
        {
            this.kBD = hka2;
        }

        public final void W() {
            hka.a(this.kBD);
        }
    };

    public hka(hec hec2) {
        this.kBl = hec2;
        this.kBl.kck.kyz.cfa().a(true, this.kmr);
    }

    public void d(ldv ldv2, ldv ldv3, ljq ljq2) {
        if (this.kBl.cbO().jZt.cdi()) {
            if (this.kBl.cbO().jZt.cps().equals(ldv2)) {
                this.kBl.cbO().jZt.ne(false);
                return;
            }
            this.kBl.cbO().jZt.ne(false);
        }
        this.kBl.cbO().jZt.p(ldv2, ljq2);
        this.kBl.cbO().jZt.ne(true);
    }

    public void dispose() {
        this.kBl.kck.kyz.cfa().a(false, this.kmr);
    }

    private void coT() {
        if (this.kBC) {
            return;
        }
        if (!this.kBl.cbO().jZt.cdi()) {
            return;
        }
        this.kBC = true;
        this.kBl.kAz.b(new lbn(this){
            final /* synthetic */ hka kBD;
            {
                this.kBD = hka2;
            }

            public void W() {
                hka.b(this.kBD);
            }
        });
    }

    private void coU() {
        this.kBC = false;
        if (!this.kBl.cbO().jZt.cdi()) {
            return;
        }
        ldv ldv2 = this.kBl.cbO().jZt.cps();
        Collection<hdu> collection = this.kBl.kck.kyz.cfh();
        for (hdu hdu2 : collection) {
            if (!hdu2.dbx.equals(ldv2)) continue;
            return;
        }
        this.kBl.cbO().jZt.ne(false);
    }

    static /* synthetic */ void a(hka hka2) {
        hka2.coT();
    }

    static /* synthetic */ void b(hka hka2) {
        hka2.coU();
    }
}

