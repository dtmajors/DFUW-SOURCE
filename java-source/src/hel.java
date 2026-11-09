/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class hel {
    private static final hbe jzX = hbe.jAM;
    private final HashMap<ldv, hdu> kek;

    public hel() {
        lda.by(jzX);
        this.kek = new HashMap();
    }

    public final void a(boolean bl, hdu hdu2) {
        assert (hdu2 != null);
        assert (this.kek.get(hdu2.dbx) == (bl ? null : hdu2));
        if (bl) {
            hdu hdu3 = this.kek.get(hdu2.dbx);
            if (hdu3 != null) {
                if (hdu3 == hdu2) {
                    return;
                }
                this.kek.remove(hdu3.dbx);
            }
            if (hdu2 instanceof hdz) {
                hea hea2;
                hdz hdz2 = (hdz)hdu2;
                int n = hdz2.ceB().Type;
                if (lea.enW().isDescendant(n, cug.fjQ) && (hea2 = this.Ma(cxd.fHd)) != null) {
                    double d2 = hea2.cez();
                    double d3 = hea2.ceA();
                    if (d3 > d2) {
                        hdz hdz3 = (hdz)hdu2;
                        hdz3.h(d2, d3);
                    }
                }
            }
            this.kek.put(hdu2.dbx, hdu2);
        } else {
            this.kek.remove(hdu2.dbx);
        }
    }

    public hdu qS(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        return this.kek.get(ldv2);
    }

    public hdz qT(ldv ldv2) {
        hdu hdu2 = this.qS(ldv2);
        if (hdu2 == null) {
            return null;
        }
        if (!(hdu2 instanceof hdz)) {
            return null;
        }
        return (hdz)hdu2;
    }

    public hea qU(ldv ldv2) {
        hdu hdu2 = this.qS(ldv2);
        if (hdu2 == null) {
            return null;
        }
        if (!(hdu2 instanceof hea)) {
            return null;
        }
        return (hea)hdu2;
    }

    public final hdz a(ldv ldv2, a a2) {
        hdu hdu2 = this.qS(ldv2);
        if (hdu2 == null) {
            if (a2 == a.kel) {
                // empty if block
            }
            return new heb(this, ldv2);
        }
        if (!(hdu2 instanceof hdz)) {
            if (a2 == a.kel) {
                // empty if block
            }
            return new heb(this, ldv2);
        }
        if (a2 == a.kem) {
            // empty if block
        }
        return (hdz)hdu2;
    }

    public final hea qV(ldv ldv2) {
        hdu hdu2 = this.qS(ldv2);
        if (hdu2 == null) {
            return new hea(this, ldv2, hdx.kbF);
        }
        if (!(hdu2 instanceof hea)) {
            return new hea(this, ldv2, hdx.kbF);
        }
        return (hea)hdu2;
    }

    public final hea Ma(int n) {
        for (hdu hdu2 : this.kek.values()) {
            if (!(hdu2 instanceof hea)) continue;
            hea hea2 = (hea)hdu2;
            String string = hea2.kaW.ceh();
            if (lea.enZ().getType(string) != n) continue;
            return hea2;
        }
        return null;
    }

    public Collection<hdu> cfh() {
        return Collections.unmodifiableCollection(this.kek.values());
    }
}

