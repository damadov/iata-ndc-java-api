package data;

public class Customer {

		public String firstname;
		public String lastname;
		public String title;
		public String company_title;
		public String customer_type;
		public String passport_no;
		public String passport_expire;
		public String passport_issue;
		public String birthdate;
		public String email;
		public String telephone;
		public String cust_guid;
		public String passenger_type;
		public String taxid;
		public PassengerFare[] fares;
		public Ticket ticket;
		public String index;
		public String company_code;
		public String company;
		public TravelPolicy policy;
		public String cust_level="ECONOMY";
		public int status_id=1;
		public String national_id;

		public String department;
		
		
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}

		public String getNational_id() {
			return national_id;
		}
		public void setNational_id(String national_id) {
			this.national_id = national_id;
		}
		public int getStatus_id() {
			return status_id;
		}
		public void setStatus_id(int status_id) {
			this.status_id = status_id;
		}
		public String getCust_level() {
			return cust_level;
		}
		public void setCust_level(String cust_level) {
			this.cust_level = cust_level;
		}
		public TravelPolicy getPolicy() {
			return policy;
		}
		public void setPolicy(TravelPolicy policy) {
			this.policy = policy;
		}
		public String getCompany_code() {
			return company_code;
		}
		public void setCompany_code(String company_code) {
			this.company_code = company_code;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getIndex() {
			return index;
		}
		public void setIndex(String index) {
			this.index = index;
		}
		public PassengerFare[] getFares() {
			return fares;
		}
		public void setFares(PassengerFare[] fares) {
			this.fares = fares;
		}
		public Ticket getTicket() {
			return ticket;
		}
		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		public String getTaxid() {
			return taxid;
		}
		public void setTaxid(String taxid) {
			this.taxid = taxid;
		}
		public String getPassenger_type() {
			return passenger_type;
		}
		public void setPassenger_type(String passenger_type) {
			this.passenger_type = passenger_type;
		}
		public String getCust_guid() {
			return cust_guid;
		}
		public void setCust_guid(String cust_guid) {
			this.cust_guid = cust_guid;
		}
		public String getPassport_expire() {
			return passport_expire;
		}
		public void setPassport_expire(String passport_expire) {
			this.passport_expire = passport_expire;
		}
		public String getPassport_issue() {
			return passport_issue;
		}
		public void setPassport_issue(String passport_issue) {
			this.passport_issue = passport_issue;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getBirthdate() {
			return birthdate;
		}
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCompany_title() {
			return company_title;
		}
		public void setCompany_title(String company_title) {
			this.company_title = company_title;
		}
		public String getCustomer_type() {
			return customer_type;
		}
		public void setCustomer_type(String customer_type) {
			this.customer_type = customer_type;
		}
		public String getPassport_no() {
			return passport_no;
		}
		public void setPassport_no(String passport_no) {
			this.passport_no = passport_no;
		}

		
		
}
