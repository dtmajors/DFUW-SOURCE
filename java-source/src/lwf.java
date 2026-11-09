/*
 * Decompiled with CFR.
 */
public class lwf
extends lvx {
    private static final lwf tdD = new lwf();
    @lok(value="Create New Clan")
    @lpl(value="Text to display as the title to the window that is used to create a new clan")
    public static final lox tce = tdD.BC("Title");
    @lok(value="Enter the information for the clan to create... Creating a clan costs $(CostValue) $(CostResource.Name$(CostValue.Plurality))")
    @lpl(value="Text to display to instruct the player what to do to create a new clan, and to inform them of the restrictions and costs involved")
    public static final lox tdE = tdD.a("Instructions", lwf.Bh("CostValue"), lwf.Bl("CostResource"));
    @lok(value="Clan Name (Max $(MaxLength) Characters)")
    @lpl(value="Displayed above the box where the player can enter the name of the clan to create")
    public static final lox tcY = tdD.a("ClanNameTitle", lwf.Bh("MaxLength"));
    @lok(value="Write a name for your clan...")
    @lpl(value="Displayed in the text input box for the clan name, when no text has been entered by the player")
    public static final lox tdF = tdD.BC("DefaultClanNameText");
    @lok(value="Clan Motto (Max $(MaxLength) Characters)")
    @lpl(value="Displayed above the box where the player can enter a motto for the clan they are creating")
    public static final lox tcZ = tdD.a("ClanMottoTitle", lwf.Bh("MaxLength"));
    @lok(value="Write a tagline for your clan...")
    @lpl(value="Displayed in the text input box for the clan motto, when no text has been entered by the player")
    public static final lox tdk = tdD.BC("DefaultClanMottoText");
    @lok(value="Clan Charter (Max $(MaxLength) Characters)")
    @lpl(value="Displayed above the box where the player can enter a charter for the clan they are creating")
    public static final lox tda = tdD.a("ClanCharterTitle", lwf.Bh("MaxLength"));
    @lok(value="Write more information about your clan...")
    @lpl(value="Displayed in the text input box for the clan charter, when no text has been entered by the player")
    public static final lox tdl = tdD.BC("DefaultClanCharterText");
    @lok(value="Membership Restrictions")
    @lpl(value="Displayed above the check-boxes that let the player choose restrcitions on the allowed membership applications to the clan they are creating")
    public static final lox tdb = tdD.BC("MembershipRestrictionsTitle");
    @lok(value="Use these options to determine who can apply to join your clan")
    @lpl(value="Displayed above the check-boxes that let the player choose restrcitions on the allowed membership applications to the clan they are creating")
    public static final lox tdc = tdD.BC("MembershipRestrictionsInfo");
    @lok(value="Accepting membership applications?")
    @lpl(value="Displayed next to the check box that lets the player indicate if their clan is currently accepting new members or not")
    public static final lox tdd = tdD.BC("AcceptingNewMembersText");
    @lok(value="Tags")
    @lpl(value="Displayed above the list of clan tags that the player can select for their clan")
    public static final lox tde = tdD.BC("ClanTagsTitle");
    @lok(value="Select tags to identify your clan's activities and playstyle")
    @lpl(value="Displayed above the list of clan tags that the player can select for their clan")
    public static final lox tdf = tdD.BC("ClanTagsInstructions");
    @lok(value="Create Clan")
    @lpl(value="Text to display next to the create clan button before a create request is sent to the server")
    public static final lox tdG = tdD.BC("CreateClanText");
    @lok(value="Creating Clan... Please Wait...")
    @lpl(value="Text to display next to the create clan button while the clan creation request is being processed by the server")
    public static final lox tdH = tdD.BC("CreatingClanText");
    @lok(value="Trial Account Players Cannot Create New Clans!")
    @lpl(value="Text to display next to the create clan button if the player is a trial account player")
    public static final lox tdI = tdD.BC("TrialAccountRestriction");

    protected lwf(String string) {
        super("Creator." + string);
    }

    private lwf() {
        super("Creator");
    }
}

