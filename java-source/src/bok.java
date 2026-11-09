/*
 * Decompiled with CFR.
 */
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bok {
    private ldv dxI = null;
    private List<bop> dxJ = lcn.emv();
    private int dxK = 0;
    private ldv dxL = null;
    private ldv dxM = null;
    private ldv dxN = null;
    private String aGb = null;
    private boolean dxO = false;
    private boolean RestartIfFailed = false;
    private boolean ayE = false;
    private boolean OneTimeOnly = false;
    private boolean dxP = false;
    private boolean dxQ = false;

    public int asv() {
        return this.dxJ.size();
    }

    public ldv asw() {
        return this.dxI;
    }

    public void ie(ldv ldv2) {
        this.dxI = ldv2;
    }

    public List<bop> asx() {
        return this.dxJ;
    }

    public void aj(List<bop> list) {
        this.dxJ = list;
    }

    public int asy() {
        return this.dxK;
    }

    public void lo(int n) {
        this.dxK = n;
    }

    public ldv asz() {
        return this.dxM;
    }

    public void if(ldv ldv2) {
        this.dxM = ldv2;
    }

    public ldv asA() {
        return this.dxL;
    }

    public void ig(ldv ldv2) {
        this.dxL = ldv2;
    }

    public bop lp(int n) {
        if (this.dxJ.size() <= n) {
            return null;
        }
        return this.dxJ.get(n);
    }

    public ldv asB() {
        return this.dxN;
    }

    public void ih(ldv ldv2) {
        this.dxN = ldv2;
    }

    public String qM() {
        return this.aGb;
    }

    public void fT(String string) {
        this.aGb = string;
    }

    public boolean asC() {
        return this.dxO;
    }

    public void du(boolean bl2) {
        this.dxO = bl2;
    }

    public boolean asD() {
        return this.dxP;
    }

    public void a(boolean bl2, List<due> list) {
        if (list.size() > 1) {
            this.dxP = false;
            return;
        }
        due due2 = list.get(0);
        if (due2.Type != dud.hdQ) {
            this.dxP = false;
            return;
        }
        if (due2.bAO() == null || due2.bAO().trim().equals("")) {
            this.dxP = false;
            return;
        }
        this.dxP = bl2;
    }

    public boolean asE() {
        return this.ayE;
    }

    public void dv(boolean bl2) {
        this.ayE = bl2;
    }

    public boolean qW() {
        return this.RestartIfFailed;
    }

    public void dw(boolean bl2) {
        this.RestartIfFailed = bl2;
    }

    public boolean asF() {
        return this.dxQ;
    }

    public void dx(boolean bl2) {
        this.dxQ = bl2;
    }

    public boolean asG() {
        return this.OneTimeOnly;
    }

    public void dy(boolean bl2) {
        this.OneTimeOnly = bl2;
    }
}

