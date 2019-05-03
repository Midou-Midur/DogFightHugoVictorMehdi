package jpu2016.dogfight.controller;
import jpu2016.dogfight.controller.Order;

public class UserOrder implements IUserOrder {
    private int player;
    private Order order;

    public UserOrder(int player, Order order) {
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public  int getPlayer() {
        return player;
    }
}
