public class MarineIsland extends EnemyIsland{
    Marine enemy;
    public MarineIsland (int x, int y){
        super( x,y, null);
        this.enemy = enemy;
    }
    public String intro_text() {
        if (enemy.is_alive()){
            return "When alive";
        }else{
            return "When dead";}
    }
}