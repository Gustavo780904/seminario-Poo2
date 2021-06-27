package poo2.composite.menu.example;

import java.util.Collection;

/**
 * Tradicionalmente, seria uma interface, mas vamos usar uma classe abstrata pra podermos
 * reaproveitar propriedades e métodos que são comuns às subclasses.
 */
public abstract class MenuComponent {

	protected final String id;
	protected String name;
	protected String description;
	protected float price;
	
	/** Usado apenas para identacão do texto na hora de imprimir */
	protected int level;
	
	protected MenuComponent(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	protected MenuComponent(String id, String name, String description, float price) {
		this(id, name, description);
		this.price = price;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public abstract void add(MenuComponent component);

	public abstract void remove(MenuComponent component);

	public abstract Collection<MenuComponent> getChildren();
	
	public abstract void print();
	
	// Métodos usados apenas na impressão:
	
	protected void setLevel(int level) {
		this.level = level;
	}
	
	protected String getIndentation() {
		var indent = new StringBuffer();
		
		for (int i = 0; i < level; i++)
			indent.append("\t");
		
		return indent.toString();
	}
}

