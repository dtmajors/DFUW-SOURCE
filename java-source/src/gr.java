/*
 * Decompiled with CFR.
 */
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class gr {
    public static final String ENGINE = "Engine";
    public static final String Xh = "Frontend";
    public static final String Xi = "GameLogic";
    public static final String Xj = "AIGameLogic";
    public static final String Xk = "EngineDistributor";
    public static final String Xl = "GameLogicDistributor";
    public static final String Xm = "Persistence";
    public static final String Xn = "XMLGate";
    public static final String Xo = "DBGate";
    public static final int Xp = 0;
    public static final int Xq = 1;
    public static final int qd = 2;
    public static final int Xr = 3;
    public static final int Xs = 4;
    public static final int Xt = 5;
    public int di = 0;
    public String eO = null;
    public int Xu = 0;
    private ldv Xv = null;
    private ldv Wu = null;
    private ldv Xw = null;
    private List<Integer> Xx;

    public int ib() {
        return this.di;
    }

    public void bN(int n) {
        this.di = n;
    }

    public String ic() {
        return this.eO;
    }

    public void aI(String string) {
        this.eO = string;
    }

    public int id() {
        return this.Xu;
    }

    public void bO(int n) {
        this.Xu = n;
    }

    public ldv ie() {
        return this.Xv;
    }

    public void at(ldv ldv2) {
        this.Xv = ldv2;
    }

    public String if() {
        switch (this.Xu) {
            case 0: {
                return "Boot";
            }
            case 1: {
                return "Initialize";
            }
            case 2: {
                return "Load";
            }
            case 3: {
                return "Ready";
            }
            case 4: {
                return "Run";
            }
            case 5: {
                return "Shutdown";
            }
        }
        return "Unknown state: " + this.Xu;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFNodeInfo: NodeID=");
        stringBuilder.append(this.di);
        stringBuilder.append(" NodeType='");
        stringBuilder.append(this.eO);
        stringBuilder.append("' NodeState='");
        stringBuilder.append(this.if());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public ldv ig() {
        return this.Wu;
    }

    public void au(ldv ldv2) {
        this.Wu = ldv2;
    }

    public ldv ih() {
        return this.Xw;
    }

    public void av(ldv ldv2) {
        this.Xw = ldv2;
    }

    public List<Integer> ii() {
        return this.Xx;
    }

    public void w(List<Integer> list) {
        this.Xx = list;
    }
}

