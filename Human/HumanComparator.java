package FamilyTree.Human;

import FamilyTree.FamilyTree.ItemFamilyTree;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class HumanComparator<T extends ItemFamilyTree> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Period.between(o1.getBirthDate(), LocalDate.now()).getYears()
                - Period.between(o2.getBirthDate(), LocalDate.now()).getYears();
    }
}