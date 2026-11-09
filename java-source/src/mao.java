/*
 * Decompiled with CFR.
 */
public class mao
extends man {
    private static final mao uco = new mao();
    @lok(value="You cannot place a siege-stone while the conquest challenge is being initiated")
    @lpl(value="Displayed to a clan member who tries to place a siege-stone while the conquest challenge is being initiated")
    public static final lox ucp = uco.BC("CannotPlaceConquestBeingInitiated");
    @lok(value="You cannot place a siege-stone as you are not a member of a clan")
    @lpl(value="Displayed to a player who is not a clan member, when they try to place a siege-stone item")
    public static final lox ucq = uco.BC("NotAClanMember");
    @lok(value="You cannot place a siege-stone at this time, as another placement request is being processed")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone while the placement of another is in-progress")
    public static final lox ucr = uco.BC("OtherPlacementInProgress");
    @lok(value="You do not have permission to place siege-stones on behalf of your clan")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone without the required permission")
    public static final lox ubr = uco.BC("PermissionDenied");
    @lok(value="You cannot place a siege-stone here, they must be placed directly onto the terrain")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone in an unsuitable location")
    public static final lox ucs = uco.BC("UnsuitablePlacementLocation");
    @lok(value="You cannot place a siege-stone because your clan is not involved in an active conquest challenge")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone when no challenges are active for their clan")
    public static final lox uct = uco.BC("NoConquestActive");
    @lok(value="You cannot place a siege-stone at this point of the challenge")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone in the incorrect phase of the active challenge")
    public static final lox ucu = uco.BC("IncorrectConquestChallengePhase");
    @lok(value="Your clan has already placed the maximum number of siege-stones allowed in the challenge")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone when the maximum number have already been placed")
    public static final lox ucv = uco.BC("MaximumSiegeStonesAlreadyPlaced");
    @lok(value="You cannot place a siege-stone this close to an existing siege-stone")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone too close to an already placed siege-stone")
    public static final lox ucw = uco.BC("TooCloseToOtherSiegeStone");
    @lok(value="You cannot place a siege-stone this close to the challenged holding")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone too close to the challenged holding")
    public static final lox ucx = uco.BC("TooCloseToChallengedHolding");
    @lok(value="You cannot place a siege-stone this far from the challenged holding")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone too far from the challenged holding")
    public static final lox ucy = uco.BC("TooFarFromChallengedHolding");
    @lok(value="You must stand still to place a siege-stone")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone while moving")
    public static final lox ucz = uco.BC("CannotPlaceSiegeStoneWhileMoving");
    @lok(value="You cannot place this type of siege-stone for this challenged holding type")
    @lpl(value="Displayed to a clan member that tries to place the incorrect siege-stone type for the challened holding type")
    public static final lox ucA = uco.BC("WrongSiegeStoneTypeForChallengedHoldingType");
    @lok(value="You cannot place a siege-stone inside a protected area")
    @lpl(value="Displayed to a clan member that tries to place a siege-stone inside a protected area")
    public static final lox ucB = uco.BC("CannotPlaceSiegeStoneInProtectedArea");

    protected mao(String string) {
        super("PlacementOperationResults." + string);
    }

    private mao() {
        super("PlacementOperationResults");
    }
}

