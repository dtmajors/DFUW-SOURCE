/*
 * Decompiled with CFR.
 */
public class jed
extends ipx {
    private ipx mbe;
    private ipb mTD;

    public jed() {
        this.a(iqo.dmT());
        this.mbe = ipx.j(new ipf[0]);
        this.W(this.mbe);
        this.mTD = new ipb("/dfdata/texture/gui/j2f/quests/quest_line_divider.png");
        this.mTD.setVisible(false);
        this.W(ipx.d(this.mTD));
    }

    public int dzo() {
        return this.mbe.bfn();
    }

    public void a(jec jec2) {
        this.mbe.W(jec2);
    }

    public void tb(boolean bl) {
        this.mTD.setVisible(bl);
    }
}

