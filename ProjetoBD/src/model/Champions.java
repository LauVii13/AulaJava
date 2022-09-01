package model;

public class Champions {
    private String name;
    private String lane;
    private String function;

    public Champions(String name, String lane, String function) {
        this.name = name;
        this.lane = lane;
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }
    
}
