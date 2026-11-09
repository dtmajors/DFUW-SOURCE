/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;

public abstract class mnq {
    protected Dimension DQt = null;
    private mnx DQu = null;
    protected ljq cDQ = null;
    protected Point DQv = null;
    protected Polygon DQw = null;
    protected String Name = null;
    protected Color DQx = null;
    protected Color DQy = null;
    protected Color DQz = Color.BLACK;
    protected boolean DQA = false;
    protected boolean jV = false;
    protected boolean iTA = false;
    protected boolean DQB = true;
    protected boolean DQC = true;
    protected boolean DQD = false;
    protected String[] DPD = null;

    public mnx eGT() {
        return this.DQu;
    }

    public Point eGU() {
        return this.DQv;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
        this.iTA = this.Name == null ? false : this.iTA;
        this.DQB = this.Name == null ? false : this.DQB;
    }

    public boolean bQR() {
        return this.iTA;
    }

    public void lo(boolean bl) {
        this.iTA = this.Name == null ? false : bl;
    }

    public boolean eGV() {
        return this.DQB;
    }

    public void zC(boolean bl) {
        this.DQB = this.Name == null ? false : bl;
    }

    public Color euP() {
        return this.DQx;
    }

    public void d(Color color) {
        this.DQx = color == null ? this.DQx : color;
    }

    public Color eGW() {
        return this.DQy;
    }

    public void e(Color color) {
        this.DQy = color;
        if (this.DQy == null) {
            this.jV = false;
        }
    }

    public Color eGX() {
        return this.DQz;
    }

    public void f(Color color) {
        this.DQz = color;
        this.DQC = this.DQz != null;
    }

    public boolean eGY() {
        return this.DQC;
    }

    public void zD(boolean bl) {
        this.DQC = this.DQz == null ? false : bl;
    }

    public boolean eGZ() {
        return this.DQy != null;
    }

    public boolean isSelected() {
        return this.jV;
    }

    public boolean zE(boolean bl) {
        boolean bl2 = this.jV;
        this.jV = this.DQy == null ? false : bl;
        return bl2 != this.jV;
    }

    public String eHa() {
        return lcw.dZ((ljq)this.cDQ);
    }

    public void zF(boolean bl) {
        this.eHe();
        if (this.DQv != null && this.DQw != null) {
            this.DQw.translate(-(this.DQv.x - this.DQw.getBounds().width / 2), -(this.DQv.y - this.DQw.getBounds().height / 2));
        }
        this.DQD = bl;
        this.DQv = this.a(this.cDQ, this.DQt);
        if (this.DQv != null && this.DQw != null) {
            this.DQw.translate(this.DQv.x - this.DQw.getBounds().width / 2, this.DQv.y - this.DQw.getBounds().height / 2);
        }
        this.eHd();
    }

    public Color eHb() {
        return this.DQx;
    }

    public Color eHc() {
        return Color.WHITE;
    }

    public boolean a(Point point, float f2, float f3) {
        if (!this.DQA) {
            return false;
        }
        AffineTransform affineTransform = AffineTransform.getTranslateInstance((1.0f - f2) * (float)this.DQv.x, (1.0f - f3) * (float)this.DQv.y);
        affineTransform.scale(f2, f3);
        return affineTransform.createTransformedShape(this.DQw).contains(point);
    }

    protected mnq(mnx mnx2, ljq ljq2, int[] nArray, int[] nArray2, Color color, boolean bl, Dimension dimension) {
        if (nArray != null && nArray2 != null && nArray.length == nArray2.length) {
            this.DQw = new Polygon(nArray, nArray2, nArray.length);
        }
        this.DQt = dimension;
        this.DQu = mnx2;
        this.cDQ = ljq2;
        this.DQD = bl;
        this.DQv = this.a(ljq2, dimension);
        this.DQx = color;
        if (this.DQv != null && this.DQw != null) {
            this.DQw.translate(this.DQv.x - this.DQw.getBounds().width / 2, this.DQv.y - this.DQw.getBounds().height / 2);
        }
        this.DQA = this.DQv != null && this.DQw != null && this.DQx != null;
        this.eHd();
    }

    protected mnq(mnx mnx2, String string, ljq ljq2, int[] nArray, int[] nArray2, Color color, boolean bl, Dimension dimension) {
        this(mnx2, ljq2, nArray, nArray2, color, bl, dimension);
        this.Name = string;
    }

    public void a(Graphics graphics, Dimension dimension, int n, int n2) {
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

    private Point a(ljq ljq2, Dimension dimension) {
        if (ljq2 == null || dimension == null || this.DQw == null) {
            return null;
        }
        if (this.DQD) {
            Point point = new Point();
            double d2 = ljq2.x;
            point.x = (int)((d2 -= (double)lcw.fyl.x) / (double)lcw.qGD.x * (double)dimension.width);
            point.x -= dimension.width * lcw.qGC.cf;
            double d3 = ljq2.rlV;
            point.y = (int)(((double)lcw.fyk.H - (d3 -= (double)lcw.fyl.rlV) / (double)lcw.qGD.rlV) * (double)dimension.height);
            point.y -= dimension.height * lcw.qGC.cg;
            return point;
        }
        String string = lcw.dZ((ljq)ljq2);
        if (string == null) {
            return null;
        }
        lej lej2 = lcw.zg((String)string);
        if (lej2 == null) {
            return null;
        }
        int n = lej2.getX() * dimension.width - lcw.qGC.cf * dimension.width + dimension.width / 2;
        int n2 = (lej2.getY() - 1) * dimension.height - lcw.qGC.cg * dimension.height + dimension.height / 2;
        return new Point(n, n2);
    }

    protected void eHd() {
    }

    protected void eHe() {
    }

    public abstract String[] eHf();
}

