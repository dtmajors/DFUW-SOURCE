/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  cug
 *  lcw
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Map;

public class mnu
extends mnq {
    private static final Color DQX = Color.CYAN;
    private static final Color DQY = Color.WHITE;
    private static final Color DQZ = new Color(0, 0, 255, 63);
    private static final Color DRa = new Color(0, 255, 0, 63);
    private static final int Size = 8;
    private static final int[] DQG = new int[]{0, 8, 8, 0};
    private static final int[] DQH = new int[]{0, 0, 8, 8};
    private btd DRb = null;
    private ari DRc = null;
    private int DRd = 0;
    private int DRe = 1;
    private int DRf = 0;
    private int DRg = 0;

    @Override
    public void zF(boolean bl) {
        int n = this.DRd;
        this.aeW(0);
        super.zF(bl);
        this.aeW(n);
    }

    public void aeW(int n) {
        int n2;
        this.DRd = n;
        int n3 = 0;
        for (n2 = this.DRd; n2 >= this.DRe; n2 -= this.DRe) {
            n3 += 10;
        }
        if (!this.DQD) {
            this.DQv.translate(10 * n2, n3);
            this.DQw.translate(10 * n2, n3);
        }
    }

    @Override
    public Color eHc() {
        return Color.BLACK;
    }

    public boolean aeX(int n) {
        int n2;
        int n3;
        for (Map.Entry entry : this.DRc.Rp().entrySet()) {
            int n4 = cug.ih((String)((String)entry.getKey()));
            int n5 = cug.a.getMonsterCategoryFromHealth((int)cug.uM((int)n4));
            if (n5 != n) continue;
            return true;
        }
        return this.DRc.Rt() != null && (n3 = cug.a.getMonsterCategoryFromHealth((int)cug.uM((int)(n2 = cug.ih((String)this.DRc.Rt()))))) == n;
    }

    public mnu(btd btd2, ari ari2, boolean bl, boolean bl2, Dimension dimension) {
        super(mnx.DRn, mnu.b(ari2), mnu.b(btd2), DQG, DQH, DQX, bl2, dimension);
        if (bl) {
            this.e(DQY);
        }
        this.DRb = btd2;
        this.DRc = ari2;
        this.DRe = dimension.width / 10;
        this.DRf = this.DRc == null ? 0 : (int)(this.DRc.getRadius() / lcw.qGD.x * (float)dimension.width);
        this.DRg = this.DRf * 2;
    }

    @Override
    protected void eHd() {
        if (!this.DQD) {
            this.DQv.translate(4 - this.DQt.width / 2, 4 - this.DQt.height / 2);
            this.DQw.translate(4 - this.DQt.width / 2, 4 - this.DQt.height / 2);
        }
    }

    @Override
    protected void eHe() {
        if (!this.DQD) {
            this.DQv.translate(-(4 - this.DQt.width / 2), -(4 - this.DQt.height / 2));
            this.DQw.translate(-(4 - this.DQt.width / 2), -(4 - this.DQt.height / 2));
        }
    }

    public void b(Graphics graphics, Dimension dimension, int n, int n2) {
        if (!this.DQD) {
            return;
        }
        if (!this.DQA) {
            return;
        }
        int n3 = (int)((float)this.DQv.x * ((float)dimension.width / (float)this.DQt.width)) - this.DQv.x - n;
        int n4 = (int)((float)this.DQv.y * ((float)dimension.height / (float)this.DQt.height)) - this.DQv.y - n2;
        this.DQv.translate(n3, n4);
        this.DQw.translate(n3, n4);
        int n5 = (int)(this.DRc.getRadius() / lcw.qGD.x * (float)dimension.width);
        int n6 = n5 * 2;
        graphics.setColor(this.jV ? DRa : DQZ);
        graphics.fillOval(this.DQv.x - n5, this.DQv.y - n5, n6, n6);
        this.DQv.translate(-n3, -n4);
        this.DQw.translate(-n3, -n4);
    }

    @Override
    public void a(Graphics graphics, Dimension dimension, int n, int n2) {
        if (!this.DQD) {
            super.a(graphics, dimension, n, n2);
            return;
        }
        if (!this.DQA) {
            return;
        }
        int n3 = (int)((float)this.DQv.x * ((float)dimension.width / (float)this.DQt.width)) - this.DQv.x - n;
        int n4 = (int)((float)this.DQv.y * ((float)dimension.height / (float)this.DQt.height)) - this.DQv.y - n2;
        this.DQv.translate(n3, n4);
        this.DQw.translate(n3, n4);
        graphics.setColor(this.jV ? this.DQy : this.DQx);
        graphics.fillPolygon(this.DQw);
        if (this.DQC) {
            graphics.setColor(this.DQz);
            graphics.drawPolygon(this.DQw);
        }
        if (this.iTA || this.jV && this.DQB) {
            graphics.setColor(Color.WHITE);
            int n5 = graphics.getFontMetrics().stringWidth(this.Name);
            graphics.drawString(this.Name, this.DQv.x - n5 / 2, this.DQv.y - this.DQw.getBounds().height / 2 - 4);
        }
        this.DQv.translate(-n3, -n4);
        this.DQw.translate(-n3, -n4);
    }

    @Override
    public String[] eHf() {
        if (!this.DQA) {
            return null;
        }
        if (this.DPD == null) {
            int n = this.DRc.Rp().size();
            if (this.DRc.Rt() != null) {
                n += 2;
            }
            this.DPD = new String[n + 1];
            this.DPD[0] = "Monster Spawn";
            int n2 = 1;
            for (Map.Entry entry : this.DRc.Rp().entrySet()) {
                int n3 = cug.ih((String)((String)entry.getKey()));
                int n4 = cug.a.getMonsterCategoryFromHealth((int)cug.uM((int)n3));
                String string = cug.uG((int)n3);
                this.DPD[n2++] = string + " [Level: " + n4 + "]";
            }
            if (this.DRc.Rt() != null) {
                this.DPD[n2++] = "-- Boss --";
                int n5 = cug.ih((String)this.DRc.Rt());
                int n6 = cug.a.getMonsterCategoryFromHealth((int)cug.uM((int)n5));
                String string = cug.uG((int)n5);
                this.DPD[n2++] = string + " [Level: " + n6 + "]";
            }
        }
        return this.DPD;
    }

    private static String b(ari ari2) {
        if (ari2 == null) {
            return null;
        }
        String string = "";
        for (String string2 : ari2.Rp().keySet()) {
            string = string + (string.isEmpty() ? "" : ", ") + string2;
        }
        return string;
    }

    private static ljq b(btd btd2) {
        return btd2 == null ? null : btd2.av();
    }
}

