/*
 * Decompiled with CFR.
 */
public class lwb
extends lvx {
    private static final lwb tcX = new lwb();
    @lok(value="Clan Configuration")
    @lpl(value="Text to display as the title to the window that is used to configure a clan")
    public static final lox tce = tcX.BC("Title");
    @lok(value="Clan Name")
    @lpl(value="Displayed above the label where the clan's name is displayed")
    public static final lox tcY = tcX.BC("ClanNameTitle");
    @lok(value="Clan Motto (Max $(MaxLength) Characters)")
    @lpl(value="Displayed above the box where the player can enter a motto for the clan they are creating")
    public static final lox tcZ = tcX.a("ClanMottoTitle", lwb.Bh("MaxLength"));
    @lok(value="Clan Charter (Max $(MaxLength) Characters)")
    @lpl(value="Displayed above the box where the player can enter a charter for the clan they are creating")
    public static final lox tda = tcX.a("ClanCharterTitle", lwb.Bh("MaxLength"));
    @lok(value="Membership Restrictions")
    @lpl(value="Displayed above the check-boxes that let the player choose restrcitions on the allowed membership applications to the clan they are creating")
    public static final lox tdb = tcX.BC("MembershipRestrictionsTitle");
    @lok(value="Use these options to determine who can apply to join your clan")
    @lpl(value="Displayed above the check-boxes that let the player choose restrcitions on the allowed membership applications to the clan they are creating")
    public static final lox tdc = tcX.BC("MembershipRestrictionsInfo");
    @lok(value="Accept new member applications?")
    @lpl(value="Displayed next to the check box that lets the player indicate if their clan is currently accepting new members or not")
    public static final lox tdd = tcX.BC("AcceptingNewMembersText");
    @lok(value="Tags")
    @lpl(value="Displayed above the list of clan tags that the player can select for their clan")
    public static final lox tde = tcX.BC("ClanTagsTitle");
    @lok(value="Select tags to identify your clan's activities and playstyle")
    @lpl(value="Displayed above the list of clan tags that the player can select for their clan")
    public static final lox tdf = tcX.BC("ClanTagsInstructions");
    @lok(value="Update Clan")
    @lpl(value="Text to display on the button that is used to update the clan's configuration")
    public static final lox tdg = tcX.BC("UpdateClanButtonText");
    @lok(value="Updating Clan... Please Wait...")
    @lpl(value="Displayed to the player while the clan configuration update request is being processed by the server")
    public static final lox tdh = tcX.BC("UpdatingClanText");
    @lok(value="Leader")
    @lpl(value="String to display above the clan leader's name")
    public static final lox tdi = tcX.BC("LeaderTitle");
    @lok(value="Founder")
    @lpl(value="String to display above the clan founder's name")
    public static final lox tdj = tcX.BC("FounderTitle");
    @lok(value="Write a tagline for your clan...")
    @lpl(value="Displayed in the text input box for the clan motto, when no text has been entered by the player")
    public static final lox tdk = tcX.BC("DefaultClanMottoText");
    @lok(value="Write more information about your clan...")
    @lpl(value="Displayed in the text input box for the clan charter, when no text has been entered by the player")
    public static final lox tdl = tcX.BC("DefaultClanCharterText");
    @lok(value="Select New Leader")
    @lpl(value="Displayed as the title of the clan member selector window, when it is being used to select a new leader for the clan")
    public static final lox lKn = tcX.BC("LeaderSelectorTitle");
    @lok(value="Village Rewards Cycle")
    @lpl(value="Text to display as the title to the village rewards section")
    public static final lox tdm = tcX.BC("VillageRewardsTitle");
    @lok(value="Current Cycle:")
    @lpl(value="Text to display next to the current village rewards cycle values")
    public static final lox tdn = tcX.BC("VillageRewardsCurrent");
    @lok(value="Timer:")
    @lpl(value="Text to display in the label that preceedes the current cycle's timer value")
    public static final lox tdo = tcX.BC("VillageRewardsTimerLabel");
    @lok(value="Rewards:")
    @lpl(value="Text to display in the label that preceedes the current cycle's rewards value")
    public static final lox tdp = tcX.BC("VillageRewardsRewardsLabel");
    @lok(value="Globules:")
    @lpl(value="Text to display in the label that preceedes the current cycle's globules value")
    public static final lox tdq = tcX.BC("VillageRewardsGlobulesLabel");
    @lok(value="Next Cycle:")
    @lpl(value="Text to display next to the next village rewards cycle selection")
    public static final lox tdr = tcX.BC("VillageRewardsNext");
    @lok(value="Changes to the rewards cycle will take effect for the following cycle, the current cycle will remain unaffected")
    @lpl(value="Text to inform clan members how changes to the village rewards cycle will take effect")
    public static final lox tds = tcX.BC("VillageRewardsInfo");
    @lok(value="Timer: $(Timer), Rewards: $(Rewards)%, Globules: $(Globules)")
    @lpl(value="Used to create a village rewards cycle entry, that describes how requisitioning will operate for the clan's villages")
    public static final lox tdt = tcX.a("VillageRewardsCycleOption", lwb.Bi("Timer"), lwb.Bh("Rewards"), lwb.Bh("Globules"));
    @lok(value="No Villages!")
    @lpl(value="Displayed in the all village rewards values labels when the clan owns no villages, therefore has no 'current' cycle to display values for!")
    public static final lox tdu = tcX.BC("VillageRewardsValuesNoVillages");
    @lok(value="$(Timer)")
    @lol(value="Parameter only string -- no translation possible!")
    public static final lox tdv = tcX.a("VillageCycleTimerOnly", lwb.Bi("Timer"));
    @lok(value="$(Rewards)%")
    @lol(value="Parameter only string -- no translation possible!")
    public static final lox tdw = tcX.a("VillageCycleRewardsOnly", lwb.Bh("Rewards"));
    @lok(value="$(Globules)")
    @lol(value="Parameter only string -- no translation possible!")
    public static final lox tdx = tcX.a("VillageCycleGlobulesOnly", lwb.Bh("Globules"));

    protected lwb(String string) {
        super("Configuration." + string);
    }

    private lwb() {
        super("Configuration");
    }
}

