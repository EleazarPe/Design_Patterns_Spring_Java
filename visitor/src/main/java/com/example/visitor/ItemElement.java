package com.example.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
