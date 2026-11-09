/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class jcf {
    private int aDf = -1;
    private int di = -1;
    private String mQY = null;
    private Map<yw, String> bdj = null;
    private los bdi = null;

    public int qS() {
        return this.aDf;
    }

    public int ib() {
        return this.di;
    }

    public jcf(int n, int n2, String string, Map<yw, String> map, los los2) {
        this.aDf = n;
        this.di = n2;
        this.mQY = string;
        this.bdj = map;
        this.bdi = los2;
    }

    public loz aND() {
        return lvm.sXp.bD(this.bdi);
    }

    public String b(yw yw2) {
        return this.bdj != null ? this.bdj.get((Object)yw2) : null;
    }

    public void c(yw yw2) {
        if (!this.bdj.containsKey((Object)yw2)) {
            return;
        }
        xe.baL.cp(this.bdj.get((Object)yw2));
    }

    public static void wy() {
        xe.baL.wy();
    }
}

