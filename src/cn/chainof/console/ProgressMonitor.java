package cn.chainof.console;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * 进度条
 * 
 * @since 2018年10月25日 下午3:29:37
 * @author 虞帮水
 *
 */
public class ProgressMonitor implements IProgressMonitor {

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#beginTask(java.lang.String, int)
     */
    @Override
    public void beginTask(String arg0, int arg1) {
        System.out.println("beginTask - " + arg0 + " - " + arg1);

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#done()
     */
    @Override
    public void done() {
        System.out.println("done - ");

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#internalWorked(double)
     */
    @Override
    public void internalWorked(double arg0) {
        System.out.println("internalWorked - " + arg0);

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#isCanceled()
     */
    @Override
    public boolean isCanceled() {
        System.out.println("isCanceled - ");
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#setCanceled(boolean)
     */
    @Override
    public void setCanceled(boolean arg0) {
        System.out.println("setCanceled - " + arg0);

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#setTaskName(java.lang.String)
     */
    @Override
    public void setTaskName(String arg0) {
        System.out.println("setTaskName - " + arg0);

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#subTask(java.lang.String)
     */
    @Override
    public void subTask(String arg0) {
        System.out.println("subTask - " + arg0);

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IProgressMonitor#worked(int)
     */
    @Override
    public void worked(int arg0) {
        System.out.println("worked - " + arg0);

    }

}
