package FamilyTree.Human;

import FamilyTree.FamilyTree.ItemFamilyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable, Comparable<Human>, ItemFamilyTree {
    private long id;
    private String name;
    private String secondName;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private Human father, mother;
    private List<Human> children;

    public Human(String name, String secondName, LocalDate birthDate, LocalDate deathDate,
                 Gender gender, Human father, Human mother) {
        id = -1;
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }

    public Human(String name, String secondName, LocalDate birthDate, LocalDate deathDate, Gender gender) {
        this(name, secondName, birthDate, deathDate, gender, null, null);
    }

    public Human(String name, String secondName, LocalDate birthDate, Gender gender) {
        this(name, secondName, birthDate, null, gender, null, null);
    }

    public Human(String name, String secondName, LocalDate birthDate,
                 Gender gender, Human father, Human mother) {
        this(name, secondName, birthDate, null, gender, father, mother);
    }

    public Human(String name, String secondName, Gender gender) {
        this(name, secondName, null, null, gender, null, null);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public List<ItemFamilyTree> getFamilyMember(String name) {
        return List.of();
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", second name: " + secondName + ", gender: " + gender + ", date of born: " + birthDate
                + ", children: " + children;
    }

    @Override
    public int compareTo(Human anotherHuman) {
        return this.name.compareTo(anotherHuman.name);
    }
}
