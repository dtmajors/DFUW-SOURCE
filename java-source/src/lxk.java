/*
 * Decompiled with CFR.
 */
public class lxk
extends lvn {
    private static final lxk trN = new lxk();
    @lok(value="Mentor")
    @lpl(value="Displayed as the title to the main mentor pop-up window")
    public static final lox trO = trN.BC("MainWindowTitle");
    @lok(value="Initiation")
    @lpl(value="Displayed as the initiation title to the main mentor pop-up window")
    public static final lox trP = trN.BC("InitiationTitle");
    @lok(value="Welcome to Agon noobile one! In this war-torn land of strife, paths can often end in a fatal stabbing or terminal fireball to the face. Mentors are veteran players who can, if you wish, guide and hone you into a fierce Agonian war machine.Click below to initiate the process and meet your Mentor!")
    @lpl(value="Displayed as the initiation body text to the main mentor pop-up window")
    public static final lox trQ = trN.BC("InitiationBodyText");
    @lok(value="Request a mentor")
    @lpl(value="Displayed as the request a mentor title to the main mentor pop-up window")
    public static final lox trR = trN.BC("RequestAMentorTitle");
    @lok(value="Mentor found!")
    @lpl(value="Displayed as a label in mentor initial window when a mentor has been assigned to this player")
    public static final lox trS = trN.BC("MentorFoundLaber");
    @lok(value="Your mentor")
    @lpl(value="Displayed as the your mentor title to the main mentor pop-up window")
    public static final lox trT = trN.BC("YourMentorTitle");
    @lok(value="No mentor assigned")
    @lpl(value="Displayed as the no mentor assigned text to the main mentor pop-up window")
    public static final lox trU = trN.BC("NoMentorAssigned");
    @lok(value="If you decline, you can find this tool via your Social Window")
    @lpl(value="Displayed as the if decline info text to the main mentor pop-up window")
    public static final lox trV = trN.BC("IfDeclineInfo");
    @lok(value="Become a mentor")
    @lpl(value="Displayed as the become a mentor text to the main mentor pop-up window")
    public static final lox trW = trN.BC("BecomeAMentor");
    @lok(value="Name")
    @lpl(value="Displayed as a header for player name in apprentices/mentor list")
    public static final lox trX = trN.BC("NameListHeader");
    @lok(value="Rate your mentor")
    @lpl(value="Displayed as a title to the rating mentor pop-up window")
    public static final lox trY = trN.BC("RateYourMentorTitle");
    @lok(value="Rating")
    @lpl(value="Displayed as a title to the rating mentor pop-up window")
    public static final lox trZ = trN.BC("RatingTitle");
    @lok(value="Please feel free to take a moment and rate your Mentor so that we can judge and reward their efficiency in teaching you the skills you'll need to survive this harsh land.")
    @lpl(value="Displayed as the text requesting the player to rate the mentor")
    public static final lox tsa = trN.BC("RatingText");
    @lok(value="Write a review(140 characters)")
    @lpl(value="Displayed as a default review text to the rating mentor pop-up window")
    public static final lox tsb = trN.BC("WriteAReviewDefaultText");
    @lok(value="Your apprentices")
    @lpl(value="Displayed as the your apprentices title to the main mentor pop-up window")
    public static final lox tsc = trN.BC("YourApprenticesTitle");
    @lok(value="Search for a mentor")
    @lpl(value="Displayed as a tooltip on the search button")
    public static final lox tsd = trN.BC("SearchButtonTooltip");
    @lok(value="whisper player")
    @lpl(value="Displayed as a tooltip on the whisper button")
    public static final lox tse = trN.BC("WhisperButtonTooltip");
    @lok(value="Summon player")
    @lpl(value="Displayed as a tooltip on the summon button")
    public static final lox tsf = trN.BC("SummonButtonTooltip");
    @lok(value="You have to wait $(RemainingTime) before you can summon another player.")
    @lpl(value="Displayed as a tooltip on the summon button")
    public static final lox tsg = trN.a("SummonOnCooldownButtonTooltip", lxk.Bi("RemainingTime"));
    @lok(value="Remove player")
    @lpl(value="Displayed as a tooltip on the remove button")
    public static final lox tsh = trN.BC("RemoveButtonTooltip");
    @lok(value="Removal disabled")
    @lpl(value="Displayed as a tooltip on the disabled remove button")
    public static final lox tsi = trN.BC("RemoveButtonDisabledTooltip");
    @lok(value="You have been banned from the mentor system due to a low overall rating.")
    @lpl(value="Displayed as a tooltip on the disabled checkbox when a player is blacklisted")
    public static final lox tsj = trN.BC("BlackListedTooltip");
    @lok(value="Pending rating")
    @lpl(value="Displayed as a tooltip on the disabled checkbox when a player has a pending rating")
    public static final lox tsk = trN.BC("PendingRatingTooltip");
    @lok(value="Offline")
    @lpl(value="Displayed as a tooltip on the whisper/summon button when a player is offline")
    public static final lox tsl = trN.BC("OfflineTooltip");
    @lok(value="You are above the $(ProwessLimit) prowess limit for becoming an apprentice and below the $(Prowess) prowess limit for becoming a mentor.")
    @lpl(value="Displayed text for default page in mentor window when a player can not be either an apprentice nor a mentor because of the total prowess points.")
    public static final lox tsm = trN.a("EmptyPageText", lxk.ah("ProwessLimit", 0), lxk.ah("Prowess", 0));
    @lok(value="Are you sure that you want to cancel your apprentice $(PlayerName)?")
    @lpl(value="Displayed as confirmation text when player clicks the cancel button to cancel an apprentice.")
    public static final lox tsn = trN.a("ApprenticeCancel", lxk.Bk("PlayerName"));
    @lok(value="Are you sure that you want to cancel your mentor $(PlayerName)?")
    @lpl(value="Displayed as confirmation text when player clicks the cancel button to cancel a mentor.")
    public static final lox tso = trN.a("MentorCancel", lxk.Bk("PlayerName"));

    protected lxk(String string) {
        super("Mentoring." + string);
    }

    private lxk() {
        super("Mentoring");
    }
}

