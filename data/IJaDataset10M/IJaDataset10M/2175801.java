package ejb.objectmodel.sm;

import javax.ejb.*;

/**
 * Created Aug 17, 2004 3:15:09 PM
 * Code generated by the Sun ONE Studio EJB Builder
 * @author Administrator
 */
public abstract class SM_REQUEST_BUDGETBean implements javax.ejb.EntityBean {

    private javax.ejb.EntityContext context;

    /**
     * @see javax.ejb.EntityBean#setEntityContext(javax.ejb.EntityContext)
     */
    public void setEntityContext(javax.ejb.EntityContext aContext) {
        context = aContext;
    }

    /**
     * @see javax.ejb.EntityBean#ejbActivate()
     */
    public void ejbActivate() {
    }

    /**
     * @see javax.ejb.EntityBean#ejbPassivate()
     */
    public void ejbPassivate() {
    }

    /**
     * @see javax.ejb.EntityBean#ejbRemove()
     */
    public void ejbRemove() {
    }

    /**
     * @see javax.ejb.EntityBean#unsetEntityContext()
     */
    public void unsetEntityContext() {
        context = null;
    }

    /**
     * @see javax.ejb.EntityBean#ejbLoad()
     */
    public void ejbLoad() {
    }

    /**
     * @see javax.ejb.EntityBean#ejbStore()
     */
    public void ejbStore() {
    }

    public abstract java.lang.Integer getRequest_Id();

    public abstract void setRequest_Id(java.lang.Integer request_Id);

    public abstract java.lang.Integer getLibrary_Id();

    public abstract void setLibrary_Id(java.lang.Integer library_Id);

    public abstract java.lang.String getBudget_Head();

    public abstract void setBudget_Head(java.lang.String budget_Head);

    public abstract java.lang.String getStatus();

    public abstract void setStatus(java.lang.String status);

    public ejb.objectmodel.sm.SM_REQUEST_BUDGETKey ejbCreate(java.lang.Integer library_Id, java.lang.Integer request_Id, java.lang.String budget_Head, java.lang.String status) throws javax.ejb.CreateException {
        this.setLibrary_Id(library_Id);
        this.setRequest_Id(request_Id);
        this.setBudget_Head(budget_Head);
        this.setStatus(status);
        return null;
    }

    public void ejbPostCreate(java.lang.Integer library_Id, java.lang.Integer request_Id, java.lang.String budget_Head, java.lang.String status) throws javax.ejb.CreateException {
    }
}