import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Admin admin = new Admin("Administrator", 100);

        GroupMember groupMember_1 = new GroupMember("A", 0);
        GroupMember groupMember_2 = new GroupMember("B", 0);
        GroupMember groupMember_3 = new GroupMember("C", 0);

        admin.show();
        groupMember_1.show();
        groupMember_2.show();
        groupMember_3.show();
        System.out.println("========================");

        ArrayList<Double> redList =admin.send(100,6);

        groupMember_1.receive(redList);
        groupMember_2.receive(redList);
        groupMember_3.receive(redList);

        admin.show();
        groupMember_1.show();
        groupMember_2.show();
        groupMember_3.show();

    }
}
