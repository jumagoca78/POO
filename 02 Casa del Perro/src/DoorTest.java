public class DoorTest {
    public static void main(String[] args) throws Exception {
        DogDoor door = new DogDoor();
        DogRemote remote = new DogRemote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        remote.pressButton();
        System.out.println("\nFido's all done...");
        remote.pressButton();
        System.out.println("\nFido's back inside...");
        remote.pressButton();
    }
}
