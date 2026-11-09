/*
 * Decompiled with CFR.
 */
public class mcw
extends lzh {
    private static final mcw uCt = new mcw();
    @lok(value="You cancelled the process.")
    @lpl(value="Displayed when player cancels the teleportation process.")
    public static final lox uCu = uCt.BC("ProcessCanceled");
    @lok(value="You need $(Quantity) $(Resource.Name$(Quantity.Plurality)) to teleport to the selected chamber.")
    @lpl(value="Displayed when player tries to teleport to the specified teleportation chamber without having the needed portal shards.")
    public static final lox uCv = uCt.a("NotEnoughTeleportCost", mcw.Bh("Quantity"), mcw.Bl("Resource"));
    @lok(value="You are already using the $(Resource.NameSingular).")
    @lpl(value="Displayed when player tries to interact with a teleportation chamber while there already an open session.")
    public static final lox uCw = uCt.a("SessionActive", mcw.Bl("Resource"));
    @lok(value="You are too far away from the portal entry. Move closer and try again.")
    @lpl(value="Displayed when player tries to interact with a teleportation chamber while is too far away.")
    public static final lox uCx = uCt.BC("TooFarAway");
    @lok(value="Teleportation request failed.")
    @lpl(value="Displayed when teleportation request fails.")
    public static final lox tYV = uCt.BC("Failed");
    @lok(value="You can not use $(TeleportChamber.NameSingular) while you are carrying $(Relic.NameSingular).")
    @lpl(value="Displayed when teleportation request fails.")
    public static final lox uCy = uCt.a("RelicCarrier", mcw.Bl("TeleportChamber"), mcw.Bl("Relic"));
    @lok(value="You can not teleport again so soon, wait until your are full of energy again.")
    @lpl(value="Displayed when teleportation request fails due to sickness debuff.")
    public static final lox uCz = uCt.BC("SicknessDebuff");

    protected mcw(String string) {
        super("TeleportationChamber." + string);
    }

    private mcw() {
        super("TeleportationChamber");
    }
}

