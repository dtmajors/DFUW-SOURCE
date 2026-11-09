/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;

public class mnr
extends mnq {
    private static final Color DQE = Color.YELLOW;
    private static final Color DQF = Color.GREEN;
    private static final int Size = 10;
    private static final int[] DQG = new int[]{0, 10, 10, 0};
    private static final int[] DQH = new int[]{0, 0, 10, 10};

    @Override
    public Color eHc() {
        return Color.BLACK;
    }

    public mnr(String string, ljq ljq2, boolean bl, boolean bl2, Dimension dimension) {
        super(mnx.DRm, string, ljq2, DQG, DQH, DQE, bl2, dimension);
        if (bl) {
            this.e(DQF);
        }
    }

    @Override
    protected void eHd() {
        if (!this.DQD) {
            this.DQv.translate(this.DQt.width / 2 - 5 - 2, this.DQt.height / 2 - 5 - 2);
            this.DQw.translate(this.DQt.width / 2 - 5 - 2, this.DQt.height / 2 - 5 - 2);
        }
    }

    @Override
    protected void eHe() {
        if (!this.DQD) {
            this.DQv.translate(-(this.DQt.width / 2 - 5 - 2), -(this.DQt.height / 2 - 5 - 2));
            this.DQw.translate(-(this.DQt.width / 2 - 5 - 2), -(this.DQt.height / 2 - 5 - 2));
        }
    }

    @Override
    public String[] eHf() {
        if (!this.DQA) {
            return null;
        }
        if (this.DPD == null) {
            this.DPD = new String[2];
            this.DPD[0] = this.getName();
            this.DPD[1] = "Chaos Bindstone";
        }
        return this.DPD;
    }
}

