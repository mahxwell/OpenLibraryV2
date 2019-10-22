package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.consumer.contract.DaoFactory;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Asbract Manager Implementation Class</h2>
 * <p>Contain Getter and Setter for Dao Factory</p>
 */
public abstract class AbstractManagerImpl {
    private DaoFactory daoFactory;

    /**
     * Getter Dao Factory
     *
     * @return
     */
    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    /**
     * Setter Dao Factory
     *
     * @param daoFactory current Dao Factory
     */
    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
}
