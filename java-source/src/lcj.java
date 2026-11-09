/*
 * Decompiled with CFR.
 */
public class lcj {
    public ljq qwb;
    public ljq qwc;

    public void dT(ljq ljq2) {
        if (ljq2.x < this.qwb.x) {
            this.qwb.x = ljq2.x;
        }
        if (ljq2.y < this.qwb.y) {
            this.qwb.y = ljq2.y;
        }
        if (ljq2.rlV < this.qwb.rlV) {
            this.qwb.rlV = ljq2.rlV;
        }
        if (ljq2.x > this.qwc.x) {
            this.qwc.x = ljq2.x;
        }
        if (ljq2.y > this.qwc.y) {
            this.qwc.y = ljq2.y;
        }
        if (ljq2.rlV > this.qwc.rlV) {
            this.qwc.rlV = ljq2.rlV;
        }
    }
}

