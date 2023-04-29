public class LeaveIsland extends MapTile {
    public LeaveIsland(int x, int y){
        super(x,y);
    }
    public String intro_text(){
        return"\n You see a bright island with the smell of liberation, the wind starts to pick upi";
    }
    public void modify_player(Player player){
        player.victory = true;
    }
}
