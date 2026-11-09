/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class hcl {
    private static final lhf jGb = new lhf(0, 0);
    private static final lhu jGc = new lhu(new lhf(32, 32), "gui/resources/question_mark.dds");
    public static final char jGd = '^';
    public static final char jGe = '\u00a7';
    public static final char jGf = 'L';
    public static final char jGg = 'C';
    public static final char jGh = 'W';
    public static final char jGi = 'I';
    public static final char jGj = 'N';
    public static final char jGk = 'S';
    public static final char jGl = 'O';
    public static final char jGm = 'P';
    public static final char jGn = 'T';
    public static final lhf jGo = new lhf(24, 24);
    public static final lhf jGp = new lhf(9, 12);
    private final hcg jGq;
    public final lcq jGr;
    public final hnb jGs;
    private final boolean jGt;
    public final long aEW;
    private String jGu;
    private int jGv;
    private int jGw;
    private int jGx;
    private int jGy;
    public List<hcj> aDm = null;
    public final ldl jGz = new ldl();
    private hnb jGA = null;
    private lcq jGB = null;

    public hcl(hcg hcg2, String string, hnb hnb2, lcq lcq2, boolean bl, long l) {
        this.jGq = hcg2;
        this.jGu = string;
        this.jGs = this.jGq.a(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd);
        this.jGr = lcq2;
        this.jGt = bl;
        this.aEW = l;
    }

    public int a(hcj hcj2) {
        return this.aDm.indexOf(hcj2);
    }

    private String q(String string, int n) {
        int n2;
        assert (string.length() > n);
        for (n2 = n + 1; n2 < string.length() && string.charAt(n2) != '^'; ++n2) {
        }
        if (n2 >= string.length()) {
            return null;
        }
        String string2 = string.substring(n + 1, n2);
        hck hck2 = hcl.mk(string2);
        if (hck2 == hck.jFQ) {
            return null;
        }
        switch (hck2) {
            case jFU: {
                break;
            }
            case jFS: {
                break;
            }
            case jFV: {
                break;
            }
            case jFT: {
                break;
            }
            case jFR: {
                break;
            }
            case jFZ: {
                if (string2.equals("N")) break;
                return null;
            }
            case jFW: {
                if (hfe.a(string2.substring(1, string2.length()), null) != null) break;
                return null;
            }
            case jFX: {
                if (string2.equals("I0") || string2.equals("I1")) break;
                return null;
            }
            case jFY: {
                try {
                    Integer.parseInt(string2.substring(1), 10);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    return null;
                }
            }
        }
        return string2;
    }

    private lhf mg(String string) {
        int n = 0;
        int n2 = 0;
        int n3 = string.length();
        for (int i = 0; i < n3; ++i) {
            lhf lhf2 = this.jGq.b(this.jGA, string.charAt(i));
            n += lhf2.rmN;
            n2 = n2 < lhf2.H ? lhf2.H : n2;
        }
        return new lhf(n, n2);
    }

    private int h(String string, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        char c2 = '\u0000';
        char c3 = '\u0000';
        int n5 = string.length();
        for (int i = 0; i < n5; ++i) {
            c3 = c2;
            c2 = string.charAt(i);
            if ((n4 += this.jGq.b((hnb)this.jGA, (char)c2).rmN) > n2) {
                if (n3 == 0) {
                    n3 = i;
                }
                return n3;
            }
            if (n4 < n || c2 != ' ' && c3 != ' ') continue;
            n3 = i;
        }
        if (n3 == 0) {
            n3 = string.length();
        }
        return n3;
    }

    private ArrayList<a> mh(String string) {
        Object object;
        Object object2;
        Object object3;
        ArrayList<a> arrayList = new ArrayList<a>();
        int n = 0;
        int n2 = string.length();
        int n3 = 0;
        if (this.jGq.dXw.jZD.kat.kgI.cgy() && this.aEW != 0L) {
            object3 = new GregorianCalendar();
            ((Calendar)object3).setTimeInMillis(this.aEW);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("[");
            int n4 = ((Calendar)object3).get(11);
            if (n4 < 10) {
                ((StringBuilder)object2).append("0");
            }
            ((StringBuilder)object2).append(n4);
            ((StringBuilder)object2).append(":");
            int n5 = ((Calendar)object3).get(12);
            if (n5 < 10) {
                ((StringBuilder)object2).append("0");
            }
            ((StringBuilder)object2).append(n5);
            if (this.jGq.dXw.jZD.kat.kgI.cgz()) {
                ((StringBuilder)object2).append(":");
                int n6 = ((Calendar)object3).get(13);
                if (n6 < 10) {
                    ((StringBuilder)object2).append("0");
                }
                ((StringBuilder)object2).append(n6);
            }
            ((StringBuilder)object2).append("] ");
            object = ((StringBuilder)object2).toString();
            arrayList.add(new a(this, (String)object, hck.jFQ, this.mg((String)object)));
        }
        while (n < n2) {
            char c2 = string.charAt(n);
            object2 = null;
            if (c2 == '^') {
                object2 = this.q(string, n);
            }
            if (object2 == null) {
                ++n;
                continue;
            }
            if (n > n3) {
                String string2 = string.substring(n3, n);
                lhf lhf2 = this.mg(string2);
                arrayList.add(new a(this, string2, hck.jFQ, lhf2));
                n3 = n;
            }
            hck hck2 = hcl.mk((String)object2);
            switch (hck2) {
                case jFZ: 
                case jFW: 
                case jFX: 
                case jFY: {
                    arrayList.add(new a(this, (String)object2, hck2, this.jGt ? jGp : jGb));
                    break;
                }
                case jFU: 
                case jFS: 
                case jFV: 
                case jFT: {
                    arrayList.add(new a(this, (String)object2, hck2, jGo));
                    break;
                }
                case jFR: {
                    String string3 = ((String)object2).substring(1);
                    object = this.mg(string3);
                    arrayList.add(new a(this, string3, hck.jFR, (lhf)object));
                    break;
                }
                default: {
                    assert (false);
                    break;
                }
            }
            n3 = n += ((String)object2).length() + 2;
        }
        if (n > n3) {
            object3 = string.substring(n3, n);
            object2 = this.mg((String)object3);
            arrayList.add(new a(this, (String)object3, hck.jFQ, (lhf)object2));
            n3 = n;
        }
        return arrayList;
    }

    private void c(ArrayList<a> arrayList, int n, int n2) {
        int n3;
        int n4 = Integer.MAX_VALUE;
        int n5 = 0;
        for (n3 = n; n3 < n2; ++n3) {
            a a2 = arrayList.get(n3);
            if (a2.jFO.H <= 0) continue;
            if (a2.jFO.cg < n4) {
                n4 = a2.jFO.cg;
            }
            if (a2.jFO.cg + a2.jFO.H <= n5) continue;
            n5 = a2.jFO.cg + a2.jFO.H;
        }
        n3 = n5 - n4;
        for (int i = n; i < n2; ++i) {
            int n6;
            a a3 = arrayList.get(i);
            a3.jFP = new lgs(a3.jFO.cf, n4, a3.jFO.rmN, n3);
            if (a3.jFO.H <= 0) continue;
            a3.jFO.cg = n6 = n4 + (n3 - a3.jFO.H) / 2;
        }
    }

    private ArrayList<a> b(ArrayList<a> arrayList) {
        ArrayList<a> arrayList2 = new ArrayList<a>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean bl = false;
        int n5 = 0;
        arrayList3.add(0);
        while (n5 < arrayList.size()) {
            a a2 = arrayList.get(n5);
            if (n2 + a2.jFO.rmN <= this.jGw) {
                if (a2.jFO.H > n4) {
                    n4 = a2.jFO.H;
                }
                a a3 = new a(this, a2.jFL == hck.jFQ ? a2.aFo : a2.jFM, a2.jFL, a2.jFO.cqv());
                a3.jFO = new lgs(n2, n3, a2.jFO.rmN, a2.jFO.H);
                arrayList2.add(a3);
                if ((n2 += a2.jFO.rmN) > n) {
                    n = n2;
                }
                ++n5;
                continue;
            }
            if (a2.jFL == hck.jFQ || a2.jFL == hck.jFR) {
                int n6 = this.jGv - n2;
                if (n6 < 0) {
                    n6 = 0;
                }
                int n7 = this.jGw - n2;
                int n8 = this.h(a2.aFo, n6, n7);
                if (n8 > 0) {
                    String string = a2.aFo.substring(0, n8);
                    a a4 = new a(this, string, a2.jFL, this.mg(string));
                    a4.jFO = new lgs(n2, n3, a2.jFO.rmN, a2.jFO.H);
                    arrayList2.add(a4);
                    if (a4.jFO.H > n4) {
                        n4 = a4.jFO.H;
                    }
                    string = a2.aFo.substring(n8);
                    a2.aFo = string;
                    a2.jFO.c(this.mg(string));
                }
            }
            n2 = 0;
            n3 += n4;
            n4 = 0;
            arrayList3.add(arrayList2.size());
        }
        this.jGx = n3 + n4;
        this.jGy = n;
        int n9 = 0;
        for (n9 = 0; n9 < arrayList3.size() - 1; ++n9) {
            this.c(arrayList2, (Integer)arrayList3.get(n9), (Integer)arrayList3.get(n9 + 1));
        }
        this.c(arrayList2, (Integer)arrayList3.get(n9), arrayList2.size());
        return arrayList2;
    }

    public hcj LK(int n) {
        if (n < 0) {
            return null;
        }
        for (hcj hcj2 : this.aDm) {
            if (n < hcj2.als || n >= hcj2.als + hcj2.cbY()) continue;
            return hcj2;
        }
        for (hcj hcj2 : this.aDm) {
        }
        return null;
    }

    public hcj h(lgg lgg2) {
        if (lgg2.cf < 0) {
            return null;
        }
        for (hcj hcj2 : this.aDm) {
            if (!hcj2.jFP.A(lgg2)) continue;
            return hcj2;
        }
        return null;
    }

    public int i(lgg lgg2) {
        if (lgg2.cf <= 0) {
            return 0;
        }
        for (hcj hcj2 : this.aDm) {
            if (!hcj2.jFP.A(lgg2)) continue;
            switch (hcj2.jFL) {
                case jFU: 
                case jFS: 
                case jFV: 
                case jFT: 
                case jFZ: 
                case jFW: 
                case jFX: 
                case jFY: {
                    return hcj2.als;
                }
                case jFR: 
                case jFQ: {
                    lgg lgg3 = new lgg(lgg2.cf - hcj2.jFP.cf, lgg2.cg - hcj2.jFP.cg);
                    int n = 0;
                    for (int i = 0; i < hcj2.cbY(); ++i) {
                        lhf lhf2 = this.jGq.a(hcj2.jFE, hcj2.cbZ().charAt(i));
                        if (lgg3.cf >= n && lgg3.cf < n + lhf2.rmN) {
                            return hcj2.als + i;
                        }
                        n += lhf2.rmN;
                    }
                    break;
                }
            }
        }
        return this.jGu.length();
    }

    public lgs LL(int n) {
        int n2 = 0;
        for (hcj hcj2 : this.aDm) {
            int n3 = hcj2.cbY();
            n2 = hcj2.jFP.cf + hcj2.jFP.rmN;
            if (hcj2.als > n || hcj2.als + hcj2.cbY() <= n) continue;
            switch (hcj2.jFL) {
                case jFU: 
                case jFS: 
                case jFV: 
                case jFT: 
                case jFZ: 
                case jFW: 
                case jFX: 
                case jFY: {
                    return new lgs(hcj2.jFP);
                }
                case jFR: 
                case jFQ: {
                    String string = hcj2.getText();
                    int n4 = 0;
                    int n5 = n - hcj2.als;
                    lhf lhf2 = lhf.rnv;
                    for (int i = 0; i < n5; ++i) {
                        lhf2 = this.jGq.a(hcj2.jFE, string.charAt(i));
                        n4 += lhf2.rmN;
                    }
                    return new lgs(n4 + hcj2.jFP.cf, hcj2.jFP.cg, lhf2.rmN, hcj2.jFP.H);
                }
            }
            assert (false);
            return null;
        }
        return new lgs(n2, 0, 1, 0);
    }

    public int cca() {
        return this.jGy;
    }

    public int ccb() {
        return this.jGx;
    }

    public void i(String string, int n, int n2) {
        this.jGu = string;
        this.ci(n, n2);
    }

    public void ci(int n, int n2) {
        this.jGw = n;
        this.jGv = n2;
        this.aDm = new ArrayList<hcj>();
        this.jGA = this.jGs;
        this.jGB = this.jGr;
        ArrayList<a> arrayList = this.b(this.mh(this.jGu));
        this.jGA = this.jGs;
        this.jGB = this.jGr;
        int n3 = 0;
        for (a a2 : arrayList) {
            switch (a2.jFL) {
                case jFQ: {
                    this.aDm.add(new hcj(a2.jFL, a2.jFM, a2.aFo, a2.dFm, null, null, a2.jFO, a2.jFP, this.jGA, this.jGB, n3));
                    n3 += a2.jFM.length();
                    break;
                }
                case jFR: {
                    this.aDm.add(new hcj(a2.jFL, a2.jFM, a2.aFo, a2.dFm, null, null, a2.jFO, a2.jFP, this.jGA, this.jGB, n3));
                    n3 += a2.jFM.length();
                    break;
                }
                case jFW: {
                    this.mj(a2.aFo);
                    this.aDm.add(new hcj(a2.jFL, '^' + a2.jFM + '^', a2.aFo, a2.dFm, this.jGt ? hdk.jNG : null, null, a2.jFO, a2.jFP, this.jGA, this.jGB, n3));
                    n3 += a2.jFM.length() + 2;
                    break;
                }
                case jFX: {
                    this.mi(a2.aFo);
                    this.aDm.add(new hcj(a2.jFL, '^' + a2.jFM + '^', a2.aFo, a2.dFm, this.jGt ? hdk.jNH : null, null, a2.jFO, a2.jFP, this.jGA, this.jGB, n3));
                    n3 += a2.jFM.length() + 2;
                    break;
                }
                case jFY: {
                    this.mi(a2.aFo);
                    this.aDm.add(new hcj(a2.jFL, '^' + a2.jFM + '^', a2.aFo, a2.dFm, this.jGt ? hdk.jNI : null, null, a2.jFO, a2.jFP, this.jGA, this.jGB, n3));
                    n3 += a2.jFM.length() + 2;
                    break;
                }
                case jFZ: {
                    this.mj(a2.jFM);
                    this.mi(a2.jFM);
                    this.aDm.add(new hcj(a2.jFL, '^' + a2.jFM + '^', a2.aFo, a2.dFm, this.jGt ? hdk.jNJ : null, null, a2.jFO, a2.jFP, this.jGA, this.jGB, n3));
                    n3 += a2.jFM.length() + 2;
                    break;
                }
                case jFU: 
                case jFS: 
                case jFV: 
                case jFT: {
                    this.aDm.add(hcl.c(a2, n3));
                    n3 += a2.jFM.length() + 2;
                }
            }
        }
        this.jGA = null;
        this.jGB = null;
        this.jGz.enp();
    }

    private void mi(String string) {
        switch (string.charAt(0)) {
            case 'W': {
                try {
                    int n = Integer.parseInt(string.substring(1));
                    this.jGA = this.jGq.a(this.jGA.kNa, this.jGA.kNb, n, this.jGA.kNd);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                return;
            }
            case 'I': {
                int n = -1;
                try {
                    n = Integer.parseInt(string.substring(1));
                }
                catch (NumberFormatException numberFormatException) {
                    n = -1;
                }
                if (n == 0 || n == 1) {
                    if (n == 1 == this.jGA.kNd) {
                        return;
                    }
                    this.jGA = this.jGq.a(this.jGA.kNa, this.jGA.kNb, this.jGA.kNc, n == 1);
                }
                return;
            }
            case 'N': {
                if (string.length() != 1) {
                    return;
                }
                this.jGA = this.jGs;
                return;
            }
        }
    }

    private void mj(String string) {
        switch (string.charAt(0)) {
            case 'C': {
                lcq lcq2 = hfe.a(string.substring(1), null);
                if (lcq2 == null) {
                    return;
                }
                this.jGB = lcq2;
                return;
            }
            case 'N': {
                if (string.length() != 1) {
                    return;
                }
                this.jGB = this.jGr;
                return;
            }
        }
    }

    private static hcj a(a a2, int n) {
        ler ler2;
        int n2 = -1;
        String string = a2.aFo.substring(1);
        try {
            n2 = Integer.parseInt(string);
            if (lea.enW().acv(n2) == null) {
                return null;
            }
        }
        catch (NumberFormatException numberFormatException) {
            n2 = -1;
        }
        if (n2 == -1 && (ler2 = lea.enW().zx(string)) != null) {
            n2 = ((lgw)ler2).getType();
        }
        if (n2 == -1) {
            return null;
        }
        ler2 = lea.enW().acv(n2);
        if (ler2 == null) {
            return null;
        }
        if (!(ler2 instanceof lgw)) {
            return null;
        }
        lgw lgw2 = (lgw)ler2;
        if (lgw2.atw() == null) {
            return null;
        }
        if (lgw2.atw().Name == null) {
            return null;
        }
        if (lgw2.atw().Name.contains("doom_01.dds")) {
            return null;
        }
        return new hcj(a2.jFM.charAt(0) == 'O' ? hck.jFS : hck.jFT, '^' + a2.jFM + '^', a2.aFo, a2.dFm, null, new hdw(n2), a2.jFO, a2.jFP, null, null, n);
    }

    private static hcj b(a a2, int n) {
        ler ler2;
        int n2 = -1;
        String string = a2.aFo.substring(1);
        try {
            n2 = Integer.parseInt(string);
            if (lea.enZ().acv(n2) == null) {
                return null;
            }
        }
        catch (NumberFormatException numberFormatException) {
            n2 = -1;
        }
        if (n2 == -1 && (ler2 = lea.enZ().zx(string)) != null) {
            n2 = ((lhg)ler2).getType();
        }
        if (n2 == -1) {
            return null;
        }
        ler2 = lea.enZ().acv(n2);
        if (ler2 == null) {
            return null;
        }
        if (!(ler2 instanceof lhg)) {
            return null;
        }
        lhg lhg2 = (lhg)ler2;
        if (lhg2.atw() == null) {
            return null;
        }
        if (lhg2.atw().Name == null) {
            return null;
        }
        if (lhg2.atw().Name.contains("doom_01.dds")) {
            return null;
        }
        return new hcj(a2.jFM.charAt(0) == 'S' ? hck.jFU : hck.jFV, '^' + a2.jFM + '^', a2.aFo, a2.dFm, null, new hdx(n2), a2.jFO, a2.jFP, null, null, n);
    }

    private static hcj c(a a2, int n) {
        hcj hcj2 = null;
        switch (a2.aFo.charAt(0)) {
            case 'S': 
            case 'T': {
                hcj2 = hcl.b(a2, n);
                break;
            }
            case 'O': 
            case 'P': {
                hcj2 = hcl.a(a2, n);
                break;
            }
        }
        if (hcj2 == null) {
            hcj2 = new hcj(hck.jFT, '^' + a2.jFM + '^', a2.aFo, new ArrayList<String>(), jGc, null, a2.jFO, a2.jFP, null, null, n);
        }
        return hcj2;
    }

    private static hck mk(String string) {
        if (string.isEmpty()) {
            return hck.jFQ;
        }
        switch (string.charAt(0)) {
            case 'W': {
                return hck.jFY;
            }
            case 'I': {
                return hck.jFX;
            }
            case 'C': {
                return hck.jFW;
            }
            case 'N': {
                return hck.jFZ;
            }
            case 'O': {
                return hck.jFS;
            }
            case 'P': {
                return hck.jFT;
            }
            case 'S': {
                return hck.jFU;
            }
            case 'T': {
                return hck.jFV;
            }
            case 'L': {
                return hck.jFR;
            }
        }
        return hck.jFQ;
    }
}

