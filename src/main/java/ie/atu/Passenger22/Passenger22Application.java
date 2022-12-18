package ie.atu.Passenger22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class Passenger22Application {

	PassengerService myService;

	public Passenger22Application(PassengerService myService) {
		this.myService = myService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Passenger22Application.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){
				return myService.getPassengers();
	}
	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		Passenger myPassenger = new Passenger ("Mr","Paul",123,21,23);
		return myPassenger;
	}
}
