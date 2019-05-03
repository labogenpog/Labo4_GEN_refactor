package ch.heigvd.gen2019;

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        OrdersToString(sb);

        return sb.append("]}").toString();
    }

    private void OrdersToString(StringBuffer sb) {
        for (int i = 0; i < orders.getOrdersCount(); i++) {
            sb.append(orders.getOrder(i).orderToString()) ;
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
    }

}