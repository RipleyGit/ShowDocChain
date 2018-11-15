package cn.chainof.console;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.swing.JOptionPane;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * @since 2018��10��18�� ����7:30:02
 * @author �ݰ�ˮ
 *
 */
public class ConsoleFactory {
    private MessageConsole _console = null;
    private MessageConsoleStream consoleStream = null;
    private IConsoleManager consoleManager = null;
    private final String CONSOLE_NAME = "Console";
    public static ConsoleFactory console = new ConsoleFactory();

    private void initConsole() {
        consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        IConsole[] consoles = consoleManager.getConsoles();
        if (consoles.length > 0) {
            _console = (MessageConsole) consoles[0];
        } else {
            _console = new MessageConsole(CONSOLE_NAME, null);
            consoleManager.addConsoles(new IConsole[] { _console });
        }

        consoleStream = _console.newMessageStream();
    }

    public void print(Object message) {
        print(message);
        print("\n");
    }

    /**
     * �������̨
     * 
     * @param e
     */
    public static void error(Exception e) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        e.printStackTrace(ps);
        console.print(out.toString());
        JOptionPane.showMessageDialog(null, e.toString(), "����", JOptionPane.ERROR_MESSAGE);
    }

}
