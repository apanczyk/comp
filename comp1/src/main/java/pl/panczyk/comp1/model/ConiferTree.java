package pl.panczyk.comp1.model;

import javax.validation.constraints.NotEmpty;

public class ConiferTree extends Tree {
    @NotEmpty
    private Integer needles;
    @NotEmpty
    private Boolean areNeedlesGreen;

    public ConiferTree(String name, Double height, Double trunkLength, Integer branches, Integer needles, Boolean areNeedlesGreen) {
        super(name, height, trunkLength, branches);
        this.needles = needles;
        this.areNeedlesGreen = areNeedlesGreen;
    }

    @Override
    public void grow() {
        super.grow();
        setAreNeedlesGreen(true);
        setNeedles((int) (getNeedles()*1.2));
    }

    @Override
    public void goSick() {
        setAreNeedlesGreen(false);
        setNeedles((int) (getNeedles()*0.4));
        setBranches((int) (getBranches()*0.85));
    }

    @Override
    public void die() {
        setNeedles((int) (getNeedles()*0.01));
        setAreNeedlesGreen(false);
    }

    public Integer getNeedles() {
        return needles;
    }

    public void setNeedles(Integer needles) {
        this.needles = needles;
    }

    public Boolean getAreNeedlesGreen() {
        return areNeedlesGreen;
    }

    public void setAreNeedlesGreen(Boolean areNeedlesGreen) {
        this.areNeedlesGreen = areNeedlesGreen;
    }
}
