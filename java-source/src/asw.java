/*
 * Decompiled with CFR.
 */
import java.util.Set;

public abstract class asw
extends btk
implements asl {
    private static final Integer bXF = new Integer(0);
    private final Set<asn> bXG = lcn.emx();
    private ljq Position;
    private final int ResourceType;
    protected Integer bXH;
    protected Boolean bXI;
    protected ldv ade;
    protected boolean bXJ;
    protected final ldv bRN;
    protected ldv bXK;
    protected final ldv Ri;
    protected ldv bWM;
    protected boolean bWN;
    protected boolean bRL;
    protected boolean bXL;
    protected boolean bRO;

    public asw(ldv ldv2, ldv ldv3, int n, boolean bl) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (n > 0);
        this.bRN = ldv2;
        this.Ri = ldv3;
        this.ResourceType = n;
        this.bRL = false;
        this.bXL = bl;
        this.bRO = true;
    }

    public boolean isAlive() {
        return this.bRO;
    }

    @Override
    public void a(asn asn2) {
        this.bXG.add(asn2);
    }

    public ldv iG() {
        return this.ade;
    }

    public float i(ljq ljq2, ljq ljq3) {
        if (this.Position == null) {
            return -1.0f;
        }
        if (ljq2 == null) {
            return -1.0f;
        }
        ljq3.x = this.Position.x - ljq2.x;
        ljq3.y = this.Position.y - ljq2.y;
        ljq3.rlV = this.Position.rlV - ljq2.rlV;
        return (float)Math.sqrt(ljq3.x * ljq3.x + ljq3.y * ljq3.y + ljq3.rlV * ljq3.rlV);
    }

    public ldv KY() {
        return this.bRN;
    }

    public ldv qd() {
        return this.Ri;
    }

    public int az() {
        return this.ResourceType;
    }

    public boolean US() {
        return bXF.compareTo(this.bXH) <= 0;
    }

    public boolean gC() {
        return this.bXI;
    }

    public boolean UT() {
        return this.bXL;
    }

    public boolean lh() {
        return this.bRL;
    }

    @Override
    public void b(asm asm2) {
        if (asm2 == null) {
            return;
        }
        if (!asm2.St()) {
            return;
        }
        for (asn asn2 : this.bXG) {
            asn2.a(asm2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8195: {
                this.b((gzp)dxq2);
                break;
            }
            case 8196: {
                this.b((gzq)dxq2);
                break;
            }
            case 8197: {
                this.a((gzu)dxq2);
                break;
            }
            case 5636: {
                this.c((fuu)dxq2);
                break;
            }
            case 12548: {
                this.a((fbf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void b(asn asn2) {
        this.bXG.remove(asn2);
    }

    public void UU() {
        if (this.bXK == null) {
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, this.bRN);
            fut2.Ib(1);
            fut2.iXu = true;
            this.MessageDelegator.F(fut2);
        } else {
            this.UX();
        }
    }

    public void UV() {
        if (this.bXJ) {
            fbg fbg2 = (fbg)this.MessageDelegator.h(12547, this.GUID, this.bXK);
            fbg2.iHR = this.GUID;
            this.MessageDelegator.F(fbg2);
            this.bXJ = false;
        }
    }

    public void terminate() {
        this.UW();
        this.UV();
        this.selfDestruct();
        this.MessageDelegator.oa(this.GUID);
    }

    @Override
    public String toString() {
        return null;
    }

    private void UW() {
        if (this.bWN) {
            gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, this.Ri);
            gzr2.bWM = this.bWM;
            this.MessageDelegator.F(gzr2);
            this.bWN = false;
            this.MessageDelegator.oa(this.bWM);
            this.bWM = null;
        }
    }

    private void c(int n, ej ej2) {
        assert (n > 0);
        if (n <= 0) {
            return;
        }
        if (ej2 == null) {
            lfn.b(5, "SFAITowerTarget", "handleAttribute() attribute==null");
            assert (false);
            return;
        }
        block0 : switch (n) {
            case 1: {
                switch (ej2.getType()) {
                    case 1296: {
                        this.bXH = (Integer)ej2.getValue();
                        if (this.bXH == null) break block0;
                        this.b(new aru(this.bXH, this.bXI, this.bRN, this.bRL, this.bXL, this.bRO));
                        break;
                    }
                    case 9840: {
                        this.ade = (ldv)ej2.getValue();
                        this.b(new arv(this.ade, this.Ri, this.bRN, this.bRL));
                        break;
                    }
                    case 1312: {
                        this.bXI = (Boolean)ej2.getValue();
                        if (this.bXI == null) break block0;
                        this.b(new aru(this.bXH, this.bXI, this.bRN, this.bRL, this.bXL, this.bRO));
                        break;
                    }
                    case 1488: {
                        if (ej2.getValue() == null) break block0;
                        this.Position = new ljq(((fc)ej2.getValue()).Position);
                        this.Position.y += 1.2f;
                        break;
                    }
                    case 1136: {
                        if (ej2.getValue() == null) break block0;
                        this.bRL = ((ew)ej2).fQ() > hc.aaz.ordinal();
                        this.b(new aru(this.bXH, this.bXI, this.bRN, this.bRL, this.bXL, this.bRO));
                        this.b(new arv(this.ade, this.Ri, this.bRN, this.bRL));
                        break;
                    }
                }
                break;
            }
            case 2: {
                switch (ej2.getType()) {
                    case 1296: {
                        this.bXH = (Integer)ej2.getValue();
                        this.b(new aru(this.bXH, this.bXI, this.bRN, this.bRL, this.bXL, this.bRO));
                        break;
                    }
                    case 1312: {
                        this.bXI = (Boolean)ej2.getValue();
                        this.b(new aru(this.bXH, this.bXI, this.bRN, this.bRL, this.bXL, this.bRO));
                        break;
                    }
                    case 9840: {
                        this.ade = (ldv)ej2.getValue();
                        this.b(new arv(this.ade, this.Ri, this.bRN, this.bRL));
                        break;
                    }
                    case 1488: {
                        if (this.Position == null) {
                            this.Position = new ljq(((fc)ej2.getValue()).Position);
                        } else {
                            this.Position.ex(((fc)ej2.getValue()).Position);
                        }
                        this.Position.y += 1.2f;
                        break;
                    }
                    case 1136: {
                        if (ej2.getValue() == null) break block0;
                        this.bRL = ((ew)ej2).fQ() > hc.aaz.ordinal();
                        break;
                    }
                }
                break;
            }
            default: {
                assert (false) : "Invalid EventType provided: " + n;
                break;
            }
        }
    }

    private void c(fuu fuu2) {
        if (fuu2.dtj == null) {
            return;
        }
        this.bXK = fuu2.dtj;
        this.UX();
    }

    private void a(gzu gzu2) {
        if (gzu2.jvJ == 1) {
            // empty if block
        }
    }

    private void UX() {
        if (!this.bXJ) {
            fbb fbb2 = (fbb)this.MessageDelegator.h(12545, this.GUID, this.bXK);
            fbb2.iHR = this.GUID;
            int[] nArray = new int[]{5, 6, 7, 9};
            fbb2.dhI = nArray;
            this.MessageDelegator.F(fbb2);
            this.bXJ = true;
        }
    }

    protected void b(gzp gzp2) {
        if (gzp2.aXP <= 0) {
            return;
        }
        if (gzp2.bhp == null) {
            return;
        }
        if (!this.bWM.equals(gzp2.aO())) {
            return;
        }
        this.c(gzp2.aXP, gzp2.bhp);
    }

    protected void b(gzq gzq2) {
        ej[] ejArray;
        if (gzq2.DR == null) {
            return;
        }
        if (!this.bWM.equals(gzq2.aO())) {
            return;
        }
        this.bWN = true;
        for (ej ej2 : ejArray = gzq2.DR) {
            this.c(1, ej2);
        }
    }

    protected abstract void a(fbf var1);

    protected void TR() {
        throw new UnsupportedOperationException("Not supported! (Maybe you should overwrite this.)");
    }

    protected int b(fbf fbf2) {
        bfn bfn2 = fbf2.iIb;
        if (bfn2 == null) {
            assert (false);
            return -1;
        }
        switch (bfn2.Type) {
            case 5: 
            case 6: 
            case 7: {
                this.bRO = false;
                break;
            }
            case 9: {
                this.bRO = true;
                break;
            }
            default: {
                return -1;
            }
        }
        return this.bRO ? 0 : 1;
    }
}

