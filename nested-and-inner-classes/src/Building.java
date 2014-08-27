import java.util.Iterator;

public class Building implements Iterable<Human> {

    private static final int BUILDING_CAPACITY = 10;

    private Human[] humans = new Human[BUILDING_CAPACITY];

    private int howMachPeoples = 0;

    public int getHowMachPeoples(){
        return howMachPeoples;
    }

    public void addPeoples(Human human){
        if (getHowMachPeoples() == BUILDING_CAPACITY){
            return;
        } else {
            humans[howMachPeoples++] = human;
        }
    }

    public Human get(int index){
        return humans[index];
    }

    //method iterable mast return iterator
    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator();
    }

    private class HumanIterator implements Iterator<Human>{

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < howMachPeoples;
        }

        @Override
        public Human next() {
            return humans[current++];
        }

        @Override
        public void remove() {

        }
    }

}
