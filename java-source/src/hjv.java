/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hjv {
    public static final lfo ct = hbe.jAM;
    private final int kAX;
    private final ldl kAY = new ldl();
    private final lha<dxq, dxq> cdh;
    private final lbi<fkx> kAZ = new lbi<fkx>(this){
        final /* synthetic */ hjv kBb;
        {
            this.kBb = hjv2;
        }

        public void a(fkx fkx2) {
            bpj[] bpjArray = fkx2.iOX;
            if (bpjArray == null) {
                bpjArray = new bpj[]{};
            }
            hjv.a(this.kBb, Collections.unmodifiableList(Arrays.asList(bpjArray)));
            hjv.a(this.kBb).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((fkx)object);
        }
    };
    private final ldv iOl;
    private List<bpj> kBa = Collections.emptyList();

    public hjv(ldv ldv2, lha<dxq, dxq> lha2, int n) {
        this.iOl = ldv2;
        this.cdh = lha2;
        this.kAX = n;
        this.mU(true);
        this.cow();
    }

    public void dispose() {
        this.mU(false);
        assert (this.kAY.isEmpty());
    }

    public final lbl<lbn> cov() {
        return this.kAY;
    }

    public final ldv coe() {
        return this.iOl;
    }

    public final List<bpj> wr() {
        return this.kBa;
    }

    public final void cow() {
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, fkx.class, this.kAZ);
        lin.a(bl, this.cdh, this.iOl, 1, this.kAX);
    }

    static /* synthetic */ List a(hjv hjv2, List list) {
        hjv2.kBa = list;
        return hjv2.kBa;
    }

    static /* synthetic */ ldl a(hjv hjv2) {
        return hjv2.kAY;
    }
}

