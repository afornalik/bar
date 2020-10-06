package pl.afornalik.bar.client;

import com.google.inject.Inject;
import io.grpc.Channel;
import pl.afornalik.bar.model.BarGrpc;
import pl.afornalik.bar.model.Client;
import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.service.OrderMeals;

public class MealClient {

    private final BarGrpc.BarBlockingStub barBlockingStub;

    @Inject
    private OrderMeals orderMeals;

    public MealClient(Channel channel) {
        this.barBlockingStub = BarGrpc.newBlockingStub(channel);
    }

    public void sendMeals() {
        System.out.println("Send meals :");
        for (Meal meal : orderMeals.showMeals()) {
            System.out.println("\t" + meal.getName());
        }
        Client client = barBlockingStub.order(orderMeals.order());
        System.out.println("You need to pay for the meals: " + client.getBill());
    }
}
