package org.mahxwell.openlib.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.user.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Mahxwell
 * <h1>Login Action Class</h1>
 * <p>Contain All Struts2 Framework Login Actions</p>
 */
public class LoginAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(LoginAction.class);
    private String email, password;

    UserManager userManager = ContextLoader.INSTANCE.getUserManager();

    private Map<String, Object> session;
    private HttpServletRequest servletRequest;


    /**
     * doLogin
     * Enable login for a registered User
     *
     * @return SUCCESS -> If User get Logged
     * ERROR   -> If User get not Logged or User is do not exist in Database
     */
    public String doLogin() {

        String vResult = ActionSupport.INPUT;

        if (!StringUtils.isAllEmpty(email, password)) {
            User user = null;
            try {
                logger.info("email = " + email + "and password = " + password);
                user = userManager.getLoginUser(email, password);
            } catch (Exception e) {
                logger.error(e);
            }
            if (user == null) {
                vResult = ActionSupport.ERROR;
                logger.error("User is null");
            } else {
                this.session.put("user", user);
                vResult = ActionSupport.SUCCESS;
            }
        }
        return vResult;
    }

    /**
     * doLogout
     * Log Out a connected User
     *
     * @return SUCCESS in each cases
     */
    public String doLogout() {
        logger.info("Launch doLogout()");
        this.session.remove("user");
        logger.info("Disconnected");
        return ActionSupport.SUCCESS;
    }

    /*  GETTERS AND SETTERS */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }
}
