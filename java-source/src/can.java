/*
 * Decompiled with CFR.
 */
public class can {
    private int ResourceType = 0;

    public can(int n) {
        this.ResourceType = n;
        assert (this.ResourceType > 0);
    }

    public int az() {
        return this.ResourceType;
    }

    public boolean equals(Object object) {
        can can2;
        return object instanceof can && this.ResourceType == (can2 = (can)object).az();
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public int hashCode() {
        return this.ResourceType;
    }

    public String toString() {
        return "SFPaperdollItemKey: Resource='" + this.pa() + "'";
    }
}

