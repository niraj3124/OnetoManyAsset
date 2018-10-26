package com.ams.bean;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="assetallocation")
public class AssetAllocation {

		@Id
		@GeneratedValue
		@Column(name="AllocationId")
		private int allocationId;
		@Column(name="Allocation_date")
		private Date allocationDate;
		@Column(name="Release_date")
		private Date releaseDate;

		@ManyToOne
		@JoinColumn(name="AssetId")
		private Asset asset;
		
		@ManyToOne
		@JoinColumn(name="Empno")
		private Employee employee;

		public int getAllocationId() {
			return allocationId;
		}

		public void setAllocationId(int allocationId) {
			this.allocationId = allocationId;
		}

		public Date getAllocationDate() {
			return allocationDate;
		}

		public void setAllocationDate(Date allocationDate) {
			this.allocationDate = allocationDate;
		}

		public Date getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}

		public Asset getAsset() {
			return asset;
		}

		public void setAsset(Asset asset) {
			this.asset = asset;
		}

		public Employee getAssetEmployee() {
			return employee;
		}

		public void setAssetEmployee(Employee employee) {
			this.employee = employee;
		}

		public AssetAllocation(int allocationId, Date allocationDate,
				Date releaseDate, Asset asset, Employee employee) {
			super();
			this.allocationId = allocationId;
			this.allocationDate = allocationDate;
			this.releaseDate = releaseDate;
			this.asset = asset;
			this.employee = employee;
		}

		public AssetAllocation(Date allocationDate, Date releaseDate,
				Asset asset, Employee employee) {
			super();
			this.allocationDate = allocationDate;
			this.releaseDate = releaseDate;
			this.asset = asset;
			this.employee = employee;
		}
		
		public AssetAllocation() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "AssetAllocation [allocationId=" + allocationId
					+ ", allocationDate=" + allocationDate + ", releaseDate="
					+ releaseDate + ", asset=" + asset + ", assetEmployee="
					+ employee + "]";
		}
		
		
		
		

		
		
}
