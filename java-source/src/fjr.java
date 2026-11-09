/*
 * Decompiled with CFR.
 */
public class fjr
extends fiv {
    private myp[] iNX = null;
    private int iNY = 0;

    fjr() {
        super(2839);
    }

    public void a(myp myp2) {
        if (this.iNX == null) {
            this.iNX = new myp[20];
        }
        if (this.iNY < this.iNX.length) {
            this.iNX[this.iNY++] = myp2;
        } else {
            System.out.println("Error: Keyboard buffer full!!");
        }
    }

    public void a(myp[] mypArray) {
        this.iNX = mypArray;
        this.iNY = mypArray.length;
    }

    public myp[] bPV() {
        return this.iNX;
    }
}

