/*
 * Decompiled with CFR.
 */
public class gu {
    public ldv GUID = null;
    public ldv Ya = null;
    public ma Yb = null;

    public gu() {
    }

    public gu(ldv ldv2, ldv ldv3, ma ma2) {
        this.GUID = ldv2;
        this.Ya = ldv3;
        this.Yb = ma2;
    }

    public String toString() {
        if (this.GUID == null || this.Ya == null || this.Yb == null) {
            return "Malformed Sensor!!!";
        }
        return "SFObjectInfoManagerSensor{GUID: " + this.GUID.toString() + ", ResponseGUID: " + this.Ya.toString() + ", Key: " + this.Yb.toString() + "}";
    }
}

