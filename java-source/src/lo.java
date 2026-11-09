/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class lo {
    public static final int auF = 0;
    public static final int ATTRIBUTE = 1;
    private int Type = -1;
    private String ResourceName = null;
    private int ResourceType = -1;
    private float auG = 0.0f;
    private float auH = 0.0f;

    public lo(int n, int n2, float f) {
        this.Type = n;
        this.ResourceType = n2;
        this.auG = f;
        this.auH = f;
        this.ResourceName = this.pn();
    }

    private String pn() {
        switch (this.Type) {
            case 0: {
                return lea.enZ().getName(this.ResourceType);
            }
            case 1: {
                return ep.aM((int)this.ResourceType);
            }
        }
        assert (false);
        return "Unknow Type:" + this.ResourceType;
    }

    public int bH(String string) {
        switch (this.Type) {
            case 0: {
                return lea.enZ().getType(string);
            }
            case 1: {
                return ep.as((String)string);
            }
        }
        return -1;
    }

    public boolean isAttribute() {
        return this.Type == 1;
    }

    public final float po() {
        return this.auG;
    }

    public final void H(float f) {
        this.auG = f;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final int getType() {
        return this.Type;
    }

    public final void setType(int n) {
        this.Type = n;
    }

    public final String pa() {
        return this.ResourceName;
    }

    public lo pp() {
        return new lo(this.Type, this.ResourceType, this.auG);
    }

    public final float pq() {
        return this.auH;
    }
}

