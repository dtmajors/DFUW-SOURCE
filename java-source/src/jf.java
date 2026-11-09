/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Queue;

public class jf
extends btk
implements bto {
    public static jlk akf = new jlk();
    private static final double akg = 0.1;
    private static final double akh = 0.1;
    private jnu aki = null;
    private Queue<loz> akj = null;
    private double akk = 0.0;
    private Queue<jc> akl = lcn.emA();
    private double akm = 0.0;

    public jf(jnu jnu2) {
        this.aki = jnu2;
        this.akj = lcn.emA();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.akm + 0.1 <= ldz2.rgz && !this.akl.isEmpty()) {
            jc jc2 = this.akl.poll();
            this.aki.pz(jc2.getSpecialEffectType());
            this.akm = ldz2.rgz;
            if (jc2.nR()) {
                akf.dLF();
            }
        }
        if (this.akk + 0.1 <= ldz2.rgz && !this.akj.isEmpty()) {
            this.aki.v(this.akj.poll());
            this.akk = ldz2.rgz;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29451: {
                this.a((fgk)dxq2);
                break;
            }
            case 29452: {
                this.a((fgj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fgk fgk2) {
        jd[] jdArray = fgk2.bPd();
        je[] jeArray = fgk2.bPe();
        jb[] jbArray = fgk2.bPf();
        ja[] jaArray = fgk2.bPh();
        bbs[] bbsArray = fgk2.bPg();
        block160: for (int i = 0; i < jdArray.length; ++i) {
            loz loz2 = null;
            block0 : switch (jdArray[i]) {
                case ajC: {
                    switch (jeArray[i]) {
                        case ajO: {
                            loz2 = mbt.umw.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajP: {
                            loz2 = mbt.umx.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajQ: {
                            loz2 = mbt.umC.bD(Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajR: {
                            loz2 = mbt.umy.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajS: {
                            loz2 = mbt.umz.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajT: {
                            loz2 = mbt.umB.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajU: {
                            loz2 = mbt.umA.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                    }
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Damage Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                    assert (false);
                    continue block160;
                }
                case ajK: {
                    loz2 = mbt.umD.bD(new Object[0]);
                    break;
                }
                case ajD: {
                    switch (jeArray[i]) {
                        case ajO: {
                            loz2 = mbt.umE.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajP: {
                            loz2 = mbt.umG.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajQ: {
                            loz2 = mbt.umI.bD(Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajR: {
                            loz2 = mbt.umF.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajS: {
                            loz2 = mbt.umH.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                    }
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Drain Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                    assert (false);
                    continue block160;
                }
                case ajG: {
                    block28 : switch (jeArray[i]) {
                        case ajO: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.umO.bD(fgk2.GE(i));
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.umP.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.GE(i)});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.umQ.bD(fgk2.GG(i), fgk2.GE(i));
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Other Player Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajP: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unr.bD(fgk2.GE(i));
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.uns.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.GE(i)});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.unt.bD(fgk2.GG(i), fgk2.GE(i));
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death from Other Player Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajQ: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.uny.bD(new Object[0]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.unz.bD(new Object[]{bbsArray[i], fgk2.GG(i)});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.unA.bD(fgk2.GG(i));
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Self-Inflicted Death Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajR: {
                            loz2 = mbt.umR.bD(fgk2.bPm()[i]);
                            break;
                        }
                        case ajS: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unu.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.unv.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.unw.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death from Monster Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajV: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.umS.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.umT.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.umU.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Ship Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajX: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unb.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.unc.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.und.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Mount Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajW: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.umV.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.umW.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.umX.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Warhulk Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajY: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.umY.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.umZ.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.una.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Cannon Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajZ: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.une.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.unf.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.ung.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Clan Structure Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case aka: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unh.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.uni.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.unj.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Clanstone City Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case akb: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unk.bD(fgk2.bPm()[i]);
                                    break block28;
                                }
                                case ajb: {
                                    loz2 = mbt.unl.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.bPm()[i]});
                                    break block28;
                                }
                                case ajc: {
                                    loz2 = mbt.unm.bD(fgk2.GG(i), fgk2.bPm()[i]);
                                    break block28;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Death to Clanstone Hamlet Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case akc: {
                            loz2 = mbt.unp.bD(fgk2.bPm()[i]);
                            break;
                        }
                        case akd: {
                            loz2 = mbt.unq.bD(fgk2.GF(i), fgk2.bPm()[i]);
                            break;
                        }
                        case ajT: {
                            if (cug.vO((int)fgk2.bPm()[i])) {
                                loz2 = mbt.uno.bD(fgk2.bPm()[i]);
                                break;
                            }
                            loz2 = mbt.unn.bD(fgk2.bPm()[i]);
                            break;
                        }
                        case ajU: {
                            loz2 = mbt.unx.bD(fgk2.bPm()[i]);
                        }
                    }
                    break;
                }
                case ajH: {
                    switch (jeArray[i]) {
                        case ajO: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unB.bD(fgk2.GE(i));
                                    break block0;
                                }
                                case ajb: {
                                    loz2 = mbt.unC.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.GE(i)});
                                    break block0;
                                }
                                case ajc: {
                                    loz2 = mbt.unD.bD(fgk2.GG(i), fgk2.GE(i));
                                    break block0;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Gank to Other Player Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajP: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unE.bD(fgk2.GE(i));
                                    break block0;
                                }
                                case ajb: {
                                    loz2 = mbt.unF.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.GE(i)});
                                    break block0;
                                }
                                case ajc: {
                                    loz2 = mbt.unG.bD(fgk2.GG(i), fgk2.GE(i));
                                    break block0;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Gank from Other Player Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajQ: {
                            loz2 = mbt.unH.bD(new Object[0]);
                            break block0;
                        }
                        default: {
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Gank Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                            assert (false);
                            continue block160;
                        }
                    }
                }
                case ajE: {
                    switch (jeArray[i]) {
                        case ajO: {
                            loz2 = mbt.umr.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajP: {
                            loz2 = mbt.umt.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajQ: {
                            loz2 = mbt.umv.bD(Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajT: {
                            loz2 = mbt.ums.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajU: {
                            loz2 = mbt.umu.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                    }
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Boost Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                    assert (false);
                    continue block160;
                }
                case ajF: {
                    switch (jeArray[i]) {
                        case ajO: {
                            loz2 = mbt.umJ.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajP: {
                            loz2 = mbt.umL.bD(fgk2.GE(i), Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajQ: {
                            loz2 = mbt.umN.bD(Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajR: {
                            loz2 = mbt.umK.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                        case ajS: {
                            loz2 = mbt.umM.bD(fgk2.bPm()[i], Float.valueOf(Math.abs(fgk2.bPj()[i])), fgk2.btg()[i], fgk2.bPi()[i]);
                            break block0;
                        }
                    }
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Heal Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                    assert (false);
                    continue block160;
                }
                case ajI: {
                    switch (jeArray[i]) {
                        case ajO: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unI.bD(fgk2.GE(i));
                                    break block0;
                                }
                                case ajb: {
                                    loz2 = mbt.unJ.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.GE(i)});
                                    break block0;
                                }
                                case ajc: {
                                    loz2 = mbt.unK.bD(fgk2.GG(i), fgk2.GE(i));
                                    break block0;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Revive to Other Player Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajP: {
                            switch (jbArray[i]) {
                                case aja: {
                                    loz2 = mbt.unL.bD(fgk2.GE(i));
                                    break block0;
                                }
                                case ajb: {
                                    loz2 = mbt.unM.bD(new Object[]{bbsArray[i], fgk2.GG(i), fgk2.GE(i)});
                                    break block0;
                                }
                                case ajc: {
                                    loz2 = mbt.unN.bD(fgk2.GG(i), fgk2.GE(i));
                                    break block0;
                                }
                            }
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Broadcast Type for Revive from Other Player Event!!!... Broadcast Type = " + (Object)((Object)jbArray[i]));
                            assert (false);
                            continue block160;
                        }
                        case ajQ: {
                            loz2 = mbt.unO.bD(new Object[0]);
                            break block0;
                        }
                        default: {
                            lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Revive Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                            assert (false);
                            continue block160;
                        }
                    }
                }
                case ajJ: {
                    switch (jeArray[i]) {
                        case ajP: {
                            loz2 = mbt.unS.bD(fgk2.GE(i));
                            break block0;
                        }
                        case ajO: {
                            loz2 = mbt.unQ.bD(fgk2.GE(i));
                            break block0;
                        }
                        case ajQ: {
                            loz2 = mbt.unP.bD(new Object[0]);
                            break block0;
                        }
                        case ajR: {
                            loz2 = mbt.unT.bD(fgk2.bPm()[i]);
                            break block0;
                        }
                        case ajS: {
                            loz2 = mbt.unR.bD(fgk2.bPm()[i]);
                            break block0;
                        }
                    }
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Source/Target Type for Marked Event!!!... Source/Target Type = " + (Object)((Object)jeArray[i]));
                    assert (false);
                    continue block160;
                }
                case ajL: {
                    switch (jaArray[i]) {
                        case aiT: {
                            loz2 = mbt.unU.bD(new Object[0]);
                            break block0;
                        }
                        case aiU: {
                            loz2 = mbt.unV.bD(new Object[0]);
                            break block0;
                        }
                        case aiV: {
                            loz2 = mbt.unW.bD(new Object[0]);
                            break block0;
                        }
                        case aiW: {
                            loz2 = mbt.unX.bD(new Object[0]);
                            break block0;
                        }
                        case aiX: {
                            loz2 = mbt.unY.bD(new Object[0]);
                            break block0;
                        }
                        case aiY: {
                            loz2 = mbt.unZ.bD(new Object[0]);
                            break block0;
                        }
                    }
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Change Type for Alignment Change Event!!!... Change Type = " + (Object)((Object)jaArray[i]));
                    assert (false);
                    continue block160;
                }
                default: {
                    lfn.b(5, "SFPlayerCombatLogManagerClient", "handleHIDCombatLogUpdateMessage() : Unhandled Event Type!!!... Event Type = " + (Object)((Object)jdArray[i]));
                    assert (false);
                    continue block160;
                }
            }
            if (loz2 == null) continue;
            this.akj.add(loz2);
        }
    }

    private void a(fgj fgj2) {
        if (fgj2.bPc() == null || fgj2.getPlayCount() == 0) {
            return;
        }
        for (int i = 0; i < fgj2.getPlayCount(); ++i) {
            this.akl.add(fgj2.bPc());
        }
    }
}

