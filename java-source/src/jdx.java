/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jdx
extends ipx {
    private static final int mTt = 10;
    private jcl mTu;

    public jdx(jcl jcl2, boolean bl) {
        this.mTu = jcl2;
        this.a(iqo.dmS());
        if (bl) {
            this.W(ipx.d(new ipk(0x202020, 3, 22)));
        }
        this.W(this.sZ(bl));
        if (bl) {
            this.W(ipx.d(new ipk(0x202020, 3, 22)));
        }
    }

    private ipf sZ(boolean bl) {
        ipx ipx2 = ipx.h(new ipf[0]);
        if (bl) {
            ipx2.W(new ipt(0x202020, 398, 1));
        } else {
            ipx2.W(ipx.a(398, 1, new ipf[0]));
        }
        ipx2.W(this.dzb());
        return ipx2;
    }

    private ipf dzb() {
        ipx ipx2 = ipx.j(new ipf[0]);
        List<jck> list = this.mTu.Al();
        if (list == null || list.isEmpty()) {
            return ipx2;
        }
        int n = list.size();
        int n2 = n / 10;
        if (n % 10 > 0) {
            ++n2;
        }
        int n3 = 0;
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        for (jck jck2 : list) {
            ipx3.W(new jdv(jck2, 36, true));
            if (++n3 < 10) {
                ipx3.W(ipx.a(2, 1, new ipf[0]));
                continue;
            }
            n3 = 0;
            ipx2.W(ipx.a(1, 2, new ipf[0]));
            ipx3 = ipx.l(new ipf[0]);
            ipx2.W(ipx3);
        }
        return ipx2;
    }
}

