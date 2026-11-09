/*
 * Decompiled with CFR.
 */
public class bzs
extends bzy {
    public boolean aYp = false;
    public float edX = 0.0f;
    private bzx edY = null;
    public int aYr = 0;

    @Override
    public final bzx vI() {
        return this.edY;
    }

    public final void aFv() {
        assert (this.edY == null);
        this.edY = new bzx();
    }

    public final bzs aFw() {
        assert (this.GUID != null);
        bzs bzs2 = new bzs();
        bzs2.GUID = this.GUID;
        bzs2.ResourceType = this.ResourceType;
        bzs2.aYp = this.aYp;
        bzs2.edX = this.edX;
        bzs2.aYr = this.aYr;
        return bzs2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFApparelItem: GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' HasPaperdollItem=");
        stringBuilder.append(this.aYp);
        return stringBuilder.toString();
    }
}

