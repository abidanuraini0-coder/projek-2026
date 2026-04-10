public class Main {
    public static void main(String[] args) {

        // Instansiasi objek
        Goblin goblin = new Goblin("Goblin Kecil", 50);
        Dragon dragon = new Dragon("Naga Merah", 200, "Fire Blast");

        // Panggil method
        goblin.monsterSound();
        dragon.monsterSound();
    }
}
