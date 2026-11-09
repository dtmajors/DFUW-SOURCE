/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class bir
extends bgk {
    private int dmw = 0;
    private long dmN = 0L;

    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("doit");
        if (string == null) {
            this.fw("Required parameter: doit=true");
            return;
        }
        if (!string.toLowerCase().equals("true")) {
            this.fw("Required parameter: doit=true");
            return;
        }
        this.Active = true;
        fzp fzp2 = (fzp)this.MessageDelegator.h(7172, this.getGUID(), lcr.qAV);
        fzp2.jbR = true;
        this.dmN = System.currentTimeMillis();
        this.MessageDelegator.E(fzp2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7173: {
                this.b((fzq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(fzq fzq2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("SaveResult", fzq2.eo ? "OK" : "Failed");
        if (fzq2.aMH != null) {
            treeMap.put("Reason", fzq2.aMH);
        }
        long l = System.currentTimeMillis() - this.dmN;
        String string = "" + l / 1000L + "." + ("" + (l % 1000L + 1000L)).substring(1);
        treeMap.put("Duration", string);
        this.t(treeMap);
        this.aoU();
    }
}

