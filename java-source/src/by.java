/*
 * Decompiled with CFR.
 */
import java.util.List;

public class by {
    private String fs = null;
    private String ft = null;
    private List fu = lcn.emv();
    private List fv = lcn.emv();

    public String ac() {
        return this.fs;
    }

    public void s(String string) {
        this.fs = string;
    }

    public String getObjectName() {
        return this.ft;
    }

    public void t(String string) {
        this.ft = string;
    }

    public List ad() {
        return this.fv;
    }

    public void a(btl btl2) {
        this.fv.add(btl2);
    }

    public void ae() {
        this.fv.clear();
    }

    public void a(dqn dqn2) {
        this.fu.add(dqn2);
    }

    public List getObjects() {
        return this.fu;
    }

    public void af() {
        this.fu.clear();
    }

    public void ag() {
        this.fs = null;
        this.ft = null;
        this.fu.clear();
    }
}

