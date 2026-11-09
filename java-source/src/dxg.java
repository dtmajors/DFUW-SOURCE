/*
 * Decompiled with CFR.
 */
public class dxg
extends dxh {
    private int gdC = 0;
    private boolean hmW = false;
    private int hmX = 0;

    public int bjy() {
        return this.gdC;
    }

    public void zG(int n2) {
        this.gdC = n2;
    }

    public boolean bEb() {
        return this.hmW;
    }

    public void jL(boolean bl) {
        this.hmW = bl;
    }

    public int bEc() {
        return this.hmX;
    }

    public void CT(int n2) {
        this.hmX = n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" RepeatCount=");
        stringBuilder.append(this.gdC);
        stringBuilder.append(" InfiniteTimer=");
        stringBuilder.append(this.hmW);
        stringBuilder.append(" TimeoutCount=");
        stringBuilder.append(this.hmX);
        return stringBuilder.toString();
    }
}

