/*
 * Decompiled with CFR.
 */
public class atk
extends lmx {
    public boolean bYr = false;
    public static final String bYs = "MEMBER_MAX_NUM_3D_SOUNDS";
    public static final String bYt = "MEMBER_AMBIENCE_VOLUME";
    public static final String bYu = "MEMBER_HITSOUND_ENABLED";
    public static final String bYv = "MEMBER_SOUND_VOLUME";
    public static final String bYw = "MEMBER_PRIVATE_MESSAGE_SOUND_ENABLED";

    public atk() {
        super(a.bYA);
    }

    @Override
    protected boolean a(lob lob2) {
        this.bYr = ((atk)lob2).bYr;
        return super.a(lob2);
    }

    @Override
    public boolean a(lfu lfu2) {
        this.bYr = true;
        boolean bl = super.a(lfu2);
        this.bYr = false;
        return bl;
    }

    public lnt Vi() {
        return (lnt)this.AM(bYs);
    }

    public lnt Vj() {
        return (lnt)this.AM(bYt);
    }

    public lnd Vk() {
        return (lnd)this.AM(bYu);
    }

    public lnd Vl() {
        return (lnd)this.AM(bYw);
    }

    public lnt Vm() {
        return (lnt)this.AM(bYv);
    }
}

