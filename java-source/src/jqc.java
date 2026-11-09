/*
 * Decompiled with CFR.
 */
public class jqc {
    public boolean[] ecU = new boolean[6];
    public ljq my = new ljq();
    public int nRn = 1;
    public int nRo = 0;
    public int nRp = 1;
    public int nRq = 0;
    public boolean nRr = false;
    public boolean nRs = false;
    public boolean nRt = false;
    public boolean nRu = false;
    public boolean nRv = true;
    public boolean nRw = true;
    public boolean nRx = false;
    public boolean nPX = false;
    public boolean nRy = false;
    private jpx dOy = null;
    public jpu nRz = null;
    public boolean nRA = false;

    public jqc(jpx jpx2) {
        this.dOy = jpx2;
        this.nRz = new jpu(this.dOy);
    }

    public boolean dQR() {
        int n = 0;
        n = this.nRu ? 6 : 4;
        for (int i = 0; i < n; ++i) {
            if (!this.ecU[i]) continue;
            return true;
        }
        return false;
    }

    public boolean dQS() {
        return this.nRw != this.nRx;
    }

    public void j(int n, double d2) {
        eq eq2;
        if (n == 4 && this.dOy.dQf().axF().aJz() != null && (eq2 = this.dOy.dQf().axF().fi().af(11792)) != null && eq2.getBooleanValue()) {
            this.nRz.dD(d2);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMovementStateInfo:");
        stringBuilder.append(" [");
        if (this.ecU[0]) {
            stringBuilder.append(" Forward");
        }
        if (this.ecU[1]) {
            stringBuilder.append(" Backward");
        }
        if (this.ecU[2]) {
            stringBuilder.append(" Left");
        }
        if (this.ecU[3]) {
            stringBuilder.append(" Right");
        }
        stringBuilder.append(" ]");
        stringBuilder.append(" NewMovementSkill='");
        stringBuilder.append(lea.enZ().getName(this.nRo));
        stringBuilder.append("' OldMovementSkill='");
        stringBuilder.append(lea.enZ().getName(this.nRq));
        stringBuilder.append("'");
        stringBuilder.append(" PlayerWasMoving=");
        stringBuilder.append(this.nRy);
        return stringBuilder.toString();
    }
}

