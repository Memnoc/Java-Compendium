package Classes.Composition;

public class Room {

    private Walls theWalls;
    private Floors theFloors;
    private Couch theCouch;

    public Room(Walls theWalls, Floors theFloors, Couch theCouch) {
        this.theWalls = theWalls;
        this.theFloors = theFloors;
        this.theCouch = theCouch;
    }

    public void assembleTheRoom() {
        theWalls.paintTheWalls("blue");
        theFloors.wipeTheFloor();
        theCouch.sitOnTheCouch();
    }
}
