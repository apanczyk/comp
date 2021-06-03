package pl.panczyk.comp1.model;

import javax.validation.constraints.NotEmpty;

public abstract class Tree {

    @NotEmpty
    private String name;
    @NotEmpty
    private Double height;
    @NotEmpty
    private Double trunkLength;
    @NotEmpty
    private Integer branches;

    public Tree(String name, Double height, Double trunkLength, Integer branches) {
        this.name = name;
        this.height = height;
        this.trunkLength = trunkLength;
        this.branches = branches;
    }

    public void grow() {
        setBranches(getBranches()*2);
        setHeight(getHeight()*1.2);
        setTrunkLength(getTrunkLength()*1.2);
    }
    public abstract void goSick();
    public abstract void die();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(Double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public Integer getBranches() {
        return branches;
    }

    public void setBranches(Integer branches) {
        this.branches = branches;
    }
}
