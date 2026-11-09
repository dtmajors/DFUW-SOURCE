/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iye
extends irz {
    public iye() {
        this.h(new iqa("/dfdata/texture/gui/j2f/chat/chat_main_window_bg_tileable.png", 0, 0, 0, 0));
        this.a(new iyg(this){
            final /* synthetic */ iye mBF;
            {
                this.mBF = iye2;
            }

            public void d(joa joa2) {
                this.mBF.d(joa2);
            }
        });
    }

    public iyi Tg(int n) {
        return (iyi)super.SE(n);
    }

    public void a(boolean bl, boolean bl2, int n) {
        this.Tg(n).v(bl, bl2);
    }

    public void a(ipf ipf2, String string, String string2, int n) {
        this.a(ipf2, (ipf)iya.rD(string), new iyd(string2), n);
    }

    public void a(ipf ipf2, String string, String string2) {
        this.a(ipf2, (ipf)iya.rD(string), new iyd(string2), this.doH());
    }

    @Override
    public void kh(float f2) {
        if (this.dip() != null) {
            this.dip().hz(f2);
        }
        if (this.doG() != null) {
            this.doG().kh(f2);
        }
    }

    @Override
    public isb cMK() {
        return new iyi(this){
            final /* synthetic */ iye mBF;
            {
                this.mBF = iye2;
            }

            public ifg dy(int n, int n2) {
                return this.mBF.a(this, n, n2);
            }

            public void cGR() {
                this.mBF.a(this);
            }

            public void cbU() {
                this.mBF.b(this);
            }
        };
    }

    @Override
    public hyn doJ() {
        return new ixy();
    }

    @Override
    public void a(hyn hyn2, int n, int n2) {
        super.a(hyn2, n - 10, n2 - 16);
    }

    @Override
    public /* synthetic */ isb SE(int n) {
        return this.Tg(n);
    }
}

