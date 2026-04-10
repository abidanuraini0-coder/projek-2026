public class Goblin extends Monster {

    // Constructor
    public Goblin(String name, int baseHp) {
        super(name, baseHp); // panggil constructor Monster
    }

    // Override method
    @Override
    public void monsterSound() {
        System.out.println("Kikikiki! Goblin mengendap-endap dan memasang jebakan!");
    }
}