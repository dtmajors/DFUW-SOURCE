/*
 * Decompiled with CFR.
 */
public class id {
    public ahu.c afi = null;
    public int afj = 0;
    public int ObjectType = 0;
    public hm[] afk = null;
    public hn[] afl = null;
    private ie afm = null;

    public boolean mZ() {
        if (this.afk != null && this.afk.length > 0) {
            return true;
        }
        return this.afl != null && this.afl.length > 0;
    }

    public String getKeyName() {
        return gk.bH(this.afj);
    }

    public String getObjectName() {
        return amh.gL(this.ObjectType);
    }

    public hm a(ahu.b b2) {
        assert (b2 != null);
        if (this.afk != null) {
            int n = this.afk.length;
            for (int j = 0; j < n; ++j) {
                if (this.afk[j].Ul != b2) continue;
                return this.afk[j];
            }
        }
        return null;
    }

    public hn a(ahu.b b2, int n) {
        assert (b2 != null);
        assert (n > 0);
        if (this.afl != null) {
            gc[] gcArray = null;
            int n2 = this.afl.length;
            for (int j = 0; j < n2; ++j) {
                gcArray = this.afl[j].adm;
                int n3 = gcArray.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (gcArray[i2].Ul != b2 || !gcArray[i2].bA(n)) continue;
                    return this.afl[j];
                }
            }
        }
        return null;
    }

    public ie na() {
        if (this.afm == null) {
            this.afm = new ie(this.afi, this.ObjectType);
        }
        return this.afm;
    }

    public String nb() {
        return this.afi.name();
    }

    public String toString() {
        int n;
        int n2;
        assert (this.afi != null);
        assert (this.afj > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStateObjectDefinition: StateObjectType='");
        stringBuilder.append(this.nb());
        if (this.ObjectType > 0) {
            stringBuilder.append("' ObjectType='");
            stringBuilder.append(this.getObjectName());
        }
        stringBuilder.append("' KeyType='");
        stringBuilder.append(this.getKeyName());
        stringBuilder.append("' GeneralPropertyDefinitions=[");
        if (this.afk != null) {
            n2 = this.afk.length;
            for (n = 0; n < n2; ++n) {
                if (n > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(this.afk[n]);
            }
        }
        stringBuilder.append("] SpecificPropertyDefinitions=[");
        if (this.afl != null) {
            n2 = this.afl.length;
            for (n = 0; n < n2; ++n) {
                if (n > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(this.afl[n]);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected void a(id id2) {
        id2.afi = this.afi;
        id2.afj = this.afj;
        id2.ObjectType = this.ObjectType;
        id2.afk = this.afk;
        id2.afl = this.afl;
    }
}

