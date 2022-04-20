package com.zisu.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;


import com.zisu.bean.Lock;

import com.zisu.service.LockService;

@Controller
public class SSM_IOCTestController {
	@Autowired    
    LockService lockService;

	@GetMapping(value="/queryKeysByLikeLockName")
    public ModelAndView queryKeysByLikeLockName(String lockname){	
    	System.out.println("queryLockByLikeLockName...");
    	ModelAndView mv = new ModelAndView();
    	List<Lock> locklist = lockService.queryLockByLikeLockName(lockname);
		mv.addObject("msg", locklist.toString());
		mv.setViewName("success");
		return mv;
	}
    @GetMapping(value="/queryKeysByLockId")
    public ModelAndView queryKeysByLockId(int lockid){	
    	System.out.println("queryLockByLikeLockName...");
    	ModelAndView mv = new ModelAndView();
    	Lock lock = lockService.getAllLockKeyReturnListById(lockid);
    	System.out.println(lock);
    	mv.addObject("msg", lock.toString());
		mv.setViewName("success");
		return mv;    	
	}

}

