package com.company.service.dto.result;

import java.io.Serializable;
import java.math.BigInteger;

public class DeptInfoReport implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String dname;
		private String loc;
		private double maxSal;
		private double minSal;
		private double avgSal;
		private BigInteger counter;
		private double sumSal;
		public DeptInfoReport(String dname, String loc, double maxSal, double minSal, double avgSal,
				BigInteger counter, double sumSal) {
			super();
			this.dname = dname;
			this.loc = loc;
			this.maxSal = maxSal;
			this.minSal = minSal;
			this.avgSal = avgSal;
			this.sumSal = sumSal;
			this.counter = counter;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		public double getMaxSal() {
			return maxSal;
		}
		public void setMaxSal(double maxSal) {
			this.maxSal = maxSal;
		}
		public double getMinSal() {
			return minSal;
		}
		public void setMinSal(double minSal) {
			this.minSal = minSal;
		}
		public double getAvgSal() {
			return avgSal;
		}
		public void setAvgSal(double avgSal) {
			this.avgSal = avgSal;
		}
		public double getSumSal() {
			return sumSal;
		}
		public void setSumSal(double sumSal) {
			this.sumSal = sumSal;
		}
		public BigInteger getCounter() {
			return counter;
		}
		public void setCounter(BigInteger counter) {
			this.counter = counter;
		}
		@Override
		public String toString() {
			return "DeptInfoReport [dname=" + dname + ", loc=" + loc + ", maxSal=" + maxSal + ", minSal=" + minSal
					+ ", avgSal=" + avgSal + ", sumSal=" + sumSal + ", counter=" + counter + "]";
		}
		public DeptInfoReport() {
			// TODO Auto-generated constructor stub
		}
}
