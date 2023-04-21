package ejb.objectmodel.administration;

import javax.ejb.*;

/**
 * Created Oct 26, 2004 6:10:13 PM
 * Code generated by the Sun ONE Studio EJB Builder
 * @author administrator
 */
public abstract class CIR_ODNBean implements javax.ejb.EntityBean {

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

    public abstract java.lang.Integer getTa_Id();

    public abstract void setTa_Id(java.lang.Integer ta_Id);

    public abstract java.lang.Integer getLibrary_Id();

    public abstract void setLibrary_Id(java.lang.Integer library_Id);

    public abstract java.lang.Integer getOdn_Id();

    public abstract void setOdn_Id(java.lang.Integer odn_Id);

    public abstract java.lang.String getForm_Letter_No();

    public abstract void setForm_Letter_No(java.lang.String form_Letter_No);

    public abstract java.lang.String getContent();

    public abstract void setContent(java.lang.String content);

    public abstract java.lang.String getTitle();

    public abstract void setTitle(java.lang.String title);

    public abstract java.lang.String getEntry_Id();

    public abstract void setEntry_Id(java.lang.String entry_Id);

    public abstract java.lang.Integer getEntry_Library_Id();

    public abstract void setEntry_Library_Id(java.lang.Integer entry_Library_Id);

    public abstract java.sql.Timestamp getEntry_Date();

    public abstract void setEntry_Date(java.sql.Timestamp entry_Date);

    public ejb.objectmodel.administration.CIR_ODNKey ejbCreate(java.lang.Integer ta_Id, java.lang.Integer library_Id, java.lang.Integer odn_Id, java.lang.String form_Letter_No, java.lang.String content, java.lang.String title, java.lang.String entry_Id, java.lang.Integer entry_Library_Id, java.sql.Timestamp entry_Date) throws javax.ejb.CreateException {
        this.setTa_Id(ta_Id);
        this.setLibrary_Id(library_Id);
        this.setOdn_Id(odn_Id);
        this.setForm_Letter_No(form_Letter_No);
        this.setContent(content);
        this.setTitle(title);
        this.setEntry_Id(entry_Id);
        this.setEntry_Library_Id(entry_Library_Id);
        this.setEntry_Date(entry_Date);
        return null;
    }

    public void ejbPostCreate(java.lang.Integer ta_Id, java.lang.Integer library_Id, java.lang.Integer odn_Id, java.lang.String form_Letter_No, java.lang.String content, java.lang.String title, java.lang.String entry_Id, java.lang.Integer entry_Library_Id, java.sql.Timestamp entry_Date) throws javax.ejb.CreateException {
    }
}