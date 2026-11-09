/*
 * Decompiled with CFR.
 */
import java.util.List;

public class yx
extends btk
implements bto {
    private float bbQ = 1.0f;
    private List<b> bbR = lcn.emv();
    private a bbS = null;

    public void cr(String string) {
        b b2 = new b(this, null);
        b2.FileName = string;
        b2.bbT = this.MessageDelegator.bzv();
        this.bbR.add(b2);
    }

    public void xg() {
        for (b b2 : this.bbR) {
            if (b2.aME) {
                this.cA(b2.bbT);
            }
            this.MessageDelegator.oa(b2.bbT);
        }
        if (this.bbR.size() > 0 && this.bbS != null) {
            this.bbS.wz();
        }
        this.bbR.clear();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.bbR.size() == 0) {
            return;
        }
        b b2 = this.bbR.get(0);
        if (!b2.aME) {
            b2.aME = true;
            ksh ksh2 = (ksh)this.MessageDelegator.j(29);
            ksh2.xc("");
            ksh2.hC(b2.bbT);
            ksh2.ts(this.GUID);
            ksh2.xg(b2.FileName);
            ksh2.setLooping(false);
            ksh2.mP(this.bbQ);
            ksh2.hs(0.05f);
            this.MessageDelegator.a(ksh2);
        } else if (b2.aAh > ldz2.rgz) {
            this.cA(b2.bbT);
            this.MessageDelegator.oa(b2.bbT);
            this.bbR.remove(0);
            if (this.bbR.size() == 0 && this.bbS != null) {
                this.bbS.wz();
            }
        }
    }

    private void cA(ldv ldv2) {
        kig kig2 = (kig)this.MessageDelegator.h(1287);
        kig2.ts(this.GUID);
        kig2.tB(ldv2);
        kig2.XO(1);
        this.MessageDelegator.a(kig2);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 6) {
            this.a((ksx)ktf2);
        } else {
            super.receiveResourceResponse(ktf2);
        }
    }

    protected void a(ksx ksx2) {
        if (this.bbR.size() == 0 || !this.bbR.get((int)0).bbT.equals(ksx2.oq())) {
            assert (false);
            return;
        }
        b b2 = this.bbR.get(0);
        if (ksx2.getResult() != 0) {
            lfn.b(5, "SFQuestVoiceManager", "handleResourceAudioAssembleResponse() failed to find quaest voice " + b2.FileName);
            this.MessageDelegator.oa(b2.bbT);
            this.bbR.remove(0);
            if (this.bbR.size() == 0 && this.bbS != null) {
                this.bbS.wz();
            }
            return;
        }
        b2.aAh = this.MessageDelegator.arc().rgz + (double)(ksx2.egL() / 1000);
        if (this.bbS != null) {
            this.bbS.wA();
        }
    }

    public float xh() {
        return this.bbQ;
    }

    public void V(float f2) {
        this.bbQ = f2;
    }

    public a xi() {
        return this.bbS;
    }

    public void a(a a2) {
        this.bbS = a2;
    }
}

