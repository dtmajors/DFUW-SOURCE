/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bpq
 *  bpr
 *  bqk
 *  cbx
 *  jsr
 *  jxb
 *  lcw
 */
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jww {
    private ldv Rr;
    private jsr nUU;
    private jsa dl;
    private lju fzk = new lju(0, 3);
    private jxb oXe = null;
    private ldw gZO;
    private boolean oYB = true;
    private jyg fxA = null;

    public jww(ldv ldv2) {
        this.tm(ldv2);
    }

    public jww(ldv ldv2, jsa jsa2) {
        this.tm(ldv2);
        this.dl = jsa2;
        this.nUU = this.dl.dRY();
        this.oXe.a(this.nUU.dSa());
    }

    private void tm(ldv ldv2) {
        this.fxA = lcw.qHe ? new jyg(false) : new jyg(true);
        this.Rr = ldv2;
        this.dUv();
    }

    private void dUv() {
        if (lcw.qHe) {
            this.oYB = false;
        }
        this.oXe = new jxb(this.Rr);
        this.gZO = ldx.enG().fS(this.Rr.ib(), this.Rr.enw());
    }

    public bpv uV(String string) {
        string = "xml-files/server/vendor/vendors/" + string;
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        bpv bpv2 = this.i(document);
        if (bpv2 == null) {
            return null;
        }
        bpv2.fX(jry.tn(string));
        return bpv2;
    }

    private bpv i(Document document) {
        bpv bpv2 = null;
        Node node = jsy.a("SFInteractionTemplate", (Node)document);
        if (node == null) {
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            return null;
        }
        Node node2 = jsy.a("SFInteraction", node);
        if (node2 == null) {
            return null;
        }
        bpv2 = this.oXe.c(node2, true);
        if (bpv2 == null) assert (false) : "Nodeparser returned a NULL Interaction";
        return bpv2;
    }

    public cpw a(bpv bpv2) {
        Object object;
        String[] stringArray;
        Object object2;
        int n;
        cbx cbx2;
        block45: {
            ff ff2;
            ff ff3;
            assert (this.nUU != null) : "FileManager is null. Wrong constructor used!";
            int n2 = lea.enW().getType(bpv2.atN());
            if (n2 <= 0) {
                lfn.b(5, "SFInteractionParser", "setupInteractionLogicComponents() InteractionResourceDescriptionFile is invalid: '" + bpv2.atN() + "'");
                assert (false);
                return null;
            }
            cbx2 = this.oXe.l(n2, bpv2.getGUID(), null);
            if (cbx2 == null) {
                lfn.b(5, "SFInteractionParser", "setupInteractionLogicComponents() Resource '" + bpv2.atN() + "' could not be created for Interaction [" + bpv2.getObjectDescriptionFilename() + "]");
                assert (false);
                return null;
            }
            if (cbx2 instanceof cpw) {
                ((cpw)cbx2).fx(bpv2.atS());
            } else {
                lfn.b(5, "SFInteractionParser", "setupInteractionLogicComponents() Resource is not instanceof SFVendorObjectServer.");
                assert (false);
            }
            this.b(1033, cbx2.getGUID(), bpv2.getGUID());
            cbv cbv2 = cbx2.aIh();
            if (cbv2 == null || cbv2.aza() == null) {
                return null;
            }
            if (this.oYB) {
                this.nUU.t((amf)cbx2);
            }
            bpv2.fZ(cbv2.getFileName());
            bpv2.hZ(cbx2.getGUID());
            ff ff4 = (ff)cbx2.fi().ae(1328);
            if (ff4 == null) {
                ff4 = new ff();
                ff4.setType(1328);
                cbx2.fi().b(ff4);
            }
            if ((ff3 = (ff)cbx2.fi().ae(1392)) == null) {
                ff3 = new ff();
                ff3.setType(1392);
                cbx2.fi().b(ff3);
            }
            if ((ff2 = (ff)cbx2.fi().ae(12720)) == null) {
                ff2 = new ff();
                ff2.setType(12720);
                cbx2.fi().b(ff2);
            }
            ff4.av(bpv2.arX());
            ff3.av(bpv2.atK());
            ff2.av(bpv2.atK().toLowerCase().replace(".xml", ""));
            if (cbx2.aAG() == null) {
                assert (cbv2.getGUID() != null);
                bvd bvd2 = this.b(bpv2);
                bvd2.setGUID(cbv2.getGUID());
                if (this.oYB) {
                    this.nUU.t((amf)bvd2);
                }
                this.b(1027, cbx2.getGUID(), bvd2.getGUID());
            } else {
                cbx2.aAG().c(bpv2.atO());
                cbx2.aAG().a(bpv2.atP());
            }
            n = bpv2.asc();
            object2 = new jzw();
            stringArray = null;
            object = bpv2.atL();
            assert (object != null);
            int n3 = ((String[])object).length;
            for (int i2 = 0; i2 < n3; ++i2) {
                object[i2] = "xml-files/server/resourcecontainers/shop inventory/" + object[i2];
            }
            String[] stringArray2 = bpv2.atJ();
            int n4 = stringArray2.length;
            for (n3 = 0; n3 < n4; ++n3) {
                stringArray2[n3] = "xml-files/server/vendor/trainingtemplates/" + stringArray2[n3];
            }
            try {
                stringArray = ((jzw)object2).a((String[])object, true);
                ((jzw)object2).a((brl)stringArray, stringArray2);
                stringArray.setObjectType(63);
                stringArray.a(bqm.b.dEK);
                stringArray.setGUID(this.nUU.lL(this.Rr));
                if (this.oYB) {
                    this.nUU.t((amf)stringArray);
                }
            }
            catch (bg bg2) {
                if ($assertionsDisabled) break block45;
                throw new AssertionError();
            }
        }
        if (stringArray == null) {
            String string = "ServerInventory is null!";
            assert (false) : string;
            return null;
        }
        this.c((bqk)stringArray);
        this.b(1030, bpv2.getGUID(), stringArray.getGUID());
        if ((n & 1) > 0) {
            object2 = new bpo();
            ((amf)object2).setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), ((amf)object2).getGUID());
        }
        if ((n & 4) > 0) {
            object2 = new bpr();
            object2.setGUID(this.nUU.lL(this.Rr));
            stringArray = bpv2.atM();
            object = new jus();
            for (int i3 = 0; i3 < stringArray.length; ++i3) {
                String string = stringArray[i3];
                try {
                    dtz dtz2 = ((jus)object).uj(string);
                    dty dty2 = (dty)dtz2;
                    dty dty3 = lea.eoU().Cf(dty2.ID);
                    if (dty3 != null) {
                        object2.a(dty2);
                        continue;
                    }
                    lfn.b(5, "SFInteractionParser", "setupInteractionLogicComponents() Quest :" + dty2.Name + " has been removed from Quest Definition Manager.");
                    lfn.b(5, "SFInteractionParser", "setupInteractionLogicComponents() Removing from Vendor :" + cbx2.aIy());
                    continue;
                }
                catch (bg bg3) {
                    // empty catch block
                }
            }
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), object2.getGUID());
        }
        if ((n & 2) > 0) {
            object2 = new bps();
            ((amf)object2).setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), ((amf)object2).getGUID());
        }
        if ((n & 8) > 0) {
            object2 = new bpu();
            ((amf)object2).setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), ((amf)object2).getGUID());
        }
        if ((n & 0x80) == 0) {
            object2 = new bpp();
            ((amf)object2).setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), ((amf)object2).getGUID());
        }
        if ((n & 0x20) > 0) {
            object2 = new bpt();
            ((amf)object2).setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), ((amf)object2).getGUID());
        }
        if ((n & 0x40) > 0) {
            object2 = new bpn();
            ((amf)object2).setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), ((amf)object2).getGUID());
        }
        if ((n & 0x80) > 0) {
            object2 = new bpq();
            object2.setGUID(this.nUU.lL(this.Rr));
            if (this.oYB) {
                this.nUU.t((amf)object2);
            }
            this.b(1029, bpv2.getGUID(), object2.getGUID());
        }
        return (cpw)cbx2;
    }

    public bvd b(bpv bpv2) {
        bvc bvc2 = this.fxA.d(bpv2.atQ(), bve.a.dQI);
        if (lcw.qHe) {
            assert (bvc2 instanceof dsp);
            ((dsp)((Object)bvc2)).fX(bpv2.atK());
        }
        bvc2.c(bpv2.atO());
        bvc2.a(bpv2.atP());
        return bvc2;
    }

    private void c(bqk bqk2) {
        Iterator<brs> iterator = bqk2.aun().AN().values().iterator();
        brs brs2 = null;
        while (iterator.hasNext()) {
            brs2 = iterator.next();
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            if (brs2.awo().getGUID().enw() != 0) continue;
            brs2.awo().setGUID(this.gZO.bzv());
        }
    }

    private void b(int n, ldv ldv2, ldv ldv3) {
        if (this.oYB) {
            geg geg2 = (geg)this.dl.d(769);
            geg2.on(this.Rr);
            geg2.f(this.Rr);
            geg2.gqN = n;
            geg2.blo = ldv2;
            geg2.blp = ldv3;
            this.dl.a(geg2);
        }
    }
}

