/*
 * Decompiled with CFR.
 */
public class awo
extends awj {
    public String Value;

    public String toString() {
        return "SFChatFilterPropertyString[Name=" + (Object)((Object)this.crA.crC) + ", Value=" + (this.Value == null ? "null" : this.Value) + ", ReadOnly=" + this.crA.crE + "]";
    }

    public awo(awl awl2, String string) {
        super(awl2);
        assert (awl2.crD == awq.crJ);
        this.Value = string;
    }

    @Override
    public boolean Xp() {
        return this.Value != null;
    }

    @Override
    public void set(Object object) {
        assert (object == null || object instanceof String);
        this.Value = (String)object;
    }

    @Override
    public Object get() {
        return this.Value;
    }

    public void eA(String string) {
        if (string.isEmpty()) {
            return;
        }
        if (string.charAt(0) == '/' && string.length() > 3 && string.charAt(string.length() - 1) == '/' && string.indexOf(47, 1) < string.length() - 1) {
            int n = string.indexOf(47, 1);
            String string2 = string.substring(1, n);
            String string3 = string.substring(n + 1, string.length() - 1);
            this.Value = this.Value.replaceAll(string2, string3);
        } else if (string.indexOf(124) >= 0) {
            int n = string.indexOf(124);
            String string4 = string.substring(0, n).toLowerCase();
            String string5 = string.substring(n + 1);
            String string6 = this.Value.toLowerCase();
            for (n = 0; n < string6.length() && (n = string6.indexOf(string4, n)) >= 0; n += string4.length()) {
                this.Value = this.Value.substring(0, n) + string5 + this.Value.substring(n + string4.length());
                string6 = string6.substring(0, n) + string5 + string6.substring(n + string4.length());
            }
        }
    }
}

