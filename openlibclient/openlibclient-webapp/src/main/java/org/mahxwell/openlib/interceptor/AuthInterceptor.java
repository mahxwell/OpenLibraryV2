package org.mahxwell.openlib.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Mahxwell
 * <h1>Interceptor Authentification Class</h1>
 */
public class AuthInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation pInvocation) throws Exception {
        String vResult;

        if (pInvocation.getInvocationContext().getSession().get("user") != null) {
            vResult = pInvocation.invoke();
        } else {
            vResult = "error-forbidden";
        }
        return vResult;
    }
}