package FamilyTree.FamilyTree;

import FamilyTree.Human.Human;

import java.time.LocalDate;
import java.util.List;

public interface ItemFamilyTree {

    String getName();
    String getSecondName();
    LocalDate getBirthDate();
    List<ItemFamilyTree> getFamilyMember(String name);
    void setId(long l);
}