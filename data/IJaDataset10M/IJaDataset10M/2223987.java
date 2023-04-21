package org.eledge.domain.auto;

import java.util.List;
import org.eledge.domain.DynamicWebPage;
import org.eledge.domain.EledgeDataObject;
import org.eledge.domain.TemplateVariable;
import org.eledge.domain.participants.GenericParticipant;

/**
 * Class _WebPageParagraph was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebPageParagraph extends EledgeDataObject {

    public static final String HTMLTEXT_PROPERTY = "HTMLText";

    public static final String HEADING_PROPERTY = "heading";

    public static final String SECTION_PROPERTY = "section";

    public static final String PAGE_PROPERTY = "page";

    public static final String PARTICIPANT_LIST_PROPERTY = "participantList";

    public static final String TEMPLATE_VARIABLES_PROPERTY = "templateVariables";

    public static final String OBJID_PK_COLUMN = "objid";

    public void setHTMLText(String HTMLText) {
        writeProperty("HTMLText", HTMLText);
    }

    public String getHTMLText() {
        return (String) readProperty("HTMLText");
    }

    public void setHeading(String heading) {
        writeProperty("heading", heading);
    }

    public String getHeading() {
        return (String) readProperty("heading");
    }

    public void setSection(Integer section) {
        writeProperty("section", section);
    }

    public Integer getSection() {
        return (Integer) readProperty("section");
    }

    public void setPage(DynamicWebPage page) {
        setToOneTarget("page", page, true);
    }

    public DynamicWebPage getPage() {
        return (DynamicWebPage) readProperty("page");
    }

    public void addToParticipantList(GenericParticipant obj) {
        addToManyTarget("participantList", obj, true);
    }

    public void removeFromParticipantList(GenericParticipant obj) {
        removeToManyTarget("participantList", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<GenericParticipant> getParticipantList() {
        return (List<GenericParticipant>) readProperty("participantList");
    }

    public void addToTemplateVariables(TemplateVariable obj) {
        addToManyTarget("templateVariables", obj, true);
    }

    public void removeFromTemplateVariables(TemplateVariable obj) {
        removeToManyTarget("templateVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<TemplateVariable> getTemplateVariables() {
        return (List<TemplateVariable>) readProperty("templateVariables");
    }
}