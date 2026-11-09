/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ihb
extends ipx {
    private igp lUO;

    public ihb(igp igp2) {
        this.lUO = igp2;
        this.a(new iqu(22, 22));
        this.W(new ipb("button_tag_" + igp2.name().toLowerCase() + "_off_normal"));
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(this.lUO.cNq().bD(new Object[0]).exA());
    }
}

