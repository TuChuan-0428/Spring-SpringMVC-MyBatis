package com.zisu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zisu.bean.Lock;
import com.zisu.dao.LockDao;

@Transactional
@Service
public class LockService {
	@Autowired
	public LockDao lockDao;

	public List<Lock> queryLockByLikeLockName(String lockname) {
		// TODO Auto-generated method stub
		System.out.print("lockname:  "+lockname);
		List<Lock> locklist = lockDao.queryLockByLikeLockName(lockname);
		System.out.print("locklist:  "+locklist.toString());
		return locklist;
	}

	public Lock getAllLockKeyReturnListById(int lockid) {
		// TODO Auto-generated method stub
		System.out.print("lockid:  "+lockid);
		Lock lock = lockDao.getAllLockKeyReturnListById(lockid);
		System.out.print("lock:  "+lock.toString());
		return lock;
	}
	public Integer delLockandKeysByLockId(int lockid)
	{
		System.out.print("lock will be deleted:  "+lockid);
		return 0;//lockDao.delLockandKeysByLockId(lockid);
	}
}
