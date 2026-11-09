/*
 * Decompiled with CFR.
 */
public class amd {
    private Class ObjectClass;
    private String Name;
    private cqi[] bui;
    private int[] bun;
    private amd buo;

    public amd(Class clazz, amd amd2, String string, cqi[] cqiArray, int[] nArray) {
        assert (cqiArray != null);
        amd.a(string, cqiArray, amd2 == null ? 0 : amd2.getPropertyCount());
        assert (nArray == null || nArray.length == cqiArray.length + (amd2 == null ? 0 : amd2.getPropertyCount()));
        this.ObjectClass = clazz;
        this.buo = amd2;
        this.Name = string;
        this.bui = cqiArray;
        this.bun = nArray;
    }

    public amc FJ() {
        try {
            return (amc)this.ObjectClass.newInstance();
        }
        catch (Exception exception) {
            return new amc(this);
        }
    }

    public final String getName() {
        return this.Name;
    }

    public boolean a(amd amd2) {
        if (amd2 == this) {
            return true;
        }
        if (this.buo == null) {
            return false;
        }
        return this.buo.a(amd2);
    }

    public final int getPropertyCount() {
        int n = this.bui.length;
        if (this.buo != null) {
            n += this.buo.getPropertyCount();
        }
        return n;
    }

    public final cqi gH(int n) {
        int n2 = n;
        if (this.buo != null && (n2 -= this.buo.getPropertyCount()) < 0) {
            return this.buo.gH(n);
        }
        return this.bui[n2];
    }

    public final int dm(String string) {
        int n = this.getPropertyCount();
        for (int i = 0; i < n; ++i) {
            if (!string.equalsIgnoreCase(this.gH(i).getPropertyName())) continue;
            return i;
        }
        return -1;
    }

    public final int[] FK() {
        return this.bun;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SFLogicObjectGenericClass: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append("Name=");
        stringBuilder.append(this.Name);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static void a(String string, cqi[] cqiArray, int n) {
        for (int i = 0; i < cqiArray.length; ++i) {
            assert (cqiArray[i].anD() == i + n) : "object: '" + string + "' " + "property: '" + cqiArray[i].getPropertyName() + "' " + "found ID: " + cqiArray[i].anD() + " " + "expected ID: " + i;
            assert (cqiArray[i].getPropertyName().length() > 0) : string + " " + i + " " + cqiArray[i].getPropertyName();
            assert (cqiArray[i].getPropertyName().indexOf(32) == -1) : string + " " + i + " " + cqiArray[i].getPropertyName();
            for (int j = 0; j < i; ++j) {
                assert (!cqiArray[j].getPropertyName().equalsIgnoreCase(cqiArray[i].getPropertyName())) : string + " " + j + " " + cqiArray[j].getPropertyName() + " " + i + " " + cqiArray[i].getPropertyName();
            }
        }
    }
}

