package poo2.composite.menu.example;


public class MenuApp {

	public static void main(String[] args) {
		var menu = createMenu();
		menu.print();
	}

	private static Menu createMenu() {
		// Café da Manhã
		var ma = new Menu("A", "Café da Manhã", "Os pratos do café da manhã incluem um café pequeno.");
		
		ma.add(new MenuItem("A.1", "Pão na Chapa", "Pão com manteiga grelhado na chapa.", 4.00f));
		ma.add(new MenuItem("A.2", "Misto Quente", "Pão com queijo e presunto grelhado na chapa.", 8.00f));
		
		// Almoço
		var mb = new Menu("B", "Almoço", "Os pratos já vem acompanhados de arroz branco ou purê de batatas.");
		
		mb.add(new MenuItem("B.1", "Bife a Cavalo", "Bife de alcatra com ovo frito e queijo.", 12.50f));
		// TODO adcionar mais
			
		var mba = new Menu("BA", "Sobremesas (Almoço)", "Disponíveis apenas no almoço.");
		mba.add(new MenuItem("BA.1", "Pudim de Leite", "", 5.50f));
		mba.add(new MenuItem("BA.1", "Sorvete", "Sabores: Creme, Morango, Chocolate.", 6.50f));
		mb.add(mba);
		
		var mbb = new Menu("BB", "Almoço Executivo", "Promoções de Segunda a Quarta.");
		mbb.add(new MenuItem("BB.1", "PF com Frango", "Prato-feito com um filé de frango.", 9.00f));
		mbb.add(new MenuItem("BB.2", "PF com Calabresa", "Prato-feito com linguiça calabresa.", 8.00f));
		mb.add(mbb);
		
		// Jantar
		var mc = new Menu("C", "Jantar", "Os pratos já vem acompanhados de arroz branco ou batatas fritas.");
		mc.add(new MenuItem("C.1", "Bife a Cavalo", "Bife de alcatra com ovo frito e queijo.", 12.50f));
		// TODO adcionar mais
			
		var mca = new Menu("CA", "Sobremesas (Jantar)", "Disponíveis apenas no jantar.");
		mca.add(new MenuItem("CA.1", "Creme de Papaia", "Creme de mamão papaia batido com sorvete e licor de cassis", 11.00f));
		mc.add(mca);
		
		// Adiciona tudo ao menu principal
		var mainMenu = new Menu(null, "Menu");
		mainMenu.add(ma);
		mainMenu.add(mb);
		mainMenu.add(mc);
		
		return mainMenu;
	}
}

