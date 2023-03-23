package objects;

public class processor {
    private String name;
    private int number;
    private String currentInstruction;    //indicates the current instruction that the processor is executing

    public processor(int number) {
        this.number = number;
        this.name = "Processor " + String.valueOf(this.number);
        this.currentInstruction = "Noneasdasdsas";
    }
}
