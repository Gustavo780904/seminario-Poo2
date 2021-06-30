package poo2.composite.menu.example;


public class MenuApp {

	public static void main(String[] args) {
		var menu = createMenu();
		menu.print();
	}

	private static Menu createMenu() {
		// Café da Manhã
		var ma = new Menu("A", "Café da Manhã", "Os pratos do café da manhã incluem um café pequeno.");
		
		ma.add(new MenuItem("A.1", "Pão na Chapa", "Pão com manteiga na chapa.", 4.00f));
		ma.add(new MenuItem("A.2", "Misto Quente", "Pão de forma com queijo e presunto na chapa.", 8.00f));
		
		// Almoço
		var mb = new Menu("B", "Almoço", "Os pratos já vem acompanhados de arroz, salada e batatas fritas.");
		
		mb.add(new MenuItem("B.1", "Bife a Cavalo", "Bife de alcatra com ovo frito e queijo.", 12.50f));
		mb.add(new MenuItem("B.2", "Filé à Parmegiana, frango ou vaca", "Filé de frango ou vaca emapanado com molho de tomate e ervilhas, coberto com queijo mussarela.", 15.60f));
			
		var mba = new Menu("BA", "Sobremesas (Almoço)", "Disponíveis apenas no almoço.");
		mba.add(new MenuItem("BA.1", "Pudim de Leite", "", 5.50f));
		mba.add(new MenuItem("BA.2", "Sorvete", "Sabores: Creme, Morango, Chocolate.", 6.50f));
		mb.add(mba);
		
		var mbb = new Menu("BB", "Almoço Executivo", "Promoções de Segunda a Quarta.");
		mbb.add(new MenuItem("BB.1", "PF com Frango", "Prato-feito com um filé de frango, arroz e feijão.", 9.00f));
		mbb.add(new MenuItem("BB.2", "PF com Calabresa", "Prato-feito com linguiça calabresa, arroz e feijão.", 8.00f));
		mb.add(mbb);
		
		// Jantar
		var mc = new Menu("C", "Jantar", "Os pratos já vem acompanhados de arroz branco ou batatas fritas.");
		mc.add(new MenuItem("C.1", "Costela no bafo", "Costela bovina assada.", 14.50f));
		mc.add(new MenuItem("C.2", "Lasanha Bolonhesa", "Massa de lasanha, presunto, queijo e molho bolonhesa.", 12.80f));
		
			
		var mca = new Menu("CA", "Sobremesas (Jantar)", "Disponíveis apenas no jantar.");
		mca.add(new MenuItem("CA.1", "Creme de Papaia", "Creme de mamão papaia batido com sorvete e licor de cassis", 11.00f));
		mc.add(mca);
		
		var md = new Menu("D", "Bebidas", null);
		md.add(new MenuItem("D.1", "Cerveja long neck", "Skoll, Brahma, Heineken, Bohemia", 10.0f));
		md.add(new MenuItem("D.2", "Suco Natural 450ml", "laranja, morango, abacaxi, limão, acerola", 8.0f));
		
		// Adiciona tudo ao menu principal
		var mainMenu = new Menu(null, "Menu");
		mainMenu.add(ma);
		mainMenu.add(mb);
		mainMenu.add(mc);
		mainMenu.add(md);
		
		return mainMenu;
	}
}

