/*
 * Decompiled with CFR.
 */
public class jgo
extends jgq {
    public jgo() {
        super("SmallNotificationBottomWindow", "SmallNotificationBottom.swf");
    }

    public void E(String string, boolean bl) {
        if (string == null || string.endsWith("DESCRIPTION IN THE RESOURCETREE")) {
            return;
        }
        this.a("setDescriptionText", new Object[]{string, bl});
    }
}

