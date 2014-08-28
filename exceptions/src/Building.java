public class Building {

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

}
