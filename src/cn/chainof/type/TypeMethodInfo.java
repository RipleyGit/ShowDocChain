package cn.chainof.type;

import org.eclipse.jdt.core.IMethod;

/**
 * @since 2018年10月25日 下午4:52:20
 * @author 虞帮水
 *
 */
public class TypeMethodInfo {
    private IMethod method;
    private String methodName;
    private TypeInfo type;

    public IMethod getMethod() {
        return method;
    }

    public void setMethod(IMethod method) {
        this.method = method;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

}
