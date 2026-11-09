/*
 * Decompiled with CFR.
 */
public class mbb
extends may {
    private static final mbb uhC = new mbb();
    @lok(value="A cannon is already in the process of being deployed at this tower")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and a gun is already being deployed to the tower")
    public static final lox uhD = uhC.BC("AlreadyBeingCreated");
    @lok(value="You need $(ResourceAmount) $(ResourceType.Name$(ResourceAmount.Plurality)) to deploy the cannon")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and they do not have sufficient resources to do so")
    public static final lox uhE = uhC.a("NotEnoughResources", mbb.Bh("ResourceAmount"), mbb.Bl("ResourceType"));
    @lok(value="The tower is disabled... You need to repair the tower before you can deploy a cannon")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and the tower is disabled")
    public static final lox ufS = uhC.BC("IsDisabled");
    @lok(value="Selected cannon is invalid for this tower")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and the selected gun is invalid")
    public static final lox uhF = uhC.BC("IsInvalid");
    @lok(value="You can not add a cannon to the tower at this point... wait a while and try again")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and the tower is not yet ready to accept gun deployment")
    public static final lox uhG = uhC.BC("IsNotReady");
    @lok(value="You need to be a member of the clan that owns the holding to deploy a cannon to the holding's towers")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and they are not a member of the holding's owner clan")
    public static final lox rXm = uhC.BC("NotInClan");
    @lok(value="You do not have the required permission to deploy cannons to the towers")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and they do not have the required permission to do so")
    public static final lox ubr = uhC.BC("PermissionDenied");
    @lok(value="You succesfully deployed the cannon")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and the gun is successfully deployed to the tower")
    public static final lox uhH = uhC.BC("CreationSucceeded");
    @lok(value="Cannon deploy process cancelled")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and does not stand still")
    public static final lox uhI = uhC.BC("WrongPlayerState");
    @lok(value="You can not replace the cannon while someone is attached to it")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and another player is attached to the gun")
    public static final lox uhJ = uhC.BC("PlayerAttached");
    @lok(value="The selected cannon type is already deployed to this tower")
    @lpl(value="Displayed to a player when they try to deploy a clan gun to a tower and the selected gun type is already deployed to the tower")
    public static final lox uhK = uhC.BC("TypeAlreadyExists");

    protected mbb(String string) {
        super("GunDeployResults." + string);
    }

    private mbb() {
        super("GunDeployResults");
    }
}

