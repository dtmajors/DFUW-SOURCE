/*
 * Decompiled with CFR.
 */
public class izq
extends ipx {
    private iqa lUU;
    private ipb mDA;
    private boolean mDB;

    public izq(boolean bl) {
        this.mDB = bl;
        this.lUU = new iqa("/dfdata/texture/gui/j2f/common/windows/tooltip_menu.png", 10, 20, 10, 20);
        this.W(this.lUU);
        this.mDA = new ipb(this.mDB ? "/dfdata/texture/gui/j2f/common/windows/tooltip_menu_arrow_down.png" : "/dfdata/texture/gui/j2f/common/windows/tooltip_menu_arrow_up.png");
        this.W(this.mDA);
    }

    public izq() {
        this(true);
    }

    @Override
    public void cPk() {
        this.lUU.r(0, 0, this.getWidth(), this.getHeight());
        this.mDA.ek(this.getWidth() / 2 - this.mDA.getWidth() / 2, this.mDB ? this.getHeight() - this.mDA.getHeight() : 0);
    }
}

