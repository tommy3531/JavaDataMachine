package TypeCreater;

public class SenatorBill {

    String id;
    String name;
    Long results;

    String congress;
    String billID;
    String billType;
    String billNumber;
    String billTitle;
    String billShortTitle;
    String cosponsoredDate;

    String sponsorTitle;
    String sponsorID;
    String sponsorName;
    String sponsorState;
    String sponsorParty;
    String congressDotGovURL;
    String govtrackURL;

    String committees;
    String primarySubject;
    String summary;
    String summaryShort;
    String latestMajorActionDate;
    String latestMajorAction;

    public SenatorBill() {}

    public SenatorBill(String id, String name, Long results, String congress, String billID, String billType, String billNumber, String billTitle, String billShortTitle, String cosponsoredDate, String sponsorTitle, String sponsorID, String sponsorName, String sponsorState, String sponsorParty, String congressDotGovURL, String govtrackURL, String committees, String primarySubject, String summary, String summaryShort, String latestMajorActionDate, String latestMajorAction) {
        this.id = id;
        this.name = name;
        this.results = results;
        this.congress = congress;
        this.billID = billID;
        this.billType = billType;
        this.billNumber = billNumber;
        this.billTitle = billTitle;
        this.billShortTitle = billShortTitle;
        this.cosponsoredDate = cosponsoredDate;
        this.sponsorTitle = sponsorTitle;
        this.sponsorID = sponsorID;
        this.sponsorName = sponsorName;
        this.sponsorState = sponsorState;
        this.sponsorParty = sponsorParty;
        this.congressDotGovURL = congressDotGovURL;
        this.govtrackURL = govtrackURL;
        this.committees = committees;
        this.primarySubject = primarySubject;
        this.summary = summary;
        this.summaryShort = summaryShort;
        this.latestMajorActionDate = latestMajorActionDate;
        this.latestMajorAction = latestMajorAction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getResults() {
        return results;
    }

    public void setResults(Long results) {
        this.results = results;
    }

    public String getCongress() {
        return congress;
    }

    public void setCongress(String congress) {
        this.congress = congress;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillTitle() {
        return billTitle;
    }

    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    public String getBillShortTitle() {
        return billShortTitle;
    }

    public void setBillShortTitle(String billShortTitle) {
        this.billShortTitle = billShortTitle;
    }

    public String getCosponsoredDate() {
        return cosponsoredDate;
    }

    public void setCosponsoredDate(String cosponsoredDate) {
        this.cosponsoredDate = cosponsoredDate;
    }

    public String getSponsorTitle() {
        return sponsorTitle;
    }

    public void setSponsorTitle(String sponsorTitle) {
        this.sponsorTitle = sponsorTitle;
    }

    public String getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(String sponsorID) {
        this.sponsorID = sponsorID;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getSponsorState() {
        return sponsorState;
    }

    public void setSponsorState(String sponsorState) {
        this.sponsorState = sponsorState;
    }

    public String getSponsorParty() {
        return sponsorParty;
    }

    public void setSponsorParty(String sponsorParty) {
        this.sponsorParty = sponsorParty;
    }

    public String getCongressDotGovURL() {
        return congressDotGovURL;
    }

    public void setCongressDotGovURL(String congressDotGovURL) {
        this.congressDotGovURL = congressDotGovURL;
    }

    public String getGovtrackURL() {
        return govtrackURL;
    }

    public void setGovtrackURL(String govtrackURL) {
        this.govtrackURL = govtrackURL;
    }

    public String getCommittees() {
        return committees;
    }

    public void setCommittees(String committees) {
        this.committees = committees;
    }

    public String getPrimarySubject() {
        return primarySubject;
    }

    public void setPrimarySubject(String primarySubject) {
        this.primarySubject = primarySubject;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummaryShort() {
        return summaryShort;
    }

    public void setSummaryShort(String summaryShort) {
        this.summaryShort = summaryShort;
    }

    public String getLatestMajorActionDate() {
        return latestMajorActionDate;
    }

    public void setLatestMajorActionDate(String latestMajorActionDate) {
        this.latestMajorActionDate = latestMajorActionDate;
    }

    public String getLatestMajorAction() {
        return latestMajorAction;
    }

    public void setLatestMajorAction(String latestMajorAction) {
        this.latestMajorAction = latestMajorAction;
    }
}
