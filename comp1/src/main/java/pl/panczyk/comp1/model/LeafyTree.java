package pl.panczyk.comp1.model;

import javax.validation.constraints.NotEmpty;

public class LeafyTree extends Tree {
    @NotEmpty
    private Integer leaves;

    public LeafyTree(String type, Double height, Double trunkLength, Integer branches, Integer leaves) {
        super(type, height, trunkLength, branches);
        this.leaves = leaves;
    }

    @Override
    public void grow() {
        super.grow();
        setLeaves(getLeaves()*2);
    }

    @Override
    public void goSick() {
        setLeaves((int) (getLeaves()*0.5));
        setBranches((int) (getBranches()*0.5));
    }

    @Override
    public void die() {
        setLeaves(0);
    }

    public Integer getLeaves() {
        return leaves;
    }

    public void setLeaves(Integer leaves) {
        this.leaves = leaves;
    }
}
