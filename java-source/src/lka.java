/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.ArrayList;

public class lka {
    private dxr MessageDelegator;
    private ldv GUID;
    private ldv rpV;
    private ArrayList<lkc> rpW = lcn.emv();
    private ArrayList<lkb> rpX = lcn.emv();
    private boolean rpY = false;
    private boolean bGn = false;
    private boolean rpZ = false;
    private float pxh = 1.5f;

    public Object clone() {
        lka lka2 = new lka();
        if (this.GUID != null) {
            lka2.GUID = (ldv)this.GUID.clone();
        }
        if (this.rpV != null) {
            lka2.rpV = (ldv)this.rpV.clone();
        }
        for (lkc object : this.rpW) {
            lka2.rpW.add((lkc)object.clone());
        }
        for (lkb lkb2 : this.rpX) {
            lka2.rpX.add((lkb)lkb2.clone());
        }
        lka2.rpY = this.rpY;
        lka2.bGn = this.bGn;
        lka2.rpZ = this.rpZ;
        return lka2;
    }

    public void yA(boolean bl) {
        this.rpZ = bl;
    }

    public ArrayList<lkc> eth() {
        return this.rpW;
    }

    public ArrayList<lkb> eti() {
        return this.rpX;
    }

    public void a(dxr dxr2, ldv ldv2, ldv ldv3, float f) {
        this.MessageDelegator = dxr2;
        this.GUID = ldv2;
        this.rpV = this.MessageDelegator.bzv();
        this.bGn = true;
        this.n(ldv3, f);
    }

    private dfc Az(String string) {
        if (!this.bGn) {
            return null;
        }
        dfc dfc2 = (dfc)dgj.getAtomFactory().Af(4);
        dfc2.setGUID(this.MessageDelegator.bzv());
        dfc2.setXMLFileName(string);
        dfc2.setActive(true);
        dfc2.setConeOrientation(new ljq(0.0f, 1.0f, 0.0f));
        dfc2.setConeOutsideVolume(0L);
        dfc2.setInsideConeAngle(360);
        dfc2.setOutsideConeAngle(360);
        dfc2.setLooping(false);
        dfc2.hO(false);
        dfc2.setPlayingOnce(false);
        dfc2.setMaxDistance(10.0f);
        dfc2.setMinDistance(0.75f);
        dfc2.setMode(0);
        dfc2.bi(new ljq());
        dfc2.bK(new ljq());
        this.MessageDelegator.a(dfc2);
        return dfc2;
    }

    public void etj() {
        if (!this.bGn) {
            return;
        }
        for (lkb lkb2 : this.rpX) {
            for (String string : lkb2.rqa) {
                lkb2.rqb.add(this.Az(string));
            }
        }
        this.rpY = false;
    }

    public void etk() {
        if (!this.bGn) {
            return;
        }
        if (this.rpY) {
            return;
        }
        for (lkb lkb2 : this.rpX) {
            for (dfc dfc2 : lkb2.rqb) {
                if (dfc2.blt()) continue;
                return;
            }
        }
        for (lkb lkb2 : this.rpX) {
            if (lkb2.rqb.size() < 1) continue;
            khh khh2 = (khh)this.MessageDelegator.h(3087);
            khh2.ts(this.GUID);
            khh2.hC(this.rpV);
            khh2.pxd = new ldv[lkb2.rqb.size()];
            int n = 0;
            for (dfc dfc3 : lkb2.rqb) {
                khh2.pxd[n] = dfc3.getGUID();
                ++n;
            }
            khh2.pxe = lkb2.nBN;
            khh2.type = lkb2.Type;
            this.MessageDelegator.a(khh2);
        }
        this.rpY = true;
    }

    public void c(lks lks2) {
        if (!this.bGn) {
            return;
        }
        for (lkc lkc2 : this.rpW) {
            ArrayList<String> arrayList;
            if (lkc2.rqc.size() < 1 || (arrayList = lks2.t(lkc2.rqc)).size() < 1) continue;
            khk khk2 = (khk)this.MessageDelegator.h(3086);
            khk2.pxj = new String[arrayList.size()];
            arrayList.toArray(khk2.pxj);
            khk2.ts(this.GUID);
            khk2.hC(this.rpV);
            khk2.pxk = lkc2.rqd;
            khk2.pxl = lkc2.rqe;
            khk2.pxn = lkc2.rqf;
            khk2.pxo = lkc2.rqg;
            khk2.pxp = lkc2.rqh;
            khk2.pxq = lkc2.rqi;
            khk2.type = lkc2.Type;
            khk2.pxm = this.rpZ ? lkc2.ddW : 100;
            this.MessageDelegator.a(khk2);
        }
    }

    private void etl() {
        if (!this.bGn) {
            return;
        }
        khg khg2 = (khg)this.MessageDelegator.h(3088);
        khg2.ts(this.GUID);
        khg2.hC(this.rpV);
        this.MessageDelegator.a(khg2);
    }

    private void n(ldv ldv2, float f) {
        if (!this.bGn) {
            return;
        }
        khj khj2 = (khj)this.MessageDelegator.h(3089);
        khj2.ts(this.GUID);
        khj2.hC(ldv2);
        khj2.hs = this.rpV;
        khj2.pxh = this.pxh;
        khj2.gPt = f;
        khj2.pxi = "texgroups/tg_config.xml";
        this.MessageDelegator.a(khj2);
    }

    public void clear() {
        if (!this.bGn) {
            return;
        }
        this.etl();
        this.MessageDelegator.oa(this.rpV);
        for (lkb lkb2 : this.rpX) {
            for (dfc dfc2 : lkb2.rqb) {
                this.MessageDelegator.hd(dfc2.getGUID());
                this.MessageDelegator.oa(dfc2.getGUID());
            }
        }
        this.rpX.clear();
        this.rpW.clear();
    }

    public float dZi() {
        return this.pxh;
    }

    public void lT(float f) {
        this.pxh = f;
        if (this.rpV != null && this.MessageDelegator != null) {
            khi khi2 = (khi)this.MessageDelegator.h(3091);
            khi2.fh(2);
            khi2.ts(this.GUID);
            khi2.hC(this.rpV);
            khi2.e(this.rpV);
            khi2.lT(this.pxh);
            this.MessageDelegator.a(khi2);
        }
    }

    public void setEnabled(boolean bl) {
        if (this.MessageDelegator == null) {
            return;
        }
        khi khi2 = (khi)this.MessageDelegator.h(3091);
        khi2.fh(1);
        khi2.ts(this.GUID);
        khi2.hC(this.rpV);
        khi2.e(this.rpV);
        khi2.setEnabled(bl);
        this.MessageDelegator.a(khi2);
    }
}

