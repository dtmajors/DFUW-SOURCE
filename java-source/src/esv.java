/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class esv
extends dxq
implements dxu {
    public bdv iBx;
    public int aqs;

    public static final esv a(eso eso2, ldv ldv2, bdv bdv2, int n) {
        esv esv2 = (esv)eso2.CW(18180);
        esv2.a(ldv2, bdv2);
        esv2.sk(n);
        return esv2;
    }

    public esv() {
        super(18180);
    }

    protected final void a(ldv ldv2, bdv bdv2) {
        this.f(lcr.aTZ);
        this.on(ldv2);
        this.iBx = bdv2;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }
}

