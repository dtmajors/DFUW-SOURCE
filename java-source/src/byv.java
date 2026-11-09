/*
 * Decompiled with CFR.
 */
public class byv {
    private static final boolean dZD = true;
    private int dXi = 0;
    private int dXj = 0;
    private int bno = 0;
    private int dXk = 0;
    private int dRh = 0;
    private int dXl = 0;
    private int dXm = 0;

    public byv() {
        this.setDefaultValues();
    }

    public int vK() {
        return this.dXi;
    }

    public void dx(int n) {
        this.dXi = n;
    }

    public int vL() {
        return this.dXj;
    }

    public void dy(int n) {
        this.dXj = n;
    }

    public int vM() {
        return this.bno;
    }

    public void dz(int n) {
        this.bno = n;
    }

    public int vN() {
        return this.dXk;
    }

    public void dA(int n) {
        this.dXk = n;
    }

    public int vO() {
        return this.dRh;
    }

    public void dB(int n) {
        this.dRh = n;
    }

    public int vP() {
        return this.dXl;
    }

    public void dC(int n) {
        this.dXl = n;
    }

    public int vQ() {
        return this.dXm;
    }

    public void dD(int n) {
        this.dXm = n;
    }

    public byv aEl() {
        byv byv2 = new byv();
        byv2.dx(this.dXi);
        byv2.dy(this.dXj);
        byv2.dz(this.bno);
        byv2.dA(this.dXk);
        byv2.dB(this.dRh);
        byv2.dC(this.dXl);
        byv2.dD(this.dXm);
        return byv2;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof byv) {
            byv byv2 = (byv)object;
            if (this.dXi != byv2.vK()) {
                return false;
            }
            if (this.dXj != byv2.vL()) {
                return false;
            }
            if (this.bno != byv2.vM()) {
                return false;
            }
            if (this.dXk != byv2.vN()) {
                return false;
            }
            if (this.dRh != byv2.vO()) {
                return false;
            }
            if (this.dXl != byv2.vP()) {
                return false;
            }
            return this.dXm == byv2.vQ();
        }
        assert (false) : object.getClass().getName();
        return false;
    }

    public String aEm() {
        return byw.nR(this.dXi);
    }

    public String aEn() {
        return byw.nS(this.dXj);
    }

    public String aEo() {
        return byw.nT(this.bno);
    }

    public int nP(int n) {
        switch (n) {
            case 1: {
                return this.dXi;
            }
            case 2: {
                return this.dXj;
            }
            case 3: {
                return this.bno;
            }
            case 4: {
                return this.dXk;
            }
            case 5: {
                return this.dRh;
            }
            case 6: {
                return this.dXl;
            }
            case 7: {
                return this.dXm;
            }
        }
        lfn.b(5, "SFObjectState", "getModeValue() Invalid modetype provided: " + n);
        return -1;
    }

    public String aEp() {
        return byw.nU(this.dXk);
    }

    public String aEq() {
        return byw.nV(this.dRh);
    }

    public String aEr() {
        return byw.nY(this.dXl);
    }

    public String aEs() {
        return byw.ob(this.dXm);
    }

    public boolean aEt() {
        return byw.nZ(this.dXl);
    }

    public boolean isAlive() {
        return this.bno == 1;
    }

    public boolean Uu() {
        return this.dRh == 1;
    }

    public boolean aEu() {
        return this.dRh == 2;
    }

    public boolean aEv() {
        return this.Uu() || this.Uv();
    }

    public boolean aEw() {
        return this.dXi == 2;
    }

    public boolean aEx() {
        switch (this.bno) {
            case 3: 
            case 4: 
            case 5: {
                return true;
            }
        }
        return false;
    }

    public boolean aEy() {
        return byw.oa(this.dXl);
    }

    public boolean aEz() {
        return byw.nX(this.dXl) || this.vO() == 7;
    }

    public boolean aEA() {
        return this.dXi == 5;
    }

    public boolean Uv() {
        return this.dRh == 4;
    }

    public boolean Ow() {
        return this.dXk != 1;
    }

    public boolean aEB() {
        return this.dXk == 4;
    }

    public boolean aEC() {
        return this.dXk == 1;
    }

    public boolean aED() {
        return this.dRh == 5;
    }

    public boolean aEE() {
        switch (this.dXl) {
            case 1: 
            case 2: 
            case 3: {
                return false;
            }
            case 4: {
                return true;
            }
        }
        lfn.b(5, "SFObjectState", "isSubmergedInWater() Invalid watercontactmode found: '" + this.aEr() + "'");
        return false;
    }

    public boolean aEF() {
        switch (this.dXl) {
            case 1: 
            case 2: {
                return true;
            }
            case 3: 
            case 4: {
                return false;
            }
        }
        lfn.b(5, "SFObjectState", "isTouchingOrOutOfWater() Invalid watercontactmode found: '" + this.aEr() + "'");
        return false;
    }

    public boolean aEG() {
        return this.dXm == 1;
    }

    public void aEH() {
        this.dXi = 3;
        this.dXj = 3;
        this.bno = 1;
        this.dXk = 1;
        if (!byw.oa(this.dXl)) {
            this.dRh = 6;
            this.dXl = 1;
        }
        this.dXm = 1;
    }

    public void setDefaultValues() {
        this.fj(true);
    }

    public void fj(boolean bl) {
        this.dXi = 3;
        this.dXj = 3;
        if (bl) {
            this.bno = 1;
        }
        this.dXk = 1;
        this.dRh = 6;
        this.dXl = 1;
        this.dXm = 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectState: ");
        stringBuilder.append(" FlyingMode='");
        stringBuilder.append(this.aEm());
        stringBuilder.append("' LeaningMode='");
        stringBuilder.append(this.aEn());
        stringBuilder.append("' LifeMode='");
        stringBuilder.append(this.aEo());
        stringBuilder.append("' MovementMode='");
        stringBuilder.append(this.aEp());
        stringBuilder.append("' PostureMode='");
        stringBuilder.append(this.aEq());
        stringBuilder.append("' WaterContactMode='");
        stringBuilder.append(this.aEr());
        stringBuilder.append("' WeaponMode='");
        stringBuilder.append(this.aEs());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

