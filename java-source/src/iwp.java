/*
 * Decompiled with CFR.
 */
public class iwp
extends ios {
    private ist[] mAO = new ist[4];

    public iwp(loz loz2, String string, String string2, String string3, String string4) {
        this.t(this.a(0, isf.mwO, 14, 0x888888, loz2, string));
        this.u(this.a(1, isf.mwO, 14, 0xABABAB, loz2, string2));
        this.v(this.a(2, isf.mwO, 14, 0xC0C0C0, loz2, string3));
        this.w(this.a(3, isf.mwO, 14, 12357465, loz2, string4));
        this.setActive(true);
    }

    public String getText() {
        return this.mAO[0].getText();
    }

    public void e(itd itd2) {
        for (ist ist2 : this.mAO) {
            ist2.e(itd2);
        }
    }

    public void o(loz loz2) {
        for (ist ist2 : this.mAO) {
            ist2.o(loz2);
        }
    }

    public void setText(String string) {
        for (ist ist2 : this.mAO) {
            ist2.setText(string);
        }
    }

    private ipf a(int n, isf isf2, int n2, int n3, loz loz2, String string) {
        ipf[] ipfArray = new ipf[2];
        ipf[] ipfArray2 = new ipf[1];
        this.mAO[n] = new ist(isf2, n2, n3, loz2);
        ipfArray2[0] = this.mAO[n];
        ipfArray[0] = ipx.d(ipfArray2);
        ipfArray[1] = ipx.d(new ipb(string));
        return ipx.l(ipfArray);
    }
}

