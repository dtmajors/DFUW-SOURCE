/*
 * Decompiled with CFR.
 */
public class gqn
extends grb {
    private int jpq = 0;
    private String jpr = null;
    private String jps = null;

    public gqn() {
        super(11020);
    }

    public int getMessageType() {
        return this.jpq;
    }

    public void setMessageType(int n) {
        this.jpq = n;
    }

    public String bWL() {
        return this.jpr;
    }

    public void lf(String string) {
        this.jpr = string;
    }

    public String bWM() {
        return this.jps;
    }

    public void lg(String string) {
        this.jps = string;
    }

    @Override
    public String toString() {
        return "Module: " + this.jpr + ", DebugString: " + this.jps;
    }
}

