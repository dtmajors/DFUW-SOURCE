/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class itj {
    public final jll<itj> myP = new jll();
    private ith myQ;
    private ith myR;

    public itj(ith ith2) {
        assert (ith2 != null);
        this.myR = this.myQ = ith2;
    }

    public ith dqJ() {
        return this.myQ;
    }

    public ith dqK() {
        return this.myR;
    }

    public void a(ith ith2) {
        if (ith2 == null) {
            return;
        }
        if (!iti.b(this.myQ, ith2)) {
            assert (false);
            return;
        }
        this.myR = ith2;
        this.myP.V(this);
    }

    public List<ith> getPath() {
        ArrayList<ith> arrayList = lcn.emv();
        ith ith2 = this.myQ.dqI();
        for (ith ith3 = this.myR; ith3 != ith2; ith3 = ith3.dqI()) {
            arrayList.add(ith3);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}

