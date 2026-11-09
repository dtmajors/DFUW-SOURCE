/*
 * Decompiled with CFR.
 */
public class jhl {
    public boolean neZ = true;
    public boolean nfa = true;
    public boolean nfb = true;

    public jhl dGi() {
        jhl jhl2 = new jhl();
        jhl2.neZ = this.neZ;
        jhl2.nfa = this.nfa;
        jhl2.nfb = this.nfb;
        return jhl2;
    }

    public boolean a(jhl jhl2) {
        return jhl2.neZ == this.neZ && jhl2.nfa == this.nfa && jhl2.nfb == this.nfb;
    }

    public /* synthetic */ Object clone() {
        return this.dGi();
    }
}

