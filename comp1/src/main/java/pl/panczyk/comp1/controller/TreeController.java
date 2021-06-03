package pl.panczyk.comp1.controller;

import org.springframework.web.bind.annotation.*;
import pl.panczyk.comp1.model.ConiferTree;
import pl.panczyk.comp1.model.LeafyTree;
import pl.panczyk.comp1.model.Tree;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/trees")
public class TreeController {

    final List<Tree> trees;

    public TreeController() {
        this.trees = new ArrayList<>();
    }

    @GetMapping
    public List<Tree> allTrees() {
        return trees;
    }

    @PostMapping("leafy")
    public LeafyTree addLeafyTree(@RequestBody LeafyTree leafyTree) {
        trees.add(leafyTree);
        return leafyTree;
    }

    @PostMapping("conifer")
    public ConiferTree addLeafyTree(@RequestBody ConiferTree coniferTree) {
        trees.add(coniferTree);
        return coniferTree;
    }

    @GetMapping("grow")
    public Tree grow(@RequestParam Integer id) {
        Tree tree = trees.get(id);
        tree.grow();
        return tree;
    }

    @GetMapping("goSick")
    public Tree goSick(@RequestParam Integer id) {
        Tree tree = trees.get(id);
        tree.goSick();
        return tree;
    }


    @GetMapping("die")
    public Tree die(@RequestParam Integer id) {
        Tree tree = trees.get(id);
        tree.die();
        return tree;
    }

}
