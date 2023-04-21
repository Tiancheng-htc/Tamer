package org.jcvi.tasker.db;

import org.hibernate.Session;
import org.jcvi.common.core.assembly.Contig;
import org.jcvi.glk.helpers.GLKHelper;
import org.jcvi.glk.helpers.HibernateGLKHelper;
import org.jcvi.tasker.AbstractContigSource;
import org.jcvi.tasker.AutoTasker;

/**
 *
 * @author jsitz@jcvi.org
 */
public abstract class DatabaseContigSource extends AbstractContigSource {

    /** The Hibernate {@link Session} to read {@link Contig} data from. */
    private final Session session;

    /** The {@link GLKHelper} used to extract {@link Contig} data. */
    private final GLKHelper helper;

    /**
     * Constructs a new <code>DatabaseContigSource</code>.
     *
     * @param session The Hibernate {@link Session} to read {@link Contig} data from.
     */
    public DatabaseContigSource(Session session) {
        super();
        this.session = session;
        this.helper = new HibernateGLKHelper(this.session);
    }

    /**
     * Fetch the Hibernate {@link Session} attached to this source.  This <code>Session</code>
     * was automatically generated by {@link AutoTasker} based on system properties.
     *
     * @return An open Hibernate {@link Session}.
     */
    protected Session getSession() {
        return this.session;
    }

    /**
     * Fetches the {@link GLKHelper} provided by this class.  This is done for internal
     * abstraction and as a facility to subclasses.  It can be safely assumed that this
     * <code>GLKHelper</code> is based off the same {@link Session} provided by
     * {@link #getSession()}.
     *
     * @return
     */
    protected GLKHelper getHelper() {
        return this.helper;
    }
}