/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 */
public class cyw {
    private final cwx boj;
    private dbo[] fZa = null;
    private ddb[] fZb = null;

    public cyw(cwx cwx2) {
        this.boj = cwx2;
    }

    public final dbo[] bej() {
        return this.fZa;
    }

    public final void a(dbo[] dboArray) {
        this.fZa = dboArray;
    }

    public final ddb[] ben() {
        return this.fZb;
    }

    public final void a(ddb[] ddbArray) {
        this.fZb = ddbArray;
    }

    public final void m(cwx cwx2) {
        int n2;
        int n3;
        Object[] objectArray;
        if (this.fZa != null) {
            objectArray = new dbo[this.fZa.length];
            n3 = objectArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                objectArray[n2] = this.fZa[n2].biZ();
            }
            cwx2.a((dbo[])objectArray);
        }
        if (this.fZb != null) {
            objectArray = new ddb[this.fZb.length];
            n3 = objectArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                objectArray[n2] = this.fZb[n2].bjI();
            }
            cwx2.a((ddb[])objectArray);
        }
    }

    public final void b(cxd.p p2) {
        this.f(p2);
        this.h(p2);
    }

    public final void a(cxd.p p2, ddc ddc2) {
        this.f(p2);
        this.b(p2, ddc2);
    }

    public final void a(cxd.p p2, boolean bl, boolean bl2, boolean bl3) {
        if (bl3) {
            this.a(p2, bl2);
        }
        if (bl) {
            this.i(p2);
        }
    }

    private void f(cxd.p p2) {
        assert (p2 != null);
        if (this.fZa == null) {
            return;
        }
        int n2 = this.fZa.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.fZa[i2].biV() != p2) continue;
            this.boj.b(this.fZa[i2]);
        }
    }

    private void a(cxd.p p2, boolean bl) {
        cxo cxo2;
        assert (p2 != null);
        if (this.fZa == null) {
            return;
        }
        this.boj.aJz().bgQ().aJD().aDc().aDh();
        int n2 = this.fZa.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.fZa[i2].biV() != p2 || this.fZa[i2].biX() == cxd.i.fRq) continue;
            this.boj.c(this.fZa[i2]);
        }
        if (this.boj instanceof cxo && bl && (cxo2 = (cxo)this.boj).bfX() != null) {
            ddf ddf2 = cxo2.bfX();
            dde[] ddeArray = ddf2.gee;
            for (dbo dbo2 : cxo2.bej()) {
                this.c(dbo2);
            }
            int n3 = ddeArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                if (!(ddeArray[i3] instanceof ddd)) continue;
                ddd ddd2 = (ddd)ddeArray[i3];
                this.c(ddd2.bjQ());
                break;
            }
        }
    }

    private void c(dbo dbo2) {
        ldv ldv2 = this.boj.aJz().b(dbo2.biW());
        if (ldv2 == null) {
            return;
        }
        dzw dzw2 = (dzw)this.boj.aJz().bgQ().getMessageDelegator().h(7426, this.boj.aJz().bgQ().getGUID(), ldv2);
        dzw2.ijH = dbo2.aDI();
        this.boj.aJz().bgQ().getMessageDelegator().F(dzw2);
    }

    private boolean g(cxd.p p2) {
        if (this.fZb == null) {
            return false;
        }
        int n2 = this.fZb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.fZb[i2].biV() != p2) continue;
            return true;
        }
        return false;
    }

    private void h(cxd.p p2) {
        assert (p2 != null);
        if (this.fZb == null) {
            return;
        }
        int n2 = this.fZb.length;
        block4: for (int i2 = 0; i2 < n2; ++i2) {
            if (this.fZb[i2].biV() != p2) continue;
            switch (p2) {
                case fSc: {
                    this.boj.aJz().bgS().a(this.boj.zg(), this.fZb[i2], null, this.boj);
                    continue block4;
                }
                case fSf: {
                    ljq ljq2 = null;
                    if (this.boj.beo().dOf) {
                        ljq2 = this.boj.beo().dph;
                    }
                    if (this.boj.beW()) {
                        this.boj.aJz().bgS().a(this.boj.zg(), this.fZb[i2], null, this.boj);
                        continue block4;
                    }
                    this.boj.aJz().bgS().a(this.boj.zg(), this.fZb[i2], ljq2);
                    continue block4;
                }
                default: {
                    this.boj.aJz().bgS().a(this.boj.zg(), this.fZb[i2], null);
                }
            }
        }
    }

    private void b(cxd.p p2, ddc ddc2) {
        assert (p2 != null);
        assert (ddc2 != null);
        if (this.fZb == null) {
            return;
        }
        int n2 = this.fZb.length;
        block5: for (int i2 = 0; i2 < n2; ++i2) {
            if (this.fZb[i2].biV() != p2) continue;
            switch (p2) {
                case fSc: {
                    this.boj.aJz().bgS().a(this.boj.zg(), this.fZb[i2], ddc2, this.boj);
                    continue block5;
                }
                case fSf: {
                    if (ddc2.doT == -2.0f) {
                        this.boj.aJz().bgS().a(this.boj.zg(), this.fZb[i2], ddc2, this.boj);
                        continue block5;
                    }
                    this.boj.aJz().bgS().a(this.fZb[i2], ddc2, this.boj);
                    continue block5;
                }
                case fSi: 
                case fSl: 
                case fSm: {
                    this.boj.aJz().bgS().a(this.fZb[i2], ddc2, this.boj);
                    continue block5;
                }
                default: {
                    lfn.b(5, "SFSkillObjectManager", "startSpecialEffectsUsingParams() Invalid skillparttype provided: " + (Object)((Object)p2));
                }
            }
        }
    }

    private void i(cxd.p p2) {
        assert (p2 != null);
        switch (p2) {
            case fSc: {
                assert (this.boj.bel() != null);
                if (this.boj.bel() instanceof dcn) {
                    if (this.g(p2)) break;
                    return;
                }
                lfn.b(5, "SFSkillObjectManager", "stopSpecialEffects() SkillController is not a charging skillcontroller.");
                return;
            }
            case fSf: {
                if (!this.boj.bft() && !this.boj.beW()) {
                    lfn.b(5, "SFSkillObjectManager", "stopSpecialEffects() Performing skilltimer has not infinite duration.");
                    return;
                }
                if (this.g(p2)) break;
                return;
            }
            default: {
                lfn.b(5, "SFSkillObjectManager", "stopSpecialEffects() SpecialEffects for skillpart '" + p2.name() + "' can't be stopped.");
                return;
            }
        }
        this.boj.aJz().bgS().ze(this.boj.zg());
    }
}

