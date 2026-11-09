/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  ha
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cje
extends btk {
    public static final boolean eDN = true;
    private static final String TC = "SFTrainerTaskManager";
    private ha hF;
    private Map<Integer, cjr> dPn = lea.epr().aQi();
    private cul ala = new cul();
    private ldv eDO = null;
    private cjb eDP = null;
    private int eDQ = 0;
    private boolean aMu = false;
    private int eDL = 0;
    private Map<Integer, cjp> eDM = lcn.emw();
    private Set<acg> eDR = null;

    public cje(ha ha2) {
        this.hF = ha2;
    }

    public void aR(int n, int n2) {
        if (n == -1) {
            return;
        }
        cjr cjr2 = this.dPn.get(n);
        if (cjr2 == null) {
            lfn.b(5, TC, "restoreFromPersistence() TaskIndex : " + n + " is invalid!!  for player : " + this.hF.iU());
            assert (false);
            return;
        }
        this.eDP = new cjb(n, n2, cjr2.eDE.aPZ());
        this.aPX();
    }

    public void jw() {
        if (this.isCompleted()) {
            return;
        }
        this.eDO = new ldv(this.hF.jr(), lcr.qDE.enw(), lcr.qDE.enx());
        this.l(1, -1, -1);
        if (this.aPW()) {
            this.aPS();
            if (ls.isEnabled() && ls.pL()) {
                this.hF.lb().lK();
            }
            return;
        }
        if (this.eDP != null && !this.eDP.isCompleted()) {
            this.l(3, this.eDP.getIndex(), -1);
            this.aPR();
            return;
        }
        this.aPT();
    }

    private void aPR() {
        int n;
        cjr cjr2;
        if (this.isCompleted()) {
            return;
        }
        cjb cjb2 = this.aPV();
        if (cjb2 != null && (cjr2 = this.dPn.get(n = cjb2.getIndex())) != null) {
            brh brh2 = this.hF.jj();
            cjf cjf2 = cjr2.eDE;
            if (cjf2 instanceof cjn) {
                bqs bqs2;
                cjn cjn2 = (cjn)cjf2;
                if (cjn2.SkillType == cxd.fHN && cjn2.ResourceType == cug.fkz && (bqs2 = brh2.mn(cug.fjz)) == null) {
                    cte cte2 = new cte();
                    cte2.fex = false;
                    cte2.asi = 1;
                    cte2.ResourceType = cug.fjz;
                    cte[] cteArray = new cte[]{cte2};
                    ldv ldv2 = this.hF.jf().getGUID();
                    fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.getGUID(), this.MessageDelegator.getGUID());
                    fcy2.bst = bkd.dqO;
                    fcy2.aZG = this.getGUID();
                    fcy2.akX = ldv2;
                    fcy2.dtP = cteArray;
                    fcy2.iJG = true;
                    fcy2.b(bqy.dGx);
                    this.MessageDelegator.F(fcy2);
                }
            }
        }
    }

    private void aPS() {
        if (this.eDP != null) {
            if (this.hF.ki() == null) {
                lfn.b(5, TC, "createStartingEquipment() Player " + this.hF.iU() + " does not have a valid role.");
                assert (false);
                return;
            }
            List<cjp> list = lea.epr().qO(this.hF.ki().getIndex());
            for (cjp cjp2 : list) {
                Object object;
                Object object3;
                if (cjp2.eEa != null && !cjp2.eEa.isEmpty()) {
                    object3 = (gxp)this.MessageDelegator.h(29187, this.GUID, this.eDO);
                    ((gxp)object3).sk(this.eDL++);
                    ((gxp)object3).ll(cjp2.eEa.replace(" ", "_").toLowerCase());
                    this.MessageDelegator.F((dxq)object3);
                    this.eDM.put(((gxp)object3).aVk(), cjp2);
                    continue;
                }
                object3 = cjp2.eEa;
                int n = cjp2.eEb;
                List<cjt> list2 = cjp2.eEc;
                ArrayList<cte> arrayList = lcn.abH(list2.size());
                for (cjt cjt2 : list2) {
                    object = new cte();
                    ((cte)object).fex = false;
                    ((cte)object).asi = cjt2.ResourceType == cug.fkb && lcw.bcB == 2 ? cjt2.ayN * 4 : cjt2.ayN;
                    ((cte)object).ResourceType = cjt2.ResourceType;
                    this.ala.a(((cte)object).ResourceType, ((cte)object).asi, ((cte)object).fex, arrayList);
                }
                if (arrayList.isEmpty()) continue;
                cte[] cteArray = new cte[arrayList.size()];
                arrayList.toArray(cteArray);
                ldv ldv2 = this.hF.jf().getGUID();
                object = (fcy)this.MessageDelegator.h(9229, this.getGUID(), this.MessageDelegator.getGUID());
                ((fcy)object).dul = 8;
                ((fcy)object).bst = bkd.dqO;
                ((fcy)object).aZG = this.hF.getGUID();
                ((fcy)object).akX = ldv2;
                ((fcy)object).dtP = cteArray;
                ((fcy)object).iJG = true;
                ((fcy)object).iyH = object3 != null && !((String)object3).isEmpty();
                ((fcy)object).eEa = object3;
                ((fcy)object).eEb = n;
                ((fcy)object).hsP = true;
                ((fcy)object).b(bqy.dFX);
                this.MessageDelegator.F((dxq)object);
            }
            if (this.eDM.isEmpty()) {
                this.hF.c(mce.usW.bD(new Object[0]));
            }
        }
    }

    private void b(fte fte2) {
        if (!this.aPU()) {
            return;
        }
        int n = fte2.SkillType;
        int n2 = fte2.ResourceType;
        float f = fte2.doT;
        switch (this.eDP.aPQ().aPY()) {
            case SKILL: {
                cjn cjn2 = (cjn)this.eDP.aPQ();
                if (!cjn2.aL(n2, n)) break;
                this.eu(cjn2.eAg ? f : 1.0f);
                return;
            }
            case DIRECTION: {
                cjg cjg2 = (cjg)this.eDP.aPQ();
                if (!cjg2.g(fte2.iVF)) break;
                this.eu(1.0f);
                return;
            }
        }
    }

    private void a(fss fss2) {
        if (!this.aPU()) {
            return;
        }
        if (this.eDP.aPQ().aPY() != cjo.GUI) {
            return;
        }
        cji cji2 = (cji)this.eDP.aPQ();
        if (!cji2.k(fss2.iVA, fss2.eDX, fss2.eDY)) {
            return;
        }
        this.eu(1.0f);
    }

    private void a(fsv fsv2) {
        if (!this.aPU()) {
            return;
        }
        if (this.eDP.aPQ().aPY() != cjo.KILL) {
            return;
        }
        int n = fsv2.ResourceType;
        cjj cjj2 = (cjj)this.eDP.aPQ();
        if (!cjj2.qb(n)) {
            return;
        }
        this.eu(1.0f);
    }

    private void a(fsp fsp2) {
        if (!this.aPU()) {
            return;
        }
        if (!fsp2.bWx) {
            return;
        }
        int n = fsp2.ResourceType;
        if (this.eDP.aPQ().aPY() != cjo.EQUIP_UNSHEATH) {
            return;
        }
        cjh cjh2 = (cjh)this.eDP.aPQ();
        if (!cjh2.a(n, fsp2.iVr, fsp2.bWx)) {
            return;
        }
        this.eu(1.0f);
    }

    private void a(fta fta2) {
        if (!this.aPU()) {
            return;
        }
        if (this.eDP.aPQ().aPY() != cjo.POSTURE_MODE) {
            return;
        }
        cjm cjm2 = (cjm)this.eDP.aPQ();
        if (!cjm2.qb(fta2.dRh)) {
            return;
        }
        this.eu(1.0f);
    }

    private void eu(float f) {
        if (this.eDP.isCompleted()) {
            return;
        }
        this.eDP.er(f);
        if (!this.eDP.isCompleted()) {
            return;
        }
        this.l(4, this.eDP.getIndex(), -1);
    }

    private void c(gxu gxu2) {
        if (!this.aPU()) {
            return;
        }
        int n = gxu2.jtD;
        if (n != this.eDP.getIndex()) {
            lfn.b(5, TC, "handleTrainerTaskContinueMessage() Active task : " + this.eDP.getIndex() + " does not match with task : " + n + " Player : " + this.hF.iU());
            assert (false);
            return;
        }
        cjr cjr2 = this.dPn.get(this.eDP.getIndex());
        if (cjr2 == null) {
            lfn.b(5, TC, "handleTrainerTaskContinueMessage() this should not happen. Player : " + this.hF.iU() + " Task : " + this.eDP.getIndex());
            assert (false);
            return;
        }
        if (cjr2.bhg != null && !cjr2.bhg.isEmpty()) {
            this.au(cjr2.bhg);
            return;
        }
        this.aPT();
    }

    private void au(List<cjs> list) {
        for (cjs cjs2 : list) {
            Object object2;
            String string = cjs2.eEa;
            List<cjt> list2 = cjs2.aCN;
            ArrayList<cte> arrayList = lcn.abH(list2.size());
            ArrayList<cte> arrayList2 = lcn.emv();
            cte[] cteArray = list2.iterator();
            while (cteArray.hasNext()) {
                object2 = cteArray.next();
                cte cte2 = new cte();
                cte2.fex = false;
                cte2.asi = ((cjt)object2).ayN;
                cte2.ResourceType = ((cjt)object2).ResourceType;
                if (((cjt)object2).ayN < 0) {
                    cte2.asi = -cte2.asi;
                    arrayList2.add(cte2);
                    continue;
                }
                this.ala.a(cte2.ResourceType, cte2.asi, cte2.fex, arrayList);
            }
            if (!arrayList2.isEmpty() && (cteArray = this.hF.jj()) != null) {
                for (cte cte3 : arrayList2) {
                    boolean bl = cteArray.a(cte3.ResourceType, cte3.asi, bqy.dHL);
                    if (bl) continue;
                    lfn.b(5, TC, "rewardPlayer() System couldn't remove item : " + cte3.pa());
                }
            }
            if (arrayList.isEmpty()) continue;
            cteArray = new cte[arrayList.size()];
            arrayList.toArray(cteArray);
            object2 = this.hF.jf().getGUID();
            fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.getGUID(), this.MessageDelegator.getGUID());
            fcy2.dul = 8;
            fcy2.bst = bkd.dqO;
            fcy2.aZG = this.hF.getGUID();
            fcy2.akX = object2;
            fcy2.dtP = cteArray;
            fcy2.iJG = true;
            fcy2.iyH = string != null && !string.isEmpty();
            fcy2.eEa = string;
            fcy2.hsP = true;
            fcy2.b(bqy.dGy);
            this.MessageDelegator.F(fcy2);
            ++this.eDQ;
        }
    }

    private boolean aPT() {
        int n;
        cat cat2;
        cex cex2;
        int n2 = this.eDP == null ? 0 : this.eDP.getIndex() + 1;
        cju cju2 = lea.epr();
        cjr cjr2 = cju2.qN(n2);
        if (cjr2 == null) {
            return false;
        }
        this.eDP = new cjb(cjr2.adk, 0.0f, cjr2.eDE.aPZ());
        this.l(3, cjr2.adk, -1);
        if (cjr2.eDE.aPY() == cjo.EQUIP_UNSHEATH && (cex2 = this.hF.jf()) != null && (cat2 = (cat)cex2.aKu()) != null && (n = cat2.aGY()) != -1) {
            fsp fsp2 = (fsp)this.MessageDelegator.h(30214, this.getGUID(), this.getGUID());
            fsp2.bWx = true;
            fsp2.iVr = !cat2.aGR();
            fsp2.ResourceType = n;
            this.a(fsp2);
        }
        this.aPX();
        this.aPR();
        return true;
    }

    private void a(fcs fcs2) {
        cjr cjr2;
        if (!this.aPU()) {
            lfn.b(5, TC, "handleFunctionCompletionResultMessage() Player : " + this.hF.iU() + " Trainer is invalid.");
            assert (false);
            return;
        }
        boolean bl = fcs2.iJq;
        if (!bl) {
            lfn.b(5, TC, "handleFunctionCompletionResultMessage() Player : " + this.hF.iU() + " didn't get any rewards for task : " + this.eDP.getIndex());
            assert (false);
        }
        if ((cjr2 = this.dPn.get(this.eDP.getIndex())) == null) {
            lfn.b(5, TC, "handleFunctionCompletionResultMessage() EPlayer : " + this.hF.iU() + " Task : " + this.eDP.getIndex() + " is invalid.");
            assert (false);
            return;
        }
        --this.eDQ;
        if (this.eDQ > 0) {
            return;
        }
        this.aPT();
    }

    private void a(gxt gxt2) {
        cjl cjl2;
        int n = gxt2.dPu;
        if (this.eDP != null && this.eDP.aPQ().aPY() == cjo.LOCATION && (cjl2 = (cjl)this.eDP.aPQ()).qb(n)) {
            this.eu(1.0f);
            return;
        }
        this.qL(n);
    }

    private void qL(int n) {
        int n2 = -1;
        if (this.eDP != null) {
            for (cjr cjr2 : this.dPn.values()) {
                if (cjr2.adk < this.eDP.getIndex() || cjr2.eEk != n) continue;
                n2 = cjr2.adk;
            }
        }
        if (n2 != -1) {
            this.eDP = new cjb(n2, 0.0f, null);
            this.aPT();
        }
    }

    public void c(fsw fsw2) {
        if (this.isCompleted()) {
            return;
        }
        int n = fsw2.bEz();
        switch (n) {
            case 30209: {
                this.b((fte)fsw2);
                break;
            }
            case 30214: {
                this.a((fsp)fsw2);
                break;
            }
            case 30213: {
                this.a((fsv)fsw2);
                break;
            }
            case 30239: {
                this.a((fss)fsw2);
                break;
            }
            case 30240: {
                this.a((fta)fsw2);
                break;
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.isCompleted() && this.eDM.isEmpty()) {
            return;
        }
        int n = dxq2.bEz();
        switch (n) {
            case 29185: {
                gxu gxu2 = (gxu)dxq2;
                int n2 = gxu2.gOd;
                switch (n2) {
                    case 6: {
                        this.c(gxu2);
                    }
                }
                break;
            }
            case 29186: {
                this.a((gxt)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 29188: {
                this.a((gxq)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled Message : " + dxq2.getClass();
                break;
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        int n = kcz2.getMessageType();
        switch (n) {
            case 270: {
                this.b((kcs)kcz2);
                break;
            }
            default: {
                lfn.b(5, TC, "receiveMiddlewareMessage() Unhandled message : " + kcz2.getClass());
                assert (false);
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void b(kcs kcs2) {
        if (kcs2.peq instanceof gxu) {
            gxu gxu2 = (gxu)kcs2.peq;
            lfn.b(5, TC, "handleMiddlewareDeliveryErrorMessage() Trainer couldn't start. TOGUID " + gxu2.amk());
            return;
        }
        if (kcs2.peq instanceof fcy) {
            lfn.b(5, TC, "handleMiddlewareDeliveryErrorMessage() System couldn't reward player for the completed task.");
            assert (false);
            --this.eDQ;
            if (this.eDQ == 0) {
                this.aPT();
            }
            return;
        }
        if (kcs2.peq instanceof gxp) {
            Object object;
            cjp cjp2 = this.eDM.remove(((gxp)kcs2.peq).aVk());
            if (cjp2 == null) {
                assert (false);
                return;
            }
            String string = cjp2.eEa;
            int n = cjp2.eEb;
            List<cjt> list = cjp2.eEc;
            ArrayList<cte> arrayList = lcn.abH(list.size());
            for (cjt object2 : list) {
                object = new cte();
                ((cte)object).fex = false;
                ((cte)object).asi = object2.ayN;
                ((cte)object).ResourceType = object2.ResourceType;
                this.ala.a(((cte)object).ResourceType, ((cte)object).asi, ((cte)object).fex, arrayList);
            }
            if (!arrayList.isEmpty()) {
                cte[] cteArray = new cte[arrayList.size()];
                arrayList.toArray(cteArray);
                ldv ldv2 = this.hF.jf().getGUID();
                object = (fcy)this.MessageDelegator.h(9229, this.getGUID(), this.MessageDelegator.getGUID());
                ((fcy)object).dul = 8;
                ((fcy)object).bst = bkd.dqO;
                ((fcy)object).aZG = this.hF.getGUID();
                ((fcy)object).akX = ldv2;
                ((fcy)object).dtP = cteArray;
                ((fcy)object).iJG = true;
                ((fcy)object).iyH = string != null && !string.isEmpty();
                ((fcy)object).eEa = string;
                ((fcy)object).eEb = n;
                ((fcy)object).hsP = true;
                ((fcy)object).b(bqy.dFX);
                this.MessageDelegator.F((dxq)object);
            }
            if (this.eDM.isEmpty()) {
                this.hF.c(mce.usW.bD(new Object[0]));
            }
            return;
        }
    }

    private boolean aPU() {
        if (this.isCompleted() && this.eDM.isEmpty()) {
            return false;
        }
        if (this.eDP == null) {
            lfn.b(5, TC, "isTrainerStateValid() There is no active task. Trainer should be disabled.");
            return false;
        }
        return true;
    }

    private void l(int n, int n2, int n3) {
        gxu gxu2 = (gxu)this.MessageDelegator.h(29185, this.getGUID(), this.eDO);
        gxu2.gOd = n;
        gxu2.jtD = n2;
        gxu2.ayN = n3;
        gxu2.hsP = true;
        this.MessageDelegator.F(gxu2);
    }

    public final boolean isCompleted() {
        return this.aMu;
    }

    public final cjb aPV() {
        return this.eDP;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.ala = null;
        this.eDO = null;
        this.eDP = null;
    }

    private boolean aPW() {
        if (this.hF.jf() == null) {
            return false;
        }
        if (this.hF.jf().aAG() == null) {
            return false;
        }
        ljq ljq2 = this.hF.jf().aAG().azb();
        boolean bl = ly.Z(ljq2);
        if (!bl) {
            this.aMu = true;
            this.l(2, -1, -1);
            return true;
        }
        return false;
    }

    private void a(gxq gxq2) {
        Object object;
        cjp cjp2 = this.eDM.remove(gxq2.aVk());
        if (cjp2 == null) {
            assert (false);
            return;
        }
        String string = gxq2.bYp().compareToIgnoreCase(cjp2.eEa.replace(" ", "_")) == 0 ? cjp2.eEa : gxq2.bYp();
        int n = cjp2.eEb;
        List<cjt> list = cjp2.eEc;
        ArrayList<cte> arrayList = lcn.abH(list.size());
        for (cjt object2 : list) {
            object = new cte();
            ((cte)object).fex = false;
            ((cte)object).asi = object2.ResourceType == cug.fkb && lcw.bcB == 2 ? object2.ayN * 4 : object2.ayN;
            ((cte)object).ResourceType = object2.ResourceType;
            this.ala.a(((cte)object).ResourceType, ((cte)object).asi, ((cte)object).fex, arrayList);
        }
        if (!arrayList.isEmpty()) {
            cte[] cteArray = new cte[arrayList.size()];
            arrayList.toArray(cteArray);
            ldv ldv2 = this.hF.jf().getGUID();
            object = (fcy)this.MessageDelegator.h(9229, this.getGUID(), this.MessageDelegator.getGUID());
            ((fcy)object).dul = 8;
            ((fcy)object).bst = bkd.dqO;
            ((fcy)object).aZG = this.hF.getGUID();
            ((fcy)object).akX = ldv2;
            ((fcy)object).dtP = cteArray;
            ((fcy)object).iJG = true;
            ((fcy)object).iyH = string != null && !string.isEmpty();
            ((fcy)object).eEa = string;
            ((fcy)object).eEb = n;
            ((fcy)object).hsP = true;
            ((fcy)object).b(bqy.dFX);
            this.MessageDelegator.F((dxq)object);
        }
        if (this.eDM.isEmpty()) {
            this.hF.c(mce.usW.bD(new Object[0]));
        }
    }

    public void a(acg acg2) {
        if (acg2 == null) {
            return;
        }
        if (this.eDR == null) {
            this.eDR = lcn.emx();
        }
        this.eDR.add(acg2);
    }

    private void aPX() {
        if (this.eDR == null) {
            return;
        }
        if (this.eDP == null) {
            return;
        }
        for (acg acg2 : new HashSet<acg>(this.eDR)) {
            acg2.em(this.eDP.getIndex());
        }
    }

    public void b(acg acg2) {
        if (acg2 == null) {
            return;
        }
        if (this.eDR == null) {
            return;
        }
        this.eDR.remove(acg2);
        if (this.eDR.isEmpty()) {
            this.eDR = null;
        }
    }
}

