package data;

public class Button {

	/*
	 *  \"fullLink\": false,\n" + 
\"key\": \"AMADEUS-EPOWER\",\n" + 
\"title\": \"Amadeus\",\n" + 
\"uri\": \"amadeusrentacar\"\n" + 
	 */
	public String key;
	public String title;
	public String uri;
	public Boolean fullLink;
	public String json_structure;
	
	
	public String getJson_structure() {
		return json_structure;
	}
	public void setJson_structure(String json_structure) {
		this.json_structure = json_structure;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Boolean getFullLink() {
		return fullLink;
	}
	public void setFullLink(Boolean fullLink) {
		this.fullLink = fullLink;
	}
	
	
}
