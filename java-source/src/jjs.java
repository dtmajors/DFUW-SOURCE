/*
 * Decompiled with CFR.
 */
public class jjs
extends iai {
    private String npH;

    public jjs(String string, int n, int n2, int n3, int n4) {
        super("WorldMapTooltipWindow", "WorldMapTooltip.swf", n, n2, n3, n4);
        this.npH = string;
    }

    public void setText(String string, String string2) {
        this.a("setText", new Object[]{string, string2});
    }

    @Override
    protected void cJU() {
        this.a("setData", new Object[]{this.npH});
    }
}

