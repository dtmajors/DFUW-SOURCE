/*
 * Decompiled with CFR.
 */
public class iey
extends hzk {
    static inr lPG;

    public iey() {
        super("ContextMenu", "ContextMenu.swf");
        this.a(hya.lmr, false);
        this.a(hya.lms, false);
        this.OQ(jnz.nGg);
        this.a(hyb.lmG);
        this.a(hxu.lle);
        this.N(1.0f, 1.0f);
    }

    public void initialize() {
        super.initialize();
    }

    public void cBa() {
        super.cBa();
        this.a("setButtonText", new Object[]{"btnTopLeft", "TopLeft"});
        this.a("setButtonText", new Object[]{"btnTop", "Top"});
        this.a("setButtonText", new Object[]{"btnTopRight", "TopRight"});
        this.a("setButtonText", new Object[]{"btnLeft", "Left"});
        this.a("setButtonText", new Object[]{"btnCenter", "Center"});
        this.a("setButtonText", new Object[]{"btnRight", "Right"});
        this.a("setButtonText", new Object[]{"btnBottomLeft", "BottomLeft"});
        this.a("setButtonText", new Object[]{"btnBottom", "Bottom"});
        this.a("setButtonText", new Object[]{"btnBottomRight", "BottomRight"});
    }

    protected void a(String string, mhk[] mhkArray) {
        jnz jnz2 = jnz.nFE;
        if (string.equals("clickMenuButton") && mhkArray != null && mhkArray.length >= 1 && mhkArray[0].eyY() == mhs.STRING) {
            String string2 = ((mhr)mhkArray[0]).Value;
        }
        hso.cxK().a(jnz2);
    }
}

