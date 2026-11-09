/*
 * Decompiled with CFR.
 */
public class vi
extends vd {
    public ldv GUID = null;
    public ldv aXQ = null;
    public ldv aXR = null;
    public int ResourceType = 0;
    public int asi = 0;
    public float aXy = 0.0f;
    public int aCJ = -1;
    public int aXS = -1;
    public boolean aXT = false;
    public long aXU = 0L;

    public vi() {
        super(24);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ResourceName='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        vi vi2 = (vi)uk2;
        vi2.GUID = this.GUID;
        vi2.aXQ = this.aXQ;
        vi2.aXR = this.aXR;
        vi2.ResourceType = this.ResourceType;
        vi2.asi = this.asi;
        vi2.aXy = this.aXy;
        vi2.aCJ = this.aCJ;
        vi2.aXS = this.aXS;
        vi2.aXT = this.aXT;
        vi2.aXU = this.aXU;
    }
}

