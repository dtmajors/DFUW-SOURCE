/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  lcr
 */
import java.util.Map;

public class bbk
extends btk {
    private final ayd cCy;
    private azn cwP = null;
    private Map<ldv, bbj> cQI = lcn.emw();

    public bbk(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
    }

    public int akf() {
        return this.cQI.size();
    }

    public boolean ZR() {
        return this.cQI.isEmpty();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24837: {
                this.a((fca)dxq2);
                break;
            }
            case 24838: {
                this.a((fcb)dxq2);
                break;
            }
            case 24840: {
                this.a((fbx)dxq2);
                break;
            }
            case 24847: {
                this.a((fcc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fca fca2) {
        bbr bbr2;
        assert (fca2.cQE != null);
        bbr bbr3 = bbr2 = fca2.iFc == null ? null : this.cCy.dR(fca2.iFc);
        if (fca2.gKV == 1) {
            if (bbr2 != null) {
                this.cCy.i(maw.ufz.bD(new Object[]{bbr2.abP(), bbr2.akp(), fca2.cQG}));
            } else {
                this.cCy.i(maw.ufA.bD(fca2.cQG));
            }
            this.cCy.f(maw.ufB.bD(this.cCy.iV(), fca2.cQG));
            if (bbr2 != null) {
                this.a(fca2, bbr2);
            }
        } else if (fca2.gKV == 3) {
            assert (!this.cQI.containsKey(fca2.cQE));
            bbj bbj2 = new bbj();
            bbj2.gp(fca2.cQE);
            bbj2.aJ(fca2.cQF);
            bbj2.fl(fca2.cQG);
            bbj2.fj("Unknown");
            bbj2.c(fca2.iIV);
            this.cQI.put(fca2.cQE, bbj2);
        } else {
            assert (!this.cQI.containsKey(fca2.cQE));
            bbj bbj3 = new bbj();
            bbj3.gp(fca2.cQE);
            bbj3.aJ(fca2.cQF);
            bbj3.fl(fca2.cQG);
            bbj3.c(fca2.iIV);
            bbj3.fj(bbr2 == null ? "Unknown" : bbr2.akp());
            this.cQI.put(fca2.cQE, bbj3);
            if (bbr2 != null) {
                this.cCy.i(maw.ufw.bD(new Object[]{bbr2.abP(), bbr2.akp(), fca2.cQG}));
            } else {
                this.cCy.i(maw.ufx.bD(fca2.cQG));
            }
            this.cCy.f(maw.ufy.bD(this.cCy.iV(), fca2.cQG));
            if (bbr2 != null) {
                this.a(fca2, bbr2);
            }
        }
        if (this.cQI.size() == 1 && this.cCy.aal() == 0 && this.cCy.aaC() == 0) {
            this.cCy.aaI();
        }
    }

    private void a(fcc fcc2) {
        if (fcc2.bqd == null || fcc2.iIY == null) {
            assert (false);
            return;
        }
        if (fcc2.bqd.length == 0 || fcc2.iIY.length == 0) {
            assert (false);
            return;
        }
        if (fcc2.bqd.length != fcc2.iIY.length) {
            assert (false);
            return;
        }
        bbj bbj2 = this.gq(fcc2.aFc);
        if (bbj2 != null) {
            for (int i = 0; i < fcc2.bqd.length; ++i) {
                this.cCy.i(maw.ufF.bD(bbj2.akc(), fcc2.iIY[i], fcc2.bqd[i]));
            }
        }
        this.cCy.a(fcc2.bqd, fcc2.iIY, bqy.dGh, bda.a(fcc2, bbj2, this.MessageDelegator), true);
    }

    private void a(fcb fcb2) {
        assert (fcb2.cQE != null);
        assert (this.cQI.containsKey(fcb2.cQE));
        if (!this.cQI.containsKey(fcb2.cQE)) {
            return;
        }
        bbj bbj2 = this.cQI.remove(fcb2.cQE);
        assert (bbj2 != null);
        switch (fcb2.iFf) {
            case 1: {
                this.cCy.i(maw.ufC.bD(bbj2.akc()));
                break;
            }
            case 2: {
                this.cCy.i(maw.ufD.bD(fcb2.aET, bbj2.akc()));
                this.cCy.f(maw.ufE.bD(fcb2.aET, bbj2.akc(), this.cCy.iV()));
                break;
            }
            default: {
                assert (false) : "Unknown reason";
                break;
            }
        }
    }

    private void a(fbx fbx2) {
        fby fby2 = (fby)this.MessageDelegator.h(24841, this.getGUID(), fbx2.aO());
        this.MessageDelegator.b(fbx2, fby2);
        if (!this.cQI.isEmpty()) {
            ldv[] ldvArray = new ldv[this.cQI.size()];
            ljq[] ljqArray = new ljq[this.cQI.size()];
            String[] stringArray = new String[this.cQI.size()];
            String[] stringArray2 = new String[this.cQI.size()];
            ldr[] ldrArray = new ldr[this.cQI.size()];
            int n = 0;
            for (Map.Entry<ldv, bbj> entry : this.cQI.entrySet()) {
                ldvArray[n] = entry.getKey();
                ljqArray[n] = entry.getValue().akb();
                stringArray[n] = entry.getValue().akc();
                stringArray2[n] = entry.getValue().ajI();
                ldr ldr2 = new ldr();
                ldr2.ilP = entry.getValue().ake().toArray(new ljq[entry.getValue().ake().size()]);
                ldrArray[n] = ldr2;
            }
            fby2.iIT = stringArray2;
            fby2.iIU = ldrArray;
            fby2.iIQ = ldvArray;
            fby2.iIS = stringArray;
            fby2.iIR = ljqArray;
        }
        this.MessageDelegator.F(fby2);
    }

    private void a(fca fca2, bbr bbr2) {
        gmq gmq2 = (gmq)this.MessageDelegator.h(3601, this.getGUID(), lcr.qEl);
        gmq2.cQE = fca2.cQE;
        gmq2.cQG = fca2.cQG;
        gmq2.cQF = fca2.cQF;
        gmq2.cQl = bbr2.akp();
        gmq2.iIV = fca2.iIV;
        gmq2.ff = bbr2.abP().ordinal();
        gmq2.YY = bbr2.js();
        gmq2.YZ = bbr2.jt();
        gmq2.cAw = bbr2.abB();
        gmq2.YU = bbr2.iP();
        gmq2.YV = bbr2.iR();
        gmq2.ade = this.cCy.getGUID();
        gmq2.add = this.cCy.iV();
        gmq2.gKV = fca2.gKV;
        this.MessageDelegator.F(gmq2);
    }

    private bbj gq(ldv ldv2) {
        return this.cQI.get(ldv2);
    }

    public void acz() {
        for (ldv ldv2 : this.cQI.keySet()) {
            fbw fbw2 = (fbw)this.MessageDelegator.h(24848, this.getGUID(), ldv2);
            fbw2.ade = this.cCy.getGUID();
            this.MessageDelegator.F(fbw2);
        }
        this.cQI.clear();
    }

    public void acA() {
        if (this.cQI.isEmpty()) {
            return;
        }
        for (bbj bbj2 : this.cQI.values()) {
            this.gr(bbj2.aka());
        }
    }

    private void gr(ldv ldv2) {
        fbz fbz2 = (fbz)this.MessageDelegator.h(24854, this.GUID, ldv2);
        fbz2.ch(this.cCy.getGUID());
        fbz2.cD(this.cCy.iV());
        this.MessageDelegator.F(fbz2);
    }
}

