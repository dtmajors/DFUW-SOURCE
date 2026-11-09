/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class awt {
    public final String Name;
    public final awe crd;
    public final int crS = 10;
    public final int crT = 10;
    private static awc crU = new awc();
    ArrayList<awr> crV = new ArrayList();

    public awt(awe awe2, String string) {
        this.Name = string;
        this.crd = awe2;
    }

    public void a(awr awr2) {
        this.crV.add(awr2);
    }

    public aws e(awi awi2) {
        awi2.b(awm.PrimaryTableName).set(this.Name);
        for (int i = 0; i < 10; ++i) {
            aws aws2 = this.f(awi2);
            if (aws2 == aws.Restart) {
                continue;
            }
            return aws2;
        }
        awi2.b(awm.PrimaryTableName).set(null);
        return aws.Continue;
    }

    private aws f(awi awi2) {
        this.crd.b(this);
        awi2.b(awm.CurrentTableName).set(this.Name);
        boolean bl = false;
        int n = 0;
        int n2 = this.crV.size();
        int n3 = 0;
        block5: while (n < n2) {
            awr awr2 = this.crV.get(n);
            if (awr2.c(awi2)) {
                aws aws2 = awr2.d(awi2);
                assert (aws2 != null);
                switch (aws2) {
                    case Stop: 
                    case RestartAll: {
                        this.crd.c(this);
                        awi2.b(awm.CurrentTableName).set(null);
                        return aws2;
                    }
                    case Restart: {
                        n = 0;
                        if (++n3 < 10) continue block5;
                        return aws.Return;
                    }
                    case Return: {
                        this.crd.c(this);
                        awi2.b(awm.CurrentTableName).set(null);
                        return aws.Continue;
                    }
                }
            }
            ++n;
        }
        this.crd.c(this);
        awi2.b(awm.CurrentTableName).set(null);
        return aws.Continue;
    }
}

