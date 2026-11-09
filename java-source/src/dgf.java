/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class dgf
extends dgb {
    private boolean gpW = false;
    private boolean lX = true;
    private Set<dey> gpX = lcn.emx();

    public dgf() {
        this.gpB = (short)5;
    }

    @Override
    public void updateAtom(float f2) {
        if (!this.lX) {
            return;
        }
        if (this.gpX.contains(gpF)) {
            this.lX = false;
            return;
        }
        this.gpX.add(gpF);
        if (this.gpW && gpF instanceof dfm) {
            gpE.checkNonFirstPersonSpecialEffect((dfm)gpF);
        }
    }

    public boolean isHideInFirstPersonMode() {
        return this.gpW;
    }

    public void setHideInFirstPersonMode(boolean bl) {
        this.gpW = bl;
    }
}

