/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;
import java.util.Set;

public class awi {
    private final Map<awm, awj> cry;
    public final awe crd;
    public final auk crz;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFChatFilterMessage[");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String ez(String string) {
        if (string == null) {
            return null;
        }
        int n = string.indexOf("$(");
        while (n >= 0) {
            int n2 = string.indexOf(41, n);
            if (n2 < 0) {
                lfn.b(5, "SFChatFilterMessage", "expandVariables(): Error expanding '" + string + "'");
            } else {
                String string2 = string.substring(n + 2, n2);
                try {
                    awm awm2 = awm.valueOf(string2);
                    string = string.substring(0, n) + this.b(awm2).get().toString() + string.substring(n2 + 1);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            n = string.indexOf("$(", n + 1);
        }
        return string;
    }

    public awi(awe awe2, auk auk2) {
        this.crd = awe2;
        this.crz = auk2;
        this.cry = this.crd.Xl();
        this.cry.get((Object)awm.FromName).set(this.crz.ccU);
        this.cry.get((Object)awm.FromFirstName).set(awe.ex(this.crz.ccU));
        this.cry.get((Object)awm.FromLastName).set(awe.ey(this.crz.ccU));
        if (this.crz.ccS != null) {
            if (this.crz.ccS.length >= 1) {
                this.cry.get((Object)awm.NotificationParam1).set(this.crz.ccS[0]);
            }
            if (this.crz.ccS.length >= 2) {
                this.cry.get((Object)awm.NotificationParam2).set(this.crz.ccS[1]);
            }
            if (this.crz.ccS.length >= 3) {
                this.cry.get((Object)awm.NotificationParam3).set(this.crz.ccS[2]);
            }
        }
        this.cry.get((Object)awm.NotificationSubType).set(this.crz.ccR);
        if (this.crz.ccQ != null) {
            this.cry.get((Object)awm.SystemNotificationType).set(this.crz.ccQ.toString());
            if (lea.eoH().j(this.crz.ccQ) != null) {
                this.cry.get((Object)awm.ChatBucket).set(lea.eoH().j(this.crz.ccQ).ChatBucket);
            }
        }
        if (this.crz.ccW != null) {
            this.cry.get((Object)awm.ChatTarget).set(this.crz.ccW.toString());
        }
        this.cry.get((Object)awm.Text).set(this.crz.aFo);
        this.cry.get((Object)awm.TimeStamp).set((int)(this.crz.aEW / 1000L));
        this.cry.get((Object)awm.ToName).set(this.crz.ccV);
        this.cry.get((Object)awm.ToFirstName).set(awe.ex(this.crz.ccV));
        this.cry.get((Object)awm.ToLastName).set(awe.ey(this.crz.ccV));
        this.cry.get((Object)awm.OriginTabName).set(this.crz.ccT);
        if (this.crz.Position != null) {
            lej lej2 = lcw.dW((ljq)this.crz.Position);
            if (lej2 != null) {
                String string = lea.h(lej2).getDisplayName();
                this.cry.get((Object)awm.SenderLocationName).set(string);
            }
            if (this.crd.crm != null && this.crd.crm.aAG() != null && this.crd.crm.aAG().av() != null) {
                int n = (int)this.crz.Position.ez(this.crd.crm.aAG().av());
                this.cry.get((Object)awm.DistanceToSender).set(n);
            }
            this.crd.crm.aAG().av();
        }
        if (this.crz.add != null) {
            this.cry.get((Object)awm.SenderClanRank).set("" + (Object)((Object)bbs.getValueByOrdinal(this.crz.ccX)));
            this.cry.get((Object)awm.SenderClanAccessLevel).set(this.crz.ccX);
            this.cry.get((Object)awm.SenderClanName).set(this.crz.add);
        }
    }

    public awj b(awm awm2) {
        return this.cry.get((Object)awm2);
    }

    public awi Xm() {
        awi awi2 = new awi(this.crd, this.crz);
        block3: for (awj awj2 : this.cry.values()) {
            switch (awj2.crA.crD) {
                case crM: {
                    awp awp2 = (awp)awj2;
                    awp awp3 = (awp)awi2.b(awj2.crA.crC);
                    awp3.clear();
                    for (String string : awp2.Xq()) {
                        awp3.eB(string);
                    }
                    continue block3;
                }
                default: {
                    awi2.b(awj2.crA.crC).set(awj2.get());
                }
            }
        }
        return awi2;
    }

    public void Xn() {
        block4: for (awj awj2 : this.cry.values()) {
            if (awj2.crA.crE) continue;
            switch (awj2.crA.crD) {
                case crJ: {
                    if (awj2.get() == null) break;
                    awj2.set(this.ez(awj2.get().toString()));
                    break;
                }
                case crM: {
                    if (awj2.get() == null) break;
                    awp awp2 = (awp)awj2;
                    Set<String> set = awp2.Xq();
                    awp2.clear();
                    for (String string : set) {
                        string = this.ez(string);
                        awp2.eB(string);
                    }
                    continue block4;
                }
            }
        }
    }

    public void Xo() {
        for (awj awj2 : this.cry.values()) {
            if (awj2.crA.crF || awj2.get() != null) continue;
            awj2.set(awj2.crA.crG);
        }
    }
}

