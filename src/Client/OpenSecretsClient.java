package Client;

public class OpenSecretsClient {

    String doc = "https://www.opensecrets.org/open-data/api-documentation";
    String apikey = "95616cf411e10bdf902c3681fe59fda5";

    // http://www.opensecrets.org/api/?method=candSummary&cid=N00007360&cycle=2018&apikey=__apikey__
    // cid:	(required) CRP CandidateID
    // cycle:	2012, 2014, 2016, 2018; leave blank for latest cycle
    // output:	(optional) Output format, either json, xml, or doc; default is xml
}
