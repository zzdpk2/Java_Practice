import java.util.Scanner;

public class Chapter3_17 {
    enum StatusType{
        SCISSOR(0), PAPER(1), STONE(2);
        private final int value;

        private StatusType(int value){
            this.value = value;
        }

        public StatusType MatchType(int value){
            switch (value){
                case 0: return StatusType.SCISSOR;
                case 1: return StatusType.PAPER;
                case 2: return StatusType.STONE;
                default: return null;
            }
        }
    }

    public static void main(String[] args) {

    }
}
