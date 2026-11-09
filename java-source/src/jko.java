/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class jko {
    private static int nsZ = 0;
    private int hf = nsZ++;
    private jkp nta;
    private float ntb = 0.0f;
    private float ntc = 0.0f;
    private HashSet<String> ntd = new HashSet();

    public jko(jkp jkp2, float f2, float f3, String ... stringArray) {
        this.nta = jkp2;
        this.ntb = f2;
        this.ntc = f3;
        this.ntd.addAll(Arrays.asList(stringArray));
    }

    public int getId() {
        return this.hf;
    }

    public jkp dLi() {
        return this.nta;
    }

    public float dLj() {
        return this.ntb;
    }

    public float dLk() {
        return this.ntc;
    }

    public Set<String> dLl() {
        return Collections.unmodifiableSet(this.ntd);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" [");
        stringBuilder.append("Type=");
        stringBuilder.append(this.nta.toString());
        stringBuilder.append(", Attrs=[");
        int n = 0;
        for (String string : this.ntd) {
            if (n > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
            ++n;
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}

