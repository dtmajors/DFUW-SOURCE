/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  dta
 *  lcr
 *  lcw
 *  mrj
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ef
extends btk
implements bto {
    private static final int qc = 0;
    private static final int qd = 1;
    private static final int qe = 2;
    private static final int qf = 3;
    private static final int qg = 4;
    private static final int qh = 5;
    private static final int qi = 6;
    private static final int qj = 7;
    private static final int qk = 8;
    private Map<String, List<dsq>> ql = lcn.emw();
    private Map.Entry<String, List<dsq>> qm = null;
    private Iterator<Map.Entry<String, List<dsq>>> qn = null;
    private ldv qo = null;
    private int qp = 0;
    private int mb = 0;
    private int qq = 0;
    private List<String> qr = null;
    private double qs = 0.0;
    String qt = "";

    @Override
    public void initialize() {
        super.initialize();
        Map map = this.MessageDelegator.bzx().bzt().am();
        for (dta dta2 : map.values()) {
            for (amf amf2 : dta2.bzr()) {
                if (amf2.getObjectType() != 150) continue;
                dsq dsq2 = (dsq)((Object)amf2);
                String string = lcw.dZ((ljq)dsq2.av()).toLowerCase();
                List<dsq> list = this.ql.get(string);
                if (list == null) {
                    list = lcn.emv();
                    this.ql.put(string, list);
                }
                list.add(dsq2);
            }
        }
        this.qn = this.ql.entrySet().iterator();
        this.mb = 1;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.mb == 1) {
            this.dM();
            this.mb = 2;
        } else if (this.mb == 2) {
            if (this.dN()) {
                this.mb = 3;
            }
        } else if (this.mb == 3) {
            this.dP();
            this.a(this.qm.getValue().get(this.qp));
            this.mb = 4;
        } else if (this.mb != 4) {
            if (this.mb == 5) {
                this.dR();
                this.mb = 6;
            } else if (this.mb == 6) {
                if (this.dS()) {
                    ++this.qp;
                    if (this.qp == this.qm.getValue().size()) {
                        this.qp = 0;
                        this.mb = 7;
                    } else {
                        this.mb = 3;
                    }
                }
            } else if (this.mb == 7) {
                this.dO();
                this.mb = 8;
                this.qs = ldz2.rgz;
            } else if (this.mb == 8 && ldz2.rgz - this.qs > 1.0) {
                this.mb = 1;
            }
        }
    }

    private void dM() {
        Map map = this.MessageDelegator.bzx().bzt().am();
        this.qq = map.size();
        if (!this.qn.hasNext()) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        this.qm = this.qn.next();
        lej lej2 = lcw.zf((String)this.qm.getKey());
        this.qr = lcn.emv();
        for (int i2 = -1; i2 < 2; ++i2) {
            for (int i3 = -1; i3 < 2; ++i3) {
                int n2 = lej2.getX() + i3;
                int n3 = lej2.getY() + i2;
                if (n2 < 0 || n3 < 0 || n2 > 31 || n3 > 31) continue;
                String string = lcw.f((lej)new lej(n2, n3));
                File file = new File(lcw.qLb + "xml-files/objectspace/built_tiles/" + string + "/" + string + ".xml");
                if (!file.exists()) continue;
                this.qr.add(string.toLowerCase());
            }
        }
        for (String string : this.qr) {
            String string2 = lcw.qLb + "xml-files/objectspace/built_tiles/" + string + "/" + string + ".xml";
            hac hac2 = (hac)this.MessageDelegator.h(4097, this.GUID, lcr.qAE);
            hac2.Lb(1);
            hac2.setFileName(string2);
            this.MessageDelegator.I(hac2);
        }
    }

    private boolean dN() {
        Map map = this.MessageDelegator.bzx().bzt().am();
        if (map.size() != this.qq + this.qr.size()) {
            return false;
        }
        for (dta dta2 : map.values()) {
            for (amf amf2 : dta2.bzr()) {
                dqk dqk2;
                if (!(amf2 instanceof dqk) || (dqk2 = (dqk)amf2).aLt()) continue;
                return false;
            }
        }
        return true;
    }

    private void dO() {
        Map map = this.MessageDelegator.bzx().bzt().am();
        ArrayList<ldv> arrayList = lcn.emv();
        block0: for (dta object : map.values()) {
            for (String string : this.qr) {
                if (!object.getObjectDescriptionFilename().toLowerCase().contains(string.toLowerCase())) continue;
                arrayList.add(object.getGUID());
                continue block0;
            }
        }
        for (ldv ldv2 : arrayList) {
            this.MessageDelegator.bzx().bzt().oe(ldv2);
        }
    }

    private void dP() {
        krb krb2 = (krb)this.MessageDelegator.h(4097);
        krb2.ec = this.GUID;
        krb2.iBr = false;
        krb2.hsP = false;
        Map map = this.MessageDelegator.bzx().bzt().am();
        List list = mrj.al((Map)map);
        for (amf amf2 : list) {
            dqk dqk2;
            if (!(amf2 instanceof dqk) || !(dqk2 = (dqk)amf2).getObjectDescriptionFilename().toLowerCase().contains(this.qm.getKey().toLowerCase())) continue;
            this.qo = dqk2.getGUID();
        }
        krb2.pXa = new ldv[list.size()];
        for (int i2 = 0; i2 < krb2.pXa.length; ++i2) {
            krb2.pXa[i2] = ((amf)list.get(i2)).getGUID();
        }
        krb2.Radius = 1.0f;
        krb2.bWP = 1.0f;
        krb2.pXb = 0;
        krb2.gPt = 0.0f;
        krb2.pXc = true;
        krb2.pXd = 0;
        krb2.pXe = false;
        krb2.pXf = false;
        krb2.pXg = false;
        krb2.pXh = 0;
        krb2.pXi = krb.c.pXA.ordinal();
        krb2.pXk = 0;
        krb2.pXj = 2000;
        krb2.pXl = true;
        krb2.pXm = true;
        krb2.pXn = 0;
        this.MessageDelegator.a(krb2);
    }

    private void a(dsq dsq2) {
        this.qm.getKey();
        this.qt = "terrain_" + this.qm.getKey() + "_waterplain_auto" + dsq2.getGUID().enx();
        kqq kqq2 = (kqq)this.MessageDelegator.h(4114);
        kqq2.ts(this.GUID);
        kqq2.wD(true);
        kqq2.jM(false);
        kqq2.tI(this.qo);
        kqq2.setMeshName(this.qt);
        kqq2.dy(new ljq(dsq2.av().x, dsq2.byu() - 0.162f, dsq2.av().rlV));
        kqq2.BP(dsq2.byv());
        kqq2.BQ(dsq2.byw());
        kqq2.BR(dsq2.byx());
        kqq2.aas(dsq2.byy());
        this.MessageDelegator.a(kqq2);
    }

    private void dQ() {
        kru kru2 = (kru)this.MessageDelegator.j(22);
        kru2.ts(this.GUID);
        kru2.pYX = kru2.pYW = lcw.qLb + "xml/terrain/" + this.qt + ".xml";
        kru2.pYV = 2;
        kru2.pZa = false;
        kru2.pYY = true;
        if (nab.EXr == null) {
            nab.eTR();
        }
        kru2.pYZ = nab.EXr;
        kru2.daN = 1.0f;
        this.MessageDelegator.a(kru2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 6656) {
            this.dQ();
        } else {
            super.receiveResponse(ktv2);
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 9) {
            this.mb = 5;
        } else {
            super.receiveResourceResponse(ktf2);
        }
    }

    private void dR() {
        Object object;
        Object object2;
        Object object32;
        ldv ldv2 = this.qo.bFk();
        dta dta2 = this.MessageDelegator.bzx().bzt().od(ldv2);
        boolean bl = false;
        for (Object object32 : dta2.bzr()) {
            if (!((amf)object32).getObjectDescriptionFilename().toLowerCase().contains(this.qt.toLowerCase())) continue;
            bl = true;
            break;
        }
        if (!bl) {
            object2 = dta2.d(this.qo);
            object32 = new ljq();
            if (object2 != null && object2 instanceof dqk) {
                object = (dqk)object2;
                object32 = object.av();
            }
            object = (hac)this.MessageDelegator.h(4097, this.GUID, lcr.qAE);
            ((hac)object).Lb(1);
            ((hac)object).setFileName(lcw.qLb + "xml/terrain/" + this.qt + ".xml");
            ((hac)object).hC(dta2.bzv());
            ((hac)object).c((ljq)object32);
            ((hac)object).setRotation(new ljq());
            ((hac)object).li(false);
            ((hac)object).mz(true);
            this.MessageDelegator.I((dxq)object);
        }
        object2 = this.qt;
        object32 = "c:/waterdump/";
        jry.g(new jrw((String)object32 + "mesh/"));
        jry.g(new jrw((String)object32 + "collision/"));
        jry.g(new jrw((String)object32 + "collision/partial/"));
        jry.g(new jrw((String)object32 + "xml/terrain/"));
        object = "xml/terrain/" + (String)object2 + ".xml";
        jry.a(new jrw((String)object32 + (String)object), new jrw(lcw.qLb + (String)object));
        String string = "mesh/" + (String)object2 + ".sfm";
        jry.a(new jrw((String)object32 + string), new jrw(lcw.qLb + string));
        String string2 = "collision/" + (String)object2 + ".static.sfaabbtreecollisionscheme.sfc";
        jry.a(new jrw((String)object32 + string2), new jrw(lcw.qLb + string2));
        String string3 = "collision/partial/" + (String)object2 + ".static.sfaabbtreecollisionscheme.sfc";
        jry.a(new jrw((String)object32 + string3), new jrw(lcw.qLb + string3));
    }

    private boolean dS() {
        ldv ldv2 = this.qo.bFk();
        dta dta2 = this.MessageDelegator.bzx().bzt().od(ldv2);
        for (amf amf2 : dta2.bzr()) {
            dqk dqk2;
            if (!(amf2 instanceof dqk) || !(dqk2 = (dqk)amf2).getObjectDescriptionFilename().toLowerCase().contains(this.qt.toLowerCase()) || !dqk2.aLt()) continue;
            jys jys2 = new jys();
            jys2.g(dta2);
            return true;
        }
        return false;
    }
}

