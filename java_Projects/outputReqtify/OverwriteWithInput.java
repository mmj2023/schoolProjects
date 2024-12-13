import jdk.internal.org.jline.reader.LineReader;
import jdk.internal.org.jline.reader.LineReaderBuilder;
import jdk.internal.org.jline.terminal.Terminal;
import jdk.internal.org.jline.terminal.TerminalBuilder;

public class OverwriteWithInput {
    public static void main(final String[] args) throws Exception {
        final Terminal terminal = TerminalBuilder.terminal();
        final LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();

        System.out.print("Enter something: ");
        final String input = reader.readLine();

        // Clear the line by printing spaces and then carriage return
        // terminal.writer().print("\r\033[K");
        terminal.writer().print("\r");
        terminal.writer().print("New output after input: " + input);
        terminal.flush();
    }
}

