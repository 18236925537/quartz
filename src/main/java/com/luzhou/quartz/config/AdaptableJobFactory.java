package com.luzhou.quartz.config;

/**
 * 在本工程中没有用到，先注释掉
 * 将Quartz作业注入Spring容器 1
 */
public class AdaptableJobFactory/* implements JobFactory*/ {
/*

	@Override
	public Job newJob(TriggerFiredBundle bundle, Scheduler arg1) throws SchedulerException {
		 return newJob(bundle);
	}

	 public Job newJob(TriggerFiredBundle bundle) throws SchedulerException {
	        try {
	            Object jobObject = createJobInstance(bundle);
	            return adaptJob(jobObject);
	        }
	        catch (Exception ex) {
	            throw new SchedulerException("Job instantiation failed", ex);
	        }
	    }

	    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
	        Method getJobDetail = bundle.getClass().getMethod("getJobDetail");
	        Object jobDetail = ReflectionUtils.invokeMethod(getJobDetail, bundle);
	        Method getJobClass = jobDetail.getClass().getMethod("getJobClass");
	        Class jobClass = (Class) ReflectionUtils.invokeMethod(getJobClass, jobDetail);
	        return jobClass.newInstance();
	    }

	    protected Job adaptJob(Object jobObject) throws Exception {
	        if (jobObject instanceof Job) {
	            return (Job) jobObject;
	        }
	        else if (jobObject instanceof Runnable) {
	            return new DelegatingJob((Runnable) jobObject);
	        }
	        else {
	            throw new IllegalArgumentException("Unable to execute job class [" + jobObject.getClass().getName() +
	                    "]: only [org.quartz.Job] and [java.lang.Runnable] supported.");
	        }
	    }
*/

}
