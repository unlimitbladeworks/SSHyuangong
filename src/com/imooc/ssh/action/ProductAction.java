package com.imooc.ssh.action;

import com.imooc.ssh.domain.Product;
import com.imooc.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的Action
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	private static final long serialVersionUID = 1376390549582520207L;
	//模型驱动使用的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts和Spring整合过程中的按名称自动注入的业务层的类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	/**
	 * 保存商品的执行方法:save
	 */
	
	public String save(){
		System.out.println("Action中的save方法被执行了....");
		productService.save(product);
		return NONE;
	}

	
}
