public class Hat extends Weapon {
    public Hat() {
        super("Pillow", "Made of soft wool to sleep on",
                10, 5);

    }
    public Hat(String name, String description, int value, int damage) {
        super("Soft Pillow", "A pillow made from sheep wool",
                10, 20);
    }
}