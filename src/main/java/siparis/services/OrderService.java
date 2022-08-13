package siparis.services;


import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import siparis.models.OrderModel;
import siparis.repositories.OrderRepository;

@AllArgsConstructor
@Singleton
public class OrderService {
    @Inject
    private final OrderRepository orderRepository;

    public Iterable<OrderModel> getAllOrder(){
        return  orderRepository.findAll();
    }
}
