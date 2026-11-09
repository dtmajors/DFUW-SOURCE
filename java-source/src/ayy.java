/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  cug
 *  lcr
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ayy
extends btk
implements bto {
    private static final int cCt = 1;
    private static final int cCu = 2;
    private static final int cCv = 3;
    private static final int cCw = 4;
    private ldv cCx = null;
    private ayd cCy = null;
    private static final float bBr = 2.0f;
    private Set<ldv> cCz = lcn.emx();
    private Set<ldv> cCA = lcn.emx();
    private azb cCB = null;
    private Map<ldv, Integer> cCC = lcn.emw();
    private static double cCD = 1.0;
    private double abo = 0.0;
    private lid<eeg> cCE = new lid();

    public azb acd() {
        return this.cCB;
    }

    public void a(azb azb2) {
        this.cCB = azb2;
    }

    public Set<ldv> ace() {
        return this.cCz;
    }

    public ayy(ayd ayd2) {
        this.cCy = ayd2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.acf();
    }

    @Override
    public void cleanUp() {
        this.acg();
        super.cleanUp();
    }

    private void acf() {
        ljq ljq2 = new ljq(0.6f, 0.7f, -13.3f);
        float f = 1.0f;
        assert (this.cCB.Xu() > 0.0f);
        kou kou2 = (kou)this.MessageDelegator.h(534);
        kou2.pTs = this.cCB.Xv();
        kou2.pUM = this.cCB.Xu();
        kou2.pUL = 0;
        kou2.dtg = 2.0f;
        kou2.pUN = true;
        kou2.pUO = false;
        kou2.dsK = true;
        kou2.iBr = true;
        kou2.pUK = false;
        kou2.Ud = this.GUID;
        kou2.ec = this.GUID;
        this.MessageDelegator.a(kou2);
    }

    private void acg() {
        if (this.cCx == null) {
            return;
        }
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.hsP = false;
        kov2.iBr = false;
        kov2.Ud = this.cCx;
        kov2.ec = this.GUID;
        this.MessageDelegator.a(kov2);
        this.cCx = null;
    }

    public void eH(ldv ldv2) {
        Iterator<ldv> iterator = this.cCA.iterator();
        while (iterator.hasNext()) {
            ldv ldv3 = iterator.next();
            if (!ldv.au(ldv2, ldv3)) continue;
            iterator.remove();
            this.cCz.add(ldv2);
            this.eJ(ldv2);
            break;
        }
    }

    public void eI(ldv ldv2) {
        Iterator<ldv> iterator = this.cCz.iterator();
        while (iterator.hasNext()) {
            ldv ldv3 = iterator.next();
            if (!ldv.au(ldv2, ldv3)) continue;
            iterator.remove();
            this.cCA.add(ldv2);
            this.eK(ldv2);
            break;
        }
    }

    private void eJ(ldv ldv2) {
        assert (this.cCB != null);
        this.cCB.eO(ldv2);
    }

    private void eK(ldv ldv2) {
        assert (this.cCB != null);
        this.cCB.eP(ldv2);
    }

    private void a(ldv ldv2, int n, int n2) {
        fuy fuy2 = (fuy)this.MessageDelegator.h(5640, this.getGUID(), ldv2);
        fuy2.iXx = true;
        fuy2.sk(n);
        this.MessageDelegator.F(fuy2);
        this.cCC.put(ldv2, n2);
    }

    private void y(ldv ldv2, int n) {
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
        eef2.sk(n);
        eef2.jM(false);
        eef2.duz = new int[]{13744};
        this.MessageDelegator.F(eef2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5641: {
                this.a((fuz)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void a(kwr kwr2) {
        if (kwr2.getResult() != 0) {
            lfn.b(5, "SFClanCityAreaSensorManager", "handleSensorResponse() Could not create spheresensor");
        }
        this.cCx = kwr2.axa();
    }

    private void a(kws kws2) {
        Object object;
        if (kws2.qfT != null) {
            for (ldv ldv2 : kws2.qfT) {
                ldv ldv3 = lcr.tQ((ldv)ldv2);
                if (this.cCy.dQ(ldv3)) {
                    this.cCz.remove(ldv3);
                    this.eK(ldv3);
                    object = this.cCy.dR(ldv3);
                    this.cCy.a(may.ugF.bD(new Object[]{((bbr)object).abP(), ((bbr)object).akp(), this.cCB.Xz(), this.cCB.Xt()}), ldv3);
                } else {
                    this.cCA.remove(ldv3);
                    this.y(ldv3, 2);
                }
                this.cCy.b(may.ugH.bD(new Object[]{this.cCB.Xz(), this.cCB.Xt(), this.cCy.iV()}), ldv3);
            }
        }
        int n = 0;
        if (kws2.qfc != null) {
            assert (kws2.qfR != null);
            for (int n2 : kws2.qfc) {
                Object object2;
                object = kws2.qfR[n];
                if (lea.enW().isDescendant(n2, cug.fgJ) || lea.enW().isDescendant(n2, cug.fgC)) {
                    object2 = lcr.tQ((ldv)object);
                    if (this.cCy.dQ((ldv)object2)) {
                        this.cCz.add((ldv)object2);
                        this.eJ((ldv)object2);
                        bbr bbr2 = this.cCy.dR((ldv)object2);
                        this.cCy.a(may.ugE.bD(new Object[]{bbr2.abP(), bbr2.akp(), this.cCB.Xz(), this.cCB.Xt()}), (ldv)object2);
                    } else {
                        this.cCA.add((ldv)object2);
                        this.y((ldv)object2, 1);
                    }
                    this.cCy.b(may.ugG.bD(new Object[]{this.cCB.Xz(), this.cCB.Xt(), this.cCy.iV()}), (ldv)object2);
                } else if (lea.enW().isDescendant(n2, cug.fgH) || lea.enW().isDescendant(n2, cug.fnD) || lea.enW().isDescendant(n2, cug.fnO)) {
                    this.a((ldv)object, 1, n2);
                } else if (lea.enW().isDescendant(n2, cug.fnH) && !lea.enW().isDescendant(n2, cug.fnB) && !((String)(object2 = lea.enW().getName(n2))).toLowerCase().endsWith(" Base".toLowerCase())) {
                    this.cCy.i(may.ugN.bD(new Object[]{n2, this.cCB.Xz(), this.cCB.Xt()}));
                }
                ++n;
            }
        }
    }

    private void a(fuz fuz2) {
        if (fuz2.YN == null) {
            Integer n = this.cCC.remove(fuz2.aO());
            if (n == null) {
                return;
            }
            this.cCy.i(may.ugI.bD(new Object[]{n, this.cCB.Xz(), this.cCB.Xt()}));
        } else {
            ldv ldv2 = lcr.tQ((ldv)fuz2.YN);
            this.y(ldv2, fuz2.aqs);
        }
    }

    public void a(eil eil2) {
        bbr bbr2 = this.cCy.dR(eil2.diQ);
        if (bbr2 != null) {
            if (eil2.iro) {
                this.cCy.a(may.ugx.bD(new Object[]{bbr2.abP(), bbr2.akp(), this.cCB.Xz(), this.cCB.Xt(), this.cCB.aco(), this.cCB.acp()}), bbr2.abB());
            } else {
                this.cCy.a(may.ugA.bD(new Object[]{bbr2.abP(), bbr2.akp(), this.cCB.Xz(), this.cCB.Xt(), this.cCB.aco(), this.cCB.acp()}), bbr2.abB());
            }
        } else if (eil2.iro) {
            this.y(eil2.diQ, 3);
        } else {
            this.y(eil2.diQ, 4);
        }
    }

    private void a(eeg eeg2) {
        if (eeg2.bGb() > hc.aaz.ordinal()) {
            lfn.b(3, "SFClanCityAreaSensor", "handleCharacterNamedPropertiesResponseMessage() : Clan Notifications for Admin/GM Entered/Left Holding Will NOT Be Displayed in Non-Debug Builds!");
            return;
        }
        switch (eeg2.aVk()) {
            case 3: {
                if (eeg2.iV() == null) {
                    this.cCy.i(may.ugz.bD(new Object[]{cg.c(eeg2.iP(), eeg2.iR()), this.cCB.Xz(), this.cCB.Xt(), this.cCB.aco(), this.cCB.acp()}));
                    break;
                }
                this.cCy.i(may.ugy.bD(new Object[]{eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV(), this.cCB.Xz(), this.cCB.Xt(), this.cCB.aco(), this.cCB.acp()}));
                break;
            }
            case 4: {
                if (eeg2.iV() == null) {
                    this.cCy.i(may.ugC.bD(new Object[]{cg.c(eeg2.iP(), eeg2.iR()), this.cCB.Xz(), this.cCB.Xt(), this.cCB.aco(), this.cCB.acp()}));
                    break;
                }
                this.cCy.i(may.ugB.bD(new Object[]{eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV(), this.cCB.Xz(), this.cCB.Xt(), this.cCB.aco(), this.cCB.acp()}));
                break;
            }
            case 1: {
                if (this.c(eeg2)) break;
                if (eeg2.iV() == null) {
                    this.cCy.i(may.ugL.bD(new Object[]{cg.c(eeg2.iP(), eeg2.iR()), this.cCB.Xz(), this.cCB.Xt()}));
                } else {
                    this.cCy.i(may.ugJ.bD(new Object[]{eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV(), this.cCB.Xz(), this.cCB.Xt()}));
                }
                this.cCA.add(eeg2.aO());
                break;
            }
            case 2: {
                if (eeg2.iV() == null) {
                    this.cCy.i(may.ugM.bD(new Object[]{cg.c(eeg2.iP(), eeg2.iR()), this.cCB.Xz(), this.cCB.Xt()}));
                } else {
                    this.cCy.i(may.ugK.bD(new Object[]{eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV(), this.cCB.Xz(), this.cCB.Xt()}));
                }
                this.cCA.remove(eeg2.aO());
            }
        }
    }

    private boolean c(eeg eeg2) {
        float f;
        float[] fArray = eeg2.bGe();
        if (fArray != null && fArray.length > 0 && (f = fArray[0]) > 0.0f) {
            this.cCE.a(this.MessageDelegator.arc().rgz + (double)f, eeg2);
            return true;
        }
        return false;
    }

    @Override
    public void doTick(ldz ldz2) {
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = cCD;
        if (this.cCE.isEmpty()) {
            return;
        }
        List<eeg> list = this.cCE.eh(ldz2.rgz);
        if (list == null) {
            return;
        }
        for (eeg eeg2 : list) {
            eeg2.f((float[])null);
            this.receiveMessage(eeg2);
        }
    }
}

