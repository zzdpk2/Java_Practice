import java.util.Scanner;

public class Chapter3_17 {
//    enum StatusType{
//        SCISSOR(0), PAPER(1), STONE(2);
//        private final int value;
//
//        private StatusType(int value){
//            this.value = value;
//        }
//
//        public StatusType MatchType(int value){
//            switch (value){
//                case 0: return StatusType.SCISSOR;
//                case 1: return StatusType.PAPER;
//                case 2: return StatusType.STONE;
//                default: return null;
//            }
//        }
//    }


    protected static int bitwise_op(int _move_type){
        int _init_tag = 0b10000000;
        switch (_move_type){
            case 2: _init_tag = (_init_tag >> 1);
            case 1: _init_tag = (_init_tag >> 2);
            case 0: _init_tag = (_init_tag >> 3);
            default:
                System.out.println("Error input!");
                _init_tag = 0;
        }
        return _init_tag;
    }

    // Bit description:
    // 0     0     0     0   0 0 0 0
    // valid sci paper stone
    public static void main(String[] args) {

        int[] _undefine_pattern = {0b00000000, 0b01000100, 0b00100010, 0b00010001};
        int[] _win_pattern = {0b01000010, 0b00100001, 0b00010100};
        int[] _lost_pattern = {0b01000001, 0b00100100, 0b00010010};

        System.out.println("Please input the number: scissor(2), paper(1), stone(0)");
        Scanner scanner = new Scanner(System.in);
        int _user_input = scanner.nextInt();
        int _pc_output = ((int) Math.random() * 100) % 3;

        int _result = 

    }
}
