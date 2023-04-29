public class OnePiece extends MapTile {
    public OnePiece(int x, int y){
        super(x,y);
    }
    public String intro_text(){
        return"\n You see a bright light in the distance...\n it grows as you get closer.";
    }
    public void modify_player(Player player){
        player.victory = true;
    }
}
