/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bxm
 *  cdb
 */
import java.util.EnumMap;
import java.util.Map;

public abstract class bxh
extends btk {
    protected static Map<byw.b, bxn> dYp = new EnumMap<byw.b, bxn>(byw.b.class);
    protected static bxv[] dYq = new bxv[byw.b.values().length];
    protected boolean dYr = false;
    protected boolean dYs = false;

    public bxh(byx byx2) {
    }

    public static final Map<byw.b, bxn> aDf() {
        return dYp;
    }

    public static final bxv[] aDg() {
        return dYq;
    }

    public final void aDh() {
        this.dYr = true;
    }

    public final void aDi() {
        this.dYs = true;
    }

    public abstract byx aDj();

    public void a(erg erg2) {
        lfn.b(5, "SFAnimationManager", "handleEmoteAnimationMessage() Nothing done in superclass: " + this.getClass().getSimpleName());
    }

    public final void nG(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStartMessage() AnimationState is invalid.");
            return;
        }
        if (this.aDj().aDd() == null) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStartMessage() OwnerObject is null.");
            return;
        }
        if (this.aDj().aDd().aAG() == null) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStartMessage() OwnerObject's meshobject is null.");
            return;
        }
        ldv ldv2 = this.aDj().aDd().aAG().getGUID();
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, ldv2);
        dzv2.dTs = n;
        this.MessageDelegator.H(dzv2);
    }

    public final void nH(int n) {
        assert (this.aDj().isServerObject());
        if (n <= 0) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStartMessageToClientAndServer() AnimationState is invalid.");
            return;
        }
        if (this.aDj().aDd() == null) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStartMessageToClientAndServer() OwnerObject is null.");
            return;
        }
        if (this.aDj().aDd().aAG() == null) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStartMessageToClientAndServer() OwnerObject's meshobject is null.");
            return;
        }
        ldv ldv2 = this.aDj().aDd().aAG().getGUID();
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, ldv2);
        dzv2.dTs = n;
        this.MessageDelegator.H(dzv2);
        ldv2 = ((cdb)this.aDj().aDd()).jk().bhh();
        dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, ldv2);
        dzv2.dTs = n;
        this.MessageDelegator.F(dzv2);
    }

    public final void aDk() {
        assert (this.aDj().aDd() != null);
        if (this.aDj().aDd().aAG() == null) {
            lfn.b(5, "SFAnimationManager", "sendAnimationStopMessage() OwnerObject's meshobject is null.");
            return;
        }
        dzw dzw2 = (dzw)this.MessageDelegator.h(7426, this.GUID, this.aDj().aDd().aAG().getGUID());
        this.MessageDelegator.H(dzw2);
    }

    protected final byw.a a(byw.b b2, boolean[] blArray) {
        if (b2 == null) {
            lfn.b(5, "SFAnimationManager", "determineActiveDirectionType: ControllerType is null");
            assert (false);
            return byw.a.eaQ;
        }
        bxv bxv2 = dYq[b2.ordinal()];
        return bxv2.b(blArray);
    }

    protected final int a(byw.b b2, byw.a a2) {
        Object object;
        assert (b2 != null);
        assert (a2 != null);
        bxn bxn2 = dYp.get((Object)b2);
        if (bxn2 == null) {
            lfn.b(5, "SFAnimationManager", "getAnimationState() No AnimationStateController mapped to ControllerType " + (Object)((Object)b2));
            assert (false);
            return -1;
        }
        if (this instanceof bxm && (object = (bxm)this).aDj() != null && object.aDj().aEP() != null && object.aDj().aEa() && object.aDj().aEP().Uv()) {
            a2 = byw.a.eaZ;
        }
        if ((object = bxn2.a(a2)) == null) {
            return -1;
        }
        return ((bxo)object).aDI();
    }

    protected abstract void b(int var1, String var2, String var3);

    protected final void O(ldv ldv2, int n) {
        assert (ldv2 != null);
        assert (n > 0);
        fse fse2 = (fse)this.MessageDelegator.h(20481, this.GUID, ldv2);
        fse2.aWe = n;
        this.MessageDelegator.F(fse2);
    }

    public static final int a(bqm.d d2) {
        switch (d2) {
            case AXE: 
            case CLUB: 
            case SITHRA: 
            case SWORD: {
                return 117440541;
            }
            case BOW: {
                return 117440741;
            }
            case GREATAXE: 
            case GREATCLUB: 
            case GREATSWORD: 
            case SIEGE_WEAPON: {
                return 117440557;
            }
            case KNIVES: {
                return 117440740;
            }
            case MAGIC_STAFF: {
                return 0x70000E7;
            }
            case POLEARM: {
                return 0x7000070;
            }
            case NATURAL_BOW: 
            case NATURAL_MAGIC_STAFF: 
            case NATURAL_MELEE: {
                return 65539;
            }
            case THROWABLE_WEAPON: {
                return 117440742;
            }
            case TOOL: {
                return 117440541;
            }
        }
        lfn.b(5, "SFAnimationManager", "getUnsheatheAnimationState() Invalid weapontype found: " + (Object)((Object)d2));
        assert (false);
        return -1;
    }

    public static final int b(bqm.d d2) {
        switch (d2) {
            case AXE: 
            case CLUB: 
            case SITHRA: 
            case SWORD: {
                return 117440965;
            }
            case BOW: {
                return 117440969;
            }
            case GREATAXE: 
            case GREATCLUB: 
            case GREATSWORD: 
            case SIEGE_WEAPON: {
                return 117440966;
            }
            case KNIVES: {
                return 117440968;
            }
            case MAGIC_STAFF: {
                return 117440971;
            }
            case POLEARM: {
                return 117440967;
            }
            case NATURAL_BOW: 
            case NATURAL_MAGIC_STAFF: 
            case NATURAL_MELEE: {
                return 65539;
            }
            case THROWABLE_WEAPON: {
                return 117440970;
            }
            case TOOL: {
                return 117440965;
            }
        }
        lfn.b(5, "SFAnimationManager", "getSheatheAnimationState() Invalid weapontype found: " + (Object)((Object)d2));
        assert (false);
        return -1;
    }
}

