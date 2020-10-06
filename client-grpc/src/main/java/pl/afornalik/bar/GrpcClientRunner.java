package pl.afornalik.bar;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pl.afornalik.bar.client.MealClient;
import pl.afornalik.bar.config.MealsModule;

public class GrpcClientRunner {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MealsModule());


        String target = "localhost:12654";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();

        MealClient mealClient = new MealClient(channel);
        injector.injectMembers(mealClient);
        mealClient.sendMeals();
    }
}
