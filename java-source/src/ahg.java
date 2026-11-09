/*
 * Decompiled with CFR.
 */
public class ahg
extends agj {
    private int aYf = -1;
    private int aYg = -1;
    private boolean biH = false;
    private long aYh = -1L;

    public ahg() {
        super(ahu.b.blZ);
        this.bhY = new agj.a[4];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 8);
        this.bhY[3] = new agj.a(this, 4);
    }

    @Override
    public vd eD(int n) {
        vm vm2 = new vm();
        vm2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vm2.aXP = 1;
            vm2.aYf = this.aYf;
            return vm2;
        }
        if (this.eT(2) > n && !this.bhX) {
            vm2.aXP |= 2;
            vm2.aYf = this.aYf;
        }
        if (this.eT(8) > n) {
            vm2.aXP |= 8;
            vm2.aYf = this.aYf;
            vm2.aYg = this.aYg;
            vm2.Active = this.biH;
            vm2.aYh = this.aYh;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vm2.aXP = 4;
            vm2.aYf = this.aYf;
        }
        if (vm2.aYf < 0) {
            lfn.b(5, "SFPerkEventProperty", "getEventPropertyUpdate() SkillType is not set in propertyupdate.");
            lfn.b(5, "SFPerkEventProperty", "getEventPropertyUpdate() TimeSliceNumber=" + n);
            this.gt();
            assert (false);
        }
        return vm2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPerkEventProperty: PerkType ='");
        stringBuilder.append(this.Bl());
        stringBuilder.append("' Tier='");
        stringBuilder.append(this.aYg);
        stringBuilder.append("' IsActive='");
        stringBuilder.append(this.biH);
        stringBuilder.append("' ExpirationTime='");
        stringBuilder.append(this.aYh);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    private String Bl() {
        return lea.epN().qe(this.aYf).aOL().name();
    }

    public final int Bm() {
        return this.aYf;
    }

    public final void fl(int n) {
        this.aYf = n;
    }

    public final boolean Bn() {
        return this.biH;
    }

    public final void aT(boolean bl) {
        this.biH = bl;
    }

    public final int Bo() {
        return this.aYg;
    }

    public final void fm(int n) {
        this.aYg = n;
    }

    public final long Bp() {
        return this.aYh;
    }

    public final void v(long l) {
        this.aYh = l;
    }
}

