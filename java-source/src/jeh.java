/*
 * Decompiled with CFR.
 */
public class jeh
extends jei {
    private double lfT;

    public jeh() {
        super("RatingMessageWindow", "RatingMessage.swf");
    }

    @Override
    public void initialize() {
        super.initialize();
        this.lfT = this.MessageDelegator.arc().rgz;
    }

    protected void cEc() {
        if (this.isVisible()) {
            double d2 = this.MessageDelegator.arc().rgz - this.lfT;
            int n = (int)(d2 / 3600.0);
            String string = lxw.tzf.bD(n).exA();
            this.a("setText", new Object[]{string});
        }
    }
}

