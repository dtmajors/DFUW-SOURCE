/*
 * Decompiled with CFR.
 */
import java.util.List;

public class duu {
    public static final int hfj = 1;
    public static final int hfk = 2;
    private List hfl = null;

    public dut Cw(int n) {
        if (this.hfl == null) {
            return null;
        }
        int n2 = this.Cx(n);
        if (n2 >= 0) {
            return (dut)this.hfl.get(n2);
        }
        return null;
    }

    public dut[] bBs() {
        dut[] dutArray = new dut[this.hfl.size()];
        for (int i = 0; i < this.hfl.size(); ++i) {
            dutArray[i] = ((dut)this.hfl.get(i)).bBr();
        }
        return dutArray;
    }

    public int a(dut dut2) {
        if (this.hfl == null) {
            this.hfl = lcn.abH(1);
            this.hfl.add(dut2);
            return 1;
        }
        int n = this.Cx(dut2.aFZ());
        if (n >= 0) {
            this.hfl.set(n, dut2);
            return 2;
        }
        this.hfl.add(dut2);
        return 1;
    }

    public String toString() {
        if (this.hfl == null) {
            return "SFShaderList: Shaders=null";
        }
        return "SFShaderList: Shaders=" + this.hfl.size();
    }

    private int Cx(int n) {
        if (this.hfl == null) {
            return -1;
        }
        dut dut2 = null;
        for (int i = 0; i < this.hfl.size(); ++i) {
            dut2 = (dut)this.hfl.get(i);
            if (dut2.aFZ() != n) continue;
            return i;
        }
        return -1;
    }
}

