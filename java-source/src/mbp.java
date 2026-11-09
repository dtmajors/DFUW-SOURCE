/*
 * Decompiled with CFR.
 */
public class mbp
extends mai {
    private static final mbp ukS = new mbp();
    @lok(value="Our clan and the clan '$(ClanName)' are now allied")
    @lpl(value="Notification sent to all on-line clan members when a mutual political stance of ally is achieved between their clan and another clan")
    public static final lox ukT = ukS.a("ClanAllied", mbp.Bk("ClanName"));
    @lok(value="The clan '$(ClanName)' is no longer an ally of our clan!")
    @lpl(value="Notification sent to all on-line clan members when a mututal political stance of ally that existed between their clan and another clan ends")
    public static final lox ukU = ukS.a("ClanNoLongerAlly", mbp.Bk("ClanName"));
    @lok(value="The clan '$(ClanName)' has declared war on our clan!")
    @lpl(value="Notification sent to all on-line clan members when another clan declares war on their clan")
    public static final lox ukV = ukS.a("ClanDeclaredWar", mbp.Bk("ClanName"));
    @lok(value="$(MemberName) has declared war on the clan '$(ClanName)")
    @lpl(value="Notification sent to all on-line clan members when their clan declares war on another clan")
    public static final lox ukW = ukS.a("WarDeclared", mbp.Bk("MemberName"), mbp.Bk("ClanName"));
    @lok(value="Your clan has declared war on the clan '$(ClanName)")
    @lpl(value="Notification sent to all on-line clan members when their clan declares war on another clan, but the cause is unknown (probably administrative intervention)")
    public static final lox ukX = ukS.a("WarDeclaredCauseUnknown", mbp.Bk("ClanName"));
    @lok(value="The war between our clan and the clan '$(ClanName)' has ended")
    @lpl(value="Notification sent to all on-line clan members when a war between their clan and another clan ends")
    public static final lox ukY = ukS.a("ClanWarExpired", mbp.Bk("ClanName"));
    @lok(value="$(MemberName) has changed our clan's political stance towards the clan '$(ClanName)' to $(Stance)")
    @lpl(value="Notification sent to all on-line clan members when their clan's political stance towards another clan has been changed by one of their clan members")
    public static final lox ukZ = ukS.a("OurClanStanceChanged", mbp.Bk("MemberName"), mbp.Bk("ClanName"), mbp.b("Stance", bcr.class));
    @lok(value="Our clan's political stance towards clan '$(ClanName)' has been changed to $(Stance)")
    @lpl(value="Notification sent to all on-line clan members when their clan's political stance towards another clan has been changed, but the cause is unknown (probably administrative intervention)")
    public static final lox ula = ukS.a("OurClanStanceChangedCauseUnknown", mbp.Bk("ClanName"), mbp.b("Stance", bcr.class));
    @lok(value="The clan '$(ClanName)' has changed their political stance towards our clan to $(Stance)")
    @lpl(value="Noification sent to all on-line clan members when another clan's political stance towards their clan has been changed")
    public static final lox ulb = ukS.a("OtherClanStanceChanged", mbp.Bk("ClanName"), mbp.b("Stance", bcr.class));

    protected mbp(String string) {
        super("Politics." + string);
    }

    private mbp() {
        super("Politics");
    }
}

