/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias(value="String")
public class auf
implements Comparable<auf> {
    @XStreamAsAttribute
    public String Value;

    public auf() {
    }

    public auf(String string) {
        this.Value = string;
    }

    public int a(auf auf2) {
        return this.Value.compareTo(auf2.Value);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        auf auf2 = (auf)object;
        return !(this.Value == null ? auf2.Value != null : !this.Value.equals(auf2.Value));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.Value == null ? 0 : this.Value.hashCode());
        return n2;
    }

    public String toString() {
        return this.Value;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((auf)object);
    }
}

