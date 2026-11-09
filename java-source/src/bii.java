/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
public class bii
extends bgk {
    bii() {
    }

    @Override
    public void initialize() {
        super.initialize();
        gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
        if (gg2 == null) {
            this.fw("Could not find gamelogic distributor");
            return;
        }
        gg2.hz().bcV();
        this.aoU();
    }
}

