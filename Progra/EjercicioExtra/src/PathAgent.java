import java.util.ArrayList;

public class PathAgent {
    public Driver control;
    private ArrayList<ColisionCensor> censor = new ArrayList<>();

    public PathAgent() {
    }

    public PathAgent(ArrayList<ColisionCensor> censor, Driver control) {
        this.censor = censor;
        this.control = control;
    }

    public PathAgent(Driver control) {
        this.control = control;
    }

    public void asociando (ColisionCensor a){
        this.censor.add(a);
        censor.add(a);
        Cost c1 = new Cost(a);
        c1.setA((ArrayList<ColisionCensor>) censor.subList(0,1));
    }

    public ArrayList<ColisionCensor> getCensor() {
        return censor;
    }

    public void setCensor(ArrayList<ColisionCensor> censor) {
        this.censor = censor;
    }

    public void setCensor(ColisionCensor censor) {
        this.censor.add(censor);
    }


}
