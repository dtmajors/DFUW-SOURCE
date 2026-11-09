/*
 * Decompiled with CFR.
 */
public class jbk
extends iai {
    private String lob;

    public jbk(int n, int n2, String string) {
        super("PaperdollAttributeTooltipWindow", "PaperdollAttributeTooltip.swf", n, n2, 0, 0, hyd.lnh);
        this.lob = string;
    }

    @Override
    protected void cJU() {
        this.a("setText", new Object[]{this.lob});
    }
}

