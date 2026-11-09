/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class mny
extends mnq {
    private static final Color DQE = Color.WHITE;
    private static final Color DQF = Color.GREEN;
    private static final int DQI = 16;
    private static final int jsC = 8;
    private static final int[] DQJ = new int[]{0, 16, 16, 0};
    private static final int[] DQK = new int[]{0, 0, 16, 16};
    private cqd DRp = null;

    @Override
    public Color eHc() {
        return Color.BLACK;
    }

    public String bsp() {
        return this.DRp.getID();
    }

    public mny(cqd cqd2, boolean bl, boolean bl2, Dimension dimension) {
        super(mnx.DRi, mny.a(cqd2), mny.b(cqd2), DQJ, DQK, DQE, bl2, dimension);
        if (bl) {
            this.e(DQF);
        }
        this.DRp = cqd2;
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
        graphics.fillOval(this.DQv.x - 8, this.DQv.y - 8, 16, 16);
        if (this.DQC) {
            graphics.setColor(this.DQz);
            graphics.drawOval(this.DQv.x - 8, this.DQv.y - 8, 16, 16);
        }
        if (this.iTA || this.jV && this.DQB) {
            graphics.setColor(Color.WHITE);
            int n5 = graphics.getFontMetrics().stringWidth(this.Name);
            graphics.drawString(this.Name, this.DQv.x - n5 / 2, this.DQv.y - 8 - 4);
        }
        this.DQv.translate(-n3, -n4);
    }

    @Override
    public String[] eHf() {
        if (!this.DQA || this.DRp == null) {
            return null;
        }
        if (this.DPD == null) {
            this.DPD = new String[3];
            this.DPD[0] = this.DRp.aYw();
            this.DPD[1] = "Player Village";
            int n = 0;
            for (cqc cqc2 : this.DRp.aYA()) {
                if (!cqc2.aYr()) continue;
                ++n;
            }
            this.DPD[2] = "Houses: " + n;
        }
        return this.DPD;
    }

    private static String a(cqd cqd2) {
        return cqd2 == null ? null : cqd2.aYw();
    }

    private static ljq b(cqd cqd2) {
        return cqd2 == null ? null : cqd2.aYu().apU();
    }
}

