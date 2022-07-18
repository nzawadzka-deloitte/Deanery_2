package deanery.room;

public class PartTimeRoom extends Room{

    public PartTimeRoom(String number, int open, int close) {
        super(number, open, close);
    }
    final String type = "part time";

    public String getType() {
        return type;
    }
}
