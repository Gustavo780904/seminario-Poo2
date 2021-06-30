package poo2.composite.menu.example;


import java.util.Collection;
import java.util.Collections;

/**
 * Sendo a folha do Composite, o item de menu possui um preço, mas não pode conter outros componentes.
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String id, String name, String description, float price) {
		super(id, name, description, price);
	}
	
	@Override
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException("MenuItem não pode conter outros componentes de menu.");
	}
	
	@Override
	public void remove(MenuComponent component) {
		
	}
	
	/**
	 * Retorna sempre uma lista vazia, porque items não podem conter outros componentes de menu.
	 */
	@Override
	public Collection<MenuComponent> getChildren() {
		return Collections.emptyList();
	}
	
	@Override
	public void print() {
		var indent = getIndentation();
		
		System.out.println(indent + id + " - " + name + ": R$" + price);
		
		var spaces = "   ";
		
		for (int i = 0; i < id.length(); i++)
			spaces += " ";
		
		System.out.printf(indent + spaces + description);
		System.out.println();
	}
}

