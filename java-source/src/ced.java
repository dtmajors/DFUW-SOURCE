/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class ced {
    private final cew dLR;

    public ced(cew cew2) {
        this.dLR = cew2;
    }

    public void a(erq erq2) {
        switch (erq2.bEz()) {
            case 16648: {
                this.b((eru)erq2);
                break;
            }
            default: {
                lfn.b(5, "SFCommandManagerPlayerClient", "handleCommandMessage() Invalid commandmessage provided: " + erq2);
                return;
            }
        }
    }

    private void b(eru eru2) {
        if (eru2.aZF <= 0) {
            lfn.b(5, "SFCommandManagerPlayerClient", "handleCommandSetConfigMessage() ConfigType is invalid.");
            return;
        }
        String string = null;
        switch (eru2.aZF) {
            case 1: {
                string = "AUTO_PARRY";
                ctg.feC = eru2.iiE;
                break;
            }
            case 2: {
                string = "AUTOSTACK_NEW_ITEMS";
                ctg.feD = eru2.iiE;
                break;
            }
            case 3: {
                string = "DO_DECAPITATE";
                ctg.feE = eru2.iiE;
                break;
            }
            case 4: {
                string = "DO_HEADBASH";
                ctg.feL = eru2.iiE;
                break;
            }
            case 5: {
                string = "ENABLE_ADMIN_COMMANDS_IN_STANDALONE";
                ctg.feM = eru2.iiE;
                break;
            }
            case 6: {
                string = "ENABLE_ANY_REGENERATION";
                break;
            }
            case 7: {
                string = "ENABLE_GLOBAL_REGENERATION";
                ctg.feN = eru2.iiE;
                break;
            }
            case 8: {
                string = "ENABLE_HEALTH_REGENERATION";
                break;
            }
            case 9: {
                string = "ENABLE_SELF_DAMAGE_AFFECTING_ALIGNMENT_SUSPICIOUS";
                ctg.feP = eru2.iiE;
                break;
            }
            case 10: {
                string = "ENTER_DEATH";
                ctg.feR = eru2.iiE;
                break;
            }
            case 11: {
                string = "ENTER_GANKMODE";
                ctg.feS = eru2.iiE;
                break;
            }
            case 12: {
                string = "OVERRIDE_CHARGING_TIMERS";
                ctg.feT = eru2.iiE;
                break;
            }
            case 13: {
                string = "OVERRIDE_ENCHANTMENT_TIMER";
                ctg.feV = eru2.iiE;
                break;
            }
            case 14: {
                string = "OVERRIDE_RECALL_TIMERS";
                ctg.feW = eru2.iiE;
                break;
            }
            case 15: {
                string = "OVERRIDE_RESTART_BLOCKING_TIMERS";
                ctg.feX = eru2.iiE;
                break;
            }
            case 16: {
                string = "OVERRIDE_TELEPORT_TIMERS";
                ctg.feY = eru2.iiE;
                break;
            }
            case 17: {
                string = "PERFORM_EFFECT_CONVERT_TO_PERMANENT_MODIFICATION";
                ctg.feZ = eru2.iiE;
                break;
            }
            case 18: {
                string = "PERFORM_EFFECT_TICK_TO_CHANGE_VALUE";
                ctg.ffa = eru2.iiE;
                break;
            }
            case 19: {
                string = "PERFORM_EFFECT_USE_LAYER_STACKABLE";
                ctg.ffb = eru2.iiE;
                break;
            }
            case 20: {
                string = "SKIP_INVULNERABILITY_AFTER_SPAWNING";
                ctg.ffi = eru2.iiE;
                break;
            }
            case 21: {
                string = "TARGET_SELF";
                ctg.ffj = eru2.iiE;
                break;
            }
            case 22: {
                string = "USE_COMMON_WEAPON_PROPERTY_VALUES";
                ctg.ffk = eru2.iiE;
                break;
            }
            case 23: {
                string = "USE_SHORT_CORPSE_TIMER";
                ctg.ffl = eru2.iiE;
                break;
            }
            case 24: {
                string = "USE_SHORT_GANKMODE_TIMER";
                ctg.ffm = eru2.iiE;
                break;
            }
            case 25: {
                string = "VISUALIZE_TARGET_HARVESTING";
                break;
            }
            case 33: {
                string = "ENABLE_IDLE";
                arw.bRW = eru2.iiE;
                break;
            }
            case 30: {
                string = "ENABLE_BATTLE_ROYAL";
                arw.bRT = eru2.iiE;
                break;
            }
            case 31: {
                string = "ENABLE_GLOBAL_DESPAWNING";
                arw.bRU = eru2.iiE;
                if (!arw.bRU) break;
                arw.bRV = false;
                break;
            }
            case 32: {
                string = "ENABLE_GLOBAL_SPAWNING";
                arw.bRV = eru2.iiE;
                if (!arw.bRV) break;
                arw.bRU = false;
                break;
            }
            case 34: {
                string = "ENABLE_MONSTERS_CHATTER";
                arw.bRX = eru2.iiE;
                break;
            }
            case 35: {
                string = "ENABLE_MONSTERS_ENTER_GANKMODE";
                arw.bRY = eru2.iiE;
                break;
            }
            case 41: {
                string = "ENABLE_PLAYERS_SPRINT_HACK";
                byx.ecX = true;
                break;
            }
            case 42: {
                string = "DISABLE_PLAYERS_SPRINT_HACK";
                byx.ecX = false;
                break;
            }
            default: {
                lfn.b(5, "SFCommandManagerPlayerClient", "handleCommandSetConfigMessage() Invalid configtype provided: " + eru2.aZF);
                return;
            }
        }
    }
}

