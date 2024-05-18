import java.util.ArrayList;

public class ColisionCensor {
    private PathAgent censor;
    public ArrayList<Cost> cost = new ArrayList<>();

    public ColisionCensor() {
    }

    public ColisionCensor(PathAgent censor) {
        this.censor = censor;
    }

    public ColisionCensor(ArrayList<Cost> cost) {
        this.cost = cost;
    }

    public ColisionCensor(PathAgent censor, ArrayList<Cost> cost) {
        this.censor = censor;
        this.cost = cost;
    }
}
