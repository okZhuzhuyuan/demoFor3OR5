package com.demo.app;

import com.demo.common.SystemUtil;
import com.demo.constant.SystemConstant;
/**
 * Application run at this place, have two function to present the two result.
 * @author zhuzhuyuan
 *
 */
public class Application {
	 
	
	public static void firstTest() {
		System.out.println(" firstTest ===========================");
		
		for(int i = 1 ; i<=100 ;i++) {
			if(SystemUtil.isDivisibleByNum(i, new int[]{3,5})) {
				System.out.println(SystemConstant.FLAG_THREE_OUTPUT+SystemConstant.FLAG_FIVE_OUTPUT);
			}else if(SystemUtil.isDivisibleByNum(i, new int[]{3})) {
				System.out.println(SystemConstant.FLAG_THREE_OUTPUT);
			}else if(SystemUtil.isDivisibleByNum(i, new int[]{5})) {
				System.out.println(SystemConstant.FLAG_FIVE_OUTPUT);
			}else {
				System.out.println(i);
			}
		}
		System.out.println(" firstTest ===========================");
	}
	public static void secondTest() {
		System.out.println(" secondTest ===========================");
		for(int i = 1 ; i<=100 ;i++) {
			boolean aboutThreeFlag = SystemUtil.isDivisibleByNum(i, new int[]{3})||SystemUtil.isHaveANum(i, new int[]{3});
			boolean aboutFiveFlag = SystemUtil.isDivisibleByNum(i, new int[]{5})||SystemUtil.isHaveANum(i, new int[]{5});
			if((aboutThreeFlag)&&(aboutFiveFlag)) {
				System.out.println(SystemConstant.FLAG_THREE_OUTPUT+SystemConstant.FLAG_FIVE_OUTPUT);
			}else if(aboutThreeFlag) {
				System.out.println(SystemConstant.FLAG_THREE_OUTPUT);
			}else if(aboutFiveFlag) {
				System.out.println(SystemConstant.FLAG_FIVE_OUTPUT);
			} else {
				System.out.println(i);
			}
		}
		System.out.println(" secondTest ===========================");
	}

}
