package com.imooc.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.imooc.ssh.DAO.ProductDao;
import com.imooc.ssh.domain.Product;

/**
 * ��Ʒ�����ҵ������
 *
 */
@Transactional
public class ProductService {
	
	//ҵ���ע��DAO����
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * ҵ��㱣����Ʒ�ķ���
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Service�е�save����ִ����...");
		productDao.save(product);
	
	}
	

}
