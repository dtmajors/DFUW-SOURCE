/*
 * Decompiled with CFR.
 */
public final class mfs
extends lpa {
    private static final mfs DgL = new mfs();
    @lok(value="Armor And Weapons")
    @lpl(value="Name of a container 'armor_and_weapons' for trainer completion rewards")
    public static final lox DgM = DgL.BC("ContainerName_armor_and_weapons");
    @lok(value="Tools")
    @lpl(value="Name of a container 'tools' for trainer completion rewards")
    public static final lox DgN = DgL.BC("ContainerName_tools");
    @lok(value="Weapons and Primal Regalia")
    @lpl(value="Name of a container 'weapons_and_primal_regalia' for trainer completion rewards")
    public static final lox DgO = DgL.BC("ContainerName_weapons_and_primal_regalia");
    @lok(value="Weapons and Elemental Vestments")
    @lpl(value="Name of a container 'weapons_and_elemental_vestments' for trainer completion rewards")
    public static final lox DgP = DgL.BC("ContainerName_weapons_and_elemental_vestments");
    @lok(value="Weapons and War Armor")
    @lpl(value="Name of a container 'weapons_and_war_armor' for trainer completion rewards")
    public static final lox DgQ = DgL.BC("ContainerName_weapons_and_war_armor");
    @lok(value="Weapon and Skirmish Armor")
    @lpl(value="Name of a container 'weapon_and_skirmish_armor' for trainer completion rewards")
    public static final lox DgR = DgL.BC("ContainerName_weapon_and_skirmish_armor");

    public mfs() {
        super("Trainer");
    }

    public mfs(String string) {
        super("Trainer." + string);
    }
}

