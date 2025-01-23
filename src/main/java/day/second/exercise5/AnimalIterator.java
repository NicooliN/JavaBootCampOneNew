package day.second.exercise5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class AnimalIterator
        implements BaseIterator<Animal> {
    private List<Animal> animalList;
    private int index;

    public AnimalIterator(List<Animal> animalList) {
        this.animalList = animalList;
    }


    @Override
    public Animal next() {
        if (index >= 0 && index <= animalList.size()) {
            this.index++;
            return animalList.get(index - 1);
        } else {
            this.index = 0;
            return null;
        }
    }

    @Override
    public boolean hasNext() {
            return this.index <= animalList.size();
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
