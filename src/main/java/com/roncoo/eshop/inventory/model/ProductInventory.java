package com.roncoo.eshop.inventory.model;

public class ProductInventory {

	private Long id;
	private Integer value;
	private Long productId;

	public ProductInventory() {
		super();
	}

	public ProductInventory(Long id, Integer value, Long productId) {
		super();
		this.id = id;
		this.value = value;
		this.productId = productId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
