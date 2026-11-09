/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class jjh {
    private static final int nlR = 14249753;
    private static final int nlS = 2780846;
    private static final int nlT = 2781183;
    jjj nlU;
    int id;
    boolean nlV = false;
    private static int nlW = 0;
    private jjm nlX;
    private ljq lSi = new ljq();
    private String nlY = "";
    private String nlZ = "";
    private float nma = 0.0f;
    private int nmb;
    private HashMap<String, String> nmc = new HashMap();
    private ldv min;
    private ldv nmd;
    private boolean mxb = true;
    private boolean mRn = false;
    private float mms = 0.0f;
    private boolean nme;
    private HashSet<jko> nmf;

    public jjh(jjm jjm2, ljq ljq2, float f2, ldv ldv2, HashSet<jko> hashSet, lhu lhu2) {
        this.nlX = jjm2;
        this.id = nlW++;
        this.lSi.ex(ljq2);
        this.nma = f2;
        this.nmb = jjm2.dJu();
        this.min = ldv2;
        this.nlY = jjm2 != jjm.npc ? jjm2.cCU() : jjm2.cCU() + (lhu2 != null ? lhu2.Name : "");
        this.nlZ = jjm2.dJs();
        this.mRn = this.dJz();
        this.nmf = hashSet != null ? (HashSet)hashSet.clone() : null;
    }

    public jjh(jjm jjm2, ljq ljq2, float f2, ldv ldv2, lhu lhu2) {
        this(jjm2, ljq2, f2, ldv2, null, lhu2);
    }

    public jjm dJr() {
        return this.nlX;
    }

    public ljq av() {
        return this.lSi.esF();
    }

    public void c(ljq ljq2) {
        if (Math.abs(this.lSi.getX() - ljq2.getX()) <= 1.0f && Math.abs(this.lSi.bdV() - ljq2.bdV()) <= 1.0f) {
            return;
        }
        this.lSi.ex(ljq2);
        if (this.nlU == null) {
            return;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.c(this);
        }
    }

    public String cCU() {
        return this.nlY;
    }

    public void sA(String string) {
        if (string == null) {
            return;
        }
        if (this.nlY.equals(string)) {
            return;
        }
        this.nlY = string;
        if (this.nlU == null) {
            return;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.e(this);
        }
    }

    public String dJs() {
        return this.nlZ;
    }

    public jjj dJt() {
        return this.nlU;
    }

    public int getId() {
        return this.id;
    }

    public float bmQ() {
        return this.nma;
    }

    public void gu(float f2) {
        if (this.nma == f2) {
            return;
        }
        this.nma = f2;
        if (this.nlU == null) {
            return;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.d(this);
        }
    }

    public int dJu() {
        return this.nmb;
    }

    public String dJv() {
        return this.nlX.dJv();
    }

    public lox dJw() {
        return this.nlX.dJw();
    }

    public HashMap<String, String> dJx() {
        return this.nmc;
    }

    public String getAttribute(String string) {
        return this.nmc.get(string);
    }

    public String getAttribute(String string, String string2) {
        String string3 = this.nmc.get(string);
        return string3 != null && string3.length() > 0 ? string3 : string2;
    }

    public jjh ac(String string, String string2) {
        String string3 = this.nmc.get(string);
        if (string3 == string2) {
            return this;
        }
        if (string3 != null && string3.equalsIgnoreCase(string2)) {
            return this;
        }
        this.nmc.put(string, string2);
        if (this.nlU == null) {
            return this;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.a(this, string, string2);
        }
        return this;
    }

    public void setAttributes(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.ac(entry.getKey(), entry.getValue());
            }
        }
    }

    public boolean cTd() {
        return this.lSi.y < -1000.0f;
    }

    public String dJy() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Map.Entry<String, String> entry : this.nmc.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public ldv getGUID() {
        return this.min;
    }

    public void setGUID(ldv ldv2) {
        this.min = ldv2;
        if (this.nlU == null) {
            return;
        }
        this.nlU.H(this);
    }

    public boolean isVisible() {
        return this.mxb;
    }

    public void setVisible(boolean bl) {
        if (bl == this.mxb) {
            return;
        }
        this.mxb = bl;
        if (this.nlU == null) {
            return;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.g(this);
        }
    }

    public boolean dJz() {
        switch (this.nlX) {
            case nnR: 
            case nnS: 
            case nnT: 
            case noa: 
            case nnU: {
                return true;
            }
        }
        return false;
    }

    public boolean dJA() {
        return this.mRn;
    }

    public void sX(boolean bl) {
        if (bl && !this.dJI()) {
            assert (false);
            return;
        }
        if (this.mRn == bl) {
            return;
        }
        this.mRn = bl;
        if (this.nlU == null) {
            return;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.h(this);
        }
    }

    public String toString() {
        return "SFWorldMapMarker [type = " + this.nlX.toString() + ", position = " + this.lSi.toString() + ", GUID = " + (this.min != null ? this.min.toString() : "null") + ", icon = " + this.nlY + ", attributes = [" + this.dJN() + "]]";
    }

    public boolean dJB() {
        return this.nlX.dJB();
    }

    public ldv oq() {
        return this.nmd;
    }

    public void hC(ldv ldv2) {
        this.nmd = ldv2;
    }

    public float cBk() {
        return this.mms;
    }

    public void setProgress(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - this.mms) < Float.MIN_VALUE) {
            return;
        }
        this.mms = f2;
        if (this.nlU != null && this.nlU.nmT != null) {
            for (jjf jjf2 : this.nlU.nmT.nkT) {
                jjf2.f(this);
            }
        }
    }

    public HashSet<jko> dJC() {
        return this.nmf;
    }

    public void a(jko jko2) {
        if (this.nmf == null || this.nmf.contains(jko2)) {
            // empty if block
        }
        if (this.nmf == null) {
            this.nmf = new HashSet();
        }
        this.nmf.add(jko2);
        if (this.nlU != null && this.nlU.nmT != null) {
            for (jjf jjf2 : this.nlU.nmT.nkT) {
                jjf2.a(this, jko2);
            }
        }
    }

    public void b(jko jko2) {
        if (this.nmf == null || !this.nmf.remove(jko2)) {
            // empty if block
        }
        if (this.nlU != null && this.nlU.nmT != null) {
            for (jjf jjf2 : this.nlU.nmT.nkT) {
                jjf2.b(this, jko2);
            }
        }
    }

    public void dJD() {
        if (this.nlU != null) {
            this.nlU.G(this);
        }
    }

    public int dJE() {
        switch (this.nlX) {
            case noq: {
                return 14249753;
            }
            case nor: {
                return 2780846;
            }
            case nos: {
                return 2781183;
            }
        }
        return -1;
    }

    public String dJF() {
        return this.nlX.dJF();
    }

    public void a(String string, List<jjh> list, boolean bl) {
        if (this.cTd()) {
            return;
        }
        if (bl && hso.cxK().cxP().cyJ().cHB().dKb() && !this.nlX.dJB() && !hso.cxK().cxP().czo().U(this.lSi)) {
            return;
        }
        switch (this.nlX) {
            case noV: 
            case noW: 
            case noX: {
                if (hso.cxK().cxT().dIV()) break;
                return;
            }
            default: {
                if (!hso.cxK().cxT().dIV()) break;
                return;
            }
        }
        switch (this.nlX) {
            case nnT: {
                this.c(string, list);
                break;
            }
            case nnY: {
                this.d(string, list);
                break;
            }
            case noa: {
                this.e(string, list);
                break;
            }
            case noV: 
            case nok: {
                this.f(string, list);
                break;
            }
            case noW: 
            case nol: {
                this.g(string, list);
                break;
            }
            case nop: {
                this.h(string, list);
                break;
            }
            case noq: 
            case nor: 
            case nos: {
                this.i(string, list);
                break;
            }
            case not: {
                this.j(string, list);
                break;
            }
            case nou: {
                this.k(string, list);
                break;
            }
            case noy: {
                this.l(string, list);
                break;
            }
            case noz: 
            case noA: 
            case noB: 
            case noC: {
                this.m(string, list);
                break;
            }
            case noX: 
            case noD: {
                this.n(string, list);
                break;
            }
            case noE: {
                this.o(string, list);
                break;
            }
            case noF: {
                this.p(string, list);
                break;
            }
            case noH: 
            case noI: {
                this.q(string, list);
                break;
            }
            case noJ: {
                this.r(string, list);
                break;
            }
            case noM: {
                this.s(string, list);
                break;
            }
            case noN: {
                this.t(string, list);
                break;
            }
            case noU: {
                this.u(string, list);
                break;
            }
            case noK: 
            case noL: {
                this.v(string, list);
            }
        }
    }

    public boolean dJG() {
        return this.nme;
    }

    public void tZ(boolean bl) {
        if (bl == this.nme) {
            return;
        }
        this.nme = bl;
        if (this.nlU == null) {
            return;
        }
        for (jjf jjf2 : this.nlU.nmT.nkT) {
            jjf2.i(this);
        }
    }

    public void dJH() {
        if (this.nlU == null) {
            return;
        }
        hso.cxK().cxP().cyJ().cHB().dKe();
        hso.cxK().cxP().cyJ().cHB().J(this);
        this.setVisible(true);
    }

    public boolean dJI() {
        return this.nlX.dJs() != null;
    }

    public boolean dJJ() {
        if (!this.dJI()) {
            return false;
        }
        switch (this.nlX) {
            case nnR: 
            case noa: 
            case nnW: 
            case nnX: 
            case nnV: 
            case noc: 
            case nod: 
            case nob: {
                return false;
            }
        }
        return true;
    }

    public String dJK() {
        if (!this.dJJ()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.nlX.name());
        if (this.nlV) {
            stringBuilder.append(',');
            stringBuilder.append((int)this.lSi.x);
            stringBuilder.append(',');
            stringBuilder.append((int)this.lSi.y);
            stringBuilder.append(',');
            stringBuilder.append((int)this.lSi.rlV);
        } else if (this.nmd != null) {
            stringBuilder.append(',');
            stringBuilder.append(this.nmd.toString());
        } else if (this.min != null) {
            stringBuilder.append(',');
            stringBuilder.append(this.min.toString());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public String ad(String string, String string2) {
        if (lhn.equal(string, "text")) {
            return jjh.sB(string2);
        }
        return string2;
    }

    public void dJL() {
        String string = this.nmc.get("Tile Position X");
        String string2 = this.nmc.get("Tile Position Y");
        ljq ljq2 = new ljq(Float.valueOf(string).floatValue(), 0.0f, -Float.valueOf(string2).floatValue());
        String string3 = lvm.sXg.bD(ljq2).exA();
        this.nmc.put("Tile Name", string3);
        this.nmc.put("Text", string3);
    }

    public jjh dJM() {
        jjh jjh2 = new jjh();
        jjh2.id = nlW++;
        jjh2.nlX = this.nlX;
        jjh2.lSi = this.lSi.esF();
        jjh2.nlY = this.nlY;
        jjh2.nlZ = this.nlZ;
        jjh2.nma = this.nma;
        jjh2.nmb = this.nmb;
        jjh2.nmc = (HashMap)this.nmc.clone();
        jjh2.min = this.min;
        jjh2.nmd = this.nmd;
        jjh2.mxb = true;
        jjh2.mms = this.mms;
        jjh2.nmf = this.nmf != null ? (HashSet)this.nmf.clone() : null;
        return jjh2;
    }

    public jjh c(jjm jjm2) {
        jjh jjh2 = this.dJM();
        jjh2.nlX = jjm2;
        jjh2.ac("SearchProxyID", "" + this.id);
        return jjh2;
    }

    private jjh() {
    }

    private String dJN() {
        String string = "";
        for (Map.Entry<String, String> entry : this.nmc.entrySet()) {
            if (!string.isEmpty()) {
                string = string + ", ";
            }
            string = string + entry.getKey();
            string = string + "=";
            string = string + entry.getValue();
        }
        return string;
    }

    private void c(String string, List<jjh> list) {
        String string2 = lxi.tqo.bD(new Object[0]).exA();
        if (string2 != null && string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void d(String string, List<jjh> list) {
        String string2 = this.nmc.get("Text");
        if (string2 != null && string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void e(String string, List<jjh> list) {
        String string2 = this.nmc.get("text");
        if (string2 != null && string2.toLowerCase().contains(string)) {
            list.add(this);
            return;
        }
        String string3 = lxi.tqp.bD(new Object[0]).exA();
        if (string3.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void f(String string, List<jjh> list) {
        azg azg2 = hso.cxK().cxP().czd().mZ(this.nmd);
        if (azg2 == null) {
            return;
        }
        String string2 = azg2.getID();
        String string3 = lxi.tqq.bD(string2).exA();
        if (string3.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void g(String string, List<jjh> list) {
        azg azg2 = hso.cxK().cxP().czd().mZ(this.nmd);
        if (azg2 == null) {
            return;
        }
        String string2 = azg2.getID();
        String string3 = lxi.tqr.bD(string2).exA();
        if (string3.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void h(String string, List<jjh> list) {
        String string2 = lxi.tqt.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void i(String string, List<jjh> list) {
        String string2 = lxi.tqu.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void j(String string, List<jjh> list) {
        String string2 = lxi.tqv.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void k(String string, List<jjh> list) {
        if (this.dJr() == jjm.nou) {
            list.add(this);
        }
    }

    private void l(String string, List<jjh> list) {
        String string2 = this.nmc.get("VendorID");
        if (string2 != null && lvm.sXl.bD(string2).exA().toLowerCase().contains(string)) {
            list.add(this);
            return;
        }
        String string3 = lxi.tqw.bD(new Object[0]).exA();
        if (string3.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void m(String string, List<jjh> list) {
        String string2 = this.nmc.get("Text");
        if (string2 == null) {
            return;
        }
        lgw lgw2 = (lgw)lea.enW().zx(this.nmc.get("ResourceName"));
        if (lgw2 == null) {
            return;
        }
        String string3 = lxf.tod.bD(lgw2.getType()).exA();
        if (string3.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void n(String string, List<jjh> list) {
        bbh bbh2 = hso.cxK().cxP().czd().ng(this.nmd);
        if (bbh2 == null) {
            return;
        }
        String string2 = bbh2.getID();
        String string3 = lxi.tqs.bD(string2).exA();
        if (string3.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void o(String string, List<jjh> list) {
        String string2 = lxi.tqx.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void p(String string, List<jjh> list) {
        for (Map.Entry<String, String> entry : this.nmc.entrySet()) {
            String string2;
            String string3 = entry.getKey();
            String string4 = entry.getValue();
            if (!string3.startsWith("resource")) continue;
            String[] stringArray = string4.split(";");
            String string5 = stringArray[0];
            lgw lgw2 = (lgw)lea.enW().zx(string5);
            while (lgw2 != lea.enW().eqq()) {
                string2 = lzc.tod.bD(lgw2.getType()).exA();
                if (string2.toLowerCase().contains(string)) {
                    list.add(this);
                    return;
                }
                String string6 = lzc.tOU.bD(lgw2.getType()).exA();
                if (string6.toLowerCase().contains(string)) {
                    list.add(this);
                    return;
                }
                lgw2 = (lgw)lea.enW().i(lgw2);
            }
            int n = Integer.valueOf(stringArray[1]);
            string2 = jjn.Vd(n);
            if (!string2.toLowerCase().contains(string)) continue;
            list.add(this);
            return;
        }
    }

    private void q(String string, List<jjh> list) {
        String string2 = lxi.tqy.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void r(String string, List<jjh> list) {
        String string2 = lxi.tpg.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void s(String string, List<jjh> list) {
        String string2 = lxi.tqz.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void t(String string, List<jjh> list) {
        String string2 = lxi.tqA.bD(this.lSi).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void u(String string, List<jjh> list) {
        String string2 = this.getAttribute("Tile Name");
        if (string2 != null && string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private void v(String string, List<jjh> list) {
        String string2 = this.nlX.dJw().bD(new Object[0]).exA();
        if (string2.toLowerCase().contains(string)) {
            list.add(this);
        }
    }

    private static String sB(String string) {
        int n = string.indexOf(" ") + 1;
        return string.charAt(0) + ". " + string.charAt(n) + ".";
    }

    public /* synthetic */ Object clone() {
        return this.dJM();
    }
}

