/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  lqf
 */
import java.util.Map;

public class kn
extends jk {
    private static final String TC = "SFConsoleCommandHandlerBoosters";
    private Map<Integer, jj> aqr = lcn.emw();
    private int aqs = 0;

    @Override
    public void nU() {
        this.a(a.aqu.toString().toLowerCase(), true, hc.aaP, lqf.rYI, mhs.STRING);
        this.a(a.aqv.toString().toLowerCase(), hc.aaP, lqf.rYJ, mhs.STRING);
        this.a(a.aqy.toString().toLowerCase(), hc.aaP, lqf.rYK);
        if (!lcw.aQH()) {
            this.a(a.aqw.toString().toLowerCase(), hc.aaP, lqf.rYM, mhs.STRING, mhs.STRING, mhs.STRING);
        } else {
            this.a(a.aqx.toString().toLowerCase(), hc.aaP, lqf.rYL, mhs.STRING);
        }
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bz(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aqu: {
                this.bd(jj2);
                break;
            }
            case aqv: {
                this.be(jj2);
                break;
            }
            case aqw: {
                this.bg(jj2);
                break;
            }
            case aqx: {
                this.bf(jj2);
                break;
            }
            case aqy: {
                this.bh(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bz(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void bd(jj jj2) {
        String string;
        if (!this.b(jj2)) {
            return;
        }
        ggj ggj2 = (ggj)this.MessageDelegator.h(30981, this.getGUID(), this.aQ().getGUID());
        String string2 = string = jj2.getArgCount() == 0 || jj2.cA(0) == null ? null : ((mhr)jj2.cA((int)0)).Value;
        if (string != null) {
            ckn ckn2 = lea.epw();
            ckk ckk2 = ckn2.hz(string);
            if (ckk2 == null) {
                jj2.b(lqi.scV.bD(string), false);
                return;
            }
            ggj2.aGg = ckk2.getID();
        }
        ggj2.sk(this.aqs);
        this.MessageDelegator.F(ggj2);
        this.aqr.put(this.aqs, jj2);
        ++this.aqs;
    }

    private void be(jj jj2) {
        Object object;
        if (!this.b(jj2)) {
            return;
        }
        int n = -1;
        int n2 = -1;
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string != null && !string.isEmpty()) {
            object = lea.epw().hz(string);
            if (object == null) {
                jj2.b(lqi.scV.bD(string), false);
                return;
            }
            n = ((ckk)object).aQS().ordinal();
            n2 = ((ckk)object).getIndex();
        }
        if (n == -1 || n2 == -1) {
            jj2.b(lqi.scV.bD(string), false);
            return;
        }
        object = (ggl)this.MessageDelegator.h(30979, this.getGUID(), this.aQ().getGUID());
        ((ggl)object).Jn(n);
        ((ggr)object).sk(this.aqs);
        ((ggl)object).Jo(n2);
        this.MessageDelegator.F((dxq)object);
        this.aqr.put(this.aqs, jj2);
        ++this.aqs;
    }

    private void bf(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        String[] stringArray = string.split(";");
        if (stringArray == null || stringArray.length == 0) {
            jj2.b(lqi.scV.bD(string), false);
            return;
        }
        int[] nArray = new int[stringArray.length];
        int n = 0;
        for (String string2 : stringArray) {
            ckk ckk2 = lea.epw().hz(string2);
            if (ckk2 == null) {
                jj2.b(lqi.scV.bD(string2), false);
                return;
            }
            nArray[n] = ckk2.getID();
            ++n;
        }
        ggg ggg2 = (ggg)this.MessageDelegator.h(30985, this.getGUID(), this.aQ().getGUID());
        ggg2.as(nArray);
        ggg2.lW(true);
        ggg2.sk(this.aqs);
        this.MessageDelegator.F(ggg2);
        this.aqr.put(this.aqs, jj2);
        ++this.aqs;
    }

    private void bg(jj jj2) {
        Object object;
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        String string3 = ((mhr)jj2.cA((int)2)).Value;
        cjx cjx2 = lea.epx().hu(string);
        if (cjx2 == null) {
            jj2.b(lqi.scV.bD(string), false);
            return;
        }
        cke cke2 = cke.getValueByName(string2);
        if (cke2 == null) {
            jj2.b(lqi.scV.bD(string2), false);
            return;
        }
        ckd ckd2 = cjx2.qQ(cke2.aOK());
        if (ckd2 == null) {
            jj2.b(lqi.scV.bD(string2), false);
            return;
        }
        int n = -1;
        int n2 = -1;
        if (string3 != null && !string3.isEmpty()) {
            object = lea.epw().aRd().get(string3);
            if (object == null) {
                jj2.b(lqi.scV.bD(string3), false);
                return;
            }
            n = ((ckk)object).aQS().ordinal();
            n2 = ((ckk)object).getIndex();
        }
        object = (ggp)this.MessageDelegator.h(30977, this.getGUID(), this.aQ().getGUID());
        ((ggp)object).rc(cjx2.getIndex());
        ((ggp)object).Jr(ckd2.getIndex());
        ((ggp)object).Jn(n);
        ((ggp)object).Jo(n2);
        ((ggr)object).sk(this.aqs);
        this.MessageDelegator.F((dxq)object);
        this.aqr.put(this.aqs, jj2);
        ++this.aqs;
    }

    private void bh(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ggh ggh2 = (ggh)this.MessageDelegator.h(30986, this.getGUID(), this.aQ().getGUID());
        this.MessageDelegator.E(ggh2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 30982: {
                this.a((ggk)dxq2);
                break;
            }
            case 30980: {
                this.a((ggm)dxq2);
                break;
            }
            case 30978: {
                this.a((ggq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ggk ggk2) {
        jj jj2 = this.aqr.remove(ggk2.aVk());
        if (jj2 == null) {
            assert (false) : "There is no command with Tag : " + ggk2.aVk();
            return;
        }
        int[] nArray = ggk2.jgv;
        boolean[] blArray = ggk2.jgH;
        StringBuffer stringBuffer = new StringBuffer();
        if (nArray != null && blArray != null && blArray.length == nArray.length) {
            for (int i = 0; i < nArray.length; ++i) {
                int n = nArray[i];
                ckk ckk2 = lea.epw().ro(n);
                if (ckk2 == null) continue;
                loz loz2 = lqi.sdb.bD(ckk2.getDisplayName(), String.valueOf(blArray[i]));
                String string = loz2.exA();
                stringBuffer.append(string + " ");
            }
        }
        jj2.b(lqi.sdc.bD(stringBuffer.toString()), false);
    }

    private void a(ggm ggm2) {
        jj jj2 = this.aqr.remove(ggm2.aVk());
        if (jj2 == null) {
            assert (false) : "There is no command with Tag : " + ggm2.aVk();
            return;
        }
        int n = ggm2.getResult();
        switch (n) {
            case 5: {
                jj2.b(lqi.scS.bD(new Object[0]), true);
                break;
            }
            case 2: {
                jj2.b(lqi.scP.bD(new Object[0]), true);
                break;
            }
            case 1: {
                jj2.b(lqi.scO.bD(new Object[0]), false);
                break;
            }
            case 0: {
                jj2.b(lqi.scN.bD(new Object[0]), false);
                break;
            }
            case 4: {
                jj2.b(lqi.scR.bD(new Object[0]), false);
                break;
            }
            case 3: {
                jj2.b(lqi.scQ.bD(new Object[0]), false);
                break;
            }
            default: {
                jj2.b(lqi.sdd.bD(new Object[0]), false);
                assert (false) : "Unknown Result : " + n;
                break;
            }
        }
    }

    private void a(ggq ggq2) {
        jj jj2 = this.aqr.remove(ggq2.aVk());
        if (jj2 == null) {
            assert (false) : "There is no command with Tag : " + ggq2.aVk();
            return;
        }
        int n = ggq2.bUS();
        switch (n) {
            case 6: {
                jj2.b(lqi.scZ.bD(new Object[0]), false);
                break;
            }
            case 7: {
                jj2.b(lqi.sda.bD(new Object[0]), false);
                break;
            }
            case 2: {
                jj2.b(lqi.scV.bD(new Object[0]), false);
                break;
            }
            case 5: {
                jj2.b(lqi.scY.bD(new Object[0]), false);
                break;
            }
            case 4: {
                jj2.b(lqi.scX.bD(new Object[0]), false);
                break;
            }
            case 0: {
                jj2.b(lqi.scT.bD(new Object[0]), false);
                break;
            }
            case 1: {
                jj2.b(lqi.scU.bD(new Object[0]), false);
                break;
            }
            case 3: {
                jj2.b(lqi.scW.bD(new Object[0]), false);
            }
        }
    }
}

