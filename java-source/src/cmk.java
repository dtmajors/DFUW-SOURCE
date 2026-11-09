/*
 * Decompiled with CFR.
 */
class cmk {
    ldv hC = null;
    ldv Ri = null;
    ldv bRN = null;
    String FirstName = null;
    String LastName = null;

    cmk() {
    }

    public String getFullName() {
        if (this.FirstName == null && this.LastName == null) {
            return "";
        }
        if (this.FirstName != null) {
            return this.FirstName;
        }
        if (this.LastName != null) {
            return this.FirstName;
        }
        return this.FirstName + " " + this.LastName;
    }

    public void cleanUp() {
        this.Ri = null;
        this.bRN = null;
        this.hC = null;
        this.FirstName = null;
        this.LastName = null;
    }
}

