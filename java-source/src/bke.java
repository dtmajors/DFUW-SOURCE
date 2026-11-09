/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  bqk
 *  cbx
 *  cdb
 *  cug
 *  dta
 *  ha
 *  lcr
 *  lcw
 */
public class bke
extends btk {
    protected bkd.a dsy = null;
    protected bkb dsz = null;
    protected static les dqt = lea.enU();
    protected static les aqN = lea.enZ();
    protected static les ResourceTree = lea.enW();

    public void a(bkb bkb2) {
        this.dsz = bkb2;
    }

    public void a(int n, fdo fdo2) {
    }

    public final String ard() {
        return this.dsy.name();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9218: {
                this.a((fdp)dxq2);
                break;
            }
            case 9220: {
                this.a((fdg)dxq2);
                break;
            }
            case 11034: {
                this.g((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(fdg fdg2) {
    }

    protected void a(fdp fdp2) {
    }

    protected void b(int n, int n2, ldv ldv2, ldv ldv3) {
        lfn.b(5, "SFFunctionObject", "handleSendingErrorMessage() ErrorType='" + gre.Ky(n) + "'");
        lfn.b(5, "SFFunctionObject", "handleSendingErrorMessage() MsgType=" + n2 + " FailedFromGUID=" + ldv2 + " FailedToGUID=" + ldv3);
    }

    private void g(gre gre2) {
        if (gre2.iHL <= 0) {
            return;
        }
        if (gre2.jqc <= 0) {
            return;
        }
        if (gre2.jqe == null) {
            return;
        }
        if (gre2.jqf == null) {
            return;
        }
        this.b(gre2.iHL, gre2.jqc, gre2.jqe, gre2.jqf);
    }

    protected final String a(bkd.a a2, int n) {
        return "xml-files/server/functionobject/" + a2.name() + "_" + dqt.getName(n) + ".xml";
    }

    protected final bqs G(ldv ldv2, int n) {
        lgw lgw2 = (lgw)lea.enW().acv(n);
        assert (lgw2 != null);
        int n2 = cug.uF((int)n);
        float f = cug.mr((int)n);
        et et2 = new et();
        et2.setType(1104);
        et2.o((float)n2 * f);
        bqs bqs2 = new bqs();
        bqs2.setGUID(ldv2);
        bqs2.l(n);
        bqs2.do(n2);
        bqs2.b(lgw2.auO());
        bqs2.g(et2);
        bqs2.avb();
        return bqs2;
    }

    protected final bqs a(cbx cbx2, long l) {
        lgw lgw2 = (lgw)lea.enW().acv(cbx2.az());
        assert (lgw2 != null);
        et et2 = cbx2.fi().ah(1104);
        if (et2 == null) {
            lfn.b(5, "SFFunctionObject", "createInventoryItem() Resource '" + lgw2.getName() + "' has no defined 'Weight' attribute.");
            return null;
        }
        bqs bqs2 = new bqs();
        bqs2.setGUID(cbx2.getGUID());
        bqs2.l(cbx2.az());
        bqs2.do(cbx2.vf());
        bqs2.b(lgw2.auO());
        bqs2.g(et2.fn());
        if (l == 0L) {
            bqs2.avb();
        } else {
            bqs2.P(l);
        }
        return bqs2;
    }

    protected final et a(int n, ej[] ejArray) {
        ej ej2 = null;
        for (int i = 0; i < ejArray.length; ++i) {
            ej2 = ejArray[i];
            if (ej2 == null || ej2.getType() != n) continue;
            if (ej2.getDataType() != 2) {
                return null;
            }
            return (et)ej2;
        }
        return null;
    }

    protected final ldv hG(ldv ldv2) {
        amf amf2 = this.MessageDelegator.d(ldv2);
        if (amf2 instanceof bqk) {
            return ldv2;
        }
        if (amf2 instanceof ayd) {
            ayd ayd2 = (ayd)amf2;
            return ayd2.aaA();
        }
        if (amf2 instanceof cdb) {
            cdb cdb2 = (cdb)amf2;
            return cdb2.aJC().asf().getGUID();
        }
        if (amf2 instanceof cni) {
            cni cni2 = (cni)((Object)amf2);
            return cni2.aJC().asf().getGUID();
        }
        lfn.b(5, "SFFunctionObject", "getInventoryGUID() Invalid objectype found: " + amf2.getClass().getName());
        return null;
    }

    protected final amf d(ldv ldv2) {
        return ((dta)this.MessageDelegator).d(ldv2);
    }

    protected final int hH(ldv ldv2) {
        amf amf2 = this.MessageDelegator.d(ldv2);
        if (amf2 instanceof bqk) {
            return ((bqk)amf2).auk().az();
        }
        if (amf2 instanceof cdb) {
            cdb cdb2 = (cdb)amf2;
            return cdb2.az();
        }
        if (amf2 instanceof cni) {
            cni cni2 = (cni)((Object)amf2);
            return cni2.az();
        }
        if (amf2 instanceof ayd) {
            ayd ayd2 = (ayd)amf2;
            return ayd2.aaB();
        }
        return -1;
    }

    protected final ha hI(ldv ldv2) {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 instanceof cdb) {
            cdb cdb2 = (cdb)amf2;
            return cdb2.mA();
        }
        if (amf2 instanceof ha) {
            return (ha)amf2;
        }
        if (amf2 != null) {
            // empty if block
        }
        return null;
    }

    protected final String q(int[] nArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("'");
            stringBuilder.append(ResourceTree.getName(nArray[i]));
            stringBuilder.append("'");
            if (i >= nArray.length - 1) continue;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    protected final boolean b(int n, int[] nArray) {
        assert (n >= 0);
        assert (nArray != null);
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            if (!ResourceTree.isDescendant(n, nArray[i])) continue;
            return true;
        }
        return false;
    }

    protected final boolean cS(float f) {
        float f2 = lgp.erA().nextFloat();
        return f2 <= f;
    }

    protected final void Vc() {
        this.dsz.a(this);
    }

    protected final float cT(float f) {
        int n = (int)(f * 2.0f);
        return (float)n / 2.0f;
    }

    protected final boolean a(ldv ldv2, int n, int[] nArray) {
        assert (ldv2 != null);
        assert (nArray != null);
        if (n <= 0) {
            return true;
        }
        if (ldv2.equals(lcr.qAC)) {
            return true;
        }
        if (!this.b(n, nArray)) {
            return true;
        }
        if (lcw.enb()) {
            if (ldv2.ib() == 7000) {
                return true;
            }
            if (ldv2.ib() == 1024) {
                return true;
            }
        }
        return false;
    }

    protected final void e(ldv ldv2, loz loz2) {
        if (ldv2 == null) {
            assert (false);
            return;
        }
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv3);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    protected final void a(fdo fdo2, boolean bl2) {
        assert (fdo2 != null);
        fcs fcs2 = (fcs)this.MessageDelegator.h(9219, this.GUID, fdo2.aO());
        fcs2.aqs = fdo2.aqs;
        fcs2.bst = fdo2.bst;
        fcs2.iJq = bl2;
        fcs2.akX = fdo2.akX;
        this.MessageDelegator.F(fcs2);
    }

    protected final void a(fdo fdo2, boolean bl2, ldv ldv2) {
        assert (fdo2 != null);
        fcs fcs2 = (fcs)this.MessageDelegator.h(9219, this.GUID, fdo2.aO());
        fcs2.aqs = fdo2.aqs;
        fcs2.bst = fdo2.bst;
        fcs2.iJq = bl2;
        fcs2.akX = ldv2;
        this.MessageDelegator.F(fcs2);
    }

    protected final void a(ldv ldv2, fdo fdo2, boolean bl2, ldv ldv3) {
        assert (ldv2 != null);
        assert (fdo2 != null);
        fcs fcs2 = (fcs)this.MessageDelegator.h(9219, this.GUID, ldv2);
        fcs2.aqs = fdo2.aqs;
        fcs2.bst = fdo2.bst;
        fcs2.iJq = bl2;
        fcs2.akX = ldv3;
        this.MessageDelegator.F(fcs2);
    }

    protected final void a(ldv ldv2, alq alq2) {
        this.a(ldv2, true, new alt[]{alq2});
    }

    protected final void a(ldv ldv2, boolean bl2, alt[] altArray) {
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, ldv2);
        frg2.iUQ = bl2;
        frg2.iUR = altArray;
        this.MessageDelegator.F(frg2);
    }

    protected final void a(ldv ldv2, int[] nArray) {
        this.b(ldv2, -1, nArray);
    }

    protected final void a(ldv ldv2, als als2, ljq ljq2) {
        assert (ldv2 != null);
        assert (als2 != null);
        ftx ftx2 = (ftx)this.MessageDelegator.h(1041, this.GUID, ldv2);
        ftx2.iWx = als2;
        ftx2.aZH = ljq2;
        this.MessageDelegator.F(ftx2);
    }

    protected final void b(ldv ldv2, int n, int[] nArray) {
        fuo fuo2 = (fuo)this.MessageDelegator.h(5633, this.GUID, ldv2);
        fuo2.sk(n);
        fuo2.iXi = 2;
        fuo2.duz = nArray;
        this.MessageDelegator.F(fuo2);
    }

    protected final void m(int n, ldv ldv2) {
        assert (n > 0);
        assert (ldv2 != null);
        this.a(-1, n, ldv2, 0);
    }

    protected final void d(int n, int n2, ldv ldv2) {
        assert (n > 0);
        assert (n2 > 0);
        assert (ldv2 != null);
        this.a(n, n2, ldv2, 0);
    }

    protected final void a(int n, int n2, ldv ldv2, int n3) {
        assert (n2 > 0);
        assert (ldv2 != null);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.aqs = n;
        gfm2.ResourceType = n2;
        gfm2.iSi = 1;
        gfm2.Yc = ldv2;
        gfm2.asi = n3;
        this.MessageDelegator.F(gfm2);
    }

    protected final void hF(ldv ldv2) {
        assert (ldv2 != null);
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        gsy gsy2 = (gsy)this.MessageDelegator.h(11050, this.GUID, ldv3);
        this.MessageDelegator.F(gsy2);
    }

    protected final void a(dnl dnl2) {
        assert (dnl2 != null);
        gxx gxx2 = (gxx)this.MessageDelegator.h(11265, this.GUID, lcr.qEj);
        gxx2.gMn = dnl2;
        this.MessageDelegator.E(gxx2);
    }
}

