/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class ljy {
    private String rpQ;
    private String[] rnf;

    public String[] erR() {
        return this.rnf;
    }

    public void T(String[] stringArray) {
        this.rnf = stringArray;
    }

    public List eta() {
        ArrayList<String> arrayList = lcn.emv();
        for (int i = 0; i < this.rnf.length; ++i) {
            String string = this.rnf[i];
            arrayList.add(string);
        }
        return arrayList;
    }

    public String etb() {
        return this.rpQ;
    }

    public void Ax(String string) {
        this.rpQ = string;
    }

    public String toString() {
        String string = "AnimSetName = " + this.rpQ + ", BoneNames = ";
        for (int i = 0; i < this.rnf.length; ++i) {
            String string2 = this.rnf[i];
            string = string + "[" + string2 + "], ";
        }
        return string;
    }
}

