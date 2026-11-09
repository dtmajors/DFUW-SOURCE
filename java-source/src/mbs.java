/*
 * Decompiled with CFR.
 */
public class mbs
extends lzh {
    private static final mbs ulT = new mbs();
    @lok(value="Duel Request Failed. Try Again!")
    @lpl(value="Displayed when a duel request fails")
    public static final lox ulU = ulT.BC("InvalidData");
    @lok(value="There\u2019s another Duel active or pending. Finish or wait for it to be accepted/denied depending on your situation")
    @lpl(value="Displayed when a player tries to initiate a duel while there is another one pending or active")
    public static final lox ulV = ulT.BC("DuelRequestPending");
    @lok(value="You cannot initiate a Duel while in combat. Slay your foes and try again.")
    @lpl(value="Displayed when a player tries to initiate a duel while is in combat mode")
    public static final lox ulW = ulT.BC("DuelChallengerInCombatMode");
    @lok(value="Your intended victim is in combat. Wait for them to win or die and try again")
    @lpl(value="Displayed when a player tries to initiate a duel with another player who is in combat mode")
    public static final lox ulX = ulT.BC("DuelChallengeeInCombatMode");
    @lok(value="Your feet must be planted firmly on the ground to initiate a duel. Focus!")
    @lpl(value="Displayed when the challenger is not standing still on the ground when it tries to initiate a duel")
    public static final lox ulY = ulT.BC("DuelInvalidState");
    @lok(value="Your intended victim is offline.  Try again later.")
    @lpl(value="Displayed when a player tries to initiate a duel and the target player is not online")
    public static final lox ulZ = ulT.BC("PlayerOffline");
    @lok(value="You\u2019ve set the stakes too high.  You do not have enough gold to initiate this Duel.")
    @lpl(value="Displayed when a player tries to initiate a duel setting as a fee more than the backpack gold")
    public static final lox uma = ulT.BC("ChallengerNotEnoughGold");
    @lok(value="Your intended victim is on your blocked list. Remove them if you wish to beat on them.")
    @lpl(value="Displayed when a player tries to initiate a duel with a blocked player")
    public static final lox umb = ulT.BC("ChallengeeIsBlocked");
    @lok(value="Coward! You\u2019ve left the designated duel zone. You have $(Time) to return before your forfeit.")
    @lpl(value="Displayed when a player leaves the dueling ring to notify how much time has to return back")
    public static final lox umc = ulT.a("OutOfDuelArea", mbs.Bi("Time"));
    @lok(value="You\u2019re back in the zone.  Just on time too, fight!")
    @lpl(value="Displayed when a player goes back in the dueling ring")
    public static final lox umd = ulT.BC("InDuelArea");
    @lok(value="Your intended victim is already in a duel.  Wait for them to finish and try again.")
    @lpl(value="Displayed when challengee is already in duel mode")
    public static final lox ume = ulT.BC("TargetDuelActive");
    @lok(value="Your intended victim is unavailable at the moment.")
    @lpl(value="Displayed when challengee is not in a valid game state")
    public static final lox umf = ulT.BC("StateIsInvalid");
    @lok(value="Your intended victim is not rich enough for your duel.")
    @lpl(value="Displayed when challengee does not have enough gold in bank to participate in the duel")
    public static final lox umg = ulT.BC("TargetNotEnoughGold");
    @lok(value="Challenge...accepted!")
    @lpk(value="audio_duel_challenge_accepted", exP="audio_duel_challenge_accepted_ko")
    @lpl(value="Displayed to challenger player when challengee accepts the duel request")
    public static final lox umh = ulT.BC("DuelAccepted");
    @lok(value="Challenge...rejected!")
    @lpk(value="audio_duel_challenge_rejected", exP="audio_duel_challenge_rejected_ko")
    @lpl(value="Displayed to challenger player when challengee declines the duel request")
    public static final lox umi = ulT.BC("DuelDeclined");
    @lok(value="Your intended victim has blocked you. You cannot initiate a duel with them.")
    @lpl(value="Displayed to challenger player when challengee blocks the challenger")
    public static final lox umj = ulT.BC("DuelBlocked");
    @lok(value="You have somehow made it onto your intended victim\u2019s ignore list. You cannot initiate a duel with them.")
    @lpl(value="Displayed to challenger player when challengee has already added the challenger to the ignore list")
    public static final lox umk = ulT.BC("Blocked");
    @lok(value="The gods do not approve this duel. Please try again later.")
    @lpl(value="Displayed to challenger when a duel request fails due to a system error")
    public static final lox uml = ulT.BC("UnknownError");
    @lok(value="Make ready! The Duel begins in $(Time)!")
    @lpl(value="Displayed to both duel opponents when a duel is ready to start")
    @lpk(value="osmsg_duels", exP="osmsg_duels_ko")
    public static final lox umm = ulT.a("DuelCountDown", mbs.Bi("Time"));
    @lok(value="You have been vanquished.  Time for revenge!")
    @lpl(value="Displayed to player who lost the duel")
    @lpk(value="audio_duel_lost", exP="audio_duel_lost_ko")
    public static final lox umn = ulT.BC("DuelLost");
    @lok(value="You are victorious! (Watch your back...)")
    @lpl(value="Displayed to player who won the duel")
    @lpk(value="audio_duel_win", exP="audio_duel_win_ko")
    public static final lox umo = ulT.BC("DuelWon");
    @lok(value="Your target is participating in a Duel with Player Protection active and thus cannot receive your buff.")
    @lpl(value="Displayed to player who tries to buff another player who is in a duel with another player while player protection on one of them is active")
    public static final lox ump = ulT.BC("PositiveEffectsFailOnPlayerInDuel");

    protected mbs(String string) {
        super("Duels." + string);
    }

    private mbs() {
        super("Duels");
    }
}

