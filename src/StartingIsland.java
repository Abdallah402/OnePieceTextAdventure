public class StartingIsland extends MapTile{

    public StartingIsland(int x, int y) {
        super(x, y);
    }


    public String intro_text(){
        return "\n You find yourself stranded on a island with a boat, the only thing left to do is sail out";}

    public void modify_player(Player player){

    }
}