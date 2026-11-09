/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkw
extends btk
implements bto {
    private dgj gEE = null;
    private dgj[] gEF = null;

    public void d(dgj dgj2) {
        this.gEE = dgj2;
    }

    public dgj[] bnY() {
        return this.gEF;
    }

    public void a(dgj[] dgjArray) {
        this.gEF = dgjArray;
    }

    public boolean bnZ() {
        if (this.gEE != null && this.gEE.getDuration() == -2.0f) {
            return true;
        }
        assert (this.gEF != null);
        int n = this.gEF.length;
        for (int i = 0; i < n; ++i) {
            if (this.gEF[i].isInheritDuration() || this.gEF[i].getState() == 6) continue;
            return false;
        }
        return true;
    }

    @Override
    public void cleanUp() {
        assert (this.gEF != null);
        int n = this.gEF.length;
        for (int i = 0; i < n; ++i) {
            if (this.gEF[i].getState() == 6) continue;
            this.MessageDelegator.hd(this.gEF[i].getGUID());
        }
    }

    public dkw boa() {
        assert (this.gEE != null);
        assert (this.gEF != null);
        dkw dkw2 = new dkw();
        dgj[] dgjArray = new dgj[this.gEF.length];
        int n = this.gEF.length;
        for (int i = 0; i < n; ++i) {
            assert (!this.gEF[i].isMainEffect());
            assert (this.gEF[i].getEffectInstanceID() > 0);
            dgjArray[i] = this.gEF[i].createCopy();
            dgjArray[i].setEffectInstanceID(this.gEF[i].getEffectInstanceID());
            dgjArray[i].setSubEffect(true);
        }
        dkw2.a(dgjArray);
        return dkw2;
    }

    @Override
    public void doTick(ldz ldz2) {
        int n;
        assert (this.gEF != null);
        int n2 = this.gEF.length;
        for (n = 0; n < n2; ++n) {
            if (this.gEF[n].getState() == 6) continue;
            if (this.gEF[n].hasInfiniteDuration()) {
                this.gEF[n].doTick(ldz2);
                continue;
            }
            double d2 = this.gEF[n].getDuration();
            Float f = this.gEF[n].getAudioDuration();
            if (f != null) {
                if (f.floatValue() != -1.0f) {
                    if (f.doubleValue() > d2) {
                        d2 = f.doubleValue();
                    }
                } else {
                    this.gEF[n].doTick(ldz2);
                    continue;
                }
            }
            if (ldz2.rgz > this.gEF[n].getStartTime().rgz + d2) {
                if (this.gEF[n].getState() != 5) {
                    this.gEF[n].doTick(ldz2);
                    continue;
                }
                this.MessageDelegator.hd(this.gEF[n].getGUID());
                continue;
            }
            this.gEF[n].doTick(ldz2);
        }
        if (this.gEE == null) {
            n2 = this.gEF.length;
            for (n = 0; n < n2; ++n) {
                if (this.gEF[n].getState() == 6) continue;
                return;
            }
            this.MessageDelegator.hd(this.GUID);
        }
    }

    public int bob() {
        if (this.gEF == null || this.gEF.length == 0) {
            return 1;
        }
        int n = 1;
        int n2 = this.gEF.length;
        for (int i = 0; i < n2; ++i) {
            if (this.gEF[i].getEffectInstanceID() <= n) continue;
            n = this.gEF[i].getEffectInstanceID();
        }
        return ++n;
    }

    @Override
    public void initialize() {
        assert (this.gEE != null);
        assert (this.gEF != null);
        this.setActive(false);
        int n = this.gEF.length;
        for (int i = 0; i < n; ++i) {
            assert (!this.gEF[i].isMainEffect());
            assert (this.gEF[i].isSubEffect());
            this.gEF[i].setParentEffect(this.gEE);
            this.gEF[i].setGUID(this.gEE.getNewEffectGuid());
            this.gEF[i].setServerObject(this.gEE.isServerObject());
            this.gEF[i].setSourceObjectGUID(this.gEE.getSourceObjectGUID());
            this.gEF[i].setSourcePosition(this.gEE.getSourcePosition());
            this.gEF[i].setSourceRotation(this.gEE.getSourceRotation());
            this.gEF[i].setTargetObjectGUID(this.gEE.getTargetObjectGUID());
            this.gEF[i].setTargetPosition(this.gEE.getTargetPosition());
            this.gEF[i].setStartTime(this.gEE.getStartTime());
            if (this.gEF[i].isInheritDuration()) {
                this.gEF[i].setDuration((double)this.gEE.getDuration());
            }
            this.MessageDelegator.a((amf)this.gEF[i]);
        }
    }

    public void e(dgj dgj2) {
        if (dgj2 == null) {
            return;
        }
        if (dgj2.isMainEffect()) {
            return;
        }
        assert (dgj2.getEffectInstanceID() > 0);
        if (this.gEF == null) {
            this.gEF = new dgj[]{dgj2};
        } else {
            dgj[] dgjArray = new dgj[this.gEF.length + 1];
            for (dgj dgjArray[var3_3] : this.gEF) {
            }
            dgjArray[this.gEF.length] = dgj2;
            this.gEF = dgjArray;
            dgj2.setParentEffect(this.gEE);
        }
    }

    public void f(dgj dgj2) {
        if (dgj2 == null) {
            return;
        }
        if (dgj2.isMainEffect()) {
            return;
        }
        assert (dgj2.getEffectInstanceID() > 0);
        if (this.gEF == null) {
            this.gEF = new dgj[]{dgj2};
        } else {
            int n = -1;
            int n2 = this.gEF.length;
            for (int i = 0; i < n2; ++i) {
                if (this.gEF[i].getEffectInstanceID() != dgj2.getEffectInstanceID()) continue;
                n = i;
                break;
            }
            if (n < 0) {
                return;
            }
            dgj[] dgjArray = new dgj[this.gEF.length - 1];
            n2 = 0;
            int n3 = this.gEF.length;
            for (int i = 0; i < n3; ++i) {
                if (i == n) continue;
                dgjArray[n2] = this.gEF[i];
                ++n2;
            }
            this.gEF = dgjArray;
        }
    }

    public void boc() {
        int n = this.gEF.length;
        for (int i = 0; i < n; ++i) {
            if (!this.gEF[i].isInheritDuration() || this.gEF[i].getGUID() == null) continue;
            this.MessageDelegator.hd(this.gEF[i].getGUID());
        }
    }
}

