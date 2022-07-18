package deanery.room;

public class Room {
    private String number;
    private int open;
    private int close;
    private String type;

    public Room(String number, int open, int close) {
        this.number = number;
        this.open = open;
        this.close = close;
    }

    public String getNumber() {
        return number;
    }

    public int getOpen() {
        return open;
    }

    public int getClose() {
        return close;
    }

    public String getType() {
        return type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public void setClose(int close) {
        this.close = close;
    }


}
