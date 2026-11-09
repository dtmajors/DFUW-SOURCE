/*
 * Decompiled with CFR.
 */
public class gh {
    private static gh WA;
    private a WB = a.WC;

    private gh() {
    }

    public static gh hX() {
        if (WA == null) {
            WA = new gh();
        }
        return WA;
    }

    public boolean hY() {
        return this.WB == a.WD;
    }

    public void a(a a2) {
        if (a2 == null) {
            String string = "State is null.";
            assert (false) : "State is null.";
            lfn.b(5, this.getClass().getSimpleName(), "setState() : State is null.");
            return;
        }
        if (this.WB != null && a2.ordinal() < this.WB.ordinal()) {
            String string = "NewState [" + (Object)((Object)a2) + "] has a lower ordinal than current state [" + (Object)((Object)this.WB) + "]";
            assert (false) : string;
            lfn.b(5, this.getClass().getSimpleName(), "setState() : " + string);
            return;
        }
        this.WB = a2;
    }
}

