//WAP to create a Room class, the attributes of this class are roomNo, roomType, roomArea and AcMachine.
// In this class the member functions are setData and displayData.
// Use member function to set data and display that data using displayData() method.

package Lab2;

public class Room {
    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;

    public void setData(int roomNo, String roomType, double roomArea, boolean acMachine){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }
    public void displayData(){
        System.out.println("Room Number : " + roomNo);
        System.out.println("Room Type : " + roomType);
        System.out.println("Room Area : "+ roomArea);
        System.out.println("AC Machine : "+ acMachine);

    }

    public static void main(String[] args) {
        Room room = new Room();
        room.setData(318, "Regular", 80.5, false);
        room.displayData();
    }
}
