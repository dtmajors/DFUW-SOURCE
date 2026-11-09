/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hjs {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final ldl kAI = new ldl();
    private final hdi kAJ = new hdi();
    private final Map<ldv, hei> kqr = new HashMap<ldv, hei>();
    private final lbi<ffb> kAK = new lbi<ffb>(this){
        final /* synthetic */ hjs kAM;
        {
            this.kAM = hjs2;
        }

        public void a(ffb ffb2) {
            switch (ffb2.iKO) {
                case iKR: {
                    if (hjs.a(this.kAM).containsKey(ffb2.dbx)) {
                        hjs.b((hjs)this.kAM).rnh.m(ffc.e(hjs.b((hjs)this.kAM).rng, ffb2.aO()));
                        return;
                    }
                    hei hei2 = new hei(ffb2.dbx, hdw.LW(ffb2.ResourceType));
                    hjs.a(this.kAM).put(ffb2.dbx, hei2);
                    hjs.b(hei2, ffb2);
                    hjs.c(this.kAM).enp();
                    hjs.d(this.kAM).b(hby.a.jEC, hei2);
                    break;
                }
                case iKT: {
                    hei hei3 = (hei)hjs.a(this.kAM).get(ffb2.dbx);
                    if (hei3 == null) {
                        hjs.b((hjs)this.kAM).rnh.m(ffc.e(hjs.b((hjs)this.kAM).rng, ffb2.aO()));
                        return;
                    }
                    hjs.a(this.kAM).remove(ffb2.dbx);
                    hjs.c(this.kAM).enp();
                    hjs.d(this.kAM).b(hby.a.jED, hei3);
                    break;
                }
                case iKS: {
                    hei hei4 = (hei)hjs.a(this.kAM).get(ffb2.dbx);
                    if (hei4 == null) {
                        hjs.b((hjs)this.kAM).rnh.m(ffc.e(hjs.b((hjs)this.kAM).rng, ffb2.aO()));
                        return;
                    }
                    hjs.b(hei4, ffb2);
                    hjs.c(this.kAM).enp();
                    hjs.d(this.kAM).b(hby.a.jEE, hei4);
                    break;
                }
                default: {
                    hjs.b((hjs)this.kAM).rnh.m(ffc.e(hjs.b((hjs)this.kAM).rng, ffb2.aO()));
                    return;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffb)object);
        }
    };
    private final lbi<ffc> kAL = new lbi<ffc>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjs kAM;
        {
            this.kAM = hjs2;
        }

        public void a(ffc ffc2) {
            if (!$assertionsDisabled && !lda.by(ffc2)) {
                throw new AssertionError();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffc)object);
        }

        static {
            $assertionsDisabled = !hjs.class.desiredAssertionStatus();
        }
    };

    private static void a(hei hei2, ffb ffb2) {
        hei2.e(ffb2.iKP);
        hei2.m(new ljp(ffb2.iKQ.x, ffb2.iKQ.rlV));
        hei2.gu(ffb2.eir);
        hei2.n(ffb2.eis);
    }

    public hjs(lha<dxq, dxq> lha2, hjh hjh2) {
        assert (lda.by(hjh2));
        this.cdh = lha2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kAI.isEmpty());
        assert (this.kAJ.isEmpty());
    }

    public final lbl<lbn> cop() {
        return this.kAI;
    }

    public final lbl<hby> coq() {
        return this.kAJ;
    }

    public final Collection<hei> cor() {
        return Collections.unmodifiableCollection(this.kqr.values());
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, ffb.class, this.kAK);
        this.cdh.rex.a(bl, ffc.class, this.kAL);
    }

    static /* synthetic */ Map a(hjs hjs2) {
        return hjs2.kqr;
    }

    static /* synthetic */ lha b(hjs hjs2) {
        return hjs2.cdh;
    }

    static /* synthetic */ void b(hei hei2, ffb ffb2) {
        hjs.a(hei2, ffb2);
    }

    static /* synthetic */ ldl c(hjs hjs2) {
        return hjs2.kAI;
    }

    static /* synthetic */ hdi d(hjs hjs2) {
        return hjs2.kAJ;
    }
}

