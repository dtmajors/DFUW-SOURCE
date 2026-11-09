/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class dpg {
    private int gMr = 0;
    private String[] gMs = new String[10];
    private Map<dpi, dph> dXz = lcn.emG();
    private Map<String, dpj> gMt = lcn.emG();

    public dpg() {
        for (int i = 0; i < 10; ++i) {
            this.v(i, "Category " + (i + 1));
        }
    }

    public void b(fkk fkk2) {
        this.a(fkk2.gMr, fkk2.gMs, fkk2.iOF, fkk2.iOG);
    }

    private void a(int n, String[] stringArray, dph[] dphArray, dpj[] dpjArray) {
        int n2;
        this.gMr = n;
        for (n2 = 0; n2 < 10; ++n2) {
            this.gMs[n2] = stringArray != null && n2 < stringArray.length && stringArray[n2] != null ? stringArray[n2] : "";
        }
        this.dXz.clear();
        if (dphArray != null) {
            for (n2 = 0; n2 < dphArray.length; ++n2) {
                this.d(dphArray[n2]);
            }
        }
        this.gMt.clear();
        if (dpjArray != null) {
            for (n2 = 0; n2 < dpjArray.length; ++n2) {
                this.o(dpjArray[n2].ResourceName, dpjArray[n2].gMw);
            }
        }
    }

    public void d(kec kec2) {
        this.a(kec2.gMr, kec2.gMs, kec2.iOF, kec2.iOG);
    }

    public void e(kec kec2) {
        kec2.gMs = this.brT();
        kec2.iOG = this.brU();
        kec2.iOF = this.brV();
        kec2.gMr = this.gMr;
    }

    public boolean AZ(int n) {
        if (this.dXz.isEmpty()) {
            return false;
        }
        for (dph dph2 : this.dXz.values()) {
            if (dph2.brY().cDO != n || dph2.brZ() <= 0) continue;
            return true;
        }
        return false;
    }

    public boolean brS() {
        if (this.dXz.isEmpty()) {
            return false;
        }
        for (dph dph2 : this.dXz.values()) {
            if (dph2.brZ() <= 0) continue;
            return true;
        }
        return false;
    }

    public String[] brT() {
        String[] stringArray = new String[this.gMs.length];
        System.arraycopy(this.gMs, 0, stringArray, 0, this.gMs.length);
        return stringArray;
    }

    public String Ba(int n) {
        if (n < 0 || n >= 10) {
            assert (false);
            return "";
        }
        if (this.gMs[n] == null) {
            return "";
        }
        return this.gMs[n];
    }

    public boolean v(int n, String string) {
        if (n < 0 || n >= 10) {
            assert (false);
            return false;
        }
        if (string == null) {
            string = "";
        }
        if (string.length() > 50) {
            string = string.substring(0, 50);
        }
        if (this.Ba(n).equals(string)) {
            return false;
        }
        this.gMs[n] = string;
        return true;
    }

    public dpj[] brU() {
        return this.gMt.values().toArray(new dpj[this.gMt.size()]);
    }

    public int iT(String string) {
        if (string == null) {
            assert (false);
            return 0;
        }
        if (lea.enW().zx(string) == null) {
            assert (false);
            return 0;
        }
        dpj dpj2 = this.gMt.get(string);
        if (dpj2 == null) {
            return 0;
        }
        return dpj2.gMw;
    }

    public boolean o(String string, int n) {
        dpj dpj2;
        if (string == null) {
            assert (false);
            return false;
        }
        if (lea.enW().zx(string) == null) {
            assert (false);
            return false;
        }
        if (n != 0) {
            if (n < 0) {
                n = 0;
            }
            if (n > 100000000) {
                n = 100000000;
            }
        }
        if ((dpj2 = this.gMt.get(string)) == null ? n == 0 : n == dpj2.gMw) {
            return false;
        }
        if (n == 0) {
            this.gMt.remove(string);
        } else {
            this.gMt.put(string, new dpj(string, n));
        }
        return true;
    }

    public dph[] brV() {
        dph[] dphArray = new dph[this.dXz.size()];
        int n = 0;
        for (dph dph2 : this.dXz.values()) {
            dphArray[n++] = dph2.brX();
        }
        return dphArray;
    }

    public dph b(dpi dpi2) {
        if (dpi2 == null) {
            assert (false);
            return null;
        }
        if (!dpi2.isValid()) {
            assert (false);
            return null;
        }
        dph dph2 = this.dXz.get(dpi2);
        return dph2;
    }

    public boolean d(dph dph2) {
        if (dph2 == null) {
            assert (false);
            return false;
        }
        if (!dph2.brY().isValid()) {
            assert (false);
            return false;
        }
        if (this.dXz.containsKey(dph2.brY())) {
            return false;
        }
        this.dXz.put(dph2.brY(), dph2);
        if (lcr.qww >= 300 && lcr.qww <= 399 && dph2.auq() == 0L) {
            dph2.N(mx.si());
        }
        return true;
    }

    public boolean c(dpi dpi2) {
        if (dpi2 == null) {
            assert (false);
            return false;
        }
        if (!dpi2.isValid()) {
            assert (false);
            return false;
        }
        return this.dXz.remove(dpi2) != null;
    }

    public boolean a(dpi dpi2, int n, int n2) {
        dph dph2 = this.b(dpi2);
        if (dph2 == null) {
            return false;
        }
        dph2.Bd(n2);
        dph2.do(n);
        return true;
    }

    public int brW() {
        return this.gMr;
    }

    public void Bb(int n) {
        this.gMr = n;
    }

    public void Bc(int n) {
        this.gMr += n;
    }
}

