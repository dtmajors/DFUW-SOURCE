/*
 * Decompiled with CFR.
 */
public class iva
extends iuz {
    private iox mAG;

    public iva(isf isf2, int n, int n2, loz loz2, int n3, int n4) {
        super(isf2, n, n2, loz2, n3, n4);
        this.W(ipx.a(8, 1, new ipf[0]));
    }

    public iva(isf isf2, int n, int n2, loz loz2, int n3, int n4, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        super(isf2, n, n2, loz2, n3, n4);
        if (string != null) {
            this.c(ipx.a(4, 1, new ipf[0]), 0);
            this.c(ipx.d(ipx.a(22, 22, this.a(string, string2, string3, string4, string5, string6, string7, string8))), 1);
            this.c(ipx.a(4, 1, new ipf[0]), 2);
        }
        this.W(ipx.a(8, 1, new ipf[0]));
    }

    public iva(isf isf2, int n, int n2, loz loz2, int n3, int n4, boolean bl) {
        super(isf2, n, n2, loz2, n3, n4);
        this.c(ipx.a(30, 22, new ipf[0]), 0);
        this.W(ipx.a(8, 1, new ipf[0]));
    }

    @Override
    public void cND() {
        this.aTg();
    }

    @Override
    public void aTg() {
        iuy iuy2;
        ist ist2;
        if (this.mAG != null) {
            this.mAG.hX(this.dir());
        }
        if ((ist2 = this.drd()) != null) {
            ist2.Rk(this.dir() ? 12357465 : 0xABABAB);
        }
        if ((iuy2 = this.dst()) != null) {
            iuy2.hX(this.dir());
        }
    }

    private ipf a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.mAG = new ion(string, string2, string3, string4, string5, string6, string7, string8);
        this.mAG.a(ipn.msf);
        return this.mAG;
    }
}

