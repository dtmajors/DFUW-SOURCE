/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class agp
extends agt {
    private int ResourceType = 0;
    private int asi = 0;
    private float aXy = 0.0f;
    private long aXU = 0L;
    private int aCJ = -1;
    private int aXS = -1;
    private boolean aXT = true;

    public agp() {
        super(ahu.b.blU);
        this.bhY = new agj.a[13];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
        this.bhY[3] = new agj.a(this, 64);
        this.bhY[4] = new agj.a(this, 128);
        this.bhY[5] = new agj.a(this, 256);
        this.bhY[6] = new agj.b(this, 512);
        this.bhY[7] = new agj.b(this, 1024);
        this.bhY[8] = new agj.b(this, 2048);
        this.bhY[9] = new agj.b(this, 4096);
        this.bhY[10] = new agj.b(this, 8192);
        this.bhY[11] = new agj.b(this, 16384);
        this.bhY[12] = new agj.a(this, 32768);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public long AQ() {
        return this.aXU;
    }

    public void u(long l) {
        this.aXU = l;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    public float getWeight() {
        return this.aXy;
    }

    public void setWeight(float f) {
        this.aXy = f;
    }

    public int AR() {
        return this.aCJ;
    }

    public void fc(int n) {
        this.aCJ = n;
    }

    public int AS() {
        return this.aXS;
    }

    public void fd(int n) {
        this.aXS = n;
    }

    public boolean AT() {
        return this.aXT;
    }

    public void aN(boolean bl) {
        this.aXT = bl;
    }

    @Override
    public vd eD(int n) {
        vi vi2 = new vi();
        vi2.Uo = this.AJ();
        vi2.aXU = this.aXU;
        if (this.eT(1) > n && !this.bhX) {
            vi2.aXP = 1;
            vi2.GUID = this.GUID;
            vi2.aXQ = this.AW();
            vi2.aXR = this.AV();
            vi2.ResourceType = this.ResourceType;
            vi2.asi = this.asi;
            vi2.aXy = this.aXy;
            vi2.aCJ = this.aCJ;
            vi2.aXS = this.aXS;
            vi2.aXT = this.aXT;
            vi2.aXU = this.aXU;
            if (this.eT(4096) > n) {
                vi2.aXP |= 0x1000;
            }
            if (this.eT(512) > n) {
                vi2.aXP |= 0x200;
            }
            if (this.eT(8192) > n) {
                vi2.aXP |= 0x2000;
            }
            return vi2;
        }
        if (this.eT(2) > n && !this.bhX) {
            vi2.aXP |= 2;
            vi2.GUID = this.GUID;
            vi2.aXQ = this.AW();
            vi2.aXR = this.AV();
            vi2.ResourceType = this.ResourceType;
            vi2.asi = this.asi;
            vi2.aXy = this.aXy;
            vi2.aCJ = this.aCJ;
            vi2.aXS = this.aXS;
            vi2.aXT = this.aXT;
            vi2.aXU = this.aXU;
        }
        if (this.eT(64) > n) {
            vi2.aXP |= 0x48;
            vi2.GUID = this.GUID;
            vi2.aXQ = this.AW();
            vi2.aXR = this.AV();
        }
        if (this.eT(256) > n) {
            vi2.aXP |= 0x108;
            vi2.GUID = this.GUID;
            vi2.aXy = this.aXy;
        }
        if (this.eT(512) > n) {
            vi2.aXP |= 0x208;
            vi2.GUID = this.GUID;
            vi2.aCJ = this.aCJ;
        }
        if (this.eT(1024) > n) {
            vi2.aXP |= 0x408;
            vi2.GUID = this.GUID;
        }
        if (this.eT(2048) > n) {
            vi2.aXP |= 0x808;
            vi2.GUID = this.GUID;
        }
        if (this.eT(4096) > n) {
            vi2.aXP |= 0x1008;
            vi2.GUID = this.GUID;
            vi2.aXT = this.aXT;
        }
        if (this.eT(128) > n) {
            vi2.aXP |= 0x88;
            vi2.GUID = this.GUID;
            vi2.asi = this.asi;
            vi2.aXy = this.aXy;
        }
        if (this.eT(8192) > n) {
            vi2.aXP |= 0x2008;
            vi2.GUID = this.GUID;
            vi2.aXS = this.aXS;
        }
        if (this.eT(16384) > n) {
            vi2.aXP |= 0x4008;
            vi2.GUID = this.GUID;
        }
        if (this.eT(32768) > n) {
            vi2.aXP |= 0x8008;
            vi2.GUID = this.GUID;
            vi2.aCJ = this.aCJ;
            vi2.aXS = this.aXS;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vi2.aXP = 4;
            vi2.GUID = this.GUID;
        }
        if (vi2.GUID == null) {
            return null;
        }
        return vi2;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        return "SFInventoryItemEventProperty: GUID=" + this.GUID + " ResourceType='" + this.pa() + "'";
    }
}

