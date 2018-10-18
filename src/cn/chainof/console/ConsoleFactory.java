package cn.chainof.console;

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
    private MessageConsoleStream consoleStream= null;
    private IConsoleManager consoleManager = null;
    private final String CONSOLE_NAME = "Console";
    
    private void initConsole() {
        consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        IConsole[] consoles = consoleManager.getConsoles();
        if(consoles.length >0) {
            _console = (MessageConsole) consoles[0];
        }else {
            _console = new MessageConsole(CONSOLE_NAME, null);
            consoleManager.addConsoles(new IConsole[] {_console});
        }
        
        consoleStream = _console.newMessageStream();
    }
    
    
}
