
package com.hpe.pss.dao;

/**
 *
 * @author lenovo
 */
import java.sql.*;
import java.util.List;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;






/**
 * 对访问数据库统一管理
 * @author yhy
 *
 */
public class BaseDao {
	/**
	 * 获得连接
	 * @return
	 */
    
public boolean batchUpdate(Connection conn,String sql,Object[][] params) throws SQLException{
		QueryRunner qRunner = new QueryRunner();
		int result = 0;
		boolean flag = false;
                result = qRunner.batch(conn, sql, params).length;
                if(result > 0){
                        flag = true;
                }
		return flag;
	}
    
    
	public Connection getConnection(){
		  Connection conn = null;
	        String jdbcURL = "jdbc:mysql://localhost:3306/pss1";
	        String jdbcDriver = "com.mysql.jdbc.Driver";
	        String user = "root";
	        String password = "363360048";
	        try {
	        	//DbUtils中加载驱动的方法
	            DbUtils.loadDriver(jdbcDriver);
	            conn = DriverManager.getConnection(jdbcURL, user, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        return conn;
	}
	
	 /**
     * 执行更新的sql语句,插入,修改,删除
     * @param sql
     * @return
     */
    public boolean update(String sql,Object[] params) {
        Connection conn = null;
        boolean flag = false;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            int i = qRunner.update(conn,sql,params);
            if (i > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return flag;
    }
    /**
     * 查找多个对象
     * @param sql
     * @param clazz
     * @return
     */
    public List query(String sql, Class clazz) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            beans =
                (List) qRunner.query(
                    conn,
                    sql,
                    new BeanListHandler(clazz));
            //BeanListHandler处理了从ResultSet中获取数据，封装对象并存入List集合
            //源码同样需要用到ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }
    /**
     * 重载查询多个对象方法
     * @param sql
     * @param clazz
     * @return
     */
    public List query(String sql, Class clazz,Object[] params) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            beans = (List)qRunner.query(conn,sql,new BeanListHandler(clazz) ,params);
            
            //BeanListHandler处理了从ResultSet中获取数据，封装对象并存入List集合
            //源码同样需要用到ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }
    /**
     * 查找对象
     * @param sql
     * @param clazz
     * @return
     */
    public Object get(String sql, Class clazz) {
        Object obj = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            obj =
                 qRunner.query(
                    conn,
                    sql,
                    new BeanHandler(clazz));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return obj;
    }
    /**
     * 重载查询单对象方法
     * @param sql
     * @param clazz
     * @return
     */
    public Object get(String sql, Class clazz,Object[] params) {
        Object obj = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            obj =
                qRunner.query(conn,sql,new BeanHandler(clazz),params);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return obj;
    }
}