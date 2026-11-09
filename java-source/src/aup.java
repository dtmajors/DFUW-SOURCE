/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  cxd
 *  ep
 *  lcr
 */
public class aup
extends aul {
    private boolean Initialized = false;
    private ldv cea = null;
    private ldv cdD = null;

    public aup() {
        super(new amd(aup.class, aul.cdc, "ChatProxyForAttribute", new cqi[0], null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            case 2305: {
                dxq2.on(lcr.qCM);
                this.MessageDelegator.E(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.cdD == null) {
            return;
        }
        a[] aArray = (a[])a.class.getEnumConstants();
        a a2 = aArray[n];
        switch (a2) {
            case cec: {
                this.m(objectArray);
                break;
            }
            case ced: {
                this.n(objectArray);
                break;
            }
            case cee: {
                this.o(objectArray);
                break;
            }
            case cef: {
                this.p(objectArray);
                break;
            }
            case ceg: {
                this.r(objectArray);
                break;
            }
            case ceh: {
                this.t(objectArray);
                break;
            }
            case cem: {
                this.s(objectArray);
                break;
            }
            case cei: {
                this.u(objectArray);
                break;
            }
            case cej: {
                this.v(objectArray);
                break;
            }
            case cek: {
                this.x(objectArray);
                break;
            }
            case cel: {
                this.y(objectArray);
                break;
            }
            case cen: {
                this.q(objectArray);
                break;
            }
            case ceo: {
                this.w(objectArray);
                break;
            }
            case cep: {
                this.a(objectArray, false);
                break;
            }
            case ceq: {
                this.a(objectArray, true);
                break;
            }
            case cer: {
                this.b(objectArray, false);
                break;
            }
            case ces: {
                this.b(objectArray, true);
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaQ, a.ceh, new ljk("sets the value of the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("attribute_value", egg.a.ipq, false, new ljk("the value of the attribute"))});
        this.a(hc.aaV, a.cem, new ljk("sets the value of the specified attribute for a player"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("attribute_value", egg.a.ipq, false, new ljk("the value of the attribute")), new egg("player_name", egg.a.ipr, false, new ljk("name of a player"))});
        this.a(hc.aaP, a.cec, new ljk("adds the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("attribute_value", egg.a.ipq, false, new ljk("the value of the attribute")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.ced, new ljk("adds an attributeblockingmodifier with full blocking to the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cee, new ljk("prints the effective value of the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute"))});
        this.a(hc.aaP, a.cef, new ljk("prints the value of the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.ceg, new ljk("removes the attributeblockingmodifier with full blocking from the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cei, new ljk("sets the value of the specified attribute to its max value"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cej, new ljk("sets the value of the specified attribute to its min value"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cek, new ljk("sets the value of all the vitalstats attributes"), new egg[]{new egg("attribute_value", egg.a.ipp, false, new ljk("the common value of the vitalstats attributes")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cel, new ljk("sets the value of all the vitalstats attributes to their max value"), new egg[]{new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cen, new ljk("prints the value of the specified attribute for a specified item"), new egg[]{new egg("item_guid", egg.a.ipq, false, new ljk("the guid of the item")), new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute"))});
        this.a(hc.aaP, a.ceo, new ljk("sets the value of the specified attribute for a specified item"), new egg[]{new egg("item_guid", egg.a.ipq, false, new ljk("the guid of the item")), new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("attribute_value", egg.a.ipq, false, new ljk("the value of the attribute"))});
        this.a(hc.aaP, a.cep, new ljk("adds a fixed modifier to the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("duration", egg.a.ipp, false, new ljk("the duration of the modifier")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.ceq, new ljk("adds a fixed modifier to the specified attribute which is converted into a permanent modification on timeout"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("duration", egg.a.ipp, false, new ljk("the duration of the modifier")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.cer, new ljk("adds a tickable modifier to the specified attribute"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("duration", egg.a.ipp, false, new ljk("the duration of the modifier")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
        this.a(hc.aaP, a.ces, new ljk("adds a tickable modifier to the specified attribute which is converted into a permanent modification on timeout"), new egg[]{new egg("attribute_name", egg.a.ipq, false, new ljk("the name of the attribute")), new egg("duration", egg.a.ipp, false, new ljk("the duration of the modifier")), new egg("send_to_self", egg.a.ipm, true, new ljk("send message to myself or to targeted object"))});
    }

    private ldv eb(String string) {
        ldv ldv2 = ldv.zq(string);
        if (ldv2 == null) {
            lfn.b(5, "SFChatProxyForAttribute", "getItemGUID() Invalid GUIDString provided: '" + string + "'");
            return null;
        }
        if (ldv2.ib() == this.GUID.ib()) {
            return lcr.ak((ldv)ldv2, (int)this.cdD.ib());
        }
        return ldv2;
    }

    private ldv cd(boolean bl) {
        if (bl) {
            return this.cdD;
        }
        bun bun2 = (bun)this.MessageDelegator.bzx().bzt().d(lcr.qBP);
        ldv ldv2 = bun2.axO();
        if (ldv2 == null) {
            return null;
        }
        return lcr.ak((ldv)ldv2, (int)this.cdD.ib());
    }

    private void a(egk egk2) {
        if (egk2.cdD == null) {
            lfn.b(5, "SFChatProxyForAttribute", "handleChatGUIDInfoMessage() PlayerObjectServerGUID is null.");
            return;
        }
        this.cea = lcr.ak((ldv)egk2.cdD, (int)this.GUID.ib());
        this.cdD = egk2.cdD;
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void m(Object[] objectArray) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "addAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        boolean bl = true;
        if (objectArray.length == 3) {
            bl = ((lch)objectArray[2]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        ej ej2 = null;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl2 = Boolean.parseBoolean((String)objectArray[1]);
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl2);
                ej2 = eq2;
                break;
            }
            case 2: {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat((String)objectArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "addAttribute() " + numberFormatException);
                    return;
                }
                eah eah2 = (eah)this.MessageDelegator.h(10753, this.GUID, ldv2);
                eah2.bnM = n;
                eah2.AttributeValue = f2;
                this.d(this.cdD, eah2);
                return;
            }
            case 7: {
                String string2 = (String)objectArray[1];
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
        this.d(this.cdD, eai2);
    }

    private void a(Object[] objectArray, boolean bl) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "addFixedModifier() AttributeName '" + string + "' is invalid.");
            return;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFChatProxyForAttribute", "addFixedModifier() Attribute '" + string + "' is not a floatattribute.");
            return;
        }
        if (!ep.aR((int)n)) {
            lfn.b(5, "SFChatProxyForAttribute", "addFixedModifier() Attribute '" + string + "' has no related types.");
            return;
        }
        float f2 = ((ldq)objectArray[1]).floatValue();
        if (f2 <= 0.0f) {
            lfn.b(5, "SFChatProxyForAttribute", "addFixedModifier() Duration is invalid.");
            return;
        }
        boolean bl2 = true;
        if (objectArray.length == 3) {
            bl2 = ((lch)objectArray[2]).booleanValue();
        }
        if ((ldv2 = this.cd(bl2)) == null) {
            return;
        }
        float f3 = 15.0f;
        int n2 = bfk.dgt;
        als als2 = new als();
        als2.setGUID(this.cdD);
        als2.x(f2);
        als2.ga(1);
        als2.gb(0);
        als2.gc(0);
        als2.cP(this.cdD);
        als2.ge(cxd.fIa);
        als2.fJ(n2);
        als2.gf(1);
        als2.fC(n);
        als2.gc(0);
        als2.ar(0.0f);
        als2.aq(f3);
        als2.as(f3);
        if (bl) {
            als2.gb(1);
        }
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, ldv2);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{als2};
        this.d(this.cdD, frg2);
    }

    private void n(Object[] objectArray) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "addFullBlockingForAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFChatProxyForAttribute", "addFullBlockingForAttribute() Attribute '" + string + "' is not a floatattribute.");
            return;
        }
        if (!ep.aR((int)n)) {
            lfn.b(5, "SFChatProxyForAttribute", "addFullBlockingForAttribute() Attribute '" + string + "' has no related types.");
            return;
        }
        boolean bl = true;
        if (objectArray.length == 2) {
            bl = ((lch)objectArray[1]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        alp alp2 = new alp();
        alp2.setGUID(this.cdD);
        alp2.x(120.0);
        alp2.ga(1);
        alp2.fC(n);
        alp2.gc(0);
        alp2.cP(this.cdD);
        alp2.gd(cug.fhT);
        alp2.ge(0);
        alp2.fJ(bfk.dgO);
        alp2.gf(1);
        alp2.a(ep.a.Pe);
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, ldv2);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{alp2};
        this.d(this.cdD, frg2);
    }

    private void b(Object[] objectArray, boolean bl) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "addTickableModifier() AttributeName '" + string + "' is invalid.");
            return;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFChatProxyForAttribute", "addTickableModifier() Attribute '" + string + "' is not a floatattribute.");
            return;
        }
        if (!ep.aR((int)n)) {
            lfn.b(5, "SFChatProxyForAttribute", "addTickableModifier() Attribute '" + string + "' has no related types.");
            return;
        }
        float f2 = ((ldq)objectArray[1]).floatValue();
        if (f2 <= 0.0f) {
            lfn.b(5, "SFChatProxyForAttribute", "addTickableModifier() Duration is invalid.");
            return;
        }
        boolean bl2 = true;
        if (objectArray.length == 3) {
            bl2 = ((lch)objectArray[2]).booleanValue();
        }
        if ((ldv2 = this.cd(bl2)) == null) {
            return;
        }
        float f3 = 15.0f;
        int n2 = bfk.dgt;
        int n3 = (int)f2 * 1;
        float f4 = f3 / (float)n3;
        als als2 = new als();
        als2.setGUID(this.cdD);
        als2.x(f2);
        als2.ga(1);
        als2.gb(4);
        als2.gc(0);
        als2.cP(this.cdD);
        als2.ge(cxd.fIa);
        als2.fJ(n2);
        als2.gf(1);
        als2.fC(n);
        als2.gc(n3);
        als2.ar(f4);
        als2.aq(0.0f);
        als2.as(f3);
        if (bl) {
            als2.gb(als2.DX() | 1);
        }
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, ldv2);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{als2};
        this.d(this.cdD, frg2);
    }

    private void o(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "printAttributeEffectiveValue() AttributeName '" + string + "' is invalid.");
            return;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFChatProxyForAttribute", "printAttributeEffectiveValue() Attribute '" + string + "' is not a floatattribute.");
            return;
        }
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(this.cea);
        if (cew2 == null) {
            lfn.b(5, "SFChatProxyForAttribute", "printAttributeEffectiveValue() PlayerObject " + this.cea + " was not found.");
            return;
        }
        float f2 = 0.0f;
        switch (n) {
            case 720: 
            case 736: 
            case 752: {
                et et2 = cew2.oX(n);
                if (et2 == null) break;
                f2 = et2.fN();
                break;
            }
            default: {
                if (ep.bc((int)n).Ee) {
                    et et3 = cew2.oY(n);
                    if (et3 == null) break;
                    f2 = et3.fN();
                    break;
                }
                et et4 = cew2.fi().ah(n);
                if (et4 == null) break;
                f2 = et4.fN();
            }
        }
        this.h(lzy.tZo.bD(n, this.cea.toString(), Float.valueOf(f2)));
    }

    private void p(Object[] objectArray) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "printAttributeValue() AttributeName '" + string + "' is invalid.");
            return;
        }
        boolean bl = true;
        if (objectArray.length == 2) {
            bl = ((lch)objectArray[1]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        ean ean2 = (ean)this.MessageDelegator.h(10756, this.GUID, ldv2);
        ean2.bnM = n;
        this.d(this.cdD, ean2);
    }

    private void q(Object[] objectArray) {
        ldv ldv2 = this.eb((String)objectArray[0]);
        if (ldv2 == null) {
            return;
        }
        String string = (String)objectArray[1];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "printItemAttributeValue() AttributeName '" + string + "' is invalid.");
            return;
        }
        ean ean2 = (ean)this.MessageDelegator.h(10756, this.GUID, ldv2);
        ean2.bnM = n;
        this.d(this.cdD, ean2);
    }

    private void r(Object[] objectArray) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "removeFullBlockingForAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFChatProxyForAttribute", "removeFullBlockingForAttribute() Attribute '" + string + "' is not a floatattribute.");
            return;
        }
        if (!ep.aR((int)n)) {
            lfn.b(5, "SFChatProxyForAttribute", "removeFullBlockingForAttribute() Attribute '" + string + "' has no related types.");
            return;
        }
        boolean bl = true;
        if (objectArray.length == 2) {
            bl = ((lch)objectArray[1]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        frk frk2 = (frk)this.MessageDelegator.h(5379, this.GUID, ldv2);
        frk2.iUQ = true;
        frk2.dtB = new ldv[]{this.cdD};
        this.d(this.cdD, frk2);
    }

    private void s(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            this.h(lzs.tYj.bD(new Object[0]));
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), this.cdD);
        ern2.ilu = 16;
        ern2.YL = ((String)objectArray[2]).trim();
        ern2.izF = string;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl;
                ern2.izI = bl = Boolean.parseBoolean((String)objectArray[1]);
                break;
            }
            case 2: {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat((String)objectArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    this.h(lzs.tYk.bD(new Object[0]));
                    return;
                }
                ern2.izH = f2;
                break;
            }
            case 3: {
                int n3 = 0;
                try {
                    n3 = Integer.parseInt((String)objectArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    this.h(lzs.tYk.bD(new Object[0]));
                    return;
                }
                ern2.izG = n3;
                break;
            }
            default: {
                this.h(lzs.tYl.bD(new Object[0]));
                return;
            }
        }
        this.MessageDelegator.E(ern2);
    }

    private void t(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "setAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        boolean bl = true;
        ldv ldv2 = this.cd(bl);
        if (ldv2 == null) {
            return;
        }
        ej ej2 = null;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl2 = Boolean.parseBoolean((String)objectArray[1]);
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl2);
                ej2 = eq2;
                break;
            }
            case 2: {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat((String)objectArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "setAttribute() " + numberFormatException);
                    return;
                }
                eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
                eam2.ikF = 2;
                eam2.bnM = n;
                eam2.ikG = f2;
                this.d(this.cdD, eam2);
                return;
            }
            case 3: {
                int n3 = 0;
                try {
                    n3 = Integer.parseInt((String)objectArray[1]);
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
                String string2 = (String)objectArray[1];
                ff ff2 = new ff();
                ff2.setType(n);
                ff2.av(string2);
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
        this.d(this.cdD, eap2);
    }

    private void u(Object[] objectArray) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "setAttributeToMax() AttributeName '" + string + "' is invalid.");
            return;
        }
        boolean bl = true;
        if (objectArray.length == 2) {
            bl = ((lch)objectArray[1]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = n;
        this.d(this.cdD, eam2);
    }

    private void v(Object[] objectArray) {
        ldv ldv2;
        String string = (String)objectArray[0];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "setAttributeToMin() AttributeName '" + string + "' is invalid.");
            return;
        }
        boolean bl = true;
        if (objectArray.length == 2) {
            bl = ((lch)objectArray[1]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 5;
        eam2.bnM = n;
        this.d(this.cdD, eam2);
    }

    private void w(Object[] objectArray) {
        ldv ldv2 = this.eb((String)objectArray[0]);
        if (ldv2 == null) {
            return;
        }
        String string = (String)objectArray[1];
        int n = ep.as((String)string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForAttribute", "setItemAttribute() AttributeName '" + string + "' is invalid.");
            return;
        }
        ej ej2 = null;
        int n2 = ep.aL((int)n);
        switch (n2) {
            case 0: {
                boolean bl = Boolean.parseBoolean((String)objectArray[2]);
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl);
                ej2 = eq2;
                break;
            }
            case 2: {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat((String)objectArray[2]);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "setItemAttribute() " + numberFormatException);
                    return;
                }
                eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
                eam2.ikF = 2;
                eam2.bnM = n;
                eam2.ikG = f2;
                this.d(this.cdD, eam2);
                return;
            }
            case 3: {
                int n3 = 0;
                try {
                    n3 = Integer.parseInt((String)objectArray[2]);
                }
                catch (NumberFormatException numberFormatException) {
                    lfn.b(5, "SFChatProxyForAttribute", "setItemAttribute() " + numberFormatException);
                    return;
                }
                ew ew2 = new ew();
                ew2.setType(n);
                ew2.bi(n3);
                ej2 = ew2;
                break;
            }
            case 7: {
                String string2 = (String)objectArray[2];
                ff ff2 = new ff();
                ff2.setType(n);
                ff2.av(string2);
                ej2 = ff2;
                break;
            }
            default: {
                lfn.b(5, "SFChatProxyForAttribute", "setItemAttribute() Invalid datatype provided: " + n2);
                return;
            }
        }
        eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
        eap2.bhp = ej2;
        this.d(this.cdD, eap2);
    }

    private void x(Object[] objectArray) {
        ldv ldv2;
        float f2 = ((ldq)objectArray[0]).floatValue();
        boolean bl = true;
        if (objectArray.length == 2) {
            bl = ((lch)objectArray[1]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 352;
        eam2.ikG = f2;
        this.d(this.cdD, eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 384;
        eam2.ikG = f2;
        this.d(this.cdD, eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 2;
        eam2.bnM = 400;
        eam2.ikG = f2;
        this.d(this.cdD, eam2);
    }

    private void y(Object[] objectArray) {
        ldv ldv2;
        boolean bl = true;
        if (objectArray.length == 1) {
            bl = ((lch)objectArray[0]).booleanValue();
        }
        if ((ldv2 = this.cd(bl)) == null) {
            return;
        }
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = 352;
        this.d(this.cdD, eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = 384;
        this.d(this.cdD, eam2);
        eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 4;
        eam2.bnM = 400;
        this.d(this.cdD, eam2);
    }
}

