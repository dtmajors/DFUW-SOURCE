/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  bas
 *  cug
 */
import java.util.Map;
import java.util.Set;

final class bal
extends azu {
    private bas cME = null;
    private bao cMT = null;
    private boolean cMU = false;
    private ldv cIl = null;
    private String cIz = null;
    private Set<bao> cGX = null;
    private Map<ldv, bam> cMa = null;
    private azx cHT = null;
    private boolean cMV = false;
    private boolean cGS = false;

    public bao aiC() {
        return this.cMT;
    }

    public boolean gb(ldv ldv2) {
        switch (this.cHU) {
            case cIV: {
                if (ldv.au(this.cIl, ldv2)) {
                    return true;
                }
                if (this.cGX == null) break;
                for (bao bao2 : this.cGX) {
                    if (!ldv.au(bao2.g(bbc.cPQ), ldv2)) continue;
                    return true;
                }
                break;
            }
            case cIW: {
                if (this.cMa == null) break;
                for (bam bam2 : this.cMa.values()) {
                    if (ldv.au(bam2.iG(), ldv2)) {
                        return true;
                    }
                    if (!bam2.gd(ldv2)) continue;
                    return true;
                }
                break;
            }
        }
        return false;
    }

    bal(ayd ayd2, azn azn2, bas bas2, bao bao2) {
        super(ayd2, azn2, bac.cIS);
        this.cME = bas2;
        this.cMT = bao2;
        this.cGX = lcn.emx();
        this.cMa = lcn.emw();
    }

    @Override
    public boolean fb(ldv ldv2) {
        switch (this.cHU) {
            case cIV: {
                if (this.cIl.equals(ldv2)) {
                    return true;
                }
                for (bao bao2 : this.cGX) {
                    if (!bao2.g(bbc.cPQ).equals(ldv2)) continue;
                    return true;
                }
                break;
            }
            case cIW: {
                for (bam bam2 : this.cMa.values()) {
                    if (!bam2.iG().equals(ldv2) && !bam2.gd(ldv2)) continue;
                    return true;
                }
                break;
            }
        }
        return false;
    }

    @Override
    public bay fc(ldv ldv2) {
        if (!this.fb(ldv2)) {
            return null;
        }
        baw baw2 = new baw();
        baw2.ch(this.cCy.getGUID());
        baw2.cD(this.cCy.iV());
        baw baw3 = new baw();
        baw3.ch(ldv2);
        block0 : switch (this.cHU) {
            case cIV: {
                baw2.a(false, this.cMT.g(bbc.cPP), this.cMT.h(bbc.cPP));
                if (this.cIl.equals(ldv2)) {
                    baw3.cD(this.cIz);
                    baw3.a(true, null, null);
                    break;
                }
                for (bao bao2 : this.cGX) {
                    if (!bao2.g(bbc.cPQ).equals(ldv2)) continue;
                    baw3.cD(bao2.h(bbc.cPQ));
                    baw3.a(true, this.cIl, this.cIz);
                    break block0;
                }
                break;
            }
            case cIW: {
                baw2.a(true, this.cMT.g(bbc.cPP), this.cMT.h(bbc.cPP));
                boolean bl = false;
                for (bam bam2 : this.cMa.values()) {
                    if (!bam2.iG().equals(ldv2)) continue;
                    baw3.cD(bam2.iV());
                    baw3.a(false, null, null);
                    bl = true;
                    break;
                }
                if (bl) break;
                for (bam bam2 : this.cMa.values()) {
                    if (!bam2.gd(ldv2)) continue;
                    baw3.cD(bam2.ge(ldv2).h(bbc.cPQ));
                    baw3.a(false, bam2.iG(), bam2.iV());
                    break block0;
                }
                break;
            }
        }
        bay bay2 = new bay();
        bay2.fx(this.aDk);
        bay2.h(this.bhH);
        bay2.fb(this.bhD);
        bay2.aH(this.bhF);
        bay2.b(this.cHW);
        bay2.a(baw2, baw3);
        return bay2;
    }

    private bao fd(ldv ldv2) {
        for (bao object : this.cGX) {
            if (!ldv.au(object.g(bbc.cPQ), ldv2)) continue;
            return object;
        }
        for (bam bam2 : this.cMa.values()) {
            if (!bam2.gd(ldv2)) continue;
            return bam2.ge(ldv2);
        }
        return null;
    }

    void g(Set<ldv> set) {
        this.aiG();
        ldv ldv2 = this.cMT.g(bbc.cPP);
        if (!set.contains(ldv2)) {
            this.cMT.a(bbc.cPQ, this.cCy.iV());
            this.cME.gi(ldv2);
            set.add(ldv2);
        }
    }

    @Override
    protected np adN() {
        np np2 = new np();
        np2.ade = this.cCy.getGUID();
        np2.aEg = this.cHU.ordinal();
        np2.aDM = this.aDM;
        np2.aEh = this.cHW.ordinal();
        np2.aEl = this.aEl;
        np2.aEm = this.aEm;
        np2.aEs = this.cIl;
        np2.aDk = this.aDk;
        np2.aEt = this.aEt;
        return np2;
    }

    @Override
    protected void a(np np2) {
        this.cHU = bac.getValueByOrdinal(np2.aEg);
        if (!this.cHU.afV()) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "restoreChallengeData", "Challenge Data is Not for a Mercenary Challenge!!!");
            assert (false);
            this.cME.a(this, false);
            return;
        }
        this.aDM = np2.aDM;
        this.cHW = bab.getPhaseFromOrdinal(np2.aEh);
        this.aEl = np2.aEl;
        this.aEm = np2.aEm;
        this.aDk = np2.aDk;
        this.aEt = np2.aEt;
        this.cME.a(this, true);
    }

    @Override
    protected void adO() {
        this.cMT.a(bbc.cPQ, this.GUID);
        this.aiH();
    }

    @Override
    protected void adP() {
        this.cIh = false;
        this.cMU = true;
        this.cME.c(this, true);
    }

    void start() {
        if (!this.cMU) {
            return;
        }
        if (this.cMT.g(bbc.cPP).equals(this.cIl)) {
            if (!this.cGX.contains(this.cMT)) {
                this.cGX.add(this.cMT);
            }
            this.cHU = bac.cIW;
        } else {
            if (!this.cMa.containsKey(this.cMT.g(bbc.cPP))) {
                this.cMa.put(this.cMT.g(bbc.cPP), new bam(this.cMT.g(bbc.cPP), this.cMT.h(bbc.cPP), this.cMT));
            }
            if (this.cCy.dU(this.cIl) != bcr.cXe) {
                this.cCy.a(this.cIl, this.cIz, null);
            }
            this.cHU = bac.cIV;
        }
        this.adX();
    }

    void end() {
        if (!this.cMU) {
            return;
        }
        this.cMU = false;
        this.cME.b((azu)this);
        this.cwP.a(1806, this.aeo());
        this.a(false, 0, 0);
    }

    private void aiD() {
        if (!this.cMU) {
            return;
        }
        this.cMU = false;
        int n = 0;
        if (!bad.ahy() && (n = (int)((float)this.cMT.i(bbc.cPQ) * bad.ahx())) > 0) {
            this.cCy.a(cug.fkb, n, bqy.dGI, bda.a(this.cMT, n, this.cMT.gk(this.cCy.getGUID()), this.MessageDelegator), false);
        }
        this.cME.b((azu)this);
        this.cwP.a(1806, this.aeo());
        this.a(false, 0, n);
    }

    private void jM(int n) {
        if (!this.cMU) {
            return;
        }
        this.cMU = false;
        int n2 = this.cMT.i(bbc.cPQ);
        if (n2 > 0) {
            this.cCy.a(cug.fkb, n2, bqy.dGI, bda.a(this.cMT, n2, bbc.cPQ, this.MessageDelegator), false);
        }
        int n3 = 0;
        if (this.cMT.ajv() > 0) {
            n3 += this.cMT.ajv();
        } else if (this.cMT.afP() > 0.0f) {
            n3 += (int)((float)n * this.cMT.afP());
        }
        if (n3 > 0) {
            this.cCy.a(cug.fkb, n3, bqy.dGJ, bda.b(this.cMT, n3, bbc.cPQ, this.MessageDelegator), true);
        }
        this.cME.b((azu)this);
        this.cwP.a(1806, this.aeo());
        this.a(true, n3, n2);
    }

    void doTick(ldz ldz2) {
        if (!this.cMU) {
            return;
        }
        if (this.aEl > 0.0) {
            this.aEl -= ldz2.qwh;
        }
        if (!this.cMV && this.cHW == bab.cIO && this.aEl <= bad.agk()) {
            this.ahT();
        }
        if (this.aEl <= 0.0) {
            bad.a(1, this.getClass().getSimpleName(), this.cCy, "doTick", "Current phase ended, in the mercenary challenge for " + this.bhD + ", progressing to next phase!");
            if (this.cHW == bab.cIO) {
                this.cHW = bab.cIP;
                this.aEl += this.cHW.length();
                this.aEm = 0.0;
                this.aiF();
                bad.a(1, this.getClass().getSimpleName(), this.cCy, "doTick", "Progressing to phase-two in the mercenary challenge for " + this.bhD);
            }
        }
    }

    private void adX() {
        switch (this.cHU) {
            case cIW: {
                this.cCy.i(mar.udk.bD(this.cMT.h(bbc.cPP), this.bhD, this.aEl));
                break;
            }
            case cIV: {
                this.cCy.i(mar.udl.bD(this.cMT.h(bbc.cPP), this.bhD, this.aEl));
            }
        }
    }

    private void ahT() {
        if (this.cMV) {
            return;
        }
        switch (this.cHU) {
            case cIW: {
                for (bam bam2 : this.cMa.values()) {
                    if (bam2.aes() <= 0) continue;
                    this.cCy.i(mar.ucL.bD(bam2.aes(), bam2.iV(), this.bhD));
                }
                break;
            }
            case cIV: {
                for (bam bam3 : this.cMa.values()) {
                    if (bam3.aes() <= 0) continue;
                    if (bam3.aiI()) {
                        this.cCy.i(mar.udm.bD(bam3.aes(), bam3.iV(), this.bhD));
                        continue;
                    }
                    this.cCy.i(mar.udn.bD(bam3.aes(), bam3.iV(), this.bhD));
                }
                break;
            }
        }
        this.cMV = true;
    }

    private void aiE() {
        int n = this.cME.Y(this.cHZ, this.aEt) - (this.aEt - this.cIa);
        if (n > 0) {
            this.cCy.i(mal.ubH.bD(new Object[]{this.bhD, n, this.bhH}));
        } else if (this.cGS) {
            this.cCy.i(mal.ubJ.bD(this.bhD));
        } else {
            this.cCy.i(mal.ubI.bD(this.bhD));
            this.cGS = true;
        }
    }

    private void aiF() {
        if (this.bhD == null || this.bhH == null) {
            return;
        }
        int n = this.cME.Y(this.cHZ, this.aEt) - (this.aEt - this.cIa);
        if (n > 0) {
            this.cCy.i(mar.ucO.bD(new Object[]{this.bhD, n, this.bhH}));
        } else {
            switch (this.cHU) {
                case cIW: {
                    this.cCy.i(mar.udo.bD(new Object[]{this.bhD, this.bhH}));
                    break;
                }
                case cIV: {
                    this.cCy.i(mar.udp.bD(new Object[]{this.bhD, this.bhH}));
                }
            }
        }
    }

    private void f(String string, int n) {
        this.cCy.i(man.ucn.bD(n, cug.fkb, string, this.bhD));
    }

    private void a(boolean bl, int n, int n2) {
        if (bl) {
            if (n2 > 0) {
                switch (this.cHU) {
                    case cIW: {
                        this.cCy.i(mar.udr.bD(this.cMT.h(bbc.cPP), this.bhD, n, cug.fkb, n2));
                        break;
                    }
                    case cIV: {
                        this.cCy.i(mar.udt.bD(this.cMT.h(bbc.cPP), this.bhD, n, cug.fkb, n2));
                    }
                }
            } else {
                switch (this.cHU) {
                    case cIW: {
                        this.cCy.i(mar.udq.bD(this.cMT.h(bbc.cPP), this.bhD, n, cug.fkb));
                        break;
                    }
                    case cIV: {
                        this.cCy.i(mar.uds.bD(this.cMT.h(bbc.cPP), this.bhD, n, cug.fkb));
                    }
                }
            }
        } else if (n2 > 0) {
            switch (this.cHU) {
                case cIW: {
                    this.cCy.i(mar.udv.bD(this.cMT.h(bbc.cPP), this.bhD, n2, cug.fkb));
                    break;
                }
                case cIV: {
                    this.cCy.i(mar.udx.bD(this.cMT.h(bbc.cPP), this.bhD, n2, cug.fkb));
                }
            }
        } else {
            switch (this.cHU) {
                case cIW: {
                    this.cCy.i(mar.udu.bD(this.cMT.h(bbc.cPP), this.bhD));
                    break;
                }
                case cIV: {
                    this.cCy.i(mar.udw.bD(this.cMT.h(bbc.cPP), this.bhD));
                }
            }
        }
    }

    private void aiG() {
        this.a(this.cMT.a(bbc.cPP), this.cMT.g(bbc.cPP), this.cCy.getGUID(), this.cCy.iV());
    }

    @Override
    azx aeo() {
        if (this.cHT == null) {
            this.cHT = new azx();
            this.cHT.fw(this.cCy.getGUID());
            this.cHT.fx(this.aDk);
        }
        azv[] azvArray = new azv[this.cMa.size()];
        int n = 0;
        for (bam bam2 : this.cMa.values()) {
            azvArray[n++] = bam2.aiJ();
        }
        this.cHT.a(azvArray);
        this.cHT.cn(this.cIc);
        this.cHT.co(this.cIb);
        this.cHT.jA(this.cME.Y(this.cHZ, this.aEt) - (this.aEt - this.cIa));
        return this.cHT;
    }

    private void aiH() {
        etn etn2 = (etn)this.MessageDelegator.h(20025, this.GUID, this.cMT.g(bbc.cPP));
        etn2.D(this.cMT);
        this.MessageDelegator.F(etn2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20022: {
                this.a((ett)dxq2);
                break;
            }
            case 20026: {
                this.a((eto)dxq2);
                break;
            }
            case 19990: {
                this.a((etl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ett ett2) {
        if (ett2.bLY()) {
            this.jM(ett2.adA());
        } else {
            this.aiD();
        }
    }

    private void a(eto eto2) {
        if (eto2.vA()) {
            this.cMT.a(bbc.cPP, eto2.aiC().a(bbc.cPP));
            this.cME.b(this, true);
        } else {
            this.cME.b(this, false);
        }
    }

    @Override
    protected void a(evv evv2) {
        if (!evv2.bMR().ajr()) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateMessage", "Update Received That is Not a Valid Mercenary Update!!");
            assert (false);
            return;
        }
        switch (evv2.bMR()) {
            case cPv: {
                this.a((evi)evv2);
                break;
            }
            case cPw: {
                this.a((evj)evv2);
                break;
            }
            case cPx: {
                this.a((evy)evv2);
                break;
            }
            case cPy: {
                this.a((evx)evv2);
                break;
            }
            case cPz: {
                this.a((evw)evv2);
                break;
            }
            case cPA: {
                this.a((evs)evv2);
                break;
            }
            case cPB: {
                this.a((evo)evv2);
                break;
            }
            case cPC: {
                this.a((evn)evv2);
                break;
            }
            case cPD: {
                this.a((evp)evv2);
                break;
            }
            case cPF: {
                this.a((evk)evv2);
                break;
            }
            case cPH: {
                this.b((evt)evv2);
                break;
            }
            case cPI: {
                this.a((evz)evv2);
                break;
            }
            case cPJ: {
                this.a((evr)evv2);
                break;
            }
            case cPK: {
                this.a((evm)evv2);
                break;
            }
            case cPL: {
                this.a((evu)evv2);
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
    }

    private void a(evi evi2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (this.cMa.containsKey(evi2.bKb())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoined", "Attacker Already Exists!!!");
            assert (false);
            return;
        }
        bam bam2 = new bam(evi2.bKb(), evi2.bLx(), this.cMT);
        this.cMa.put(bam2.iG(), bam2);
        this.cwP.a(1797, this.aeo(), bam2.aiJ());
    }

    private void a(evj evj2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (!this.cMa.containsKey(evj2.bKb())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerLeftMessage", "Attacker Does Not Exist!!!");
            assert (false);
            return;
        }
        bam bam2 = this.cMa.remove(evj2.bKb());
        if (bam2.aiI()) {
            this.aiD();
            return;
        }
        this.cwP.a(1798, this.aeo(), bam2.aiJ());
    }

    private void a(evy evy2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (!this.cMa.containsKey(evy2.bKb())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateSiegeStonePlacedMessage", "Attacker Does Not Exist!!!");
            assert (false);
            return;
        }
        bam bam2 = this.cMa.get(evy2.bKb());
        ban ban2 = bam2.a(evy2.bKf(), evy2.bMS(), evy2.bLW(), evy2.bMT(), evy2.bMU());
        if (ban2 == null) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateSiegeStonePlacedMessage", "Siege-Stone Failed to be Placed!!!");
            assert (false);
            return;
        }
        this.cwP.a(1801, this.aeo(), bam2.aiJ(), ban2.aew());
    }

    private void a(evx evx2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (!this.cMa.containsKey(evx2.afr())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateSiegeStoneHealthChangedMessage", "Attacker Does Not Exist!!!");
            assert (false);
            return;
        }
        bam bam2 = this.cMa.get(evx2.afr());
        ban ban2 = bam2.f(evx2.bKf(), evx2.bKg());
        if (ban2 == null) {
            return;
        }
        if (bam2.aiI()) {
            this.cwP.a(1803, this.aeo(), bam2.aiJ(), ban2.aew());
        }
    }

    private void a(evw evw2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (!this.cMa.containsKey(evw2.bKb())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateSiegeStoneDestroyedMessage", "Attacker Does Not Exist!!!");
            assert (false);
            return;
        }
        bam bam2 = this.cMa.get(evw2.bKb());
        ban ban2 = bam2.gf(evw2.bKf());
        if (ban2 == null) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateSiegeStoneDestroyedMessage", "Siege-Stone Failed to be Destroyed!!!");
            assert (false);
            return;
        }
        this.cwP.a(1802, this.aeo(), bam2.aiJ(), ban2.aew());
    }

    private void a(evs evs2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (evs2.bMB() == this.cHZ && evs2.bMC() == this.cIa && evs2.bMD() == this.aEt) {
            return;
        }
        this.cHZ = evs2.bMB();
        this.cIa = evs2.bMC();
        this.aEt = evs2.bMD();
        this.aiE();
        this.cwP.a(1799, this.aeo());
    }

    private void a(evo evo2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (this.cIb == evo2.afn() && this.cIc == evo2.afm()) {
            return;
        }
        this.cIb = evo2.afn();
        this.cIc = evo2.afm();
        this.cwP.a(1804, this.aeo());
    }

    private void a(evn evn2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (!this.cMa.containsKey(evn2.afr())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerScoreChangedMessage", "Attacker Does Not Exist!!!");
            assert (false);
            return;
        }
        bam bam2 = this.cMa.get(evn2.afr());
        if (!bam2.js(evn2.bMA())) {
            return;
        }
        this.cwP.a(1805, this.aeo(), bam2.aiJ());
    }

    private void a(evp evp2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (this.cGX.contains(evp2.bMz())) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateDefenderMercenaryJoinedMessage", "Mercenary Already Exists!!!");
            assert (false);
            return;
        }
        this.cGX.add(evp2.bMz());
        if (!this.cMT.g(bbc.cPP).equals(this.cIl) && this.cCy.dU(evp2.bMz().g(bbc.cPQ)) != bcr.cXe) {
            this.cCy.a(evp2.bMz().g(bbc.cPQ), evp2.bMz().h(bbc.cPQ), null);
        }
    }

    private void a(evk evk2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        if (!this.cMa.containsKey(evk2.bMz().g(bbc.cPP))) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerMercenaryJoinedMessage", "Attacker Does Not Exist!!!");
            assert (false);
            return;
        }
        bam bam2 = this.cMa.get(evk2.bMz().g(bbc.cPP));
        bam2.o(evk2.bMz());
    }

    private void b(evt evt2) {
        int n;
        assert (evt2.bMG().length == evt2.bMH().length);
        assert (evt2.bMH().length == evt2.bMI().length);
        assert (evt2.bMJ().length == evt2.bMK().length);
        assert (evt2.bMK().length == evt2.bML().length);
        assert (evt2.bML().length == evt2.bMM().length);
        assert (evt2.bMM().length == evt2.bMN().length);
        assert (evt2.bMN().length == evt2.bMO().length);
        assert (evt2.bMO().length == evt2.bMP().length);
        this.aEl = evt2.aeQ() - (this.MessageDelegator.arc().rgz - evt2.afJ());
        this.aEm = evt2.aeR();
        this.cHW = evt2.aeP();
        this.aDk = evt2.afl();
        this.bhD = evt2.afw();
        this.bhH = evt2.afx();
        this.bhF = evt2.afy();
        this.bhG = evt2.afz();
        this.cHZ = evt2.bMB();
        this.cIa = evt2.bMC();
        this.aEt = evt2.bMD();
        this.cIb = evt2.bMF();
        this.cIc = evt2.bME();
        this.cIl = evt2.adE();
        this.cIz = evt2.adF();
        for (bao bao2 : evt2.adL()) {
            if (this.cGX.contains(bao2)) continue;
            this.cGX.add(bao2);
        }
        for (n = 0; n < evt2.bMG().length; ++n) {
            bam bam2 = this.cMa.get(evt2.bMG()[n]);
            if (bam2 == null) {
                bam2 = new bam(evt2.bMG()[n], evt2.bMH()[n], this.cMT);
                this.cMa.put(bam2.iG(), bam2);
            }
            bam2.js(evt2.bMI()[n]);
        }
        for (n = 0; n < evt2.bMJ().length; ++n) {
            assert (evt2.bMP()[n] >= 0);
            assert (evt2.bMP()[n] < evt2.bMG().length);
            bam bam3 = this.cMa.get(evt2.bMG()[evt2.bMP()[n]]);
            if (bam3 == null) {
                bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateMercenaryBulkUpdateMessage", "Attacker Does Not Exist for Siege-Stone... WTF!!!");
                assert (false);
                continue;
            }
            ban ban2 = bam3.a(evt2.bMJ()[n], evt2.bMK()[n], evt2.bML()[n], evt2.bMM()[n], evt2.bMN()[n]);
            if (ban2 == null) {
                bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateMercenaryBulkUpdateMessage", "Siege-Stone Failed to Be Placed!!!... FFS!!!... Checking for Already Placed Version...");
                ban2 = bam3.gc(evt2.bMJ()[n]);
                if (ban2 == null) {
                    bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateMercenaryBulkUpdateMessage", "No Placed Siege-Stone Exists!!!... Something is Very Wrong!!!");
                    assert (false);
                    continue;
                }
            }
            ban2.cm(evt2.bMO()[n]);
        }
        for (n = 0; n < evt2.bMQ().length; ++n) {
            bam bam4 = this.cMa.get(evt2.bMQ()[n].g(bbc.cPP));
            if (bam4 == null) {
                bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateMercenaryBulkUpdateMessage", "Attacker Does Not Exist for Mercenary... WTF!!!");
                assert (false);
                continue;
            }
            bam4.o(evt2.bMQ()[n]);
        }
        this.cMU = true;
        this.start();
        this.cwP.a(1796, this.aeo());
    }

    private void a(evz evz2) {
        if (!this.cMU) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestUpdateAttackerJoinedMessage", "Delta-Update Received Before Challenge Started (Initial Bulk Update Received and Handled)!!!");
            assert (false);
            return;
        }
        this.aEl = evz2.aeQ() - (this.MessageDelegator.arc().rgz - evz2.afJ());
        this.aEm += evz2.bLm();
    }

    private void a(evu evu2) {
        bao bao2 = this.fd(evu2.afM());
        if (bao2 == null) {
            return;
        }
        bao2.a(bbc.cPQ, evu2.afN());
    }

    private void a(evr evr2) {
        if (!ldv.au(this.cIl, evr2.afk())) {
            return;
        }
        this.cIz = evr2.afB();
    }

    private void a(evm evm2) {
        bam bam2 = this.cMa.get(evm2.afr());
        if (bam2 == null) {
            return;
        }
        bam2.cD(evm2.afs());
    }

    private void a(etl etl2) {
        if (etl2.bLT() > 0) {
            this.cCy.a(cug.fkb, etl2.bLT(), bqy.dGl, bda.a(etl2.bLT(), this.bhD, etl2.bLW(), etl2.bLU(), etl2.bLV(), this.MessageDelegator), true);
            this.f(etl2.bLV(), etl2.bLT());
        }
    }
}

