/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class brp
implements Comparable {
    public ldv GUID = null;
    public int ResourceType = 0;
    public int asi = 0;
    public long aXU = 0L;

    public int compareTo(Object object) {
        brp brp2 = (brp)object;
        return this.GUID.tX(brp2.GUID);
    }

    public brp awk() {
        brp brp2 = new brp();
        brp2.GUID = this.GUID;
        brp2.ResourceType = this.ResourceType;
        brp2.asi = this.asi;
        brp2.aXU = this.aXU;
        return brp2;
    }

    public final boolean equals(Object object) {
        if (object instanceof brp) {
            brp brp2 = (brp)object;
            return brp2.GUID.equals(this.GUID) && brp2.ResourceType == this.ResourceType && brp2.asi == this.asi;
        }
        assert (false);
        return false;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public boolean auU() {
        assert (this.ResourceType > 0);
        return lea.enW().isDescendant(this.ResourceType, cug.fjP);
    }

    public String toString() {
        return "SFItemInfo: GUID=" + this.GUID + " ResourceType='" + this.pa() + "' Quantity=" + this.asi + " DatabasePersistentID=" + this.aXU;
    }
}

