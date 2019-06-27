package ClassAsVars;

public class Entrance {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Gailun");
        hero.setAge(20);

        Weapon weapon = new Weapon("Sword");
        hero.setWeapon(weapon);

        hero.attack();

    }

}
