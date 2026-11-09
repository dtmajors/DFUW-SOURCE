/*
 * Decompiled with CFR.
 */
public class us
extends vd {
    public int ID = 0;
    public String aFo = null;
    public String aXn = null;
    public int ResourceType = 0;
    public ljq Position = null;
    public boolean aFp = false;

    public us() {
        super(2);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        us us2 = (us)uk2;
        us2.ID = this.ID;
        us2.aFo = this.aFo;
        us2.aXn = this.aXn;
        us2.ResourceType = this.ResourceType;
        us2.Position = new ljq(this.Position.x, this.Position.y, this.Position.rlV);
        us2.aFp = this.aFp;
    }
}

