/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class jhp
extends jhn {
    private Map<jcn, jho> mTz = lcn.emw();
    private ipk nfk;
    private ipk nfl;

    public jhp(jcm jcm2, boolean bl) {
        super(jcm2, bl);
        List<jcn> list = this.dxS().dxE();
        if (list != null && !list.isEmpty()) {
            if (jcm2.yp() != null || jcm2.dxF() > 0.0) {
                this.W(ipx.a(1, 2, new ipf[0]));
            }
            this.W(this.dGp());
        }
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        if (this.nfk != null) {
            this.nfk.hz(f2);
        }
        if (this.nfl != null) {
            this.nfl.hz(f2);
        }
    }

    private ipf dGp() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(this.cGT());
        ipx2.W(this.cGU());
        return ipx2;
    }

    private ipf cGT() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.nfk = new ipk(0x161616, 16, 1);
        ipx2.W(this.nfk);
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipf[] ipfArray = new ipf[1];
        this.nfl = new ipk(0x161616);
        ipfArray[0] = this.nfl;
        ipx2.W(ipx.c(ipfArray));
        return ipx2;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        List<jcn> list = this.dxS().dxE();
        for (jcn jcn2 : list) {
            ipx2.W(this.a(jcn2, this.dxS().xX()));
        }
        return ipx2;
    }

    private ipf a(jcn jcn2, boolean bl) {
        jho jho2 = new jho(jcn2, this.dxS().xX());
        this.mTz.put(jcn2, jho2);
        return jho2;
    }
}

