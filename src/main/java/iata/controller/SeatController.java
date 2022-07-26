package iata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import iata.SeatService;
import iata.objects.Seat;

@RestController
public class SeatController {
	
	@Autowired
	private SeatService seatService;

	@RequestMapping("/seat")
	public Seat seat() {
		return seatService.getSeat();
	}
	
	@RequestMapping("/availableSeats")
	public List<Seat> availableSeats() {
		
		return seatService.getAvailableSeats();
	}
	
	@RequestMapping("/bidOnSeat")
	public Seat bidOnSeat(@RequestParam(value = "key") final String key, @RequestParam(value = "bid") final int bid, @RequestParam(value = "user") final String user) {
		return seatService.bitOnSeat(key, bid, user);
	}
	
	@RequestMapping("/restSeats")
	public boolean bidOnSeat() {
		return seatService.restSeats();
	}
	
	@RequestMapping("/seat/{id}")
	public Seat getSeat(@PathVariable("id") String id) {
		return seatService.getSeat(id);
	}
	
}