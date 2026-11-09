/*
 * Decompiled with CFR.
 */
public class awk
extends awj {
    public Boolean crB;

    public String toString() {
        return "SFChatFilterPropertyBoolean[Name=" + (Object)((Object)this.crA.crC) + ", Value=" + (this.crB == null ? "null" : this.crB) + ", ReadOnly=" + this.crA.crE + "]";
    }

    public awk(awl awl2, Boolean bl) {
        super(awl2);
        assert (awl2.crD == awq.crL);
        this.crB = bl;
    }

    @Override
    public boolean Xp() {
        return this.crB != null;
    }

    @Override
    public void set(Object object) {
        assert (object instanceof Boolean);
        this.crB = (Boolean)object;
    }

    @Override
    public Object get() {
        return this.crB;
    }
}

