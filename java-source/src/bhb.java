/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class bhb
extends bgk {
    private double dlT = 0.0;

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
        String string = (String)this.dlm.get("message");
        if (string == null) {
            this.fw("Required parameter 'message' missing");
            return;
        }
        kcc kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), lcr.qzd);
        kcc2.akV = "disconnectclients";
        kcc2.ID = "";
        kcc2.pdY = string;
        kcc2.iBr = true;
        this.MessageDelegator.b(kcc2);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 274: {
                this.a((kcd)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kcd kcd2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("Success", "All non-admin clients disconnected");
        this.t(treeMap);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dlT < 1.0) {
            this.dlT = ldz2.rgz + 3.0;
        } else if (ldz2.rgz > this.dlT) {
            this.aoU();
        }
    }
}

