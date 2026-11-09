/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class ahe
extends agj {
    private boolean aXX = false;
    private alu[] aXY = null;
    private ldv aXZ = null;
    private boolean aYb = false;
    private int aYc = -1;
    private int aYa = 0;
    private ldv afF = null;
    private int Qw = 0;
    private int ResourceType = 0;
    private boolean aYd = false;
    private boolean aYe = false;

    public ahe() {
        super(ahu.b.blX);
        this.bhY = new agj.a[4];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
        this.bhY[3] = new agj.a(this, 8);
    }

    public int Bi() {
        return this.aYa;
    }

    public void cK(ldv ldv2) {
        this.afF = ldv2;
    }

    public void fi(int n) {
        this.aYa = n;
    }

    public void setAlignment(int n) {
        this.Qw = n;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    @Override
    public vd eD(int n) {
        vl vl2 = new vl();
        vl2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vl2.aXP = 1;
            vl2.aXY = this.aXY;
            vl2.aXX = this.aXX;
            vl2.aYb = this.aYb;
            vl2.aYc = this.aYc;
            vl2.aYa = this.aYa;
            vl2.aXZ = this.aXZ;
            vl2.afF = this.afF;
            vl2.Qw = this.Qw;
            vl2.ResourceType = this.ResourceType;
            vl2.aYd = this.aYd;
            vl2.aYe = this.aYe;
            return vl2;
        }
        if (this.eT(2) > n && !this.bhX) {
            vl2.aXP |= 2;
            vl2.aXY = this.aXY;
            vl2.aXX = this.aXX;
            vl2.aYb = this.aYb;
            vl2.aYc = this.aYc;
            vl2.aYa = this.aYa;
            vl2.aXZ = this.aXZ;
            vl2.afF = this.afF;
            vl2.Qw = this.Qw;
            vl2.ResourceType = this.ResourceType;
            vl2.aYd = this.aYd;
            vl2.aYe = this.aYe;
        }
        if (this.eT(8) > n) {
            vl2.aXP |= 8;
            vl2.aXY = this.aXY;
            vl2.aXX = this.aXX;
            vl2.aYb = this.aYb;
            vl2.aYc = this.aYc;
            vl2.aYa = this.aYa;
            vl2.Qw = this.Qw;
            vl2.aYd = this.aYd;
            vl2.aYe = this.aYe;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vl2.aXP = 4;
            vl2.aYa = this.aYa;
        }
        if (vl2.aYa == 0) {
            return null;
        }
        return vl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPartyMemberEventProperty: MemberID=");
        stringBuilder.append(this.aYa);
        stringBuilder.append(" PartyServerGUID=");
        stringBuilder.append(this.aXZ);
        stringBuilder.append(" PlayerObjectGUID=");
        stringBuilder.append(this.afF);
        stringBuilder.append(" Alignment=");
        stringBuilder.append(this.Qw);
        stringBuilder.append(" IsLeader=");
        stringBuilder.append(this.aYb);
        stringBuilder.append(" MainSchool=");
        stringBuilder.append(cxd.xu((int)this.aYc));
        stringBuilder.append(" modifiers=");
        stringBuilder.append(this.aXY);
        stringBuilder.append(" ModifiersChanged=");
        stringBuilder.append(this.aXX);
        stringBuilder.append(" ExcludedFromRoundRobin=");
        stringBuilder.append(this.aYd);
        stringBuilder.append(" LastKillCredited=");
        stringBuilder.append(this.aYe);
        return stringBuilder.toString();
    }

    public void aP(boolean bl) {
        this.aYb = bl;
    }

    public void fj(int n) {
        this.aYc = n;
    }

    public void cL(ldv ldv2) {
        this.aXZ = ldv2;
    }

    public alu[] Bj() {
        return this.aXY;
    }

    public void a(alu[] aluArray) {
        this.aXY = aluArray;
    }

    public boolean Bk() {
        return this.aXX;
    }

    public void aQ(boolean bl) {
        this.aXX = bl;
    }

    public final void aR(boolean bl) {
        this.aYd = bl;
    }

    public final void aS(boolean bl) {
        this.aYe = bl;
    }
}

