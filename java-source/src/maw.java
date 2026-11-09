/*
 * Decompiled with CFR.
 */
public class maw
extends mai {
    private static final maw ufv = new maw();
    @lok(value="$(CapturerRank) $(CapturerName) successfully captured the fortress $(FortressName)")
    @lpl(value="Displayed to all clan members when the clan captures a fortress")
    public static final lox ufw = ufv.a("FortressCaptured", maw.b("CapturerRank", bbs.class), maw.Bk("CapturerName"), maw.Bk("FortressName"));
    @lok(value="Your clan successfully captured the fortress $(FortressName)")
    @lpl(value="Displayed to all clan members when the clan captures a fortress, but the capturer member cannot be determined")
    public static final lox ufx = ufv.a("FortressCapturedCapturerUnknown", maw.Bk("FortressName"));
    @lok(value="$(ClanName) has captured the fortress $(FortressName)")
    @lpl(value="Displayed to all on-line players when a clan captures a fortress")
    public static final lox ufy = ufv.a("FortressCapturedGlobal", maw.Bk("ClanName"), maw.Bk("FortressName"));
    @lok(value="$(CapturerRank) $(CapturerName) successfully recaptured the fortress $(FortressName)")
    @lpl(value="Displayed to all clan members when the clan recaptures a fortress")
    public static final lox ufz = ufv.a("FortressRecaptured", maw.b("CapturerRank", bbs.class), maw.Bk("CapturerName"), maw.Bk("FortressName"));
    @lok(value="Your clan successfully recaptured the fortress $(FortressName)")
    @lpl(value="Displayed to all clan members when the clan recaptures a fortress, but the capturer member cannot be determined")
    public static final lox ufA = ufv.a("FortressRecapturedCapturerUnknown", maw.Bk("FortressName"));
    @lok(value="$(ClanName) has recaptured the fortress $(FortressName)")
    @lpl(value="Displayed to all on-line players when a clan recaptures a fortress")
    public static final lox ufB = ufv.a("FortressRecapturedGlobal", maw.Bk("ClanName"), maw.Bk("FortressName"));
    @lok(value="You have lost the fortress $(FortressName) due to it timing-out")
    @lpl(value="Displayed to all clan members when the clan loses a fortress because it timed-out")
    public static final lox ufC = ufv.a("FortressLostTimedOut", maw.Bk("FortressName"));
    @lok(value="$(ClanName) has captured the fortress $(FortressName)")
    @lpl(value="Displayed to all clan members when the clan loses a fortress because another clan captured it")
    public static final lox ufD = ufv.a("FortressLostToOtherClan", maw.Bk("ClanName"), maw.Bk("FortressName"));
    @lok(value="$(ClanName) has captured the fortress $(FortressName) from $(PreviousOwnerClanName)")
    @lpl(value="Displayed to all on-line players when a clan loses a fortress because another clan captured it")
    public static final lox ufE = ufv.a("FortressLostToOtherClanGlobal", maw.Bk("ClanName"), maw.Bk("FortressName"), maw.Bk("PreviousOwnerClanName"));
    @lok(value="For capturing $(FortressName) your clan has received $(RewardAmount) $(RewardResource.Name$(RewardAmount.Plurality))")
    @lpl(value="Displayed to all clan members when the clan receives a reward for capturing a fortress")
    public static final lox ufF = ufv.a("FortressReward", maw.Bk("FortressName"), maw.Bh("RewardAmount"), maw.Bl("RewardResource"));
    @lok(value="You cannot capture the fortress, since you are not a member of a clan")
    @lpl(value="Displayed to a player when they attempt to capture a fortress, but are not a member of any clan")
    public static final lox ufG = ufv.BC("CannotCaptureNoClan");
    @lok(value="The fortress $(FortressName) is now vulnerable")
    @lpl(value="Displayed to all on-line players when a fortress becomes vulnerable")
    public static final lox ufH = ufv.a("FortressVulnerableGlobal", maw.Bk("FortressName"));
    @lok(value="The lighthouses in fortress $(FortressName) are being attacked!")
    @lpl(value="Displayed to all clan members players when the lighthouses of a fortress they own is being attacked")
    public static final lox ufI = ufv.a("FortressLighthousesUnderAttack", maw.Bk("FortressName"));
    @lok(value="A lighthouse in fortress $(FortressName) was destroyed!")
    @lpl(value="Displayed to all clan members players when the lighthouses of a fortress was destroyed")
    public static final lox ufJ = ufv.a("FortressLighthouseDestroyed", maw.Bk("FortressName"));
    @lok(value="All lighthouses in fortress $(FortressName) were destroyed. The fortress will become vulnerable in $(x) minutes")
    @lpl(value="Displayed to everyone when all lighthouses are destroyed")
    public static final lox ufK = ufv.a("FortressAllLighthousesDestroyed", maw.Bk("FortressName"), maw.Bh("x"));

    protected maw(String string) {
        super("Fortresses." + string);
    }

    private maw() {
        super("Fortresses");
    }
}

