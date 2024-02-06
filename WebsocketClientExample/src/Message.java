import java.io.Serializable;
public class Message implements Serializable {
    private final String message;
    private final String from;
    private final String[] to;
    private final String command;
    private final String[] neighbours;

    public Message(String message, String from, String[] to, String command, String[] neighbors) {
        this.message = message;
        this.from = from;
        this.to = to;
        this.command = command;
        this.neighbours = neighbors;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public String[] getTo() {
        return to;
    }

    public String getCommand() {
        return command;
    }

    public String[] getNeighbours() {
        return neighbours;
    }
}
