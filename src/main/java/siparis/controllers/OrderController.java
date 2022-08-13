package siparis.controllers;


import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import siparis.models.OrderModel;
import siparis.repositories.OrderRepository;
import siparis.services.OrderService;

import java.util.List;

@AllArgsConstructor
@Controller("/api")
@ExecuteOn(TaskExecutors.IO)
public class OrderController {

    @Inject
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @Get("/listele")
    Iterable<OrderModel> getAllOrder() {
        return orderService.getAllOrder();
    }

    @Post("/Ekle")
    @Status(HttpStatus.CREATED)
    OrderModel save(OrderModel orderModel) {
        return orderRepository.save(orderModel);
    }
}
