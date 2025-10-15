package Java_8;


@RestController
@RequestMapping("/orders")
public class OrderController {
    
    @Autowired
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        Order created = orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<> getOrder(@PathVariable Long id){
        Order order = orderService.getOrder(id);
        return ResponseEntity.status(HttpStatus.OK).body(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<> updateOrder(@PathVariable Long id, @RequestBody Order order){
        
        Order update = orderService.updateOrder(id, order);
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Order> deleteOrder(@PathVariable Long id){
        
        orderService.removeOrder(id);
        return ResponseEntity.status(HttpStatus.OK) 
    }

}
