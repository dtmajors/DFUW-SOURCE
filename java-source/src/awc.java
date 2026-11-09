/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class awc {
    final ArrayList<awb> aMC = lcn.emv();

    public String toString() {
        return "SFChatFilterActionList[" + this.aMC.size() + " elements]";
    }

    public void a(awb awb2) {
        this.aMC.add(awb2);
    }

    aws a(awi awi2) {
        aws aws2 = aws.Continue;
        for (int i = 0; i < this.aMC.size(); ++i) {
            awb awb2 = this.aMC.get(i);
            aws2 = awb2.a(awi2);
            assert (aws2 != null);
            if (aws2 != aws.Continue) break;
        }
        return aws2;
    }
}

