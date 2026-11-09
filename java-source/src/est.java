/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class est
extends dxq
implements dxu {
    public bdq iBv;
    public int aqs;

    public static final est a(eso eso2, ldv ldv2, bdq bdq2) {
        est est2 = (est)eso2.CW(18179);
        est2.a(ldv2, bdq2);
        return est2;
    }

    public est() {
        super(18179);
    }

    protected final void a(ldv ldv2, bdq bdq2) {
        this.f(ldv2);
        this.on(lcr.aTZ);
        this.iBv = bdq2;
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

