/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  lcy
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class aub
extends btk {
    private Map<String, aua> caa = lcn.emG();

    private final List<String> dV(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<String> arrayList = lcn.emv();
        if (string.isEmpty()) {
            return arrayList;
        }
        a a2 = a.cad;
        String string2 = "";
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            char c2 = string.charAt(i);
            a a3 = a.indicatedStateForCharacter(c2);
            a a4 = a.effectiveNewParserState(a2, a3);
            if (a4 != a2) {
                if (!string2.isEmpty() || a.includeEmptyTokens(a2)) {
                    arrayList.add(string2);
                }
                string2 = "";
                a2 = a4;
                continue;
            }
            if (!a.includeCharacter(a2, a3)) continue;
            string2 = string2 + c2;
        }
        if (!string2.isEmpty() || a.includeEmptyTokens(a2)) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2338: {
                this.a((ehi)dxq2);
                break;
            }
            case 2341: {
                this.a((ehh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private final hc VT() {
        if (lcw.enb()) {
            return hc.aaP;
        }
        return lcw.SC;
    }

    private void a(ehi ehi2) {
        aua aua2 = ehi2.ipU;
        if (aua2.SC.ordinal() > this.VT().ordinal()) {
            return;
        }
        if (this.caa.containsKey(aua2.akV)) {
            lfn.b(5, "SFChatCommandManager", "handleChatCommandRegisterMessage(): Duplicate registration of " + aua2);
            assert (false);
            return;
        }
        this.caa.put(aua2.akV, aua2);
    }

    private void a(ehh ehh2) {
        String string = ehh2.alk.trim();
        List<String> list = this.dV(string);
        if (list.isEmpty()) {
            lfn.b(5, "SFChatCommandManager", "handleChatInterpretRequestMessage(): Empty line");
            return;
        }
        String string2 = list.remove(0).toLowerCase();
        aua aua2 = this.caa.get(string2);
        if (aua2 == null) {
            this.a(maf.ChatCommandUnknown.bD(string2));
            return;
        }
        ArrayList arrayList = lcn.emv();
        for (aua.a a2 : aua2.bZP) {
            Object object;
            if (list.isEmpty()) {
                if (a2.bZR) continue;
                this.a(maf.ChatCommandMissingParameter.bD(a2.Name));
                return;
            }
            String string3 = null;
            if (a2.bZQ == aua.b.bZX) {
                string3 = "";
                while (!list.isEmpty()) {
                    string3 = string3 + list.remove(0);
                }
            } else {
                string3 = list.remove(0);
            }
            if ((object = this.a(string3, a2.bZQ)) != null) continue;
            this.a(maf.ChatCommandInvalidParameter.bD(string3, a2.Name, aub.a(a2.bZQ).esy(), aua2.akV));
            return;
        }
        if (!list.isEmpty()) {
            this.a(maf.ChatCommandAdditionalParameter.bD(list.get(0)));
            return;
        }
        egr egr2 = (egr)this.MessageDelegator.h(2309, this.getGUID(), aua2.alj);
        egr2.ipj = aua2.ID;
        egr2.ccT = ehh2.ccT;
        egr2.ccm = arrayList.toArray();
        this.MessageDelegator.F(egr2);
    }

    private Object a(String string, aua.b b2) {
        try {
            switch (b2) {
                case bZW: 
                case bZX: {
                    return string;
                }
                case bZS: {
                    Boolean bl = Boolean.parseBoolean(string);
                    return bl;
                }
                case bZU: {
                    Double d2 = Double.parseDouble(string);
                    return d2;
                }
                case bZV: {
                    Float f2 = Float.valueOf(Float.parseFloat(string));
                    return f2;
                }
                case bZT: {
                    Integer n = Integer.parseInt(string);
                    return n;
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return null;
    }

    public static lip a(aua.b b2) {
        switch (b2) {
            case bZS: {
                return lcy.ray;
            }
            case bZU: {
                return lcy.raz;
            }
            case bZV: {
                return lcy.raA;
            }
            case bZT: {
                return lcy.raB;
            }
            case bZW: {
                return lcy.raC;
            }
            case bZX: {
                return lcy.raC;
            }
        }
        assert (false);
        return null;
    }

    private void a(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }
}

