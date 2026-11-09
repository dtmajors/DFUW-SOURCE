/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ed
extends btk
implements bto {
    private a pn = a.pz;
    private List<File> po = lcn.emv();
    private ldv pp = null;
    private amf pq = null;
    private File pr = null;
    private double ps = 0.0;
    private int pt = 0;
    private int pu = 0;
    private float pv = 1.5f;
    private int pw = 0;
    private lcj px = new lcj();
    private Map<ldv, ljq> py = lcn.emw();

    public int dG() {
        return this.pt;
    }

    public void Z(int n2) {
        this.pt = n2;
    }

    public int dH() {
        return this.pu;
    }

    public void aa(int n2) {
        this.pu = n2;
    }

    public float dI() {
        return this.pv;
    }

    public void j(float f2) {
        this.pv = f2;
    }

    public void addFile(File file) {
        this.po.add(file);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.pn = a.pA;
    }

    @Override
    public void doTick(ldz ldz2) {
        Object object;
        ArrayList<amf> arrayList;
        Object object2;
        Object object3;
        if (this.pn == a.pA) {
            if (this.po.size() == 0) {
                this.pn = a.pH;
                return;
            }
            object3 = this.po.get(0);
            this.pr = object3;
            this.po.remove(0);
            this.pp = this.MessageDelegator.bzv();
            object2 = ((File)object3).getAbsolutePath();
            arrayList = (hac)this.MessageDelegator.h(4097, this.GUID, lcr.qAE);
            ((hac)((Object)arrayList)).Lb(1);
            ((hac)((Object)arrayList)).setFileName((String)object2);
            ((hac)((Object)arrayList)).hC(this.pp);
            ((hac)((Object)arrayList)).c(new ljq());
            ((hac)((Object)arrayList)).setRotation(new ljq());
            this.MessageDelegator.F((dxq)((Object)arrayList));
            this.ps = ldz2.rgz;
            this.pn = a.pB;
        }
        if (this.pn == a.pB && ldz2.rgz - this.ps > 0.8) {
            object3 = this.MessageDelegator.d(this.pp);
            if (object3 == null) {
                this.pn = a.pA;
                lfn.b(5, this.getClass().getName(), "doTick() :failed to load file " + this.pr.getAbsolutePath() + ". Move to next one.");
                return;
            }
            this.pq = object3;
            object2 = (hac)this.MessageDelegator.h(4097, this.GUID, lcr.qAE);
            ((hac)object2).Lb(13);
            ((hac)object2).hC(null);
            this.MessageDelegator.F((dxq)object2);
            arrayList = lcn.emv();
            if (this.pq instanceof bdl) {
                object = (bdl)((Object)this.pq);
                object.setVisible(false);
                for (amf amf2 : ((bdl)((Object)object)).ame()) {
                    arrayList.add(amf2);
                }
            } else {
                arrayList.add(this.pq);
            }
            this.pw = arrayList.size();
            this.px.qwb = new ljq(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
            this.px.qwc = new ljq(-3.4028235E38f, -3.4028235E38f, -3.4028235E38f);
            for (amf amf3 : arrayList) {
                kkq kkq2 = (kkq)this.MessageDelegator.h(1044);
                kkq2.ts(this.GUID);
                kkq2.wD(false);
                kkq2.hC(amf3.getGUID());
                this.MessageDelegator.a(kkq2);
            }
            this.pn = a.pC;
        }
        if (this.pn == a.pD) {
            object3 = new ljq(mje.DBl);
            object2 = this.px;
            arrayList = ((lcj)object2).qwb.esF();
            ((ljq)((Object)arrayList)).es(((lcj)object2).qwc);
            ((ljq)((Object)arrayList)).nm(0.5f);
            object = ((lcj)object2).qwc.esF();
            ((ljq)object).et(((lcj)object2).qwb);
            float f2 = Math.max(((ljq)object).rlV, Math.max(((ljq)object).x, ((ljq)object).y));
            float f3 = this.pv;
            mfy mfy2 = new mfy();
            ((ljq)((Object)arrayList)).esB();
            mfy2.eG((ljq)((Object)arrayList));
            mfy mfy3 = new mfy();
            mfy3.nN((float)Math.toRadians(this.pt));
            mfy mfy4 = new mfy();
            lgl lgl2 = new lgl();
            lgl2.z(new ljq(1.0f, 0.0f, 0.0f), -((float)Math.toRadians(this.pu)));
            lgl2.normalize();
            mfy4.ac(lgl2);
            mfy mfy5 = new mfy();
            mfy5.H(((ljq)object3).x, ((ljq)object3).y, ((ljq)object3).rlV + f3 * f2);
            mfy2.c(mfy3);
            mfy2.c(mfy4);
            mfy2.c(mfy5);
            ljq ljq2 = new ljq();
            lgl2 = new lgl();
            mfy2.w(ljq2, lgl2);
            lgl2.normalize();
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.wD(true);
            kky2.hC(this.pq.getGUID());
            kky2.pHF = 8;
            kky2.pHG = ljq2.getX();
            kky2.pHH = ljq2.getY();
            kky2.pHI = ljq2.bdV();
            kky2.rb = lgl2.x;
            kky2.rc = lgl2.y;
            kky2.rd = lgl2.rlV;
            kky2.pHJ = lgl2.rlW;
            kky2.ts(this.GUID);
            this.MessageDelegator.a(kky2);
            this.pn = a.pE;
        }
        if (this.pn == a.pF) {
            object3 = new kgm();
            ((kgm)object3).setType(1);
            ((kgh)object3).tr(ldv.rfe);
            ((kgh)object3).ts(ldv.rfe);
            object2 = this.pr.getName().toLowerCase().replace(".xml", ".jpg");
            object2 = ((String)object2).replace(".xlk", ".jpg");
            ((kgm)object3).setPrefix((String)object2);
            ((kgm)object3).setDirectory(lcw.qLb + "worldbuilder/thumbnails/");
            ((kgm)object3).vB(true);
            this.MessageDelegator.b((kgh)object3);
            this.ps = ldz2.rgz;
            this.pn = a.pG;
        }
        if (this.pn == a.pG && ldz2.rgz - this.ps > 0.1) {
            this.MessageDelegator.hd(this.pq.getGUID());
            this.pn = a.pA;
        }
        if (this.pn == a.pH) {
            this.MessageDelegator.hd(this.GUID);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1032) {
            Object object;
            kur kur2 = (kur)ktv2;
            ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
            if (this.pq instanceof bdl) {
                object = (bdl)((Object)this.pq);
                for (bdl.a a2 : ((bdl)((Object)object)).alY()) {
                    if (!a2.amk().equals(kur2.axa())) continue;
                    ljq2 = a2.aml().esF();
                }
                kur2.axa();
            }
            object = kur2.ehd().qwb.esF();
            ljq ljq3 = kur2.ehd().qwc.esF();
            ((ljq)object).es(ljq2);
            ljq3.es(ljq2);
            this.px.dT((ljq)object);
            this.px.dT(ljq3);
            --this.pw;
            if (this.pw == 0) {
                this.pn = a.pD;
            }
        } else if (ktv2.egT() == 1024) {
            this.pn = a.pF;
        }
    }
}

