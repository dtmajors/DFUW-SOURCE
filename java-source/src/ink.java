/*
 * Decompiled with CFR.
 */
public class ink
extends ipx {
    private ist lUP;

    public ink() {
        this.a(irl.dnr());
        ipk ipk2 = new ipk(0x161616);
        ipk2.hz(0.8f);
        this.W(ipk2);
        ipt ipt2 = new ipt(0x313131);
        this.W(ipt2);
        this.lUP = new ist(isf.mwM, 11, 0xABABAB);
        this.W(ipx.d(this.lUP));
    }

    public ist dan() {
        return this.lUP;
    }
}

