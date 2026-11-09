/*
 * Decompiled with CFR.
 */
public class dcu {
    public static final int gdj = 0;
    public static final int gdk = 1;
    public static final int gdl = 2;
    public static final int gdm = 3;
    public static final int gdn = 4;
    public static final int gdo = 5;
    public static final int gdp = 6;
    public static final int gdq = 7;
    public static final int gdr = 8;
    public static final int gds = 9;
    public static final int gdt = 10;
    public static final int gdu = 11;
    public static final String[] gdv = new String[]{"Level 0", "Level 1-9", "Level 10-19", "Level 20-29", "Level 30-39", "Level 40-49", "Level 50-59", "Level 60-69", "Level 70-79", "Level 80-89", "Level 90-99", "Level 100"};
    private String aLb = null;
    private float[] gdw = null;

    public String getTableName() {
        return this.aLb;
    }

    public void setTableName(String string) {
        this.aLb = string;
    }

    public float[] bju() {
        return this.gdw;
    }

    public void d(float[] fArray) {
        this.gdw = fArray;
    }

    public float gd(float f2) {
        if (f2 == 0.0f) {
            return this.gdw[0];
        }
        int n2 = (int)(f2 / 10.0f + 1.0f);
        return this.gdw[n2];
    }

    public dcu bjv() {
        dcu dcu2 = new dcu();
        dcu2.setTableName(this.aLb);
        float[] fArray = new float[this.gdw.length];
        for (int i2 = 0; i2 < this.gdw.length; ++i2) {
            fArray[i2] = this.gdw[i2];
        }
        dcu2.d(fArray);
        return dcu2;
    }
}

