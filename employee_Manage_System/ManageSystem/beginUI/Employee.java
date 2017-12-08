package beginUI;

public class Employee 
{
		private int eNumber;    //员工id号
		private String eName;//员工姓名
		private String eIDcard;//员工身份证号
		private String eTel;//电话
		private String ePart;//部门
		private String eJob;//工作
		private String eMail;//邮箱
		public int geteNumber() {
			return eNumber;
		}
		public void seteNumber(int eNumber) {
			this.eNumber = eNumber;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String geteIDcard() {
			return eIDcard;
		}
		public void seteIDcard(String eIDcard) {
			this.eIDcard = eIDcard;
		}
		public String geteTel() {
			return eTel;
		}
		public void seteTel(String eTel) {
			this.eTel = eTel;
		}
		public String getePart() {
			return ePart;
		}
		public void setePart(String ePart) {
			this.ePart = ePart;
		}
		public String geteJob() {
			return eJob;
		}
		public void seteJob(String eJob) {
			this.eJob = eJob;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}	
}
