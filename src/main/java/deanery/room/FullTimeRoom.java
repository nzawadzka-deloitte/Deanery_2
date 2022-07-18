package deanery.room;

public class FullTimeRoom extends Room{
    public FullTimeRoom(String number, int open, int close) {
        super(number, open, close);
    }
    final String type = "full time";

    public String getType() {
        return type;
    }
}
