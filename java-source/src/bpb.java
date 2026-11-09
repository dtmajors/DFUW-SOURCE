/*
 * Decompiled with CFR.
 */
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bpb {
    private Random DZ = new Random();
    private static final Pattern dyG = Pattern.compile("\\#([a-zA-z]++)\\#");
    private Matcher dyH = null;

    public String a(dty dty2, bpg bpg2) {
        return dty2.QuestStartText;
    }

    public String a(dty dty2, bph bph2) {
        return dty2.QuestEndText;
    }

    public String a(dty dty2, bph bph2, int n) {
        due due2 = dty2.Ce(n);
        String string = due2.QuestStartText;
        return string;
    }

    public String b(dty dty2, bph bph2, int n) {
        due due2 = dty2.Ce(n);
        String string = due2.QuestFinishedText;
        return string;
    }

    public String c(dty dty2, bph bph2, int n) {
        due due2 = dty2.Ce(n);
        String string = due2.QuestEndText;
        return string;
    }
}

