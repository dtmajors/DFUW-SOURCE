/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqx
 *  jps
 *  lcr
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;

public class bex
extends bew {
    private final double deR = 30.0;
    private static final boolean deS = true;
    private boolean fE = true;
    private ber deT = null;
    private ber deU = null;
    private ber deV = null;
    private boolean deW = false;
    private double deX;
    private double deY = 30.0;
    private boolean deZ = false;
    private boolean dfa = true;
    private dw dfb;
    private dri dfc;
    private drb dfd;
    private drj dfe;
    private faa dff;
    private boolean ddV;
    private dqx dfg = null;
    private boolean dfh = false;

    public boolean anK() {
        return this.dfc == null ? false : this.dfc.bvw();
    }

    public boolean anL() {
        return this.dfe == null ? false : this.dfe.bvy();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        int n = this.H(ldz2);
        if (this.fE) {
            if (lcw.qHg && !lcw.enf()) {
                this.ank();
            }
            this.anN();
            this.fE = false;
            return;
        }
        if (!this.ddV) {
            if (this.anO() && this.dff != null) {
                this.a(this.dff);
                this.dff = null;
            }
            return;
        }
        if (!lcw.qHg) {
            return;
        }
        super.doTick(ldz2);
        if (this.dfa) {
            ber ber2 = this.deT;
            if (this.deU != null) {
                ber2 = this.deU;
            }
            if (!(ber2 != null && ber2.xz() < 0 || lcw.qGm)) {
                this.dfb.doTick(ldz2);
            }
        }
        if (this.deZ && this.deT != null) {
            this.deT.kt(n);
            this.deZ = false;
        }
        if (this.deT != null) {
            if (this.ddN) {
                this.deT.da(this.ddN);
                this.ddN = false;
            }
            if (this.deW) {
                this.deT.cZ(false);
            }
            if (this.dfa) {
                this.deT.kr(n);
            }
        }
        if (this.deW) {
            this.deU.cZ(false);
            this.I(ldz2);
        }
        if (this.deV != null && !this.deW && this.deV.xz() == dsv.dfw) {
            this.a(this.deV, (float)this.deY);
            this.deV = null;
        }
    }

    private void anM() {
    }

    private void anN() {
        drg drg2 = new drg();
        drg2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(drg2);
    }

    private void I(ldz ldz2) {
        Object object;
        bev bev2;
        bev bev3;
        int n;
        if (!this.deW) {
            return;
        }
        if (ldz2.rgz > this.deX + this.deY) {
            this.deW = false;
            ber ber2 = this.deT;
            this.deT = this.deU;
            this.deU = ber2;
            this.deT.cZ(true);
            this.deU.cZ(false);
            this.deT.ano();
            if (this.deU != null) {
                this.deM.remove(this.deU.getGUID());
                this.MessageDelegator.hd(this.deU.getGUID());
                this.deU = null;
            }
            return;
        }
        float f2 = (float)((ldz2.rgz - this.deX) / this.deY);
        f2 = lew.A(f2, 0.0f, 1.0f);
        Map<Object, Object> map = null;
        if (this.deT != null) {
            map = this.deT.anr();
            this.deT.cZ(true);
        } else {
            map = lcn.emG();
        }
        Map<Integer, bev> map2 = this.deU.anr();
        int n2 = this.H(ldz2);
        Iterator<Object> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            n = (Integer)iterator.next();
            bev3 = (bev)map.get(n);
            bev2 = map2.get(n);
            if (bev2 == null) {
                if (n2 > bev3.anB()) {
                    bev3.s(bev3.anC());
                    this.deT.a(bev3);
                    continue;
                }
                object = this.deT.a(bev3.anF(), bev3.anC(), f2);
                if (object == null) continue;
                bev3.s(object);
                this.deT.a(bev3);
                continue;
            }
            object = null;
            object = this.deT.a(bev3.anJ(), bev2.anJ(), f2);
            bev3.s(object);
            if (object == null) continue;
            this.deT.a(bev3);
        }
        iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            n = (Integer)iterator.next();
            bev3 = (bev)map.get(n);
            bev2 = map2.get(n);
            if (bev3 != null) continue;
            object = this.deT.a(bev2.anF(), bev2.anC(), f2);
            bev2.s(object);
            if (object == null) continue;
            this.deT.a(bev2);
        }
        this.deT.cZ(false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1802: {
                if (!this.ddV) {
                    this.dff = (faa)dxq2;
                    break;
                }
                this.a((faa)dxq2);
                break;
            }
            case 1803: {
                this.a((faf)dxq2);
                break;
            }
            case 1804: {
                this.a((fad)dxq2);
                break;
            }
            case 1805: {
                this.a((fap)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fap fap2) {
        if (fap2.iHg == null) {
            return;
        }
        ber ber2 = fap2.iHg;
        float f2 = fap2.iHh;
        this.a(ber2, f2);
    }

    private void a(ber ber2, float f2) {
        if (ber2 == null) {
            return;
        }
        if (this.deW) {
            this.deV = ber2;
            return;
        }
        if (this.deU != null) {
            this.deM.remove(this.deU.getGUID());
            this.MessageDelegator.hd(this.deU.getGUID());
            this.deU = null;
        }
        this.deU = ber2;
        this.deY = f2;
        this.deW = true;
        this.deX = this.MessageDelegator.arc().rgz;
        this.deU.setGUID(this.MessageDelegator.bzv());
        if (!this.deU.isInitialized()) {
            this.MessageDelegator.a(this.deU);
        }
        if (!this.dfa) {
            this.deT.kt(0);
            this.deU.kt(0);
        } else {
            this.deU.ks(this.H(this.MessageDelegator.arc()));
            if (!lcw.qFQ) {
                this.b(this.deU);
            }
        }
        this.deM.add(this.deU.getGUID());
    }

    private void a(fad fad2) {
        boolean bl = fad2.imB;
        if (this.dfa != fad2.iGl) {
            this.dfa = fad2.iGl;
            if (!this.dfa && this.dfb != null) {
                this.dfb.cU();
            }
        }
        if (bl == lcw.qHg) {
            return;
        }
        lcw.qHg = bl;
        if (this.deT == null) {
            return;
        }
        if (!bl) {
            this.deT.ann();
        } else {
            this.deZ = true;
        }
    }

    private void a(faf faf2) {
        if (faf2.iGx) {
            // empty if block
        }
    }

    private void a(faa faa2) {
        lfn.b(0, this.getClass().getSimpleName(), "handleClientUpdateMessage() : AreaID = " + faa2.xz());
        ber ber2 = new ber();
        ber2.kz(faa2.bNI());
        ber2.ky(faa2.xz());
        bfc[] bfcArray = faa2.bNF();
        for (int i = 0; i < bfcArray.length; ++i) {
            bfcArray[i].anU();
            ber2.a(bfcArray[i]);
        }
        double d2 = this.deY;
        jps jps2 = (jps)this.MessageDelegator.bzx().bzt().d(lcr.qBR);
        if (jps2 != null && jps2.getCameraPosition() != null && jps2.getCameraPosition().getY() < -1000.0f) {
            this.deY = 0.1;
        }
        this.dfh = true;
        this.a(ber2, (float)d2);
    }

    @Override
    public void addRelation(dul dul2) {
        if (dul2.Bq().equals(this.GUID) && !dul2.Br().equals(this.GUID)) {
            amf amf2 = this.MessageDelegator.d(dul2.Br());
            if (amf2 != null && amf2 instanceof dqv) {
                this.deM.add(amf2.getGUID());
            } else {
                lfn.b(4, this.getClass().getName(), "addRelation() : Object-Type not SFEnvironmentObjectInterface! Object= " + amf2);
            }
        } else {
            String string = "Cannot add Relation for Object [" + this.GUID + "]. StartPoint doesnt have matching GUID, or Endpoint has matching GUID. The Relation is: " + dul2 + ".";
            lfn.b(5, "SFLogicObject", "addRelation() : " + string);
            assert (false) : string;
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.dfg != null) {
            this.dfg.cleanUp();
        }
    }

    private boolean anO() {
        if (this.ddV) {
            return true;
        }
        dqv dqv2 = (dqv)this.MessageDelegator.d(lcr.qDQ);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDP);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDK);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDL);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDN);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDM);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDR);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDO);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDS);
        if (dqv2 == null) {
            return false;
        }
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDT);
        if (dqv2 == null) {
            return false;
        }
        this.ddV = true;
        return true;
    }

    private void ank() {
        drk drk2 = new drk();
        drk2.setGUID(lcr.qDR);
        this.MessageDelegator.a(drk2);
        assert (lcr.qDO != null);
        drf drf2 = new drf();
        drf2.setGUID(lcr.qDO);
        this.MessageDelegator.a(drf2);
        this.dfd = new drb();
        this.dfd.setGUID(lcr.qDQ);
        this.MessageDelegator.a(this.dfd);
        drc drc2 = new drc();
        drc2.setGUID(lcr.qDP);
        this.MessageDelegator.a(drc2);
        this.dfc = new dri();
        this.dfc.setGUID(lcr.qDS);
        this.MessageDelegator.a(this.dfc);
        this.dfe = new drj();
        this.dfe.setGUID(lcr.qDT);
        this.MessageDelegator.a(this.dfe);
        this.dfg = new dqx();
        this.dfg.setGUID(lcr.qDY);
        this.MessageDelegator.a((amf)this.dfg);
        this.dfb = new dw();
        this.dfb.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dfb);
        drl drl2 = new drl();
        drl2.setGUID(lcr.qDZ);
        this.MessageDelegator.a(drl2);
        this.anP();
    }

    private void anP() {
        ber ber2 = new ber();
        String string = "xml-files/object/environment/" + lcw.qPL;
        jwo jwo2 = new jwo();
        jwo2.a(string, ber2);
        ber2.cZ(true);
        ber2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(ber2);
        this.deM.add(ber2.getGUID());
        this.deT = ber2;
        this.b(ber2);
    }

    private void anQ() {
        ber ber2 = new ber();
        String string = "xml-files/object/environment/human_cloudy.xml";
        jwo jwo2 = new jwo();
        jwo2.a(string, ber2);
        ber2.cZ(true);
        ber2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(ber2);
        this.deM.add(ber2.getGUID());
        this.deU = ber2;
        bfd bfd2 = null;
        bfd2 = new bfd();
        bfd2.kC(57600);
        bfd2.kD(360);
        bfd2.b(bfb.dfV);
        bfd2.eS(1);
        bfd2.setValue(true);
        ber2.a(bfd2);
        bfd2 = new bfd();
        bfd2.kC(68400);
        bfd2.kD(360);
        bfd2.b(bfb.dfV);
        bfd2.eS(1);
        bfd2.setValue(false);
        ber2.a(bfd2);
    }

    private void b(ber ber2) {
        Object var2_2 = null;
    }

    public void a(abs abs2) {
        if (abs2 == null) {
            return;
        }
        if (this.dfc != null) {
            this.dfc.a(abs2);
        }
        if (this.dfe != null) {
            this.dfe.a(abs2);
        }
    }

    public void b(abs abs2) {
        if (abs2 == null) {
            return;
        }
        if (this.dfc != null) {
            this.dfc.b(abs2);
        }
        if (this.dfe != null) {
            this.dfe.b(abs2);
        }
    }
}

