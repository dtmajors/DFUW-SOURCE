/*
 * Decompiled with CFR.
 */
public class awn
extends awj {
    public Integer crH;

    public String toString() {
        return "SFChatFilterPropertyInteger[Name=" + (Object)((Object)this.crA.crC) + ", Value=" + (this.crH == null ? "null" : this.crH) + ", ReadOnly=" + this.crA.crE + "]";
    }

    public awn(awl awl2, Integer n) {
        super(awl2);
        assert (awl2.crD == awq.crK);
        this.crH = n;
    }

    @Override
    public boolean Xp() {
        return this.crH != null;
    }

    @Override
    public void set(Object object) {
        assert (object instanceof Integer);
        this.crH = (Integer)object;
    }

    @Override
    public Object get() {
        return this.crH;
    }
}

