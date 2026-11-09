/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public class hmp
extends hmn {
    private final hmr jEN = new hmr(null);
    private final List<a> kLE = new LinkedList<a>();

    public hmp(hnc hnc2, lnh lnh2, hpv hpv2) {
        super(hnc2.kAz, lnh2, hpv2);
        this.e(this.kLt);
        this.mU(true);
    }

    @Override
    protected void cbg() {
        assert (this.isConstructed());
        this.mU(false);
        super.cbg();
    }

    @Override
    protected void cQ(double d2) {
        assert (this.isConstructed());
        this.jEN.J(new lcq(1.0f, 1.0f, 1.0f, (float)d2));
        super.cQ(d2);
    }

    @Override
    protected void b(boolean bl, hms hms2) {
        assert (this.isConstructed());
        super.b(bl, hms2);
        if (hms2 instanceof hoy) {
            if (bl) {
                this.a((hoy)hms2);
            } else {
                for (a a2 : this.kLE) {
                    if (a2.kLF != hms2) continue;
                    this.kLE.remove(a2);
                    a2.cleanup();
                    break;
                }
            }
        }
    }

    private void e(hms hms2) {
        if (hms2 instanceof hoy) {
            this.a((hoy)hms2);
        } else if (hms2 instanceof hmt) {
            hmt hmt2 = (hmt)hms2;
            for (hms hms3 : hmt2.crn()) {
                this.e(hms3);
            }
        }
    }

    private void a(hoy hoy2) {
        this.kLE.add(new a(this, hoy2));
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ hmr a(hmp hmp2) {
        return hmp2.jEN;
    }
}

