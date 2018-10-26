package com.ams.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ams.bean.Request;

@Repository
@Transactional
public class AssetDaoImpl implements IAssetDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int storeRaisedRequest(Request req) {
		System.out.println("Adding ....");
		entityManager.persist(req);
		System.out.println("Added");
		System.out.println(req.getRequestId());
		return req.getRequestId();
	}

}
