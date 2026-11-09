/*
 * Decompiled with CFR.
 */
public class cs {
    private String Name;
    private int Cost;
    private int jR;
    private int jS;
    private int jT;
    private int jU;
    private boolean jV = true;

    public cs() {
    }

    public cs(cs cs2) {
        this.jR = cs2.jR;
        this.jS = cs2.jS;
        this.jT = cs2.jT;
        this.jU = cs2.jU;
        this.Cost = cs2.Cost;
        this.Name = cs2.Name;
    }

    public int cl() {
        return this.Cost;
    }

    public void K(int n) {
        assert (false) : "Not Supported";
        this.Cost = n;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public int cn() {
        return this.jS;
    }

    public void L(int n) {
        this.jS = n;
    }

    public int co() {
        return this.jR;
    }

    public int cp() {
        int n = this.jU - this.jT;
        return n;
    }

    public void M(int n) {
        this.jR = n;
    }

    public int cq() {
        return this.jT;
    }

    public void N(int n) {
        this.jU = this.jT = n;
    }

    public boolean isSelected() {
        return this.jV;
    }

    public void setSelected(boolean bl) {
        this.jV = bl;
    }

    public int cr() {
        return this.jU;
    }

    public void O(int n) {
        this.jU = n;
    }

    public String toString() {
        return "(Stat) Name = " + this.Name;
    }
}

