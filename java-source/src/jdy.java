/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class jdy
extends ipx {
    private List<jcl> mSh;

    public jdy(List<jcl> list, boolean bl) {
        this.mSh = list;
        this.a(iqo.dmS());
        this.W(ipx.a(8, 1, new ipf[0]));
        ipx ipx2 = new ipx(this, irl.dnr(), bl){
            final /* synthetic */ boolean mTv;
            final /* synthetic */ jdy mTw;
            {
                this.mTw = jdy2;
                this.mTv = bl;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ((this.mTv ? lxu.tyJ : lxu.tyK).bD(new Object[0]).exA().toUpperCase());
            }
        };
        this.W(ipx2);
        ipx2.W(ipx.a(40, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_rewards.png")));
        this.W(new ipk(0x2F2F2F, 1, 1));
        this.W(ipx.a(12, 1, new ipf[0]));
        this.W(this.ta(bl));
    }

    public jdy(jcm jcm2) {
        this(jcc.dwW().ea(jcm2.qS()), true);
    }

    private ipf ta(boolean bl) {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(440, 8, new ipf[0]));
        int n = 0;
        for (jcl jcl2 : this.mSh) {
            if (n > 0) {
                ipx2.W(ipx.a(1, 8, new ipf[0]));
            }
            ipx2.W(new jdx(jcl2, bl));
            ++n;
        }
        ipx2.W(ipx.a(440, 8, new ipf[0]));
        return ipx2;
    }
}

