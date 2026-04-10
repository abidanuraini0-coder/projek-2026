public class Monster {
    protected String name;
    protected int baseHp;

    // Constructor
    public Monster(String name, int baseHp) {
        this.name = name;
        this.baseHp = baseHp;
    }

    // Method
    public void monsterSound() {
        System.out.println("Groooar! Monster mendekat!");
    }
}