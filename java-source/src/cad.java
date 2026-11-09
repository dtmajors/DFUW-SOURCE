/*
 * Decompiled with CFR.
 */
public class cad
extends bzy {
    public cak.c bpW = null;

    public final cad aFL() {
        cad cad2 = new cad();
        cad2.GUID = this.GUID;
        cad2.ResourceType = this.ResourceType;
        cad2.bpW = this.bpW;
        return cad2;
    }

    public boolean equals(Object object) {
        if (object instanceof cad) {
            cad cad2 = (cad)object;
            return ldv.au(this.GUID, cad2.GUID);
        }
        return false;
    }

    @Override
    public final bzx vI() {
        return null;
    }

    public String Eg() {
        return this.bpW.name();
    }

    @Override
    public final cak.c auO() {
        return this.bpW;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFeatureItem: GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' LayerType='");
        stringBuilder.append(this.Eg());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

