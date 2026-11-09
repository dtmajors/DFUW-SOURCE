/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class cjd
extends btk {
    private ha hF = null;
    private ldv dYb = null;
    private int eDL = 0;
    private Map<Integer, cjp> eDM = lcn.emw();
    private cul ala = new cul();

    public cjd(ha ha2, ldv ldv2) {
        this.hF = ha2;
        this.dYb = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.hF.ki() != null) {
            List<cjp> list = lea.epr().qO(this.hF.ki().getIndex());
            for (cjp cjp2 : list) {
                if (cjp2.eEa != null && !cjp2.eEa.isEmpty()) {
                    this.hs(cjp2.eEa);
                    this.eDM.put(this.eDL, cjp2);
                    ++this.eDL;
                    continue;
                }
                this.a(cjp2);
            }
        }
        if (this.eDM.isEmpty()) {
            this.hF.c(mce.usW.bD(new Object[0]));
            this.MessageDelegator.hd(this.GUID);
        }
    }

    @Override
    public void cleanUp() {
        this.hF = null;
        this.dYb = null;
        this.ala = null;
        this.eDM = null;
        super.cleanUp();
    }

    private void a(cjp cjp2) {
        ArrayList<cte> arrayList = lcn.abH(cjp2.eEc.size());
        for (cjt cjt2 : cjp2.eEc) {
            cte cte2 = new cte();
            cte2.fex = false;
            cte2.asi = cjt2.ayN * (cjt2.ResourceType == cug.fkb && lcw.bcB == 2 ? 4 : 1);
            cte2.ResourceType = cjt2.ResourceType;
            this.ala.a(cte2.ResourceType, cte2.asi, cte2.fex, arrayList);
        }
        if (!arrayList.isEmpty()) {
            this.a(cjp2, arrayList.toArray(new cte[arrayList.size()]));
        }
    }

    private void hs(String string) {
        gxp gxp2 = (gxp)this.MessageDelegator.h(29187, this.GUID, this.dYb);
        gxp2.sk(this.eDL);
        gxp2.ll(string.replace(" ", "_").toLowerCase());
        this.MessageDelegator.F(gxp2);
    }

    private void a(cjp cjp2, cte[] cteArray) {
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.getGUID(), this.MessageDelegator.getGUID());
        fcy2.dul = 8;
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.hF.getGUID();
        fcy2.akX = this.hF.jf().getGUID();
        fcy2.dtP = cteArray;
        fcy2.iJG = true;
        fcy2.iyH = cjp2.eEa != null && !cjp2.eEa.isEmpty();
        fcy2.eEa = cjp2.eEa;
        fcy2.eEb = cjp2.eEb;
        fcy2.hsP = true;
        fcy2.b(bqy.dFX);
        this.MessageDelegator.F(fcy2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 29188: {
                this.a((gxq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fcs fcs2) {
        if (!fcs2.iJq) {
            lfn.b(5, this.getClass().getSimpleName(), "handleFunctionCompletionResultMessage() :: Player : " + this.hF.iU() + " didn't get any starting equipment!");
            assert (false);
        }
    }

    private void a(gxq gxq2) {
        cjp cjp2 = this.eDM.remove(gxq2.aVk());
        if (cjp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTrainerContainerNameResponseMessage() :: No Container Found !!!");
            assert (false);
            return;
        }
        this.a(cjp2);
        if (this.eDM.isEmpty()) {
            this.hF.c(mce.usW.bD(new Object[0]));
            this.MessageDelegator.hd(this.GUID);
        }
    }
}

