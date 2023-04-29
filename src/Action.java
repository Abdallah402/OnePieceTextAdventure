public class Action {
    private Method method;
    private char hotkey;
    public char getHotkey(){
        return hotkey;}
    public void setHotkey(char hotkey) {this.hotkey = hotkey;}
    private String name;
    public String getName(){
        return name;}
    public void setName(String name) {this.name = name;}
    private Marine kwargs;
    public Marine getKwargs() {
        return kwargs;
    }
    public void setKwargs(Marine kwargs) {this.kwargs = kwargs;
    }
    public Action(Method method, String name, char hotkey, Marine kwargs ){
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
    }
    public String str(){return hotkey + ": " + name;}
}
