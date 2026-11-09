/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  eg
 *  lcr
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

public class dz
extends btk
implements bto {
    private String bP = "^[a-zA-Z][a-fA-F]{0,1}[0-9]{2}.xml$";
    private boolean nG = false;
    private String[] nH = new String[]{"a08"};
    private int nI = -1;
    private int nJ = 768;
    private boolean TakeWireframScreens = false;
    private boolean TakeISOScreens = false;
    private boolean LoadNeighbours = false;
    private boolean ReplaceWaterShaders = false;
    public static Set<String> nK = lcn.emx();
    private a nL = a.nP;
    private double nM;
    private ldv nN;
    private Set<String> nO = lcn.emx();

    @Override
    public void initialize() {
        eg eg2 = (eg)this.MessageDelegator.d(lcr.qAE);
        assert (eg2 != null);
        this.nN = eg2.dU();
        assert (this.nN != null);
        assert (this.nH != null && this.nH.length > 0);
        this.f(this.nJ, this.nJ);
        this.db();
        this.nL = a.nQ;
    }

    private void f(int n2, int n3) {
        lcw.qFT = n2;
        lcw.qFU = n3;
        if (mje.DAv != null) {
            mje.DAv.B();
        }
        kfy kfy2 = (kfy)this.MessageDelegator.BV(3);
        kfy2.ts(this.getGUID());
        kfy2.WE(64);
        kfy2.WF(lcw.qFT);
        kfy2.WG(lcw.qFU);
        this.MessageDelegator.b(kfy2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.nL == a.nQ) {
            if (!this.da()) {
                this.MessageDelegator.hd(this.GUID);
            }
            this.nL = this.nO.size() == 0 ? a.nT : a.nS;
        } else if (this.nL == a.nT) {
            this.nM = ldz2.rgz;
            this.nL = a.nU;
        } else if (this.nL == a.nU) {
            if (ldz2.rgz > this.nM + 1.0) {
                if (this.ReplaceWaterShaders) {
                    this.cY();
                    this.nL = a.nV;
                } else {
                    this.nL = a.nW;
                }
            }
        } else if (this.nL == a.nW) {
            this.W(this.nH[this.nI]);
            this.nL = a.nX;
        } else if (this.nL == a.nX && ldz2.rgz > this.nM + 1.0) {
            this.nL = a.nQ;
        }
    }

    private void cY() {
        kpy kpy2 = (kpy)this.MessageDelegator.h(3592);
        kpy2.ts(this.GUID);
        kpy2.hC(new ldv(0, 0, 0));
        kpy2.wD(true);
        this.MessageDelegator.a(kpy2);
    }

    private void n(ldz ldz2) {
    }

    private void n(boolean bl) {
        kir kir2 = (kir)this.MessageDelegator.h(2054);
        kir2.ts(this.GUID);
        kir2.wD(false);
        kir2.jM(false);
        kir2.oG(lcr.rg);
        kir2.Ya(1024);
        kir2.Yb(1024);
        if (bl) {
            lfn.b(0, "SFMinimapGeneratorWorker", "setCameraPerspective() ORTHO Camera");
            kir2.ha(7000.0f);
            kir2.XZ(2050);
        } else {
            lfn.b(0, "SFMinimapGeneratorWorker", "setCameraPerspective() Perspective Camera");
            kir2.ha(450.0f);
            kir2.XZ(1026);
        }
        this.MessageDelegator.a(kir2);
    }

    private void a(ljq ljq2, ljq ljq3) {
        this.n(true);
        ljq ljq4 = null;
        ljq4 = lcw.zh((String)this.nH[this.nI]);
        if (ljq4 == null) {
            lfn.b(0, "SFWorldbuilderLogic", "setupCameraForMinimapScreenshot() CamPos still null!");
            ljq4 = mje.DBl;
        }
        ljq4.es(ljq2);
        mje.DBl = ljq4;
        edc edc2 = (edc)this.MessageDelegator.h(2049, this.GUID, this.nN);
        edc2.DH(12);
        edc2.a(new lgl(ljq3));
        edc2.c(ljq4);
        this.MessageDelegator.I(edc2);
    }

    private void cZ() {
        for (int i2 = 0; i2 < this.nH.length; ++i2) {
            String string = this.V(this.nH[i2]);
            if (nK.contains(string)) continue;
            nK.add(string);
            krw krw2 = (krw)this.MessageDelegator.j(16);
            krw2.wQ(string);
            krw2.ts(this.GUID);
            krw2.xC(false);
            this.MessageDelegator.a(krw2);
        }
    }

    private void S(String string) {
        Object object;
        Object object2;
        Set<String> set = lcn.emx();
        if (this.LoadNeighbours) {
            int n2;
            object2 = new lej(0, 0);
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (!Character.isDigit(string.charAt(i2))) continue;
                String string2 = string.substring(0, i2);
                String string3 = string.substring(i2, string.length());
                for (n2 = 0; n2 < lcw.qQy.length; ++n2) {
                    if (lcw.qQy[n2].toLowerCase().equals(string2)) {
                        ((lej)object2).RH(n2);
                    }
                    if (!lcw.qQz[n2].equals(string3)) continue;
                    ((lej)object2).RI(n2);
                }
                break;
            }
            object = new int[]{-1, -1, 0, -1, 1, -1, -1, 0, 0, 0, 1, 0, -1, 1, 0, 1, 1, 1};
            for (int i3 = 0; i3 < 9; ++i3) {
                int n3 = ((lej)object2).getX() + object[i3 * 2 + 0];
                n2 = ((lej)object2).getY() + object[i3 * 2 + 1];
                if (n3 < 0 || n3 >= 32 || n2 < 0 || n2 >= 32 || n3 < 5 || n3 > 25 || n2 < 5 || n2 > 25) continue;
                String string4 = (lcw.qQy[n3] + lcw.qQz[n2]).toLowerCase();
                File file = new File(lcw.qLb + "level/" + string4 + ".lvl");
                if (!file.exists()) continue;
                set.add(this.V(string4));
            }
        } else {
            set.add(this.V(string));
        }
        object2 = lcn.emv();
        for (String string5 : nK) {
            if (set.contains(string5)) continue;
            object2.add(string5);
        }
        object = object2.iterator();
        while (object.hasNext()) {
            String string6 = object.next();
            this.U(string6);
        }
        for (String string7 : set) {
            this.T(string7);
        }
    }

    private void T(String string) {
        if (nK.contains(string)) {
            return;
        }
        krw krw2 = (krw)this.MessageDelegator.j(16);
        krw2.wQ(string);
        krw2.ts(this.GUID);
        krw2.xC(true);
        this.MessageDelegator.a(krw2);
        this.nO.add(string);
    }

    private void U(String string) {
        nK.remove(string);
        kku kku2 = (kku)this.MessageDelegator.h(1036);
        kku2.ts(this.GUID);
        kku2.hC(new ldv(0, 0, 0));
        kku2.YF(1);
        kku2.wQ(string);
        this.MessageDelegator.a(kku2);
    }

    private boolean da() {
        ++this.nI;
        if (this.nI == this.nH.length) {
            return false;
        }
        this.a(new ljq(512.0f, 4000.0f, 512.0f), new ljq(1.5707963267948966, Math.PI, 0.0));
        this.S(this.nH[this.nI]);
        return true;
    }

    private String V(String string) {
        if (this.nG) {
            return "empty/" + string + "_empty.lvl";
        }
        return string + ".lvl";
    }

    private void W(String string) {
        lfn.b(0, this.getClass().getName(), "sendRenderRequest() : Taking scr");
        kgm kgm2 = new kgm();
        kgm2.setType(2);
        kgm2.tr(ldv.rfe);
        kgm2.ts(ldv.rfe);
        kgm2.setPrefix("minimap_" + string + ".bmp");
        kgm2.setDirectory(lcw.qLb + "/" + "screenshots/");
        kgm2.vB(true);
        this.MessageDelegator.b(kgm2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 524) {
            kvv kvv2 = (kvv)ktv2;
            if (kvv2.getResult() == 0 && kvv2.bQF()) {
                koh koh2 = (koh)this.MessageDelegator.h(524);
                koh2.ts(this.GUID);
                koh2.ZQ(2);
                koh2.sy(kvv2.axa());
                this.MessageDelegator.a(koh2);
                this.nL = a.nT;
            }
        } else if (ktv2.egT() == 5632) {
            this.nL = a.nW;
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 8) {
            kta kta2 = (kta)ktf2;
            String string = kta2.ecp().toLowerCase();
            if (this.nO.contains(string)) {
                this.nO.remove(string);
                nK.add(string);
            }
            if (this.nO.size() == 0) {
                this.nL = a.nT;
            }
            if (kta2.getResult() != 0) {
                lfn.b(5, this.getClass().getName(), "receiveResourceResponse() : failed to assemble level" + kta2.ecp());
            }
        }
    }

    private void db() {
        int n2;
        int n3;
        Set<String> set = lcn.emx();
        for (n3 = 0; n3 < this.nH.length; ++n3) {
            set.add(this.nH[n3].toLowerCase());
        }
        n3 = 0;
        int n4 = 0;
        int n5 = 1;
        ArrayList<String> arrayList = lcn.emv();
        for (n2 = 0; n2 < 1024; ++n2) {
            String string = lcw.qQy[n3] + lcw.qQz[n4];
            if (set.contains(string = string.toLowerCase())) {
                arrayList.add(string);
            }
            if ((n4 += n5) == 32) {
                n5 = -1;
                ++n3;
                n4 = 31;
            }
            if (n4 != -1) continue;
            n5 = 1;
            ++n3;
            n4 = 0;
        }
        this.nH = arrayList.toArray(this.nH);
        n2 = 0;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.n(false);
        ArrayList<String> arrayList = lcn.emv();
        for (String string : nK) {
            arrayList.add(string);
        }
        for (String string : arrayList) {
            this.U(string);
        }
        lfn.b(0, "SFMinimapGeneratorWorker", "cleanUp() DONE!");
    }

    public void b(String[] stringArray) {
        this.nH = stringArray;
    }

    public boolean dc() {
        return this.TakeISOScreens;
    }

    public void o(boolean bl) {
        this.TakeISOScreens = bl;
    }

    public boolean dd() {
        return this.TakeWireframScreens;
    }

    public void p(boolean bl) {
        this.TakeWireframScreens = bl;
    }

    public boolean de() {
        return this.nG;
    }

    public void q(boolean bl) {
        this.nG = bl;
    }

    public int df() {
        return this.nJ;
    }

    public void U(int n2) {
        this.nJ = n2;
    }

    public boolean dg() {
        return this.LoadNeighbours;
    }

    public void r(boolean bl) {
        this.LoadNeighbours = bl;
    }

    public boolean dh() {
        return this.ReplaceWaterShaders;
    }

    public void s(boolean bl) {
        this.ReplaceWaterShaders = bl;
    }
}

