package com.example;

import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 *  自动数据委托
 * 
 * @author 刘宏强
 *
 */
public class AutomatedDataDelegate implements JavaDelegate {

  // @Override
  // public void execute(DelegateExecution execution) throws Exception {
	public void execute(DelegateExecution execution) {
		// 显示设置过程变量。在这种情况下，变量autoWelcomeTime与当前时间。
		Date now = new Date();
	    execution.setVariable("autoWelcomeTime", now);
	    // 显示检索流程变量。
	    System.out.println("Faux call to backend for [" 
	    + execution.getVariable("fullName") + "]");
  }

}