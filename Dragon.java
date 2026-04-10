public class Dragon extends Monster {
    private String fireDamage;

    // Constructor
    public Dragon(String name, int baseHp, String fireDamage) {
        super(name, baseHp); // panggil constructor Monster
        this.fireDamage = fireDamage;
    }

    // Override method
    @Override
    public void monsterSound() {
        System.out.println("ROOAAR! Naga menyemburkan api " + fireDamage + "!");
    }
}