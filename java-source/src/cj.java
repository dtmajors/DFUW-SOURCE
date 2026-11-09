/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class cj {
    private ldv hA;
    private int hB;
    private ldv hC;
    private String hD;
    private String BindstoneName;
    private String hE;
    private ha hF;

    public boolean isValid() {
        if (this.hA == null) {
            lfn.b(4, "SFCharacterCreatorCharacterData", "isValid(): FromGuid == null");
            return false;
        }
        if (this.hB == 0) {
            lfn.b(4, "SFCharacterCreatorCharacterData", "isValid(): AccountID == 0");
            return false;
        }
        if (this.hC == null) {
            lfn.b(4, "SFCharacterCreatorCharacterData", "isValid(): CharacterGUID == null");
            return false;
        }
        if (this.hF == null) {
            lfn.b(4, "SFCharacterCreatorCharacterData", "isValid(): CharacterPSO == null");
            return false;
        }
        return true;
    }

    public int aN() {
        return this.hB;
    }

    public void v(int n) {
        this.hB = n;
    }

    public ldv aO() {
        return this.hA;
    }

    public void f(ldv ldv2) {
        this.hA = ldv2;
    }

    public ldv aP() {
        return this.hC;
    }

    public void g(ldv ldv2) {
        this.hC = ldv2;
    }

    public ha aQ() {
        return this.hF;
    }

    public void a(ha ha2) {
        this.hF = ha2;
    }

    public String getPassword() {
        return this.hD;
    }

    public void setPassword(String string) {
        this.hD = string;
    }

    public String aH() {
        return this.BindstoneName;
    }

    public void D(String string) {
        this.BindstoneName = string;
    }

    public String toString() {
        return "SFCharacterCreatorCharacterData: FromGUID = " + this.hA + ", AccountID = " + this.hB + ", CharacterGUID = " + this.hC;
    }

    public String aR() {
        return this.hE;
    }

    public void G(String string) {
        this.hE = string;
    }
}

