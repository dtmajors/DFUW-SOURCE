/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class hg {
    private final ha hF;
    private final Map<ldv, fxg> abD = lcn.emw();
    private final List<Integer> abE = lcn.emv();
    private int abF = 0;
    private final Map<Integer, lil<ldv, String, Integer>> abG = lcn.emw();
    private final Map<Integer, ldv> abH = lcn.emw();

    public hg(ha ha2) {
        this.hF = ha2;
    }

    protected void e(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 10257: 
            case 10260: {
                this.hF.jA().receiveMessage(dxq2);
                break;
            }
            case 10242: {
                this.a((gdh)dxq2);
                break;
            }
            case 10243: {
                this.a((gdk)dxq2);
                break;
            }
            case 10262: {
                this.a((gdd)dxq2);
                break;
            }
            case 10244: {
                this.a((gdf)dxq2);
                break;
            }
            case 10253: {
                this.a((gde)dxq2);
                break;
            }
            case 19731: {
                this.a((fwl)dxq2);
                break;
            }
            case 19734: {
                this.a((fxj)dxq2);
                break;
            }
            case 19735: {
                this.a((fxg)dxq2);
                break;
            }
            case 11786: {
                this.a((fkv)dxq2);
                break;
            }
        }
    }

    private void a(gdh gdh2) {
        assert (this.hF.jA() != null);
        int[] nArray = gdh2.iOV;
        assert (nArray != null);
        gdi gdi2 = (gdi)this.hF.getMessageDelegator().h(10241, this.hF.getGUID(), gdh2.aO());
        gdi2.jeD = this.hF.jA().ra();
        List list = this.hF.jA().d(nArray);
        if (list != null && !list.isEmpty()) {
            int[] nArray2 = new int[list.size()];
            int[] nArray3 = new int[list.size()];
            int[] nArray4 = new int[list.size()];
            long[] lArray = new long[list.size()];
            int n = 0;
            for (mo.a a2 : list) {
                nArray2[n] = a2.azg;
                nArray3[n] = a2.mb;
                nArray4[n] = a2.azh;
                lArray[n] = a2.azi;
                ++n;
            }
            gdi2.iOV = nArray2;
            gdi2.jeB = nArray4;
            gdi2.jeA = nArray3;
            gdi2.jeC = lArray;
        }
        this.hF.getMessageDelegator().F(gdi2);
    }

    private void a(gdk gdk2) {
        switch (gdk2.bTQ()) {
            case 1: {
                this.hF.jA().b(gdk2.nS(), gdk2.qH(), gdk2.bTH());
                break;
            }
            case 2: {
                this.hF.jA().c(gdk2.nS(), gdk2.qH(), gdk2.bTH());
                break;
            }
            default: {
                assert (false) : "UNKNOWN TARGET QUEST TYPE";
                break;
            }
        }
    }

    private void a(gdd gdd2) {
        int[] nArray = gdd2.bTJ();
        ldv ldv2 = gdd2.bTH();
        ldv ldv3 = gdd2.qH();
        dud dud2 = dud.getValueByOrdinal(gdd2.asH());
        int n = gdd2.zg();
        int n2 = gdd2.bTG();
        if (nArray == null || ldv2 == null || ldv3 == null) {
            lfn.b(5, "SFPlayerQuestMessageHandler", "handleGatherQuestMessageNew() Invalid Parameters.");
            assert (false);
            return;
        }
        switch (n2) {
            case 1: {
                block12: for (int n3 : nArray) {
                    switch (dud2) {
                        case hdP: {
                            this.hF.jA().a(-1, n3, ldv3, ldv2);
                            this.hF.h(n3, gdd2.bTB());
                            continue block12;
                        }
                        case hdN: 
                        case hdQ: {
                            this.hF.jA().a(-1, n3, ldv3, ldv2);
                            continue block12;
                        }
                        case hdS: {
                            this.hF.jA().a(n, n3, ldv3, ldv2);
                            continue block12;
                        }
                        default: {
                            lfn.b(5, "SFPlayerQuestMessageHandler", "handleQuestTargetsRegistrationMessage() Unknown Quest Type: " + (Object)((Object)dud2));
                            assert (false) : "Unknown Quest Type";
                            continue block12;
                        }
                    }
                }
                break;
            }
            case 2: {
                block13: for (int n4 : nArray) {
                    switch (dud2) {
                        case hdP: 
                        case hdN: 
                        case hdQ: 
                        case hdS: {
                            this.hF.jA().c(n4, ldv3, ldv2);
                            continue block13;
                        }
                        default: {
                            lfn.b(5, "SFPlayerQuestMessageHandler", "handleQuestTargetsRegistrationMessage() Unknown Quest Type: " + (Object)((Object)dud2));
                            assert (false) : "Unknown Quest Type";
                            continue block13;
                        }
                    }
                }
                break;
            }
            default: {
                lfn.b(5, "SFPlayerQuestMessageHandler", "handleQuestTargetsRegistrationMessage() Unknown Request Type: " + gdd2.bTG());
                assert (false) : "Unknown Request Type";
                break;
            }
        }
    }

    private void a(gdf gdf2) {
        ldv ldv2 = gdf2.bTL();
        ldv ldv3 = gdf2.bTN();
        String string = gdf2.getVendorName();
        int n = gdf2.bTK();
        int n2 = gdf2.bTO();
        int n3 = gdf2.qS();
        switch (n) {
            case 0: {
                assert (string != null);
                assert (ldv2 != null);
                assert (ldv3 != null);
                this.hF.jA().a(ldv2, n3, ldv3, string, n2);
                break;
            }
            case 1: {
                assert (ldv2 != null);
                assert (ldv3 != null);
                this.hF.jA().d(n3, n2, n);
                break;
            }
            case 4: {
                assert (ldv2 != null);
                assert (ldv3 != null);
                this.hF.jA().d(n3, n2, n);
                break;
            }
            case 5: {
                assert (ldv3 != null);
                assert (n3 != -1);
                this.hF.jA().cN(n3);
                break;
            }
            case 6: {
                assert (ldv3 != null);
                assert (n3 != -1);
                this.hF.jA().cM(n3);
                break;
            }
            case 3: {
                assert (n3 != -1);
                boolean bl = false;
                if (this.hF.iY() && this.hF.jf() != null && this.hF.aP() != null) {
                    bl = this.hF.jA().d(n3, n2, n);
                }
                gdg gdg2 = (gdg)this.hF.getMessageDelegator().h(10245, gdf2.amk(), gdf2.aO());
                gdg2.jer = bl;
                this.hF.getMessageDelegator().F(gdg2);
                break;
            }
            default: {
                lfn.b(5, "SFPlayerQuestMessageHandler", "handleQuestSolvedMessage() UNKNOWN TYPE " + gdf2.getClass().getName() + " Type " + n);
                assert (false);
                break;
            }
        }
    }

    private void a(gde gde2) {
        boolean bl = gde2.jee;
        ldv ldv2 = gde2.ComplexQuestGUID;
        ldv ldv3 = gde2.jec;
        assert (ldv2 != null);
        assert (ldv3 != null);
        this.hF.jA().a(ldv2, ldv3, gde2.azg, gde2.jed);
    }

    private void a(fwl fwl2) {
        gx gx2 = this.hF.jU().lr();
        if (!gx2.iC()) {
            if (gx2.Yt) {
                fwm fwm2 = (fwm)this.hF.getMessageDelegator().h(19732, this.hF.getGUID(), fwl2.aO());
                fwm2.DR(fxr.jav.ordinal());
                this.hF.getMessageDelegator().F(fwm2);
            } else {
                fwm fwm3 = (fwm)this.hF.getMessageDelegator().h(19732, this.hF.getGUID(), fwl2.aO());
                fwm3.DR(fxr.jas.ordinal());
                this.hF.getMessageDelegator().F(fwm3);
            }
            return;
        }
        int[] nArray = this.hF.jA().rc();
        if (nArray.length == 0) {
            fwm fwm4 = (fwm)this.hF.getMessageDelegator().h(19732, this.hF.getGUID(), fwl2.aO());
            fwm4.DR(fxr.jar.ordinal());
            this.hF.getMessageDelegator().F(fwm4);
            return;
        }
        boolean bl = fwl2.iZl;
        if (!bl) {
            String string = fwl2.iZk;
            if (string == null || string.trim().equals("")) {
                fwm fwm5 = (fwm)this.hF.getMessageDelegator().h(19732, this.hF.getGUID(), fwl2.aO());
                fwm5.DR(fxr.jax.ordinal());
                this.hF.getMessageDelegator().F(fwm5);
                return;
            }
            String[] stringArray = this.hF.jA().rb();
            if (stringArray == null || stringArray.length == 0) {
                fwm fwm6 = (fwm)this.hF.getMessageDelegator().h(19732, this.hF.getGUID(), fwl2.aO());
                fwm6.DR(fxr.jar.ordinal());
                this.hF.getMessageDelegator().F(fwm6);
                return;
            }
            for (String string2 : stringArray) {
                if (!string2.toLowerCase().contains(string.toLowerCase())) continue;
                int n = lea.eoU().ju(string2);
                assert (n != -1) : "Can Not Be -1 Here";
                ldv ldv2 = this.hF.jA().cL(n);
                assert (ldv2 != null) : "Can Not Be NULL Here";
                fxi fxi2 = (fxi)this.hF.getMessageDelegator().h(19733, this.hF.getGUID(), gx2.GUID);
                fxi2.jak = new int[]{n};
                fxi2.jal = new ldv[]{ldv2};
                fxi2.sk(this.abF);
                this.hF.getMessageDelegator().F(fxi2);
                this.abE.add(this.abF);
                ++this.abF;
                return;
            }
            fwm fwm7 = (fwm)this.hF.getMessageDelegator().h(19732, this.hF.getGUID(), fwl2.aO());
            fwm7.DR(fxr.jax.ordinal());
            this.hF.getMessageDelegator().F(fwm7);
            return;
        }
        fxi fxi3 = (fxi)this.hF.getMessageDelegator().h(19733, this.hF.getGUID(), gx2.GUID);
        fxi3.jak = nArray;
        fxi3.jal = new ldv[fxi3.jak.length];
        fxi3.sk(this.abF);
        for (int i = 0; i < fxi3.jak.length; ++i) {
            fxi3.jal[i] = this.hF.jA().cL(fxi3.jak[i]);
        }
        this.hF.getMessageDelegator().F(fxi3);
        this.abE.add(this.abF);
        ++this.abF;
    }

    private void a(fxj fxj2) {
        int n = fxj2.azg;
        int n2 = fxj2.getResult();
        fxr fxr2 = fxr.getValueByOrdinal(n2);
        String[] stringArray = new String[2];
        if (n != -1) {
            stringArray[0] = lea.eoU().Ch(fxj2.azg);
            stringArray[1] = fxj2.YV + " " + fxj2.YU;
        } else {
            stringArray[0] = "Invalid Quest";
            stringArray[1] = fxj2.YV + " " + fxj2.YU;
        }
        switch (fxr2) {
            case jao: {
                ljk ljk2 = new ljk(stringArray[0]);
                ljk ljk3 = new ljk(stringArray[1]);
                break;
            }
            case jap: {
                ljk ljk4 = new ljk(stringArray[0]);
                ljk ljk5 = new ljk(stringArray[1]);
                break;
            }
            case jaH: {
                ljk ljk6 = new ljk(stringArray[0]);
                ljk ljk7 = new ljk(stringArray[1]);
                break;
            }
            case jaB: {
                ljk ljk8 = new ljk(stringArray[1]);
                break;
            }
            case jaA: {
                ljk ljk9 = new ljk(stringArray[1]);
                break;
            }
            case jaC: {
                ljk ljk10 = new ljk(stringArray[0]);
                ljk ljk11 = new ljk(stringArray[1]);
                break;
            }
            case jaD: {
                ljk ljk12 = new ljk(stringArray[0]);
                ljk ljk13 = new ljk(stringArray[1]);
                break;
            }
            case jaz: {
                ljk ljk14 = new ljk(stringArray[1]);
                break;
            }
            case jas: {
                break;
            }
            case jau: {
                ljk ljk15 = new ljk(stringArray[0]);
                break;
            }
            case jat: {
                break;
            }
            case jar: {
                break;
            }
            case jav: {
                break;
            }
            case jay: {
                break;
            }
            case jaq: {
                ljk ljk16 = new ljk(stringArray[0]);
                ljk ljk17 = new ljk(stringArray[1]);
                break;
            }
            case jaw: {
                ljk ljk18 = new ljk(stringArray[0]);
                ljk ljk19 = new ljk(stringArray[1]);
                break;
            }
            case jaE: {
                ljk ljk20 = new ljk(stringArray[0]);
                ljk ljk21 = new ljk(stringArray[1]);
                break;
            }
            case jax: {
                break;
            }
            case jaF: {
                ljk ljk22 = new ljk(stringArray[0]);
                ljk ljk23 = new ljk(stringArray[1]);
                break;
            }
            case jaG: {
                ljk ljk24 = new ljk(stringArray[1]);
                break;
            }
            case jaI: {
                ljk ljk25 = new ljk(stringArray[0]);
                ljk ljk26 = new ljk(stringArray[1]);
                break;
            }
            case jaJ: {
                ljk ljk27 = new ljk(stringArray[0]);
                ljk ljk28 = new ljk(stringArray[1]);
                break;
            }
            default: {
                assert (false) : "Result :" + n2;
                break;
            }
        }
    }

    private void a(fxg fxg2) {
        String string = fxg2.iZk;
        String string2 = fxg2.jah;
        String string3 = fxg2.YU;
        String string4 = fxg2.YV;
        ldv ldv2 = fxg2.inm;
        if (!this.hF.iY()) {
            fxh fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), fxg2.aO());
            fxh2.ew = fxr.jaA.ordinal();
            fxh2.inm = ldv2;
            fxh2.iZk = string;
            fxh2.jaj = this.hF.iP();
            fxh2.jai = this.hF.iR();
            this.hF.getMessageDelegator().b(fxg2, fxh2);
            this.hF.getMessageDelegator().F(fxh2);
            return;
        }
        if (ldv2.equals(this.hF.getGUID())) {
            fxh fxh3 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), fxg2.aO());
            fxh3.ew = fxr.jau.ordinal();
            fxh3.inm = ldv2;
            fxh3.iZk = string;
            fxh3.jaj = this.hF.iP();
            fxh3.jai = this.hF.iR();
            this.hF.getMessageDelegator().b(fxg2, fxh3);
            this.hF.getMessageDelegator().F(fxh3);
            return;
        }
        if (!this.hF.jU().aA(fxg2.cRI)) {
            fxh fxh4 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), fxg2.aO());
            fxh4.ew = fxr.jaB.ordinal();
            fxh4.inm = ldv2;
            fxh4.iZk = string;
            fxh4.jaj = this.hF.iP();
            fxh4.jai = this.hF.iR();
            this.hF.getMessageDelegator().b(fxg2, fxh4);
            this.hF.getMessageDelegator().F(fxh4);
            return;
        }
        if (this.hF.aD(ldv2)) {
            fxh fxh5 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), fxg2.aO());
            fxh5.ew = fxr.jaz.ordinal();
            fxh5.inm = ldv2;
            fxh5.jaj = this.hF.iP();
            fxh5.jai = this.hF.iR();
            fxh5.iZk = string;
            this.hF.getMessageDelegator().b(fxg2, fxh5);
            this.hF.getMessageDelegator().F(fxh5);
            return;
        }
        ldv ldv3 = this.hF.getMessageDelegator().bzv();
        double d2 = this.hF.getMessageDelegator().arc().rgz + 20.0;
        ldv ldv4 = lcr.p((ldv)lcr.aTZ, (int)this.hF.jr(), (int)this.hF.getGUID().enw());
        if (!lcw.qOR) {
            String[] stringArray = bdp.dbj;
            String string5 = "Player : " + string3 + " " + string4 + " is offering to you\r\n" + "Quest  : " + string + "\r\n" + "Task   : " + string2;
            bdr bdr2 = new bdr(ldv3, d2, string5, stringArray);
            est est2 = (est)this.hF.getMessageDelegator().h(18179, this.hF.getGUID(), ldv4);
            est2.iBv = bdr2;
            est2.hsP = true;
            this.hF.getMessageDelegator().F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = ldv3;
            bdt2.dbE = lwq.tga.bD(string3 + " " + string4, string);
            bdt2.ed = bdu.dbG.ordinal();
            bdt2.Ri = ldv2;
            esu esu2 = (esu)this.hF.getMessageDelegator().h(18183, this.hF.getGUID(), ldv4);
            esu2.iBw = bdt2;
            this.hF.getMessageDelegator().F(esu2);
        }
        this.abD.put(ldv3, fxg2);
    }

    public void c(esv esv2) {
        if (esv2 == null) {
            lfn.b(5, "SFPlayerQuestMessageHandler", "handlePartyQuestOfferConfirmationResponseMessage() Response is null");
            return;
        }
        if (esv2.iBx == null) {
            lfn.b(5, "SFPlayerQuestMessageHandler", "handlePartyQuestOfferConfirmationResponseMessage() ConfirmationRespose is null.");
            return;
        }
        ldv ldv2 = esv2.iBx.dbT;
        fxg fxg2 = this.abD.remove(ldv2);
        assert (fxg2 != null) : "No Entry For This Message Dialog Response";
        if (fxg2 == null) {
            return;
        }
        ldv ldv3 = fxg2.inm;
        int n = fxg2.aVk();
        String string = fxg2.iZk;
        ldv ldv4 = fxg2.jag;
        ldv ldv5 = fxg2.ComplexQuestGUID;
        ldv ldv6 = fxg2.aO();
        ldv ldv7 = fxg2.cRI;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n2 = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getPartyOfferQuestButtonType(n2);
            fxh fxh2 = null;
            switch (a2) {
                case dbt: {
                    if (!this.hF.jU().iC() || !ldv7.equals(this.hF.jM())) {
                        fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv6);
                        fxh2.ew = fxr.jaB.ordinal();
                        fxh2.inm = ldv3;
                        fxh2.iZk = string;
                        fxh2.jaj = this.hF.iP();
                        fxh2.jai = this.hF.iR();
                        fxh2.sk(n);
                        this.hF.getMessageDelegator().F(fxh2);
                        return;
                    }
                    fku fku2 = (fku)this.hF.getMessageDelegator().h(11785, this.hF.getGUID(), ldv4);
                    fku2.iOY = ldv5;
                    fku2.SA = this.hF.aP();
                    fku2.Tr = this.hF.getGUID();
                    fku2.iPa = false;
                    fku2.adA = this.hF.getGUID();
                    fku2.iOZ = true;
                    this.hF.getMessageDelegator().F(fku2);
                    this.abG.put(ldv5.enx(), new lil<ldv, String, Integer>(ldv3, string, n));
                    this.abH.put(ldv5.enx(), ldv6);
                    break;
                }
                case dbu: {
                    fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv6);
                    fxh2.ew = fxr.jap.ordinal();
                    fxh2.inm = ldv3;
                    fxh2.iZk = string;
                    fxh2.jaj = this.hF.iP();
                    fxh2.jai = this.hF.iR();
                    fxh2.sk(n);
                    this.hF.getMessageDelegator().F(fxh2);
                    break;
                }
            }
        } else if (bdv2 instanceof bdx) {
            fxh fxh3 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv6);
            fxh3.ew = fxr.jap.ordinal();
            fxh3.inm = ldv3;
            fxh3.iZk = string;
            fxh3.jaj = this.hF.iP();
            fxh3.jai = this.hF.iR();
            fxh3.sk(n);
            this.hF.getMessageDelegator().F(fxh3);
        } else {
            return;
        }
    }

    private void a(fkv fkv2) {
        int n = fkv2.azg;
        lil<ldv, String, Integer> lil2 = this.abG.remove(n);
        ldv ldv2 = this.abH.remove(n);
        if (lil2 == null) {
            this.hF.jA().receiveMessage((dxq)fkv2);
            return;
        }
        assert (ldv2 != null) : "If This IS NULL Here Something Is Wrong";
        int n2 = fkv2.ew;
        ldv ldv3 = (ldv)lil2.reX;
        String string = (String)lil2.reY;
        int n3 = (Integer)lil2.reZ;
        assert (gcr.isValidOrdinal(n2));
        gcr gcr2 = gcr.getValueByOrdinal(n2);
        fxh fxh2 = null;
        switch (gcr2) {
            case jdk: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaH.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdp: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaI.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdj: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jao.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdm: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaC.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdn: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaD.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdo: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaE.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdq: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaF.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jdr: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaG.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            case jds: {
                fxh2 = (fxh)this.hF.getMessageDelegator().h(19736, this.hF.getGUID(), ldv2);
                fxh2.ew = fxr.jaJ.ordinal();
                fxh2.inm = ldv3;
                fxh2.iZk = string;
                fxh2.jaj = this.hF.iP();
                fxh2.jai = this.hF.iR();
                fxh2.sk(n3);
                this.hF.getMessageDelegator().F(fxh2);
                break;
            }
            default: {
                assert (false) : "Reason :" + n2;
                break;
            }
        }
    }

    public boolean aJ(ldv ldv2) {
        return this.abD.containsKey(ldv2);
    }
}

