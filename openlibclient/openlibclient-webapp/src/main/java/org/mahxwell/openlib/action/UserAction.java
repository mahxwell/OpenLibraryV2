package org.mahxwell.openlib.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.BookloaningManager;
import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.user.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author Mahxwell
 * <h1>User Action Class</h1>
 * <p>Contain All Struts2 Framework User Actions</p>
 */
public class UserAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(UserAction.class);
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    UserManager userManager = ContextLoader.INSTANCE.getUserManager();
    BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();

    private User user;
    private List<User> users;
    private Bookloaning bookloaning;

    public String doListUser() {
        try {
            users = userManager.Users();
            return ActionSupport.SUCCESS;
        } catch (Exception e) {
            logger.error("Error in doListUser Method");
            return ActionSupport.ERROR;
        }
    }

    /**
     * doCreateUser
     * Create a New User and add it to DataBase
     *
     * @return SUCCES -> If New User is created
     * ERROR  -> If New User is not created (errors Occurred in process)
     */
    public String doCreateUser() {
        logger.info("Launch doCreateUser()");
        String vResult = ActionSupport.INPUT;
        User userCheck = (User) this.session.get("user");

        if (userCheck != null) {
            return ActionSupport.ERROR;
        }
        if (this.user != null) {
            try {
                userManager.addUser(user);
                logger.info("User: " + user.getUserPseudo() + " created");
                vResult = ActionSupport.SUCCESS;
            } catch (Exception e) {
                return ActionSupport.ERROR;
            }
        }
        return vResult;
    }

    /**
     * doUpdateUser
     * Update selected User in DataBase
     *
     * @return SUCCES -> If User is updated
     * ERROR  -> If User is not updated (and errors Occurred in process)
     */
    public String doUpdateUser() {
        logger.info("doUpdateUser()");
        String vResult = ActionSupport.INPUT;

        User userToFind = (User) this.session.get("user");
        if (this.user != null) {
            try {
                userManager.updateUser(user, userToFind);
                logger.info("User: " + userToFind.getUserPseudo() + " updated");
                this.session.remove("user");
                vResult = ActionSupport.SUCCESS;

            } catch (Exception e) {
                return ActionSupport.ERROR;
            }
        }
        return vResult;
    }


    /**
     * doDeleteUser
     * Delete User
     *
     * @return SUCCES in any cases
     */
    public String doDeleteUser() {
        logger.info("Launch doDeleteUser()");
        User userToDelete = (User) this.session.get("user");
        userManager.deleteUser(userToDelete);
        logger.info("User: " + userToDelete.getUserName() + " deleted");
        return ActionSupport.SUCCESS;
    }

    /**
     * dogetUser
     * Get current User
     *
     * @return SUCCESS -> If User is connected
     * ERROR -> If User is not connected
     */
    public String doGetUser() {
        logger.info("Launch doGetUser()");
        user = (User) this.session.get("user");
        if (user == null)
            return ActionSupport.ERROR;
        else
            return ActionSupport.SUCCESS;
    }

    /**
     * doGetLoanByUser
     * Get Loaning by User
     *
     * @return SUCCESS -> If Loan exist
     * ERROR -> If Loan do not exist
     */
    public String doGetLoanByUser() {
        logger.info("Launch doGetLoanByUser()");

        user = (User) this.session.get("user");
        if (user == null)
            return ActionSupport.ERROR;
        else {
            try {
                bookloaning = bookloaningManager.bookloaningsByUser(user.getUserId()).get(0);
                logger.info(bookloaning.getBookLoaningId());
            } catch (Exception e) {
                logger.error(e);
            }
            return ActionSupport.SUCCESS;
        }
    }


    /* GETTERS AND SETTERS */

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    public Bookloaning getBookloaning() {
        return bookloaning;
    }

    public void setBookloaning(Bookloaning bookloaning) {
        this.bookloaning = bookloaning;
    }
}
