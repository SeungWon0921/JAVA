package com.lec.java.inherit07;

public class BusinessPerson extends Person {

		private String company;
		
		public String getCompany() {
			return company;
		}
		 
		public void setCompany(String company) {
			this.company = company;
		}
		@Override
		protected void showInfo() {
			super.showInfo();
			System.out.println("회사: " + company);
		}
		
		public void showInfo(int id){
			System.out.println("id: " + id);
			System.out.println("이름: " + getName());
			System.out.println("회사: " + company);
		}
		
		@Override
		public String toString() {
			return "BusinessPerson:" + getName() + " " + getCompany();
		}
		
//		@Override
//		public void whoAreYou() {
//			
//		}
		 
}
