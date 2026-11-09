/*
 * Decompiled with CFR.
 */
public class cba
extends bzy {
    public boolean aXT = false;
    public float edX = 0.0f;
    private bzx edY = null;

    @Override
    public final bzx vI() {
        return this.edY;
    }

    public final void aFv() {
        assert (this.edY == null);
        this.edY = new bzx();
    }

    public cba aHk() {
        cba cba2 = new cba();
        cba2.GUID = this.GUID;
        cba2.ResourceType = this.ResourceType;
        cba2.aXT = this.aXT;
        cba2.edX = this.edX;
        return cba2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFWeaponItem: GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Sheathed=");
        stringBuilder.append(this.aXT);
        return stringBuilder.toString();
    }
}

