/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class awp
extends awj {
    private Set<String> crI;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFChatFilterPropertyString[Name=");
        stringBuilder.append((Object)this.crA.crC);
        stringBuilder.append(", Values=");
        if (this.crI == null) {
            stringBuilder.append("null");
        } else {
            boolean bl = true;
            stringBuilder.append("[");
            for (String string : this.crI) {
                if (!bl) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string);
                bl = false;
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(", ReadOnly=");
        stringBuilder.append(this.crA.crE);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public awp(awl awl2, Collection<String> collection) {
        super(awl2);
        assert (awl2.crD == awq.crM);
        if (collection == null) {
            this.crI = null;
        } else {
            this.crI = lcn.emH();
            this.crI.addAll(collection);
        }
    }

    public awp(awl awl2, String string) {
        super(awl2);
        assert (awl2.crD == awq.crM);
        if (string == null) {
            this.crI = null;
        } else {
            this.crI = lcn.emH();
            this.crI.add(string);
        }
    }

    public awp(awl awl2) {
        super(awl2);
        assert (awl2.crD == awq.crM);
        this.crI = null;
    }

    @Override
    public boolean Xp() {
        return this.crI != null;
    }

    public boolean contains(String string) {
        return this.crI != null && this.crI.contains(string);
    }

    public Set<String> Xq() {
        if (this.crI == null) {
            return null;
        }
        TreeSet<String> treeSet = lcn.emH();
        treeSet.addAll(this.crI);
        return treeSet;
    }

    public void eB(String string) {
        if (this.crI == null) {
            this.crI = lcn.emH();
        }
        this.crI.add(string);
    }

    public void eC(String string) {
        if (this.crI == null) {
            return;
        }
        this.crI.remove(string);
    }

    public void clear() {
        this.crI.clear();
    }

    public void remove() {
        this.crI = null;
    }

    @Override
    public void set(Object object) {
        assert (object instanceof String);
        this.clear();
        this.eB((String)object);
    }

    @Override
    public Object get() {
        return this.Xq();
    }
}

