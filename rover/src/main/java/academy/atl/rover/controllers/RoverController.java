package academy.atl.rover.controllers;

import academy.atl.rover.dto.CommandDto;
import academy.atl.rover.dto.RoverDto;
import academy.atl.rover.models.Direction;
import academy.atl.rover.models.Rover;
import academy.atl.rover.services.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoverController {

    @Autowired
    RoverService service;

    @GetMapping("api/rover/")
    public Rover get() {
        return service.get();
    }

    @PostMapping("api/rover/")
    public void create(@RequestBody RoverDto rover) {
        System.out.println(rover);
    }

    @PostMapping("api/rover/command/")
    public void sendCommand(@RequestBody CommandDto commands) {
        System.out.println(commands);

        for (String command:commands.getCommands()) {
            System.out.println(command);
        }
    }
}
