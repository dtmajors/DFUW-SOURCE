/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcr
 *  lqf
 */
public class kb
extends jk {
    @Override
    public void nU() {
        this.a(a.ane.toString().toLowerCase(), hc.aaP, lqf.rYD, mhs.STRING);
        this.a(a.anf.toString().toLowerCase(), hc.aaP, lqf.rYE);
        this.a(a.ang.toString().toLowerCase(), hc.aaP, lqf.rYF, mhs.INTEGER);
        this.a(a.anh.toString().toLowerCase(), hc.aaV, lqf.rYG, mhs.STRING, mhs.STRING);
        this.a(a.ani.toString().toLowerCase(), hc.aaV, lqf.rYH, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bn(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case ane: {
                this.V(jj2);
                break;
            }
            case anf: {
                this.T(jj2);
                break;
            }
            case ang: {
                this.U(jj2);
                break;
            }
            case anh: {
                this.R(jj2);
                break;
            }
            case ani: {
                this.S(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bn(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    protected final dxq e(int n, ldv ldv2) {
        dxq dxq2 = this.MessageDelegator.h(n, this.GUID, ldv2);
        assert (dxq2 != null);
        assert (dxq2.bEz() == 0 || dxq2.bEz() == n);
        return dxq2;
    }

    protected final void a(dxq dxq2) {
        assert (this.Initialized);
        assert (dxq2.aO() == this.GUID);
        assert (dxq2.amk() != null);
        this.MessageDelegator.E(dxq2);
    }

    private ldv oq() {
        bun bun2 = (bun)this.MessageDelegator.bzx().bzt().d(lcr.qBP);
        ldv ldv2 = bun2.axO();
        if (ldv2 == null) {
            return null;
        }
        return ldv2;
    }

    private void R(jj jj2) {
        ldv ldv2 = new ldv(this.getGUID().ib(), lcr.qAb.enw(), lcr.qCm.enx());
        gor gor2 = (gor)this.e(33537, ldv2);
        gor2.gGR = ((mhr)jj2.cA((int)0)).Value;
        gor2.bfX = ((mhr)jj2.cA((int)1)).Value;
        gor2.YN = this.nW().getGUID();
        gor2.jok = true;
        this.a(gor2);
        jj2.nT();
    }

    private void S(jj jj2) {
        ldv ldv2 = new ldv(this.getGUID().ib(), lcr.qAb.enw(), lcr.qCm.enx());
        gor gor2 = (gor)this.e(33537, ldv2);
        gor2.gGR = ((mhr)jj2.cA((int)0)).Value;
        gor2.YN = this.nW().getGUID();
        gor2.jok = false;
        this.a(gor2);
        jj2.nT();
    }

    private void T(jj jj2) {
        dza dza2 = (dza)this.e(13336, this.nW().getGUID());
        this.a(dza2);
        jj2.nT();
    }

    private void U(jj jj2) {
        int n = ((mho)jj2.cA((int)0)).PC;
        dyh dyh2 = (dyh)this.e(13337, this.nW().getGUID());
        dyh2.Db(n);
        this.a(dyh2);
        jj2.nT();
    }

    private void V(jj jj2) {
        ldv ldv2 = jj2.getTargetObjectGUID();
        String string = ((mhr)jj2.cA((int)0)).Value;
        lfn.b(0, "SFConsoleCommandHandlerAI", "***targetObjectGUID:" + ldv2 + " argument:'" + string + "'" + ", PlayerObjectServer:" + this.nW().getGUID());
        dyz dyz2 = (dyz)this.e(13313, this.nW().getGUID());
        dyz2.jT(string);
        this.a(dyz2);
        jj2.nT();
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
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "setAttribute() " + numberFormatException);
                    return;
                }
                eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
                eam2.ikF = 2;
                eam2.bnM = n;
                eam2.ikG = f2;
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
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "addAttribute() " + numberFormatException);
                    return;
                }
                eah eah2 = (eah)this.MessageDelegator.h(10753, this.GUID, ldv2);
                eah2.bnM = n;
                eah2.AttributeValue = f2;
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
        float f2 = ((mhn)jj2.cA((int)0)).Pz;
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 352;
        eam2.ikG = f2;
        this.MessageDelegator.E(eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 384;
        eam2.ikG = f2;
        this.MessageDelegator.E(eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 400;
        eam2.ikG = f2;
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
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    return;
                }
                ern2.izH = f2;
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
}

