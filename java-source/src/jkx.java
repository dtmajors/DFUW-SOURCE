/*
 * Decompiled with CFR.
 */
public abstract class jkx
extends jld {
    protected int[] gJj = null;
    protected int[] gJk = null;
    protected int[] gJq = null;

    public int[] bqN() {
        return this.gJq;
    }

    protected jkx(int n, int[] nArray, int[] nArray2) {
        this.hf = n;
        this.gJj = nArray;
        this.gJk = nArray2;
    }

    protected jkx(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        this.hf = n;
        this.gJj = nArray;
        this.gJk = nArray2;
        this.gJq = nArray3;
        if (this.gJq.length == 1) {
            this.gJq = new int[]{this.gJq[0], this.gJq[0]};
        }
    }

    @Override
    public String dLx() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < this.gJq.length; ++j) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j]]]);
            stringBuilder.append(',');
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j]] + 1]);
            stringBuilder.append(',');
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j] + 1]]);
            stringBuilder.append(',');
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j] + 1] + 1]);
        }
        return stringBuilder.toString();
    }
}

