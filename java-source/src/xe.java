/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Queue;

public class xe
extends xd
implements yx.a {
    public static final xe baL = new xe();
    public jlk baM = new jlk();
    public jlk baN = new jlk();
    private int SN = -1;
    private cew baO = null;
    private ldv baP = null;
    private List<ng> baQ = null;
    private boolean baR = false;
    private int baS = 0;
    private Queue<gdw> baT = null;
    private yx baU = null;

    @Override
    public int qe() {
        return this.SN;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.baU = new yx();
        this.baU.setGUID(this.MessageDelegator.bzv());
        this.baU.a(this);
        this.MessageDelegator.a(this.baU);
    }

    public void a(cew cew2) {
        if (this.baO == null) {
            this.baO = cew2;
            if (this.baR) {
                this.wx();
            }
        } else {
            this.baO = cew2;
            for (wy wy2 : this.baH.values()) {
                ((wz)wy2).wl();
            }
            for (wy wy2 : this.baI.values()) {
                ((xg)wy2).wE();
            }
        }
    }

    private void wx() {
        jcc.dwT().a(new jcd(xa.bai));
        jcc.dwT().a(new jcd(xa.baj));
        jcc.dwT().a(new jcd(xa.bak));
        jcc.dwT().a(new jcd(xa.bal));
        for (wy object : aza.values()) {
            switch (object.vR()) {
                case bai: 
                case baj: 
                case bak: 
                case bal: {
                    this.f(object);
                    break;
                }
            }
        }
        if (this.baQ != null && !this.baQ.isEmpty()) {
            block9: for (ng ng2 : this.baQ) {
                wy wy2 = (wy)aza.get(ng2.aDf);
                if (wy2 == null || ng2.aDh == null || ng2.aDh.isEmpty() || xc.cm(ng2.aDh) != 'Q') continue;
                char c2 = xc.co(ng2.aDh);
                switch (c2) {
                    case 'C': {
                        this.baF.put(ng2.aDf, ng2.aDh);
                        if (ng2.aDi != null && !ng2.aDi.isEmpty()) {
                            this.baG.put(ng2.aDf, ng2.aDi);
                        }
                        jcc.dwT().i(wy2);
                        continue block9;
                    }
                    case 'A': {
                        wy wy3 = wy2.a(this, ng2.aDh, ng2.aDi);
                        if (wy3 == null) {
                            assert (false) : "WTF!!!";
                            continue block9;
                        }
                        this.baH.put(ng2.aDf, wy3);
                        this.baJ.put(ng2.aDf, wy3);
                        ((wz)wy3).wk();
                        this.a((wz)wy3);
                        continue block9;
                    }
                    case 'P': {
                        wy wy3 = wy2.a((xc)this, ng2.aDh);
                        if (wy3 == null) {
                            assert (false) : "WTF!!!";
                            continue block9;
                        }
                        this.baI.put(ng2.aDf, wy3);
                        this.baJ.put(ng2.aDf, wy3);
                        continue block9;
                    }
                }
                assert (false) : "WTF!!!";
            }
        }
        this.ww();
        if (this.baT != null) {
            while (!this.baT.isEmpty()) {
                this.receiveMessage(this.baT.poll());
            }
            this.baT = null;
        }
        hso.cxK().cxP().cyJ().cIW();
        hso.cxK().cxP().cyJ().cJa();
        hso.cxK().cxP().cyJ().cJi();
    }

    private void f(wy wy2) {
        jch jch2 = new jch(wy2);
        jcd jcd2 = jcc.dwT().a(wy2.vR());
        assert (jcd2 != null);
        xb xb2 = wy2.vS();
        if (xb2 == null) {
            jcd2.b(jch2);
            return;
        }
        jci jci2 = jcd2.d(xb2);
        if (jci2 == null) {
            jci2 = new jci(xb2);
            jcd2.a(jci2);
        }
        jci2.b(jch2);
    }

    @Override
    protected void a(wz wz2) {
        jcc.dwT().b(wz2);
        wz2.wn();
        if (hso.cxK() != null && hso.cxK().cxP() != null && wz2.vW() != null && wz2.vW().exp()) {
            hso.cxK().cxP().v(mco.uwJ.bD(wz2.vW()));
        }
    }

    @Override
    protected void e(wy wy2) {
        jcc.dwT().i(wy2);
        if (hso.cxK() != null && hso.cxK().cxP() != null && wy2.vW() != null && wy2.vW().exp()) {
            hso.cxK().cxP().v(mco.tyd.bD(wy2.vW()));
        }
    }

    @Override
    public void a(wy wy2, aaz aaz2, boolean bl, boolean bl2) {
        if (aaz2 instanceof aay) {
            jcc.dwT().a(wy2.getID(), ((aay)aaz2).yc());
        }
        if (!bl && !bl2 && hso.cxK() != null && hso.cxK().cxP() != null && wy2.vW() != null && wy2.vW().exp()) {
            hso.cxK().cxP().v(mco.tyh.bD(wy2.vW()));
        }
        if (aaz2 instanceof aay) {
            ((aay)aaz2).yd();
        }
    }

    @Override
    public void a(wy wy2, aaz aaz2, boolean bl) {
        if (aaz2 instanceof aay) {
            if (bl) {
                ((aay)aaz2).ye();
            } else {
                ((aay)aaz2).yf();
            }
        }
    }

    @Override
    public void a(aci aci2) {
        jcc.dwT().b(aci2);
    }

    public boolean ee(int n) {
        if (this.cR(n)) {
            wz wz2 = (wz)this.baH.get(n);
            return wz2 == null ? this.dP(n) : wz2.wm();
        }
        return this.dP(n);
    }

    public void cp(String string) {
        if (this.baU == null) {
            return;
        }
        if (string == null) {
            return;
        }
        this.baU.cr(string);
    }

    public void wy() {
        if (this.baU == null) {
            return;
        }
        this.baU.xg();
    }

    @Override
    public void wz() {
        this.baN.dLF();
    }

    @Override
    public void wA() {
        this.baM.dLF();
    }

    @Override
    public cew nY() {
        return this.baO;
    }

    @Override
    public bex wh() {
        return (bex)this.MessageDelegator.bzx().bzt().d(lcr.qDG);
    }

    public void ef(int n) {
        wy wy2;
        if (lcw.SC.ordinal() < hc.aaP.ordinal()) {
            return;
        }
        wy wy3 = (wy)aza.get(n);
        if (wy3 == null) {
            return;
        }
        if (this.cR(n)) {
            wy2 = (wz)this.baH.remove(n);
            this.baJ.remove(n);
            ((wz)wy2).reset();
        } else if (this.dP(n)) {
            this.baF.remove(n);
            this.baG.remove(n);
        } else {
            return;
        }
        this.a(1, n, this.baP);
        jcc.dwT().j(wy3);
        wy2 = wy3.a(this);
        this.baI.put(n, wy2);
        this.baJ.put(n, wy2);
        ((xg)wy2).wD();
    }

    public void eg(int n) {
        if (lcw.SC.ordinal() < hc.aaP.ordinal()) {
            return;
        }
        wy wy2 = (wy)aza.get(n);
        if (wy2 == null) {
            return;
        }
        if (!this.cR(n)) {
            return;
        }
        ((wz)this.baH.get(n)).wo();
    }

    @Override
    public ldv wf() {
        return this.baP;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 34822: {
                this.a((gdr)dxq2);
                break;
            }
            case 34818: 
            case 34819: 
            case 34820: 
            case 34821: {
                if (this.baO == null) {
                    if (this.baT == null) {
                        this.baT = lcn.emA();
                    }
                    this.baT.add((gdw)dxq2);
                    break;
                }
                super.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gdr gdr2) {
        this.baP = gdr2.bTT();
        ++this.baS;
        if (gdr2.bTU() != null) {
            if (this.baQ == null) {
                this.baQ = lcn.emv();
            }
            for (int i = 0; i < gdr2.bTU().length; ++i) {
                ng ng2 = new ng();
                ng2.aDf = gdr2.bTU()[i];
                ng2.aDg = gdr2.bTV()[i];
                ng2.aDh = gdr2.bTW()[i];
                ng2.aDi = gdr2.bTX()[i].isEmpty() ? null : gdr2.bTX()[i];
                this.baQ.add(ng2);
            }
        }
        if (this.baS == gdr2.bIK()) {
            this.baR = true;
        }
        if (this.baO != null) {
            this.wx();
        }
    }
}

