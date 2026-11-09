/*
 * Decompiled with CFR.
 */
public class jdm
extends ipx {
    private jch mSc;

    public jdm(jch jch2) {
        this.mSc = jch2;
        this.a(iqo.dmT());
        this.W(ipx.a(1, 10, new ipf[0]));
        ipf ipf2 = this.dyI();
        if (ipf2 != null) {
            this.W(ipx.d(ipf2));
        }
        this.W(ipx.d(this.dyJ()));
        this.W(ipx.a(1, 4, new ipf[0]));
    }

    private ipf dyI() {
        jci jci2 = this.mSc.dxk();
        return jci2 != null ? new ist(isf.mwO, 14, 0xABABAB, jci2.aND()) : null;
    }

    private ipf dyJ() {
        return new ist(isf.mwO, 16, 12357465, this.mSc.aND());
    }
}

