/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jju
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class jlw
extends btk
implements huy,
jjv {
    public static final int nua = 4228890;
    public static final int nub = 2058901;
    public static final int nuc = 0x575757;
    public static final int nud = 10168103;
    public static final int nue = 2995588;
    public static final int nuf = 12482082;
    public final jlk nug = new jlk();
    private Map<ldv, Integer> nuh = null;
    private float nui = 0.35f;

    @Override
    public void initialize() {
        super.initialize();
        dmn dmn2 = this.dLH();
        if (dmn2 != null) {
            dmn2.a(this);
            if (dmn2.HT()) {
                this.cyF();
            }
        }
    }

    @Override
    public void cleanUp() {
        jju jju2;
        dmn dmn2 = this.dLH();
        if (dmn2 != null) {
            dmn2.b(this);
        }
        if ((jju2 = this.cHB()) != null) {
            jju2.b((jjv)this);
        }
        super.cleanUp();
    }

    public void dLG() {
        String string;
        jju jju2 = this.cHB();
        if (jju2 == null) {
            return;
        }
        if (this.nuh == null) {
            this.nuh = lcn.emw();
        }
        if ((string = jju2.nj("COLOUR_CACHE")) != null && !string.trim().isEmpty()) {
            String[] stringArray = string.split(";");
            for (int j = 0; j < stringArray.length; ++j) {
                String[] stringArray2 = stringArray[j].split(",");
                ldv ldv2 = ldv.zp(stringArray2[0]);
                Integer n = Integer.parseInt(stringArray2[1]);
                this.nuh.put(ldv2, n);
            }
        }
        this.nui = jju2.ni("TERRITORIES_ALPHA").floatValue();
        this.dLN();
    }

    private dmn dLH() {
        if (hso.cxK() != null && hso.cxK().cxP() != null) {
            return hso.cxK().cxP().czd();
        }
        return null;
    }

    private jju cHB() {
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null) {
            return hso.cxK().cxP().cyJ().cHB();
        }
        return null;
    }

    private jng czb() {
        if (hso.cxK() != null && hso.cxK().cxP() != null) {
            return hso.cxK().cxP().czb();
        }
        return null;
    }

    private boolean dLI() {
        jju jju2 = this.cHB();
        return jju2 == null ? false : jju2.dKF();
    }

    private void d(boolean bl, boolean bl2, boolean bl3) {
        jju jju2 = this.cHB();
        if (jju2 != null) {
            jju2.c(bl, bl2, bl3);
        }
    }

    private boolean dLJ() {
        jju jju2 = this.cHB();
        return jju2 == null ? false : jju2.dKG();
    }

    private azg mZ(ldv ldv2) {
        dmn dmn2 = this.dLH();
        return dmn2 == null ? null : dmn2.mZ(ldv2);
    }

    private int ss(ldv ldv2) {
        azg azg2 = this.mZ(ldv2);
        return azg2 == null ? -1 : azg2.acY();
    }

    private bbh ng(ldv ldv2) {
        dmn dmn2 = this.dLH();
        return dmn2 == null ? null : dmn2.ng(ldv2);
    }

    private int st(ldv ldv2) {
        bbh bbh2 = this.ng(ldv2);
        return bbh2 == null ? -1 : bbh2.acY();
    }

    private bbi su(ldv ldv2) {
        dmn dmn2 = this.dLH();
        return dmn2 == null ? null : dmn2.nl(ldv2);
    }

    private int sv(ldv ldv2) {
        bbi bbi2 = this.su(ldv2);
        return bbi2 == null ? -1 : bbi2.acY();
    }

    private dml AE(int n) {
        dmn dmn2 = this.dLH();
        return dmn2 == null ? null : dmn2.AE(n);
    }

    private dmq AF(int n) {
        dmn dmn2 = this.dLH();
        return dmn2 == null ? null : dmn2.AF(n);
    }

    private Set<dmq> bqw() {
        dmn dmn2 = this.dLH();
        return dmn2 == null ? new HashSet() : dmn2.bqw();
    }

    private void Vh(int n) {
        jld jld2 = jld.Vg(n);
        if (jld2 == null) {
            return;
        }
        if (!this.dLJ() && !jld2.djL()) {
            this.fD(n, 0x575757);
        }
        jld2.setVisible(!jld2.djL());
        Set<jkw> set = lcn.emx();
        this.a(n, 999, set);
        for (jkw object2 : set) {
            object2.setVisible(jld2.djL());
        }
        dml dml2 = this.AE(n);
        if (dml2 == null) {
            return;
        }
        dmq dmq2 = this.AF(n);
        for (Integer n2 : dml2.bqh()) {
            jld jld3 = jld.Vg(n2);
            boolean bl = jld3 == null ? false : jld3.djL();
            set.clear();
            this.a(n, n2, set);
            if (jld2.djL() && bl) {
                boolean bl2 = dmq2 != null && dmq2 == this.AF(n2);
                for (jkw jkw2 : set) {
                    jkw2.setVisible(true);
                    jkw2.hz(bl2 && this.dLJ() ? 0.4f : 1.0f);
                }
                continue;
            }
            if (!jld2.djL() && !bl) {
                for (jkw jkw3 : set) {
                    jkw3.setVisible(false);
                }
                continue;
            }
            for (jkw jkw4 : set) {
                jkw4.setVisible(true);
                jkw4.hz(1.0f);
            }
        }
    }

    private void Vi(int n) {
        if (!this.dLJ()) {
            this.fD(n, 0x575757);
        }
        for (jld object2 : jld.dLE()) {
            object2.setVisible(object2.getId() == n);
        }
        dml dml2 = this.AE(n);
        if (dml2 == null) {
            return;
        }
        Set<jkw> set = lcn.emx();
        for (Integer n2 : dml2.bqh()) {
            this.a(n, n2, set);
        }
        this.a(n, 999, set);
        for (jkw jkw2 : set) {
            jkw2.hz(1.0f);
            jkw2.setVisible(true);
        }
    }

    private void a(int n, int n2, Set<jkw> set) {
        jld jld2;
        int n3;
        int n4 = n * 100000 + n2 * 100;
        int n5 = n4 + 99;
        for (n3 = n4; n3 <= n5; ++n3) {
            jld2 = jld.Vg(n3);
            if (jld2 == null || !(jld2 instanceof jkw) || set.contains(jld2)) continue;
            set.add((jkw)jld2);
        }
        n4 = n2 * 100000 + n * 100;
        n5 = n4 + 99;
        for (n3 = n4; n3 <= n5; ++n3) {
            jld2 = jld.Vg(n3);
            if (jld2 == null || !(jld2 instanceof jkw) || set.contains(jld2)) continue;
            set.add((jkw)jld2);
        }
    }

    public void dLK() {
        this.dLL();
        Set<dmq> set = this.bqw();
        for (dmq dmq2 : set) {
            for (dml dml2 : dmq2.bqB()) {
                for (dml dml3 : dmq2.bqB()) {
                    this.fC(dml2.acY(), dml3.acY());
                }
            }
        }
    }

    private void dLL() {
        for (jld jld2 : jld.dLE()) {
            if (jld2.getId() <= 100000 || !(jld2 instanceof jkw)) continue;
            ((jkw)jld2).hz(1.0f);
        }
    }

    private void fC(int n, int n2) {
        if (n == n2) {
            return;
        }
        Set<jkw> set = lcn.emx();
        this.a(n, n2, set);
        for (jkw jkw2 : set) {
            jkw2.hz(0.4f);
        }
    }

    public void fD(int n, int n2) {
        jld jld2 = jld.Vg(n);
        if (jld2 != null) {
            jld2.setColor(n2);
        }
    }

    public int sw(ldv ldv2) {
        jng jng2 = this.czb();
        if (jng2 == null || !jng2.dNh()) {
            return 0x575757;
        }
        if (jng2.sz(ldv2)) {
            return 4228890;
        }
        switch (jng2.sE(ldv2)) {
            case cXi: {
                return 2058901;
            }
            case cXh: {
                return 2995588;
            }
            case cXf: {
                return 12482082;
            }
            case cXe: {
                return 10168103;
            }
        }
        return 0x575757;
    }

    public int ak(ldv ldv2, ldv ldv3) {
        dmn dmn2 = this.dLH();
        if (dmn2 == null) {
            return 0x575757;
        }
        switch (dmn2.Y(ldv2, ldv3)) {
            case cXi: {
                return 2058901;
            }
            case cXh: {
                return 2995588;
            }
            case cXf: {
                return 12482082;
            }
            case cXe: {
                return 10168103;
            }
        }
        return 0x575757;
    }

    public int sx(ldv ldv2) {
        Integer n = this.nuh.get(ldv2);
        if (n == null) {
            return this.sw(ldv2);
        }
        return n;
    }

    public void ai(ldv ldv2, int n) {
        this.nuh.put(ldv2, n);
        jju jju2 = this.cHB();
        if (jju2 == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<ldv, Integer> entry : this.nuh.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(';');
            }
            stringBuilder.append(entry.getKey().fk());
            stringBuilder.append(',');
            stringBuilder.append(entry.getValue());
        }
        jju2.B("COLOUR_CACHE", stringBuilder.toString());
    }

    public float dLM() {
        return this.nui;
    }

    public void la(float f2) {
        if (f2 == this.nui) {
            return;
        }
        this.nui = f2;
        this.dLN();
        jju jju2 = this.cHB();
        if (jju2 == null) {
            return;
        }
        jju2.d("TERRITORIES_ALPHA", this.nui);
    }

    private void dLN() {
        for (int j = 0; j < 999; ++j) {
            jld jld2 = jld.Vg(j);
            if (jld2 == null || !(jld2 instanceof jkv)) continue;
            ((jkv)jld2).hz(this.nui);
        }
    }

    @Override
    public void cyF() {
        this.nug.dLF();
    }

    @Override
    public void a(jjh jjh2, float f2, float f3) {
        int n = -1;
        switch (jjh2.dJr()) {
            case nok: 
            case nol: {
                n = this.ss(jjh2.oq());
                break;
            }
            case noD: {
                n = this.st(jjh2.oq());
                break;
            }
            case nop: {
                n = this.sv(jjh2.oq());
            }
        }
        if (n < 0) {
            return;
        }
        if (this.dLI()) {
            this.Vh(n);
        } else {
            this.Vi(n);
            this.d(true, true, false);
        }
    }

    @Override
    public void b(jjh jjh2, float f2, float f3) {
    }

    @Override
    public void fA(int n, int n2) {
    }

    @Override
    public void fB(int n, int n2) {
    }
}

