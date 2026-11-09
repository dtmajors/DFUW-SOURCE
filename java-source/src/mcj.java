/*
 * Decompiled with CFR.
 */
public class mcj
extends lzh {
    private static final mcj uuS = new mcj();
    @lok(value="Only the party leader has the permission to perform this action.")
    @lpl(value="Displayed when the player tries to perform an action which only a party leader can perform.")
    public static final lox uuT = uuS.BC("NoPermission");
    @lok(value="Target player is not a member in this party.")
    @lpl(value="Displayed when the player tries to perform a party action on a player who is not a party member anymore.")
    public static final lox uuU = uuS.BC("TargetNotAPartyMember");
    @lok(value="Target player is already a leader.")
    @lpl(value="Displayed when the party leader tries to promote another member to a leader although this player is already the leader.")
    public static final lox uuV = uuS.BC("TargetMemberAlreadyLeader");
    @lok(value="Player $(PlayerName) was kicked from the party.")
    @lpl(value="Displayed when the party leader kicks a member from the party.")
    public static final lox uuW = uuS.a("TargetMemberKicked", mcj.Bk("PlayerName"));
    @lok(value="You are already a member of a party")
    @lpl(value="Displayed when the player accepts a party join request while is already a member in another party.")
    public static final lox uuX = uuS.BC("AlreadyAMember");
    @lok(value="$(PlayerName) is already a member of a party")
    @lpl(value="Displayed when the player sends a party join request to a player who already belongs to another party.")
    public static final lox uuY = uuS.a("TargetAlreadyAMember", mcj.Bk("PlayerName"));
    @lok(value="You can not invite yourself to join your party")
    @lpl(value="Displayed when the player tries to invite himself in a party. Can happen only through a chat command.")
    public static final lox uuZ = uuS.BC("InviteYourSelf");
    @lok(value="$(PlayerName) accepted another party invitation")
    @lpl(value="Displayed when the player sends a party join request to a player who decides to join another party.")
    public static final lox uva = uuS.a("AcceptedAnotherInvitation", mcj.Bk("PlayerName"));
    @lok(value="All your requests are being ignored by $(PlayerName)")
    @lpl(value="Displayed when the player sends a party join request to a player who decides to put the source player in the ignore list.")
    public static final lox uvb = uuS.a("AddedInIngoreList", mcj.Bk("PlayerName"));
    @lok(value="$(PlayerName) declined your party invitation")
    @lpl(value="Displayed when the player sends a party join request to a player who decides to decline the invitation.")
    public static final lox uvc = uuS.a("DeclinedInvitation", mcj.Bk("PlayerName"));
    @lok(value="$(PlayerName) accepted your party invitation")
    @lpl(value="Displayed when the player sends a party join request to a player who decides to accept the invitation.")
    public static final lox uvd = uuS.a("AcceptedInvitation", mcj.Bk("PlayerName"));
    @lok(value="$(PlayerName) did not respond to your party invitation")
    @lpl(value="Displayed when the player sends a party join request to a player who decides to do not respond to the invitation.")
    public static final lox uve = uuS.a("DidNotRespond", mcj.Bk("PlayerName"));
    @lok(value="All your requests are being ignored by $(PlayerName)")
    @lpl(value="Displayed when the player sends a party join request to a player who has him/her in the ignore list.")
    public static final lox uvf = uuS.a("InIngoreList", mcj.Bk("PlayerName"));
    @lok(value="Party was removed")
    @lpl(value="Displayed when the player tries to trigger a party action when in the meanwhile the party gets disbanded.")
    public static final lox uvg = uuS.BC("PartyWasRemoved");
    @lok(value="$(PlayerName) is currently becoming a party member")
    @lpl(value="Displayed when the player sends a party join request to a player who is in the process of joining another party.")
    public static final lox uvh = uuS.a("TargetBecomingAMember", mcj.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' was not found")
    @lpl(value="Displayed when the player sends a party join request to a player who the system can not found. Can happen only by using a chat command.")
    public static final lox PlayerNotFound = uuS.a("PlayerNotFound", mcj.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is no longer logged in")
    @lpl(value="Displayed when the player sends a party join request to a player who is no longer online.")
    public static final lox uvi = uuS.a("PlayerNotLoggedIn", mcj.Bk("PlayerName"));
    @lok(value="You are not a member in any party")
    @lpl(value="Displayed when the player tries to perform a party action (invite another player) while is not in a party.")
    public static final lox uvj = uuS.BC("NotAMemberInParty");
    @lok(value="Only party leaders can invite new members in the party")
    @lpl(value="Displayed when the player tries to invite another player in the party while is not the party leader.")
    public static final lox uvk = uuS.BC("NotPartyLeader");
    @lok(value="Player can not participate in a party")
    @lpl(value="Displayed when the player sends a party join request to a player who can not join the party. For example when is in the process of logging out from the game.")
    public static final lox uvl = uuS.BC("CanNotBeAPartyMember");
    @lok(value="Round robin is enabled")
    @lpl(value="Displayed to all party members when the party leader enables the round robin system.")
    public static final lox uvm = uuS.BC("RoundRobinEnabled");
    @lok(value="Round robin is disabled")
    @lpl(value="Displayed to all party members when the party leader disables the round robin system.")
    public static final lox uvn = uuS.BC("RoundRobinDisabled");
    @lok(value="Player '$(PlayerName)' was included in round robin system.")
    @lpl(value="Displayed to all party members when the party leader excludes someone from the round robin system.")
    public static final lox uvo = uuS.a("RoundRobinPlayerIncluded", mcj.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' was excluded from round robin system.")
    @lpl(value="Displayed to all party members when the party leader includeds someone in the round robin system.")
    public static final lox uvp = uuS.a("RoundRobinPlayerExcluded", mcj.Bk("PlayerName"));
    @lok(value="'$(PlayerName)' was credited with a monster kill.")
    @lpl(value="Displayed to all party members when a party member gets the kill from the round robin system.")
    public static final lox uvq = uuS.a("RoundRobinPlayerGotTheKill", mcj.Bk("PlayerName"));
    @lok(value="Unknown response for your quest offer")
    @lpl(value="Displayed when a party quest operation results in failure due to a non-specific error")
    public static final lox uvr = uuS.BC("PartyQuestGenericError");
    @lok(value="Party is not created yet")
    @lpl(value="Displayed when a party quest operation results in falure due to the party not being created")
    public static final lox uvs = uuS.BC("PartyQuestPartyNotCreated");
    @lok(value="You are not a member in a party")
    @lpl(value="Displayed when a party quest operation results in failure due to the player not being a party member")
    public static final lox uvt = uuS.BC("PartyQuestNotPartyMember");
    @lok(value="You do not have any active quests to offer")
    @lpl(value="Displayed when a party quest operation results in failure due to the player not having any active quests")
    public static final lox uvu = uuS.BC("PartyQuestNoActiveQuests");
    @lok(value="You do not have any active quest with this name")
    @lpl(value="Displayed when a party quest operation results in failure due to the player not having an active quest with the entered name")
    public static final lox uvv = uuS.BC("PartyQuestInvalidQuestName");

    protected mcj(String string) {
        super("Party." + string);
    }

    private mcj() {
        super("Party");
    }
}

