/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class mnv
extends mnq {
    private static final Color DQE = Color.GREEN;
    private static final Color DQF = Color.YELLOW;
    private static final int DQI = 20;
    private static final int jsC = 10;
    private static final int[] DQJ = new int[]{0, 20, 20, 0};
    private static final int[] DQK = new int[]{0, 0, 20, 20};

    @Override
    public Color eHc() {
        return Color.BLACK;
    }

    public mnv(String string, ljq ljq2, boolean bl, boolean bl2, Dimension dimension) {
        super(mnx.DRj, string, ljq2, DQJ, DQK, DQE, bl2, dimension);
        if (bl) {
            this.e(DQF);
        }
    }

    @Override
    public void a(Graphics graphics, Dimension dimension, int n, int n2) {
        if (!this.DQA) {
            return;
        }
        int n3 = (int)((float)this.DQv.x * ((float)dimension.width / (float)this.DQt.width)) - this.DQv.x - n;
        int n4 = (int)((float)this.DQv.y * ((float)dimension.height / (float)this.DQt.height)) - this.DQv.y - n2;
        this.DQv.translate(n3, n4);
        graphics.setColor(this.jV ? this.DQy : this.DQx);
        graphics.fillOval(this.DQv.x - 10, this.DQv.y - 10, 20, 20);
        if (this.DQC) {
            graphics.setColor(this.DQz);
            graphics.drawOval(this.DQv.x - 10, this.DQv.y - 10, 20, 20);
        }
        if (this.iTA || this.jV && this.DQB) {
            graphics.setColor(Color.WHITE);
            int n5 = graphics.getFontMetrics().stringWidth(this.Name);
            graphics.drawString(this.Name, this.DQv.x - n5 / 2, this.DQv.y - 10 - 4);
        }
        this.DQv.translate(-n3, -n4);
    }

    @Override
    public String[] eHf() {
        if (!this.DQA) {
            return null;
        }
        if (this.DPD == null) {
            this.DPD = new String[2];
            this.DPD[0] = this.getName();
            this.DPD[1] = "NPC City";
        }
        return this.DPD;
    }
}

