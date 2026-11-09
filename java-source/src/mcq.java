/*
 * Decompiled with CFR.
 */
public class mcq
extends lzh {
    private static final mcq uxk = new mcq();
    @lok(value="BoosterID: $(BoosterID), Unlocked: $(UnlockedState)")
    @lpl(value="Displayed to indicate the state of a booster")
    public static final lox uxl = uxk.a("BoosterInfoResponse", mcq.Bk("BoosterID"), mcq.Bk("UnlockedState"));
    @lok(value="Booster is invalid")
    @lpl(value="Displayed in response to a booster command when the booster is invalid")
    public static final lox uxm = uxk.BC("BoosterInvalid");
    @lok(value="You need to unlock previous boosters first")
    @lpl(value="Displayed in response to a booster command when the booster is not available")
    public static final lox uxn = uxk.BC("BoosterNotAvailable");
    @lok(value="You do not have enough player points to perform this transaction")
    @lpl(value="Displayed in response to a booster command when the player does not have enough player-points")
    public static final lox uxo = uxk.BC("BoosterNotEnoughPlayerPoints");
    @lok(value="You already owned this booster")
    @lpl(value="Displayed in response to a booster command when the booster is already owned")
    public static final lox uxp = uxk.BC("BoosterAlreadyOwned");
    @lok(value="You can not perform this operation now")
    @lpl(value="Displayed in response to a booster command when the system is not ready")
    public static final lox uxq = uxk.BC("BoosterSystemNotReady");
    @lok(value="You have successfully purchased the booster")
    @lpl(value="Displayed in response to a booster command when the command succeeds")
    public static final lox uxr = uxk.BC("BoosterSuccessfullyPurchased");
    @lok(value="You can not perform this action now. Try again later.")
    @lpl(value="Displayed when a role management operation results in failure due to incorrect state")
    public static final lox uxs = uxk.BC("RoleManagementIncorrectState");
    @lok(value="Provided arguments are invalid.")
    @lpl(value="Displayed when a role management operation results in failure due to invalid arguments")
    public static final lox uxt = uxk.BC("RoleManagementInvalidArguments");
    @lok(value="You can not perform this action while you are playing as a monster")
    @lpl(value="Displayed when a role management operation results in failure due to playing as monster")
    public static final lox uxu = uxk.BC("RoleManagementPlayingAsMonster");
    @lok(value="Nothing changed")
    @lpl(value="Displayed when a role management operation results in failure due to no changes")
    public static final lox uxv = uxk.BC("RoleManagementNoChange");
    @lok(value="System is on cooldown")
    @lpl(value="Displayed when a role management operation results in failure due to cool-down active")
    public static final lox uxw = uxk.BC("RoleManagementCooldownActive");
    @lok(value="You have already initiated the process")
    @lpl(value="Displayed when a role management operation results in successful initiation")
    public static final lox uxx = uxk.BC("RoleManagementProecessing");
    @lok(value="You have sucessfully completed the proccess")
    @lpl(value="Displayed when a role management operation results in successful completion")
    public static final lox uxy = uxk.BC("RoleManagementOperationSuccess");
    @lok(value="Invalid Booster Name: $(BoosterName)")
    @lpl(value="Displayed when the entered booster name is invalid")
    public static final lox uxz = uxk.a("BoosterNameInvalid", mcq.Bk("BoosterName"));
    @lok(value="Invalid Role Name: $(RoleName)")
    @lpl(value="Displayed when the entered role name is invalid")
    public static final lox uxA = uxk.a("RoleNameInvalid", mcq.Bk("RoleName"));
    @lok(value="Invalid Specialisation Name: $(SpecialisationName)")
    @lpl(value="Displayed when the entered specialisation name is invalid")
    public static final lox uxB = uxk.a("SpecialisationNameInvalid", mcq.Bk("SpecialisationName"));
    @lok(value="The Sage's very sage words reduced your role switching cooldown")
    @lpl(value="Displayed when the entered specialisation name is invalid")
    public static final lox uxC = uxk.BC("CooldownReset");

    protected mcq(String string) {
        super("Roles." + string);
    }

    private mcq() {
        super("Roles");
    }
}

