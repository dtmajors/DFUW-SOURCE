/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bia
extends bgk {
    private int dmw = 0;

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        TreeMap<String, String> treeMap;
        if (this.dmw == 0) {
            this.dmw = ldz2.lpr + 500;
            treeMap = lcn.emG();
            treeMap.put("StartTick", "" + ldz2.lpr);
            treeMap.put("EndOfLifeTick", "" + this.dmw);
            this.t(treeMap);
        }
        if (this.dmw == ldz2.lpr + 250) {
            treeMap = lcn.emG();
            treeMap.put("CurrentTick", "" + ldz2.lpr);
            treeMap.put("EndOfLifeTick", "" + this.dmw);
            this.t(treeMap);
        }
        if (this.dmw == ldz2.lpr) {
            treeMap = lcn.emG();
            treeMap.put("EndOfLifeTick", "" + this.dmw);
            this.t(treeMap);
            this.aoU();
        }
    }
}

