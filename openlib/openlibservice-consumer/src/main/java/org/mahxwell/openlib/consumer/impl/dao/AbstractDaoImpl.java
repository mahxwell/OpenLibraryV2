package org.mahxwell.openlib.consumer.impl.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;


/**
 * @author Mahxwell
 * <h1>Asbract Dao Implementation Class</h1>
 * <p>Contain Getter and Setter for Data Source</p>
 */
public abstract class AbstractDaoImpl {
    // Warning maybe remove @inject and @Named -> just for test -> have to test for rea deploy
    /**
     * Data Source Getter Method
     *
     * @return Get Data Source
     */
    @Inject
    @Named("dataSourceOpenLib")
    private DataSource dataSource;

    DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Data Source Setter Method
     *
     * @param dataSource
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
