package pl.panczyk.comp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.panczyk.comp1.model.ConiferTree;
import pl.panczyk.comp1.model.Tree;

@SpringBootTest
class Comp1ApplicationTests {

    @Test
    void createTreeTest() {
        Tree tree = new ConiferTree("conifer 1", 2.1, 1.5, 100, 200, true);
        Assertions.assertNotNull(tree);
    }

    @Test
    void treeDieTest() {
        ConiferTree tree = new ConiferTree("conifer 1", 2.1, 1.5, 100, 200,true);
        tree.die();
        Assertions.assertFalse(tree.getAreNeedlesGreen());
    }

    @Test
    void treeGrowTest() {
        ConiferTree tree = new ConiferTree("conifer 1", 2.1, 1.5, 100, 200,true);
        tree.grow();
        Assertions.assertTrue(tree.getHeight() > 2.1 && tree.getNeedles() > 200
                && tree.getBranches() > 100 && tree.getTrunkLength() > 1.5);
    }

    @Test
    void treeGoSickTest() {
        ConiferTree tree = new ConiferTree("conifer 1", 2.1, 1.5, 100, 200,true);
        tree.goSick();
        Assertions.assertTrue(!tree.getAreNeedlesGreen() && tree.getBranches() < 100 && tree.getNeedles() < 200);
    }

}
