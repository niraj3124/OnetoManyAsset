package com.ams.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asset")
public class Asset {

		@Id
		@GeneratedValue
		@Column(name="AssetId")
		private int assetId;
		@Column(name="AssetName")
		private String assetName;
		@Column(name="AssetDes")
		private String assetDescription;
		@Column(name="Quantity")
		private int assetQuantity;
		@Column(name="Status")
		private String assetStatus;
		
		@OneToMany(mappedBy="asset")
		private Set<AssetAllocation> assets;

		public int getAssetId() {
			return assetId;
		}

		public void setAssetId(int assetId) {
			this.assetId = assetId;
		}

		public String getAssetName() {
			return assetName;
		}

		public void setAssetName(String assetName) {
			this.assetName = assetName;
		}

		public String getAssetDescription() {
			return assetDescription;
		}

		public void setAssetDescription(String assetDescription) {
			this.assetDescription = assetDescription;
		}

		public int getAssetQuantity() {
			return assetQuantity;
		}

		public void setAssetQuantity(int assetQuantity) {
			this.assetQuantity = assetQuantity;
		}

		public String getAssetStatus() {
			return assetStatus;
		}

		public void setAssetStatus(String assetStatus) {
			this.assetStatus = assetStatus;
		}

		public Set<AssetAllocation> getAssets() {
			return assets;
		}

		public void setAssets(Set<AssetAllocation> assets) {
			this.assets = assets;
		}

		public Asset(int assetId, String assetName, String assetDescription,
				int assetQuantity, String assetStatus,
				Set<AssetAllocation> assets) {
			super();
			this.assetId = assetId;
			this.assetName = assetName;
			this.assetDescription = assetDescription;
			this.assetQuantity = assetQuantity;
			this.assetStatus = assetStatus;
			this.assets = assets;
		}

		public Asset(String assetName, String assetDescription,
				int assetQuantity, String assetStatus,
				Set<AssetAllocation> assets) {
			super();
			this.assetName = assetName;
			this.assetDescription = assetDescription;
			this.assetQuantity = assetQuantity;
			this.assetStatus = assetStatus;
			this.assets = assets;
		}
		
		public Asset() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Asset [assetId=" + assetId + ", assetName=" + assetName
					+ ", assetDescription=" + assetDescription
					+ ", assetQuantity=" + assetQuantity + ", assetStatus="
					+ assetStatus + ", assets=" + assets + "]";
		}
		
		
		
		
}
