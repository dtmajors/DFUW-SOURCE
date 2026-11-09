/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;

public class mof {
    lfn ga = lfn.eqw();
    private float DRD = 0.0f;
    private float DRE = 10000.0f;
    private int DRF = 100;
    private double DRG = Math.PI * 2;
    private float DRH = 10.0f;
    private ljq Position = null;
    private ljq my = null;
    private lek DRI = null;
    private Color DRJ = new Color(1.0f, 0.0f, 1.0f);
    private String DRK = null;
    private boolean DRL = false;
    private final String DEV = ".jpg";
    private ImageIcon DRM;

    public mof() {
    }

    private void eHm() {
        String string = jry.tp(this.DRK);
        int n = (string = jry.tu(string) + ".xml").lastIndexOf(".");
        if (n > 0) {
            File file = null;
            String string2 = lcw.qLb + "worldbuilder/thumbnails/" + string.substring(0, n);
            if (!string.substring(n).equalsIgnoreCase(".jpg")) {
                file = new jrw(string2 + ".jpg");
            }
            if (file != null && file.exists()) {
                this.DRM = new ImageIcon(Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath()));
            } else {
                lfn.b(0, "SFScatterObjectDialog", "initDialog() File does not exist = " + file);
            }
        }
    }

    public mof(mof mof2) {
        if (mof2 != null) {
            this.DRD = mof2.eHn();
            this.DRE = mof2.eHo();
            this.DRF = mof2.eHt();
            this.DRH = mof2.eHr();
            this.DRG = mof2.eHp();
            this.Position = new ljq(mof2.av());
            this.my = new ljq(mof2.getRotation());
            this.DRJ = new Color(mof2.eHs().getRGB());
            this.DRK = mof2.eHq();
            this.DRL = mof2.DRL;
        }
    }

    public float eHn() {
        return this.DRD;
    }

    public void oz(float f2) {
        this.DRD = f2;
    }

    public float eHo() {
        return this.DRE;
    }

    public void oA(float f2) {
        this.DRE = f2;
    }

    public double eHp() {
        return this.DRG;
    }

    public String eHq() {
        return this.DRK;
    }

    public void CH(String string) {
        this.DRK = string;
        this.eHm();
    }

    public float eHr() {
        return this.DRH;
    }

    public void oB(float f2) {
        this.DRH = f2;
    }

    public Color eHs() {
        return this.DRJ;
    }

    public void g(Color color) {
        this.DRJ = color;
    }

    public int eHt() {
        return this.DRF;
    }

    public void afa(int n) {
        this.DRF = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public lek eHu() {
        return this.DRI;
    }

    public void n(lek lek2) {
        this.DRI = lek2;
    }

    public String toString() {
        return "ScatterObj. Position [" + this.Position + "] , MinDistanceToNextObject[" + this.DRH + "], SFFile [" + this.DRK + "]";
    }

    public boolean eFC() {
        return this.DRL;
    }

    public void zG(boolean bl) {
        this.DRL = bl;
    }

    public ImageIcon eHv() {
        return this.DRM;
    }
}

