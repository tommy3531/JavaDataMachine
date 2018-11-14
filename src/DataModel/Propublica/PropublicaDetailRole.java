package DataModel.Propublica;

import java.util.ArrayList;

public class PropublicaDetailRole {

    String congress;
    String chamber;
    String title;
    String short_title;
    String state;
    String party;
    String leadership_role;
    String fec_candidate_id;
    String seniority;
    String district;
    String at_large;
    String ocd_id;
    String start_date;
    String end_date;
    String office;
    String phone;
    String fax;
    String contact_form;
    String bills_sponsored;
    String bills_cosponsored;
    String missed_votes_pct;
    String votes_with_party_pct;
    ArrayList<PropublicaDetailCommittee> committees;
    ArrayList<PropublicaDetailSubCommittee> subCommittees;

    public String getCongress() {
        return congress;
    }

    public void setCongress(String congress) {
        this.congress = congress;
    }

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShort_title() {
        return short_title;
    }

    public void setShort_title(String short_title) {
        this.short_title = short_title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getLeadership_role() {
        return leadership_role;
    }

    public void setLeadership_role(String leadership_role) {
        this.leadership_role = leadership_role;
    }

    public String getFec_candidate_id() {
        return fec_candidate_id;
    }

    public void setFec_candidate_id(String fec_candidate_id) {
        this.fec_candidate_id = fec_candidate_id;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAt_large() {
        return at_large;
    }

    public void setAt_large(String at_large) {
        this.at_large = at_large;
    }

    public String getOcd_id() {
        return ocd_id;
    }

    public void setOcd_id(String ocd_id) {
        this.ocd_id = ocd_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContact_form() {
        return contact_form;
    }

    public void setContact_form(String contact_form) {
        this.contact_form = contact_form;
    }

    public String getBills_sponsored() {
        return bills_sponsored;
    }

    public void setBills_sponsored(String bills_sponsored) {
        this.bills_sponsored = bills_sponsored;
    }

    public String getBills_cosponsored() {
        return bills_cosponsored;
    }

    public void setBills_cosponsored(String bills_cosponsored) {
        this.bills_cosponsored = bills_cosponsored;
    }

    public String getMissed_votes_pct() {
        return missed_votes_pct;
    }

    public void setMissed_votes_pct(String missed_votes_pct) {
        this.missed_votes_pct = missed_votes_pct;
    }

    public String getVotes_with_party_pct() {
        return votes_with_party_pct;
    }

    public void setVotes_with_party_pct(String votes_with_party_pct) {
        this.votes_with_party_pct = votes_with_party_pct;
    }

    public ArrayList<PropublicaDetailCommittee> getCommittees() {
        return committees;
    }

    public void setCommittees(ArrayList<PropublicaDetailCommittee> committees) {
        this.committees = committees;
    }

}
