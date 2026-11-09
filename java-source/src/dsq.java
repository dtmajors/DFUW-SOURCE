/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
public class dsq
extends dqk {
    float gYl = 215.0f;
    int gYm = 0;
    int gYn = 80;
    int gYo = 60;
    int gYp = 255;

    public dsq() {
        this.ObjectType = 150;
    }

    public void initialize() {
        if (!lcw.qHe) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : water objects should only be created from the worldbuilder");
            return;
        }
        this.ObjectDescriptionFilename = "gizmos\\gizmo_road_marker_01.xml";
        this.Rotation = new lgl();
        super.initialize();
    }

    public float byu() {
        return this.gYl;
    }

    public void iu(float f2) {
        this.gYl = f2;
    }

    public int byv() {
        return this.gYn;
    }

    public void BP(int n) {
        this.gYn = n;
    }

    public int byw() {
        return this.gYo;
    }

    public void BQ(int n) {
        this.gYo = n;
    }

    public int byx() {
        return this.gYp;
    }

    public void BR(int n) {
        this.gYp = n;
    }

    public int byy() {
        return this.gYm;
    }

    public void BS(int n) {
        this.gYm = n;
    }

    public void b(dqn dqn2) {
        dsq dsq2 = (dsq)((Object)dqn2);
        dsq2.gYl = this.gYl;
        dsq2.gYm = this.gYm;
        dsq2.gYn = this.gYn;
        dsq2.gYo = this.gYo;
        dsq2.gYp = this.gYp;
        super.b(dqn2);
    }
}

