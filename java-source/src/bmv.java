/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bmv
extends bmu {
    private final Map<ldv, amf> dvD = lcn.emw();
    private final Map<Integer, fdz> dvE = lcn.emw();
    private List<pc> dvF = null;
    private int bRk;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 27905: {
                this.a((fdz)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 27907: {
                this.a((fef)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fdz fdz2) {
        int n = fdz2.getType();
        int n2 = fdz2.axg();
        int n3 = fdz2.bOB();
        bsx bsx2 = null;
        try {
            bsx2 = fy.TN.get(n).get(n2).get(n3);
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
        if (bsx2 == null) {
            return;
        }
        switch (fy.a.getValue(n)) {
            case TO: {
                this.dvE.put(new Integer(this.bRk), fdz2);
                gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
                gfm2.ResourceType = cug.fsp;
                gfm2.iSi = 1;
                gfm2.Yc = this.GUID;
                gfm2.sk(this.bRk++);
                this.MessageDelegator.F(gfm2);
                break;
            }
            case TS: {
                this.dvE.put(new Integer(this.bRk), fdz2);
                gfm gfm3 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
                gfm3.ResourceType = cug.fsq;
                gfm3.iSi = 1;
                gfm3.Yc = this.GUID;
                gfm3.sk(this.bRk++);
                this.MessageDelegator.F(gfm3);
                break;
            }
            case TP: {
                this.dvE.put(new Integer(this.bRk), fdz2);
                gfm gfm4 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
                gfm4.ResourceType = cug.fsn;
                gfm4.iSi = 1;
                gfm4.Yc = this.GUID;
                gfm4.sk(this.bRk++);
                this.MessageDelegator.F(gfm4);
                break;
            }
            case TU: {
                this.dvE.put(new Integer(this.bRk), fdz2);
                gfm gfm5 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
                gfm5.ResourceType = cug.fso;
                gfm5.iSi = 1;
                gfm5.Yc = this.GUID;
                gfm5.sk(this.bRk++);
                this.MessageDelegator.F(gfm5);
                break;
            }
            case TQ: {
                this.dvE.put(new Integer(this.bRk), fdz2);
                gfm gfm6 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
                gfm6.ResourceType = cug.fsE;
                gfm6.iSi = 1;
                gfm6.Yc = this.GUID;
                gfm6.sk(this.bRk++);
                this.MessageDelegator.F(gfm6);
                break;
            }
            case TV: {
                Object object = bsx2.getValue("ResourceName");
                if (object == null) {
                    assert (false) : "No resource name entry";
                    return;
                }
                String string = bsx2.getValue("ResourceName").toString();
                this.dvE.put(new Integer(this.bRk), fdz2);
                gfm gfm7 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
                gfm7.ResourceType = lea.enW().getType(string);
                gfm7.iSi = 1;
                gfm7.Yc = this.GUID;
                gfm7.sk(this.bRk++);
                this.MessageDelegator.F(gfm7);
                break;
            }
        }
    }

    private void a(fef fef2) {
        throw new UnsupportedOperationException("Not yet supported!");
    }

    private void a(gfn gfn2) {
        fdz fdz2 = this.dvE.remove(gfn2.aVk());
        assert (fdz2 != null);
        bsx bsx2 = null;
        try {
            bsx2 = fy.TN.get(fdz2.getType()).get(fdz2.axg()).get(fdz2.bOB());
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
        if (bsx2 == null) {
            return;
        }
        switch (fy.a.getValue(fdz2.getType())) {
            case TO: {
                cok cok2 = (cok)gfn2.dtF;
                cok2.aIh().setFileName((String)bsx2.getValue("MeshName"));
                bvd bvd2 = cok2.aIl();
                bvd2.c((ljq)bsx2.getValue("Position"));
                bvd2.a(new lgl((ljq)bsx2.getValue("Rotation")));
                cok2.d(bvd2);
                this.MessageDelegator.a((amf)((Object)cok2));
                this.dvD.put(cok2.getGUID(), (amf)((Object)cok2));
                cok2.b(bsx2);
                gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
                gga2.jgt = true;
                gga2.ResourceType = cok2.az();
                this.MessageDelegator.F(gga2);
                break;
            }
            case TS: {
                cku cku2 = (cku)gfn2.dtF;
                cku2.aIh().setFileName((String)bsx2.getValue("MeshName"));
                bvd bvd3 = cku2.aIl();
                bvd3.c((ljq)bsx2.getValue("Position"));
                bvd3.a(new lgl((ljq)bsx2.getValue("Rotation")));
                cku2.d(bvd3);
                this.MessageDelegator.a((amf)((Object)cku2));
                this.dvD.put(cku2.getGUID(), (amf)((Object)cku2));
                cku2.b(bsx2);
                gga gga3 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
                gga3.jgt = true;
                gga3.ResourceType = cku2.az();
                this.MessageDelegator.F(gga3);
                break;
            }
            case TP: {
                cmo cmo2 = (cmo)gfn2.dtF;
                cmo2.aIh().setFileName((String)bsx2.getValue("MeshName"));
                bvd bvd4 = cmo2.aIl();
                bvd4.c((ljq)bsx2.getValue("Position"));
                bvd4.a(new lgl((ljq)bsx2.getValue("Rotation")));
                cmo2.d(bvd4);
                this.MessageDelegator.a((amf)((Object)cmo2));
                this.dvD.put(cmo2.getGUID(), (amf)((Object)cmo2));
                cmo2.b(bsx2);
                gga gga4 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
                gga4.jgt = true;
                gga4.ResourceType = cmo2.az();
                this.MessageDelegator.F(gga4);
                break;
            }
            case TU: {
                cme cme2 = (cme)gfn2.dtF;
                cme2.aIh().setFileName((String)bsx2.getValue("MeshName"));
                bvd bvd5 = cme2.aIl();
                bvd5.c((ljq)bsx2.getValue("Position"));
                bvd5.a(new lgl((ljq)bsx2.getValue("Rotation")));
                cme2.d(bvd5);
                this.MessageDelegator.a((amf)((Object)cme2));
                this.dvD.put(cme2.getGUID(), (amf)((Object)cme2));
                cme2.b(bsx2);
                if (this.dvF != null) {
                    for (pc pc2 : this.dvF) {
                        cme2.a(pc2);
                    }
                }
                gga gga5 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
                gga5.jgt = true;
                gga5.ResourceType = cme2.az();
                this.MessageDelegator.F(gga5);
                break;
            }
            case TQ: 
            case TV: {
                ckx ckx2 = (ckx)gfn2.dtF;
                ckx2.aIh().setFileName((String)bsx2.getValue("MeshName"));
                bvd bvd6 = ckx2.aIl();
                bvd6.c((ljq)bsx2.getValue("Position"));
                bvd6.a(new lgl((ljq)bsx2.getValue("Rotation")));
                ckx2.d(bvd6);
                this.MessageDelegator.a((amf)((Object)ckx2));
                this.dvD.put(ckx2.getGUID(), (amf)((Object)ckx2));
                ckx2.c(bsx2);
                ckx2.Hy();
                gga gga6 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
                gga6.jgt = true;
                gga6.ResourceType = ckx2.az();
                this.MessageDelegator.F(gga6);
                break;
            }
        }
    }

    public List<pc> arM() {
        ArrayList<pc> arrayList = lcn.emv();
        if (!this.dvD.isEmpty()) {
            for (amf amf2 : this.dvD.values()) {
                if (!(amf2 instanceof cme)) continue;
                cme cme2 = (cme)((Object)amf2);
                arrayList.add(cme2.aTd());
            }
        }
        return arrayList;
    }

    public void ai(List<pc> list) {
        this.dvF = list;
        if (this.dvF == null) {
            return;
        }
        if (this.dvD.isEmpty()) {
            return;
        }
        if (!this.dvD.isEmpty()) {
            for (amf amf2 : this.dvD.values()) {
                if (!(amf2 instanceof cme)) continue;
                cme cme2 = (cme)((Object)amf2);
                for (pc pc2 : list) {
                    cme2.a(pc2);
                }
            }
        }
    }
}

