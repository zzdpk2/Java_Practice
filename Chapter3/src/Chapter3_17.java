import java.util.Scanner;

public class Chapter3_17 {
    enum StatusType{
        USR_SCISSOR(0, -1), USR_PAPER(1, 2), USR_STONE(2, -3),
        PC_SCISSOR(0, 1), PC_PAPER(1, -2), PC_STONE(2, 3);

        private final int key;
        private final int map;

        private StatusType(int key, int map){
            this.key = key;
            this.map = map;
        }

        public StatusType USRMatchType(int value){
            switch (value){
                case 0: return StatusType.USR_SCISSOR;
                case 1: return StatusType.USR_PAPER;
                case 2: return StatusType.USR_STONE;
                default: return null;
            }
        }

        public StatusType PCMatchType(int value){
            switch (value){
                case 0: return StatusType.PC_SCISSOR;
                case 1: return StatusType.PC_PAPER;
                case 2: return StatusType.PC_STONE;
                default: return null;
            }
        }

        public int getMap(StatusType type) {
            return type.map;
        }
    }

    enum ResultWeightType{
        LOSE01(3), LOSE02(-1), LOSE03(-2),
        WIN01(1), WIN02(2), WIN03(-3);

        private final int value;

        private ResultWeightType(int value){
            this.value = value;
        }

        public int getValue(ResultWeightType type){
            return type.value;
        }

    }

//    protected static int bitwise_op(int _move_type){
//        int _init_tag = 0b10000000;
//        switch (_move_type){
//            case 2: _init_tag = (_init_tag >> 1);
//            case 1: _init_tag = (_init_tag >> 2);
//            case 0: _init_tag = (_init_tag >> 3);
//            default:
//                System.out.println("Error input!");
//                _init_tag = 0;
//        }
//        return _init_tag;
//    }

    // Bit description:
    // 0     0     0     0   0 0 0 0
    // valid sci paper stone
    public static void main(String[] args) {

//        int[] _undefine_pattern = {0b00000000, 0b01000100, 0b00100010, 0b00010001};
//        int[] _win_pattern = {0b01000010, 0b00100001, 0b00010100};
//        int[] _lost_pattern = {0b01000001, 0b00100100, 0b00010010};

        System.out.println("Please input the number: scissor(2), paper(1), stone(0)");
        Scanner scanner = new Scanner(System.in);
        int _user_input = scanner.nextInt();
        int _pc_output = ((int) Math.random() * 100) % 3;

        StatusType _usr_type = null;
        StatusType _pc_type = null;

        int _user_result = _usr_type.getMap(_usr_type.USRMatchType(_user_input));
        int _pc_result = _pc_type.getMap(_pc_type.PCMatchType(_pc_output));

        if(_user_result * _pc_result < 0)
            System.out.println("You win!");
        else if(_user_result * _pc_result > 0)
            System.out.println("You lose!");
        else
            System.out.println("Try again!");

    }
}
