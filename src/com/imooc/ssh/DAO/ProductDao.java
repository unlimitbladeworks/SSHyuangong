package com.imooc.ssh.DAO;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.imooc.ssh.domain.Product;

/**
 * ��Ʒ�����DAO��
 *
 */
public class ProductDao extends HibernateDaoSupport{
	
	
	/**
	 * DAO�еı�����Ʒ�ķ���
	 * @param product
	 */

	public void save(Product product) {
		System.out.println("DAO�е�save������ִ����....");		
		this.getHibernateTemplate().save(product);
	}
}
