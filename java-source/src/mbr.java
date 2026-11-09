/*
 * Decompiled with CFR.
 */
public class mbr
extends lzh {
    private static final mbr ulk = new mbr();
    @lok(value="You can not deploy another object yet, since you are already in the process of deploying an object.")
    @lpl(value="Displayed to a player when tries to deploy an object while is deploying another one.")
    public static final lox ull = ulk.BC("AlreadyDeployingObject");
    @lok(value="You can not place a $(Resource.NameSingular) in a protected area.")
    @lpl(value="Displayed to a player when tries to deploy an object in a protected area.")
    public static final lox ulm = ulk.a("NotAllowedInProtectedArea", mbr.Bl("Resource"));
    @lok(value="The item is not deployable.")
    @lpl(value="Displayed to a player when tries to deploy an non deployable object.")
    public static final lox uln = ulk.a("NotADeployableItem", mbr.Bl("Resource"));
    @lok(value="You do not have sufficient rank for this.")
    @lpl(value="Displayed to a player when tries to deploy an object without having the sufficient rank for this action.")
    public static final lox ulo = ulk.BC("PlayerAccessLevelNotSatisfied");
    @lok(value="There are too many $(Resource.NamePlural) in this area.")
    @lpl(value="Displayed to a player when tries to deploy an object in an area where the maximum number of deployable objects have been reached.")
    public static final lox ulp = ulk.a("TooManyObjectsInArea", mbr.Bl("Resource"));
    @lok(value="You cannot have more than $(Quantity) $(Resource.Name$(Quantity.Plurality)) placed in the world.")
    @lpl(value="Displayed to a player when tries to deploy an object while has already placed too many of them.")
    public static final lox ulq = ulk.a("TooManyObjectsPlacedByPlayer", mbr.Bh("Quantity"), mbr.Bl("Resource"));
    @lok(value="You can not place this item here.")
    @lpl(value="Displayed to a player when tries to deploy an object on a non suitable place.")
    public static final lox ulr = ulk.BC("NoSuitablePlacement");
    @lok(value="The $(Resource.NameSingular) you had in $(Area) has timed-out and been removed from the world")
    @lpl(value="Displayed to a player when a deployable object that they placed has timed-out and been removed from the world")
    public static final lox uls = ulk.a("TimedOut", mbr.Bl("Resource"), mbr.Br("Area"));
    @lok(value="The $(Resource.NameSingular) you had in $(Area) has timed-out and the contents can now be looted")
    @lpl(value="Displaye dto a player when a deployable object that they placed has timed-out and become lootable by all players")
    public static final lox ult = ulk.a("TimedOutLootable", mbr.Bl("Resource"), mbr.Br("Area"));
    @lok(value="The $(Resource.NameSingular) you had in $(Area) has timed-out and has now been removed")
    @lpl(value="Displayed to a player when a deployable object that they placed has timed-out and been removed from the world")
    public static final lox ulu = ulk.a("TimedOutRemoved", mbr.Bl("Resource"), mbr.Br("Area"));
    @lok(value="The $(Resource.NameSingular) you had in $(Area) has been destroyed")
    @lpl(value="Displayed to a player when a deployable object, placed by him, has been destroyed.")
    public static final lox ulv = ulk.a("DestroyedUnknownKiller", mbr.Bl("Resource"), mbr.Br("Area"));
    @lok(value="The $(Resource.NameSingular) you had in $(Area) has been destroyed and the contents can now be looted")
    @lpl(value="Displayed to a player when a deployable object, placed by him, has been destroyed and is lootable.")
    public static final lox ulw = ulk.a("DestroyedUnknownKillerLootable", mbr.Bl("Resource"), mbr.Br("Area"));
    @lok(value="$(Resource.NameSingular) was destroyed by $(ResourceAlt.NameSingular)")
    @lpl(value="Displayed to a player when a deployable object, placed by him, has been destroyed by a monster.")
    public static final lox ulx = ulk.a("DestroyedByMonster", mbr.Bl("Resource"), mbr.Bl("ResourceAlt"));
    @lok(value="$(Resource.NameSingular) was destroyed by $(ResourceAlt.NameSingular) and the contents can now be looted")
    @lpl(value="Displayed to a player  when a deployable object, placed by him, has been destroyed by a monster and is lootable.")
    public static final lox uly = ulk.a("DestroyedByMonsterLootable", mbr.Bl("Resource"), mbr.Bl("ResourceAlt"));
    @lok(value="$(Resource.NameSingular) was destroyed by $(PlayerName)")
    @lpl(value="Displayed to a player when a deployable object, placed by him, has been destroyed by another player.")
    public static final lox ulz = ulk.a("DestroyedByPlayer", mbr.Bl("Resource"), mbr.Bk("PlayerName"));
    @lok(value="$(Resource.NameSingular) was destroyed by $(PlayerTitle) $(PlayerName) of the $(Clan)")
    @lpl(value="Displayed to a player when a deployable object, placed by him, has been destroyed by another player who belongs to a clan.")
    public static final lox ulA = ulk.a("DestroyedByClanPlayer", mbr.Bl("Resource"), mbr.Bk("PlayerTitle"), mbr.Bk("PlayerName"), mbr.Bk("Clan"));
    @lok(value="There is another pending deploy request active.")
    @lpl(value="Displayed to a player when tries to deploy an object while anothed request is active.")
    public static final lox ulB = ulk.BC("AlreadyDeploying");
    @lok(value="Invalid deployable object.")
    @lpl(value="Displayed to a player when tries to deploy an non valid deployable object.")
    public static final lox ulC = ulk.BC("NoValidResource");
    @lok(value="Invalid deployable request.")
    @lpl(value="Displayed to a player when there is a non valid deployable request.")
    public static final lox ulD = ulk.BC("NoValidRequest");
    @lok(value="This ship has already a $(Resource.NameSingular).")
    @lpl(value="Displayed to a player when tries to install an upgrade on a ship which has already the same type of this upgrade.")
    public static final lox ulE = ulk.a("BoatHaveAlreadyTheObject", mbr.Bl("Resource"));
    @lok(value="You can not deploy $(Resource.NameSingular) on this ship.")
    @lpl(value="Displayed to a player when tries to install an upgrade on a ship which can not have this type of upgrade.")
    public static final lox ulF = ulk.a("BoatCanNotDeployObject", mbr.Bl("Resource"));
    @lok(value="You can not deploy another object so soon.")
    @lpl(value="Displayed to a player when she tries to deploy another object too soon.")
    public static final lox ulG = ulk.BC("DeployTooSoon");
    @lok(value="This mount still belongs to someone else")
    @lpl(value="Displayed to a player when they try to access a mount that is inaccessible")
    public static final lox ulH = ulk.BC("MountInaccessible");
    @lok(value="This boat still belongs to someone else")
    @lpl(value="Displayed to a player when they try to access a boat that is inaccessible")
    public static final lox ulI = ulk.BC("BoatInaccessible");
    @lok(value="Object is inaccessible")
    @lpl(value="Displayed to a player when they try to access an object that is inaccessible")
    public static final lox ulJ = ulk.BC("ObjectInaccessible");
    @lok(value="You can not place a Strong Box because you are not a member of a Clan")
    @lpl(value="Displayed to a player when they attempt to deploy a siege strong-box, but they are not a member of a clan")
    public static final lox ulK = ulk.BC("SiegeStrongBoxNotClanMember");
    @lok(value="You can not place a Strong Box because your Clan is not in a Conquest")
    @lpl(value="Displayed to a player when they attempt to deploy a siege strong-box, but their clan is not involved in a conquest challenge")
    public static final lox ulL = ulk.BC("SiegeStrongBoxClanNotInConquest");
    @lok(value="You can not place a Strong Box this close to the challenged holding")
    @lpl(value="Displayed to a player when they attempt to deploy a siege strong-box, but they are too close to the challenged holding")
    public static final lox ulM = ulk.BC("SiegeStrongBoxTooCloseToChallengedHolding");
    @lok(value="You can not place a Strong Box this far away from the challenged holding")
    @lpl(value="Displayed to a player when they attempt to deploy a siege strong-box, but they are too far from the challenged holding")
    public static final lox ulN = ulk.BC("SiegeStrongBoxTooFarFromChallengedHolding");
    @lok(value="You can not place a Strong Box at this time")
    @lpl(value="Displayed to a player when they attempt to deploy a siege strong-box, but an unhandled error occurs")
    public static final lox ulO = ulk.BC("SiegeStrongBoxError");
    @lok(value="$(PlayerName) found the flag you placed")
    @lpl(value="Displayed to the player who placed a use flag, when it is found by another player")
    public static final lox ulP = ulk.a("UseFlagFoundPersonal", mbr.Bk("PlayerName"));
    @lok(value="$(PlayerName) found the flag placed by $(OwnerName)")
    @lpl(value="Displayed to all players in the area around a placed use flag, when it is found by another player")
    public static final lox ulQ = ulk.a("UseFlagFoundArea", mbr.Bk("PlayerName"), mbr.Bk("OwnerName"));
    @lok(value="You have already feasted from the $(Resource.NameSingular). You can enjoy again their delicious bonuses in $(Time)")
    @lpl(value="Displayed to all players in the area around a placed use flag, when it is found by another player")
    public static final lox ulR = ulk.a("GanksGivingMaxBonusOnCooldown", mbr.Bl("Resource"), mbr.Bi("Time"));
    @lok(value="You can heal yourself enjoying the $(Resource.NameSingular) again in $(Time)")
    @lpl(value="Displayed to all players in the area around a placed use flag, when it is found by another player")
    public static final lox ulS = ulk.a("GanksGivingHealingOnCooldown", mbr.Bl("Resource"), mbr.Bi("Time"));

    protected mbr(String string) {
        super("DeployableObjects." + string);
    }

    private mbr() {
        super("DeployableObjects");
    }
}

