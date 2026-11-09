/*
 * Decompiled with CFR.
 */
public class mat
extends mal {
    private static final mat ueb = new mat();
    @lok(value="An error occurred while trying to initiate the challenge!")
    @lpl(value="Displayed when an unhandled, non-specific, error occurred when attempting to perform a clan conquest operation")
    public static final lox rXy = ueb.BC("GenericError");
    @lok(value="Your clan already owns this holding!")
    @lpl(value="Displayed when the clan is attempting to initiate a conquest challenge for a holding that they already own")
    public static final lox uec = ueb.BC("ClanAlreadyOwnsHolding");
    @lok(value="You cannot initiate a clan conquest challenge, as you are not a clan member!")
    @lpl(value="Displayed when the clan member attempting to initate a conquest challenge is not, or is no longer, a member of the clan")
    public static final lox ued = ueb.BC("PlayerNotClanMember");
    @lok(value="You do not have the permission required to initiate challenges!")
    @lpl(value="Displayed when the clan member attempting to initate a conquest challenge does not have the required permission to do so")
    public static final lox ubr = ueb.BC("PermissionDenied");
    @lok(value="Your clan is not at war with the owners of this holding!")
    @lpl(value="Displayed when the clan attempting to initate the conquest challenge is not at war with the clan that owns the holding being challenged")
    public static final lox uee = ueb.BC("NotAtWarWithClan");
    @lok(value="Your clan must wait at least $(WaitTime) before you can take over another neutral holding!")
    @lpl(value="Displayed when a clan attempts to take-over a neutral holding, but have taken-over another neutral holding too recently to do so again")
    public static final lox uef = ueb.a("TooSoonToTakeOverAnotherNeutralHolding", mat.Bi("WaitTime"));
    @lok(value="Your clan must wait at least $(WaitTime) before you can initiate another challenge!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge, but has initiated another conquest challenge too recently to do so again")
    public static final lox ueg = ueb.a("TooSoonToStartAnotherChallenge", mat.Bi("WaitTime"));
    @lok(value="You are too late to join the active challenge for this holding!")
    @lpl(value="Displayed when a clan attempts to join an active conquest challenge, but the challenge has progressed to a point where new attackers are no longer allowed to join")
    public static final lox ueh = ueb.BC("TooLateToJoinActiveChallenge");
    @lok(value="Your clan has reached the maximum number of active attack challenges!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge but already has the maximum number of challenges active")
    public static final lox uei = ueb.BC("MaximumAttackChallengesPerClanReached");
    @lok(value="The owners of the holding are already being attacked by the maximum number of attackers!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge, but the defender clan already has the maximum number of defence challenges active")
    public static final lox uej = ueb.BC("MaximumDefenceChallengesPerClanReached");
    @lok(value="The holding is already being attacked by the maximum number of attackers!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge, but the challenged holding is already being attacked by the maximum nuber of attackers")
    public static final lox uek = ueb.BC("MaximumAttackersPerHoldingReached");
    @lok(value="The owners of the holding are already defending the maximum number of holdings!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge, but the defender clan is already defending the maximum number of their holdings that can be challenge concurrently")
    public static final lox uel = ueb.BC("MaximumHoldingDefenceChallengesPerClanReached");
    @lok(value="The holding is immune to challenges for the next $(WaitTime)!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge for a holding that is currently in its grace-period and is immune to challenges at this time")
    public static final lox uem = ueb.a("HoldingIsInGracePeriod", mat.Bi("WaitTime"));
    @lok(value="Your clan is too small to start a challenge for this type of holding!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge for a holding, but their clan does not have the required number of members to start a challenge for the type of holding")
    public static final lox uen = ueb.BC("ClanTooSmallToStartChallenge");
    @lok(value="The owners of the holding are already involved in another challenge!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge, but the defender clan is already the attcker in another conquest challenge")
    public static final lox ueo = ueb.BC("AttackerChallengeInProgress");
    @lok(value="Your clan is already defending in another challenge and cannot issue an attack challenge!")
    @lpl(value="Displayed when a clan attempts to initiate a conquest challenge while they are the defenders in another active challenge")
    public static final lox uep = ueb.BC("DefenceChallengeInProgress");
    @lok(value="Your clan cannot participate in conquest challenges without owning at least one holding of your own!")
    @lpl(value="Displayed when the clan attempting to initiate a conquest challenge does not own any holdings of their own")
    public static final lox ueq = ueb.BC("CannotJoinChallengesWithoutHoldings");
    @lok(value="Your clan is already attacking this holding!")
    @lpl(value="Displayed when a clan member attempts to initiate a conquest challenge for a holding that their clan is already actively challenging")
    public static final lox uer = ueb.BC("ClanAlreadyAttackingHolding");
    @lok(value="Your clan already lost this challenge, you cannot rejoin it!")
    @lpl(value="Displayed when the clan attempting to join an active conquest challenge has already been part of the challenge and was removed (lost)")
    public static final lox ues = ueb.BC("CannotRejoinChallenge");
    @lok(value="Your clan needs $(Points) more points to participate in a challenge for this holding!")
    @lpl(value="Displayed when the clan attempting to initiate a conquest challenge does not have enough clan-points to pay the requried cost of starting a challenge for this type of holding")
    public static final lox uet = ueb.a("NotEnoughClanPoints", mat.Bh("Points"));
    @lok(value="You do not qualify or your clan does not possess enough Dominion to conquer this holding.Your clan needs $(Points) more Dominion!")
    @lpl(value="Displayed when the clan attempting to take-over a free holding does not have enough clan-points for this type of holding")
    public static final lox ueu = ueb.a("NotEnoughClanPointsFreeHolding", mat.Bh("Points"));
    @lok(value="Your clan needs $(Gold) more gold in your clan-vault to participate in a challenge for this holding!")
    @lpl(value="Displayed whent the clan attempting to initiate a conquest challenge does not have enough gold to cover pay the required wager for starting a challenge for this holding")
    public static final lox uev = ueb.a("NotEnoughGold", mat.Bh("Gold"));
    @lok(value="Challenge initiation confirmation declined!")
    @lpl(value="Displayed when the clan member attempting to initiate a conquest challenge declines the confirmation request for the gold cost to start the challenge")
    public static final lox uew = ueb.BC("ConfirmationDeclined");
    @lok(value="Challenge initiation confirmation timed-out!")
    @lpl(value="Displayed when the clan member attempting to initiate a conquest challenge does not respond to the confirmation request for the gold cost to start the challenge in the alotted time")
    public static final lox udP = ueb.BC("ConfirmationTimedOut");
    @lok(value="You successfully initiated a conquest challenge on behalf of your clan!")
    @lpl(value="Displayed when the conquest challenge initiation request has been successfully completed")
    public static final lox uex = ueb.BC("OperationSuccessful");
    @lok(value="This holding is already owned, you must initiate a challenge against the owner clan to take ownership of it")
    @lpl(value="Displayed when a request to take over a free holding fails because the holding is already owned")
    public static final lox uey = ueb.BC("HoldingAlreadyOwned");
    @lok(value="You must be a member of a clan to take ownership of free holdings")
    @lpl(value="Notification displayed when a player who is not a member of a clan attempts to interact with the bind-stone in a free holding")
    public static final lox uez = ueb.BC("CannotTakeOverHoldingNoClan");
    @lok(value="Siege activities are currently disabled, due to administrative edict")
    @lpl(value="Notification displayed when a player when they attempt to start a siege, while sieges are disabled by administrators")
    public static final lox ueA = ueb.BC("SiegesDisabledByAdmin");

    protected mat(String string) {
        super("OperationResults." + string);
    }

    private mat() {
        super("OperationResults");
    }
}

