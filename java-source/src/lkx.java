/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public class lkx
implements Cloneable {
    lfn ga = lfn.eqw();
    private List<lkw> rDq = lcn.emv();
    private List<lkw> rDr = lcn.emv();
    private List<lkw> rDs = lcn.emv();
    private boolean rDt = true;
    private int dRT;
    private int dRU;
    private int rDu;
    private float rDv = 0.0f;

    public List<lkw> euk() {
        return this.rDq;
    }

    public List<lkw> eul() {
        return this.rDr;
    }

    public void a(lkw lkw2) {
        if (this.rDq.size() < this.dRT) {
            this.rDq.add(lkw2);
            if (lcw.qHe) {
                this.rDs.add(lkw2);
            }
        } else {
            lfn.b(5, "SFAnimationTrackContainer", "addHighPriorityTrack() : MaxTracks [" + this.dRT + "] reached. Not adding new track");
        }
    }

    public void b(lkw lkw2) {
        if (this.rDr.size() < this.dRT) {
            this.rDr.add(lkw2);
            if (lcw.qHe) {
                this.rDs.add(lkw2);
            }
        } else {
            lfn.b(5, "SFAnimationTrackContainer", "addLowPriorityTrack() : MaxTracks [" + this.dRT + "] reached. Not adding new track");
        }
    }

    public List<lkw> eum() {
        if (this.rDt) {
            return this.rDq;
        }
        return this.rDr;
    }

    public List<lkw> eun() {
        if (!this.rDt) {
            return this.rDq;
        }
        return this.rDr;
    }

    public boolean euo() {
        return this.rDt;
    }

    public void yI(boolean bl) {
        this.rDt = bl;
    }

    public int azI() {
        return this.dRT;
    }

    public void Dj(int n) {
        this.dRT = n;
    }

    public int azJ() {
        return this.dRU;
    }

    public void Dk(int n) {
        this.dRU = n;
    }

    public int eup() {
        return this.rDu;
    }

    public void adu(int n) {
        this.rDu = n;
    }

    public float euq() {
        return this.rDv;
    }

    public void nG(float f) {
        this.rDv = f;
    }

    public List<lkw> eur() {
        return this.rDs;
    }

    public final Object clone() {
        lkx lkx2 = (lkx)super.clone();
        lkx2.rDq = this.bZ(this.rDq);
        lkx2.rDr = this.bZ(this.rDr);
        if (lcw.qHe) {
            lkx2.rDs = this.bZ(this.rDs);
        }
        return lkx2;
    }

    private List<lkw> bZ(List<lkw> list) {
        ArrayList<lkw> arrayList = lcn.emv();
        lkw lkw2 = null;
        for (lkw lkw3 : list) {
            try {
                lkw2 = (lkw)lkw3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lkw3 + "]");
            }
            arrayList.add(lkw2);
        }
        return arrayList;
    }
}

