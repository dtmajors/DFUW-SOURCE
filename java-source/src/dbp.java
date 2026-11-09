/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bxm
 *  cdb
 */
public class dbp
extends dbo {
    private cxd.e gcq = null;
    private cxc gcr = null;

    public cxd.e bjc() {
        return this.gcq;
    }

    public void a(cxd.e e2) {
        this.gcq = e2;
    }

    public cxc bjd() {
        return this.gcr;
    }

    public void ci(cxc cxc2) {
        this.gcr = cxc2;
    }

    @Override
    public int aDI() {
        return this.bje();
    }

    @Override
    protected void d(dbo dbo2) {
        super.d(dbo2);
        dbp dbp2 = (dbp)dbo2;
        dbp2.a(this.gcq);
    }

    private int bje() {
        assert (this.gcr != null);
        assert (this.gcr.aJz() != null);
        assert (this.gcr.aJz().bgQ() != null);
        assert (this.gcr.aJz().bgQ().aJD() != null);
        cdb cdb2 = this.gcr.aJz().bgQ();
        if (cdb2 instanceof cev) {
            if (cdb2.fi().ap(10400) == 3) {
                switch (this.gcq) {
                    case fQM: {
                        return 16777663;
                    }
                    case fQN: {
                        return 16777661;
                    }
                    case fQQ: {
                        return 0x10001C0;
                    }
                    case fQR: {
                        return 16777662;
                    }
                }
            }
            bxm bxm2 = ((cev)cdb2).aLU().aFi();
            switch (this.gcq) {
                case fQJ: {
                    return bxm2.aDv();
                }
                case fQK: {
                    return bxm2.aDw();
                }
                case fQL: {
                    return bxm2.aDx();
                }
                case fQM: {
                    return bxm2.aDm();
                }
                case fQN: {
                    return bxm2.aDn();
                }
                case fQO: {
                    return bxm2.aDy();
                }
                case fQP: {
                    return bxm2.aDz();
                }
                case fQQ: {
                    return bxm2.aDo();
                }
                case fQR: {
                    return bxm2.aDp();
                }
                case fQS: {
                    return bxm2.aDA();
                }
                case fQT: {
                    return bxm2.aDu();
                }
            }
            lfn.b(5, "SFAnimationInfoDynamic", "getCurrentAnimationState(P) Invalid dynamicanimationtype provided: " + (Object)((Object)this.gcq));
            return -1;
        }
        if (cdb2 instanceof cdt) {
            bxk bxk2 = ((cdt)cdb2).aKt().aDY();
            switch (this.gcq) {
                case fQM: {
                    return bxk2.aDm();
                }
                case fQN: {
                    return bxk2.aDn();
                }
                case fQQ: {
                    return bxk2.aDo();
                }
                case fQR: {
                    return bxk2.aDp();
                }
                case fQU: {
                    return bxk2.aDq();
                }
            }
            lfn.b(5, "SFAnimationInfoDynamic", "getCurrentAnimationState(GM) Invalid dynamicanimationtype provided: " + (Object)((Object)this.gcq));
            return -1;
        }
        lfn.b(5, "SFAnimationInfoDynamic", "getCurrentAnimationState() Unhandled creatureobject provided: " + cdb2.getClass().getName());
        assert (false);
        return -1;
    }
}

