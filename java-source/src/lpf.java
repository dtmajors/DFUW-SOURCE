/*
 * Decompiled with CFR.
 */
import java.util.List;

public class lpf
extends lpe {
    private List<lpe> rHP;

    public lpf(List<lpe> list) {
        super(lpi.rHT);
        this.rHP = list;
    }

    @Override
    public String a(lom lom2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (lpe lpe2 : this.rHP) {
            stringBuilder.append(lpe2.a(lom2));
        }
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Container{");
        for (lpe lpe2 : this.rHP) {
            stringBuilder.append(lpe2.toString());
            stringBuilder.append(" ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

