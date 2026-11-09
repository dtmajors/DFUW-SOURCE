/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.Collection;

public class hjg {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hel kaV;
    private final ldl kxJ = new ldl();
    private final hcf kxK = new hcf();
    private final lbi<eeu> kxL = new lbi<eeu>(this){
        final /* synthetic */ hjg kxN;
        {
            this.kxN = hjg2;
        }

        public void a(eeu eeu2) {
            hjg.a(this.kxN, eeu2.inN, eeu2.dBp, eeu2.aXq, eeu2.aCK, eeu2.dBo, eeu2.ioa);
        }

        public /* synthetic */ void m(Object object) {
            this.a((eeu)object);
        }
    };
    private final lbi<eev> kxM = new lbi<eev>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjg kxN;
        {
            this.kxN = hjg2;
        }

        public void a(eev eev2) {
            switch (eev2.inN) {
                case 0: {
                    hjg.a((hjg)this.kxN).jFj = (float)eev2.iob;
                    break;
                }
                default: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError(eev2.inN);
                    }
                    return;
                }
            }
            hjg.b(this.kxN).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((eev)object);
        }

        static {
            $assertionsDisabled = !hjg.class.desiredAssertionStatus();
        }
    };

    private void a(int n, double d2, double d3, ldv ldv2, double d4, boolean bl) {
        switch (n) {
            case 0: {
                if (d2 == 0.0) {
                    this.kxK.jFg = false;
                } else {
                    this.kxK.jFg = true;
                    this.kxK.jFh = (float)d3;
                    this.kxK.jFi = (float)d2;
                    this.kxK.jFj = 0.0f;
                }
                this.kxJ.enp();
                break;
            }
            case 1: {
                if (d2 == 0.0) {
                    this.kxK.jFq = false;
                } else {
                    this.kxK.jFq = true;
                    this.kxK.jFr = d3;
                    this.kxK.jFs = d2;
                }
                this.kxJ.enp();
                break;
            }
            case 2: {
                if (d2 == 0.0) {
                    this.kxK.jFt = false;
                } else {
                    this.kxK.jFt = true;
                    this.kxK.jFu = d3;
                    this.kxK.jFv = d2;
                }
                this.kxJ.enp();
                break;
            }
            case 3: 
            case 8: {
                if (d2 == 0.0) {
                    this.kxK.jFd = false;
                } else {
                    this.kxK.jFd = true;
                    this.kxK.jFe = d3;
                    this.kxK.jFf = d2;
                }
                this.kxJ.enp();
                break;
            }
            case 4: {
                hdu hdu2 = this.kaV.qS(ldv2);
                if (hdu2 == null || !(hdu2 instanceof hea)) break;
                hea hea2 = (hea)hdu2;
                hea2.h(d3, d2);
                String string = hea2.kaW.ceh();
                if (lea.enZ().getType(string) != cxd.fHd) break;
                Collection<hdu> collection = this.kaV.cfh();
                for (hdu hdu3 : collection) {
                    hdz hdz2;
                    if (!(hdu3 instanceof hdz) || (hdz2 = (hdz)hdu3).cea() == null || !(hdz2.cea() instanceof bsl)) continue;
                    bsl bsl2 = (bsl)hdz2.cea();
                    if (!lea.enW().isDescendant(bsl2.az(), cug.fjQ)) continue;
                    hdz2.h(d3, d2);
                }
                break;
            }
            case 5: {
                if (d2 == 0.0) {
                    this.kxK.jFl = false;
                } else {
                    hdu hdu4 = this.kaV.qS(ldv2);
                    if (hdu4 == null || !(hdu4 instanceof hea)) break;
                    this.kxK.jFk = (hea)hdu4;
                    this.kxK.jFm = bl;
                    this.kxK.jFl = true;
                    this.kxK.jFn = d3;
                    this.kxK.jFo = d4;
                    this.kxK.jFp = d2;
                }
                this.kxJ.enp();
                break;
            }
            case 6: {
                if (d2 == 0.0) {
                    this.kxK.jFw = false;
                } else {
                    this.kxK.jFw = true;
                    this.kxK.jFx = d3;
                    this.kxK.jFy = d2;
                }
                this.kxJ.enp();
                break;
            }
            case 7: {
                if (d2 == 0.0) {
                    this.kxK.jFz = false;
                } else {
                    this.kxK.jFz = true;
                    this.kxK.jFA = d3;
                    this.kxK.jFB = d2;
                }
                this.kxJ.enp();
                break;
            }
            default: {
                assert (false) : n;
                return;
            }
        }
    }

    public hjg(lha<dxq, dxq> lha2, hel hel2) {
        this.cdh = lha2;
        this.kaV = hel2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kxJ.isEmpty());
    }

    public final lbl<lbn> cmW() {
        return this.kxJ;
    }

    public final hcf cmX() {
        return this.kxK.cbV();
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, eeu.class, this.kxL);
        this.cdh.rex.a(bl, eev.class, this.kxM);
    }

    static /* synthetic */ void a(hjg hjg2, int n, double d2, double d3, ldv ldv2, double d4, boolean bl) {
        hjg2.a(n, d2, d3, ldv2, d4, bl);
    }

    static /* synthetic */ hcf a(hjg hjg2) {
        return hjg2.kxK;
    }

    static /* synthetic */ ldl b(hjg hjg2) {
        return hjg2.kxJ;
    }
}

