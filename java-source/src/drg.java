/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class drg
extends dqv {
    private String gSz = "env_map.dds";

    public drg() {
        this.ObjectType = 81;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.bvr();
            this.Initialized = true;
        }
    }

    private void bvr() {
        kjr kjr2 = (kjr)this.MessageDelegator.h(1805);
        kjr2.Yn(1);
        kjr2.ja("env_map.dds");
        kjr2.ts(lcr.qAD);
        kjr2.tD(this.MessageDelegator.bzv());
        this.MessageDelegator.a(kjr2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public String bvs() {
        return this.gSz;
    }

    public void ja(String string) {
        this.gSz = string;
    }

    @Override
    public Object gG(int n) {
        return null;
    }

    @Override
    public void a(int n, Object object) {
    }
}

