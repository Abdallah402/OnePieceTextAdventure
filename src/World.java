import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<>();
    public void load_tiles() {
        List<String> rows = new ArrayList<>();
        try{
            BufferedReader f =new BufferedReader(new FileReader(("src/map.txt")));
            String row;
            while  ((row = f.readLine()) != null ) {
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y =0; y < rows.size(); y++){
                cols = rows.get(y).split("\t");
                for (int x = 0;x < x_max; x++) {
                    tile_name = cols[x];
                    if (tile_name.equals("StartingIsland")){
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] =tile_name.equals(" ") ? null :tile_name;
                }
            }
        } // closing try block
        catch (Exception e) {
            // System.err.format( "Exception occurred trying to read in the file name)
            e.printStackTrace();
        }
    } // closing block for load_tiles Method
    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;
        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]){
                case "StartingIsland":
                    mt = new StartingIsland(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "MarineIsland":
                    mt = new MarineIsland(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureIsland":
                    mt = new TreasureIsland(x, y, new Gold(15));
                    mt = checkRoomExists(mt);
                    break;
                case "PunkHazard":
                    mt = new PunkHazard(x, y, new Marine());
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyIsland":
                    mt = new EmptyIsland(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "Wano":
                    mt = new Wano(x, y, new Katana());
                    mt = checkRoomExists(mt);
                    break;


            }
        }
        return mt;
    }

    private static MapTile checkRoomExists(MapTile mt) {
        if (history.indexOf(mt) != -1) {
            mt = history.get(history.indexOf(mt));
        } else {
            history.add(mt);
        }
        return mt;
    }
}