public class Profile {
    public static int id;
    private String charName;
    private String klasse;
    private int level;
    private int ap;
    private int dp;
    private int gearscore;

    Profile (String charName, String klasse, int level, int ap, int dp) {
        this.charName = charName;
        this.klasse = klasse;
        this.level = level;
        this.ap = ap;
        this.dp = dp;
        this.gearscore = ap + dp;
        this.id++;
    }

    public void showProfile() {
        System.out.println("ID: "+id);
        System.out.println("Charactername: "+charName);
        System.out.println("Class: "+klasse);
        System.out.println("Characterlevel: "+level);
        System.out.println("AP/DP: "+ap+"/"+dp);
        System.out.println("Gearscore (AP+DP): "+gearscore);
    }

}
