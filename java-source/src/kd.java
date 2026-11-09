/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lqf
 */
public class kd
extends jk {
    @Override
    public void nU() {
        this.a(a.anA.toString().toLowerCase(), hc.aaP, lqf.rZa, mhs.STRING, mhs.STRING);
        this.a(a.anB.toString().toLowerCase(), hc.aaP, lqf.rZb, mhs.STRING);
        this.a(a.anC.toString().toLowerCase(), hc.aaP, lqf.rZc, mhs.STRING);
        this.a(a.anD.toString().toLowerCase(), hc.aaP, lqf.rZd, mhs.FLOAT);
        this.a(a.anE.toString().toLowerCase(), hc.aaP, lqf.rZe);
        this.a(a.anF.toString().toLowerCase(), hc.aaQ, lqf.rZf, mhs.STRING, mhs.STRING);
        this.a(a.anG.toString().toLowerCase(), hc.aaV, lqf.rZg, mhs.STRING, mhs.STRING, mhs.STRING);
        this.a(a.anH.toString().toLowerCase(), hc.aaV, lqf.rZh, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bp(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case anA: {
                this.X(jj2);
                break;
            }
            case anF: {
                this.W(jj2);
                break;
            }
            case anB: {
                this.a(jj2, 4);
                break;
            }
            case anC: {
                this.a(jj2, 5);
                break;
            }
            case anD: {
                this.Y(jj2);
                break;
            }
            case anE: {
                this.Z(jj2);
                break;
            }
            case anH: {
                this.af(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bp(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void W(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            return;
        }
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "setAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        ej ej2 = null;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl = Boolean.parseBoolean(string2);
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl);
                ej2 = eq2;
                break;
            }
            case 2: {
                float f = 0.0f;
                try {
                    f = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "setAttribute() " + numberFormatException);
                    return;
                }
                eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
                eam2.ikF = 2;
                eam2.bnM = n;
                eam2.ikG = f;
                this.MessageDelegator.E(eam2);
                jj2.nT();
                return;
            }
            case 3: {
                int n3 = 0;
                try {
                    n3 = Integer.parseInt(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "setAttribute() " + numberFormatException);
                    return;
                }
                ew ew2 = new ew();
                ew2.setType(n);
                ew2.bi(n3);
                ej2 = ew2;
                break;
            }
            case 7: {
                String string3 = string2;
                ff ff2 = new ff();
                ff2.setType(n);
                ff2.av(string3);
                ej2 = ff2;
                break;
            }
            default: {
                lfn.b(5, "SFChatProxyForAttribute", "setAttribute() Invalid datatype provided: " + n2);
                return;
            }
        }
        eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
        eap2.bhp = ej2;
        this.MessageDelegator.E(eap2);
        jj2.nT();
    }

    private void X(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "addAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            return;
        }
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        ej ej2 = null;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl = Boolean.parseBoolean(string2);
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl);
                ej2 = eq2;
                break;
            }
            case 2: {
                float f = 0.0f;
                try {
                    f = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "addAttribute() " + numberFormatException);
                    return;
                }
                eah eah2 = (eah)this.MessageDelegator.h(10753, this.GUID, ldv2);
                eah2.bnM = n;
                eah2.AttributeValue = f;
                this.MessageDelegator.E(eah2);
                return;
            }
            case 7: {
                ff ff2 = new ff();
                ff2.setType(n);
                ff2.av(string2);
                ej2 = ff2;
                break;
            }
            default: {
                lfn.b(5, "SFChatProxyForAttribute", "addAttribute() Invalid datatype provided: " + n2);
                return;
            }
        }
        eai eai2 = (eai)this.MessageDelegator.h(10754, this.GUID, ldv2);
        eai2.bhp = ej2;
        this.MessageDelegator.E(eai2);
        jj2.nT();
    }

    private void a(jj jj2, int n) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n2 = ep.as((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "setAttributeToMax() AttributeName '" + string + "' is invalid.");
            return;
        }
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = n;
        eam2.bnM = n2;
        this.MessageDelegator.E(eam2);
        jj2.nT();
    }

    private void Y(jj jj2) {
        float f = ((mhn)jj2.cA((int)0)).Pz;
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 352;
        eam2.ikG = f;
        this.MessageDelegator.E(eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 384;
        eam2.ikG = f;
        this.MessageDelegator.E(eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 400;
        eam2.ikG = f;
        this.MessageDelegator.E(eam2);
        jj2.nT();
    }

    private void Z(jj jj2) {
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = 352;
        this.MessageDelegator.E(eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = 384;
        this.MessageDelegator.E(eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = 400;
        this.MessageDelegator.E(eam2);
        jj2.nT();
    }

    private void aa(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = ep.as((String)string);
        if (n <= 0) {
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), this.nW().getGUID());
        ern2.ilu = 16;
        ern2.YL = ((mhr)jj2.cA((int)2)).Value.trim();
        ern2.izF = string;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl;
                ern2.izI = bl = Boolean.parseBoolean(string2);
                break;
            }
            case 2: {
                float f = 0.0f;
                try {
                    f = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    return;
                }
                ern2.izH = f;
                break;
            }
            case 3: {
                int n3 = 0;
                try {
                    n3 = Integer.parseInt(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    return;
                }
                ern2.izG = n3;
                break;
            }
            default: {
                return;
            }
        }
        this.MessageDelegator.E(ern2);
        jj2.nT();
    }

    private void af(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = ep.as((String)string);
        if (n <= 0) {
            return;
        }
        ean ean2 = (ean)this.MessageDelegator.h(10756, this.GUID, this.nW().getGUID());
        ean2.bnM = n;
        this.d(this.nW().getGUID(), ean2);
    }
}

