/*
 * Decompiled with CFR.
 */
import java.util.List;

public class lez {
    private List<lex> rka = lcn.abH(2);

    public void a(lex lex2) {
        if (this.rka.contains(lex2)) {
            lfn.b(5, "SFMultiMessageEventSink", "addEventSink() MessageEventSink was already added: " + lex2);
            return;
        }
        this.rka.add(lex2);
    }

    public boolean b(lex lex2) {
        return this.rka.contains(lex2);
    }

    public boolean ug(ldv ldv2) {
        int n = this.rka.size();
        for (int i = 0; i < n; ++i) {
            lex lex2 = this.rka.get(i);
            if (!lex2.uf(ldv2)) continue;
            return true;
        }
        return false;
    }

    public List<lex> eqs() {
        return this.rka;
    }

    public void uh(ldv ldv2) {
        int n = this.rka.size();
        for (int i = 0; i < n; ++i) {
            lex lex2 = this.rka.get(i);
            if (!lex2.uf(ldv2)) continue;
            this.rka.remove(i);
            return;
        }
        lfn.b(5, "SFMultiMessageEventSink", "removeEventSink() Could not find eventsink with EventListenerGUID=" + ldv2);
    }
}

