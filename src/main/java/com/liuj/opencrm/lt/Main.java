package com.liuj.opencrm.lt;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Title:
 * @author: Liu jiang
 * @Date: 2022-04-29 11:15
 * @FilePath: demo  ==> Main
 */
public class Main {
    public static void main(String[] args) {
        //创建generator对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        //连接池
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/crmkf?serverTimezone=Asia/Shanghai");
        //用户名与密码
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        //数据源
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //设置工程生成文件的绝对路径
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setOpen(false);  //创建好之后不会默认打开文件夹
        globalConfig.setAuthor("Liu jiang");  //类创建之后的作者
        //在生成接口的时候会自动在名称前面带一个大写的I   去掉大写I需要加上下面代码
        globalConfig.setServiceName("%sService");
        globalConfig.setDateType(DateType.ONLY_DATE); // 配置时间类型策略
        globalConfig.setFileOverride(true); //如果文件已经存在则覆盖配置
        globalConfig.setEnableCache(false); //是否开启xml二级缓存
        globalConfig.setBaseResultMap(true); // xml是否开启BaesResul
        autoGenerator.setGlobalConfig(globalConfig);

        //包信息  （设置需要创建包的名称）
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.liuj.opencrm.lt");
        //在自己指定的目录下面创建该文件夹，把所有生成的文件放到该文件夹中
        packageConfig.setModuleName("generator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);
        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);  //实体类生成之后自动添加Lombok注解
        //将数据库中的下划线字段替换成大写（遵循驼峰命名法）
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        autoGenerator.setStrategy(strategyConfig);
        //执行
        autoGenerator.execute();
    }


}
