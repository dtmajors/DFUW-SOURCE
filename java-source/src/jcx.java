/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class jcx
extends ipx {
    private jco mRV;
    private Map<xa, jcy> mpf = lcn.emw();

    public jcx(jco jco2) {
        this.mRV = jco2;
        this.a(iqo.dmS());
        this.W(ipx.a(20, 1, new ipf[0]));
        this.W(this.b(xa.bal));
        this.W(ipx.c(-1, 0, ipx.d(new ipk(0x2F2F2F, 1, 34))));
        this.W(ipx.c(-2, 0, this.b(xa.baj)));
        this.W(ipx.c(-3, 0, ipx.d(new ipk(0x2F2F2F, 1, 34))));
        this.W(ipx.c(-4, 0, this.b(xa.bak)));
        this.W(ipx.c(-5, 0, ipx.d(new ipk(0x2F2F2F, 1, 34))));
        this.W(ipx.c(-6, 0, this.b(xa.bai)));
        this.mRV.myP.c(new jlr<jcx, itj>(this, this){
            final /* synthetic */ jcx mSw;
            {
                this.mSw = jcx2;
                super(jcx3);
            }

            public void a(jcx jcx2, itj itj2) {
                jcx.a(jcx2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jcx)object, (itj)object2);
            }
        });
    }

    @Override
    public void kh(float f) {
        for (jcy jcy2 : this.mpf.values()) {
            jcy2.kh(f);
        }
    }

    private ipf b(xa xa2) {
        jcy jcy2 = new jcy(this, xa2, xa2){
            final /* synthetic */ xa mSx;
            final /* synthetic */ jcx mSw;
            {
                this.mSw = jcx2;
                this.mSx = xa3;
                super(xa2);
            }

            public void cLq() {
                jcx.b(this.mSw).a(jcc.dwT().a(this.mSx));
            }
        };
        this.mpf.put(xa2, jcy2);
        return jcy2;
    }

    private void dyf() {
        xa xa2;
        xa xa3 = this.dyk();
        if (xa3 != (xa2 = this.dyl())) {
            this.dym();
            this.c(xa2);
        }
    }

    private xa dyk() {
        for (Map.Entry<xa, jcy> entry : this.mpf.entrySet()) {
            if (!entry.getValue().dir()) continue;
            return entry.getKey();
        }
        return null;
    }

    private xa dyl() {
        for (ith ith2 = this.mRV.dqK(); ith2 != null; ith2 = ith2.dqI()) {
            if (!(ith2 instanceof jcd)) continue;
            jcd jcd2 = (jcd)ith2;
            return jcd2.dxb();
        }
        assert (false);
        return null;
    }

    private void dym() {
        for (jcy jcy2 : this.mpf.values()) {
            jcy2.hX(false);
        }
    }

    private void c(xa xa2) {
        jcy jcy2 = this.mpf.get((Object)xa2);
        jcy2.hX(true);
    }

    static /* synthetic */ void a(jcx jcx2) {
        jcx2.dyf();
    }

    static /* synthetic */ jco b(jcx jcx2) {
        return jcx2.mRV;
    }
}

