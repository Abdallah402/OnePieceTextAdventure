public class EnemyIsland extends MapTile {
    private Enemy enemy;

    public EnemyIsland(int x, int y, Enemy enemy) {
        super(x, y);
        this.enemy = enemy;

    }

    public void modify_player(Player the_player) {
        if (enemy.is_alive()) {
            the_player.hp = the_player.hp - enemy.damage;
        }
    }
}
