package poo2.composite.menu.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Menu extends MenuComponent {

	private final List<MenuComponent> children = new ArrayList<MenuComponent>();

	public Menu(String id, String name) {
		super(id, name, null);
	}
	
	public Menu(String id, String name, String description) {
		super(id, name, description);
	}
	
	@Override
	public void add(MenuComponent component) {
		children.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		children.remove(component);
	}

	@Override
	public Collection<MenuComponent> getChildren() {
		return new ArrayList<>(children);
	}
	
	/**
	 * Imprime info deste Menu e de todos os seus descendentes.
	 */
	@Override
	public void print() {
		var indent = getIndentation();
		
		System.out.println(indent + (id == null ? "" : (id + " - ")) + name);
		System.out.println(indent + "-------------------------------------");
		
		if (description != null)
			System.out.println(indent + description);
		
		System.out.println();
		
		// Itera os componentes filhos pra imprimi-los também
		for (var child : getChildren()) {
			child.setLevel(level + 1); // Aumenta a identaçao do componente filho 
			child.print();
			System.out.println();
		}
	}
}
