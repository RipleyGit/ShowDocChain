package cn.chainof.thread;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;

/**
 * @since 2018��10��18�� ����7:22:32
 * @author �ݰ�ˮ
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
            copy.discardWorkingCopy();// ɾ������
        } catch (JavaModelException e) {
            // TODO Auto-generated catch block
        }
    }
}
