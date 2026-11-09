/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hjt {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hjh kck;
    private final ldl kAO = new ldl();
    private final lbi<fws> kAP = new lbi<fws>(this){
        final /* synthetic */ hjt kAU;
        {
            this.kAU = hjt2;
        }

        public void a(fws fws2) {
            hjt.a(this.kAU, fws2.aO());
        }

        public /* synthetic */ void m(Object object) {
            this.a((fws)object);
        }
    };
    private final lbi<fxx> kAQ = new lbi<fxx>(this){
        final /* synthetic */ hjt kAU;
        {
            this.kAU = hjt2;
        }

        public void a(fxx fxx2) {
            Iterator<K> iterator;
            int n;
            if (hjt.a(this.kAU) == null) {
                hjt.a(this.kAU, fxx2.aO());
            }
            if (!hjt.a(this.kAU).equals(fxx2.aO())) {
                return;
            }
            int n2 = fxx2.jaP.length;
            if (n2 >= 10) {
                n2 = 10;
            }
            HashMap<Iterator<K>, cbi> hashMap = new HashMap<Iterator<K>, cbi>();
            for (n = 0; n < n2; ++n) {
                iterator = fxx2.jaP[n].eiq;
                hashMap.put(iterator, fxx2.jaP[n]);
            }
            n = 0;
            for (lip lip2 : hashMap.keySet()) {
                hek hek2;
                cbi cbi2 = (cbi)hashMap.get(lip2);
                if (hjt.b(this.kAU).containsKey(lip2)) {
                    hek2 = (hek)hjt.b(this.kAU).get(lip2);
                    hek2.a(cbi2.afF, cbi2.eiq, cbi2.eiM, cbi2.eiL, cbi2.eiN, cbi2.dMT, cbi2.Qw, cbi2.aGr, cbi2.aGA);
                    continue;
                }
                hek2 = new hek(lip2);
                hjt.b(this.kAU).put(lip2, hek2);
                hek2.a(cbi2.afF, cbi2.eiq, cbi2.eiM, cbi2.eiL, cbi2.eiN, cbi2.dMT, cbi2.Qw, cbi2.aGr, cbi2.aGA);
                n = 1;
            }
            iterator = hjt.b(this.kAU).keySet().iterator();
            while (iterator.hasNext()) {
                lip lip2;
                lip2 = (lip)iterator.next();
                if (hashMap.containsKey(lip2)) continue;
                n = 1;
                iterator.remove();
            }
            if (n != 0) {
                hjt.c(this.kAU).enp();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fxx)object);
        }
    };
    private final lbi<fwy> kAR = new lbi<fwy>(this){
        final /* synthetic */ hjt kAU;
        {
            this.kAU = hjt2;
        }

        public void a(fwy fwy2) {
            if (hjt.a(this.kAU) == null) {
                return;
            }
            if (!hjt.a(this.kAU).equals(fwy2.aO())) {
                return;
            }
            hjt.b(this.kAU, null);
            hjt.b(this.kAU).clear();
            hjt.c(this.kAU).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((fwy)object);
        }
    };
    private ldv kAS;
    private final Map<lip, hek> kAT = new HashMap<lip, hek>();

    public hjt(lha<dxq, dxq> lha2, hjh hjh2) {
        this.cdh = lha2;
        this.kck = hjh2;
        assert (lda.by(this.kck));
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kAO.isEmpty());
    }

    public final lbl<lbn> cos() {
        return this.kAO;
    }

    public final boolean cot() {
        return this.kAS != null;
    }

    public final Map<lip, hek> cou() {
        return Collections.unmodifiableMap(this.kAT);
    }

    private void rb(ldv ldv2) {
        if (this.kAS != null) {
            return;
        }
        this.kAS = ldv2;
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, fws.class, this.kAP);
        this.cdh.rex.a(bl, fwy.class, this.kAR);
        this.cdh.rex.a(bl, fxx.class, this.kAQ);
    }

    static /* synthetic */ void a(hjt hjt2, ldv ldv2) {
        hjt2.rb(ldv2);
    }

    static /* synthetic */ ldv a(hjt hjt2) {
        return hjt2.kAS;
    }

    static /* synthetic */ Map b(hjt hjt2) {
        return hjt2.kAT;
    }

    static /* synthetic */ ldl c(hjt hjt2) {
        return hjt2.kAO;
    }

    static /* synthetic */ ldv b(hjt hjt2, ldv ldv2) {
        hjt2.kAS = ldv2;
        return hjt2.kAS;
    }
}

