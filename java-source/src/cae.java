/*
 * Decompiled with CFR.
 */
public class cae {
    private cad eeB = null;

    public cad aFM() {
        return this.eeB;
    }

    public void b(cad cad2) {
        this.eeB = cad2;
    }

    public cae aFN() {
        cae cae2 = new cae();
        return cae2;
    }

    public int DW() {
        if (this.eeB == null) {
            return -1;
        }
        return this.eeB.bpW.ordinal();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFeatureLayerSlot: ");
        if (this.eeB == null) {
            stringBuilder.append(" FeatureItem=null");
        } else {
            stringBuilder.append(this.eeB);
        }
        return stringBuilder.toString();
    }
}

