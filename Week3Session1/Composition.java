package OOP.week3session1;

import java.util.List;
import java.util.ArrayList;

// Room class
class Room {

    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}

// House class
class House {

    private String houseName;
    private List<Room> rooms;

    public House(String houseName) {
        this.houseName = houseName;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public int getTotalRooms() {
        return rooms.size();
    }
}

public class Composition {
    public static void main(String[] args) {
        House house = new House("Dream House");

        house.addRoom(new Room("Living Room"));
        house.addRoom(new Room("Bedroom"));
        house.addRoom(new Room("Kitchen"));
        house.addRoom(new Room("Bathroom"));

        int r = house.getTotalRooms();
        System.out.println("Total Rooms: " + r);

        System.out.println("Room names: ");
        for (Room room : house.getRooms()) {
            System.out.println("- " + room.getRoomName());
        }
    }
}
