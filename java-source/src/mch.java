/*
 * Decompiled with CFR.
 */
public class mch
extends lzh {
    private static final mch uuk = new mch();
    @lok(value="The Request failed. Please try again!")
    @lpl(value="Displayed when a request fails")
    public static final lox uul = uuk.BC("SystemError");
    @lok(value="The Mentoring system is currently disabled.  Please try again later.")
    @lpl(value="Displayed when a request fails because the system is disabled")
    public static final lox uom = uuk.BC("Disabled");
    @lok(value="The system is still handling your previous request. You'll need to wait until this has been resolved before trying again.")
    @lpl(value="Displayed when a request fails because the system is handling a previous request from the same player")
    public static final lox uum = uuk.BC("PendingRequest");
    @lok(value="Would you like a mentor to guide you in the ways of Darkfall? You can always find a Mentor via your mentor window if you don't want one now.")
    @lpl(value="Displayed to a player when spaws for the first time after the training area")
    public static final lox uun = uuk.BC("AssignMentorRequest");
    @lok(value="You already possess enough prowess.  A mentor can teach you no more!")
    @lpl(value="Displayed when a player requests a mentor although his prowess points are more than the required limit.")
    public static final lox uuo = uuk.BC("MoreThanEnoughProwess");
    @lok(value="You do not currently have a mentor. You may request a new one from the mentor window.")
    @lpl(value="Displayed when a player tries to cancel an apprentice although he is not in his list")
    public static final lox uup = uuk.BC("MentorRemoved");
    @lok(value="Apprentices cannot be Mentors! Finish your apprenticeship if you feel you want to teach others.")
    @lpl(value="Displayed when a player tries to register itself as a mentor although is an apprentice")
    public static final lox uuq = uuk.BC("ApprenticeCanNotBeAMentor");
    @lok(value="You have already been  assigned to a mentor.")
    @lpl(value="Displayed when a player requests a mentor although he has been assigned already one")
    public static final lox uur = uuk.BC("YouHaveAlreadyAMentor");
    @lok(value="There are currently no Mentors available to guide you. Please try again later.")
    @lpl(value="Displayed when a player requests a mentor and there is noone available at the time")
    public static final lox uus = uuk.BC("NoAvailableMentor");
    @lok(value="Congratulations! You have been assigned to a mentor. Check your mentor window for further details..")
    @lpl(value="Displayed when a player has been assigned a mentor")
    public static final lox uut = uuk.BC("MentorAssignedSuccess");
    @lok(value="You currently do not have any Mentors to cancel.")
    @lpl(value="Displayed when a player tries to cancel a mentor although he does not have one")
    public static final lox trU = uuk.BC("NoMentorAssigned");
    @lok(value="You may only cancel one Mentor per day.")
    @lpl(value="Displayed when a player tries to cancel a mentor although he has done it already once for this day")
    public static final lox uuu = uuk.BC("CancelMentorCooldown");
    @lok(value="Your Mentor is now online.")
    @lpl(value="Displayed to an apprentice when the mentor comes online")
    public static final lox uuv = uuk.BC("MentorStatusOnline");
    @lok(value="Your Mentor is now offline.")
    @lpl(value="Displayed to an apprentice when the mentor goes offline")
    public static final lox uuw = uuk.BC("MentorStatusOffline");
    @lok(value="You have successfully graduated from the Mentoring program! Your Mentor, $(PlayerName), awaits your rating.")
    @lpl(value="Displayed to an apprentice when completes succesfully the mentoring program")
    public static final lox uux = uuk.a("MentoringCompleted", mch.Bk("PlayerName"));
    @lok(value="Your rating to Mentor $(PlayerName) has been registered.  Many thanks for completing the Mentoring program.")
    @lpl(value="Displayed to an apprentice when completes succesfully the mentoring program")
    public static final lox uuy = uuk.a("ApprenticeGaveRating", mch.Bk("PlayerName"));
    @lok(value="You do not possess the required Prowess needed to be a Mentor.")
    @lpl(value="Displayed when a player tries to register itself as a mentor without having the required prowess points")
    public static final lox uuz = uuk.BC("NotEnoughProwess");
    @lok(value="You have been blacklisted and thus cannot register as a Mentor.")
    @lpl(value="Displayed when a player tries to register itself as a mentor although has been blacklisted")
    public static final lox uuA = uuk.BC("Blacklisted");
    @lok(value="You already are a Mentor!")
    @lpl(value="Displayed when a player tries to register itself as a mentor although is already registered")
    public static final lox uuB = uuk.BC("AlreadyRegistered");
    @lok(value="You are not currently registered as a Mentor and thus there is no need to try and unregister.")
    @lpl(value="Displayed when a player tries to unregister itself although is not registered as a mentor")
    public static final lox uuC = uuk.BC("NotRegistered");
    @lok(value="You are now a certified Mentor!")
    @lpl(value="Displayed when a player successfully registers himself as a mentor")
    public static final lox uuD = uuk.BC("RegisterSuccess");
    @lok(value="You are no longer a Mentor.")
    @lpl(value="Displayed when a player successfully deregisters himself from the available mentors list")
    public static final lox uuE = uuk.BC("UnRegisterSuccess");
    @lok(value="You are not currently a Mentor and thus do not need to remove yourself from the active Mentors list (that you are not currently on).")
    @lpl(value="Displayed when a player tries to deregisters himself from the available mentors list although he is not a mentor")
    public static final lox uuF = uuk.BC("NotAMentor");
    @lok(value="Your apprentice $(PlayerName) is now online.")
    @lpl(value="Notification wnen a apprentice is online")
    public static final lox uuG = uuk.a("ApprenticeStatusOnline", mch.Bk("PlayerName"));
    @lok(value="Your apprentice $(PlayerName) is now offline.")
    @lpl(value="Notification wnen a apprentice is offline")
    public static final lox uuH = uuk.a("ApprenticeStatusOffline", mch.Bk("PlayerName"));
    @lok(value="$(PlayerName) has completed the Mentoring program and should soon give you a fair rating.")
    @lpl(value="Displayed to mentor when one of his apprentice's completes succesfully the mentoring program")
    public static final lox uuI = uuk.a("ApprenticeMentoringCompleted", mch.Bk("PlayerName"));
    @lok(value="You are a Mentor and thus cannot register as an apprentice. Mentors teach!")
    @lpl(value="Displayed when a player tries to register itself as a mentor although is an apprentice")
    public static final lox uuJ = uuk.BC("MentorCanNotBeAnApprentice");
    @lok(value="$(PlayerName) has now been assigned as your new apprentice! Consult your mentor window for more information.")
    @lpl(value="Displayed when a player has been assigned with a new apprentice")
    public static final lox uuK = uuk.a("ApprenticeAssigned", mch.Bk("PlayerName"));
    @lok(value="You may not dismiss an apprentice more than once per day.")
    @lpl(value="Displayed when a player tries to cancel an apprentice although he has done it already once for this day")
    public static final lox uuL = uuk.BC("CancelApprenticeCooldown");
    @lok(value="The selected player is not currently one of your apprentices.")
    @lpl(value="Displayed when a player tries to cancel an apprentice although he is not in his list")
    public static final lox uuM = uuk.BC("NotAnApprentice");
    @lok(value="One of your apprentices has now been removed.")
    @lpl(value="Displayed when a player tries to cancel an apprentice although he is not in his list")
    public static final lox uuN = uuk.BC("ApprenticeRemoved");
    @lok(value="You cannot become a Mentor while your old Mentor $(PlayerName) still awaits your rating.")
    @lpl(value="Displayed to a player who wants to be a mentor if he has a pending rating for his mentor")
    public static final lox uuO = uuk.a("PendingRatingMentoring", mch.Bk("PlayerName"));

    protected mch(String string) {
        super("Mentoring." + string);
    }

    private mch() {
        super("Mentoring");
    }
}

