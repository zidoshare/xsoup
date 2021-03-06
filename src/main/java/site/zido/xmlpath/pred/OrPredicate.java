package site.zido.xmlpath.pred;

import site.zido.xmlpath.Predicate;

import java.util.LinkedList;
import java.util.List;

/**
 * Predicate keywords : or.
 *
 * @author zido
 */
public class OrPredicate implements Predicate {
    private List<Predicate> sub = new LinkedList<>();

    public OrPredicate(List<Predicate> sub) {
        this.sub.addAll(sub);
    }

    public OrPredicate(Predicate sub){
        this.sub.add(sub);
    }

    @Override
    public void predicate() {

    }
}
