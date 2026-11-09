/*
 * Decompiled with CFR.
 */
public class bxk
extends bxh {
    private static final boolean dtQ = false;
    private bym dYy = null;

    public bxk(bym bym2) {
        super(bym2);
        this.dYy = bym2;
    }

    @Override
    public byx aDj() {
        return this.dYy;
    }

    public void nh() {
        if (!this.dYr) {
            return;
        }
        this.dYr = false;
        this.dYy.aDZ();
        byv byv2 = this.dYy.aEP();
        if (byv2.vK() != 3 && !byv2.aEy()) {
            return;
        }
        if (!byv2.isAlive()) {
            return;
        }
        byw.b b2 = this.aDl();
        if (b2 == null) {
            return;
        }
        byw.a a2 = this.a(b2, this.dYy.aEM());
        if (a2 == null) {
            return;
        }
        if (a2 == byw.a.eaQ && byv2.vN() != 1) {
            return;
        }
        int n = this.a(b2, a2);
        if (n <= 0) {
            return;
        }
        this.nG(n);
    }

    private byw.b aDl() {
        byv byv2 = this.dYy.aEP();
        switch (byv2.vO()) {
            case 1: {
                return byw.b.ebc;
            }
            case 2: {
                switch (byv2.vN()) {
                    case 1: 
                    case 2: {
                        return byw.b.ebd;
                    }
                }
                return null;
            }
            case 3: {
                switch (byv2.vN()) {
                    case 1: 
                    case 2: 
                    case 3: {
                        return byw.b.ebe;
                    }
                }
                return null;
            }
            case 4: {
                boolean bl = false;
                switch (byv2.vN()) {
                    case 1: 
                    case 2: {
                        bl = true;
                        break;
                    }
                    case 3: 
                    case 4: {
                        bl = false;
                        break;
                    }
                    default: {
                        return null;
                    }
                }
                if (byv2.aEy()) {
                    switch (byv2.vQ()) {
                        case 1: 
                        case 3: {
                            return byw.b.ebC;
                        }
                        case 2: {
                            return byw.b.ebz;
                        }
                    }
                    return null;
                }
                switch (byv2.vQ()) {
                    case 1: 
                    case 3: {
                        if (bl) {
                            return byw.b.ebB;
                        }
                        return byw.b.ebA;
                    }
                    case 2: {
                        if (bl) {
                            return byw.b.eby;
                        }
                        return byw.b.ebx;
                    }
                }
                return null;
            }
            case 6: {
                boolean bl = false;
                switch (byv2.vN()) {
                    case 1: 
                    case 2: {
                        bl = true;
                        break;
                    }
                    case 3: 
                    case 4: {
                        bl = false;
                        break;
                    }
                    default: {
                        return null;
                    }
                }
                switch (byv2.vQ()) {
                    case 1: {
                        if (bl) {
                            return byw.b.ebP;
                        }
                        return byw.b.ebO;
                    }
                    case 2: {
                        bqm.d d2 = this.dYy.aDX().aJB().bki();
                        if (d2 == null) {
                            return null;
                        }
                        switch (d2) {
                            case AXE: 
                            case BOW: 
                            case CLUB: 
                            case KNIVES: 
                            case SITHRA: 
                            case SWORD: 
                            case THROWABLE_WEAPON: {
                                if (bl) {
                                    return byw.b.ebp;
                                }
                                return byw.b.ebo;
                            }
                            case GREATAXE: 
                            case GREATCLUB: 
                            case GREATSWORD: 
                            case NATURAL_BOW: 
                            case NATURAL_MAGIC_STAFF: 
                            case NATURAL_MELEE: 
                            case SIEGE_WEAPON: {
                                if (bl) {
                                    return byw.b.ebs;
                                }
                                return byw.b.ebr;
                            }
                            case POLEARM: {
                                if (bl) {
                                    return byw.b.ebm;
                                }
                                return byw.b.ebl;
                            }
                        }
                        return null;
                    }
                    case 3: {
                        if (bl) {
                            return byw.b.ebj;
                        }
                        return byw.b.ebi;
                    }
                    case 4: {
                        if (bl) {
                            return byw.b.ebp;
                        }
                        return byw.b.ebo;
                    }
                }
                return null;
            }
            case 7: {
                switch (byv2.vN()) {
                    case 1: 
                    case 2: 
                    case 3: {
                        return byw.b.ebM;
                    }
                    case 4: {
                        return byw.b.ebK;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override
    public void a(erg erg2) {
        if (erg2.aWe <= 0) {
            return;
        }
        this.nG(erg2.aWe);
        if (!this.dYy.isServerObject()) {
            erg2.f(this.GUID);
            erg2.on(this.dYy.aDX().aJX().bhb());
            this.MessageDelegator.F(erg2);
        }
    }

    public int aDm() {
        return 16777336;
    }

    public int aDn() {
        return 16777414;
    }

    public int aDo() {
        return 16777310;
    }

    public int aDp() {
        return 16777315;
    }

    public int aDq() {
        return 201326872;
    }

    public void ax(int n, int n2) {
        assert (n > 0);
        assert (n2 > 0);
        byv byv2 = this.dYy.aEP();
        block0 : switch (byv2.vO()) {
            case 3: {
                break;
            }
            case 4: {
                switch (n2) {
                    case 1: {
                        this.nG(262384);
                        break block0;
                    }
                    case 2: {
                        this.nG(262385);
                        break block0;
                    }
                    case 3: {
                        this.aDh();
                        break block0;
                    }
                }
                break;
            }
            case 6: {
                switch (n2) {
                    case 1: {
                        this.nG(262384);
                        break block0;
                    }
                    case 2: {
                        this.nG(262385);
                        break block0;
                    }
                    case 3: {
                        this.aDk();
                        break block0;
                    }
                }
                break;
            }
            default: {
                return;
            }
        }
    }

    public void aDr() {
        this.nG(this.aDs());
    }

    private int aDs() {
        bqm.d d2 = this.dYy.aDX().aJB().bki();
        if (d2 == null) {
            return -1;
        }
        if (this.dYy.aEP().Uv()) {
            if (bqm.d.isAllowedWhileMounted(d2)) {
                return 117440541;
            }
            lfn.b(5, "SFAnimationManagerGroundedMonster", "getUnsheatheAnimationState() Invalid weapontype found while mounted: " + (Object)((Object)d2));
            return -1;
        }
        return bxk.a(d2);
    }

    @Override
    protected final void b(int n, String string, String string2) {
    }
}

