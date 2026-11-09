/*
 * Decompiled with CFR.
 */
public class iei
extends ipx {
    private ipb lNa;
    private ipb lNn;
    private ipx lNo;

    public iei(String string) {
        this.a(irl.dnr());
        this.lNa = new ipb(string, 48, 48);
        this.W(this.lNa);
        this.lNn = new ipb();
        this.W(this.lNn);
        this.lNo = ipx.d(-10, -5, new ipb("/dfdata/texture/gui/j2f/clanperks/perk_icon_active_indication.png"));
        this.W(this.lNo);
        this.lNo.rg(false);
        this.aTg();
    }

    public void aTg() {
        if (!this.djR()) {
            this.lNa.hz(0.1f);
            this.lNn.qP("/dfdata/texture/gui/j2f/clanperks/perk_icon_outline_disabled.png");
            this.lNo.setVisible(false);
        } else if (this.djZ()) {
            this.lNa.hz(1.0f);
            this.lNn.qP("/dfdata/texture/gui/j2f/clanperks/perk_icon_outline_active.png");
            this.lNo.setVisible(true);
        } else {
            this.lNa.hz(1.0f);
            this.lNn.qP("/dfdata/texture/gui/j2f/clanperks/perk_icon_outline_normal.png");
            this.lNo.setVisible(false);
        }
    }

    @Override
    public void cPv() {
        this.aTg();
    }

    @Override
    public void cPw() {
        this.aTg();
    }
}

