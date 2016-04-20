package log;

import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter;
import com.alibaba.druid.pool.DruidDataSourceStatValue;
import com.alibaba.druid.support.logging.Log;

public class MyLog extends DruidDataSourceStatLoggerAdapter implements DruidDataSourceStatLogger {
	@Override
	public void log(DruidDataSourceStatValue statValue) {
		System.out.println("name = "+statValue.getName());
		System.out.println("DbType = "+statValue.getDbType());
		System.out.println("DriverClassName = "+statValue.getDriverClassName());
       System.out.println("这是我自己的日志信息！");
	}

	@Override
	public void configFromProperties(Properties properties) {
		System.out.println("这是配置文件的日志信息！");
	}

	@Override
	public void setLogger(Log logger) {
		System.out.println("这是设置日志信息！");
	}

	@Override
	public void setLoggerName(String loggerName) {
		System.out.println("这是设置日志的名称");
	}
}
