package Classes.Composition;

public class Main {

    public static void main(String[] args) {

        Couch couch = new Couch("Skin", "Italy");
        Floors floors = new Floors("Marble", "Slight-Grey", "Carrara, Italy", new Chairs("Aluminum", 1, couch));
        Walls walls = new Walls("armed-concrete", "white", 2, 4, floors);

        Room myRoom = new Room(walls, floors, couch);
        myRoom.assembleTheRoom();

    }
}
