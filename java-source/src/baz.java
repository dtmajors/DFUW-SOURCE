/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class baz
extends btk {
    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19999: {
                this.a((euu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(euu euu2, boolean bl) {
        euv euv2 = (euv)this.MessageDelegator.h(20000, this.GUID, euu2.aO());
        this.MessageDelegator.b(euu2, euv2);
        euv2.DR(bl ? 1 : 0);
        this.MessageDelegator.F(euv2);
    }

    private void a(euu euu2) {
        if (!euu2.aO().equals(lcr.hac)) {
            this.a(euu2, false);
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestSetConfigurationSettingRequestMessage() : Request received from non-distributed source... only requests from the game-logic distributor will be processed!... Request = " + euu2);
            assert (false);
            return;
        }
        bad.b b2 = bad.b.getSettingByName(euu2.bMu());
        switch (b2.ahC()) {
            case cJj: {
                bad.c c2 = bad.b(b2, euu2.fC());
                if (c2 != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, euu2.fC());
                break;
            }
            case cJl: {
                bad.c c3 = bad.b(b2, euu2.fN());
                if (c3 != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, euu2.fN());
                break;
            }
            case cJk: {
                bad.c c4 = bad.b(b2, euu2.bMv());
                if (c4 != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, euu2.bMv());
                break;
            }
            case cJm: {
                bad.c c5 = bad.b(b2, euu2.getBooleanValue());
                if (c5 != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, euu2.getBooleanValue());
                break;
            }
            case cJn: {
                bad.c c6 = bad.b(b2, euu2.getStringValue());
                if (c6 != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, euu2.getStringValue());
                break;
            }
            case cJo: {
                bad.c c7;
                String[] stringArray = euu2.getStringValue().split(",");
                int[] nArray = new int[stringArray.length];
                for (int i = 0; i < stringArray.length; ++i) {
                    try {
                        nArray[i] = Integer.parseInt(stringArray[i]);
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        nArray = null;
                        break;
                    }
                }
                if ((c7 = bad.b(b2, nArray)) != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, nArray);
                break;
            }
            case cJp: {
                bad.c c8;
                Enum enum_ = bab.getPhaseByName(euu2.getStringValue());
                if (enum_ == null) {
                    enum_ = bax.getWagerDivisionByName(euu2.getStringValue());
                }
                if (enum_ == null) {
                    enum_ = azs.getLossConditionByName(euu2.getStringValue());
                }
                if ((c8 = bad.b(b2, enum_)) != bad.c.cLs) {
                    this.a(euu2, false);
                    return;
                }
                bad.a(b2, enum_);
                break;
            }
        }
        this.a(euu2, true);
    }
}

