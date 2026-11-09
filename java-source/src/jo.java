/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.Map;

public class jo {
    private String alk;
    private int als;
    private int alt;
    private String alu;
    private jn alv;

    public jo() {
        this.reset();
    }

    private void reset() {
        this.alk = null;
        this.alt = 0;
        this.als = 0;
        this.alu = null;
        this.alv = null;
    }

    public jn b(String string, Map<String, jm> map) {
        mhk mhk2;
        Object object;
        this.reset();
        this.alk = string;
        this.alt = this.alk.length();
        this.alv = new jn(this.alk);
        String string2 = " @target";
        if (this.alk.endsWith(string2)) {
            this.alv.aln = jn.a.alp.ordinal();
            this.alk = this.alk.substring(0, this.alk.length() - string2.length());
            this.alt = this.alk.length();
        } else {
            object = " @lockedtarget";
            if (this.alk.endsWith((String)object)) {
                this.alv.aln = jn.a.alq.ordinal();
                this.alk = this.alk.substring(0, this.alk.length() - ((String)object).length());
                this.alt = this.alk.length();
            }
        }
        this.oh();
        if (!this.oc()) {
            return this.alv;
        }
        if (!this.oe()) {
            return this.alv;
        }
        this.oh();
        this.alv.akV = this.alu.toLowerCase();
        object = map.get(this.alv.akV);
        if (object == null) {
            this.alv.alm = lqd.rXd.bD(this.alv.akV);
            return this.alv;
        }
        LinkedList<mhk> linkedList = lcn.emA();
        this.alv.all = linkedList;
        int n = 0;
        while (n + 1 < ((jm)object).alf.length) {
            if (!this.oc()) {
                this.alv.alm = lqd.rXg.bD(this.alv.akV);
                return this.alv;
            }
            mhk2 = this.a(((jm)object).alf[n], false);
            if (mhk2 == null) {
                return this.alv;
            }
            linkedList.add(mhk2);
            ++n;
            this.oh();
        }
        if (n < ((jm)object).alf.length) {
            if (this.oc()) {
                mhk2 = this.a(((jm)object).alf[n], true);
                if (mhk2 == null) {
                    return this.alv;
                }
                linkedList.add(mhk2);
            } else if (!((jm)object).alg) {
                this.alv.alm = lqd.rXg.bD(this.alv.akV);
                return this.alv;
            }
            this.oh();
        }
        if (this.oc()) {
            this.alv.alm = lqd.rXg.bD(this.alv.akV);
            return this.alv;
        }
        return this.alv;
    }

    public boolean oc() {
        return this.als < this.alt;
    }

    public mhk a(mhs mhs2, boolean bl) {
        if (!this.oc()) {
            this.alv.alm = lqd.rXg.bD(this.alv.akV);
            return null;
        }
        if (mhs2 == mhs.STRING && bl && !this.og()) {
            this.alu = this.alk.substring(this.als).trim();
            this.als = this.alt;
        } else if (!this.od()) {
            return null;
        }
        mhk mhk2 = null;
        try {
            switch (mhs2) {
                case BOOLEAN: {
                    mhk2 = new mhl(Boolean.parseBoolean(this.alu));
                    break;
                }
                case INTEGER: {
                    mhk2 = new mho(Integer.parseInt(this.alu));
                    break;
                }
                case LONG: {
                    mhk2 = new mhp(Long.parseLong(this.alu));
                    break;
                }
                case FLOAT: {
                    mhk2 = new mhn(Float.parseFloat(this.alu));
                    break;
                }
                case DOUBLE: {
                    mhk2 = new mhm(Double.parseDouble(this.alu));
                    break;
                }
                case STRING: {
                    mhk2 = new mhr(this.alu);
                    break;
                }
                default: {
                    lfn.b(5, "SFCommandLineParser", "extractValue: Invalid type " + (Object)((Object)mhs2));
                    this.alv.alm = lqd.rXi.bD(new Object[]{this.alv.akV, this.alu, mhs2});
                    assert (false);
                    return null;
                }
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.alv.alm = lqd.rXi.bD(new Object[]{this.alv.akV, this.alu, mhs2});
            return null;
        }
        return mhk2;
    }

    private boolean od() {
        if (!this.oc()) {
            this.alv.alm = lqd.rXg.bD(this.alv.akV);
            return false;
        }
        switch (this.alk.charAt(this.als)) {
            case '\'': {
                return this.a('\'');
            }
            case '\"': {
                return this.a('\"');
            }
        }
        return this.oe();
    }

    private boolean a(char c2) {
        this.alu = null;
        if (!this.oc()) {
            this.alv.alm = lqd.rXg.bD(this.alv.akV);
            return false;
        }
        if (this.alk.charAt(this.als) != c2) {
            this.alv.alm = lqd.rXh.bD(this.alv.akV);
            return false;
        }
        int n = this.als + 1;
        ++this.als;
        while (this.oc() && this.alk.charAt(this.als) != c2) {
            ++this.als;
        }
        if (!this.oc()) {
            this.alv.alm = lqd.rXh.bD(this.alv.akV);
            return false;
        }
        this.alu = this.alk.substring(n, this.als);
        ++this.als;
        return true;
    }

    private boolean oe() {
        this.alu = null;
        if (!this.oc()) {
            this.alv.alm = lqd.rXg.bD(this.alv.akV);
            return false;
        }
        if (this.of()) {
            this.alv.alm = lqd.rXg.bD(this.alv.akV);
            return false;
        }
        int n = this.als;
        while (this.oc() && !this.of()) {
            ++this.als;
        }
        this.alu = this.alk.substring(n, this.als);
        return true;
    }

    private boolean isSpace(char c2) {
        return c2 == ' ' || c2 == '\t';
    }

    private boolean b(char c2) {
        return c2 == '\'' || c2 == '\"';
    }

    private boolean of() {
        return this.isSpace(this.alk.charAt(this.als));
    }

    private boolean og() {
        return this.b(this.alk.charAt(this.als));
    }

    private void oh() {
        while (this.oc() && this.of()) {
            ++this.als;
        }
    }
}

