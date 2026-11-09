/*
 * Decompiled with CFR.
 */
public class icj
extends ios {
    public icj(String string, String string2, String string3, String string4) {
        this.t(new iop(new ipk(0x151515), new ipb(string)));
        this.u(new iop(new ipk(0x151515), new ipb(string2)));
        this.v(new iop(new ipk(0x202020), new ipb(string3)));
        this.w(new iop(new ipk(0x202020), new ipb(string4)));
        this.setActive(true);
    }

    @Override
    public void kh(float f) {
        ((iop)this.dis()).dip().hz(f);
        ((iop)this.dit()).dip().hz(f);
        ((iop)this.diu()).dip().hz(f);
        ((iop)this.div()).dip().hz(f);
    }
}

