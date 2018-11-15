package cn.chainof.thread;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;

import cn.chainof.console.ConsoleFactory;
import cn.chainof.console.ProgressMonitor;

/**
 * @since 2018年10月18日 下午7:22:32
 * @author 虞帮水
 *
 */
public class SaveThread extends Thread {
    private ICompilationUnit copy;

    /**
     * @param copy
     */
    public SaveThread(ICompilationUnit copy) {
        super();
        this.copy = copy;
    }

    @Override
    public void run() {
        try {
            copy.commitWorkingCopy(true, new ProgressMonitor());
            copy.discardWorkingCopy();// 删除副本
        } catch (JavaModelException e) {
            ConsoleFactory.error(e);
        }
    }
}
