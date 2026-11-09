/*
 * Decompiled with CFR.
 */
public class kyq
extends Thread {
    private kyr qkM = null;
    private boolean dh = true;
    private long qju = 1000L;
    private int qjv = 4;
    private int qmj = 0;

    public kyq(kyr kyr2) {
        this.qkM = kyr2;
    }

    public void xR(boolean bl) {
        this.dh = bl;
    }

    public long eiX() {
        return this.qju;
    }

    public void av(long l2) {
        this.qju = l2;
    }

    public int eiY() {
        return this.qjv;
    }

    public void abl(int n) {
        this.qjv = n;
    }

    @Override
    public void run() {
        try {
            while (this.dh) {
                kyq.sleep(this.qju);
                ++this.qmj;
                if (this.qmj == this.qjv) {
                    this.qmj = 0;
                    this.qkM.xS(true);
                    continue;
                }
                this.qkM.xS(false);
            }
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

