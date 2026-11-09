/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="ResourceGroup")
public class cui {
    public String Name = null;
    public transient int[] bqd = null;
    public boolean NeedsPrefixEnchantmentName = false;
    public boolean NeedsPostfixEnchantmentName = false;
    public String[] ResourceNames = null;
    private static les ResourceTree = lea.enW();

    public boolean wN(int n) {
        int n2 = this.bqd.length;
        for (int i = 0; i < n2; ++i) {
            if (!ResourceTree.isDescendant(n, this.bqd[i])) continue;
            return true;
        }
        return false;
    }

    public void bbS() {
        this.bbU();
        this.bbT();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceGroup: Name='");
        stringBuilder.append(this.Name);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    private void bbT() {
        int n = this.bqd.length;
        for (int i = 0; i < n; ++i) {
            alc.b[] bArray = alc.fT(this.bqd[i]);
            int n2 = bArray.length;
            for (int j = 0; j < n2; ++j) {
                if (bArray[j] != alc.b.brF) continue;
                this.NeedsPostfixEnchantmentName = true;
                return;
            }
        }
    }

    private void bbU() {
        int n = this.bqd.length;
        for (int i = 0; i < n; ++i) {
            alc.b[] bArray = alc.fT(this.bqd[i]);
            int n2 = bArray.length;
            for (int j = 0; j < n2; ++j) {
                if (bArray[j] != alc.b.brE) continue;
                this.NeedsPrefixEnchantmentName = true;
                return;
            }
        }
    }
}

