/*
 * Decompiled with CFR.
 */
public class bwu {
    public a dWX = null;
    public int aYG = 0;

    public String CE() {
        return lea.enT().getName(this.aYG);
    }

    public boolean aCH() {
        switch (this.dWX) {
            case dWZ: 
            case dXa: {
                return true;
            }
            case dXb: 
            case dXc: {
                return false;
            }
        }
        lfn.b(5, "SFNaturalMissileInfo", "isAreaModification() Invalid naturalmissiletype provided: " + (Object)((Object)this.dWX));
        return false;
    }

    public boolean Ei() {
        switch (this.dWX) {
            case dWZ: 
            case dXb: {
                return false;
            }
            case dXa: 
            case dXc: {
                return true;
            }
        }
        lfn.b(5, "SFNaturalMissileInfo", "isInstant() Invalid naturalmissiletype provided: " + (Object)((Object)this.dWX));
        return false;
    }
}

