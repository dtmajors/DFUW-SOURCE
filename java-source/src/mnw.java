/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class mnw
extends mnq {
    private static final Color DQE = Color.BLUE;
    private static final Color DQF = Color.YELLOW;
    private static final int DQI = 14;
    private static final int jsC = 7;
    private static final int[] DQJ = new int[]{0, 14, 14, 0};
    private static final int[] DQK = new int[]{0, 0, 14, 14};

    public mnw() {
        super(mnx.DRl, "", null, null, null, DQE, true, null);
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
        graphics.fillOval(this.DQv.x - 7, this.DQv.y - 7, 14, 14);
        if (this.DQC) {
            graphics.setColor(this.DQz);
            graphics.drawOval(this.DQv.x - 7, this.DQv.y - 7, 14, 14);
        }
        if (this.iTA || this.jV && this.DQB) {
            graphics.setColor(Color.WHITE);
            int n5 = graphics.getFontMetrics().stringWidth(this.Name);
            graphics.drawString(this.Name, this.DQv.x - n5 / 2, this.DQv.y - 7 - 4);
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
            this.DPD[1] = "Fortress";
        }
        return this.DPD;
    }
}

