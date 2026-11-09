/*
 * Decompiled with CFR.
 */
import java.awt.Color;

public class kyi {
    public kza qjd = new kza();
    public kza qje = new kza();
    public Color qjf = new Color(151, 153, 153);
    public Color qjg = new Color(0, 204, 204);
    public Color qjh = Color.BLUE;
    public Color qji = new Color(255, 0, 255);
    public Color qjj = new Color(165, 91, 66);
    public Color qjk = new Color(255, 51, 51);
    public Color qjl = new Color(255, 51, 51);
    public Color qjm = Color.WHITE;
    public Color qjn = Color.BLACK;
    public Color qjo = new Color(255, 255, 223);
    public boolean qjp = true;
    public boolean qjq = false;
    public boolean qjr = true;
    public boolean qjs = false;
    public int qjt = 0;
    public long qju = 1000L;
    public int qjv = 4;
    public String[] qjw = new String[0];
    public kyk[] qjx = new kyk[0];
    public kyz[] qjy = null;

    public void xD(String string) {
        if (string == null) {
            lfn.b(5, "SFLogViewConfig", "addDirectory() Directory is null.");
            return;
        }
        if (this.qjw == null) {
            this.qjw = new String[]{string};
        } else if (this.xF(string) >= 0) {
            lfn.b(0, "SFLogViewConfig", "addDirectory() Directory is already added.");
        } else {
            String[] stringArray = new String[this.qjw.length + 1];
            System.arraycopy(this.qjw, 0, stringArray, 0, this.qjw.length);
            stringArray[this.qjw.length] = string;
            this.qjw = stringArray;
        }
    }

    public void xE(String string) {
        if (string == null) {
            lfn.b(5, "SFLogViewConfig", "removeDirectory() Directory is null.");
            return;
        }
        if (this.qjw == null) {
            return;
        }
        int n = this.xF(string);
        if (n < 0) {
            lfn.b(0, "SFLogViewConfig", "addDirectory() Could not find directory.");
        } else if (this.qjw.length == 1) {
            this.qjw = null;
        } else {
            String[] stringArray = new String[this.qjw.length - 1];
            int n2 = 0;
            for (int i2 = 0; i2 < this.qjw.length; ++i2) {
                if (i2 == n) continue;
                stringArray[n2] = this.qjw[i2];
                ++n2;
            }
            this.qjw = stringArray;
        }
    }

    private int xF(String string) {
        if (this.qjw == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.qjw.length; ++i2) {
            if (!this.qjw[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        return -1;
    }
}

