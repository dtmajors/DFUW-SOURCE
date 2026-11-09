/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class bzo {
    public static final boolean dtQ = false;
    private Map<Integer, List<bzb>> edT = lcn.emw();
    private byx edU = null;
    private byv edV = new byv();

    public bzo() {
        this.edV.setDefaultValues();
    }

    public Map aFu() {
        return this.edT;
    }

    public void c(byx byx2) {
        assert (this.edU == null);
        assert (byx2 != null);
        this.edU = byx2;
    }

    public byv aEP() {
        return this.edV;
    }

    public void f(byv byv2) {
        this.edV = byv2;
    }

    public void a(bzo bzo2) {
        for (List<bzb> list : this.edT.values()) {
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                bzb bzb2 = list.get(i2);
                bzo2.a(bzb2.aEZ());
            }
        }
    }

    public void a(byv byv2, boolean bl, boolean bl2) {
        if (this.edV.equals(byv2)) {
            return;
        }
        if (bl) {
            if (this.edV.vK() != byv2.vK()) {
                this.c(1, byv2.vK(), bl2);
            }
            if (this.edV.vL() != byv2.vL()) {
                this.c(2, byv2.vL(), bl2);
            }
            if (this.edV.vN() != byv2.vN()) {
                this.c(4, byv2.vN(), bl2);
            }
            if (this.edV.vO() != byv2.vO()) {
                this.c(5, byv2.vO(), bl2);
            }
            if (this.edV.vP() != byv2.vP()) {
                this.c(6, byv2.vP(), bl2);
            }
        } else if (this.edV.vM() != byv2.vM()) {
            this.c(3, byv2.vM(), bl2);
        }
    }

    public void g(byv byv2) {
        if (this.edV.equals(byv2)) {
            return;
        }
        if (this.edV.vK() != byv2.vK()) {
            this.c(1, byv2.vK(), true);
        }
        if (this.edV.vN() != byv2.vN()) {
            this.c(4, byv2.vN(), true);
        }
        if (this.edV.vP() != byv2.vP()) {
            this.c(6, byv2.vP(), true);
        }
    }

    public void a(bzb bzb2) {
        if (bzb2 == null) {
            lfn.b(5, "SFStateMachine", "addOperationRule() OperationRule is null.");
            return;
        }
        int n = bzb.g(bzb2.CS(), bzb2.aEU(), bzb2.aEV());
        Integer n2 = new Integer(n);
        List<bzb> list = this.edT.get(n2);
        if (list == null) {
            list = lcn.abH(5);
            this.edT.put(n2, list);
        }
        if (list.contains(bzb2)) {
            lfn.b(5, "SFStateMachine", "addOperationRule() Rule has already been added to rules list.");
            lfn.b(5, "SFStateMachine", "addOperationRule() " + bzb2);
            return;
        }
        list.add(bzb2);
    }

    public void aA(int n, int n2) {
        boolean bl = this.e(this.edU.isServerObject(), n);
        this.c(n, n2, bl);
    }

    private void i(byz byz2) {
        int n = bzb.g(byz2.bpX, 0, 0);
        this.a(n, byz2);
        n = bzb.g(byz2.bpX, byz2.ecZ, 0);
        this.a(n, byz2);
        n = bzb.g(byz2.bpX, 0, byz2.eda);
        this.a(n, byz2);
        n = bzb.g(byz2.bpX, byz2.ecZ, byz2.eda);
        this.a(n, byz2);
    }

    private void a(int n, byz byz2) {
        Integer n2 = new Integer(n);
        List<bzb> list = this.edT.get(n2);
        if (list != null) {
            if (list.isEmpty()) {
                this.edT.remove(n2);
                return;
            }
            int n3 = list.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                bzb bzb2 = list.get(i2);
                if (!bzb2.g(byz2)) continue;
                byw.d[] dArray = bzb2.aEX();
                int n4 = dArray.length;
                for (int i3 = 0; i3 < n4; ++i3) {
                    this.edU.a(dArray[i3], byz2);
                }
                byw.c[] cArray = bzb2.aEY();
                if (cArray == null) continue;
                int n5 = cArray.length;
                for (n4 = 0; n4 < n5; ++n4) {
                    this.edU.a(cArray[n4]);
                }
            }
        }
    }

    private String az(int n, int n2) {
        return byw.az(n, n2);
    }

    private boolean e(boolean bl, int n) {
        if (bl) {
            switch (n) {
                case 3: 
                case 7: {
                    return true;
                }
            }
            return false;
        }
        switch (n) {
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 6: {
                return true;
            }
        }
        return false;
    }

    private void c(int n, int n2, boolean bl) {
        if (this.edU.isServerObject()) {
            // empty if block
        }
        int n3 = 0;
        switch (n) {
            case 1: {
                if (this.edV.vK() == n2) {
                    return;
                }
                n3 = this.edV.vK();
                this.edV.dx(n2);
                break;
            }
            case 2: {
                if (this.edV.vL() == n2) {
                    return;
                }
                n3 = this.edV.vL();
                this.edV.dy(n2);
                break;
            }
            case 3: {
                if (this.edV.vM() == n2) {
                    return;
                }
                n3 = this.edV.vM();
                this.edV.dz(n2);
                break;
            }
            case 4: {
                if (this.edV.vN() == n2) {
                    return;
                }
                n3 = this.edV.vN();
                this.edV.dA(n2);
                break;
            }
            case 5: {
                if (n2 == 4) {
                    // empty if block
                }
                if (this.edV.vO() == n2) {
                    return;
                }
                n3 = this.edV.vO();
                this.edV.dB(n2);
                break;
            }
            case 6: {
                if (this.edV.vP() == n2) {
                    return;
                }
                n3 = this.edV.vP();
                this.edV.dC(n2);
                break;
            }
            case 7: {
                if (this.edV.vQ() == n2) {
                    return;
                }
                n3 = this.edV.vQ();
                this.edV.dD(n2);
                break;
            }
            default: {
                lfn.b(5, "SFStateMachine", "performStateChange() ModeType is invalid: " + n);
                assert (false);
                return;
            }
        }
        byz byz2 = new byz();
        byz2.bpX = n;
        byz2.ecZ = n3;
        byz2.eda = n2;
        byz2.edb = bl;
        this.i(byz2);
        this.edU.a(this.edV.aEl(), byz2.edb);
    }

    private void b(int n, String string, String string2) {
    }
}

