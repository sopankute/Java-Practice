// Order {Cust_id, name, amnt, status}

package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Order{

    private Long cust_id;
    private String name;
    private double amount;
    private String status;

    public Order(){}
    
    // func input list order | calculate order/cust

    public Long getCust_id() {
        return cust_id;
    }


    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Order(Long cust_id, String name, double amount, String status) {
        this.cust_id = cust_id;
        this.name = name;
        this.amount = amount;
        this.status = status;
    }


    public void getOrder(List<Order> list){

        Map<Long, Long> map = list.stream()
        .collect(Collectors.groupingBy(e-> e.cust_id, Collectors.counting()));
       
        // map.entrySet().forEach((k, v)->
        //     System.out.println(k+" : "+v)
        // ));

        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }


    public static void main(String[] args) {
        Order obj = new Order();
        List<Order> list = new ArrayList<>();
        list.add(new Order(102L, "Sopan", 1421.76, "Success"));
        list.add(new Order(103L, "Sopan", 1433.76, "Success"));
        list.add(new Order(104L, "Sopan", 5421.76, "Success"));
        list.add(new Order(105L, "Sopan", 7821.76, "Success"));
        
        obj.getOrder(list);
    }
}