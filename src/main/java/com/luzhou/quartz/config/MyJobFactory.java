package com.luzhou.quartz.config;

import org.springframework.stereotype.Component;

/**
 * 在本工程中没有用到，先注释掉
 * 将Quartz作业注入Spring容器 2
 */
@Component
public class MyJobFactory extends AdaptableJobFactory {
/*
    @Autowired
    private AutowireCapableBeanFactory capableBeanFactory;

    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        //调用父类的方法
        Object jobInstance = super.createJobInstance(bundle);
        capableBeanFactory.autowireBean(jobInstance);

        return jobInstance;
    }*/
}