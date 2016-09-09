package com.imooc.ssh.action;

import com.imooc.ssh.domain.Product;
import com.imooc.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ��Ʒ�����Action
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	private static final long serialVersionUID = 1376390549582520207L;
	//ģ������ʹ�õ���
	private Product product = new Product();
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts��Spring���Ϲ����еİ������Զ�ע���ҵ������
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	/**
	 * ������Ʒ��ִ�з���:save
	 */
	
	public String save(){
		System.out.println("Action�е�save������ִ����....");
		productService.save(product);
		return NONE;
	}

	
}
