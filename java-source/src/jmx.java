/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class jmx
extends btk {
    private Map<String, jmw> caa = lcn.emG();

    private final List<String> dV(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<String> arrayList = lcn.emv();
        if (string.isEmpty()) {
            return arrayList;
        }
        a a2 = a.nCr;
        String string2 = "";
        int n = string.length();
        for (int j = 0; j < n; ++j) {
            char c2 = string.charAt(j);
            a a3 = a.indicatedStateForCharacter(c2);
            a a4 = a.effectiveNewParserState(a2, a3);
            if (a4 != a2) {
                if (!string2.isEmpty() || a.includeEmptyTokens(a2)) {
                    arrayList.add(string2);
                }
                string2 = "";
                a2 = a4;
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
            case 2349: {
                this.a((ehj)dxq2);
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

    private void a(ehj ehj2) {
        jmw jmw2 = ehj2.ipV;
        if (this.caa.containsKey(jmw2.akV)) {
            lfn.b(5, "SFChatCommandManager", "handleChatCommandRegisterMessage(): Duplicate registration of " + jmw2);
            return;
        }
        this.caa.put(jmw2.akV, jmw2);
    }

    private void a(ehh ehh2) {
        String string = ehh2.alk.trim();
        List<String> list = this.dV(string);
        if (list.isEmpty()) {
            lfn.b(5, "SFChatCommandManager", "handleChatInterpretRequestMessage(): Empty line");
            return;
        }
        String string2 = list.remove(0).toLowerCase();
        jmw jmw2 = this.caa.get(string2);
        if (jmw2 == null) {
            this.h(maf.ChatCommandUnknown.bD(string2));
            return;
        }
        ArrayList<Object> arrayList = lcn.emv();
        for (jmw.a a2 : jmw2.nCf) {
            if (list.isEmpty()) {
                if (a2.bZR) continue;
                this.h(maf.ChatCommandMissingParameter.bD(a2.Name));
                return;
            }
            String string3 = null;
            if (a2.nCg == jmw.b.nCm) {
                string3 = "";
                while (!list.isEmpty()) {
                    string3 = string3 + " " + list.remove(0);
                }
                string3 = string3.trim();
            } else {
                string3 = list.remove(0);
            }
            Object object = this.a(string3, a2.nCg);
            if (object == null) {
                this.h(maf.ChatCommandInvalidParameter.bD(string3, a2.Name, a2.nCg.name(), jmw2.akV));
                return;
            }
            arrayList.add(object);
        }
        if (!list.isEmpty()) {
            this.h(maf.ChatCommandAdditionalParameter.bD(list.get(0)));
            return;
        }
        egr egr2 = (egr)this.MessageDelegator.h(2309, this.getGUID(), jmw2.alj);
        egr2.ipj = jmw2.ID;
        egr2.ccT = ehh2.ccT;
        egr2.ccm = arrayList.toArray();
        this.MessageDelegator.F(egr2);
    }

    private Object a(String string, jmw.b b2) {
        try {
            switch (b2) {
                case nCl: 
                case nCm: {
                    return string;
                }
                case nCh: {
                    Boolean bl = Boolean.parseBoolean(string);
                    return bl;
                }
                case nCj: {
                    Double d2 = Double.parseDouble(string);
                    return d2;
                }
                case nCk: {
                    Float f2 = Float.valueOf(Float.parseFloat(string));
                    return f2;
                }
                case nCi: {
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

    private void h(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    public static lip a(jmw.b b2) {
        switch (b2) {
            case nCh: {
                return lcy.ray;
            }
            case nCj: {
                return lcy.raz;
            }
            case nCk: {
                return lcy.raA;
            }
            case nCi: {
                return lcy.raB;
            }
            case nCl: {
                return lcy.raC;
            }
            case nCm: {
                return lcy.raC;
            }
        }
        assert (false);
        return null;
    }
}

