/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Set;

public class lkk {
    private a rqI;
    private boolean bC = false;
    private Set<lkt> rqJ = lcn.emH();
    private final double rqK = 0.005;

    public lkk(a a2) {
        this.rqI = a2;
    }

    public lkt aL(ldz ldz2) {
        if (this.rqJ.isEmpty()) {
            return null;
        }
        Iterator<lkt> iterator = this.rqJ.iterator();
        while (iterator.hasNext()) {
            lkt lkt2 = iterator.next();
            if (!(lkt2.rrr <= ldz2.rgz + 0.005)) continue;
            if (this.bC) {
                lfn.b(0, this.getClass().getName(), "getNextAnimation() : Found Pending Animation to Start. QueType = " + (Object)((Object)this.rqI) + ", StartTime = " + lkt2.rrr + ", CurrentTime = " + ldz2.rgz + ", Animation = " + lkt2);
            }
            iterator.remove();
            return lkt2;
        }
        return null;
    }

    public int getQueueLength() {
        return this.rqJ.size();
    }

    public void c(lkt lkt2) {
        if (this.bC) {
            lfn.b(0, this.getClass().getSimpleName(), "addAnimationWithStartTime() : Adding State to Queue = " + lkt2);
        }
        this.rqJ.add(lkt2);
    }

    public void d(lkt lkt2) {
        if (this.rqI == a.rqM) {
            return;
        }
        if (this.rqJ.isEmpty()) {
            return;
        }
        if (lkt2.rrq != lkt.a.rru) {
            return;
        }
        for (lkt lkt3 : this.rqJ) {
            if (lkt3.rrq != lkt.a.rrx && lkt3.rrq != lkt.a.rrw) continue;
            if (this.bC) {
                lfn.b(0, this.getClass().getSimpleName(), "addAnimationWithStartTime() : RemovePartial in Queue! Changing Primary anim to removePartial");
            }
            lkt2.rrq = lkt.a.rrw;
            break;
        }
    }

    public void etG() {
        if (this.bC) {
            lfn.b(4, this.getClass().getSimpleName(), "clearQueue() : Type = " + (Object)((Object)this.rqI));
        }
        if (this.rqJ.isEmpty()) {
            return;
        }
        if (this.bC) {
            lfn.b(0, this.getClass().getSimpleName(), "clearQueue() : Queue size = " + this.rqJ.size());
            for (lkt lkt2 : this.rqJ) {
                lfn.b(0, this.getClass().getSimpleName(), "clearQueue() : Removing: " + lkt2);
            }
        }
        this.rqJ.clear();
    }

    public lkt a(lkt lkt2, ldz ldz2, lcb lcb2, lks lks2, lkz lkz2) {
        double d2;
        Object object;
        lkr lkr2 = null;
        double d3 = ldz2.rgz;
        if (!this.rqJ.isEmpty()) {
            object = this.rqJ.iterator();
            int n = 0;
            while (object.hasNext()) {
                lkt lkt3 = object.next();
                if (lkt3.rrr > ldz2.rgz + 0.005 && n == 0) {
                    d3 = lkt3.rrr;
                    lkr2 = lks2.adk(lkt3.dRF);
                    if (this.bC) {
                        lfn.b(0, this.getClass().getName(), "queueAnimation() : LatestStarting Anim at index[" + n + "] Set [" + lkt3.dRF + "] has StartTime = " + lkt3.rrr);
                    }
                    break;
                }
                ++n;
            }
        } else {
            lkr2 = lks2.adk(lkt2.dRF);
        }
        if (lkr2 == null) {
            lfn.b(5, this.getClass().getName(), "queueAnimation() : NewAnimation state [" + lkt2.dRF + "] is invalid!");
            return null;
        }
        object = null;
        double d4 = 0.0;
        if (!lkr2.isPartial()) {
            object = lcb2.qvQ;
            d4 = lcb2.qvS;
        } else {
            object = lcb2.qvR;
            d4 = lcb2.qvT;
        }
        if (object == null) {
            return lkt2;
        }
        if (d3 != ldz2.rgz) {
            if (this.bC) {
                lfn.b(5, this.getClass().getSimpleName(), "queueAnimation() : THERE is something in the Queue? Size = " + this.rqJ.size() + ", AbsReference will be used!");
            }
            d4 = d3;
        }
        lky lky2 = lkz2.a(true, lkr2, lcb2);
        double d5 = 0.0;
        if (((lkr)object).bEX() != 0.0f && lkt2.fXV != 0.0f) {
            d5 = (double)(((lkr)object).etP() / (((lkr)object).bEX() * lcb2.pIs)) - lky2.euB();
            if (this.bC) {
                lfn.b(0, this.getClass().getSimpleName(), "queueAnimation() : DelayValue = " + d5 + ", AnimLength = " + ((lkr)object).etP() + ", TrackSpeed = " + ((lkr)object).bEX() + ", SpeedMultiuplier = " + lcb2.pIs);
            }
        }
        if (d5 < 0.0) {
            d5 = 0.0;
        }
        if ((d2 = d4 + d5) < ldz2.rgz) {
            if (this.bC) {
                lfn.b(0, this.getClass().getName(), "queueAnimation() : DelayTime < CurrentTime, so starting queued anim NOW.");
            }
            return lkt2;
        }
        lkt2.rrr = d4 + d5;
        boolean bl = this.rqJ.add(lkt2);
        if (this.bC) {
            lfn.b(0, this.getClass().getSimpleName(), "queueAnimation() : Result of QueueAdd = " + bl + ", DelayValue = " + d5 + ", StartTime = " + d2 + ", Current TotalTime  =" + ldz2.rgz);
        }
        return null;
    }

    public void yB(boolean bl) {
        this.bC = bl;
    }
}

