package FamilyTree.FamilyTree;

import FamilyTree.Human.Human;
import FamilyTree.Human.HumanComparator;

import java.io.Serializable;
import java.util.*;

public class FamilyTree<E extends ItemFamilyTree> implements Serializable, Iterable<E> {
    private long id;
    private List<E> familyMembers;

    public FamilyTree() {
        familyMembers = new ArrayList<>();
    }

    public List<E> getFamilyMember(String name) {
        List<E> matchingMembers = new ArrayList<>();
        for (E member : familyMembers) {
            if (member.getName().equals(name) || member.getSecondName().equals(name)) {
                matchingMembers.add((member) );
            }
        }
        return matchingMembers;
    }

    public void addMember(E human) {
        familyMembers.add((human));
        human.setId(id++);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("family tree:\n");
        for (E familyMember : familyMembers) {
            stringBuilder.append(familyMember);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        Collections.sort(familyMembers, null);
    }

    public void sortByAge() {
        familyMembers.sort(new HumanComparator());
    }

    @Override
    public Iterator<E> iterator() {
        return familyMembers.iterator();
    }

    //    public static void seachPersonByName(Scanner sc, FamilyTree familyTree) {
//        System.out.println("Введите имя человека, которого нужно найти: ");
//        String name = sc.nextLine();
//        boolean found = false;
//        for (Human person : familyTree.getFamilyMember(name)) {
//            if (person.getName().equals(name) || person.getSecondName().equals(name)) {
//                System.out.println(person + System.lineSeparator());
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("Человек с таким именем не найден.");
//        }
//    }
}