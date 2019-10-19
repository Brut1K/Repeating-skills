package Homework.HW8.task1_2;

public class ThirdteenException extends RuntimeException {
    public String getRussianMessage(){
        return "13 плохое число, используйте другое";
    }

    public ThirdteenException() {
    }
}
