/*
 * Decompiled with CFR.
 */
import java.util.Random;

public class avx {
    Random DZ = new Random();
    private static final lip[] ccp = new lip[0];

    public lip a(aue aue2, lip[] lipArray) {
        assert (aue2 != null);
        if (aue2.Strings == null) {
            return new ljk("");
        }
        int n = this.DZ.nextInt(aue2.Strings.length);
        lfe lfe2 = new lfe(aue2.Strings[n].Value, aue2.ParameterCount);
        if (lipArray == null) {
            lipArray = ccp;
        }
        return ((lfb)lfe2).a(lipArray);
    }

    public lip a(aud.b b2, int n, lip[] lipArray) {
        String string = "(unhandled) Type=" + (Object)((Object)b2) + " SubType=" + n;
        if (lipArray != null) {
            string = string + " Parameters=";
            int n2 = lipArray.length;
            for (int i = 0; i < n2; ++i) {
                if (i > 0) {
                    string = string + ", ";
                }
                string = string + "[" + lipArray[i].esy() + "]";
            }
        }
        return new ljg(string);
    }

    public aue a(aud.b b2, int n) {
        aue aue2 = lea.eoH();
        aue aue3 = aue2.j(b2);
        if (aue3 == null) {
            return null;
        }
        String string = null;
        switch (b2) {
            case caX: 
            case caQ: 
            case caR: 
            case caP: 
            case caS: 
            case caT: 
            case cbc: 
            case cbe: 
            case cbf: 
            case cbg: 
            case cbd: 
            case cbh: 
            case cbq: 
            case cbm: 
            case cbn: 
            case cbo: 
            case cbp: 
            case caU: 
            case cbk: 
            case cbi: 
            case cbj: 
            case caV: 
            case caW: 
            case cbl: 
            case cbr: 
            case cbs: 
            case cbt: 
            case cbv: 
            case cbw: 
            case cbx: 
            case cby: 
            case cbz: 
            case cbA: 
            case cbB: 
            case cbC: 
            case cbD: 
            case cbE: 
            case cbF: 
            case cbG: 
            case cbJ: 
            case cbK: 
            case cbL: 
            case cbM: 
            case cbN: 
            case cbO: 
            case cbP: 
            case cbQ: 
            case cbR: {
                string = aud.b.values()[n].toString();
                break;
            }
        }
        if (string == null) {
            return aue3;
        }
        aue aue4 = aue3.j(string);
        if (aue4 == null) {
            return aue3;
        }
        return aue4;
    }
}

