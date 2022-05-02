/**
 * Name: Xuan
 * Date: 05/02/2022
 */

public class Skin {

    private String name;

    private Gun gun;

    private boolean upgrade;

    private int price;

    public Skin(String name, Gun gun, boolean upgrade, int price) {
        this.name = name;
        this.gun = gun;
        this.upgrade = upgrade;
        this.price = price;
    }

    public String getName() {

        return this.name;

    }

    public Gun getGun() {

        return this.gun;

    }

    public boolean getUpgradeable() {

        return this.upgrade;

    }

    public int getPrice() {

        return this.price;

    }

    public String toString() {

        String skinString = "";

        skinString = skinString + "Name: " + this.name + "\n";
        skinString = skinString + "Gun: " + this.gun.getName() + "\n";
        skinString = skinString + "Upgradeable: " + this.upgrade + "\n";
        skinString = skinString + "Price: " + this.price + "VP\n";
        return skinString;

    }
}