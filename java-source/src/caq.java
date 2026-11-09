/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  car
 *  cbx
 *  cug
 *  lcr
 */
import java.util.EnumMap;
import java.util.Map;

public abstract class caq
extends btk {
    private static int Qs = 1;
    protected bzz ehB = null;
    protected Map<ldv, bzs> eeh = lcn.emw();
    protected Map<cak.c, cad> eei = new EnumMap<cak.c, cad>(cak.c.class);
    protected Map<can, cam> ehC = null;
    protected lcq HairColor = new lcq(1.0f, 1.0f, 1.0f);
    protected lcq aCT = new lcq(1.0f, 1.0f, 1.0f);
    protected cba eej = null;
    protected boolean ehD = false;
    protected boolean ehE = false;
    protected boolean ehF = false;
    protected boolean ehG = false;
    protected int ehH = 0;

    public final Map<ldv, bzs> aFA() {
        return this.eeh;
    }

    public caq() {
        this.ObjectType = 107;
    }

    public final bzz aGn() {
        return this.ehB;
    }

    public final void a(bzz bzz2) {
        assert (bzz2 != null);
        this.ehB = bzz2;
        this.ehD = lea.enW().isDescendant(this.ehB.az(), cug.fgJ);
        if (this.Initialized && !this.ehE && this.ehB.aAG() != null) {
            if (this instanceof cat) {
                this.aGv();
            } else if (!this.ehF) {
                this.sendAddStatusObserverMessage(this.ehB.aAG().getGUID());
            }
        }
    }

    public final Map<cak.c, cad> aFB() {
        return this.eei;
    }

    public final Map<can, cam> aGo() {
        return this.ehC;
    }

    public final lcq aGp() {
        return this.HairColor;
    }

    public final lcq aGq() {
        return this.aCT;
    }

    public final boolean b(cak.c c2, int n) {
        cad cad2 = this.eei.get((Object)c2);
        if (cad2 == null) {
            return false;
        }
        return cad2.ResourceType == n;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": GUID=");
        stringBuilder.append(this.GUID);
        if (this.ehB != null) {
            stringBuilder.append(" ResourceType='");
            stringBuilder.append(lea.enW().getName(this.ehB.az()));
            stringBuilder.append("'");
        }
        return stringBuilder.toString();
    }

    protected final float al(int n) {
        assert (this.ehB != null);
        if (this.ehB instanceof cbx) {
            return ((cbx)this.ehB).fi().al(n);
        }
        if (this.ehB instanceof bzt) {
            return ((bzt)this.ehB).al(n);
        }
        lfn.b(5, "SFPaperdollManager", "getFloatAttributeValue() Unhandled dressableobject provided: " + this.ehB.getClass().getName());
        return 0.0f;
    }

    protected final ldv KY() {
        assert (this.ehB != null);
        if (this.ehB == null) {
            return null;
        }
        assert (this.ehB.aAG() != null);
        if (this.ehB.aAG() == null) {
            return null;
        }
        return this.ehB.aAG().getGUID();
    }

    protected final ljq aGr() {
        assert (this.ehB != null);
        assert (this.ehB.aAG() != null);
        return this.ehB.aAG().av();
    }

    protected final int aGs() {
        assert (this.ehB != null);
        if (this.ehB instanceof cpv) {
            return ((cpv)this.ehB).atS();
        }
        lfn.b(5, "SFPaperdollManager", "getObjectNPCType() Invalid dressable object set: " + this.ehB.getClass().getName());
        return -1;
    }

    protected final String aGt() {
        return lea.enW().getName(this.aGu());
    }

    protected int aGu() {
        assert (this.ehB != null);
        return this.ehB.az();
    }

    protected abstract void aGv();

    protected final void sendAddStatusObserverMessage(ldv ldv2) {
        assert (this.Initialized);
        assert (this instanceof car);
        assert (ldv2 != null);
        assert (!this.ehF);
        this.ehH = Qs++;
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.aqs = this.ehH;
        fvq2.hcg = 2;
        fvq2.hch = ldv2;
        this.MessageDelegator.F(fvq2);
        this.ehF = true;
    }

    protected final void sendRemoveStatusObserverMessage(ldv ldv2) {
        assert (this.Initialized);
        assert (this instanceof car);
        assert (ldv2 != null);
        assert (this.ehF);
        assert (!this.ehG);
        fvw fvw2 = (fvw)this.MessageDelegator.h(12293, this.GUID, lcr.qzp);
        fvw2.hch = ldv2;
        this.MessageDelegator.F(fvw2);
        this.ehG = true;
        this.ehH = 0;
    }
}

