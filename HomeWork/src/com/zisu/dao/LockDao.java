package com.zisu.dao;

import java.util.List;
import com.zisu.bean.Lock;


public interface LockDao {
	
	//新增一条记录
	//public int addLock(Lock lock);
	
	//删除一条记录
	//public int delLockById(int id);
		
	//修改
	//public int updateLock(Lock lock);
	
	//查询key和lock的信息

	//public Map<String,Object> getPersonByIdReturnMap(int id);
	//查询lock时候把所有的key找出来
	public Lock getAllLockKeyReturnListById(int id);
	//考虑到可能有多条记录返回，将返回值设置为list
	public List<Lock> queryLockByLikeLockName(String name);
	//根据lockid删除锁及相应的keys记录
	public Integer delLockByLockId(int lockid);
	public List<Integer> getLockKeysIdByLockId(int lockid);
	
		
}
