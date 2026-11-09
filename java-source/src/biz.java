/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class biz
extends bgk {
    private String azF;
    public static final biv.a dnI = biv.a.dnq;
    public static final String dmn = "fetchbindstoneposition";

    @Override
    public void initialize() {
        super.initialize();
        this.azF = (String)this.dlm.get("BindStoneName");
        if (this.azF == null) {
            this.fw("Expected parameter 'BindStoneName'");
            return;
        }
        ebj ebj2 = (ebj)this.MessageDelegator.h(17426, this.getGUID(), lcr.qEq);
        ebj2.azF = this.azF;
        this.MessageDelegator.E(ebj2);
    }

    private void a(ebk ebk2) {
        if (!ebk2.azF.equals(this.azF)) {
            this.fw("Incorrect response from GlobalBindStoneServer");
            return;
        }
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("BindStoneName", this.azF);
        if (ebk2.Position != null) {
            treeMap.put("X", "" + ebk2.Position.x);
            treeMap.put("Y", "" + ebk2.Position.y);
            treeMap.put("Z", "" + ebk2.Position.rlV);
        }
        this.t(treeMap);
        this.aoU();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17427: {
                this.a((ebk)dxq2);
                return;
            }
        }
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        super.receiveMiddlewareMessage(kcz2);
    }
}

