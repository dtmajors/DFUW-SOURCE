/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ipg<T> {
    private ipf mrC;
    private String _name;
    private hsu mrD;
    private boolean mrE;
    private T mrF;
    private static joa mrG = new joa(0.0f, 0.0f, 1024.0f, 768.0f);

    public ipg(ipf ipf2, String string, hsu hsu2, boolean bl) {
        this.mrC = ipf2;
        this.mrC.a(this);
        this._name = string;
        this.mrD = hsu2;
        this.mrE = bl;
        if (!this.mrE) {
            this.mrF = this.daQ();
            this.qS(this._name);
        } else {
            for (lfs<Integer, Integer> lfs2 : hso.cxK().cyd()) {
                this.mrF = this.dR((Integer)lfs2.reX, (Integer)lfs2.reY);
                this.qS(this.ex((Integer)lfs2.reX, (Integer)lfs2.reY));
            }
        }
    }

    public T get() {
        return this.qT(this.dls());
    }

    public void set(T t) {
        if (this.mrE) {
            if (this.mrC.cZt()) {
                List<lfs<Integer, Integer>> list = hso.cxK().cyd();
                for (lfs<Integer, Integer> lfs2 : list) {
                    this.c(this.ex((Integer)lfs2.reX, (Integer)lfs2.reY), t);
                }
            } else {
                this.c(this.dlr(), t);
            }
        } else {
            this.c(this._name, t);
        }
        this.dak();
    }

    public T daQ() {
        return null;
    }

    public T dR(int n, int n2) {
        return null;
    }

    public void dkr() {
        if (this.mrD == hsu.ldh && this.mrC != null && this.mrC.djE() != null && this.mrC.djE().dhV()) {
            this.dak();
        }
    }

    public void cZv() {
        this.dak();
    }

    public void dak() {
    }

    private String ex(int n, int n2) {
        return this._name + "_" + n + "x" + n2;
    }

    private String dlr() {
        joa joa2 = hso.cxK().cyc();
        return this.ex((int)joa2.W, (int)joa2.H);
    }

    private String dls() {
        return this.mrE ? this.dlr() : this._name;
    }

    private void qS(String string) {
        if (this.mrF instanceof Enum) {
            this.mrC.a(string, this.mrD, ((Enum)this.mrF).name());
        } else if (this.mrF instanceof Integer) {
            this.mrC.a(string, this.mrD, (Integer)this.mrF);
        } else if (this.mrF instanceof Float) {
            this.mrC.a(string, this.mrD, ((Float)this.mrF).floatValue());
        } else if (this.mrF instanceof String) {
            this.mrC.a(string, this.mrD, (String)this.mrF);
        } else {
            this.mrC.a(string, this.mrD, (Boolean)this.mrF);
        }
    }

    private T qT(String string) {
        if (this.mrF instanceof Enum) {
            String string2 = this.mrC.nj(string);
            if (string2 == null) {
                return this.mrF;
            }
            Object e2 = Enum.valueOf(((Enum)this.mrF).getDeclaringClass(), string2);
            return (T)(e2 == null ? this.mrF : e2);
        }
        if (this.mrF instanceof Integer) {
            Integer n = this.mrC.nh(string);
            return (T)(n == null ? this.mrF : n);
        }
        if (this.mrF instanceof Float) {
            Float f = this.mrC.ni(string);
            return (T)(f == null ? this.mrF : f);
        }
        if (this.mrF instanceof String) {
            String string3 = this.mrC.nj(string);
            return (T)(string3 == null ? this.mrF : string3);
        }
        Boolean bl = this.mrC.nk(string);
        return (T)(bl == null ? this.mrF : bl);
    }

    private void c(String string, T t) {
        if (this.mrF instanceof Enum) {
            this.mrC.B(string, ((Enum)t).name());
        } else if (t instanceof Integer) {
            this.mrC.w(string, (Integer)t);
        } else if (t instanceof Float) {
            this.mrC.d(string, ((Float)t).floatValue());
        } else if (t instanceof String) {
            this.mrC.B(string, (String)t);
        } else {
            this.mrC.q(string, (Boolean)t);
        }
    }
}

