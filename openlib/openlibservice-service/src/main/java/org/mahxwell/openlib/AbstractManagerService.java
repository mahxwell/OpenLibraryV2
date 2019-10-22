package org.mahxwell.openlib;

import org.mahxwell.openlib.business.contract.ManagerFactory;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Asbract Manager Service Class</h2>
 * <p>Contain Getter and Setter for Manager Factory</p>
 */
public abstract class AbstractManagerService {

    private ManagerFactory managerFactory;

    /**
     * Getter Dao Factory
     *
     * @return
     */
    public ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    /**
     * Setter ManagerFactory
     *
     * @param managerFactory current Manager Factory
     */
    public void setManagerFactory(ManagerFactory managerFactory) {
        this.managerFactory = managerFactory;
    }

}
