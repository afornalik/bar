package pl.afornalik.bar.service;

import io.grpc.stub.StreamObserver;
import pl.afornalik.bar.model.BarGrpc;
import pl.afornalik.bar.model.Client;

public class BarService extends BarGrpc.BarImplBase {

    public static final int MEAL_PRICE = 11;

    @Override
    public void order(Client request, StreamObserver<Client> responseObserver) {
        float bill = request.getMealsCount();
        responseObserver.onNext(request.toBuilder().setBill(bill*MEAL_PRICE).build());
        responseObserver.onCompleted();
    }
}
