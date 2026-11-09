/*
 * Decompiled with CFR.
 */
public class ihc
extends iox {
    private igp lUO;
    private iox lUa;
    private ist lUP;
    private iuy lUQ;

    public ihc(igp igp2, boolean bl) {
        this.lUO = igp2;
        this.a(iqo.dmS());
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(ipx.d(ipx.a(22, 22, this.b(igp2))));
        this.W(ipx.a(2, 1, new ipf[0]));
        this.W(ipx.d(this.c(igp2)));
        this.W(ipx.c(new ipf[0]));
        this.W(new ihh());
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(ipx.d(this.cVS()));
        this.W(ipx.a(8, 1, new ipf[0]));
        this.hX(bl);
    }

    public igp cVR() {
        return this.lUO;
    }

    @Override
    public void aTg() {
        if (this.lUa == null) {
            return;
        }
        this.lUa.ri(this.dkb());
        this.lUa.hX(this.dir());
        this.lUa.qZ(this.dil());
        this.lUQ.ri(this.dkb());
        this.lUQ.hX(this.dir());
        this.lUQ.qZ(this.dil());
    }

    private ipf b(igp igp2) {
        String string = igp2.name().toLowerCase();
        this.lUa = new ion("button_tag_" + string + "_off_disabled", "button_tag_" + string + "_off_normal", "button_tag_" + string + "_off_hover", "button_tag_" + string + "_off_pushing", "button_tag_" + string + "_on_disabled", "button_tag_" + string + "_on_normal", "button_tag_" + string + "_on_hover", "button_tag_" + string + "_on_pushing");
        return this.lUa;
    }

    private ipf c(igp igp2) {
        this.lUP = new ist();
        this.lUP.a(isf.mwO, 14);
        this.lUP.g(igp2.cNq());
        this.lUP.Rk(0xABABAB);
        return this.lUP;
    }

    private ipf cVS() {
        this.lUQ = new iuy();
        return this.lUQ;
    }
}

