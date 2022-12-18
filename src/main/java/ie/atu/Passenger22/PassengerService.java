package ie.atu.Passenger22;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {
    public List<Passenger> getPassengers(){

        List<Passenger> myPassengers =List.of(
                new Passenger("Mr","Paul",123,21,23),
                new Passenger("Mr","Adam",6666,555,44),
                new Passenger("Mr","Dean",123,21,23));
        return myPassengers;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger ("Mr","Paul",123,21,23);
        return myPassenger;
    }

}
