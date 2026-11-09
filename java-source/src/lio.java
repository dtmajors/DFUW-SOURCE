/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class lio {
    private static final lfo ct = new lfo("Util");
    public static final DecimalFormatSymbols rkH = new DecimalFormatSymbols(Locale.US);
    private static final Map<String, lcf> roB = new HashMap<String, lcf>();

    @Deprecated
    public static final boolean j(cxc cxc2, int n) {
        if (cxc2 == null || n == -1) {
            return false;
        }
        if (!cwy.a(cxc2, n)) {
            return false;
        }
        ctu ctu2 = cwy.bm(cxc2.zg(), n);
        if (ctu2 == null) {
            return false;
        }
        ctm[] ctmArray = cwy.c(cxc2, ctu2);
        if (ctmArray == null) {
            return false;
        }
        int[] nArray = cwy.a(cxc2, ctu2);
        if (nArray == null) {
            return false;
        }
        if (ctmArray.length != nArray.length) {
            return false;
        }
        for (int i = 0; i < ctmArray.length; ++i) {
            if (nArray[i] >= ctmArray[i].asi) continue;
            return false;
        }
        return true;
    }

    public static final boolean a(lij<bsm> lij2, cxc cxc2, bsm bsm2) {
        bsm bsm3 = lij2.ab(bsm2);
        if (bsm3 == null) {
            return lio.j(cxc2, bsm2.getType());
        }
        while (bsm3 != null) {
            if (lio.a(lij2, cxc2, bsm3)) {
                return true;
            }
            bsm3 = lij2.ac(bsm3);
        }
        return false;
    }

    public static final ej[] acV(int n) {
        cuf cuf2 = cug.vb((int)n);
        if (cuf2 == null) {
            return new ej[0];
        }
        assert (cuf2.ResourceType == n);
        return cuf2.arJ();
    }

    private static byte[] Ao(String string) {
        byte[] byArray = jry.tg(string);
        if (byArray == null) {
            throw new FileNotFoundException(string);
        }
        return byArray;
    }

    private static final lcf Ap(String string) {
        jru jru2 = new jru();
        byte[] byArray = lio.Ao(string);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        jru2.read(byteArrayInputStream);
        if (jru2.dRQ() != 1) {
            throw new Exception(string + " is not one-bit-per-pixel!");
        }
        return jru2.dRS();
    }

    public static final lcf Aq(String string) {
        lcf lcf2 = roB.get(string);
        if (lcf2 == null) {
            lcf2 = lio.Ap(string);
        }
        roB.put(string, lcf2);
        return lcf2;
    }

    public static final lcf Ar(String string) {
        try {
            return lio.Aq(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

