/*
 * Decompiled with CFR.
 */
public class cyd
extends cxo {
    private ljq[] fXG = null;
    private int fXX = -1;
    private float fXY = 0.0f;
    private boolean fXZ = true;
    private boolean fYa = false;

    public ljq[] bgv() {
        return this.fXG;
    }

    public void d(ljq[] ljqArray) {
        this.fXG = ljqArray;
    }

    public int bgG() {
        return this.fXX;
    }

    public void yE(int n2) {
        this.fXX = n2;
    }

    public float bgH() {
        return this.fXY;
    }

    public void fH(float f2) {
        this.fXY = f2;
    }

    public boolean bgI() {
        return this.fXZ;
    }

    public void ho(boolean bl) {
        this.fXZ = bl;
    }

    public boolean bgJ() {
        return this.fYa;
    }

    public void hp(boolean bl) {
        this.fYa = bl;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cyd cyd2 = (cyd)((Object)cxc2);
        ljq[] ljqArray = new ljq[this.fXG.length];
        for (int i2 = 0; i2 < ljqArray.length; ++i2) {
            if (this.fXG[i2] == null) continue;
            ljqArray[i2] = this.fXG[i2].esF();
        }
        cyd2.d(ljqArray);
        cyd2.yE(this.fXX);
        cyd2.fH(this.fXY);
        cyd2.ho(this.fXZ);
        cyd2.hp(this.fYa);
    }

    protected void beA() {
        assert (this.fGh.ecU != null);
        boolean[] blArray = this.fGh.ecU;
        ljq ljq2 = new ljq();
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            if (!blArray[i2] || this.fXG[i2] == null) continue;
            this.f(ljq2, this.fXG[i2], 0.0f);
        }
        this.l(this.emI.bgQ().getGUID(), ljq2);
    }

    private void f(ljq ljq2, ljq ljq3, float f2) {
        ljq2.x += ljq3.x * f2;
        ljq2.y += ljq3.y * f2;
        ljq2.rlV += ljq3.rlV * f2;
    }

    private void l(ldv ldv2, ljq ljq2) {
        gaf gaf2 = (gaf)this.MessageDelegator.h(6402, this.GUID, ldv2);
        gaf2.Iw(1);
        gaf2.cN(ljq2);
        gaf2.ho(this.fXZ);
        gaf2.hp(this.fYa);
        gaf2.lE(true);
        gaf2.lG(true);
        lfn.b(0, "SFMovementSkill", "sendPhysicsMessage() Skill '" + this.getName() + "' applies the force " + ljq2 + " on skillowner.");
        this.MessageDelegator.H(gaf2);
    }
}

