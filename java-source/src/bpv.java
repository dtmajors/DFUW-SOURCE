/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Collection;
import java.util.List;

public class bpv
extends bnx
implements dni {
    private String[] dAZ = null;
    private String[] dBa = null;
    private String[] dBb = null;
    private String dBc = null;
    private String dBd;
    private ljq dBe;
    private lgl dBf;
    private String dBg;
    private int dBh;
    private int bnm;
    private String dBi = "no name";
    private boolean dBj = true;
    private List<bpm> dBk = lcn.emv();
    private dnk dBl = null;

    public String[] atJ() {
        return this.dBa;
    }

    public void f(String[] stringArray) {
        this.dBa = stringArray;
    }

    public String atK() {
        return this.dBd;
    }

    public void fX(String string) {
        this.dBd = string;
    }

    public String[] atL() {
        return this.dAZ;
    }

    public void g(String[] stringArray) {
        this.dAZ = stringArray;
    }

    public final String[] atM() {
        return this.dBb;
    }

    public final void h(String[] stringArray) {
        this.dBb = stringArray;
    }

    public String atN() {
        return this.dBc;
    }

    public void fY(String string) {
        this.dBc = string;
    }

    public final ljq atO() {
        return this.dBe;
    }

    public final void aT(ljq ljq2) {
        this.dBe = ljq2;
    }

    public final lgl atP() {
        return this.dBf;
    }

    public final void e(lgl lgl2) {
        this.dBf = lgl2;
    }

    public final String atQ() {
        return this.dBg;
    }

    public final void fZ(String string) {
        this.dBg = string;
    }

    public final int atR() {
        return this.dBh;
    }

    public final void lM(int n) {
        this.dBh = n;
    }

    public int atS() {
        return this.bnm;
    }

    public void fx(int n) {
        this.bnm = n;
    }

    public String arX() {
        return this.dBi;
    }

    public void ga(String string) {
        this.dBi = string;
    }

    public boolean atT() {
        return this.dBj;
    }

    public void dJ(boolean bl2) {
        this.dBj = bl2;
    }

    public bpm lN(int n) {
        return this.lP(n);
    }

    @Override
    public int az() {
        return lea.enW().getType(this.dBc);
    }

    public final dnk atU() {
        return this.dBl;
    }

    @Override
    public void cleanUp() {
        if (this.dBj) {
            this.lQ(2);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.dwL != null) {
            this.asi();
        }
        if (this.dBj) {
            this.lQ(1);
        }
        this.dBl = new dnk(this);
        this.dBl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dBl);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11777: {
                this.a((fjv)dxq2);
                break;
            }
            case 11790: {
                this.b((fjx)dxq2);
                break;
            }
            case 4878: {
                this.a((gbb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.dBj) {
            this.lQ(2);
        }
    }

    @Override
    protected void d(bnp bnp2) {
        this.lR(this.bie);
    }

    @Override
    protected final void asi() {
        if (this.dwL != null) {
            this.dwL.dd(this.dwK);
        }
    }

    @Override
    protected final void asj() {
    }

    private ldv g(ldv ldv2, int n, int n2) {
        return lcr.p((ldv)ldv2, (int)n, (int)n2);
    }

    private ldv ao(int n, int n2) {
        return this.g(lcr.qzp, n, n2);
    }

    public void k(Collection<bpm> collection) {
        collection.addAll(this.dBk);
    }

    public void lO(int n) {
        bpm bpm2 = this.lP(n);
        if (bpm2 == null) {
            lfn.b(5, "SFInteractionManagerServer", "forceDisconnect(): Could not find InteractingClient for nodeid " + n);
            return;
        }
        gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.GUID, bpm2.dzZ);
        this.MessageDelegator.F(gbc2);
    }

    private bpm lP(int n) {
        bpm bpm2 = null;
        int n2 = this.dBk.size();
        for (int i = 0; i < n2; ++i) {
            bpm2 = this.dBk.get(i);
            if (bpm2.RB != n) continue;
            return bpm2;
        }
        return null;
    }

    private bpm iC(ldv ldv2) {
        bpm bpm2 = null;
        int n = this.dBk.size();
        for (int i = 0; i < n; ++i) {
            bpm2 = this.dBk.get(i);
            if (!bpm2.dzZ.equals(ldv2)) continue;
            return bpm2;
        }
        return null;
    }

    private void a(fjv fjv2) {
        if (fjv2.RB <= 0) {
            lfn.b(5, "SFInteractionManagerServer", "handleInteractionActivateMessage() ClientNodeID is invalid.");
            return;
        }
        bpm bpm2 = new bpm();
        bpm2.dzZ = fjv2.aO();
        bpm2.dAa = this.g(this.GUID, fjv2.RB, bpm2.dzZ.enw());
        bpm2.RB = fjv2.RB;
        this.dBk.add(bpm2);
        for (bnp bnp2 : this.dwM) {
            bnp2.a(bpm2);
        }
        ldv ldv2 = this.ao(fjv2.RB, bpm2.dzZ.enw());
        this.a(ldv2, new ldv[]{this.GUID}, this.GUID);
    }

    private void b(fjx fjx2) {
        if (!fjx2.bQc()) {
            return;
        }
        String string = fjx2.arX();
        if (!string.equalsIgnoreCase(this.dBi)) {
            return;
        }
        fjy fjy2 = (fjy)this.MessageDelegator.h(11791, this.GUID, fjx2.aO());
        fjy2.ga(fjx2.arX());
        bnp bnp2 = this.lk(4);
        if (bnp2 != null) {
            fjy2.iA(bnp2.getGUID());
        } else {
            lfn.b(5, "SFInteractionManagerServer", "handleInteractionGlobalGUIDRequestMessage() This interaction does not have a quests. Name: " + this.dBi);
            fjy2.iA(lcr.qAC);
        }
        fjy2.iz(this.Uj());
        this.MessageDelegator.F(fjy2);
    }

    private void a(gbb gbb2) {
        bpm bpm2 = this.iC(gbb2.aO());
        if (bpm2 == null) {
            lfn.b(5, "SFInteractionManagerServer", "handlePlayerSessionEndMessage() Could not find interactingclient for sessionhandler " + gbb2.aO());
            return;
        }
        for (bnp bnp2 : this.dwM) {
            bnp2.b(bpm2);
        }
        this.dBk.remove(bpm2);
        ldv ldv2 = lcr.p((ldv)lcr.qzp, (int)bpm2.RB, (int)bpm2.dzZ.enw());
        this.b(ldv2, new ldv[]{this.GUID}, this.GUID);
    }

    private void lQ(int n) {
        if (this.Uj() == null) {
            lfn.b(5, "SFInteractionManagerServer", "sendInteractionGlobalRegisterRequestMessage() PhysicalObjectGUID is null.");
        }
        fjz fjz2 = (fjz)this.MessageDelegator.h(11789, this.GUID, lcr.qEm);
        fjz2.dBi = this.ayB;
        fjz2.iOv = n;
        fjz2.dtj = this.Uj();
        this.MessageDelegator.F(fjz2);
    }

    private void a(ldv ldv2, ldv[] ldvArray, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        assert (ldv3 != null);
        goa goa2 = (goa)this.MessageDelegator.h(21762, this.GUID, lcr.qAJ);
        goa2.adA = ldv2;
        goa2.jnv = ldvArray;
        goa2.adB = ldv3;
        goa2.adG = false;
        this.MessageDelegator.F(goa2);
    }

    private void b(ldv ldv2, ldv[] ldvArray, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        assert (ldv3 != null);
        goh goh2 = (goh)this.MessageDelegator.h(21764, this.GUID, lcr.qAJ);
        goh2.adA = ldv2;
        goh2.jnv = ldvArray;
        goh2.jnQ = ldv3;
        goh2.adG = false;
        this.MessageDelegator.F(goh2);
    }

    private void lR(int n) {
        gyi gyi2 = (gyi)this.MessageDelegator.h(12039, this.GUID, lcr.qAI);
        gyi2.bie = n;
        this.MessageDelegator.F(gyi2);
    }
}

