package strategy.example.order;

import strategy.example.strategies.PayStrategy;

/**
 * Order não conhece o método de pagamento concreto (estratégia) que o usuário
 * escolhide. Ele usa uma interface de estratégia comum para delegar a coleta de dados de pagamento
 * da estratégia.
 */
//context
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Aqui ficam armazenadas as referências da estratégia que se deseja utilizar.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
