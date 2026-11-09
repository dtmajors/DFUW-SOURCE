/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class ibl
extends hym {
    public ibl(int n, int n2) {
        super(n, n2);
        this.c(this.cMx());
    }

    public void cbU() {
    }

    public void cGR() {
    }

    private ArrayList<hyj> cMx() {
        ArrayList<hyj> arrayList = lcn.emv();
        arrayList.add(new hyj(this, lvw.tbQ.bD(new Object[0]).exA().toUpperCase()){
            final /* synthetic */ ibl lFh;
            {
                this.lFh = ibl2;
                super(string);
            }

            public void cDS() {
                this.lFh.cbU();
            }
        });
        arrayList.add(new hyj(this, lvw.tbR.bD(new Object[0]).exA().toUpperCase()){
            final /* synthetic */ ibl lFh;
            {
                this.lFh = ibl2;
                super(string);
            }

            public void cDS() {
                this.lFh.cGR();
            }
        });
        return arrayList;
    }
}

