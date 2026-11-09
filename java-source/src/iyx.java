/*
 * Decompiled with CFR.
 */
public class iyx
extends iok {
    private ipf lMX;

    public iyx(boolean bl) {
        super("ClearAllBitmapDisabled", "ClearAllBitmapNormal", "ClearAllBitmapHover", "ClearAllBitmapPushing");
        if (bl) {
            this.lMX = new ipb("filter_bar_bg_clear");
            this.c(this.lMX, 0);
        }
    }

    @Override
    public void kh(float f2) {
        if (this.lMX != null) {
            this.lMX.hz(f2);
        }
    }
}

