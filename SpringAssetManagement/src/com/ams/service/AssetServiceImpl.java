package com.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.bean.Request;
import com.ams.dao.IAssetDao;
@Service
public class AssetServiceImpl implements IAssetService{
	
	@Autowired
	private IAssetDao assetdao;

	@Override
	public int storeRaisedRequest(Request req) {
		return assetdao.storeRaisedRequest(req);
		
	}

}
