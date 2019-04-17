package com.demo.common;

/**
 * common utils function for common use.
 * @author zhuzhuyuan
 *
 */
public class SystemUtil {
	/**
	 * num is divisible by the number in a AimNum, 0 can not be in AimNum
	 * @param num
	 * @param AimNum
	 * @return
	 */
	public static Boolean isDivisibleByNum(int num, int[] AimNum) {
		if(AimNum ==null || AimNum.length==0) {
			System.out.println("illegal number array! please check!");
		}
		Boolean flag = true;
		for(int i = 0 ; i< AimNum.length ; i++) {
			if(AimNum[i] ==0 ) {
				System.out.println("illegal number! please check!");
			}
			int result = num % AimNum[i];
			if(result != 0) {
				flag = false; 
			} 
		}
		return flag;
	}
	/**
	 * judge numbers in AimNum would be all is a part of num
	 * 3,5 is a part of 35 ,53 and so on.
	 * @param num
	 * @param AimNum
	 * @return
	 */
	public static Boolean isHaveANum(int num, int[] AimNum) {
		if(AimNum ==null || AimNum.length==0) {
			System.out.println("illegal number array! please check!");
		}
		Boolean flag = true;
		String numStr = String.valueOf(num);
		for(int i = 0 ; i< AimNum.length ; i++) {
			if(!numStr.contains(String.valueOf(AimNum[i]))) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
