package DataModel.PropublicaBill;

public class PropublicaBillDetail {

    String congress;
    String billID;
    String billType;
    String number;
    String billURI;
    String title;
    String shortTitle;
    String cosponsoredDate;

    String sponsorTitle;
    String sponsorID;
    String sponsorName;
    String sponsorState;
    String sponsorParty;
    String sponsorURI;
    String gpoPDF;
    String congressDotGovURL;
    String govTrackURL;
    String introducedDate;
    String active;
    String lastVote;
    String housePassage;
    String senatePassage;
    String enacted;
    String vetoed;
    String cosponsors;
    String cosponsorsByParty;
    String committees;
    String primarySubject;
    String summary;
    String summaryShort;
    String LatestMajorActionDate;
    String latestMajorAction;

    public PropublicaBillDetail(String congress, String billID, String billType, String number, String billURI, String title, String shortTitle, String cosponsoredDate, String sponsorTitle, String sponsorID, String sponsorName, String sponsorState, String sponsorParty, String sponsorURI, String gpoPDF, String congressDotGovURL, String govTrackURL, String introducedDate, String active, String lastVote, String housePassage, String senatePassage, String enacted, String vetoed, String cosponsors, String cosponsorsByParty, String committees, String primarySubject, String summary, String summaryShort, String latestMajorActionDate, String latestMajorAction) {
        this.congress = congress;
        this.billID = billID;
        this.billType = billType;
        this.number = number;
        this.billURI = billURI;
        this.title = title;
        this.shortTitle = shortTitle;
        this.cosponsoredDate = cosponsoredDate;
        this.sponsorTitle = sponsorTitle;
        this.sponsorID = sponsorID;
        this.sponsorName = sponsorName;
        this.sponsorState = sponsorState;
        this.sponsorParty = sponsorParty;
        this.sponsorURI = sponsorURI;
        this.gpoPDF = gpoPDF;
        this.congressDotGovURL = congressDotGovURL;
        this.govTrackURL = govTrackURL;
        this.introducedDate = introducedDate;
        this.active = active;
        this.lastVote = lastVote;
        this.housePassage = housePassage;
        this.senatePassage = senatePassage;
        this.enacted = enacted;
        this.vetoed = vetoed;
        this.cosponsors = cosponsors;
        this.cosponsorsByParty = cosponsorsByParty;
        this.committees = committees;
        this.primarySubject = primarySubject;
        this.summary = summary;
        this.summaryShort = summaryShort;
        LatestMajorActionDate = latestMajorActionDate;
        this.latestMajorAction = latestMajorAction;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBillURI() {
        return billURI;
    }

    public void setBillURI(String billURI) {
        this.billURI = billURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
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

    public String getSponsorURI() {
        return sponsorURI;
    }

    public void setSponsorURI(String sponsorURI) {
        this.sponsorURI = sponsorURI;
    }

    public String getGpoPDF() {
        return gpoPDF;
    }

    public void setGpoPDF(String gpoPDF) {
        this.gpoPDF = gpoPDF;
    }

    public String getCongressDotGovURL() {
        return congressDotGovURL;
    }

    public void setCongressDotGovURL(String congressDotGovURL) {
        this.congressDotGovURL = congressDotGovURL;
    }

    public String getGovTrackURL() {
        return govTrackURL;
    }

    public void setGovTrackURL(String govTrackURL) {
        this.govTrackURL = govTrackURL;
    }

    public String getIntroducedDate() {
        return introducedDate;
    }

    public void setIntroducedDate(String introducedDate) {
        this.introducedDate = introducedDate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLastVote() {
        return lastVote;
    }

    public void setLastVote(String lastVote) {
        this.lastVote = lastVote;
    }

    public String getHousePassage() {
        return housePassage;
    }

    public void setHousePassage(String housePassage) {
        this.housePassage = housePassage;
    }

    public String getSenatePassage() {
        return senatePassage;
    }

    public void setSenatePassage(String senatePassage) {
        this.senatePassage = senatePassage;
    }

    public String getEnacted() {
        return enacted;
    }

    public void setEnacted(String enacted) {
        this.enacted = enacted;
    }

    public String getVetoed() {
        return vetoed;
    }

    public void setVetoed(String vetoed) {
        this.vetoed = vetoed;
    }

    public String getCosponsors() {
        return cosponsors;
    }

    public void setCosponsors(String cosponsors) {
        this.cosponsors = cosponsors;
    }

    public String getCosponsorsByParty() {
        return cosponsorsByParty;
    }

    public void setCosponsorsByParty(String cosponsorsByParty) {
        this.cosponsorsByParty = cosponsorsByParty;
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
        return LatestMajorActionDate;
    }

    public void setLatestMajorActionDate(String latestMajorActionDate) {
        LatestMajorActionDate = latestMajorActionDate;
    }

    public String getLatestMajorAction() {
        return latestMajorAction;
    }

    public void setLatestMajorAction(String latestMajorAction) {
        this.latestMajorAction = latestMajorAction;
    }
}
