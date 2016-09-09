package com.imooc.ssh.DAO;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.imooc.ssh.domain.Product;

/**
 * 商品管理的DAO类
 *
 */
public class ProductDao extends HibernateDaoSupport{
	
	
	/**
	 * DAO中的保存商品的方法
	 * @param product
	 */

	public void save(Product product) {
		System.out.println("DAO中的save方法被执行了....");		
		this.getHibernateTemplate().save(product);
	}
}
