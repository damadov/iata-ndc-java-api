package data;

public class SalesReport {

	public info info;
	public budget budget;
	
	public class items_comp{
		public info info;
		public budget budget;
		
		public class items_deps{
			public info info;
			public budget budget;
			
			public SalesReportItem[] items;

			public info getInfo() {
				return info;
			}

			public void setInfo(info info) {
				this.info = info;
			}

			public budget getBudget() {
				return budget;
			}

			public void setBudget(budget budget) {
				this.budget = budget;
			}

			public SalesReportItem[] getItems() {
				return items;
			}

			public void setItems(SalesReportItem[] items) {
				this.items = items;
			}
				
			
		}

		public info getInfo() {
			return info;
		}

		public void setInfo(info info) {
			this.info = info;
		}

		public budget getBudget() {
			return budget;
		}

		public void setBudget(budget budget) {
			this.budget = budget;
		}
		
		
	}

	public info getInfo() {
		return info;
	}

	public void setInfo(info info) {
		this.info = info;
	}

	public budget getBudget() {
		return budget;
	}

	public void setBudget(budget budget) {
		this.budget = budget;
	}
	
	
}
